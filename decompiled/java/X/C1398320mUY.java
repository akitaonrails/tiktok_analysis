package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.ui.IMDPMobAbility;
import com.ss.android.ugc.aweme.music.ui.MusicSquareViewHolder;
import com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAwemeListAbility;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mUY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1398320mUY implements InterfaceC1400710mYP, InterfaceC1398220mUO {
    @Override // X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i) {
        return C635990Ox3.LIZ(this, c1398410mUh, aweme, i);
    }

    @Override // X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i, C19EG c19eg) {
        return C635990Ox3.LIZIZ(this, i, c19eg);
    }

    @Override // X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
        return C635990Ox3.LIZJ(this, i, c19eg, interfaceC214902198i);
    }

    @Override // X.InterfaceC1400710mYP
    public boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    @Override // X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
        C635990Ox3.LJFF(this, str);
    }

    @Override // X.InterfaceC1400710mYP
    public boolean sendCustomRequest(C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims, int i) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005b  */
    @Override // X.InterfaceC1400710mYP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C1398410mUh getJumpToVideoParam(X.C1398410mUh r6, com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1398320mUY.getJumpToVideoParam(X.0mUh, com.ss.android.ugc.aweme.feed.model.Aweme):X.0mUh");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClickBottomDesc(com.ss.android.ugc.aweme.feed.model.Aweme r68, android.view.View r69) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1398320mUY.onClickBottomDesc(com.ss.android.ugc.aweme.feed.model.Aweme, android.view.View):void");
    }

    public void onClickTopDesc(Aweme aweme, View view) {
        int iNH1;
        int i;
        String mid;
        String strYq0;
        String strTW0;
        List<MusicAwemeList.MDPDetailInfo> list;
        MusicModel musicModelConvertToMusicModel;
        MusicAwemeList musicAwemeListNC2;
        IMDPAwemeListAbility iMDPAwemeListAbility;
        MusicAwemeList musicAwemeListNC22;
        List<Aweme> list2;
        if (aweme == null) {
            return;
        }
        String idStr = null;
        IMDPMobAbility iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null);
        int i2 = -1;
        if (iMDPMobAbility != null) {
            iNH1 = iMDPMobAbility.nH1();
        } else {
            iNH1 = -1;
        }
        if (iNH1 != 0) {
            if (iNH1 != 1) {
                i = 0;
            } else {
                i = 3;
            }
        } else {
            i = 2;
        }
        C632130Oqp.LIZ.getClass();
        C632130Oqp.LIZJ();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://music/detail/");
        Music music = aweme.getMusic();
        if (music != null) {
            mid = music.getMid();
        } else {
            mid = null;
        }
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, mid);
        smartRouteBuildRoute.withParam("extra_music_from", "");
        smartRouteBuildRoute.withParam("process_id", UUID.randomUUID().toString());
        smartRouteBuildRoute.withParam("enter_music_from_pre_page", aweme.getMusic());
        smartRouteBuildRoute.withParam("author_id", AwemeExtKt.getAuthorUid(aweme));
        smartRouteBuildRoute.withParam("extra_music_from", "single_song");
        smartRouteBuildRoute.withParam("enter_method", "click_followup_square_rec_title");
        smartRouteBuildRoute.withParam("aweme_id", aweme.getAid());
        smartRouteBuildRoute.withParam("aweme_type", aweme.getAwemeType());
        smartRouteBuildRoute.withParam("transport_mdp_square_action_position", i);
        IMDPMobAbility iMDPMobAbility2 = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null);
        if (iMDPMobAbility2 == null || (strYq0 = iMDPMobAbility2.yq0(aweme)) == null) {
            strYq0 = "music";
        }
        smartRouteBuildRoute.withParam("followup_square_rec_type", strYq0);
        IMDPMobAbility iMDPMobAbility3 = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null);
        if (iMDPMobAbility3 != null) {
            strTW0 = iMDPMobAbility3.TW0(view.getContext(), aweme);
        } else {
            strTW0 = null;
        }
        smartRouteBuildRoute.withParam("followup_square_rec_reason", strTW0);
        if (AwemeExtKt.isMDPSquareType(aweme) && (iMDPAwemeListAbility = (IMDPAwemeListAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPAwemeListAbility.class, null)) != null && (musicAwemeListNC22 = iMDPAwemeListAbility.nC2()) != null && (list2 = musicAwemeListNC22.squareItems) != null) {
            Iterator<Aweme> it2 = list2.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it2.next().getAid(), aweme.getAid())) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            smartRouteBuildRoute.withParam("followup_square_video_rank", i2 + 1);
        }
        smartRouteBuildRoute.open();
        IMDPAwemeListAbility iMDPAwemeListAbility2 = (IMDPAwemeListAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPAwemeListAbility.class, null);
        if (iMDPAwemeListAbility2 != null && (musicAwemeListNC2 = iMDPAwemeListAbility2.nC2()) != null) {
            list = musicAwemeListNC2.detailInfos;
        } else {
            list = null;
        }
        Context context = view.getContext();
        Map<Integer, Integer> map = MusicSquareViewHolder.LLLIZZ;
        Context context2 = view.getContext();
        Music music2 = aweme.getMusic();
        if (music2 != null) {
            musicModelConvertToMusicModel = music2.convertToMusicModel();
        } else {
            musicModelConvertToMusicModel = null;
        }
        C1398280mUU.LJIILIIL(context, aweme, 110006, list, C1419640n2w.LIZ(context2, musicModelConvertToMusicModel));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(0, "is_from_followup_square_original_video");
        c2344009Gk.LIZJ(i, "followup_square_action_position");
        c2344009Gk.LJFF("enter_from", "single_song");
        c2344009Gk.LJFF("enter_method", "click_followup_square_rec_title");
        Music music3 = aweme.getMusic();
        if (music3 != null) {
            idStr = music3.getIdStr();
        }
        c2344009Gk.LJFF("music_id", idStr);
        c2344009Gk.LJFF("group_id", aweme.getAid());
        C20684815ws.LJIILLIIL("enter_music_detail", c2344009Gk.LIZ);
    }

    public C1398330mUZ getShootEvent(Aweme aweme, View view, String str) {
        String strV72;
        String strYq0;
        String strTW0;
        String strC2;
        String strIl1;
        String aid;
        String strCarryMetaSongId;
        String idStr;
        String strCarryEffectId;
        String strCarryTemplateId;
        MusicAwemeList musicAwemeListNC2;
        List<Aweme> list;
        String aid2;
        Music music;
        Music music2;
        Music music3;
        Music music4;
        IMDPMobAbility iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPMobAbility.class, null);
        C1398330mUZ c1398330mUZ = new C1398330mUZ();
        if (iMDPMobAbility != null) {
            strV72 = iMDPMobAbility.V72(aweme);
        } else {
            strV72 = null;
        }
        c1398330mUZ.LJIILLIIL = strV72;
        int i = 0;
        c1398330mUZ.LJIIZILJ = 0;
        if (iMDPMobAbility != null) {
            strYq0 = iMDPMobAbility.yq0(aweme);
        } else {
            strYq0 = null;
        }
        c1398330mUZ.LJIJ = strYq0;
        if (iMDPMobAbility != null) {
            strTW0 = iMDPMobAbility.TW0(view.getContext(), aweme);
        } else {
            strTW0 = null;
        }
        c1398330mUZ.LJIJI = strTW0;
        if (iMDPMobAbility != null) {
            strC2 = iMDPMobAbility.C2();
        } else {
            strC2 = null;
        }
        c1398330mUZ.LJIJJLI = strC2;
        if (iMDPMobAbility != null) {
            strIl1 = iMDPMobAbility.il1();
        } else {
            strIl1 = null;
        }
        c1398330mUZ.LJIL = strIl1;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c1398330mUZ.LJJ = aid;
        if (C123100dR.LIZ(str)) {
            c1398330mUZ.LJJI = str;
        }
        if (aweme != null && (music4 = aweme.getMusic()) != null) {
            strCarryMetaSongId = music4.carryMetaSongId();
        } else {
            strCarryMetaSongId = null;
        }
        c1398330mUZ.LJJIFFI = strCarryMetaSongId;
        if (aweme != null && (music3 = aweme.getMusic()) != null) {
            idStr = music3.getIdStr();
        } else {
            idStr = null;
        }
        c1398330mUZ.LJJII = idStr;
        if (aweme != null && (music2 = aweme.getMusic()) != null) {
            strCarryEffectId = music2.carryEffectId();
        } else {
            strCarryEffectId = null;
        }
        c1398330mUZ.LJJIII = strCarryEffectId;
        if (aweme != null && (music = aweme.getMusic()) != null) {
            strCarryTemplateId = music.carryTemplateId();
        } else {
            strCarryTemplateId = null;
        }
        c1398330mUZ.LJJIIJ = strCarryTemplateId;
        c1398330mUZ.LJJIIJZLJL = "single_song";
        c1398330mUZ.LJJIIZ = "followup_square";
        c1398330mUZ.LJJIIZI = "followup_square";
        IMDPAwemeListAbility iMDPAwemeListAbility = (IMDPAwemeListAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPAwemeListAbility.class, null);
        if (iMDPAwemeListAbility != null && (musicAwemeListNC2 = iMDPAwemeListAbility.nC2()) != null && (list = musicAwemeListNC2.squareItems) != null) {
            Iterator<Aweme> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String aid3 = it2.next().getAid();
                    if (aweme != null) {
                        aid2 = aweme.getAid();
                    } else {
                        aid2 = null;
                    }
                    if (Intrinsics.LJFF(aid3, aid2)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i + 1);
            if (numValueOf != null) {
                c1398330mUZ.LJIJJ = Integer.valueOf(numValueOf.intValue());
            }
        }
        return c1398330mUZ;
    }

    @Override // X.InterfaceC1400710mYP
    public AbstractC1261240ivS onCreateDetailAwemeViewHolder(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
        return new MusicSquareViewHolder(view, str, interfaceC1260110itd, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x013d  */
    @Override // X.InterfaceC1400710mYP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void interceptSmartRoute(android.view.View r6, int r7, com.bytedance.router.SmartRoute r8, com.ss.android.ugc.aweme.feed.model.Aweme r9, X.C1398410mUh r10) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1398320mUY.interceptSmartRoute(android.view.View, int, com.bytedance.router.SmartRoute, com.ss.android.ugc.aweme.feed.model.Aweme, X.0mUh):void");
    }
}
