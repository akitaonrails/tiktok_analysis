package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.notification.sysnotice.cell.SystemNotificationCell;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0DWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C340400DWc extends C2217421BqW implements InterfaceC1685420txc<Integer, Integer, Integer, Integer, View, Unit> {
    public C340400DWc(Object obj) {
        super(5, obj, SystemNotificationCell.class, "increaseClickArea", "increaseClickArea(IIIILandroid/view/View;)V", 0);
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(Integer num, Integer num2, Integer num3, Integer num4, View view) {
        final int iIntValue = num.intValue();
        final int iIntValue2 = num2.intValue();
        final int iIntValue3 = num3.intValue();
        final int iIntValue4 = num4.intValue();
        final View view2 = view;
        SystemNotificationCell systemNotificationCell = (SystemNotificationCell) this.receiver;
        final View view3 = (View) systemNotificationCell.LL.getValue();
        if (view3 != null && view2 != null && systemNotificationCell.LL.getValue() != null) {
            HandlerHook.viewPost(view3, new Runnable() { // from class: X.0DWb
                public final void LIZ() {
                    Rect rect = new Rect();
                    int[] iArr = new int[2];
                    view3.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    view2.getLocationOnScreen(iArr2);
                    int i = iArr2[0] - iArr[0];
                    int i2 = iArr2[1] - iArr[1];
                    rect.set(i, i2, view2.getWidth() + i, view2.getHeight() + i2);
                    rect.left -= iIntValue;
                    rect.top -= iIntValue2;
                    rect.right += iIntValue3;
                    rect.bottom += iIntValue4;
                    view3.setTouchDelegate(new TouchDelegate(rect, view2));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SystemNotificationCell@f063.increaseClickArea$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SystemNotificationCell@f063.increaseClickArea$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
