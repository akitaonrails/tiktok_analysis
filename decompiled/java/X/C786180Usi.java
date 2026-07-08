package X;

import Y.AObserverS216S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordRecommend;
import com.bytedance.android.livesdk.adminsetting.LiveAddHotCommentMuteRuleSheet;
import com.bytedance.android.livesdk.adminsetting.LiveCommentEducationBlockKeywordsFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveMuteSuggestFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.MarkViewerNotionFragment;
import com.bytedance.android.livesdk.adminsetting.fastfiltercomment.FastFilterCommentFragmentSheet;
import com.bytedance.android.livesdk.broadcast.interaction.function.perception.LivePerceptionLiveSheetFragment;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCommentBlockUrlSettingSevenPercent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0Usi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786180Usi implements C092O {
    public final int $t;
    public Object l0;

    @Override // X.C092O
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
        }
    }

    public C786180Usi(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(C786180Usi c786180Usi, Object obj) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C750770Tch((LiveAddHotCommentMuteRuleSheet) c786180Usi.l0, null), 2);
    }

    public static final void accept$1(C786180Usi c786180Usi, Object obj) {
        int size;
        ((LiveCommentEducationBlockKeywordsFragmentSheet) c786180Usi.l0).uS().LIZ();
        LiveCommentEducationBlockKeywordsFragmentSheet liveCommentEducationBlockKeywordsFragmentSheet = (LiveCommentEducationBlockKeywordsFragmentSheet) c786180Usi.l0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LiveCommentEducationBlockKeywordsFragmentSheet liveCommentEducationBlockKeywordsFragmentSheet2 = (LiveCommentEducationBlockKeywordsFragmentSheet) c786180Usi.l0;
        List<BlockWordRecommend> list = liveCommentEducationBlockKeywordsFragmentSheet2.uS().LIZLLL;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        linkedHashMap.put("keywords_cnt_in", String.valueOf(size));
        linkedHashMap.put("keywords_cnt_out", String.valueOf(liveCommentEducationBlockKeywordsFragmentSheet2.uS().LIZJ()));
        liveCommentEducationBlockKeywordsFragmentSheet.wS("livesdk_comment_add_to_blocked_keywords_popup_click_add", linkedHashMap, ((LiveCommentEducationBlockKeywordsFragmentSheet) c786180Usi.l0).LLLFFI);
    }

    public static final void accept$2(C786180Usi c786180Usi, Object obj) {
        int size;
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        Context context = ((LiveCommentEducationBlockKeywordsFragmentSheet) c786180Usi.l0).getContext();
        if (context != null) {
            iActionHandlerService.handle(context, LiveCommentBlockUrlSettingSevenPercent.INSTANCE.getValue());
            LiveCommentEducationBlockKeywordsFragmentSheet liveCommentEducationBlockKeywordsFragmentSheet = (LiveCommentEducationBlockKeywordsFragmentSheet) c786180Usi.l0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LiveCommentEducationBlockKeywordsFragmentSheet liveCommentEducationBlockKeywordsFragmentSheet2 = (LiveCommentEducationBlockKeywordsFragmentSheet) c786180Usi.l0;
            List<BlockWordRecommend> list = liveCommentEducationBlockKeywordsFragmentSheet2.uS().LIZLLL;
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            linkedHashMap.put("keywords_cnt_in", String.valueOf(size));
            linkedHashMap.put("keywords_cnt_out", String.valueOf(liveCommentEducationBlockKeywordsFragmentSheet2.uS().LIZJ()));
            liveCommentEducationBlockKeywordsFragmentSheet.wS("livesdk_comment_add_to_blocked_keywords_popup_click_learn_more", linkedHashMap, ((LiveCommentEducationBlockKeywordsFragmentSheet) c786180Usi.l0).LLLFFI);
        }
    }

    public static final void accept$3(C786180Usi c786180Usi, Object obj) {
        String string;
        DataChannel dataChannelLJ = C475510Ikn.LJ((LiveMuteSuggestFragmentSheet) c786180Usi.l0);
        if (dataChannelLJ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LiveMuteSuggestFragmentSheet liveMuteSuggestFragmentSheet = (LiveMuteSuggestFragmentSheet) c786180Usi.l0;
            linkedHashMap.put("word", liveMuteSuggestFragmentSheet.LLLFFI.content);
            C745220TLc c745220TLc = liveMuteSuggestFragmentSheet.LLLFF;
            if (c745220TLc == null || (string = Long.valueOf(c745220TLc.LIZ).toString()) == null) {
                string = "";
            }
            linkedHashMap.put("mute_duration", string);
            C01C7.LIZ(dataChannelLJ, "livesdk_comment_autosuggest_mute_rule_add", linkedHashMap);
        }
        LiveMuteSuggestFragmentSheet liveMuteSuggestFragmentSheet2 = (LiveMuteSuggestFragmentSheet) c786180Usi.l0;
        liveMuteSuggestFragmentSheet2.getClass();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(liveMuteSuggestFragmentSheet2), null, null, new C750790Tcj(liveMuteSuggestFragmentSheet2, null), 3);
    }

    public static final void accept$4(C786180Usi c786180Usi, Object obj) {
        ((MarkViewerNotionFragment) c786180Usi.l0).wS("click_got_it");
        ((MarkViewerNotionFragment) c786180Usi.l0).close(1);
    }

    public static final void accept$5(C786180Usi c786180Usi, Object obj) {
        String str;
        FastFilterCommentFragmentSheet fastFilterCommentFragmentSheet = (FastFilterCommentFragmentSheet) c786180Usi.l0;
        C328450CuB c328450CuB = fastFilterCommentFragmentSheet.LLJLLL;
        List<Long> listLJL = null;
        if (c328450CuB != null) {
            c328450CuB.LIZLLL(true, null, new AObserverS216S0100000_12(fastFilterCommentFragmentSheet, 23));
        }
        FastFilterCommentFragmentSheet fastFilterCommentFragmentSheet2 = (FastFilterCommentFragmentSheet) c786180Usi.l0;
        fastFilterCommentFragmentSheet2.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_filter_suggestion_popup_click");
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LJJII(fastFilterCommentFragmentSheet2.LLJZ, "trigger");
        c474500IjALIZ.LJJII(fastFilterCommentFragmentSheet2.LLJZIJLIL, "action");
        long[] jArr = fastFilterCommentFragmentSheet2.LLL;
        if (jArr != null) {
            listLJL = C13LQ.LJL(jArr);
        }
        c474500IjALIZ.LJJII(listLJL, "trigger_comment_id");
        if (((Boolean) fastFilterCommentFragmentSheet2.LLLFF.getValue()).booleanValue()) {
            str = "anchor";
        } else {
            str = "admin";
        }
        c474500IjALIZ.LJJII(str, "admin_type");
        c474500IjALIZ.LJJII(Boolean.valueOf(fastFilterCommentFragmentSheet2.LLLF), "live_room_first_time_see");
        c474500IjALIZ.LJJII(1, "community_flag_filter_status");
        c474500IjALIZ.LIZ();
    }

    public static final void accept$6(C786180Usi c786180Usi, Object obj) {
        ((LivePerceptionLiveSheetFragment) c786180Usi.l0).close(1);
    }
}
