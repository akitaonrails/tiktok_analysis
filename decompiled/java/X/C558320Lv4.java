package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Lv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558320Lv4 implements InterfaceC554250LoV, InterfaceC1391500mJY {
    public final Function0<Context> LL;
    public final Function0<Activity> LLILLL;
    public final LifecycleOwner LLILZ;
    public RunnableC558310Lv3 LLIZ;
    public boolean LLIZLLLIL;
    public C0P0T LLJ;
    public final View LLILLJJLI = null;
    public int LLILZIL = -1;
    public int LLILZLL = -1;

    @Override // X.InterfaceC1391500mJY
    public final void LLLL(int i) {
    }

    @Override // X.InterfaceC554250LoV
    public final void LIZ(int i) {
        C0P0T c0p0t;
        C0P0T c0p0t2 = this.LLJ;
        if (c0p0t2 != null && c0p0t2.isShowing() && i == this.LLILZIL && (c0p0t = this.LLJ) != null) {
            c0p0t.dismiss();
        }
    }

    @Override // X.InterfaceC1391500mJY
    public final void LJJIIJ(int i) {
        C0P0T c0p0t = this.LLJ;
        if (c0p0t != null) {
            c0p0t.LJ();
        }
    }

    @Override // X.InterfaceC1391500mJY
    public final void LJZI(int i) {
        C0P0T c0p0t = this.LLJ;
        if (c0p0t != null) {
            c0p0t.LJ();
        }
    }

    public C558320Lv4(AwS552S0100000_8 awS552S0100000_8, AwS552S0100000_8 awS552S0100000_82, LifecycleOwner lifecycleOwner) {
        this.LL = awS552S0100000_8;
        this.LLILLL = awS552S0100000_82;
        this.LLILZ = lifecycleOwner;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Lv3, java.lang.Runnable] */
    @Override // X.InterfaceC554250LoV
    public final void LIZIZ(final int i, final View view, final String str) {
        if (!this.LLIZLLLIL) {
            try {
                Function0<Activity> function0 = this.LLILLL;
                if (function0 != null) {
                    Activity activityInvoke = function0.invoke();
                    if (activityInvoke != null) {
                        new SoftKeyBoardListener(activityInvoke, null, null, this.LLILZ, 4).LIZIZ(this);
                    }
                }
                this.LLIZLLLIL = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        C0P0T c0p0t = this.LLJ;
        if ((c0p0t != null && c0p0t.isShowing()) || i <= this.LLILZLL) {
            return;
        }
        RunnableC558310Lv3 runnableC558310Lv3 = this.LLIZ;
        if (runnableC558310Lv3 != null) {
            C0CNO.LIZ.removeCallbacks(runnableC558310Lv3);
        }
        this.LLILZLL = i;
        ?? r2 = new Runnable() { // from class: X.0Lv3
            public final void LIZ() {
                C558320Lv4 c558320Lv4 = this.LL;
                View view2 = view;
                String str2 = str;
                c558320Lv4.getClass();
                Context contextInvoke = c558320Lv4.LL.invoke();
                if (contextInvoke != null) {
                    C450720Hlu c450720Hlu = new C450720Hlu(contextInvoke);
                    if (view2 != null || (view2 = c558320Lv4.LLILLJJLI) != null) {
                        c450720Hlu.LLILLJJLI.LIZIZ = view2;
                        c450720Hlu.LJII(R.attr.ee);
                        c450720Hlu.LLILLJJLI.LIZLLL = EnumC1235690iGF.TOP;
                        c450720Hlu.LLILZ = str2;
                        C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
                        c0p0tLIZIZ.show();
                        c558320Lv4.LLJ = c0p0tLIZIZ;
                    }
                }
                C558320Lv4 c558320Lv42 = this.LL;
                c558320Lv42.LLILZLL = -1;
                c558320Lv42.LLILZIL = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AITheaterPriorityTooltipOperator@983e.requestShowToolTips$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AITheaterPriorityTooltipOperator@983e.requestShowToolTips$1");
            }
        };
        this.LLIZ = r2;
        C0CNO.LIZJ(300L, r2);
    }
}
