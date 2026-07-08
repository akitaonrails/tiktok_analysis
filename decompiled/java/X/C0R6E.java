package X;

import android.content.Context;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0R6E, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R6E {
    public static void LIZ(SmartImageView smartImageView) {
        try {
            smartImageView.setBackgroundResource(R.drawable.bb4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2276411E8h.LIZIZ.LIZLLL("common_feed", e);
        }
    }

    public static void LIZIZ(SmartImageView smartImageView, Context context, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("res://");
        sbLIZ.append(context.getPackageName());
        sbLIZ.append("/");
        sbLIZ.append(i);
        smartImageView.setImageURI(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
    }
}
