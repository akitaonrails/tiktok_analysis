package X;

import Y.ARunnableS81S0200000_12;
import android.os.SystemClock;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0fOW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125500fOW {
    public static final void LIZ(C1126220fPg c1126220fPg, boolean z) {
        C500260Jjc.LJIILLIIL(c1126220fPg);
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hideComboView ");
            sbLIZ.append(z);
            C20441214yg.LJIIIZ("GiftPanelCombo", C2188811AlT.LIZIZ(sbLIZ));
            if (c1126220fPg != null) {
                c1126220fPg.LJFF();
            }
        }
    }

    public static final void LIZIZ(C1126220fPg c1126220fPg, float f, float f2, boolean z) {
        int iLJIIZILJ;
        int iLIZIZ;
        float dimensionPixelSize = c1126220fPg.getContext().getResources().getDimensionPixelSize(R.dimen.apy);
        if (z) {
            iLJIIZILJ = c1126220fPg.getContext().getResources().getDimensionPixelSize(R.dimen.arw);
        } else if (C753060TgO.LIZ()) {
            iLJIIZILJ = C1125510fOX.LIZ();
        } else {
            iLJIIZILJ = C497740JfY.LJIIZILJ();
        }
        int i = iLJIIZILJ / 4;
        if (z) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(282));
        }
        float f3 = iLIZIZ;
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126220fPg);
        c1126220fPg.setX(((i / 2.0f) + f) - (fLIZIZ / 2.0f));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126220fPg);
        c1126220fPg.setY(((dimensionPixelSize / 2.0f) + f2) - (f3 / 2.0f));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("moveToCenterOfItem x ");
        sbLIZ.append(c1126220fPg.getX());
        sbLIZ.append(" itemX ");
        sbLIZ.append(f);
        sbLIZ.append(" giftPanelItemWidthInPx ");
        sbLIZ.append(i);
        sbLIZ.append(" comboWidthInPx ");
        sbLIZ.append(fLIZIZ);
        C20441214yg.LJIIIZ("GiftPanelCombo", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("moveToCenterOfItem y ");
        sbLIZ2.append(c1126220fPg.getY());
        sbLIZ2.append(" itemY ");
        sbLIZ2.append(f2);
        sbLIZ2.append(" giftPanelItemHeightInPx ");
        sbLIZ2.append(dimensionPixelSize);
        sbLIZ2.append(" comboHeightInPx ");
        sbLIZ2.append(f3);
        C20441214yg.LJIIIZ("GiftPanelCombo", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void LIZJ(final C1126220fPg c1126220fPg, final long j, long j2, final Function2 function2, Function0 function0, boolean z) {
        if (c1126220fPg != null) {
            C1126220fPg.LJ(c1126220fPg, new Runnable() { // from class: X.0T5j
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ComboViewHelperKt@8b5e.runCombo$1");
                    try {
                        function2.invoke(Long.valueOf(j), Integer.valueOf(c1126220fPg.getComboCount()));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ComboViewHelperKt@8b5e.runCombo$1");
                }
            }, new ARunnableS81S0200000_12(function0, c1126220fPg, 152), j, Boolean.FALSE, "gift_panel", "gift_panel", "gift_panel", SystemClock.uptimeMillis() - C1128590fTV.LJJIL, Long.valueOf(j2), null, null, null, false, null, z, 15872);
        }
    }

    public static final void LIZLLL(C1126220fPg c1126220fPg, long j, long j2, float f, float f2, int i, boolean z, Function2 function2, Function0 function0) {
        int comboCount;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showComboViewStub ");
        if (c1126220fPg != null) {
            comboCount = c1126220fPg.getComboCount();
        } else {
            comboCount = 0;
        }
        sbLIZ.append(comboCount);
        sbLIZ.append(' ');
        sbLIZ.append(j);
        sbLIZ.append(' ');
        sbLIZ.append(f);
        sbLIZ.append(' ');
        sbLIZ.append(f2);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("GiftPanelCombo", C2188811AlT.LIZIZ(sbLIZ));
        if (c1126220fPg == null) {
            return;
        }
        if (c1126220fPg.getVisibility() != 8 && c1126220fPg.getVisibility() != 4) {
            LIZJ(c1126220fPg, j, j2, function2, function0, z);
            return;
        }
        C500260Jjc.LLFFF(c1126220fPg);
        LIZIZ(c1126220fPg, f, f2, z);
        LIZJ(c1126220fPg, j, j2, function2, function0, z);
    }
}
