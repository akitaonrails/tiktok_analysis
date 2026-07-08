package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SQ6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SQ6 extends C720930SPr {
    public final User LLILLJJLI;
    public final List<Integer> LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final C0SQ1 LLILZLL;
    public final boolean LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SQ6)) {
            return false;
        }
        C0SQ6 c0sq6 = (C0SQ6) obj;
        return Intrinsics.LJFF(this.LLILLJJLI, c0sq6.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0sq6.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0sq6.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0sq6.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0sq6.LLILZLL) && this.LLIZ == c0sq6.LLIZ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LLILLJJLI.hashCode() * 31) + this.LLILLL.hashCode()) * 31;
        String str = this.LLILZ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31;
        C0SQ1 c0sq1 = this.LLILZLL;
        return ((iHashCode2 + (c0sq1 != null ? c0sq1.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReactionBubbleCommonItem(user=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", emojiId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", emojiText=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", bubbleType=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", mobEventParam=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isStoryV2=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C720930SPr, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0SQ6) {
            if (Intrinsics.LJFF(((C0SQ6) interfaceC1891350zJl).LLILLJJLI.getUid(), this.LLILLJJLI.getUid()) && Intrinsics.LJFF(interfaceC1891350zJl, this)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.C720930SPr, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C0SQ6(User user, List<Integer> list, String str, String str2, C0SQ1 c0sq1, boolean z) {
        super(2);
        this.LLILLJJLI = user;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = c0sq1;
        this.LLIZ = z;
    }

    public /* synthetic */ C0SQ6(User user, List list, String str, C0SQ1 c0sq1, boolean z, int i) {
        this(user, (List<Integer>) list, (String) null, str, c0sq1, (i & 32) != 0 ? false : z);
    }
}
