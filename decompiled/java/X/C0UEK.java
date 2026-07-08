package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.model.message.AnchorToolModification;
import com.bytedance.android.livesdk.model.message.AnchorToolModificationMessage;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.EffectInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UEK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UEK extends C0JSV<C0JSP> implements OnMessageListener {
    public static final Map<String, C0UEM> LLILLL = new LinkedHashMap();
    public final DataChannel LL;
    public IMessageManager LLILLJJLI;

    @Override // X.C0JSV
    public final void detachView() {
        String strZe0;
        Long l;
        super.detachView();
        for (Map.Entry entry : ((LinkedHashMap) LLILLL).entrySet()) {
            AnchorToolModification anchorToolModification = ((C0UEM) entry.getValue()).LIZ;
            if (anchorToolModification == null) {
                C0UEM c0uem = (C0UEM) entry.getValue();
                if (c0uem.LIZIZ != null) {
                    long jUptimeMillis = SystemClock.uptimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    EffectInfo effectInfo = c0uem.LIZIZ;
                    String strValueOf = String.valueOf(effectInfo.userId + effectInfo.effectId);
                    HashMap map = new HashMap();
                    map.put("watch_effect_scene", c0uem.LIZLLL);
                    map.put("watch_user_type", c0uem.LJ);
                    map.put("sticker_id", String.valueOf(c0uem.LIZIZ.effectId));
                    C0UEM c0uem2 = (C0UEM) ((LinkedHashMap) LLILLL).get(strValueOf);
                    map.put("duration", String.valueOf(jUptimeMillis - (c0uem2 != null ? c0uem2.LIZJ : jUptimeMillis)));
                    LJJJJLI("audience_sticker_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_1000()), map);
                }
            } else {
                HashMap map2 = new HashMap();
                long jUptimeMillis2 = SystemClock.uptimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                map2.put("resource_id", anchorToolModification.resourceId);
                map2.put("sticker_id", String.valueOf(anchorToolModification.effectId));
                map2.put("sticker_name", anchorToolModification.name);
                long j = anchorToolModification.userId;
                C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
                map2.put("watch_user_type", (c0ir5 == null || (l = c0ir5.LIZLLL) == null || j != l.longValue()) ? "connection_user" : "anchor");
                Long lValueOf = Long.valueOf(anchorToolModification.effectId);
                if (lValueOf.longValue() != 0) {
                    String strValueOf2 = String.valueOf(anchorToolModification.userId + lValueOf.longValue());
                    LinkedHashMap linkedHashMap = (LinkedHashMap) LLILLL;
                    C0UEM c0uem3 = (C0UEM) linkedHashMap.get(strValueOf2);
                    map2.put("duration", String.valueOf(jUptimeMillis2 - (c0uem3 != null ? c0uem3.LIZJ : jUptimeMillis2)));
                    C0UEM c0uem4 = (C0UEM) linkedHashMap.get(strValueOf2);
                    if (c0uem4 == null || (strZe0 = c0uem4.LIZLLL) == null) {
                        strZe0 = ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).Ze0();
                    }
                    map2.put("watch_effect_scene", strZe0);
                    LJJJJLI("audience_sticker_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_1000()), map2);
                }
            }
        }
        ((LinkedHashMap) LLILLL).clear();
        IMessageManager iMessageManager = this.LLILLJJLI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.ANCHOR_TOOL_MODIFICATION_MESSAGE.getIntType(), this);
        }
    }

    public C0UEK(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    @Override // X.C0JSV
    public final void attachView(C0JSP c0jsp) {
        IMessageManager iMessageManager;
        super.attachView(c0jsp);
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LLILLJJLI = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.ANCHOR_TOOL_MODIFICATION_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        long j;
        String str2;
        Long l;
        if (iMessage != null && (iMessage instanceof AnchorToolModificationMessage)) {
            AnchorToolModificationMessage anchorToolModificationMessage = (AnchorToolModificationMessage) iMessage;
            if (anchorToolModificationMessage.getMessageType() == C001A.ANCHOR_TOOL_MODIFICATION_MESSAGE) {
                AnchorToolModification anchorToolModification = anchorToolModificationMessage.modification;
                long jUptimeMillis = SystemClock.uptimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                String strZe0 = ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).Ze0();
                long j2 = anchorToolModification.userId;
                C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
                if (c0ir5 != null && (l = c0ir5.LIZLLL) != null && j2 == l.longValue()) {
                    str = "anchor";
                } else {
                    str = "connection_user";
                }
                HashMap map = new HashMap();
                map.put("resource_id", anchorToolModification.resourceId);
                map.put("sticker_id", String.valueOf(anchorToolModification.effectId));
                map.put("sticker_name", anchorToolModification.name);
                map.put("watch_user_type", str);
                Long lValueOf = Long.valueOf(anchorToolModification.effectId);
                if (lValueOf.longValue() != 0 && 1 != 0) {
                    String strValueOf = String.valueOf(anchorToolModification.userId + lValueOf.longValue());
                    if (anchorToolModification.endTime > 0) {
                        Map<String, C0UEM> map2 = LLILLL;
                        LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
                        C0UEM c0uem = (C0UEM) linkedHashMap.get(strValueOf);
                        if (c0uem != null) {
                            j = c0uem.LIZJ;
                        } else {
                            j = jUptimeMillis;
                        }
                        map.put("duration", String.valueOf(jUptimeMillis - j));
                        C0UEM c0uem2 = (C0UEM) linkedHashMap.get(strValueOf);
                        if (c0uem2 != null && (str2 = c0uem2.LIZLLL) != null) {
                            strZe0 = str2;
                        }
                        map.put("watch_effect_scene", strZe0);
                        LJJJJLI("audience_sticker_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_1000()), map);
                        map2.remove(strValueOf);
                        return;
                    }
                    map.put("watch_effect_scene", strZe0);
                    LJJJJLI("audience_sticker_show", null, map);
                    LLILLL.put(strValueOf, new C0UEM(anchorToolModification, null, jUptimeMillis, strZe0, str));
                }
            }
        }
    }

    public static void LJJJJLI(String str, Double d, Map map) {
        C474500IjA c474500IjALIZ;
        if (Intrinsics.LJFF(str, "audience_sticker_duration")) {
            c474500IjALIZ = C0IJT.LIZIZ(str, d);
        } else {
            c474500IjALIZ = C0IJT.LIZ(str);
        }
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
