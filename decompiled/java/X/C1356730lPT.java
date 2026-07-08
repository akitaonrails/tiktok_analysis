package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0lPT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356730lPT {
    public final RepostReplyStruct LIZ;
    public final String LIZIZ;
    public final User LIZJ;
    public final boolean LIZLLL;
    public final Aweme LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final User LIZ() {
        User user;
        RepostReplyStruct repostReplyStruct = this.LIZ;
        return (repostReplyStruct == null || (user = repostReplyStruct.user) == null) ? this.LIZJ : user;
    }

    public C1356730lPT(RepostReplyStruct repostReplyStruct, String str, User user, boolean z, Aweme aweme, String str2, String str3, String str4, String str5) {
        this.LIZ = repostReplyStruct;
        this.LIZIZ = str;
        this.LIZJ = user;
        this.LIZLLL = z;
        this.LJ = aweme;
        this.LJFF = str2;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = str5;
    }

    public /* synthetic */ C1356730lPT(RepostReplyStruct repostReplyStruct, String str, User user, boolean z, Aweme aweme, String str2, String str3, String str4, String str5, int i) {
        this(repostReplyStruct, str, user, z, (i & 16) != 0 ? null : aweme, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? str5 : null);
    }
}
