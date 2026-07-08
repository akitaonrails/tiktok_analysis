package X;

import com.ss.android.ugc.aweme.comment.model.PollInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341920l1a implements InterfaceC1891350zJl {
    public final PollInfo LL;
    public final int LLILLJJLI;
    public final Long LLILLL;
    public Integer LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1341920l1a)) {
            return false;
        }
        C1341920l1a c1341920l1a = (C1341920l1a) obj;
        return Intrinsics.LJFF(this.LL, c1341920l1a.LL) && this.LLILLJJLI == c1341920l1a.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1341920l1a.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1341920l1a.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        Long l = this.LLILLL;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.LLILZ;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollItem(pollInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", publishState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pollOptionState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1341920l1a)) {
            return false;
        }
        PollInfo pollInfo = this.LL;
        C1341920l1a c1341920l1a = (C1341920l1a) interfaceC1891350zJl;
        PollInfo pollInfo2 = c1341920l1a.LL;
        if (pollInfo.pollId != pollInfo2.pollId || !Intrinsics.LJFF(pollInfo.title, pollInfo2.title) || !Intrinsics.LJFF(pollInfo.optionCountList, pollInfo2.optionCountList) || pollInfo.pollStatus != pollInfo2.pollStatus || pollInfo.totalVotes != pollInfo2.totalVotes || !Intrinsics.LJFF(pollInfo.expireTime, pollInfo2.expireTime) || !Intrinsics.LJFF(pollInfo.userPollOption, pollInfo2.userPollOption) || !Intrinsics.LJFF(pollInfo.pollStyle, pollInfo2.pollStyle) || !Intrinsics.LJFF(pollInfo.creatorId, pollInfo2.creatorId) || !Intrinsics.LJFF(pollInfo.createTime, pollInfo2.createTime) || this.LLILLJJLI != c1341920l1a.LLILLJJLI || !Intrinsics.LJFF(this.LLILZ, c1341920l1a.LLILZ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1341920l1a) || ((C1341920l1a) interfaceC1891350zJl).LL.pollId != this.LL.pollId) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (!(interfaceC1891350zJl instanceof C1341920l1a)) {
            return null;
        }
        PollInfo pollInfo = this.LL;
        C1341920l1a c1341920l1a = (C1341920l1a) interfaceC1891350zJl;
        PollInfo pollInfo2 = c1341920l1a.LL;
        boolean z2 = false;
        if (this.LLILLJJLI != c1341920l1a.LLILLJJLI) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = !Intrinsics.LJFF(this.LLILZ, c1341920l1a.LLILZ);
        if (!Intrinsics.LJFF(pollInfo.title, pollInfo2.title) || !Intrinsics.LJFF(pollInfo.optionCountList, pollInfo2.optionCountList) || pollInfo.pollStatus != pollInfo2.pollStatus || pollInfo.totalVotes != pollInfo2.totalVotes || !Intrinsics.LJFF(pollInfo.expireTime, pollInfo2.expireTime) || !Intrinsics.LJFF(pollInfo.userPollOption, pollInfo2.userPollOption) || !Intrinsics.LJFF(pollInfo.pollStyle, pollInfo2.pollStyle) || !Intrinsics.LJFF(pollInfo.creatorId, pollInfo2.creatorId) || !Intrinsics.LJFF(pollInfo.createTime, pollInfo2.createTime)) {
            z2 = true;
        }
        return new C1154960gA2(z, z3, z2);
    }

    public C1341920l1a(PollInfo pollInfo, int i, Long l, Integer num) {
        this.LL = pollInfo;
        this.LLILLJJLI = i;
        this.LLILLL = l;
        this.LLILZ = num;
    }
}
