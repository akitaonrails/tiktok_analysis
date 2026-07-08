package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zzh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917910Zzh {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (LinkMicMgPreviewLivePageSetting.INSTANCE.enable() && C500260Jjc.LJJIL()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            z3 = true;
        }
        if (z3) {
            return LiveAbLabelSetting.INSTANCE.getBooleanValue("enable_layout_layer_add_number_of_panel_grids");
        }
        return Intrinsics.LJFF(C931820aM8.LIZLLL("enable_layout_layer_add_number_of_panel_grids"), Boolean.TRUE);
    }
}
