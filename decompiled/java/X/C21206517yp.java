package X;

import android.content.Context;
import android.graphics.Rect;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.17yp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21206517yp {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6292));

    public static int LIZIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZJ() {
        return LIZIZ() == 4;
    }

    public static Rect LIZ(Context context, InterfaceC756790TmP interfaceC756790TmP, boolean z) {
        EnumC756810TmR enumC756810TmR;
        if (context == null || ((LIZIZ() == 1 || LIZIZ() == 0 || LIZIZ() == 4) && !z)) {
            return null;
        }
        int iLIZIZ = LIZIZ();
        if (iLIZIZ != 2 && iLIZIZ != 3) {
            enumC756810TmR = EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR;
        } else {
            enumC756810TmR = EnumC756810TmR.SLOT_LIVE_WATCHER_L2_TOOLBAR;
        }
        Rect iconSlotLocation = interfaceC756790TmP.getIconSlotLocation(context, enumC756810TmR);
        if (iconSlotLocation == null) {
            return null;
        }
        if (iconSlotLocation.exactCenterX() == 0.0f && (LIZIZ() == 2 || LIZIZ() == 3)) {
            iconSlotLocation.set(iconSlotLocation.left, iconSlotLocation.top, C14KQ.LJII(), iconSlotLocation.bottom);
        }
        return iconSlotLocation;
    }
}
