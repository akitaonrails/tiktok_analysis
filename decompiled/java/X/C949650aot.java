package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRemoveDividingLineSetting;

/* JADX INFO: renamed from: X.0aot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949650aot {
    public static String LIZ;
    public static boolean LIZIZ;

    public static boolean LIZ() {
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            return true;
        }
        return (LinkCoreModelKt.currentUserIsAnchor() || !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nf2()) ? LIZIZ && MultiGuestRemoveDividingLineSetting.INSTANCE.isEnable() : MultiGuestRemoveDividingLineSetting.INSTANCE.isEnable();
    }
}
