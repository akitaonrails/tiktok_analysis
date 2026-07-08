package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserGuideInfo;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS641S0100000_27;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857340yQu extends LinearLayout {
    public final C421120GfG LL;
    public final List<C421120GfG> LLILLJJLI;
    public final LinearLayout LLILLL;
    public final View LLILZ;
    public int LLILZIL;
    public Message LLILZLL;
    public TakoUserGuideInfo LLIZ;
    public boolean LLIZLLLIL;
    public final Activity LLJ;
    public final List<String> LLJI;
    public final Map<Integer, String> LLJIJIL;
    public final AwS641S0100000_27 LLJILJIL;
    public final AwS640S0100000_26 LLJILJILJ;

    public final AIBotInfo getBotInfo() {
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        C13LC<C1863850ybP> c13lcT713;
        C1863850ybP c1863850ybP3;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoContextAbility.class, null);
        long j = (iTakoContextAbility == null || (c13lcT713 = iTakoContextAbility.T71()) == null || (c1863850ybP3 = (C1863850ybP) c13lcT713.LIZIZ()) == null) ? 0L : c1863850ybP3.LLJJ;
        ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoContextAbility.class, null);
        int i = (iTakoContextAbility2 == null || (c13lcT712 = iTakoContextAbility2.T71()) == null || (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) == null) ? 0 : c1863850ybP2.LLJJI;
        ITakoContextAbility iTakoContextAbility3 = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoContextAbility.class, null);
        if (iTakoContextAbility3 == null || (c13lcT71 = iTakoContextAbility3.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null || (str = c1863850ybP.LLJJIII) == null) {
            str = "";
        }
        return new AIBotInfo(j, str, null, i, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388596, null);
    }

    public final Map<String, String> getCommonParams() {
        Map<String, String> commonParams;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoContextAbility.class, null);
        return (iTakoContextAbility == null || (commonParams = iTakoContextAbility.getCommonParams()) == null) ? new LinkedHashMap() : commonParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1857340yQu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = 1;
        this.LLIZLLLIL = true;
        this.LLJ = C1388190mED.LIZ(context);
        this.LLJI = new ArrayList();
        this.LLJIJIL = C2097608Jq.LJIIIIZZ(new Pair(0, "takoNewUserLanding_takoChatwindow_chatIntroDialogue_menuItem1"), new Pair(1, "takoNewUserLanding_takoChatwindow_chatIntroDialogue_menuItem2"), new Pair(2, "takoNewUserLanding_takoChatwindow_chatIntroDialogue_menuItem3"), new Pair(3, "takoNewUserLanding_takoChatwindow_chatIntroDialogue_menuItem4"));
        this.LLJILJIL = new AwS641S0100000_27(this, 101);
        this.LLJILJILJ = new AwS640S0100000_26(this, 103);
        View viewSd = C786410Ut5.Sd(R.layout.fq_, C786410Ut5.ne(context), this);
        this.LLILZ = viewSd;
        View viewFindViewById = viewSd.findViewById(R.id.l0r);
        View viewFindViewById2 = viewSd.findViewById(R.id.l0s);
        View viewFindViewById3 = viewSd.findViewById(R.id.l0t);
        C421120GfG c421120GfG = (C421120GfG) viewSd.findViewById(R.id.l0u);
        this.LL = c421120GfG;
        this.LLILLJJLI = C1697810uHb.LJIILJJIL(viewFindViewById, viewFindViewById2, viewFindViewById3, c421120GfG);
        this.LLILLL = (LinearLayout) viewSd.findViewById(R.id.t6b);
    }

    public final void LIZ(int i, int i2, String str) {
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("source", "3"));
        if (i2 == 0 || i2 == 1) {
            mapLJIIJ.put("interaction_name", str);
            mapLJIIJ.put("rank", String.valueOf(i));
            if (i2 == 0) {
                C1862330yYx.LIZ.mobTikbotQuickInteractionShow(mapLJIIJ, getCommonParams());
                return;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                Map<String, String> commonParams = getCommonParams();
                c1862330yYx.getClass();
                C20235014Fo c20235014Fo = C1862330yYx.LIZLLL;
                JSONObject jSONObject = new JSONObject();
                C1862330yYx.LLII(jSONObject, commonParams);
                C1862330yYx.LLII(jSONObject, mapLJIIJ);
                c20235014Fo.LIZIZ("tikbot_quick_interaction_renew", jSONObject);
                return;
            }
            return;
        }
        C1862330yYx.LIZ.mobTikbotQuickInteractionClick(mapLJIIJ, getCommonParams(), null);
    }
}
