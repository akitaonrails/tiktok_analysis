package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: renamed from: X.0J4L, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J4L {
    public static final View LIZ(Context context, String str, AttributeSet attributeSet) {
        LayoutInflater.Factory factory;
        View viewOnCreateView;
        Activity activityLIZ = C21145417oy.LIZ(context);
        if (activityLIZ != null) {
            LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
            if (NxRewordManager.LJIILIIL) {
                factory = C0J43.LIZ(layoutInflaterNe, false);
            } else {
                factory = layoutInflaterNe.getFactory();
            }
            LayoutInflater.Factory2 factory2Qd = C786410Ut5.Qd(layoutInflaterNe);
            if (factory2Qd != null) {
                View viewOnCreateView2 = factory2Qd.onCreateView(null, str, context, attributeSet);
                if (viewOnCreateView2 != null) {
                    return viewOnCreateView2;
                }
            } else if (factory != null && (viewOnCreateView = factory.onCreateView(str, context, attributeSet)) != null) {
                return viewOnCreateView;
            }
            View viewOnCreateView3 = activityLIZ.onCreateView(null, str, context, attributeSet);
            if (viewOnCreateView3 != null) {
                return viewOnCreateView3;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot create view : ");
            sbLIZ.append(str);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new IllegalStateException("context must be an Activity.");
    }
}
