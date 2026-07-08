package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.16Ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractRunnableC20737316Ct extends C157R implements Runnable {
    public static final int LLJJJJJIL = Runtime.getRuntime().availableProcessors();
    public final C13AX LLJ;
    public final Collection<InterfaceC204578153g> LLJI;
    public final InetSocketAddress LLJIJIL;
    public ServerSocketChannel LLJILJIL;
    public Selector LLJILJILJ;
    public final List<C16D2> LLJILLL;
    public Thread LLJJ;
    public final AtomicBoolean LLJJI;
    public final List<C20737716Cx> LLJJIII;
    public final List<C16D0> LLJJIJI;
    public final BlockingQueue<ByteBuffer> LLJJIJIIJIL;
    public int LLJJIJIL;
    public final AtomicInteger LLJJJ;
    public final C20737616Cw LLJJJIL;
    public final int LLJJJJ;

    @Override // X.C16D4
    public final void LIZJ() {
    }

    @Override // X.C16D4
    public final void LJII() {
    }

    @Override // X.C16D4
    public final void LJIIJJI() {
    }

    public abstract void LJJIIZI(InterfaceC204578153g interfaceC204578153g, String str);

    public abstract void LJJIJ(Exception exc);

    public abstract void LJJIJIIJI(String str, InterfaceC204578153g interfaceC204578153g);

    public abstract void LJJIJIIJIL(InterfaceC204578153g interfaceC204578153g, C16DX c16dx);

    public abstract void LJJIJIL();

    public final void LJJIJL() {
        SelectionKey selectionKey;
        SelectionKey next;
        synchronized (this) {
            try {
                if (this.LLJJ != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(getClass().getName());
                    sbLIZ.append(" can only be started once.");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LLJJ = C786410Ut5.u3();
                int i = 0;
                if (this.LLJJI.get()) {
                    return;
                }
                Thread thread = this.LLJJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("WebSocketSelector-");
                sbLIZ2.append(this.LLJJ.getId());
                ThreadMethodProxy.setName(thread, C2188811AlT.LIZIZ(sbLIZ2));
                try {
                    ServerSocketChannel serverSocketChannelOpen = ServerSocketChannel.open();
                    this.LLJILJIL = serverSocketChannelOpen;
                    serverSocketChannelOpen.configureBlocking(false);
                    ServerSocket serverSocketSocket = this.LLJILJIL.socket();
                    serverSocketSocket.setReceiveBufferSize(16384);
                    serverSocketSocket.setReuseAddress(this.LLILLL);
                    serverSocketSocket.bind(this.LLJIJIL, this.LLJJJJ);
                    Selector selectorOpen = Selector.open();
                    this.LLJILJILJ = selectorOpen;
                    ServerSocketChannel serverSocketChannel = this.LLJILJIL;
                    serverSocketChannel.register(selectorOpen, serverSocketChannel.validOps());
                    LJIL();
                    Iterator it2 = ((ArrayList) this.LLJJIII).iterator();
                    while (it2.hasNext()) {
                        ((PthreadThread) it2.next()).start();
                    }
                    LJJIJIL();
                    int i2 = 5;
                    while (!this.LLJJ.isInterrupted() && i2 != 0) {
                        try {
                            try {
                                try {
                                    try {
                                        if (this.LLJJI.get()) {
                                            i = 5;
                                        }
                                        if (this.LLJILJILJ.select(i) == 0 && this.LLJJI.get()) {
                                            i2--;
                                        }
                                        Iterator<SelectionKey> it3 = this.LLJILJILJ.selectedKeys().iterator();
                                        selectionKey = null;
                                        while (it3.hasNext()) {
                                            try {
                                                next = it3.next();
                                            } catch (C20737416Cu e) {
                                                e = e;
                                            } catch (IOException e2) {
                                                e = e2;
                                            }
                                            try {
                                                if (next.isValid()) {
                                                    if (next.isAcceptable()) {
                                                        LJJI(it3);
                                                    } else if ((!next.isReadable() || LJJII(next, it3)) && next.isWritable()) {
                                                        LJJIIJ(next);
                                                    }
                                                }
                                                selectionKey = next;
                                            } catch (C20737416Cu e3) {
                                                e = e3;
                                                selectionKey = next;
                                                TryCatchGuardChecker.doCheck(e);
                                                LJJIIZ(selectionKey, e.getConnection(), e.getIOException());
                                            } catch (IOException e4) {
                                                e = e4;
                                                selectionKey = next;
                                                TryCatchGuardChecker.doCheck(e);
                                                LJJIIZ(selectionKey, null, e);
                                            }
                                        }
                                        LJJIFFI();
                                    } catch (C20737416Cu e5) {
                                        e = e5;
                                        selectionKey = null;
                                    } catch (IOException e6) {
                                        e = e6;
                                        selectionKey = null;
                                    }
                                } catch (InterruptedException e7) {
                                    TryCatchGuardChecker.doCheck(e7);
                                    C786410Ut5.u3().interrupt();
                                } catch (CancelledKeyException e8) {
                                    TryCatchGuardChecker.doCheck(e8);
                                } catch (ClosedByInterruptException e9) {
                                    LJJIII();
                                    return;
                                }
                            } catch (RuntimeException e10) {
                                TryCatchGuardChecker.doCheck(e10);
                                LJJIIJZLJL(null, e10);
                            }
                        } catch (Throwable e92) {
                            LJJIII();
                            throw e92;
                        }
                    }
                    LJJIII();
                } catch (IOException e11) {
                    TryCatchGuardChecker.doCheck(e11);
                    LJJIIJZLJL(null, e11);
                }
            } finally {
                TryCatchGuardChecker.doCheck(e92);
            }
        }
    }

    public AbstractRunnableC20737316Ct() {
        this(new InetSocketAddress(80), LLJJJJJIL);
    }

    @Override // X.C157R
    public final Collection<InterfaceC204578153g> LJIJJ() {
        Collection<InterfaceC204578153g> collectionUnmodifiableCollection;
        synchronized (this.LLJI) {
            try {
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(new ArrayList(this.LLJI));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return collectionUnmodifiableCollection;
    }

    public final void LJJIFFI() throws InterruptedException, IOException {
        while (!this.LLJJIJI.isEmpty()) {
            C16D0 c16d0 = (C16D0) ListProtector.remove(this.LLJJIJI, 0);
            InterfaceC20737516Cv interfaceC20737516Cv = (InterfaceC20737516Cv) c16d0.LLILZLL;
            ByteBuffer byteBuffer = (ByteBuffer) ((LinkedBlockingQueue) this.LLJJIJIIJIL).take();
            try {
                byteBuffer.clear();
                int iLJJLJ = interfaceC20737516Cv.LJJLJ();
                byteBuffer.flip();
                if (iLJJLJ == -1) {
                    c16d0.LJIIIIZZ();
                } else if (interfaceC20737516Cv.LJJLI()) {
                    ((LinkedList) this.LLJJIJI).add(c16d0);
                }
                if (byteBuffer.hasRemaining()) {
                    ((LinkedBlockingQueue) c16d0.LLILLL).put(byteBuffer);
                    LJJIL(c16d0);
                } else {
                    LJJIJLIJ(byteBuffer);
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                LJJIJLIJ(byteBuffer);
                throw e;
            }
        }
    }

    public final void LJJJI() {
        if (this.LLJJ == null) {
            new BPEAThread(this).start();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getName());
        sbLIZ.append(" can only be started once.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJIII() {
        LJJ();
        List<C20737716Cx> list = this.LLJJIII;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((PthreadThread) it2.next()).interrupt();
            }
        }
        Selector selector = this.LLJILJILJ;
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLJ.error("IOException during selector.close", (Throwable) e);
                LJJIJ(e);
            }
        }
        ServerSocketChannel serverSocketChannel = this.LLJILJIL;
        if (serverSocketChannel != null) {
            try {
                serverSocketChannel.close();
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                this.LLJ.error("IOException during server.close", (Throwable) e2);
                LJJIJ(e2);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LJJIJL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public AbstractRunnableC20737316Ct(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, LLJJJJJIL);
    }

    public static void LJJIIJ(SelectionKey selectionKey) throws C20737416Cu {
        C16D0 c16d0 = (C16D0) selectionKey.attachment();
        try {
            if (C20737916Cz.LIZ(c16d0, c16d0.LLILZLL) && selectionKey.isValid()) {
                selectionKey.interestOps(1);
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C20737416Cu(c16d0, e);
        }
    }

    @Override // X.C16D4
    public final InetSocketAddress LJIIIIZZ(InterfaceC204578153g interfaceC204578153g) {
        return (InetSocketAddress) ((SocketChannel) ((C16D0) interfaceC204578153g).LLILZIL.channel()).socket().getLocalSocketAddress();
    }

    @Override // X.C16D4
    public final InetSocketAddress LJIIIZ(InterfaceC204578153g interfaceC204578153g) {
        return (InetSocketAddress) ((SocketChannel) ((C16D0) interfaceC204578153g).LLILZIL.channel()).socket().getRemoteSocketAddress();
    }

    @Override // X.C16D4
    public final void LJIILIIL(InterfaceC204578153g interfaceC204578153g) {
        C16D0 c16d0 = (C16D0) interfaceC204578153g;
        try {
            c16d0.LLILZIL.interestOps(5);
        } catch (CancelledKeyException e) {
            TryCatchGuardChecker.doCheck(e);
            ((LinkedBlockingQueue) c16d0.LLILLJJLI).clear();
        }
        this.LLJILJILJ.wakeup();
    }

    public final void LJJI(Iterator it2) throws InterruptedException, IOException {
        SocketChannel socketChannelAccept = this.LLJILJIL.accept();
        if (socketChannelAccept == null) {
            return;
        }
        socketChannelAccept.configureBlocking(false);
        Socket socket = socketChannelAccept.socket();
        socket.setTcpNoDelay(false);
        socket.setKeepAlive(true);
        C20737616Cw c20737616Cw = this.LLJJJIL;
        List<C16D2> list = this.LLJILLL;
        c20737616Cw.getClass();
        C16D0 c16d0 = new C16D0(this, list);
        c16d0.LLILZIL = socketChannelAccept.register(this.LLJILJILJ, 1, c16d0);
        try {
            getClass();
            c16d0.LLILZLL = socketChannelAccept;
            it2.remove();
            if (this.LLJJJ.get() < (((ArrayList) this.LLJJIII).size() * 2) + 1) {
                this.LLJJJ.incrementAndGet();
                ((LinkedBlockingQueue) this.LLJJIJIIJIL).put(ByteBuffer.allocate(16384));
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            SelectionKey selectionKey = c16d0.LLILZIL;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            LJJIIZ(c16d0.LLILZIL, null, e);
        }
    }

    public final void LJJIJLIJ(ByteBuffer byteBuffer) {
        if (((LinkedBlockingQueue) this.LLJJIJIIJIL).size() > this.LLJJJ.intValue()) {
            return;
        }
        ((LinkedBlockingQueue) this.LLJJIJIIJIL).put(byteBuffer);
    }

    public final void LJJIL(C16D0 c16d0) throws InterruptedException {
        if (c16d0.LLIZ == null) {
            List<C20737716Cx> list = this.LLJJIII;
            c16d0.LLIZ = (C20737716Cx) ListProtector.get(list, this.LLJJIJIL % ((ArrayList) list).size());
            this.LLJJIJIL++;
        }
        ((LinkedBlockingQueue) c16d0.LLIZ.LL).put(c16d0);
    }

    public final boolean LJJJ(InterfaceC204578153g interfaceC204578153g) {
        boolean zRemove;
        synchronized (this.LLJI) {
            try {
                if (this.LLJI.contains(interfaceC204578153g)) {
                    zRemove = this.LLJI.remove(interfaceC204578153g);
                } else {
                    this.LLJ.trace("Removing connection which is not in the connections collection! Possible no handshake received! {}", interfaceC204578153g);
                    zRemove = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (this.LLJJI.get() && this.LLJI.isEmpty()) {
            this.LLJJ.interrupt();
        }
        return zRemove;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.16Cw] */
    public AbstractRunnableC20737316Ct(InetSocketAddress inetSocketAddress, int i) {
        HashSet hashSet = new HashSet();
        this.LLJ = C13AD.LIZIZ(AbstractRunnableC20737316Ct.class);
        int i2 = 0;
        this.LLJJI = new AtomicBoolean(false);
        this.LLJJIJIL = 0;
        this.LLJJJ = new AtomicInteger(0);
        this.LLJJJIL = new Object() { // from class: X.16Cw
        };
        this.LLJJJJ = -1;
        if (i >= 1) {
            this.LLJILLL = Collections.emptyList();
            this.LLJIJIL = inetSocketAddress;
            this.LLJI = hashSet;
            this.LLILLL = false;
            this.LLJJIJI = new LinkedList();
            this.LLJJIII = new ArrayList(i);
            this.LLJJIJIIJIL = new LinkedBlockingQueue();
            do {
                ((ArrayList) this.LLJJIII).add(new C20737716Cx(this));
                i2++;
            } while (i2 < i);
            return;
        }
        throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
    }

    @Override // X.C16D4
    public final void LJ(String str, InterfaceC204578153g interfaceC204578153g) {
        LJJIJIIJI(str, interfaceC204578153g);
    }

    @Override // X.C16D4
    public final void LJIIJ(InterfaceC204578153g interfaceC204578153g, C16D5 c16d5) {
        boolean zAdd;
        if (!this.LLJJI.get()) {
            synchronized (this.LLJI) {
                try {
                    zAdd = this.LLJI.add(interfaceC204578153g);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (!zAdd) {
                return;
            }
        } else {
            interfaceC204578153g.close(1001);
        }
        LJJIJIIJIL(interfaceC204578153g, (C16DX) c16d5);
    }

    @Override // X.C16D4
    public final void LJIIZILJ(InterfaceC204578153g interfaceC204578153g, Exception exc) {
        LJJIJ(exc);
    }

    public final boolean LJJII(SelectionKey selectionKey, Iterator<SelectionKey> it2) throws C20737416Cu, InterruptedException {
        C16D0 c16d0 = (C16D0) selectionKey.attachment();
        ByteBuffer byteBuffer = (ByteBuffer) ((LinkedBlockingQueue) this.LLJJIJIIJIL).take();
        ByteChannel byteChannel = c16d0.LLILZLL;
        if (byteChannel == null) {
            selectionKey.cancel();
            LJJIIZ(selectionKey, c16d0, new IOException());
            return false;
        }
        try {
            byteBuffer.clear();
            int i = byteChannel.read(byteBuffer);
            byteBuffer.flip();
            if (i != -1) {
                if (i != 0) {
                    if (byteBuffer.hasRemaining()) {
                        ((LinkedBlockingQueue) c16d0.LLILLL).put(byteBuffer);
                        LJJIL(c16d0);
                        it2.remove();
                        ByteChannel byteChannel2 = c16d0.LLILZLL;
                        if ((byteChannel2 instanceof InterfaceC20737516Cv) && ((InterfaceC20737516Cv) byteChannel2).LJJLI()) {
                            ((LinkedList) this.LLJJIJI).add(c16d0);
                            return true;
                        }
                    } else {
                        LJJIJLIJ(byteBuffer);
                        return true;
                    }
                }
                return true;
            }
            c16d0.LJIIIIZZ();
            LJJIJLIJ(byteBuffer);
            return true;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LJJIJLIJ(byteBuffer);
            throw new C20737416Cu(c16d0, e);
        }
    }

    public final void LJJIIJZLJL(C16D0 c16d0, Exception exc) {
        String strLIZIZ;
        this.LLJ.error("Shutdown due to fatal error", (Throwable) exc);
        LJJIJ(exc);
        if (exc.getCause() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" caused by ");
            sbLIZ.append(exc.getCause().getClass().getName());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Got error on server side: ");
        sbLIZ2.append(exc.getClass().getName());
        sbLIZ2.append(strLIZIZ);
        try {
            LJJJIL(0, C2188811AlT.LIZIZ(sbLIZ2));
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.u3().interrupt();
            this.LLJ.error("Interrupt during stop", (Throwable) exc);
            LJJIJ(e);
        }
        List<C20737716Cx> list = this.LLJJIII;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((PthreadThread) it2.next()).interrupt();
            }
        }
        Thread thread = this.LLJJ;
        if (thread != null) {
            thread.interrupt();
        }
    }

    public final void LJJJIL(int i, String str) {
        ArrayList arrayList;
        Selector selector;
        if (!this.LLJJI.compareAndSet(false, true)) {
            return;
        }
        synchronized (this.LLJI) {
            try {
                arrayList = new ArrayList(this.LLJI);
            } finally {
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC204578153g) it2.next()).LIZIZ(str);
        }
        getClass();
        synchronized (this) {
            try {
                if (this.LLJJ != null && (selector = this.LLJILJILJ) != null) {
                    selector.wakeup();
                    ThreadMethodProxy.join(this.LLJJ, i);
                }
            } finally {
            }
        }
    }

    public final void LJJIIZ(SelectionKey selectionKey, InterfaceC204578153g interfaceC204578153g, IOException iOException) {
        SelectableChannel selectableChannelChannel;
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        if (interfaceC204578153g != null) {
            interfaceC204578153g.LJIIL(iOException.getMessage());
            return;
        }
        if (selectionKey == null || (selectableChannelChannel = selectionKey.channel()) == null || !selectableChannelChannel.isOpen()) {
            return;
        }
        try {
            selectableChannelChannel.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLJ.trace("Connection closed because of exception", (Throwable) iOException);
    }

    @Override // X.C16D4
    public final void LJFF(InterfaceC204578153g interfaceC204578153g, int i, String str, boolean z) {
        this.LLJILJILJ.wakeup();
        try {
            if (LJJJ(interfaceC204578153g)) {
                LJJIIZI(interfaceC204578153g, str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }
}
