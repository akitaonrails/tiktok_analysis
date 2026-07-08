package X;

import android.text.Spannable;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformBubbleConfig;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import tikcast.api.epiphron.TooltipCheckFeature;
import tikcast.api.epiphron.TooltipDecision;

/* JADX INFO: renamed from: X.0eoT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103150eoT extends AbstractC1097820efs<TooltipCheckFeature, TooltipDecision> {
    public static final boolean LJIIIIZZ;
    public final String LJ;
    public final LiveMessagePlatformBubbleConfig LJFF;
    public final String LJI;
    public final String LJII;

    static {
        LJIIIIZZ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isRegressionTest();
    }

    @Override // X.InterfaceC1097710efh
    public final C1933007hg LIZ() {
        return new C1933007hg();
    }

    @Override // X.AbstractC1097820efs
    public final TypeToken<TooltipDecision> LJIIJ() {
        return TypeToken.get(TooltipDecision.class);
    }

    @Override // X.AbstractC1097820efs
    public final String LJIIIZ() {
        return this.LJII;
    }

    @Override // X.InterfaceC1097710efh
    public final String getStrategyName() {
        return this.LJI;
    }

    @Override // X.InterfaceC1097710efh
    public final void LIZIZ(C1092890eXv c1092890eXv) throws JSONException {
        Object obj;
        String str;
        Object obj2;
        String str2;
        Map<String, Object> map;
        C0J0M c0j0m = c1092890eXv.LIZIZ;
        Object obj3 = null;
        if (c0j0m != null && (map = c0j0m.LJFF) != null) {
            obj = map.get("trigger_feature");
        } else {
            obj = null;
        }
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "";
        }
        C0J0M c0j0m2 = c1092890eXv.LIZIZ;
        if (c0j0m2 != null) {
            obj2 = c0j0m2.LIZIZ;
        } else {
            obj2 = null;
        }
        if (obj2 instanceof Boolean) {
            obj3 = obj2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTrigger, triggerName: ");
        sbLIZ.append(str);
        sbLIZ.append(", value: ");
        sbLIZ.append(obj3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str3 = this.LJ;
        LiveMessagePlatformBubbleConfig liveMessagePlatformBubbleConfig = this.LJFF;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair(Scene.SCENE_SERVICE, "trigger");
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(obj3, bool)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        pairArr[2] = new Pair("trigger_name", str);
        C1096540edo.LIZ(strLIZIZ, str3, liveMessagePlatformBubbleConfig, C2097608Jq.LJIIIIZZ(pairArr));
        if (Intrinsics.LJFF(obj3, bool)) {
            LJIILL(c1092890eXv);
        }
    }

    @Override // X.AbstractC1097820efs
    public final Map LJIIIIZZ(TooltipCheckFeature tooltipCheckFeature) {
        TooltipCheckFeature tooltipCheckFeature2 = tooltipCheckFeature;
        return C2097608Jq.LJIIIIZZ(new Pair("room_id", tooltipCheckFeature2.roomId), new Pair("tooltip_trigger_name", tooltipCheckFeature2.tooltipTriggerName), new Pair("anchor_id", tooltipCheckFeature2.anchorId));
    }

    @Override // X.AbstractC1097820efs
    public final void LJIILIIL(TooltipDecision tooltipDecision) throws JSONException {
        List urls;
        boolean z;
        final TooltipDecision tooltipDecision2 = tooltipDecision;
        final DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            if (tooltipDecision2.showTooltip) {
                final AbstractC1103160eoU abstractC1103160eoUYd1 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Yd1(dataChannel, this.LJ);
                if (abstractC1103160eoUYd1 == null) {
                    C1096540edo.LIZ("onResponse, show fail, reason: tooltipBizHandler is null", this.LJ, this.LJFF, C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "response"), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT), new Pair("reason", "tooltipBizHandler is null")));
                    return;
                }
                View contentView = abstractC1103160eoUYd1.LIZ.getContentView();
                if (contentView == null) {
                    C1096540edo.LIZ("onResponse, show fail, reason: anchorView is null", this.LJ, this.LJFF, C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "response"), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT), new Pair("reason", "anchorView is null")));
                    return;
                }
                if (!abstractC1103160eoUYd1.LJIIIZ(dataChannel, tooltipDecision2)) {
                    C1096540edo.LIZ("onResponse, show fail, reason: tooltipBizHandler decide not to show", this.LJ, this.LJFF, C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "response"), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT), new Pair("reason", "tooltipBizHandler decide not to show")));
                    return;
                }
                Spannable spannableLJIILIIL = C1133830fbx.LJIILIIL(tooltipDecision2.tooltipText, "");
                if (spannableLJIILIIL != null && !a0.LJJJIL(spannableLJIILIIL)) {
                    C785220UrA c785220UrA = new C785220UrA(contentView);
                    c785220UrA.LJIJJ = spannableLJIILIIL;
                    ImageModel imageModel = tooltipDecision2.icon;
                    if (imageModel != null) {
                        urls = imageModel.getUrls();
                    } else {
                        urls = null;
                    }
                    c785220UrA.LJFF(urls);
                    if (tooltipDecision2.iconStyle == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c785220UrA.LJJIIJ = z;
                    c785220UrA.LJIILL = new C1151850g51(tooltipDecision2, dataChannel, abstractC1103160eoUYd1, 5);
                    c785220UrA.LJIILLIIL = new InterfaceC254900yh() { // from class: X.0eoW
                        @Override // X.InterfaceC254900yh
                        public final void x1(int i) {
                            abstractC1103160eoUYd1.LJFF(dataChannel, tooltipDecision2, i);
                        }
                    };
                    C1119590fEz c1119590fEz = new C1119590fEz(c785220UrA);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    abstractC1103160eoUYd1.LIZJ(dataChannel, tooltipDecision2, linkedHashMap);
                    C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                    String str = this.LJ;
                    C1102240en0 c1102240en0 = new C1102240en0(abstractC1103160eoUYd1.LIZ(dataChannel, tooltipDecision2), linkedHashMap);
                    long j = tooltipDecision2.showDurationMs;
                    c1113800f5e.getClass();
                    C1113800f5e.LJFF(c1119590fEz, str, dataChannel, c1102240en0, "", null, 0L, j);
                    C1096540edo.LIZ("onResponse, enqueue success", this.LJ, this.LJFF, C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "response"), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1")));
                    return;
                }
                C1096540edo.LIZ("onResponse, show fail, reason: message is null or blank", this.LJ, this.LJFF, C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "response"), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT), new Pair("reason", "message is null or blank")));
                return;
            }
            C1096540edo.LIZ("onResponse, show fail, reason: showTooltip is false", this.LJ, this.LJFF, C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "response"), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT), new Pair("reason", "showTooltip is false")));
        }
    }

    @Override // X.AbstractC1097820efs
    public final TooltipCheckFeature LJIIJJI(DataChannel dataChannel, C1092890eXv c1092890eXv) {
        String str;
        Map<String, Object> map;
        TooltipCheckFeature tooltipCheckFeature = new TooltipCheckFeature();
        tooltipCheckFeature.roomId = String.valueOf(C500260Jjc.LJJLIIIJ(dataChannel));
        C0J0M c0j0m = c1092890eXv.LIZIZ;
        Object obj = null;
        if (c0j0m != null && (map = c0j0m.LJFF) != null) {
            obj = map.get("trigger_feature");
        }
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "";
        }
        tooltipCheckFeature.tooltipTriggerName = str;
        tooltipCheckFeature.anchorId = String.valueOf(C500260Jjc.LIZIZ(dataChannel));
        return tooltipCheckFeature;
    }

    public C1103150eoT(String str, LiveMessagePlatformBubbleConfig liveMessagePlatformBubbleConfig, String str2, String str3) {
        this.LJ = str;
        this.LJFF = liveMessagePlatformBubbleConfig;
        this.LJI = str2;
        this.LJII = str3;
    }
}
