package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622800sKc {
    public static final boolean LIZ(FaceStickerBean faceStickerBean) {
        String strOptString;
        AudioGraph audioGraph;
        C1446130njf.LIZ.getClass();
        JSONObject jSONObject = (JSONObject) new AwS569S0100000_25(faceStickerBean, 313).invoke();
        if (jSONObject != null && (strOptString = jSONObject.optString("audio_graph")) != null && (audioGraph = (AudioGraph) GsonProtectorUtils.fromJson(C2219091BtD.LIZJ(), strOptString, AudioGraph.class)) != null) {
            return Intrinsics.LJFF(audioGraph.useOutput, Boolean.TRUE);
        }
        return false;
    }

    public static final boolean LIZIZ(Effect effect) {
        boolean z;
        C1446130njf.LIZ.getClass();
        String strLJIIJ = C1446130njf.LJIIJ(effect, "audio_graph");
        if (strLJIIJ != null && strLJIIJ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }
}
