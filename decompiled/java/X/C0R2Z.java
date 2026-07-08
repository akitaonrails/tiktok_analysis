package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Keyframe;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.List;

/* JADX INFO: renamed from: X.0R2Z, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R2Z {
    public static final /* synthetic */ int LIZ = 0;

    public static CharSequence LIZIZ(TakoVideoItem takoVideoItem) {
        Keyframe keyframe;
        boolean z;
        List<Keyframe> list = takoVideoItem.keyframeList;
        if (list != null && (keyframe = (Keyframe) C13LP.LJJJLL(list)) != null) {
            double d = keyframe.timestamp;
            int iLIZ = C814420VxA.LIZ(d);
            if (d >= 3600.0d) {
                z = true;
            } else {
                z = false;
            }
            String strLIZ = C0QBT.LIZ(iLIZ, z);
            if (strLIZ != null) {
                return strLIZ;
            }
            return "";
        }
        return "";
    }

    public static String LIZ(Context context, CharSequence charSequence) {
        String string;
        if (context == null || (string = context.getString(2131849677, charSequence)) == null) {
            return "";
        }
        return string;
    }
}
