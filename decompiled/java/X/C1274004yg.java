package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04yg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1274004yg implements C0Z8A {
    public CharSequence LL;
    public final EnumC461080I6g LLILLJJLI;

    public final C1274004yg copy(CharSequence charSequence, EnumC461080I6g enumC461080I6g) {
        return new C1274004yg(charSequence, enumC461080I6g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1274004yg)) {
            return false;
        }
        C1274004yg c1274004yg = (C1274004yg) obj;
        return Intrinsics.LJFF(this.LL, c1274004yg.LL) && this.LLILLJJLI == c1274004yg.LLILLJJLI;
    }

    public int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VORecentActivityContentType(content=");
        sbLIZ.append((Object) this.LL);
        sbLIZ.append(", recentActivityType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0Z8A
    public CharSequence getContent() {
        return this.LL;
    }

    public final EnumC461080I6g getRecentActivityType() {
        return this.LLILLJJLI;
    }

    @Override // X.C0Z8A
    public void setContent(CharSequence charSequence) {
        this.LL = charSequence;
    }

    public C1274004yg(CharSequence charSequence, EnumC461080I6g enumC461080I6g) {
        this.LL = charSequence;
        this.LLILLJJLI = enumC461080I6g;
    }
}
