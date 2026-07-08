package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0lyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogC1378340lyK extends C19GU {
    public final View LLILZLL;
    public boolean LLIZ;

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.LLIZ = false;
        C1378370lyN.LIZ.getClass();
        C1378370lyN.LIZ();
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.LLIZ != z) {
            if (z) {
                C1378370lyN.LIZ.getClass();
                C1378370lyN.LIZIZ(this);
            } else {
                C1378370lyN.LIZ.getClass();
                C1378370lyN.LIZ();
            }
            this.LLIZ = z;
        }
    }

    public DialogC1378340lyK(Context context, View view) {
        C19EG c19eg;
        super(context, R.style.ji);
        this.LLILZLL = view;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        setContentView(view);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
            window2.addFlags(2);
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ instanceof C19EG) {
                c19eg = (C19EG) activityLIZ;
            } else {
                c19eg = null;
            }
            if (c19eg == null) {
                window2.getAttributes().height = -2;
            } else {
                try {
                    TuxImmersionBar tuxImmersionBarLJFF = C1766560w4U.LJFF(c19eg, this);
                    tuxImmersionBarLJFF.LJIIJJI();
                    tuxImmersionBarLJFF.LIZLLL();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                window2.getAttributes().height = -1;
            }
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.dimAmount = 0.0f;
            attributes.gravity = 81;
            attributes.width = -1;
            this.LLILZLL.setFitsSystemWindows(true);
            window2.setSoftInputMode(16);
        }
    }
}
