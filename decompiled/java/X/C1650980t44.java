package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.ImageUrlModel;

/* JADX INFO: renamed from: X.0t44, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650980t44 implements Comparable<C1650980t44>, Cloneable {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public ImageUrlModel LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public InterfaceC1651630t57 LLJIJIL;
    public InterfaceC1657650tEp LLJILJIL;
    public InterfaceC1650740t3g LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final int LLJJI;
    public InterfaceC1651650t59 LLJJIII;
    public boolean LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public String LLJJJ;

    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final C1650980t44 clone() {
        C1650980t44 c1650980t44 = new C1650980t44(this.LL, this.LLILLJJLI, this.LLJIJIL, this.LLJJI, this.LLJJIJIIJIL);
        c1650980t44.LLILZIL = this.LLILZIL;
        c1650980t44.LLILLL = this.LLILLL;
        c1650980t44.LLILZ = this.LLILZ;
        c1650980t44.LLILZLL = this.LLILZLL;
        c1650980t44.LLIZ = this.LLIZ;
        c1650980t44.LLJILLL = this.LLJILLL;
        c1650980t44.LLJJ = this.LLJJ;
        c1650980t44.LLJJIJI = this.LLJJIJI;
        c1650980t44.LLJJIII = this.LLJJIII;
        c1650980t44.LLJILJIL = this.LLJILJIL;
        c1650980t44.LLJILJILJ = this.LLJILJILJ;
        c1650980t44.LLIZLLLIL = this.LLIZLLLIL;
        c1650980t44.LLJI = this.LLJI;
        c1650980t44.LLJ = this.LLJ;
        c1650980t44.LLJJJ = this.LLJJJ;
        return c1650980t44;
    }

    public final int hashCode() {
        return this.LL;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1650980t44 c1650980t44) {
        return Integer.compare(this.LL, c1650980t44.LL);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1650980t44)) {
            return false;
        }
        C1650980t44 c1650980t44 = (C1650980t44) obj;
        if (this.LL == c1650980t44.LL && this.LLILLJJLI == c1650980t44.LLILLJJLI && this.LLJJI == c1650980t44.LLJJI && this.LLILLL == c1650980t44.LLILLL && this.LLILZ == c1650980t44.LLILZ && this.LLILZLL == c1650980t44.LLILZLL && this.LLIZ == c1650980t44.LLIZ && this.LLILZIL == c1650980t44.LLILZIL && this.LLIZLLLIL == c1650980t44.LLIZLLLIL && this.LLJ == c1650980t44.LLJ && TextUtils.equals(this.LLJJJ, c1650980t44.LLJJJ)) {
            return true;
        }
        return false;
    }

    public C1650980t44(int i, int i2, InterfaceC1651630t57 interfaceC1651630t57, int i3, boolean z) {
        this(i, i2, interfaceC1651630t57, i3, true, z);
    }

    public C1650980t44(int i, InterfaceC1651630t57 interfaceC1651630t57, int i2, boolean z, boolean z2) {
        this(i, -1, interfaceC1651630t57, i2, z, z2);
    }

    public C1650980t44(int i, int i2, InterfaceC1651630t57 interfaceC1651630t57, int i3, boolean z, boolean z2) {
        this.LLILLL = -1;
        this.LLILZLL = true;
        this.LLJI = -1;
        this.LLJJIJI = true;
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLJIJIL = interfaceC1651630t57;
        this.LLJJI = z2 ? i3 : -1;
        this.LLILZLL = z;
        this.LLIZ = false;
        this.LLJJIJIIJIL = z2;
        this.LLIZLLLIL = false;
    }
}
