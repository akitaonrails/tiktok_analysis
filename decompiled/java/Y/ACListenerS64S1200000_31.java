package Y;

import X.AbstractC848400XPy;
import X.C08JS;
import X.C0XQ7;
import X.C1389890mGx;
import X.C15O7;
import X.C20610815kw;
import X.C20611415l2;
import X.C20611715l5;
import X.C20661815tA;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C317050Cbn;
import X.C317060Cbo;
import X.C737520SwQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC435390H5l;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.s;
import com.ss.android.ugc.aweme.mention.ui.cell.VideoCaptionMentionRecommendCell;
import com.ss.android.ugc.aweme.mention.ui.cell.VideoCaptionMentionSearchCell;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.page.shortcut.ShortcutManagerSettingPage;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS114S1200000_31;
import kotlin.jvm.internal.AwS145S1100000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS610S0100000_31;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class ACListenerS64S1200000_31 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS64S1200000_31 aCListenerS64S1200000_31, View view) throws JSONException {
        String socialInfo;
        Set<Map.Entry<String, k>> setEntrySet;
        VideoCaptionMentionRecommendCell videoCaptionMentionRecommendCell = (VideoCaptionMentionRecommendCell) aCListenerS64S1200000_31.l1;
        C20611415l2 c20611415l2 = ((C317050Cbn) aCListenerS64S1200000_31.l2).LL;
        videoCaptionMentionRecommendCell.getClass();
        User userLIZJ = C20611715l5.LIZJ(c20611415l2);
        AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(c20611415l2, 10);
        JSONObject jSONObject = new JSONObject();
        awS610S0100000_31.invoke(jSONObject);
        String socialInfo2 = userLIZJ.getSocialInfo();
        if (socialInfo2 != null && socialInfo2.length() != 0) {
            socialInfo = userLIZJ.getSocialInfo();
        } else {
            MatchedFriendStruct matchedFriendStruct = userLIZJ.getMatchedFriendStruct();
            if (matchedFriendStruct == null || (socialInfo = matchedFriendStruct.socialInfo) == null) {
                socialInfo = "";
            }
        }
        try {
            n nVar = (n) C08JS.LIZ(socialInfo, n.class);
            if (nVar != null && (setEntrySet = nVar.entrySet()) != null) {
                Iterator<T> it2 = setEntrySet.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("social_info_");
                    sbLIZ.append((String) entry.getKey());
                    jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), ((k) entry.getValue()).LJIL());
                }
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C15O7.LIZJ(new ACallableS58S1100000_3(jSONObject, 2));
        if (!((C317050Cbn) aCListenerS64S1200000_31.l2).LL.LJIJJ.LIZ) {
            C1389890mGx c1389890mGx = new C1389890mGx(((VideoCaptionMentionRecommendCell) aCListenerS64S1200000_31.l1).itemView);
            c1389890mGx.LJIIIZ(2131837169);
            c1389890mGx.LJIIJJI();
        } else if (!TextUtils.equals(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), ((C317050Cbn) aCListenerS64S1200000_31.l2).LL.LIZ)) {
            AssemVMLazy assemVMLazy = ((VideoCaptionMentionRecommendCell) aCListenerS64S1200000_31.l1).LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoCaptionMentionRecommendCell.LLILLL;
            assemVMLazy.getValue().setState(new AwS583S0100000_4(((C317050Cbn) aCListenerS64S1200000_31.l2).LL, 224));
        } else {
            C1389890mGx c1389890mGx2 = new C1389890mGx(((VideoCaptionMentionRecommendCell) aCListenerS64S1200000_31.l1).itemView);
            c1389890mGx2.LJIIIZ(2131838147);
            c1389890mGx2.LJIIJJI();
        }
        VideoCaptionMentionRecommendCell videoCaptionMentionRecommendCell2 = (VideoCaptionMentionRecommendCell) aCListenerS64S1200000_31.l1;
        C20611415l2 c20611415l22 = ((C317050Cbn) aCListenerS64S1200000_31.l2).LL;
        String str = aCListenerS64S1200000_31.s0;
        videoCaptionMentionRecommendCell2.getClass();
        C737520SwQ.LIZ("tag_mention_head_click", new AwS145S1100000_31(c20611415l22, str, 0));
    }

    public static final void onClick$1(ACListenerS64S1200000_31 aCListenerS64S1200000_31, View view) {
        C20611415l2 c20611415l2 = ((C317060Cbo) aCListenerS64S1200000_31.l1).LL;
        if (!c20611415l2.LJIJJ.LIZ) {
            C1389890mGx c1389890mGx = new C1389890mGx(((VideoCaptionMentionSearchCell) aCListenerS64S1200000_31.l2).itemView);
            c1389890mGx.LJIIIZ(2131837169);
            c1389890mGx.LJIIJJI();
        } else {
            VideoCaptionMentionSearchCell videoCaptionMentionSearchCell = (VideoCaptionMentionSearchCell) aCListenerS64S1200000_31.l2;
            videoCaptionMentionSearchCell.getClass();
            C737520SwQ.LIZ("add_video_at", new AwS397S0200000_31(videoCaptionMentionSearchCell, c20611415l2, 3));
            VideoCaptionMentionSearchCell videoCaptionMentionSearchCell2 = (VideoCaptionMentionSearchCell) aCListenerS64S1200000_31.l2;
            C20611415l2 c20611415l22 = ((C317060Cbo) aCListenerS64S1200000_31.l1).LL;
            videoCaptionMentionSearchCell2.getClass();
            C737520SwQ.LIZ("trending_words_click", new AwS397S0200000_31(videoCaptionMentionSearchCell2, c20611415l22, 4));
            if (!TextUtils.equals(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), ((C317060Cbo) aCListenerS64S1200000_31.l1).LL.LIZ)) {
                ((VideoCaptionMentionSearchCell) aCListenerS64S1200000_31.l2).I5().setState(new AwS583S0100000_4(((C317060Cbo) aCListenerS64S1200000_31.l1).LL, 225));
            } else {
                C1389890mGx c1389890mGx2 = new C1389890mGx(((VideoCaptionMentionSearchCell) aCListenerS64S1200000_31.l2).itemView);
                c1389890mGx2.LJIIIZ(2131838147);
                c1389890mGx2.LJIIJJI();
            }
        }
        C20610815kw.LIZ.getClass();
        C20610815kw.LIZLLL = true;
        VideoCaptionMentionSearchCell videoCaptionMentionSearchCell3 = (VideoCaptionMentionSearchCell) aCListenerS64S1200000_31.l2;
        C20611415l2 c20611415l23 = ((C317060Cbo) aCListenerS64S1200000_31.l1).LL;
        String str = aCListenerS64S1200000_31.s0;
        videoCaptionMentionSearchCell3.getClass();
        C737520SwQ.LIZ("tag_mention_head_click", new AwS114S1200000_31(c20611415l23, str, videoCaptionMentionSearchCell3, 0));
        C737520SwQ.LIZ("social_search_result_select", new AwS397S0200000_31(videoCaptionMentionSearchCell3, c20611415l23, 2));
    }

    public static final void onClick$2(ACListenerS64S1200000_31 aCListenerS64S1200000_31, View view) {
        ShortcutManagerSettingPage shortcutManagerSettingPage = (ShortcutManagerSettingPage) aCListenerS64S1200000_31.l1;
        String str = aCListenerS64S1200000_31.s0;
        shortcutManagerSettingPage.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("click_type", "add");
        c2344009Gk.LJFF("enter_from", "settings_and_privacy");
        c2344009Gk.LJFF("panel_type", str);
        C20684815ws.LJIILLIIL("add_home_screen_icon_panel", c2344009Gk.LIZ);
        Context context = ((ShortcutManagerSettingPage) aCListenerS64S1200000_31.l1).getContext();
        if (context == null) {
            return;
        }
        ((InterfaceC435390H5l) aCListenerS64S1200000_31.l2).LIZ(context, "settings_and_privacy", new C20661815tA((ShortcutManagerSettingPage) aCListenerS64S1200000_31.l1, aCListenerS64S1200000_31.s0));
    }

    public ACListenerS64S1200000_31(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
