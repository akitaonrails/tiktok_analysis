package X;

import android.content.Context;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;

/* JADX INFO: renamed from: X.10vt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19404710vt {
    public static final TuxIconDrawable LIZ(AnchorTransData anchorTransData, Context context) {
        Integer num = anchorTransData.anchorIconRaw;
        if (num != null) {
            int iIntValue = num.intValue();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = iIntValue;
            return c419910GdJ.LIZ(context);
        }
        return null;
    }
}
