package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DV7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DV7 implements InterfaceC1891350zJl {
    public final CharSequence LL;
    public final Integer LLILLJJLI;
    public final Integer LLILLL;
    public final CharSequence LLILZ;
    public final Integer LLILZIL;
    public final Integer LLILZLL;
    public final Integer LLIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C0DV7() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DV7)) {
            return false;
        }
        C0DV7 c0dv7 = (C0DV7) obj;
        return Intrinsics.LJFF(this.LL, c0dv7.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0dv7.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0dv7.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0dv7.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0dv7.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0dv7.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0dv7.LLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        CharSequence charSequence = this.LL;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Integer num = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        CharSequence charSequence2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Integer num3 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.LLIZ;
        return iHashCode6 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AboutPageTextItem(title=");
        sbLIZ.append((Object) this.LL);
        sbLIZ.append(", titleFont=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", titleColor=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", subText=");
        sbLIZ.append((Object) this.LLILZ);
        sbLIZ.append(", subTextFont=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", subTextColor=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public /* synthetic */ C0DV7(CharSequence charSequence, Integer num, Integer num2, Integer num3, int i) {
        this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, null, null, null, (i & 64) != 0 ? null : num3);
    }

    public C0DV7(CharSequence charSequence, Integer num, Integer num2, CharSequence charSequence2, Integer num3, Integer num4, Integer num5) {
        this.LL = charSequence;
        this.LLILLJJLI = num;
        this.LLILLL = num2;
        this.LLILZ = charSequence2;
        this.LLILZIL = num3;
        this.LLILZLL = num4;
        this.LLIZ = num5;
    }
}
