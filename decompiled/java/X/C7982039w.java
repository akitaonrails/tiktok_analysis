package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.039w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7982039w {
    public static final void LIZ(View view, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        ViewGroup viewGroup2;
        if (view == null) {
            return;
        }
        try {
            if (Intrinsics.LJFF(view.getParent(), viewGroup)) {
                return;
            }
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(view, viewGroup2);
                }
            }
            viewGroup.addView(view, layoutParams);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
