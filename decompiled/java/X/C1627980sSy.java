package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;

/* JADX INFO: renamed from: X.0sSy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1627980sSy {
    public static boolean LIZ(Effect effect) {
        boolean z;
        if (C0CHS.LIZ() && (((effect instanceof MobileEffect) && ((MobileEffect) effect).getModerationStatus() != 3) || C1446840nko.LJ(effect) || (effect instanceof DraftEffect))) {
            z = true;
        } else {
            z = false;
        }
        if (effect != null) {
            if (z) {
                return true;
            }
            C1446130njf.LIZ.getClass();
            if (C1446130njf.LIZIZ(effect, "forbid_favorite", false)) {
                return true;
            }
            return false;
        }
        return z;
    }
}
