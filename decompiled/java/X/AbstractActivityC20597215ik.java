package X;

import android.os.Bundle;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.SAFContextThemeConfig;
import org.json.JSONException;

/* JADX INFO: renamed from: X.15ik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractActivityC20597215ik extends C199Y implements InterfaceC20596915ih {
    @Override // com.bytedance.ies.foundation.activity.BaseActivity
    public final boolean isDarkModeSupported() {
        return false;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean isDelegateFragmentManager() {
        return true;
    }

    @Override // X.C199Y
    public final SAFContextThemeConfig getRootPageContextConfig() {
        return new SAFContextThemeConfig(C504210Jpz.LIZ, 0);
    }

    @Override // X.C199Y, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C157W.LIZIZ().LIZ(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        getTheme().applyStyle(C011Z.LIZ.LJIIIZ(), false);
        C1107670evl.LIZ(this);
    }
}
