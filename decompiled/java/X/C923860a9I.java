package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0a9I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923860a9I {
    public static final void LIZ(Map map) {
        String strLLJI;
        String resourceId;
        HashMap map2 = (HashMap) map;
        map2.put("enhance_level", String.valueOf(C924790aAn.LIZLLL().LJ));
        if (C924790aAn.LIZLLL().LJFF != null) {
            strLLJI = C924790aAn.LIZLLL().LJFF.LLJI();
            resourceId = C924790aAn.LIZLLL().LJFF.getResourceId();
        } else {
            strLLJI = "";
            resourceId = "";
        }
        map2.put("sticker_id", strLLJI);
        map2.put("sticker_resource_id", resourceId);
    }

    public static final void LIZIZ(Map map) {
        String str;
        if (C924250a9v.LIZ().LJIIIZ) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        ((HashMap) map).put("is_muted", str);
    }

    public static final void LIZJ(Map map) {
        String resourceId;
        String string;
        LiveEffect liveEffect = C924790aAn.LIZLLL().LJFF;
        String str = CardStruct.IStatusCode.DEFAULT;
        if (liveEffect == null || (resourceId = liveEffect.getResourceId()) == null) {
            resourceId = CardStruct.IStatusCode.DEFAULT;
        }
        HashMap map2 = (HashMap) map;
        map2.put("sticker_resource_id", resourceId);
        LiveEffect liveEffect2 = C924790aAn.LIZLLL().LJFF;
        if (liveEffect2 != null && (string = Long.valueOf(liveEffect2.getEffectId()).toString()) != null) {
            str = string;
        }
        map2.put("sticker_id", str);
    }
}
