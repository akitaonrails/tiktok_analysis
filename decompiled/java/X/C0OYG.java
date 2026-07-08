package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OYG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OYG implements InterfaceC1891350zJl {
    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final C0OYT LLILZIL;
    public final int LLILZLL;
    public final boolean LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OYG)) {
            return false;
        }
        C0OYG c0oyg = (C0OYG) obj;
        return Intrinsics.LJFF(this.LL, c0oyg.LL) && this.LLILLJJLI == c0oyg.LLILLJJLI && this.LLILLL == c0oyg.LLILLL && this.LLILZ == c0oyg.LLILZ && this.LLILZIL == c0oyg.LLILZIL && this.LLILZLL == c0oyg.LLILZLL && this.LLIZ == c0oyg.LLIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCommentMoreItem(commentId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", expandingCommentCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", alwaysShowCommentCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", totalCommentCount=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", buttonStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", hasMore=");
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
        if (interfaceC1891350zJl instanceof C0OYG) {
            C0OYG c0oyg = (C0OYG) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LL, c0oyg.LL) && this.LLILLJJLI == c0oyg.LLILLJJLI && this.LLILLL == c0oyg.LLILLL && this.LLILZ == c0oyg.LLILZ && this.LLILZIL == c0oyg.LLILZIL) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C0OYG(String str, int i, int i2, int i3, C0OYT c0oyt, int i4, boolean z) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = c0oyt;
        this.LLILZLL = i4;
        this.LLIZ = z;
    }

    public static C0OYG LIZ(C0OYG c0oyg, int i, int i2, int i3, C0OYT c0oyt, int i4, boolean z, int i5) {
        String str;
        boolean z2 = z;
        int i6 = i4;
        C0OYT c0oyt2 = c0oyt;
        int i7 = i3;
        int i8 = i2;
        int i9 = i;
        if ((i5 & 1) != 0) {
            str = c0oyg.LL;
        } else {
            str = null;
        }
        if ((i5 & 2) != 0) {
            i9 = c0oyg.LLILLJJLI;
        }
        if ((i5 & 4) != 0) {
            i8 = c0oyg.LLILLL;
        }
        if ((i5 & 8) != 0) {
            i7 = c0oyg.LLILZ;
        }
        if ((i5 & 16) != 0) {
            c0oyt2 = c0oyg.LLILZIL;
        }
        if ((i5 & 32) != 0) {
            i6 = c0oyg.LLILZLL;
        }
        if ((i5 & 64) != 0) {
            z2 = c0oyg.LLIZ;
        }
        c0oyg.getClass();
        return new C0OYG(str, i9, i8, i7, c0oyt2, i6, z2);
    }
}
