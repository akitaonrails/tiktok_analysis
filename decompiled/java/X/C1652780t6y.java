package X;

import android.app.Application;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0t6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652780t6y {
    public static boolean LIZ(Effect effect, boolean z) {
        if (effect == null) {
            return false;
        }
        C1624610sNX.LIZ.getClass();
        if (!C1624610sNX.LIZLLL) {
            return false;
        }
        if (z) {
            return true;
        }
        Application application = C0CHQ.LIZ;
        C1403010mc7.LIZ.getSpService().getClass();
        String string = C1637770sil.LIZ(application, "guide").LIZ.getString("upload_pic_sticker_show", "");
        if (!TextUtils.isEmpty(string) && a0.LJJIIZI(string, effect.getEffectId(), false)) {
            return false;
        }
        return true;
    }
}
