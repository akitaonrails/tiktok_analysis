package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aU2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936720aU2 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        return LiveAbLabelSetting.INSTANCE.getBooleanValue("rounded_corner_enable") && !C931780aM4.LJFF(null);
    }

    public static boolean LIZIZ() {
        Map<String, String> mapLLILZ;
        if (C930540aK4.LIZJ()) {
            return LIZ();
        }
        if (LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage() && C500260Jjc.LJJIL()) {
            return LIZ();
        }
        C927970aFv.LIZ.getClass();
        InterfaceC937900aVw interfaceC937900aVw = C927970aFv.LIZIZ;
        return (Intrinsics.LJFF((interfaceC937900aVw == null || (mapLLILZ = interfaceC937900aVw.LLILZ()) == null) ? null : mapLLILZ.get("rc"), "1") || C500260Jjc.LJJJI(C931820aM8.LIZLLL("rounded_corner_enable"))) && !C931780aM4.LJFF(null);
    }

    public static boolean LIZJ(long j) {
        Object obj;
        C927970aFv.LIZ.getClass();
        Map map = (Map) ((LinkedHashMap) C927970aFv.LIZJ).get(Long.valueOf(j));
        if (map != null) {
            obj = map.get("rc");
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(obj, "1") && !C500260Jjc.LJJJI(C931820aM8.LIZLLL("rounded_corner_enable"))) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(View view, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(i2, i);
        if (i3 > 0) {
            gradientDrawable.setCornerRadius(i3 - (i2 / 2.0f));
        }
        if (view != null) {
            view.setBackground(gradientDrawable);
        }
    }
}
