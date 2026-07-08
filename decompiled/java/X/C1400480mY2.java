package X;

import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel;
import com.ss.android.ugc.aweme.music.ui.IMDPMobAbility;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.ugc.aweme.creation.base.TrackModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mY2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400480mY2 extends C09AY implements Function1<TrackModel, Unit> {
    public final /* synthetic */ MusicShootAssem LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1400480mY2(MusicShootAssem musicShootAssem, boolean z, boolean z2, String str) {
        super(1);
        this.LL = musicShootAssem;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TrackModel trackModel) {
        MusicAwemeList musicAwemeList;
        String strV72;
        MusicAwemeList musicAwemeList2;
        String strYq0;
        String strTW0;
        TrackModel trackModel2 = trackModel;
        trackModel2.setShootWay("share_to_story");
        trackModel2.setEnterFrom("single_song");
        trackModel2.getEnterShootPageExtra().put("single_song_shoot_previous_page", this.LL.LLLLLZ.getValue());
        trackModel2.getEnterShootPageExtra().put("single_song_shoot_previous_enter_method", this.LL.Ip());
        trackModel2.getEnterShootPageExtra().put("previous_search_query", this.LL.Jp());
        Map<String, String> enterShootPageExtra = trackModel2.getEnterShootPageExtra();
        C1399380mWG c1399380mWG = MusicShootAssem.LLZ;
        C291001Au<MusicAwemeList> c291001Au = this.LL.Qp().getState().LL;
        if (c291001Au != null) {
            musicAwemeList = c291001Au.LIZ;
        } else {
            musicAwemeList = null;
        }
        c1399380mWG.getClass();
        enterShootPageExtra.put("is_same_music_supply_detail_page", C1399380mWG.LIZIZ(musicAwemeList));
        String str = "";
        if (this.LLILLJJLI || this.LLILLL) {
            trackModel2.getEnterShootPageExtra().put("need_append_param_sing", "1");
            Map<String, String> enterShootPageExtra2 = trackModel2.getEnterShootPageExtra();
            String str2 = this.LLILZ;
            if (str2 == null) {
                str2 = "";
            }
            enterShootPageExtra2.put("relation_enter_method", str2);
        }
        IMDPMobAbility iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(this.LL.getVAssemScope(), IMDPMobAbility.class, null);
        if (iMDPMobAbility != null) {
            strV72 = iMDPMobAbility.V72(null);
        } else {
            strV72 = null;
        }
        Map<String, String> enterShootPageExtra3 = trackModel2.getEnterShootPageExtra();
        if (strV72 == null) {
            strV72 = "";
        }
        enterShootPageExtra3.put("followup_square_action_position", strV72);
        Map<String, String> enterShootPageExtra4 = trackModel2.getEnterShootPageExtra();
        MusicDetailCommonModel musicDetailCommonModel = MusicDetailCommonModel.INSTANCE;
        C291001Au<MusicAwemeList> c291001Au2 = this.LL.Qp().getState().LL;
        if (c291001Au2 != null) {
            musicAwemeList2 = c291001Au2.LIZ;
        } else {
            musicAwemeList2 = null;
        }
        String strValueOf = String.valueOf(musicDetailCommonModel.isFromFollowupSquareOriginalVideoOnMDP(musicAwemeList2));
        if (strValueOf == null) {
            strValueOf = "";
        }
        enterShootPageExtra4.put("is_from_followup_square_original_video", strValueOf);
        Map<String, String> enterShootPageExtra5 = trackModel2.getEnterShootPageExtra();
        if (iMDPMobAbility == null || (strYq0 = iMDPMobAbility.yq0(null)) == null) {
            strYq0 = "";
        }
        enterShootPageExtra5.put("followup_square_recommend_type", strYq0);
        Map<String, String> enterShootPageExtra6 = trackModel2.getEnterShootPageExtra();
        if (iMDPMobAbility != null && (strTW0 = iMDPMobAbility.TW0(this.LL.getActivity(), null)) != null) {
            str = strTW0;
        }
        enterShootPageExtra6.put("followup_square_recommend_reason", str);
        return Unit.LIZ;
    }
}
