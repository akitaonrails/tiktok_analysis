package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0U6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766980U6u {
    public static final void LIZ(C19U0 c19u0) {
        View viewFindViewById;
        View viewFindViewById2;
        View view;
        View viewFindViewById3;
        if (c19u0 != null && (view = c19u0.LJFF) != null && (viewFindViewById3 = view.findViewById(R.id.wyg)) != null) {
            C786410Ut5.T4(viewFindViewById3, 0.5f);
        }
        if (LiveAIBeautySetting.INSTANCE.enableAIBeauty()) {
            if (c19u0 != null) {
                View view2 = c19u0.LJFF;
                if (view2 != null && (viewFindViewById2 = view2.findViewById(R.id.ao6)) != null) {
                    C786410Ut5.T4(viewFindViewById2, 0.5f);
                }
            } else {
                return;
            }
        } else if (c19u0 == null) {
            return;
        }
        View view3 = c19u0.LJFF;
        if (view3 != null && (viewFindViewById = view3.findViewById(R.id.wxy)) != null) {
            C500260Jjc.LJIILIIL(viewFindViewById);
        }
    }
}
