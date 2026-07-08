package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PUF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PUF extends AbstractC645560PTu {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final ClickSearchViewModel LJII;

    @Override // X.AbstractC645560PTu
    public final ClickSearchViewModel LJ() {
        return this.LJII;
    }

    public C0PUF(ClickSearchViewModel clickSearchViewModel) {
        super(EnumC645610PTz.LIVE_FEED, clickSearchViewModel);
        this.LJII = clickSearchViewModel;
    }

    public final void LJIIIZ(String str, EnumC1999307sN enumC1999307sN) {
        String uid;
        String aid;
        User author;
        this.LJII.HQ2(this.LIZJ, true);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("room_id", str);
        Aweme aweme = this.LIZLLL;
        if (aweme == null || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null) {
            uid = "";
        }
        pairArr[1] = new Pair("author_id", uid);
        pairArr[2] = new Pair("timestamp", Integer.valueOf((int) (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
        pairArr[3] = new Pair("is_src", Boolean.TRUE);
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        Aweme aweme2 = this.LIZLLL;
        String aid2 = null;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(str, aid)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("roomId ");
            sbLIZ.append(str);
            sbLIZ.append(" != Aid ");
            Aweme aweme3 = this.LIZLLL;
            if (aweme3 != null) {
                aid2 = aweme3.getAid();
            }
            sbLIZ.append(aid2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        LJII(this.LIZIZ, str, this.LIZJ, mapLJIIJ, LIZLLL(this.LIZ, this.LIZLLL), null);
    }
}
