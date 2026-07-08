package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.09U3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09U3 implements InterfaceC1525070pmz {
    public final C2232408os LIZ;
    public final C054G LIZIZ;
    public final C054G LIZJ;
    public final C054G LIZLLL;
    public final ConcurrentHashMap<Integer, C09U5> LJ;
    public final ConcurrentHashMap<Integer, C09AE> LJFF;
    public volatile C09BR LJI;

    @Override // X.InterfaceC1525070pmz
    public final void LJJIIZI() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onExit() {
        this.LJI = null;
        List listLLIIII = C13LP.LLIIII(this.LJ.values());
        this.LJ.clear();
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            ((C09U5) it2.next()).LIZ.close();
        }
        C2296808zG.LIZJ(this.LIZIZ, null);
        C2296808zG.LIZJ(this.LIZJ, null);
        C2296808zG.LIZJ(this.LIZLLL, null);
        this.LJFF.clear();
        this.LIZ.close();
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onPause() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onResume() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onStart() {
    }

    public C09U3() {
        C2232408os c2232408os = new C2232408os(new C822650WOx(0, 256, 30L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC2500609r2(0)));
        this.LIZ = c2232408os;
        this.LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), c2232408os));
        this.LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
        this.LIZLLL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
        this.LJ = new ConcurrentHashMap<>();
        this.LJFF = new ConcurrentHashMap<>();
    }

    @Override // X.InterfaceC1525070pmz
    public final void close(int i) {
        if (this.LJ.remove(Integer.valueOf(i)) == null) {
            LJJZZI(i, -2, "socket is not bound");
        } else {
            this.LJFF.remove(Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC1525070pmz
    public final int LJJJJLI(int i, int i2) {
        Object c098200Yq;
        if (this.LJ.containsKey(Integer.valueOf(i))) {
            LJJZZI(i, -2, "socket already bound");
            return 0;
        }
        try {
            DatagramSocket datagramSocket = new DatagramSocket(i2);
            datagramSocket.setSoTimeout(LSPassThroughRecordSizeConfig.DEFAULT);
            C09U5 c09u5 = new C09U5(datagramSocket);
            try {
                C09AE c09aeRemove = this.LJFF.remove(Integer.valueOf(i));
                if (c09aeRemove != null) {
                    c09aeRemove.LIZIZ(null);
                }
                AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LIZIZ, null, null, new C09U4(c09u5, this, i, null), 3);
                this.LJFF.put(Integer.valueOf(i), anonymousClass0956LIZLLL);
                this.LJ.put(Integer.valueOf(i), c09u5);
                C09BR c09br = this.LJI;
                if (c09br != null) {
                    C23250099c.LIZLLL(this.LIZLLL, null, null, new C09BS(c09br, i, null), 3);
                }
                c098200Yq = Integer.valueOf(datagramSocket.getLocalPort());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                datagramSocket.close();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            String str = "bind failed";
            C1304110k2b.LIZ("bind failed", thM5exceptionOrNullimpl);
            if (thM5exceptionOrNullimpl instanceof RejectedExecutionException) {
                str = "too many concurrent udp sockets, max number 256";
            } else {
                String message = thM5exceptionOrNullimpl.getMessage();
                if (message != null) {
                    str = message;
                }
            }
            LJJZZI(i, -2, str);
            c098200Yq = 0;
        }
        return ((Number) c098200Yq).intValue();
    }

    public final void LJJZ(int i, C09U5 c09u5) {
        try {
            c09u5.LIZ.close();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C09BR c09br = this.LJI;
        if (c09br != null) {
            C23250099c.LIZLLL(this.LIZLLL, null, null, new C09BQ(c09br, i, null), 3);
        }
    }

    @Override // X.InterfaceC1525070pmz
    public final void LJJ(int i, int i2, String str) {
        C09U5 c09u5 = this.LJ.get(Integer.valueOf(i));
        if (c09u5 == null) {
            LJJZZI(i, -2, "socket is not bound");
            return;
        }
        if (c09u5.LIZ.isClosed()) {
            LJJZZI(i, -2, "socket is closed");
            return;
        }
        if (c09u5.LIZLLL) {
            LJJZZI(i, -2, "connect can only be called once");
            return;
        }
        if (a0.LJJJIL(str)) {
            LJJZZI(i, 1, "address is invalid");
            return;
        }
        if (1 <= i2 && i2 < 65536) {
            c09u5.LIZIZ = str;
            c09u5.LIZJ = Integer.valueOf(i2);
            c09u5.LIZLLL = true;
            return;
        }
        LJJZZI(i, 2, "port is invalid");
    }

    public final void LJJZZI(int i, int i2, String str) {
        C09BR c09br = this.LJI;
        if (c09br == null) {
            return;
        }
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C09BT(c09br, i, i2, str, null), 3);
    }

    public final void LJJZZIII(int i, byte[] bArr, String str, int i2, int i3, int i4) {
        C09BR c09br = this.LJI;
        if (c09br == null) {
            return;
        }
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C09BP(bArr, c09br, i, str, i2, "", i3, i4, null), 3);
    }

    @Override // X.InterfaceC1525070pmz
    public final void LJJIFFI(String str, int i, boolean z, String str2, String str3, int i2, int i3, int i4) {
        C09U5 c09u5 = this.LJ.get(Integer.valueOf(i));
        if (c09u5 == null) {
            LJJZZI(i, -2, "socket is not bound");
            return;
        }
        if (a0.LJJJIL(str)) {
            LJJZZI(i, 1, "address is invalid");
        } else if (1 <= i2 && i2 < 65536) {
            C23250099c.LIZLLL(this.LIZJ, null, null, new C09U1(this, c09u5, i, str, i2, str2, str3, i3, i4, z, null), 3);
        } else {
            LJJZZI(i, 2, "port is invalid");
        }
    }

    @Override // X.InterfaceC1525070pmz
    public final void LJJLJ(int i, String str, Integer num, String str2, String str3, int i2, int i3, boolean z) {
        Integer num2 = num;
        String str4 = str;
        C09U5 c09u5 = this.LJ.get(Integer.valueOf(i));
        if (c09u5 == null) {
            LJJZZI(i, -2, "socket is not bound");
            return;
        }
        if (str4 != null && a0.LJJJIL(str4)) {
            LJJZZI(i, 1, "address is invalid");
            return;
        }
        if (num2 != null && !new IntRange(1, 65535).LJLJL(num2.intValue())) {
            LJJZZI(i, 2, "port is invalid");
            return;
        }
        if (c09u5.LIZLLL || str4 == null) {
            str4 = c09u5.LIZIZ;
        }
        if (c09u5.LIZLLL || num2 == null) {
            num2 = c09u5.LIZJ;
        }
        if (str4 != null && !a0.LJJJIL(str4)) {
            if (num2 != null && new IntRange(1, 65535).LJLJL(num2.intValue())) {
                C23250099c.LIZLLL(this.LIZJ, null, null, new C09U2(this, c09u5, i, str4, num2, str2, str3, i2, i3, z, null), 3);
                return;
            } else {
                LJJZZI(i, 2, "port is invalid");
                return;
            }
        }
        LJJZZI(i, 1, "address is invalid");
    }

    public final void LJL(C09U5 c09u5, int i, String str, int i2, String str2, String str3, int i3, int i4, boolean z) {
        Object c098200Yq;
        try {
            if (Intrinsics.LJFF(str3, "arraybuffer")) {
                c098200Yq = Base64.decode(str2, 0);
            } else {
                c098200Yq = str2.getBytes(Charsets.UTF_8);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            byte[] bArr = (byte[]) c098200Yq;
            int iLJ = C13LZ.LJ(i3, 0, bArr.length);
            int iLJ2 = C13LZ.LJ(i4, 0, bArr.length - iLJ);
            if (iLJ2 > 9216) {
                LJJZZI(i, -2, "message exceeds max size 9216");
                return;
            }
            try {
                if (c09u5.LIZ.isClosed()) {
                    LJJZZI(i, -2, "socket is closed");
                    return;
                }
                if (z != c09u5.LJ) {
                    c09u5.LIZ.setBroadcast(z);
                    c09u5.LJ = z;
                }
                c09u5.LIZ.send(new DatagramPacket(bArr, iLJ, iLJ2, InetAddress.getByName(str), i2));
                return;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1304110k2b.LIZ("send message failed", th2);
                String message = th2.getMessage();
                if (message == null) {
                    message = "send failed";
                }
                LJJZZI(i, -2, message);
                return;
            }
        }
        String message2 = thM5exceptionOrNullimpl.getMessage();
        if (message2 == null) {
            message2 = "decode message failed";
        }
        LJJZZI(i, -2, message2);
    }
}
