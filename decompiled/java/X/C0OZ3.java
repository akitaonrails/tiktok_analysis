package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollVoteDetailResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OZ3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OZ3 implements InterfaceC0148002o {
    public final C0OZ5 LL;
    public final BulletinPollVoteDetailResponse LLILLJJLI;

    public C0OZ3() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OZ3)) {
            return false;
        }
        C0OZ3 c0oz3 = (C0OZ3) obj;
        return this.LL == c0oz3.LL && Intrinsics.LJFF(this.LLILLJJLI, c0oz3.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        BulletinPollVoteDetailResponse bulletinPollVoteDetailResponse = this.LLILLJJLI;
        return iHashCode + (bulletinPollVoteDetailResponse == null ? 0 : bulletinPollVoteDetailResponse.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinPollVoteDetailState(loadState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", response=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0OZ3(int i) {
        this(C0OZ5.LOADING, null);
    }

    public C0OZ3(C0OZ5 c0oz5, BulletinPollVoteDetailResponse bulletinPollVoteDetailResponse) {
        this.LL = c0oz5;
        this.LLILLJJLI = bulletinPollVoteDetailResponse;
    }

    public static C0OZ3 LIZ(C0OZ3 c0oz3, C0OZ5 c0oz5) {
        BulletinPollVoteDetailResponse bulletinPollVoteDetailResponse = c0oz3.LLILLJJLI;
        c0oz3.getClass();
        return new C0OZ3(c0oz5, bulletinPollVoteDetailResponse);
    }
}
