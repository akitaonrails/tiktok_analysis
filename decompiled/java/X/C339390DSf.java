package X;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS39S0102000_4;

/* JADX INFO: renamed from: X.0DSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339390DSf {
    public static final void LIZIZ(int i, int i2, Activity activity, View view) {
        if (C07I8.LIZIZ) {
            C0DQF.LJII(C0DQF.LIZ, view, i2, Integer.valueOf(i), Integer.valueOf(R.attr.a1h), 16);
        } else if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            C13MK.LIZLLL(new AwS39S0102000_4(i, activity, i2, 2));
        }
    }

    public static final void LIZ(final Activity activity, final View view, String str, final Map<String, String> map, boolean z, final Function2<? super Boolean, ? super Uri, Unit> function2) {
        boolean zLIZIZ;
        int i;
        int i2;
        if (activity == null) {
            return;
        }
        view.getContext();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            C07QI.LIZ.getClass();
            if (C07QI.LIZ()) {
                i = R.raw.icon_exclamation_mark_circle_fill;
            } else {
                i = R.raw.icon_x_mark_circle_fill;
            }
            if (C07QI.LIZ()) {
                i2 = 2131822517;
            } else {
                i2 = 2131849627;
            }
            LIZIZ(i, i2, activity, view);
            if (!map.isEmpty()) {
                C1862330yYx.LJJIL(C1862330yYx.LIZ, map, false);
            }
            if (function2 != null) {
                function2.invoke(Boolean.FALSE, null);
                return;
            }
            return;
        }
        C09NK c09nk = new C09NK();
        WeakReference weakReference = new WeakReference(activity);
        C09NO c09no = new C09NO() { // from class: X.0DSg
            @Override // X.C09NO
            public final void onFailure() {
                Activity activity2 = activity;
                View view2 = view;
                C07QI.LIZ.getClass();
                C339390DSf.LIZIZ(C07QI.LIZ() ? R.raw.icon_exclamation_mark_circle_fill : R.raw.icon_x_mark_circle_fill, C07QI.LIZ() ? 2131822517 : 2131849627, activity2, view2);
                Map<String, String> map2 = map;
                if (!map2.isEmpty()) {
                    C1862330yYx.LJJIL(C1862330yYx.LIZ, map2, false);
                }
                Function2<Boolean, Uri, Unit> function22 = function2;
                if (function22 != null) {
                    function22.invoke(Boolean.FALSE, null);
                }
            }

            @Override // X.C09NO
            public final void LIZIZ(Uri uri) {
                int i3;
                Activity activity2 = activity;
                View view2 = view;
                C07QI.LIZ.getClass();
                if (C07QI.LIZ()) {
                    i3 = 2131822518;
                } else {
                    i3 = 2131849626;
                }
                C339390DSf.LIZIZ(R.raw.icon_tick_circle_fill, i3, activity2, view2);
                Map<String, String> map2 = map;
                if (!map2.isEmpty()) {
                    C1862330yYx.LJJIL(C1862330yYx.LIZ, map2, true);
                }
                Function2<Boolean, Uri, Unit> function22 = function2;
                if (function22 != null) {
                    function22.invoke(Boolean.TRUE, uri);
                }
            }
        };
        if (TextUtils.isEmpty(str)) {
            c09no.onFailure();
            return;
        }
        Activity activity2 = (Activity) weakReference.get();
        if (activity2 == null) {
            c09no.onFailure();
        } else if (!C1375500ltk.LJI(activity2)) {
            c09no.onFailure();
        } else {
            if (str == null) {
                return;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C09NM(c09nk, activity2, str, z, c09no, null), 3);
        }
    }
}
