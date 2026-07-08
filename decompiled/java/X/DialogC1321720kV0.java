package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.bytedance.ies.xelement.overlay.LynxOverlayView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kV0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class DialogC1321720kV0 extends DialogC19728412Gs {
    public final LynxOverlayView LL;
    public final C01GW LLILLJJLI;

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() {
        Object obj;
        Window window;
        View decorView;
        View decorView2;
        if (LJJLIIJ(getContext())) {
            return;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(131072);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setFlags(8, 8);
        }
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxG/4TBOoWBpY6vkcAKfrNp38P8ASd4GcaHw==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
            super.show();
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && (window = ownerActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            Window window4 = getWindow();
            if (window4 != null && (decorView2 = window4.getDecorView()) != null) {
                decorView2.setSystemUiVisibility(systemUiVisibility);
            }
        }
        Window window5 = getWindow();
        if (window5 != null) {
            window5.clearFlags(8);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (LJJLIIJ(getContext())) {
            return;
        }
        super.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJJLIIJ(android.content.Context r4) {
        /*
            boolean r0 = r4 instanceof X.C199Y
            r3 = 1
            if (r0 == 0) goto L52
            r1 = r4
            X.19FO r1 = (X.C19FO) r1
            androidx.lifecycle.Lifecycle r0 = r1.getLifecycle()
            X.0qmi r0 = (X.AbstractC1563340qmi) r0
            X.0QpW r2 = X.EnumC682280QpW.IS_FINISHING
            boolean r0 = r0.LJI(r2)
            if (r0 != 0) goto L24
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()
            X.0qmi r1 = (X.AbstractC1563340qmi) r1
            X.0QpW r0 = X.EnumC682280QpW.IS_DESTROY
            boolean r0 = r1.LJI(r0)
            if (r0 == 0) goto L52
        L24:
            int r1 = r2.getValue()
            X.0QpW r0 = X.EnumC682280QpW.IS_DESTROY
            int r0 = r0.getValue()
            r1 = r1 | r0
            java.lang.Integer r2 = X.C1565730qqZ.LIZ(r1, r4)
            if (r2 == 0) goto L52
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L50
            r1 = r4
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L48
            boolean r0 = r1.isDestroyed()
            if (r0 == 0) goto L50
        L48:
            int r0 = r2.intValue()
            X.C1565730qqZ.LIZIZ(r0, r4)
        L4f:
            return r3
        L50:
            r3 = 0
            goto L48
        L52:
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L65
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L4f
            boolean r0 = r4.isDestroyed()
            if (r0 == 0) goto L65
            return r3
        L65:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC1321720kV0.LJJLIIJ(android.content.Context):boolean");
    }

    public final boolean LJJLIIIJLLLLLLLZ(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        LynxOverlayView lynxOverlayView = this.LL;
        boolean z = true;
        if (lynxOverlayView.LLILLJJLI) {
            if (lynxOverlayView.LLILZ || lynxOverlayView.eventThrough(x, y)) {
                for (LynxBaseUI lynxBaseUI : lynxOverlayView.mChildren) {
                    if (lynxOverlayView.getLeft() + lynxBaseUI.getLeft() + lynxBaseUI.getTranslationX() >= x || lynxOverlayView.getLeft() + lynxBaseUI.getLeft() + lynxBaseUI.getTranslationX() + lynxBaseUI.getWidth() <= x || lynxOverlayView.getTop() + lynxBaseUI.getTop() + lynxBaseUI.getTranslationY() >= y || lynxOverlayView.getTop() + lynxBaseUI.getTop() + lynxBaseUI.getTranslationY() + lynxBaseUI.getHeight() <= y) {
                    }
                }
            }
            float left = this.LL.getLeft();
            float top = this.LL.getTop();
            motionEvent.offsetLocation(-left, -top);
            LynxOverlayView lynxOverlayView2 = this.LL;
            C1311380kEK c1311380kEK = lynxOverlayView2.LLJILJIL;
            if (c1311380kEK == null || !c1311380kEK.LJIJJ(motionEvent, lynxOverlayView2)) {
                z = false;
            }
            motionEvent.offsetLocation(left, top);
            return z;
        }
        return false;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (LJJLIIIJLLLLLLLZ(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        for (C1321780kV6 c1321780kV6 : (ArrayList) C1321740kV2.LIZ) {
            if (c1321780kV6.LIZIZ.LJJLIIIJLLLLLLLZ(motionEvent) && !Intrinsics.LJFF(this, c1321780kV6.LIZIZ)) {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        ArrayList arrayList = (ArrayList) C1321740kV2.LIZ;
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        int i = 0;
        if (arrayList == null) {
            return false;
        }
        DialogC1321720kV0 dialogC1321720kV0 = ((C1321780kV6) ListProtector.get(arrayList, 0)).LIZIZ;
        Activity activityLIZ = C1298530jtb.LIZ(dialogC1321720kV0.LL.mContext);
        if (activityLIZ == null) {
            return false;
        }
        if (!dialogC1321720kV0.LL.LLILLL) {
            i = -((Number) dialogC1321720kV0.LLILLJJLI.getValue()).intValue();
        }
        float f = i;
        motionEvent.offsetLocation(-0.0f, -f);
        boolean zDispatchTouchEvent = activityLIZ.dispatchTouchEvent(motionEvent);
        motionEvent.offsetLocation(0.0f, f);
        return zDispatchTouchEvent;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    public DialogC1321720kV0(Context context, LynxOverlayView lynxOverlayView) {
        super(context, R.style.ko);
        this.LL = lynxOverlayView;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS564S0100000_20(this, 25));
    }
}
