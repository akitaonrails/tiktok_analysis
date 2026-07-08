package X;

import Y.AObjectS79S0000000_30;
import java.util.List;

/* JADX INFO: renamed from: X.13K6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public final class C13K6 {
    public static final C13K8 Companion = new Object() { // from class: X.13K8
        public final C13HG<C13K6> serializer() {
            return C13K7.LIZ;
        }
    };
    public static final C01GW<C13HG<Object>>[] LJFF = {null, null, null, null, C452501pT.LIZ(EnumC452301pR.PUBLICATION, new AObjectS79S0000000_30(12))};
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final List<List<C13K6>> LJ;

    public C13K6() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJ = c13bv;
    }

    public C13K6(int i, String str, String str2, String str3, String str4, List list) {
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
                this.LIZJ = "";
            } else {
                this.LIZJ = str3;
            }
            if ((i & 8) == 0) {
                this.LIZLLL = "";
            } else {
                this.LIZLLL = str4;
            }
            if ((i & 16) == 0) {
                this.LJ = C13BV.INSTANCE;
                return;
            } else {
                this.LJ = list;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, C13K7.LIZ.getDescriptor());
        throw null;
    }
}
