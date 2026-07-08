package X;

import Y.AObjectS79S0000000_30;
import java.util.List;

/* JADX INFO: renamed from: X.13K4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public final class C13K4 {
    public static final C10ZS Companion = new Object() { // from class: X.10ZS
        public final C13HG<C13K4> serializer() {
            return C13K5.LIZ;
        }
    };
    public static final C01GW<C13HG<Object>>[] LJII;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<C13K6> LIZLLL;
    public final List<String> LJ;
    public final List<String> LJFF;
    public final List<C13K2> LJI;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.10ZS] */
    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.PUBLICATION;
        LJII = new C01GW[]{null, null, null, C452501pT.LIZ(enumC452301pR, new AObjectS79S0000000_30(8)), C452501pT.LIZ(enumC452301pR, new AObjectS79S0000000_30(9)), C452501pT.LIZ(enumC452301pR, new AObjectS79S0000000_30(10)), C452501pT.LIZ(enumC452301pR, new AObjectS79S0000000_30(11))};
    }

    public C13K4() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = null;
        this.LIZLLL = c13bv;
        this.LJ = c13bv;
        this.LJFF = c13bv;
        this.LJI = c13bv;
    }

    public C13K4(int i, String str, String str2, String str3, List list, List list2, List list3, List list4) {
        if (0 == 0) {
            if ((i & 1) == 0) {
                this.LIZ = "";
            } else {
                this.LIZ = str;
            }
            if ((i & 2) == 0) {
                this.LIZIZ = "";
            } else {
                this.LIZIZ = str2;
            }
            if ((i & 4) == 0) {
                this.LIZJ = null;
            } else {
                this.LIZJ = str3;
            }
            if ((i & 8) == 0) {
                this.LIZLLL = C13BV.INSTANCE;
            } else {
                this.LIZLLL = list;
            }
            if ((i & 16) == 0) {
                this.LJ = C13BV.INSTANCE;
            } else {
                this.LJ = list2;
            }
            if ((i & 32) == 0) {
                this.LJFF = C13BV.INSTANCE;
            } else {
                this.LJFF = list3;
            }
            if ((i & 64) == 0) {
                this.LJI = C13BV.INSTANCE;
                return;
            } else {
                this.LJI = list4;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, C13K5.LIZ.getDescriptor());
        throw null;
    }
}
