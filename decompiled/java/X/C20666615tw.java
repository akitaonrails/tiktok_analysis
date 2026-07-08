package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20666615tw implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final CharSequence LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final String LLIZ;
    public final C291001Au<Boolean> LLIZLLLIL;

    public C20666615tw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20666615tw)) {
            return false;
        }
        C20666615tw c20666615tw = (C20666615tw) obj;
        return Intrinsics.LJFF(this.LL, c20666615tw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c20666615tw.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c20666615tw.LLILLL) && Intrinsics.LJFF(this.LLILZ, c20666615tw.LLILZ) && this.LLILZIL == c20666615tw.LLILZIL && this.LLILZLL == c20666615tw.LLILZLL && Intrinsics.LJFF(this.LLIZ, c20666615tw.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c20666615tw.LLIZLLLIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CharSequence charSequence = this.LLILZ;
        int iHashCode4 = (((((iHashCode3 + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.LLILZIL) * 31) + this.LLILZLL) * 31;
        String str4 = this.LLIZ;
        return ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerPushMiddleState(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", tagText=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", contentChar=");
        sbLIZ.append((Object) this.LLILZ);
        sbLIZ.append(", contentLimitLines=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", middleAlignment=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", middleSchemaUrl=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", onUpdateUIWhenShow=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C20666615tw(int i) {
        this(null, null, null, null, 2, 0, null, new C291001Au(Boolean.FALSE));
    }

    public C20666615tw(String str, String str2, String str3, CharSequence charSequence, int i, int i2, String str4, C291001Au<Boolean> c291001Au) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = charSequence;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = str4;
        this.LLIZLLLIL = c291001Au;
    }
}
