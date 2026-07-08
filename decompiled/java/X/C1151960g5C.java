package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;

/* JADX INFO: renamed from: X.0g5C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151960g5C extends C20094213jo {
    public final int $t;
    public Object l0;

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        switch (this.$t) {
            case 0:
                onInitializeAccessibilityNodeInfo$0(this, view, accessibilityNodeInfoCompat);
                break;
            case 1:
                onInitializeAccessibilityNodeInfo$1(this, view, accessibilityNodeInfoCompat);
                break;
            case 2:
                onInitializeAccessibilityNodeInfo$2(this, view, accessibilityNodeInfoCompat);
                break;
            case 3:
                onInitializeAccessibilityNodeInfo$3(this, view, accessibilityNodeInfoCompat);
                break;
            case 4:
                onInitializeAccessibilityNodeInfo$4(this, view, accessibilityNodeInfoCompat);
                break;
            case 5:
                onInitializeAccessibilityNodeInfo$5(this, view, accessibilityNodeInfoCompat);
                break;
            case 6:
                onInitializeAccessibilityNodeInfo$6(this, view, accessibilityNodeInfoCompat);
                break;
            case 7:
                onInitializeAccessibilityNodeInfo$7(this, view, accessibilityNodeInfoCompat);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                break;
        }
    }

    public C1151960g5C(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(C1151960g5C c1151960g5C, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) ((LiveRoomUserInfoWidget) c1151960g5C.l0).LLJIJIL.getText());
        sbLIZ.append(",");
        sbLIZ.append((Object) ((LiveRoomUserInfoWidget) c1151960g5C.l0).LLJJIJIIJIL.getText());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) c1151960g5C.l0;
        if (liveRoomUserInfoWidget.LLLFZ == liveRoomUserInfoWidget.LLJLL) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append((Object) ((LiveRoomUserInfoWidget) c1151960g5C.l0).LLJIJIL.getText());
            sbLIZ2.append(",");
            sbLIZ2.append((Object) ((LiveRoomUserInfoWidget) c1151960g5C.l0).LLJJJIL.getText());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (liveRoomUserInfoWidget.LLJZ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append((Object) ((LiveRoomUserInfoWidget) c1151960g5C.l0).LLJIJIL.getText());
            sbLIZ3.append(",");
            sbLIZ3.append((Object) ((LiveRoomUserInfoWidget) c1151960g5C.l0).LLJJJJLIIL.getText());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        accessibilityNodeInfoCompat.setContentDescription(strLIZIZ);
    }

    public static final void onInitializeAccessibilityNodeInfo$1(C1151960g5C c1151960g5C, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(new C20092413jW(16, ((C1125990fPJ) c1151960g5C.l0).LLLILZLLLI));
    }

    public static final void onInitializeAccessibilityNodeInfo$2(C1151960g5C c1151960g5C, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        String str;
        String str2;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        C1126930fQp c1126930fQp = (C1126930fQp) c1151960g5C.l0;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1126930fQp.LLJJLIIIJLLLLLLLZ;
        boolean z = true;
        if (abstractC1126600fQI != null && abstractC1126600fQI.LIZJ) {
            str = c1126930fQp.LLLILZLLLI;
        } else {
            str = c1126930fQp.LLLII;
        }
        C20092413jW c20092413jW = new C20092413jW(16, str);
        C1126930fQp c1126930fQp2 = (C1126930fQp) c1151960g5C.l0;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = c1126930fQp2.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LIZJ) {
            str2 = c1126930fQp2.LLLILZLLLI;
        } else {
            str2 = c1126930fQp2.LLLII;
        }
        accessibilityNodeInfoCompat.addAction(new C20092413jW(32, str2));
        accessibilityNodeInfoCompat.addAction(c20092413jW);
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = ((C1126930fQp) c1151960g5C.l0).LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI3 == null || !abstractC1126600fQI3.LIZJ) {
            z = false;
        }
        accessibilityNodeInfoCompat.setSelected(z);
    }

    public static final void onInitializeAccessibilityNodeInfo$3(C1151960g5C c1151960g5C, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        String str;
        String str2;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        C1126940fQq c1126940fQq = (C1126940fQq) c1151960g5C.l0;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1126940fQq.LLJJLIIIJLLLLLLLZ;
        boolean z = true;
        if (abstractC1126600fQI != null && abstractC1126600fQI.LIZJ) {
            str = c1126940fQq.LLLILZLLLI;
        } else {
            str = c1126940fQq.LLLII;
        }
        C20092413jW c20092413jW = new C20092413jW(16, str);
        C1126940fQq c1126940fQq2 = (C1126940fQq) c1151960g5C.l0;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = c1126940fQq2.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LIZJ) {
            str2 = c1126940fQq2.LLLILZLLLI;
        } else {
            str2 = c1126940fQq2.LLLII;
        }
        accessibilityNodeInfoCompat.addAction(new C20092413jW(32, str2));
        accessibilityNodeInfoCompat.addAction(c20092413jW);
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = ((C1126940fQq) c1151960g5C.l0).LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI3 == null || !abstractC1126600fQI3.LIZJ) {
            z = false;
        }
        accessibilityNodeInfoCompat.setSelected(z);
    }

    public static final void onInitializeAccessibilityNodeInfo$4(C1151960g5C c1151960g5C, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        String str;
        String str2;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        AbstractC1126560fQE abstractC1126560fQE = (AbstractC1126560fQE) c1151960g5C.l0;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = abstractC1126560fQE.LLJJLIIIJLLLLLLLZ;
        boolean z = true;
        if (abstractC1126600fQI != null && abstractC1126600fQI.LIZJ) {
            str = abstractC1126560fQE.LLLI;
        } else {
            str = abstractC1126560fQE.LLLII;
        }
        C20092413jW c20092413jW = new C20092413jW(16, str);
        AbstractC1126560fQE abstractC1126560fQE2 = (AbstractC1126560fQE) c1151960g5C.l0;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = abstractC1126560fQE2.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LIZJ) {
            str2 = abstractC1126560fQE2.LLLI;
        } else {
            str2 = abstractC1126560fQE2.LLLII;
        }
        accessibilityNodeInfoCompat.addAction(new C20092413jW(32, str2));
        accessibilityNodeInfoCompat.addAction(c20092413jW);
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = ((AbstractC1126560fQE) c1151960g5C.l0).LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI3 == null || !abstractC1126600fQI3.LIZJ) {
            z = false;
        }
        accessibilityNodeInfoCompat.setSelected(z);
    }

    public static final void onInitializeAccessibilityNodeInfo$5(C1151960g5C c1151960g5C, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        String str;
        String str2;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        C1126900fQm c1126900fQm = (C1126900fQm) c1151960g5C.l0;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1126900fQm.LLJJLIIIJLLLLLLLZ;
        boolean z = true;
        if (abstractC1126600fQI != null && abstractC1126600fQI.LIZJ) {
            str = c1126900fQm.LLLILZLLLI;
        } else {
            str = c1126900fQm.LLLII;
        }
        C20092413jW c20092413jW = new C20092413jW(16, str);
        C1126900fQm c1126900fQm2 = (C1126900fQm) c1151960g5C.l0;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = c1126900fQm2.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LIZJ) {
            str2 = c1126900fQm2.LLLILZLLLI;
        } else {
            str2 = c1126900fQm2.LLLII;
        }
        accessibilityNodeInfoCompat.addAction(new C20092413jW(32, str2));
        accessibilityNodeInfoCompat.addAction(c20092413jW);
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = ((C1126900fQm) c1151960g5C.l0).LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI3 == null || !abstractC1126600fQI3.LIZJ) {
            z = false;
        }
        accessibilityNodeInfoCompat.setSelected(z);
    }

    public static final void onInitializeAccessibilityNodeInfo$6(C1151960g5C c1151960g5C, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(new C20092413jW(16, ((C1125940fPE) c1151960g5C.l0).LLLJIL));
    }

    public static final void onInitializeAccessibilityNodeInfo$7(C1151960g5C c1151960g5C, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        C1106110etF c1106110etF = (C1106110etF) c1151960g5C.l0;
        if (c1106110etF.LLJJJ > 0 && c1106110etF.LLLILZLLLI) {
            Resources resources = c1106110etF.LLJI.getResources();
            int i = ((C1106110etF) c1151960g5C.l0).LLJJJ;
            accessibilityNodeInfoCompat.setContentDescription(resources.getQuantityString(2131755500, i, C1850730yGF.LJIIIZ(i)));
            return;
        }
        C20743416Fc c20743416Fc = c1106110etF.LLJJIJIL;
        if (c20743416Fc != null) {
            accessibilityNodeInfoCompat.setContentDescription(c20743416Fc.getText());
            return;
        }
        if (c1106110etF.LLJJJIL > 0 && c1106110etF.LLLILZLLLI) {
            Resources resources2 = c1106110etF.LLJI.getResources();
            int i2 = ((C1106110etF) c1151960g5C.l0).LLJJJIL;
            accessibilityNodeInfoCompat.setContentDescription(resources2.getQuantityString(2131755500, i2, C1850730yGF.LJIIIZ(i2)));
            return;
        }
        accessibilityNodeInfoCompat.setContentDescription(C497740JfY.LJIJI(2131842930));
    }
}
