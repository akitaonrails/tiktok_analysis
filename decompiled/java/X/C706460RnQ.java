package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C706460RnQ {
    public static final C1163430gNh LIZ = C1163420gNg.LIZ(new InterfaceC201986141o() { // from class: X.0RnR
        @Override // X.InterfaceC201986141o
        public final void LIZ(Context context, int i, View view, Function1 function1) {
            View viewTd;
            Fragment fragmentLIZ;
            Activity activityLIZ = C1388190mED.LIZ(context);
            Context context2 = null;
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            ViewGroup viewGroup = null;
            if (iDetailFeedSafService != null && (fragmentLIZ = iDetailFeedSafService.LIZ(view)) != null) {
                context2 = fragmentLIZ.getContext();
            }
            if (context2 != null) {
                Context contextLIZ = C706500RnU.LIZ(context2, C706500RnU.LIZIZ(i, context));
                Context contextLIZ2 = C706500RnU.LIZ(context2, C706500RnU.LIZIZ(i, context));
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                }
                viewTd = C20673215v0.LJFF(contextLIZ, contextLIZ2, i, viewGroup, false);
            } else if (activityLIZ != null && (view instanceof ViewGroup)) {
                viewTd = C20673215v0.LIZJ(i, activityLIZ);
            } else {
                LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                }
                viewTd = C786410Ut5.Td(layoutInflaterNe, i, viewGroup, false);
            }
            function1.invoke(viewTd);
        }
    });
}
