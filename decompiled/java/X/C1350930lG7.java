package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0lG7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350930lG7 extends AbstractC1386140mAu<C1350930lG7> {
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public int LJJLIL;
    public boolean LJJLJ;
    public Aweme LJJLJLI;
    public String LJJLL;
    public String LJJZ;
    public String LJJZZI;
    public String LJJZZIII;
    public String LJL;
    public String LJLI;
    public int LJLIIIL;
    public int LJLIIL;
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public int LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public int LJLLI;
    public String LJLLILLLL;
    public int LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public Integer LJLZ;
    public String LJZ;
    public String LJZI;
    public boolean LJZL;
    public int LL;
    public int LLD;
    public String LLF;
    public final String LLFF;
    public int LLFFF;
    public int LLFII;
    public String LLFZ;
    public String LLI;
    public String LLIFFJFJJ;
    public String LLII;
    public String LLIIII;
    public String LLIIIILZ;
    public String LLIIIJ;
    public String LLIIIL;
    public String LLIIIZ;
    public String LLIIJI;
    public String LLIIJLIL;
    public String LLIIL;
    public String LLIILII;
    public String LLIILZL;
    public String LLIIZ;
    public String LLIL;
    public String LLILII;
    public String LLILIL;
    public String LLILL;
    public int LLILLIZIL;
    public String LLILLJJLI;
    public int LLILLL;
    public Integer LLILZ;
    public int LLILZIL;
    public Integer LLILZLL;
    public int LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public Map<String, String> LLJI;
    public Comment LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public boolean LLJJIII;
    public String LLJJIJI;
    public boolean LLJJIJIIJIL;
    public String LLJJIJIL;
    public boolean LLJJJ;

    public C1350930lG7() {
        super("post_comment");
        this.LJJLIIIJJIZ = "";
        this.LJLIIIL = 1;
        this.LJLJL = -1;
        this.LL = -1;
        this.LLF = "";
        this.LLFF = "";
        this.LLFZ = "";
        this.LLI = "";
        this.LLIFFJFJJ = "";
        this.LLII = "";
        this.LLIIII = "";
        this.LLIIIILZ = "";
        this.LLIIIZ = "";
        this.LLIIJI = "";
        this.LLIIJLIL = "";
        this.LLIIL = "";
        this.LLIILII = "";
        this.LLIILZL = "";
        this.LLIIZ = "";
        this.LLIL = "";
        this.LLILII = "";
        this.LLILIL = "";
        this.LLILL = "";
        this.LLILLIZIL = -1;
        this.LLILLJJLI = "";
        this.LLILLL = -1;
        this.LLILZ = 0;
        this.LLILZIL = 0;
        this.LLILZLL = 0;
        this.LLIZ = 0;
        this.LLIZLLLIL = "";
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = false;
        this.LLJILJILJ = "";
        this.LLJILLL = "";
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = false;
        this.LLJJIJI = "";
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = null;
        this.LLJJJ = false;
        this.LJI = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:282:0x074e  */
    @Override // X.AbstractC1386130mAt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 1909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350930lG7.LJIIIIZZ():void");
    }

    public final void LJJJJZ() {
        this.LLILLJJLI = "post";
    }

    public final void LJJLIIIJL() {
        this.LJLLLL = "";
    }

    public final void LJJZ() {
        this.LLIIIZ = "";
    }

    public final void LJLJL() {
        this.LJLLLLLL = "";
    }

    @Override // X.AbstractC1386140mAu
    /* JADX INFO: renamed from: LJJIJIL, reason: merged with bridge method [inline-methods] */
    public final void LJIJI(Aweme aweme) {
        String str;
        super.LJIJI(aweme);
        this.LJJLJLI = aweme;
        aweme.getAid();
        this.LJJLIIIJ = aweme.getAid();
        this.LJJLIIIJILLIZJL = AwemeExtKt.getAuthorUid(aweme);
        this.LJL = C735370Ssx.LJI(aweme);
        this.LJLI = C735370Ssx.LJFF(aweme);
        this.LJLIL = AwemeExtKt.getRepostFromGroupId(aweme);
        this.LJLILLLLZI = AwemeExtKt.getRepostFromUserId(aweme);
        if (C10EU.LJIIJJI(aweme)) {
            str = "follow";
        } else {
            str = "unfollow";
        }
        this.LJLJJLL = str;
        if (aweme.getAuthor() != null) {
            this.LJLJL = aweme.getAuthor().getFollowStatus();
        }
        if (aweme.getMixInfo() != null) {
            this.LJLJI = aweme.getMixInfo().mixId;
        }
        if (!C727520SgI.LJI(this.LJJJJZ)) {
            this.LJLJJL = C727520SgI.LIZIZ(this.LJJJJZ).mutualType;
        }
        this.LJIJJ = C735370Ssx.LJIILLIIL(aweme);
        C727520SgI.LJFF(aweme);
        this.LJIJJLI = "";
        this.LJZL = AwemeBizExtKt.isHighlighted(aweme);
        this.LL = AwemeBizExtKt.getOriginalPos(aweme);
        this.LLILZLL = Integer.valueOf(AwemeBizExtKt.getBehindTheSongVideoType(aweme));
        if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().text)) {
            this.LLD = 1;
        }
        PlayListInfo playListInfo = aweme.playlist_info;
        if (playListInfo != null && playListInfo.getMixId() != null) {
            this.LLF = aweme.playlist_info.getMixId();
        }
        C1365450ldX.LIZLLL(this, aweme.getAuthor());
        if (!TextUtils.isEmpty(aweme.partN)) {
            this.LLFFF = 2;
        } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
            this.LLFFF = 1;
        }
        if (aweme.isPinnedByArtist()) {
            this.LLILZ = 1;
        }
        if (aweme.getPickedUsers() != null && aweme.getPickedUsers().size() > 0) {
            this.LLILZIL = 1;
        }
        if (aweme.getMusic() != null) {
            if (aweme.getMusic().isPgc()) {
                this.LLIZ = 1;
            }
            this.LLJ = aweme.getMusic().getIdStr();
            if (aweme.getMusic().getMatchedSongInfo() != null) {
                this.LLIZLLLIL = aweme.getMusic().getMatchedSongInfo().getId();
            }
            if (aweme.getMusic().getLogExtraMap() != null) {
                this.LLJI = aweme.getMusic().getLogExtraMap();
            }
        }
        IAnchorBusinessOutBridgeService iAnchorBusinessOutBridgeService = (IAnchorBusinessOutBridgeService) PluggableExtentionKt.pluggableSpi(IAnchorBusinessOutBridgeService.class);
        if (iAnchorBusinessOutBridgeService != null) {
            C1387380mCu c1387380mCuLIZLLL = iAnchorBusinessOutBridgeService.LIZLLL(aweme);
            this.LLJJ = c1387380mCuLIZLLL.LIZJ;
            this.LLJJI = c1387380mCuLIZLLL.LIZLLL;
        }
    }

    public final void LJJIJL(String str) {
        this.LLJILJILJ = str;
    }

    public final void LJJIJLIJ(String str) {
        this.LLJJIJI = str;
    }

    public final void LJJIL(String str) {
        this.LLIIIJ = str;
    }

    public final void LJJIZ(String str) {
        this.LJJLIIIJL = str;
    }

    public final void LJJJ(String str) {
        this.LJII = str;
    }

    public final void LJJJI(String str) {
        this.LJJLIIIJLJLI = str;
    }

    public final void LJJJIL(String str) {
        this.LIZLLL = str;
    }

    public final void LJJJJ(boolean z) {
        this.LJLIIIL = z ? 1 : 0;
    }

    public final void LJJJJI(String str) {
        this.LJJLIIIJLLLLLLLZ = str;
    }

    public final void LJJJJIZL(boolean z) {
        this.LLJILJIL = z;
    }

    public final void LJJJJJ(boolean z) {
        this.LLJJIII = z;
    }

    public final void LJJJJJL(int i) {
        this.LJJLIL = i;
    }

    public final void LJJJJL(boolean z) {
        this.LJJLJ = z;
    }

    public final void LJJJJLI(String str) {
        this.LJLJLLL = str;
    }

    public final void LJJJJLL(int i) {
        this.LLILLL = i;
    }

    public final void LJJJJZI(String str) {
        if (str != null) {
            this.LJJLIIIJJIZ = str;
        }
    }

    public final void LJJJLIIL(String str) {
        this.LJJZZI = str;
    }

    public final void LJJJLL(String str) {
        this.LJJZ = str;
    }

    public final void LJJJLZIJ(String str) {
        this.LJJLL = str;
    }

    public final void LJJJZ(String str) {
        this.LJJZZIII = str;
    }

    public final void LJJL(String str) {
        this.LJLL = str;
    }

    public final void LJJLI(String str) {
        this.LLIIIL = str;
    }

    public final void LJJLIIIIJ(Comment comment) {
        if (comment == null) {
            return;
        }
        this.LLJIJIL = comment;
        this.LJJLIIIJJI = comment.getCid();
        if (comment.getUser() == null) {
            return;
        }
        this.LJLJLJ = comment.getUser().getFollowStatus();
    }

    public final void LJJLIIIJ(String str) {
        this.LJJLIIIJJI = str;
    }

    public final void LJJLIIIJILLIZJL(String str) {
        this.LLJILLL = str;
    }

    public final void LJJLIIIJJI(String str) {
        this.LLIFFJFJJ = str;
    }

    public final void LJJLIIIJJIZ(Integer num) {
        this.LJLZ = num;
    }

    public final void LJJLIIIJLJLI(List list) {
        if (list != null && list.size() != 0) {
            HashMap map = new HashMap();
            map.put("data", list);
            this.LJLLL = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), map);
        }
    }

    public final void LJJLIIIJLLLLLLLZ(String str) {
        this.LLJJIJIL = str;
    }

    public final void LJJLIIJ(int i) {
        this.LLILLIZIL = i;
    }

    public final void LJJLIL(int i) {
        this.LJLLI = i;
    }

    public final void LJJLJ(int i) {
        this.LLFII = i;
    }

    public final void LJJLJLI(String str) {
        this.LLIIJLIL = str;
    }

    public final void LJJLL(String str) {
        this.LLIIL = str;
    }

    public final void LJJZZI(boolean z) {
        this.LLJJJ = z;
    }

    public final void LJJZZIII(int i) {
        this.LJLLJ = i;
    }

    public final void LJL(int i) {
        this.LJLIIL = i;
    }

    public final void LJLI(String str) {
        this.LLIILII = str;
    }

    public final void LJLIIIL(String str) {
        this.LLII = str;
    }

    public final void LJLIIL(List list) {
        this.LLIILZL = C188900o3.LIZ(list);
    }

    public final void LJLIL(String str) {
        this.LLIIZ = str;
    }

    public final void LJLILLLLZI(String str) {
        this.LLIIJI = str;
    }

    public final void LJLJI(String str) {
        this.LLIIII = str;
    }

    public final void LJLJJI(String str) {
        this.LLIL = str;
    }

    public final void LJLJJL(String str) {
        this.LJZI = str;
    }

    public final void LJLJJLL(String str) {
        this.LJLJJI = str;
    }

    public final void LJLJLJ(String str) {
        this.LJJLIIJ = str;
    }

    public final void LJLJLLL(String str) {
        this.LJLLILLLL = str;
    }

    public final void LJLL(String str) {
        this.LLILL = str;
    }

    public final void LJLLI(String str) {
        this.LLILIL = str;
    }

    public final void LJLLILLLL(String str) {
        this.LLILII = str;
    }

    public final void LJLLJ(String str) {
        this.LLI = str;
    }

    public final void LJLLL(String str) {
        this.LLFZ = str;
    }

    public final void LJLLLL(String str) {
        this.LJZ = str;
    }

    public final void LJLLLLLL(String str) {
        this.LLIIIILZ = str;
    }
}
