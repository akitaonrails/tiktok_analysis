package X;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0sEz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@InterfaceC20647615qs("explore_rename_community")
public final class C1619310sEz extends C10GR {
    public static final AtomicBoolean LLILLL = new AtomicBoolean(false);
    public final C19EG LL;
    public final View LLILLJJLI;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        if (((Number) C276690Ast.LIZ.getValue()).intValue() != 1 || LLILLL.get()) {
            return false;
        }
        return (((Boolean) C276700Asu.LIZ.getValue()).booleanValue() && ((Keva) C1619330sF1.LIZ.getValue()).getBoolean("has_shown", false)) ? false : true;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        if (this.LL.isFinishing() || this.LL.isDestroyed()) {
            return null;
        }
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    public C1619310sEz(View view, C19EG c19eg) {
        this.LL = c19eg;
        this.LLILLJJLI = view;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
        int i;
        if (!LLILLL.compareAndSet(false, true)) {
            c20656615sK.LIZ();
            return;
        }
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.EXPLORE;
        C1906460zi8 c1906460zi8 = new C1906460zi8("explore_rename_community", enumC1584360rKc, false, Mp4ScreenVideoLoadTimeout.CONTROL, EnumC1619300sEy.NO_OPERATION, null);
        C1905750zgz c1905750zgz = C1905750zgz.LIZIZ;
        if (c1905750zgz.LJ(c1906460zi8) instanceof C1619160sEk) {
            c20656615sK.LIZ();
            return;
        }
        Context context = c688120Qyw.LIZ;
        View view = this.LLILLJJLI;
        TextView textView = (TextView) view.findViewById(R.id.text1);
        if (textView != null) {
            Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
            i = -((int) ((textView.getHeight() - (fontMetrics.descent - fontMetrics.ascent)) / 2));
        } else {
            i = 0;
        }
        C450720Hlu c450720Hlu = new C450720Hlu(new ContextThemeWrapper(context, com.zhiliaoapp.musically.R.style.z4));
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
        c1391600mJi2.LJIIIIZZ = iLIZIZ;
        c1391600mJi2.LJFF = i;
        c450720Hlu.LLILZ = context.getString(2131829919);
        C1391600mJi c1391600mJi3 = c450720Hlu.LLILLJJLI;
        c1391600mJi3.LJIJJ = false;
        c1391600mJi3.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
        C1905770zh1.LIZJ(c450720Hlu, "explore_rename_community", true, new View.OnClickListener() { // from class: X.0sF2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        });
        C1905770zh1.LIZIZ(c450720Hlu, "explore_rename_community", enumC1584360rKc, AFwS213S0000000_24.get$arr$(690));
        C1905770zh1.LIZ(c450720Hlu, "explore_rename_community", enumC1584360rKc, new AwS603S0100000_24(c20656615sK, 697));
        C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
        C1584580rKy.LIZ = c0p0tLIZIZ;
        c1905750zgz.LJFF(C1904960zfi.LIZ("explore_rename_community", enumC1584360rKc).LIZ(c0p0tLIZIZ), new InterfaceC1906540ziG() { // from class: X.0sF0
            @Override // X.InterfaceC1906540ziG
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1906540ziG
            public final void onDismiss() {
            }

            @Override // X.InterfaceC1906540ziG
            public final void onShow() {
            }

            @Override // X.InterfaceC1906540ziG
            public final void LIZ(C1619160sEk c1619160sEk) {
                C20656615sK c20656615sK2 = c20656615sK;
                if (c20656615sK2 != null) {
                    c20656615sK2.LIZ();
                }
            }
        });
    }
}
