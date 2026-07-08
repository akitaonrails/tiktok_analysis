package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04ry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1232404ry implements C0Z8A {
    public CharSequence LL;
    public final String LLILLJJLI;

    public final C1232404ry copy(CharSequence charSequence, String str) {
        return new C1232404ry(charSequence, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1232404ry)) {
            return false;
        }
        C1232404ry c1232404ry = (C1232404ry) obj;
        return Intrinsics.LJFF(this.LL, c1232404ry.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1232404ry.LLILLJJLI);
    }

    public int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VOLightInteractionContentType(content=");
        sbLIZ.append((Object) this.LL);
        sbLIZ.append(", lightInteractionName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0Z8A
    public CharSequence getContent() {
        return this.LL;
    }

    public final String getLightInteractionName() {
        return this.LLILLJJLI;
    }

    @Override // X.C0Z8A
    public void setContent(CharSequence charSequence) {
        this.LL = charSequence;
    }

    public C1232404ry(CharSequence charSequence, String str) {
        this.LL = charSequence;
        this.LLILLJJLI = str;
    }
}
