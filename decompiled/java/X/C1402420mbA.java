package X;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelBulletinBoardPowerCell;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelHeadPowerCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402420mbA extends C20094213jo {
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
            case 8:
                onInitializeAccessibilityNodeInfo$8(this, view, accessibilityNodeInfoCompat);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onInitializeAccessibilityNodeInfo$9(this, view, accessibilityNodeInfoCompat);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onInitializeAccessibilityNodeInfo$10(this, view, accessibilityNodeInfoCompat);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onInitializeAccessibilityNodeInfo$11(this, view, accessibilityNodeInfoCompat);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                break;
        }
    }

    @Override // X.C20094213jo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        switch (this.$t) {
            case 7:
                return performAccessibilityAction$0(this, view, i, bundle);
            case 8:
                return performAccessibilityAction$1(this, view, i, bundle);
            default:
                return super.performAccessibilityAction(view, i, bundle);
        }
    }

    public C1402420mbA(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(C1402420mbA c1402420mbA, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setContentDescription(((C418720GbO) c1402420mbA.l0).getContext().getResources().getString(R.string.e8n));
    }

    public static final void onInitializeAccessibilityNodeInfo$1(C1402420mbA c1402420mbA, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setContentDescription(((C1369800lkY) c1402420mbA.l0).LLILLL.getText());
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$10(C1402420mbA c1402420mbA, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat.setClickable(true);
        if (((C1363950lb7) c1402420mbA.l0).LLJJIJIL.LLILLL) {
            C844470XAv.LIZ.getClass();
            accessibilityNodeInfoCompat.setStateDescription(C844470XAv.LIZ().getString(2131823312));
        }
        if (((C1363950lb7) c1402420mbA.l0).LLJILLL.isSelected()) {
            accessibilityNodeInfoCompat.setSelected(((C1363950lb7) c1402420mbA.l0).LLJILLL.isSelected());
        }
        accessibilityNodeInfoCompat.addAction(C20092413jW.LJI);
    }

    public static final void onInitializeAccessibilityNodeInfo$11(C1402420mbA c1402420mbA, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat.setClickable(true);
        if (((C1363970lb9) c1402420mbA.l0).LLILZ.isSelected()) {
            accessibilityNodeInfoCompat.setSelected(((C1363970lb9) c1402420mbA.l0).LLILZ.isSelected());
        }
        accessibilityNodeInfoCompat.addAction(C20092413jW.LJI);
    }

    public static final void onInitializeAccessibilityNodeInfo$2(C1402420mbA c1402420mbA, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setContentDescription(((C1370250llH) c1402420mbA.l0).LLILLJJLI.getText());
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$3(C1402420mbA c1402420mbA, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        ((Function2) c1402420mbA.l0).invoke(view, accessibilityNodeInfoCompat);
    }

    public static final void onInitializeAccessibilityNodeInfo$4(C1402420mbA c1402420mbA, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat.setClickable(true);
        if (((SharePanelBulletinBoardPowerCell) c1402420mbA.l0).T5().isSelected()) {
            accessibilityNodeInfoCompat.setSelected(((SharePanelBulletinBoardPowerCell) c1402420mbA.l0).T5().isSelected());
        }
        accessibilityNodeInfoCompat.addAction(C20092413jW.LJI);
    }

    public static final void onInitializeAccessibilityNodeInfo$5(C1402420mbA c1402420mbA, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat.setClickable(true);
        if (((SharePanelHeadPowerCell) c1402420mbA.l0).T5().LLILLL) {
            C844470XAv.LIZ.getClass();
            accessibilityNodeInfoCompat.setStateDescription(C844470XAv.LIZ().getString(2131823312));
        }
        if (((SharePanelHeadPowerCell) c1402420mbA.l0).a6().isSelected()) {
            accessibilityNodeInfoCompat.setSelected(((SharePanelHeadPowerCell) c1402420mbA.l0).a6().isSelected());
        }
        accessibilityNodeInfoCompat.addAction(C20092413jW.LJI);
    }

    public static final void onInitializeAccessibilityNodeInfo$6(C1402420mbA c1402420mbA, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setContentDescription(((C1370230llF) c1402420mbA.l0).LLILZLL.getText());
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$7(C1402420mbA c1402420mbA, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (((C1370160ll8) c1402420mbA.l0).LIZ) {
            accessibilityNodeInfoCompat.addAction(1048576);
            accessibilityNodeInfoCompat.setDismissable(true);
        } else {
            accessibilityNodeInfoCompat.setDismissable(false);
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$8(C1402420mbA c1402420mbA, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (((C1370170ll9) c1402420mbA.l0).LIZ) {
            accessibilityNodeInfoCompat.addAction(1048576);
            accessibilityNodeInfoCompat.setDismissable(true);
        } else {
            accessibilityNodeInfoCompat.setDismissable(false);
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$9(C1402420mbA c1402420mbA, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat.setClickable(true);
        if (((C1364170lbT) c1402420mbA.l0).LLILZLL.isSelected()) {
            accessibilityNodeInfoCompat.setSelected(((C1364170lbT) c1402420mbA.l0).LLILZLL.isSelected());
        }
        accessibilityNodeInfoCompat.addAction(C20092413jW.LJI);
    }

    public static final boolean performAccessibilityAction$0(C1402420mbA c1402420mbA, View view, int i, Bundle bundle) {
        if (i == 1048576 && ((C1370160ll8) c1402420mbA.l0).LIZ) {
            return true;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    public static final boolean performAccessibilityAction$1(C1402420mbA c1402420mbA, View view, int i, Bundle bundle) {
        if (i == 1048576 && ((C1370170ll9) c1402420mbA.l0).LIZ) {
            return true;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
