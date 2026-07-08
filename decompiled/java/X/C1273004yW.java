package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04yW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1273004yW implements C0Z8A {
    public CharSequence LL;
    public final EnumC894710Z8b LLILLJJLI;

    public final C1273004yW copy(CharSequence charSequence, EnumC894710Z8b enumC894710Z8b) {
        return new C1273004yW(charSequence, enumC894710Z8b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1273004yW)) {
            return false;
        }
        C1273004yW c1273004yW = (C1273004yW) obj;
        return Intrinsics.LJFF(this.LL, c1273004yW.LL) && this.LLILLJJLI == c1273004yW.LLILLJJLI;
    }

    public int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        EnumC894710Z8b enumC894710Z8b = this.LLILLJJLI;
        return iHashCode + (enumC894710Z8b == null ? 0 : enumC894710Z8b.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VOActivityStatusContentType(content=");
        sbLIZ.append((Object) this.LL);
        sbLIZ.append(", activityStatusLevel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final EnumC894710Z8b getActivityStatusLevel() {
        return this.LLILLJJLI;
    }

    @Override // X.C0Z8A
    public CharSequence getContent() {
        return this.LL;
    }

    @Override // X.C0Z8A
    public void setContent(CharSequence charSequence) {
        this.LL = charSequence;
    }

    public C1273004yW(CharSequence charSequence, EnumC894710Z8b enumC894710Z8b) {
        this.LL = charSequence;
        this.LLILLJJLI = enumC894710Z8b;
    }
}
