package X;

import Y.ARunnableS103S0100000_3;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: X.08MO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MO extends BPEAThread {
    public static final /* synthetic */ int LLILZ = 0;
    public final String LL;
    public HandlerThread LLILLJJLI;
    public BPEAHandler LLILLL;

    public final void LIZJ() {
        String str = this.LL;
        int i = 0;
        do {
            try {
                LocalServerSocket localServerSocket = new LocalServerSocket(str);
                while (true) {
                    try {
                        LocalSocket localSocketAccept = localServerSocket.accept();
                        if (localSocketAccept != null) {
                            try {
                                try {
                                    LIZLLL(localSocketAccept);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                try {
                                    localSocketAccept.close();
                                } catch (IOException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                try {
                                    localSocketAccept.close();
                                    throw th;
                                } catch (IOException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    throw th;
                                }
                            }
                        }
                    } catch (IOException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                }
            } catch (IOException e5) {
                TryCatchGuardChecker.doCheck(e5);
                i++;
            }
        } while (i < 3);
    }

    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("DnsMonitorThread@cb84.run");
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        try {
            LIZJ();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("DnsMonitorThread@cb84.run");
    }

    public C08MO() {
        HandlerThread handlerThread = new HandlerThread("skynetDH");
        this.LLILLJJLI = handlerThread;
        handlerThread.start();
        this.LLILLL = new BPEAHandler(C786410Ut5.W2(this.LLILLJJLI));
    }

    public C08MO(int i) {
        this.LL = "skynetDM";
        HandlerThread handlerThread = new HandlerThread("skynetDH");
        this.LLILLJJLI = handlerThread;
        handlerThread.start();
        this.LLILLL = new BPEAHandler(C786410Ut5.W2(this.LLILLJJLI));
    }

    public final void LIZLLL(LocalSocket localSocket) throws IOException {
        byte[] bArr = new byte[8];
        InputStream inputStream = localSocket.getInputStream();
        if (inputStream.read(bArr) <= 0) {
            return;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBufferWrap.getInt();
        int i2 = byteBufferWrap.getInt();
        if (i2 <= 0) {
            return;
        }
        byte[] bArr2 = new byte[i2];
        inputStream.read(bArr2);
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS103S0100000_3(this, i, new String(bArr2), 83));
    }
}
