package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ULO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0ULO {
    public static final void LIZ(View view, int i, String str, boolean z) {
        if (!LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage()) {
            return;
        }
        C0DMG c0dmg = new C0DMG(view, i, str, z);
        if (i != 0) {
            if (i != 1) {
                c0dmg.invoke(Integer.valueOf(C20736316Cj.LIZIZ(R.attr.exl, view.getContext())), Integer.valueOf(C20736316Cj.LIZIZ(R.attr.exm, view.getContext())));
                return;
            }
            c0dmg.invoke(Integer.valueOf(C20736316Cj.LIZIZ(R.attr.ep5, view.getContext())), null);
            return;
        }
        c0dmg.invoke(Integer.valueOf(C20736316Cj.LIZIZ(R.attr.exl, view.getContext())), Integer.valueOf(C20736316Cj.LIZIZ(R.attr.exm, view.getContext())));
    }
}
