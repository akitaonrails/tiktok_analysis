package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.model.IconTextInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QWX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QWX extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0QWU LL;
    public final /* synthetic */ ViewGroup LLILLJJLI;
    public final /* synthetic */ TextView LLILLL;
    public final /* synthetic */ C259800zU<C671660QWe> LLILZ;
    public final /* synthetic */ C670090QQd LLILZIL;
    public final /* synthetic */ IconTextInfo LLILZLL;
    public final /* synthetic */ C671720QWk LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QWX(C0QWU c0qwu, ViewGroup viewGroup, TextView textView, C259800zU<C671660QWe> c259800zU, C670090QQd c670090QQd, IconTextInfo iconTextInfo, C671720QWk c671720QWk) {
        super(0);
        this.LL = c0qwu;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = textView;
        this.LLILZ = c259800zU;
        this.LLILZIL = c670090QQd;
        this.LLILZLL = iconTextInfo;
        this.LLIZ = c671720QWk;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        float f = C0QWW.LIZ;
        C0QWU c0qwu = this.LL;
        ViewGroup viewGroup = this.LLILLJJLI;
        TextView textView = this.LLILLL;
        C671660QWe c671660QWe = this.LLILZ.element;
        C670090QQd c670090QQd = this.LLILZIL;
        IconTextInfo iconTextInfo = this.LLILZLL;
        C671720QWk c671720QWk = this.LLIZ;
        try {
            if (viewGroup.getChildCount() <= 0 && c671720QWk != null && c671720QWk.LIZ > 0 && c671720QWk.LIZIZ > 0 && c671720QWk.LIZLLL > 0 && c671720QWk.LJ > 0) {
                C786410Ut5.T4(c671660QWe.LIZ, 0.5f);
                int i = c671720QWk.LIZ;
                int i2 = c671720QWk.LIZIZ;
                int i3 = c671720QWk.LIZJ;
                C680790Qn7 c680790Qn7 = C680790Qn7.LIZ;
                View view = c671660QWe.LIZ;
                c680790Qn7.getClass();
                if (view.getMeasuredWidth() == 0) {
                    view.measure(0, 0);
                }
                int measuredWidth = view.getMeasuredWidth();
                float f2 = C0QWW.LIZ;
                int iLIZIZ = measuredWidth + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f2)));
                if (i2 != 0 && i3 != 0) {
                    C671620QWa c671620QWa = new C671620QWa(i, c671720QWk, i3, c0qwu, viewGroup, c670090QQd, textView);
                    C0QWY c0qwy = new C0QWY(c0qwu, c671720QWk, textView, viewGroup, c670090QQd);
                    int i4 = i2 - i3;
                    if (i4 >= iLIZIZ) {
                        c671620QWa.invoke(Integer.valueOf(iLIZIZ), c671660QWe);
                    } else {
                        int i5 = C0QNJ.LIZIZ[C0QWW.LJ(iconTextInfo).ordinal()];
                        if (i5 == 1) {
                            c0qwy.invoke(Integer.valueOf(iLIZIZ), c671660QWe);
                        } else if (i5 == 2) {
                            C337180DJs.LIZ(viewGroup);
                        } else {
                            if (i5 != 3) {
                                throw new C1954807lC();
                            }
                            if (c671660QWe.LIZJ == EnumC671630QWb.TEXT) {
                                C337180DJs.LIZ(viewGroup);
                            } else {
                                C671660QWe c671660QWeLIZLLL = C0QWW.LIZLLL(c671660QWe);
                                c671660QWeLIZLLL.LIZ.measure(0, 0);
                                int measuredWidth2 = c671660QWeLIZLLL.LIZ.getMeasuredWidth() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f2)));
                                C0QWW.LJFF(c0qwu, iconTextInfo, c671660QWeLIZLLL);
                                if (i4 >= measuredWidth2) {
                                    c671620QWa.invoke(Integer.valueOf(measuredWidth2), c671660QWeLIZLLL);
                                } else {
                                    c0qwy.invoke(Integer.valueOf(measuredWidth2), c671660QWeLIZLLL);
                                }
                            }
                        }
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
