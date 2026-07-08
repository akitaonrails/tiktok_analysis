package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yzk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892460Yzk implements C0Z8A {
    public CharSequence LL;
    public final String LLILLJJLI;

    public final C892460Yzk copy(CharSequence charSequence, String str) {
        return new C892460Yzk(charSequence, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C892460Yzk)) {
            return false;
        }
        C892460Yzk c892460Yzk = (C892460Yzk) obj;
        return Intrinsics.LJFF(this.LL, c892460Yzk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c892460Yzk.LLILLJJLI);
    }

    public int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VOLastMessageContentType(content=");
        sbLIZ.append((Object) this.LL);
        sbLIZ.append(", msgType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0Z8A
    public CharSequence getContent() {
        return this.LL;
    }

    public final String getMsgType() {
        return this.LLILLJJLI;
    }

    @Override // X.C0Z8A
    public void setContent(CharSequence charSequence) {
        this.LL = charSequence;
    }

    public C892460Yzk(CharSequence charSequence, String str) {
        this.LL = charSequence;
        this.LLILLJJLI = str;
    }
}
