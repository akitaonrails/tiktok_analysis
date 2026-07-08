package X;

import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.foundation.activity.IActivityCustomToastHelper;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.19Dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21502619Dc implements C12ET {
    public WeakReference<BaseActivity> LL;

    public final void LIZ(int i, String str) {
        BaseActivity baseActivity;
        IActivityCustomToastHelper iActivityCustomToastHelper;
        WeakReference<BaseActivity> weakReference = this.LL;
        if (weakReference != null && (baseActivity = weakReference.get()) != null && (!baseActivity.isDestroyed()) && (iActivityCustomToastHelper = C19DP.LIZJ) != null) {
            iActivityCustomToastHelper.showCustomToast(baseActivity, i, str);
        }
    }

    @Override // X.C12ET
    public final void showCustomLongToast(int i, String str) {
        LIZ(i, str);
    }

    @Override // X.C12ET
    public final void showCustomToast(int i, String str, int i2, int i3) {
        LIZ(i, str);
    }
}
