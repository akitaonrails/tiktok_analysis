package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1687370u0l extends C2217421BqW implements Function1<EnumC1679580toC, Unit> {
    public C1687370u0l(TakoAIVideoInputAssem takoAIVideoInputAssem) {
        super(1, takoAIVideoInputAssem, TakoAIVideoInputAssem.class, "trackSwitchInputModeClick", "trackSwitchInputModeClick(Lcom/ss/android/ugc/aweme/tako/aivideo/detail/vm/AIVideoBottomTextInputViewModel$InputMode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC1679580toC enumC1679580toC) {
        String str;
        Aweme awemeLJIIIIZZ;
        String takoSessionId;
        String takoVideoSessionId;
        String aid;
        String authorUid;
        String string;
        Fragment fragment;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        TakoAIVideoInputAssem takoAIVideoInputAssem = (TakoAIVideoInputAssem) this.receiver;
        takoAIVideoInputAssem.getClass();
        int i = C1679610toF.LIZ[enumC1679580toC.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new C1954807lC();
                }
                return Unit.LIZ;
            }
            str = "voice";
        } else {
            str = "input";
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(takoAIVideoInputAssem);
        if (c19egLIZ != null) {
            C2189821An6 c2189821An6LIZ = C0SUC.LIZ(c19egLIZ);
            DetailNavArgModel navArgModel = c2189821An6LIZ.getNavArgModel();
            Object objAp = takoAIVideoInputAssem.ap();
            if ((objAp instanceof Fragment) && (fragment = (Fragment) objAp) != null && (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment)) != null) {
                awemeLJIIIIZZ = iFeedPanelPlatformAbilityLIZJ.LJIIIIZZ();
            } else {
                awemeLJIIIIZZ = null;
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String eventType = c2189821An6LIZ.getEventType();
            if (eventType == null) {
                eventType = "";
            }
            String strI7 = takoAIVideoInputAssem.ap().i7();
            String processId = c2189821An6LIZ.getProcessId();
            if (navArgModel != null) {
                takoSessionId = navArgModel.getTakoSessionId();
                takoVideoSessionId = navArgModel.getTakoVideoSessionId();
            } else {
                takoSessionId = null;
                takoVideoSessionId = null;
            }
            Integer numVo = takoAIVideoInputAssem.Vo();
            if (awemeLJIIIIZZ != null) {
                aid = awemeLJIIIIZZ.getAid();
                authorUid = AwemeExtKt.getAuthorUid(awemeLJIIIIZZ);
                string = Integer.valueOf(awemeLJIIIIZZ.getAwemeType()).toString();
            } else {
                aid = null;
                authorUid = null;
                string = null;
            }
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", eventType), new Pair("enter_method", strI7), new Pair("process_id", processId), new Pair("source", "tako_video"), new Pair("button_type", str));
            if (takoSessionId != null && takoSessionId.length() > 0) {
                mapLJIIJ.put("tako_session_id", takoSessionId);
            }
            if (takoVideoSessionId != null && takoVideoSessionId.length() > 0) {
                mapLJIIJ.put("video_session_id", takoVideoSessionId);
            }
            if (numVo != null) {
                mapLJIIJ.put("video_rank", String.valueOf(numVo.intValue()));
            }
            if (aid != null && aid.length() > 0) {
                mapLJIIJ.put("group_id", aid);
            }
            if (authorUid != null && authorUid.length() > 0) {
                mapLJIIJ.put("author_id", authorUid);
            }
            if (string != null && string.length() > 0) {
                mapLJIIJ.put("aweme_type", string);
            }
            c20235014FoLIZ.LIZ("tikbot_input_button_click", mapLJIIJ);
        }
        return Unit.LIZ;
    }
}
