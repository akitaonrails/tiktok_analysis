package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ka3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519810Ka3 extends AbstractC519820Ka4 {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int i;
        JSONObject json = xBaseParamModel.toJSON();
        int iOptInt = json.optInt("default_panel", 0);
        String strOptString = json.optString("show_entrance", "");
        String strOptString2 = json.optString("auto_fill_text", "");
        String strOptString3 = json.optString("mode", "");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("track_info");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        boolean zOptBoolean = json.optBoolean("close_profile", false);
        Pair<List<EmoteModel>, List<EmoteWithIndex>> pairDM2 = ((IStarCommentService) C1161920gLG.LIZJ(IStarCommentService.class)).dM2(json.optString("emotes", ""));
        if (iOptInt != 0) {
            if (iOptInt != 1) {
                if (iOptInt != 2) {
                    if (strOptString == null || a0.LJJJIL(strOptString)) {
                        strOptString = "subscription_benefits_to_do";
                    }
                    i = 0;
                } else {
                    if (strOptString == null || a0.LJJJIL(strOptString)) {
                        strOptString = "benefits_emote_icon";
                    }
                    i = 4;
                }
            } else {
                if (strOptString == null || a0.LJJJIL(strOptString)) {
                    strOptString = "benefits_comment_icon";
                }
                i = 6;
            }
        } else {
            if (strOptString == null || a0.LJJJIL(strOptString)) {
                strOptString = "benefits_comment_icon";
            }
            if (strOptString2.length() <= 0) {
                i = 0;
            } else {
                i = 3;
            }
        }
        if (Intrinsics.LJFF(strOptString, "fans_club_task")) {
            C500260Jjc.LJJLIIIJILLIZJL(AFwS193S0000000_7.get$arr$(233));
        }
        if (zOptBoolean) {
            C500260Jjc.LJJLIIIJILLIZJL(AFwS193S0000000_7.get$arr$(234));
        }
        if (!pairDM2.getFirst().isEmpty()) {
            C1110530f0N c1110530f0N = new C1110530f0N(strOptString2, strOptString, jSONObjectOptJSONObject, pairDM2.getSecond(), i);
            C0KBS c0kbs = C0KBS.LIZ;
            C0KBS.LJI(pairDM2.getFirst(), C497740JfY.LJIILJJIL(), true, -1, ((EmoteModel) ListProtector.get(pairDM2.getFirst(), 0)).packageId, "live_room_message_list", new AwS551S0100000_7(c1110530f0N, 570));
        } else {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS551S0100000_7(new C1110530f0N(i, strOptString2, strOptString, strOptString3, jSONObjectOptJSONObject), 571));
        }
        InterfaceC519830Ka5 interfaceC519830Ka5 = (InterfaceC519830Ka5) C1909107dp.LIZJ(InterfaceC519830Ka5.class, null);
        interfaceC519830Ka5.setCode(1);
        completionBlock.onSuccess(interfaceC519830Ka5, "");
    }
}
