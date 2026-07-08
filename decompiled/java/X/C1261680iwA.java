package X;

import android.graphics.Rect;
import android.util.LruCache;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS68S0001000_19;

/* JADX INFO: renamed from: X.0iwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261680iwA {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new LruCache(100);
    }

    public static final void LIZ(int i, View view) {
        View view2;
        if (i <= 0) {
            return;
        }
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            AwS68S0001000_19 awS68S0001000_19 = new AwS68S0001000_19(i, 2);
            Rect rect = new Rect();
            view.getHitRect(rect);
            if (!rect.isEmpty()) {
                view2.setTouchDelegate((TouchDelegate) awS68S0001000_19.invoke(rect, view));
            } else {
                C447550Hgn.LIZIZ(view, new AwS228S0300000_19(view2, view, awS68S0001000_19, 30));
            }
        }
    }

    public static final void LIZIZ(TuxTextView tuxTextView, User user) {
        tuxTextView.setText(user.getNickname());
        C1908030zkf.LJI(tuxTextView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), tuxTextView);
    }
}
