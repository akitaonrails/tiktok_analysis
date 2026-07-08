package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.12Bd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19713912Bd {
    public static final C19713912Bd LIZ = new C19713912Bd();

    public static void LIZ(Rect rect, View view, ViewGroup viewGroup) {
        Object c098200Yq;
        if (viewGroup == null) {
            C201955140j.LIZLLL(C830690WiJ.LIZIZ, "TouchDelegateUtils", "please check parent not null");
            return;
        }
        for (Object parent = view.getParent(); parent instanceof ViewGroup; parent = ((View) parent).getParent()) {
            if (parent == viewGroup) {
                TouchDelegate touchDelegate = viewGroup.getTouchDelegate();
                try {
                    if (touchDelegate instanceof C19713812Bc) {
                        C19713812Bc c19713812Bc = (C19713812Bc) touchDelegate;
                        C19713712Bb c19713712Bb = new C19713712Bb(rect, view, viewGroup);
                        c19713812Bc.getClass();
                        c19713712Bb.LIZJ.addOnAttachStateChangeListener(new C12YN(c19713812Bc, c19713712Bb, 1));
                        ((LinkedList) c19713812Bc.LIZ).add(c19713712Bb);
                    } else {
                        if (touchDelegate != null) {
                            C1647306ch.LIZ(null, "touchDelegate is not TouchDelegateGroup, please check TouchDelegateUtils", false);
                        }
                        C19713812Bc c19713812Bc2 = new C19713812Bc(view);
                        viewGroup.setTouchDelegate(c19713812Bc2);
                        C19713712Bb c19713712Bb2 = new C19713712Bb(rect, view, viewGroup);
                        c19713712Bb2.LIZJ.addOnAttachStateChangeListener(new C12YN(c19713812Bc2, c19713712Bb2, 1));
                        ((LinkedList) c19713812Bc2.LIZ).add(c19713712Bb2);
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    viewGroup.setTouchDelegate(touchDelegate);
                    C1647306ch.LIZ(null, "expandHitRect will crash, please check TouchDelegateUtils", false);
                    C1AF0.LJ(thM5exceptionOrNullimpl);
                    return;
                }
                return;
            }
        }
        C201955140j.LIZLLL(C830690WiJ.LIZIZ, "TouchDelegateUtils", "please check the relationship between target view and parent");
    }
}
