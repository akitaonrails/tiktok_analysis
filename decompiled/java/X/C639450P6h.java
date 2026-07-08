package X;

import com.ss.android.ugc.aweme.search.ecom.data.EcSearchBubbleInfo;

/* JADX INFO: renamed from: X.0P6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639450P6h {
    public final EcSearchBubbleInfo LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public boolean LIZLLL;
    public String LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C639450P6h() {
        boolean z = false;
        this(null, z, z, 31);
    }

    public final void LIZIZ() {
        String str = this.LJ;
        if (str == null || str.length() == 0) {
            this.LJ = "click_switch_tab";
        }
    }

    public /* synthetic */ C639450P6h(EcSearchBubbleInfo ecSearchBubbleInfo, boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? null : ecSearchBubbleInfo, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, false, null);
    }

    public C639450P6h(EcSearchBubbleInfo ecSearchBubbleInfo, boolean z, boolean z2, boolean z3, String str) {
        this.LIZ = ecSearchBubbleInfo;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = str;
    }

    public static C639450P6h LIZ(C639450P6h c639450P6h, EcSearchBubbleInfo ecSearchBubbleInfo, boolean z, boolean z2, int i) {
        boolean z3;
        String str;
        boolean z4 = z2;
        boolean z5 = z;
        EcSearchBubbleInfo ecSearchBubbleInfo2 = ecSearchBubbleInfo;
        if ((i & 1) != 0) {
            ecSearchBubbleInfo2 = c639450P6h.LIZ;
        }
        if ((i & 2) != 0) {
            z5 = c639450P6h.LIZIZ;
        }
        if ((i & 4) != 0) {
            z4 = c639450P6h.LIZJ;
        }
        if ((i & 8) != 0) {
            z3 = c639450P6h.LIZLLL;
        } else {
            z3 = false;
        }
        if ((i & 16) != 0) {
            str = c639450P6h.LJ;
        } else {
            str = null;
        }
        return new C639450P6h(ecSearchBubbleInfo2, z5, z4, z3, str);
    }
}
