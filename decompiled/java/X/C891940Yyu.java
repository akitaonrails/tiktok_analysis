package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891940Yyu implements C0Z8A {
    public CharSequence LL;
    public final EnumC881770YiV LLILLJJLI;

    public final C891940Yyu copy(CharSequence charSequence, EnumC881770YiV enumC881770YiV) {
        return new C891940Yyu(charSequence, enumC881770YiV);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C891940Yyu)) {
            return false;
        }
        C891940Yyu c891940Yyu = (C891940Yyu) obj;
        return Intrinsics.LJFF(this.LL, c891940Yyu.LL) && this.LLILLJJLI == c891940Yyu.LLILLJJLI;
    }

    public int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        EnumC881770YiV enumC881770YiV = this.LLILLJJLI;
        return iHashCode + (enumC881770YiV == null ? 0 : enumC881770YiV.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VOReadTextContentType(content=");
        sbLIZ.append((Object) this.LL);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0Z8A
    public CharSequence getContent() {
        return this.LL;
    }

    public final EnumC881770YiV getStatus() {
        return this.LLILLJJLI;
    }

    @Override // X.C0Z8A
    public void setContent(CharSequence charSequence) {
        this.LL = charSequence;
    }

    public C891940Yyu(CharSequence charSequence, EnumC881770YiV enumC881770YiV) {
        this.LL = charSequence;
        this.LLILLJJLI = enumC881770YiV;
    }
}
