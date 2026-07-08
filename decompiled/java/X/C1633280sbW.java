package X;

import java.util.LinkedHashMap;
import java.util.Map;
import jkp.j;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0sbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633280sbW {
    public static final /* synthetic */ int LJIIL = 0;
    public final InterfaceC497601wk LIZ;
    public final C1633470sbp LIZIZ;
    public final InterfaceC1633420sbk LIZJ;
    public volatile C1633750scH LJFF;
    public volatile InterfaceC1633390sbh LJI;
    public final AnonymousClass0951 LJIIJ;
    public final InterfaceC332260D0u LJIIJJI;
    public final C1DEV LIZLLL = C2191201ApK.LIZ();
    public final Map<C1633220sbQ, C09AE> LJ = new LinkedHashMap();
    public final C2252321DDq LJII = C1BNE.LIZ(null);
    public final C2252321DDq LJIIIIZZ = C1BNE.LIZ(null);
    public final C2252321DDq LJIIIZ = C1BNE.LIZ(null);

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0sbQ] */
    public static C1633220sbQ LIZIZ(C1633200sbO c1633200sbO) {
        C08QP c08qpLJI = C09RB.LJI(C09RB.LJIIIZ(new C08LY(new C1939607ik(c1633200sbO.LIZ), AFwS266S0000000_25.get$arr$(479)), AFwS266S0000000_25.get$arr$(480)));
        C19974813Dm c19974813DmBuilder = j.LLILLL.builder();
        C19719612Di.LJJIFFI(c19974813DmBuilder, c08qpLJI);
        final InterfaceC1664360tPe interfaceC1664360tPeBuild = c19974813DmBuilder.build();
        final int i = c1633200sbO.LIZIZ;
        final String string = a0.LJLIIIL(c1633200sbO.LIZJ).toString();
        return new Object(interfaceC1664360tPeBuild, i, string) { // from class: X.0sbQ
            public final InterfaceC1664360tPe<String> LIZ;
            public final int LIZIZ;
            public final String LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1633220sbQ)) {
                    return false;
                }
                C1633220sbQ c1633220sbQ = (C1633220sbQ) obj;
                return Intrinsics.LJFF(this.LIZ, c1633220sbQ.LIZ) && this.LIZIZ == c1633220sbQ.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1633220sbQ.LIZJ);
            }

            public final int hashCode() {
                return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("InFlightKey(insertEffects=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", whitelistScene=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", stickerId=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = interfaceC1664360tPeBuild;
                this.LIZIZ = i;
                this.LIZJ = string;
            }
        };
    }

    public C1633280sbW(C054G c054g, C1633470sbp c1633470sbp, C1490940otw c1490940otw) {
        this.LIZ = c054g;
        this.LIZIZ = c1633470sbp;
        this.LIZJ = c1490940otw;
        this.LJIIJ = C09IC.LIZIZ(c1633470sbp.LIZ);
        this.LJIIJJI = c1633470sbp.LIZIZ;
    }

    public final AnonymousClass0956 LIZ(C1633220sbQ c1633220sbQ, C1633200sbO c1633200sbO, Map map, C1633750scH c1633750scH, InterfaceC1633390sbh interfaceC1633390sbh) {
        return C23250099c.LIZLLL(this.LIZ, null, null, new C1633300sbY(c1633200sbO, this, interfaceC1633390sbh, c1633750scH, map, c1633220sbQ, null), 3);
    }
}
