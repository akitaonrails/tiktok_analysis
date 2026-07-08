package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720890SPn extends C720930SPr {
    public final User LLILLJJLI;
    public final Aweme LLILLL;
    public final long LLILZ;
    public final C0SQ1 LLILZIL;
    public final Integer LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C720890SPn)) {
            return false;
        }
        C720890SPn c720890SPn = (C720890SPn) obj;
        return Intrinsics.LJFF(this.LLILLJJLI, c720890SPn.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c720890SPn.LLILLL) && this.LLILZ == c720890SPn.LLILZ && Intrinsics.LJFF(this.LLILZIL, c720890SPn.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c720890SPn.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LLILLJJLI.hashCode() * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31;
        C0SQ1 c0sq1 = this.LLILZIL;
        int iHashCode2 = (iHashCode + (c0sq1 == null ? 0 : c0sq1.hashCode())) * 31;
        Integer num = this.LLILZLL;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReactionBubbleDescriptionItem(user=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", publishTimeInMs=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", mobEventParam=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", pageType=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C720930SPr, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C720890SPn) {
            return Intrinsics.LJFF(((C720890SPn) interfaceC1891350zJl).LLILLL.getAid(), this.LLILLL.getAid());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.C720930SPr, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C720890SPn) {
            return Intrinsics.LJFF(((C720890SPn) interfaceC1891350zJl).LLILLL.getAid(), this.LLILLL.getAid());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C720890SPn(User user, Aweme aweme, long j, C0SQ1 c0sq1, Integer num) {
        super(3);
        this.LLILLJJLI = user;
        this.LLILLL = aweme;
        this.LLILZ = j;
        this.LLILZIL = c0sq1;
        this.LLILZLL = num;
    }
}
