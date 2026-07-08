package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.SkylightLocalRerankExpData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rdy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596360rdy implements InterfaceC1594910rbd, InterfaceC714040Rze, InterfaceC1595240rcA, InterfaceC1596280rdq {
    public final boolean LL;
    public final Aweme LLILLJJLI;
    public int LLILLL;
    public Integer LLILZ;
    public int LLILZIL;
    public final long LLILZLL;
    public final boolean LLIZ;

    @Override // X.InterfaceC1596280rdq
    public final void setRankState(int i) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StorySkylightItem(isSelfStory=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", storyCollection=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", reRankSequence=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", reRankType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", dataFrom=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", receiveTime=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1595240rcA
    public final User getUser() {
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            return aweme.getAuthor();
        }
        return null;
    }

    public final int hashCode() {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(this.LLILLJJLI.hashCode());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = -1;
        }
        return ((Number) c098200Yq).intValue();
    }

    @Override // X.InterfaceC1595240rcA
    public final String getCellType() {
        User user = getUser();
        return Intrinsics.LJFF(user != null ? user.getUid() : null, C0XQ7.LJFF().getCurUserId()) ? "create" : "story";
    }

    @Override // X.InterfaceC1595240rcA
    public final String getUid() {
        return C1595950rdJ.LIZ(this);
    }

    @Override // X.InterfaceC714040Rze
    public final boolean hasUnreadStory() {
        return C712780Rxc.LIZ(this);
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isUnfollow() {
        return C1595950rdJ.LIZIZ(this);
    }

    @Override // X.InterfaceC1595240rcA
    public final int getReRankSequence() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1595240rcA
    public final Integer getReRankType() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC714040Rze
    public final Aweme getStoryCollection() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isSingleUser() {
        return this.LLIZ;
    }

    public final boolean LIZ(long j) {
        int i = this.LLILZIL;
        if (i == 1 || i == 2 || this.LLILZLL <= j) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ(C1596360rdy c1596360rdy) {
        String uri;
        String uri2;
        Integer num;
        Integer num2;
        String accurateRecType;
        AvatarMetaInfo avatarMetaInfoLIZIZ;
        AvatarMetaInfo avatarMetaInfoLIZIZ2;
        UrlModel avatarThumb;
        UrlModel avatarThumb2;
        User author = this.LLILLJJLI.getAuthor();
        String accurateRecType2 = null;
        if (author != null && (avatarThumb2 = author.getAvatarThumb()) != null) {
            uri = avatarThumb2.getUri();
        } else {
            uri = null;
        }
        User author2 = c1596360rdy.LLILLJJLI.getAuthor();
        if (author2 != null && (avatarThumb = author2.getAvatarThumb()) != null) {
            uri2 = avatarThumb.getUri();
        } else {
            uri2 = null;
        }
        if (!Intrinsics.LJFF(uri, uri2)) {
            return false;
        }
        User author3 = this.LLILLJJLI.getAuthor();
        if (author3 != null && (avatarMetaInfoLIZIZ2 = C1245160iVW.LIZIZ(author3)) != null) {
            num = avatarMetaInfoLIZIZ2.avatarChoice;
        } else {
            num = null;
        }
        User author4 = c1596360rdy.LLILLJJLI.getAuthor();
        if (author4 != null && (avatarMetaInfoLIZIZ = C1245160iVW.LIZIZ(author4)) != null) {
            num2 = avatarMetaInfoLIZIZ.avatarChoice;
        } else {
            num2 = null;
        }
        if (!Intrinsics.LJFF(num, num2) || !Intrinsics.LJFF(this.LLILLJJLI, c1596360rdy.LLILLJJLI)) {
            return false;
        }
        User author5 = this.LLILLJJLI.getAuthor();
        if (author5 != null) {
            accurateRecType = author5.getAccurateRecType();
        } else {
            accurateRecType = null;
        }
        User author6 = c1596360rdy.LLILLJJLI.getAuthor();
        if (author6 != null) {
            accurateRecType2 = author6.getAccurateRecType();
        }
        if (!Intrinsics.LJFF(accurateRecType, accurateRecType2)) {
            return false;
        }
        return true;
    }

    public final boolean LIZLLL(C1596360rdy c1596360rdy) {
        return Intrinsics.LJFF(this.LLILLJJLI.getRequestId(), c1596360rdy.LLILLJJLI.getRequestId());
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1596360rdy)) {
            return false;
        }
        SkylightLocalRerankExpData skylightLocalRerankExpData = C1599000riE.LIZ;
        if (skylightLocalRerankExpData.enableReorder) {
            C1596360rdy c1596360rdy = (C1596360rdy) interfaceC1891350zJl;
            if (!LIZIZ(c1596360rdy) || !LIZLLL(c1596360rdy)) {
                return false;
            }
            if (skylightLocalRerankExpData.enableReorder && this.LLILLL != c1596360rdy.LLILLL) {
                return false;
            }
        } else {
            C1596360rdy c1596360rdy2 = (C1596360rdy) interfaceC1891350zJl;
            if (!LIZIZ(c1596360rdy2) || !LIZLLL(c1596360rdy2)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1596360rdy) {
            return Intrinsics.LJFF(((C1596360rdy) interfaceC1891350zJl).LLILLJJLI.getAid(), this.LLILLJJLI.getAid());
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1891350zJl)) {
            return false;
        }
        return areContentsTheSame((InterfaceC1891350zJl) obj);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1596360rdy)) {
            return null;
        }
        C1596360rdy c1596360rdy = (C1596360rdy) interfaceC1891350zJl;
        LIZLLL(c1596360rdy);
        boolean z = !LIZIZ(c1596360rdy);
        SkylightLocalRerankExpData skylightLocalRerankExpData = C1599000riE.LIZ;
        return new C1596370rdz(z);
    }

    public C1596360rdy(boolean z, Aweme aweme) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LL = z;
        this.LLILLJJLI = aweme;
        this.LLILLL = 0;
        this.LLILZ = 1;
        this.LLILZIL = 0;
        this.LLILZLL = jCurrentTimeMillis;
        this.LLIZ = true;
    }
}
