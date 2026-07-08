package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.hashtag.PreviewHashtagDialog;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* JADX INFO: renamed from: X.0TjB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C754790TjB {
    public static void LIZ(FragmentManager fragmentManager, InterfaceC754470Tif interfaceC754470Tif, EnumC754690Tj1 enumC754690Tj1, LiveMode liveMode, String str) {
        int i;
        C751980Tee.LIZ(fragmentManager, "PreviewHashtagDialog");
        if (fragmentManager != null) {
            PreviewHashtagDialog previewHashtagDialog = new PreviewHashtagDialog();
            previewHashtagDialog.LLILZ = interfaceC754470Tif;
            if (enumC754690Tj1 == EnumC754690Tj1.SCREEN_RECORD) {
                i = 1;
            } else {
                i = 0;
            }
            previewHashtagDialog.LLILZIL = i;
            previewHashtagDialog.LLILLL = enumC754690Tj1;
            previewHashtagDialog.LLIZ = liveMode;
            previewHashtagDialog.LLILZLL = str;
            previewHashtagDialog.show(fragmentManager, "PreviewHashtagDialog");
        }
    }
}
