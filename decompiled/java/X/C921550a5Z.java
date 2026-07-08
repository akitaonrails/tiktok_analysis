package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageUser;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0a5Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921550a5Z {
    public static String LIZ(String str, boolean z) {
        LinkLayerRTCMessage linkLayerRTCMessage = new LinkLayerRTCMessage("", null, Long.valueOf(C158B.LIZ()), "", -1L, "", "");
        linkLayerRTCMessage.generateId();
        linkLayerRTCMessage.setMethod("linkMicSDKAudioMute");
        LinkLayerRTCMessageParam linkLayerRTCMessageParam = new LinkLayerRTCMessageParam("", 4, 1, new ArrayList(), null, "", true);
        ArrayList<LinkLayerRTCMessageUser> arrayList = linkLayerRTCMessageParam.users;
        if (arrayList != null) {
            arrayList.add(new LinkLayerRTCMessageUser(str, -1, z ? 1 : 0, z ? 1 : 0));
        }
        linkLayerRTCMessage.setParam(linkLayerRTCMessageParam);
        return GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, linkLayerRTCMessage);
    }
}
