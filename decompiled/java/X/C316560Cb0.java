package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316560Cb0 implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C316560Cb0)) {
            return false;
        }
        C316560Cb0 c316560Cb0 = (C316560Cb0) obj;
        return Intrinsics.LJFF(this.LL, c316560Cb0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c316560Cb0.LLILLJJLI) && this.LLILLL == c316560Cb0.LLILLL && this.LLILZ == c316560Cb0.LLILZ && Intrinsics.LJFF(this.LLILZIL, c316560Cb0.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupMentionItem(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", groupName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", memberCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", accessCriteriaResId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", avatarUrl=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C316560Cb0)) {
            return false;
        }
        C316560Cb0 c316560Cb0 = (C316560Cb0) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c316560Cb0.LL, this.LL) || !Intrinsics.LJFF(c316560Cb0.LLILLJJLI, this.LLILLJJLI) || c316560Cb0.LLILLL != this.LLILLL || c316560Cb0.LLILZ != this.LLILZ || !Intrinsics.LJFF(c316560Cb0.LLILZIL, this.LLILZIL)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C316560Cb0)) {
            return false;
        }
        return Intrinsics.LJFF(((C316560Cb0) interfaceC1891350zJl).LL, this.LL);
    }

    public C316560Cb0(int i, int i2, String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = str3;
    }
}
