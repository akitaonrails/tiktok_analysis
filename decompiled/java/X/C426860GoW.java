package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GoW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426860GoW {
    public static WeakReference<View> LIZ = new WeakReference<>(null);

    public static View LIZ(Context context) {
        View viewTd = LIZ.get();
        if (viewTd == null || !Intrinsics.LJFF(viewTd.getContext(), context)) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.anw, null, false);
            TuxAlertBadgeLayout tuxAlertBadgeLayout = (TuxAlertBadgeLayout) viewTd.findViewById(R.id.v8m);
            if (tuxAlertBadgeLayout != null) {
                tuxAlertBadgeLayout.LIZIZ();
            }
            LIZ = new WeakReference<>(viewTd);
        }
        return viewTd;
    }
}
