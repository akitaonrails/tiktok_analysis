package X;

import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Y0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12Y0 extends AbstractC712240Rwk {
    public final int $t;
    public Object l0;

    public static final void onPageSelected$0(C12Y0 c12y0, int i) {
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.$t != 0) {
            super.onPageScrolled(i, f, i2);
        } else {
            onPageScrolled$0(this, i, f, i2);
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
                onPageSelected$2(this, i);
                break;
            default:
                super.onPageSelected(i);
                break;
        }
    }

    public C12Y0(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageSelected$1(C12Y0 c12y0, int i) {
        C194340111m c194340111m = (C194340111m) c12y0.l0;
        T t = c194340111m.LIZ;
        if (t != 0) {
            c194340111m.LIZ(t);
            c194340111m.LIZIZ(t);
            AbstractC194339111l.LJI(c194340111m, new AwS430S0200000_29(c194340111m, (AbstractC194339111l<int>) t, 99));
        }
    }

    public static final void onPageSelected$2(C12Y0 c12y0, int i) {
        String string;
        CharSequence charSequence;
        ((C194350111w) c12y0.l0).getProxyPanel().LIZIZ = i;
        C194350111w c194350111w = (C194350111w) c12y0.l0;
        C1846060y8i c1846060y8i = null;
        if (Intrinsics.LJFF(((LinkedHashMap) c194350111w.LLJJI).get(c194350111w.getCurTabName()), Boolean.TRUE)) {
            View view = ((C194350111w) c12y0.l0).LLJ;
            if (view == null) {
                view = null;
            }
            C786410Ut5.LJLLLLLL(0, view);
        } else {
            View view2 = ((C194350111w) c12y0.l0).LLJ;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(8, view2);
        }
        C194350111w c194350111w2 = (C194350111w) c12y0.l0;
        C386190FCf c386190FCf = c194350111w2.LLJJ;
        if (c386190FCf != null) {
            C1846060y8i c1846060y8i2 = c194350111w2.LLILLJJLI;
            if (c1846060y8i2 != null) {
                c1846060y8i = c1846060y8i2;
            }
            C1845940y8W c1845940y8WLJII = c1846060y8i.LJII(i);
            if (c1845940y8WLJII == null || (charSequence = c1845940y8WLJII.LIZJ) == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            if (string.length() != 0) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("tab_name", string);
                c386190FCf.LIZIZ(c2344009Gk);
                C20684815ws.LJIILLIIL("click_voice_filter_tab", c2344009Gk.LIZ);
            }
        }
    }

    public static final void onPageScrolled$0(C12Y0 c12y0, int i, float f, int i2) {
        float f2 = i + f;
        C12EU c12eu = (C12EU) ((C12EV) c12y0.l0).LLJJJJ.getValue();
        int i3 = c12eu.LLILZIL;
        if (i3 > 0) {
            c12eu.LLILZLL = f2;
            if (i3 <= 7) {
                c12eu.LLIZ = 0.0f;
                c12eu.LIZ();
            } else {
                float f3 = f2 - 4.0f;
                float f4 = f2 - 2.0f;
                float f5 = c12eu.LLIZ;
                if (f5 >= f3) {
                    if (f5 > f4) {
                        f3 = f4;
                    } else {
                        f3 = f5;
                    }
                }
                float fMax = Math.max(0.0f, Math.min(i3 - 7, f3));
                float f6 = c12eu.LLILZLL;
                float fAbs = Math.abs(f6 - ((float) Math.rint(f6)));
                if (fAbs < 0.1f) {
                    float f7 = (0.1f - fAbs) / 0.1f;
                    fMax = (fMax * (1.0f - f7)) + (((float) Math.rint(fMax)) * f7);
                }
                c12eu.LLIZ = fMax;
                c12eu.LIZ();
            }
        }
        if (f < 0.5d) {
            ((C12EV) c12y0.l0).LLJJL = i;
        } else {
            ((C12EV) c12y0.l0).LLJJL = i + 1;
        }
    }
}
