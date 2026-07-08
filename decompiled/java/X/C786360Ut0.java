package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.broadcast.setting.BroadcastE2EProtectSetting;

/* JADX INFO: renamed from: X.0Ut0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786360Ut0 implements C0TVI {
    public final int $t;
    public Object l0;

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        switch (this.$t) {
            case 0:
                return onApplyWindowInsets$0(this, view, c20246014Ju);
            case 1:
                return onApplyWindowInsets$1(this, view, c20246014Ju);
            default:
                return null;
        }
    }

    public C786360Ut0(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final C20246014Ju onApplyWindowInsets$0(C786360Ut0 c786360Ut0, View view, C20246014Ju c20246014Ju) {
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        if (BroadcastE2EProtectSetting.INSTANCE.getValue()) {
            int i = c20244914JjLIZ.LIZIZ;
            if (i != 0) {
                view.setPadding(c20244914JjLIZ.LIZ, i, c20244914JjLIZ.LIZJ, 0);
            }
        } else {
            view.setPadding(c20244914JjLIZ.LIZ, c20244914JjLIZ.LIZIZ, c20244914JjLIZ.LIZJ, 0);
        }
        C1090450eTz c1090450eTz = (C1090450eTz) c786360Ut0.l0;
        if (c1090450eTz != null) {
            ViewGroup.LayoutParams layoutParams = c1090450eTz.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = c20244914JjLIZ.LIZIZ + 2;
                C786410Ut5.W5(c1090450eTz, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$1(C786360Ut0 c786360Ut0, View view, C20246014Ju c20246014Ju) {
        float fLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (c20246014Ju.LIZ.LJIIJ().LIZLLL > 0) {
            fLIZIZ = C497740JfY.LIZIZ(12.0f);
        } else {
            fLIZIZ = C497740JfY.LIZIZ(28.0f);
        }
        int i = (int) fLIZIZ;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            C16FS c16fs = (C16FS) c786360Ut0.l0;
            marginLayoutParams.bottomMargin = i;
            C786410Ut5.x6(c16fs, marginLayoutParams);
        }
        return c20246014Ju;
    }
}
