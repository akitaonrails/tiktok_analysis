package X;

import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0Nu2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608640Nu2 {
    public static final C608640Nu2 LIZ = new C608640Nu2();
    public static volatile int LIZIZ;
    public static boolean LIZJ;

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onClickFavoriteEvent(C609850Nvz c609850Nvz) {
        LIZIZ |= 16;
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onCommentEvent(C1209980ham c1209980ham) {
        LIZIZ |= 1;
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onDislikeStateEvent(C2038507yh c2038507yh) {
        LIZIZ |= 2;
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onEventDiggUpdate(C0SYN c0syn) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEventDiggUpdate ");
        String str = null;
        if (c0syn != null) {
            boolValueOf = Boolean.valueOf(c0syn.LIZIZ);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", ");
        if (c0syn != null) {
            str = c0syn.LIZ;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c0syn != null && c0syn.LIZIZ) {
            LIZIZ |= 4;
        }
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onShareEndEvent(C739860T0m c739860T0m) {
        LIZIZ |= 8;
    }
}
