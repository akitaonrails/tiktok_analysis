package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0sKT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622710sKT {
    public static boolean LIZ(Effect effect) {
        if (effect == null) {
            return false;
        }
        C1446130njf.LIZ.getClass();
        if (GsonProtectorUtils.fromJson(C2219091BtD.LIZJ(), C1446130njf.LJIIJ(effect, "audio_graph"), AudioGraph.class) == null) {
            return false;
        }
        return true;
    }
}
