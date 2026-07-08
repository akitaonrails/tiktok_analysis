package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iwn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262070iwn extends AbstractC1262180iwy {
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final String LLIZ;

    public C1262070iwn() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1262070iwn)) {
            return false;
        }
        C1262070iwn c1262070iwn = (C1262070iwn) obj;
        return this.LLILLJJLI == c1262070iwn.LLILLJJLI && this.LLILLL == c1262070iwn.LLILLL && this.LLILZ == c1262070iwn.LLILZ && this.LLILZIL == c1262070iwn.LLILZIL && this.LLILZLL == c1262070iwn.LLILZLL;
    }

    public final int hashCode() {
        return (((((((this.LLILLJJLI * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewSuggestionTitle(newSuggestCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", textRes=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", colorLight=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", tuxFont=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", colorDark=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1262230ix3
    public final String getElementId() {
        return this.LLIZ;
    }

    public /* synthetic */ C1262070iwn(int i) {
        this(-1, 2131834656, R.attr.a1k, 62, R.attr.eh);
    }

    public C1262070iwn(int i, int i2, int i3, int i4, int i5) {
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = i4;
        this.LLILZLL = i5;
        this.LLIZ = "NewSuggestion_Title";
    }
}
