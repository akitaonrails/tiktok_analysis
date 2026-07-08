package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0roj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1603030roj {
    public final int LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final EnumC1604800rra LIZLLL;
    public volatile int LJ;

    public final void LIZIZ() {
        int i = this.LJ;
        if (i == 0 || i == 1) {
            LIZ(2);
        } else if (i == 3) {
            LIZ(6);
        } else if (i == 4) {
            LIZ(5);
        }
    }

    public final void LIZ(int i) {
        if (i > this.LJ && this.LJ != 2 && this.LJ != 5 && this.LJ != 6) {
            this.LJ = i;
        }
    }

    public C1603030roj(Aweme aweme, int i, String str, EnumC1604800rra enumC1604800rra) {
        this.LIZIZ = aweme;
        this.LIZ = i;
        this.LIZLLL = enumC1604800rra;
        this.LIZJ = str;
    }
}
