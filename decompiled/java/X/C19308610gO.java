package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;

/* JADX INFO: renamed from: X.10gO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19308610gO {
    public static void LIZ(Context context, UgChannelPopup ugChannelPopup) {
        if (DialogC19308210gK.LLIZLLLIL) {
            return;
        }
        DialogC19308210gK.LLIZLLLIL = true;
        try {
            DialogC19308210gK.LLIZ = new DialogC19308210gK(context, ugChannelPopup);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        DialogC19308210gK dialogC19308210gK = DialogC19308210gK.LLIZ;
        if (dialogC19308210gK == null) {
            dialogC19308210gK = null;
        }
        dialogC19308210gK.show();
        C785410UrT.LIZIZ(dialogC19308210gK);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialogC19308210gK);
        C816490W1f.LIZ(dialogC19308210gK);
    }
}
