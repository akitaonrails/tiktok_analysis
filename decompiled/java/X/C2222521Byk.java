package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.msg.data.SdkUplinkPacket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Byk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222521Byk {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final C1500700p9g LIZLLL;
    public final InterfaceC19666511x1 LJ;
    public final C2222521Byk LJFF;
    public AbstractC19666311wz<C2222611Byt, ? extends Exception> LJI;
    public AbstractC19666311wz<C2222611Byt, ? extends Exception> LJII;
    public SdkUplinkPacket LJIIIIZZ;
    public C2222611Byt LJIIIZ;
    public Exception LJIIJ;
    public boolean LJIIJJI;
    public final C2222591Byr LJIIL;
    public RunnableC2222541Bym LJIILIIL;
    public boolean LJIILJJIL;

    public final AbstractC19666311wz<C2222611Byt, Exception> LIZ() {
        InterfaceC1502210pC7 interfaceC1502210pC7;
        byte[] byteArray;
        InterfaceC1502210pC7 interfaceC1502210pC72;
        SdkUplinkPacket sdkUplinkPacket = this.LJIIIIZZ;
        C2222611Byt c2222611Byt = this.LJIIIZ;
        Exception exc = this.LJIIJ;
        if (sdkUplinkPacket == null) {
            if (c2222611Byt == null) {
                return exc != null ? new C19666211wy(exc) : new C19666211wy(new C2222631Byv(-3, "request not finish", null));
            }
            byte[] bArr = c2222611Byt.LIZLLL;
            if (bArr == null) {
                bArr = new byte[0];
            }
            C2222641Byw c2222641Byw = new C2222641Byw();
            int i = c2222611Byt.LIZ;
            C2222611Byt c2222611Byt2 = c2222641Byw.LIZ;
            c2222611Byt2.LIZ = i;
            c2222611Byt2.LIZIZ = c2222611Byt.LIZIZ;
            c2222611Byt2.LIZLLL = bArr;
            c2222611Byt2.LIZJ = c2222611Byt.LIZJ;
            c2222611Byt2.LJFF = 0;
            if (bArr.length != 0 && (interfaceC1502210pC7 = this.LIZLLL.LJIIIIZZ) != null) {
                c2222641Byw.LIZ.LJ = interfaceC1502210pC7.LIZ(bArr);
            }
            return new C19666111wx(c2222641Byw.LIZ);
        }
        ByteString byteString = sdkUplinkPacket.payload;
        if (byteString == null || (byteArray = byteString.toByteArray()) == null) {
            byteArray = new byte[0];
        }
        ArrayList arrayList = new ArrayList();
        Map<String, String> map = sdkUplinkPacket.headers;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new C2221941Bxo(entry.getKey(), entry.getValue()));
            }
        }
        C2222641Byw c2222641Byw2 = new C2222641Byw();
        int iIntValue = sdkUplinkPacket.statusCode.intValue();
        C2222611Byt c2222611Byt3 = c2222641Byw2.LIZ;
        c2222611Byt3.LIZ = iIntValue;
        c2222611Byt3.LIZIZ = sdkUplinkPacket.statusMessage;
        c2222611Byt3.LIZLLL = byteArray;
        c2222611Byt3.LIZJ = arrayList;
        c2222611Byt3.LJFF = this.LJIIJJI ? 1 : 2;
        if (byteArray.length != 0 && (interfaceC1502210pC72 = this.LIZLLL.LJIIIIZZ) != null) {
            c2222641Byw2.LIZ.LJ = interfaceC1502210pC72.LIZ(byteArray);
        }
        return new C19666111wx(c2222641Byw2.LIZ);
    }

    public final SdkUplinkPacket LIZIZ() {
        String path;
        Map<String, String> map = this.LIZLLL.LIZJ;
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = this.LIZLLL.LIZLLL;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        byte[] bArrLIZ = this.LIZLLL.LIZ();
        try {
            path = UriProtector.parse(this.LIZLLL.LIZIZ).getPath();
            if (path == null) {
                path = this.LIZLLL.LIZIZ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            path = this.LIZLLL.LIZIZ;
        }
        C2222941BzQ c2222941BzQ = new C2222941BzQ();
        c2222941BzQ.LIZLLL = Long.valueOf(this.LIZ);
        c2222941BzQ.LJ = Long.valueOf(this.LIZIZ);
        c2222941BzQ.LJII = path;
        C1516540pZE.LIZIZ(map2);
        c2222941BzQ.LJFF = map2;
        C1516540pZE.LIZIZ(map);
        c2222941BzQ.LJI = map;
        C1496910p3Z c1496910p3Z = ByteString.Companion;
        byte[] bArrCopyOf = Arrays.copyOf(bArrLIZ, bArrLIZ.length);
        c1496910p3Z.getClass();
        c2222941BzQ.LJIIIIZZ = C1496910p3Z.LIZIZ(bArrCopyOf);
        return c2222941BzQ.build();
    }

    public final void LIZJ(boolean z, Exception exc) {
        int statusCode;
        this.LJIIJ = exc;
        C2222591Byr c2222591Byr = this.LJIIL;
        c2222591Byr.getClass();
        c2222591Byr.LJII = System.currentTimeMillis();
        c2222591Byr.LJFF = z;
        c2222591Byr.LJIIIIZZ = false;
        if (exc instanceof C2222631Byv) {
            statusCode = ((C2222631Byv) exc).getStatusCode();
        } else {
            statusCode = -1;
        }
        c2222591Byr.LJIIIZ = statusCode;
        String message = exc.getMessage();
        if (message == null) {
            message = "Unknown Exception";
        }
        c2222591Byr.LJIIJ = message;
    }

    public final void LIZLLL(SdkUplinkPacket sdkUplinkPacket, boolean z, boolean z2) {
        this.LJIIJJI = z2;
        this.LJIIIIZZ = sdkUplinkPacket;
        C2222591Byr c2222591Byr = this.LJIIL;
        c2222591Byr.getClass();
        c2222591Byr.LJII = System.currentTimeMillis();
        c2222591Byr.LJFF = z;
        c2222591Byr.LJIIIIZZ = true;
        c2222591Byr.LJIIIZ = sdkUplinkPacket.statusCode.intValue();
        c2222591Byr.LJIIJ = sdkUplinkPacket.statusMessage;
    }

    public C2222521Byk(long j, long j2, long j3, C1500700p9g c1500700p9g, InterfaceC19666511x1 interfaceC19666511x1, C2222521Byk c2222521Byk) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = c1500700p9g;
        this.LJ = interfaceC19666511x1;
        this.LJFF = c2222521Byk;
        this.LJIIL = new C2222591Byr(j, j2);
    }
}
