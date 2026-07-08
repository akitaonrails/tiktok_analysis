package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iwo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262080iwo extends AbstractC1261980iwe {
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final String LLJJ;

    public C1262080iwo() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1262080iwo)) {
            return false;
        }
        C1262080iwo c1262080iwo = (C1262080iwo) obj;
        return this.LLILLJJLI == c1262080iwo.LLILLJJLI && this.LLILLL == c1262080iwo.LLILLL && this.LLILZ == c1262080iwo.LLILZ && this.LLILZIL == c1262080iwo.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1262080iwo.LLILZLL) && this.LLIZ == c1262080iwo.LLIZ && this.LLIZLLLIL == c1262080iwo.LLIZLLLIL && this.LLJ == c1262080iwo.LLJ && this.LLJI == c1262080iwo.LLJI && this.LLJIJIL == c1262080iwo.LLJIJIL && this.LLJILJIL == c1262080iwo.LLJILJIL && this.LLJILJILJ == c1262080iwo.LLJILJILJ && this.LLJILLL == c1262080iwo.LLJILLL;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.LLILLJJLI * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL) * 31) + this.LLJ) * 31) + this.LLJI) * 31) + this.LLJIJIL) * 31) + this.LLJILJIL) * 31) + this.LLJILJILJ) * 31) + this.LLJILLL;
    }

    public final String toString() {
        return "FFPEntry(primaryTextRes=" + this.LLILLJJLI + ", secondaryTextRes=" + this.LLILLL + ", primaryIconRes=" + this.LLILZ + ", ctaIconRes=" + this.LLILZIL + ", ctaUrl=" + this.LLILZLL + ", ctaIconTintColorRes=" + this.LLIZ + ", primaryIconTintColorRes=" + this.LLIZLLLIL + ", colorLight=" + this.LLJ + ", primaryTuxFont=" + this.LLJI + ", secondaryTuxFont=" + this.LLJIJIL + ", primaryTextColorRes=" + this.LLJILJIL + ", secondaryTextColorRes=" + this.LLJILJILJ + ", colorDark=" + this.LLJILLL + ')';
    }

    @Override // X.AbstractC1261980iwe
    public final int LIZ() {
        return this.LLJ;
    }

    @Override // X.AbstractC1261980iwe
    public final int LIZIZ() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1261980iwe
    public final int LIZJ() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1261980iwe
    public final String LIZLLL() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC1261980iwe
    public final int LJ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1261980iwe
    public final int LJFF() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC1261980iwe
    public final int LJI() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC1261980iwe
    public final int LJII() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC1261980iwe
    public final int LJIIIIZZ() {
        return this.LLJI;
    }

    @Override // X.AbstractC1261980iwe
    public final int LJIIIZ() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1261980iwe
    public final int LJIIJ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1261980iwe
    public final int LJIIJJI() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1262230ix3
    public final String getElementId() {
        return this.LLJJ;
    }

    public C1262080iwo(int i) {
        this.LLILLJJLI = 2131834620;
        this.LLILLL = 2131834619;
        this.LLILZ = R.raw.icon_person_plus_fill;
        this.LLILZIL = R.raw.icon_chevron_right_fill_ltr;
        this.LLILZLL = "//friends/ffp";
        this.LLIZ = R.attr.a1p;
        this.LLIZLLLIL = R.attr.a0p;
        this.LLJ = R.attr.ca;
        this.LLJI = 42;
        this.LLJIJIL = 61;
        this.LLJILJIL = R.attr.a1h;
        this.LLJILJILJ = R.attr.a1k;
        this.LLJILLL = R.attr.ca;
        this.LLJJ = "FFP_entrance";
    }
}
