package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q37, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q37 implements C0PWT {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;

    public C0Q37() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q37)) {
            return false;
        }
        C0Q37 c0q37 = (C0Q37) obj;
        return Intrinsics.LJFF(this.LL, c0q37.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0q37.LLILLJJLI) && this.LLILLL == c0q37.LLILLL && this.LLILZ == c0q37.LLILZ && this.LLILZIL == c0q37.LLILZIL && this.LLILZLL == c0q37.LLILZLL;
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchEntranceWithVideoAction(authorId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFeedLiked=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isFeedCollected=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isFeedCommentClicked=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isFeedForwardClicked=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().P70().LIZIZ(C13LE.LIZ(C0Q37.class), new C0Q38());
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public /* synthetic */ C0Q37(int i) {
        this("", false, false, false, "", false);
    }

    public C0Q37(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = z4;
    }
}
