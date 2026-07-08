package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.interestfeedbackbuttoncomponent.AnoleInterestFeedbackButtonModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS697S0100000_16;

/* JADX INFO: renamed from: X.0cJM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006980cJM extends AbstractC1014240cV4 {
    public EnumC1007000cJO LLJLIL;
    public final AnoleInterestFeedbackButtonModel LLJLILLLLZIIL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILJJIL() {
        return true;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return this.LLJLIL == EnumC1007000cJO.LLILLL ? new C1014500cVU(false, "feedback_consumed") : new C1014500cVU(true, null);
    }

    public static final void LJJ(String str) {
        Fragment fragmentLIZLLL;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZLLL);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        ViewTreeObserver viewTreeObserver;
        View view = this.LLJJIJIL;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        View view2 = this.LLJJIJIL;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            ViewTreeObserverOnPreDrawListenerC1077330e8p viewTreeObserverOnPreDrawListenerC1077330e8p = new ViewTreeObserverOnPreDrawListenerC1077330e8p(view2, this, 3);
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1077330e8p);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1077330e8p, ViewTreeObserver.OnPreDrawListener.class);
        }
        super.LJII(anoleComponentAppearModel);
        if (this.LLJLIL == EnumC1007000cJO.LL) {
            this.LLJLIL = EnumC1007000cJO.LLILLJJLI;
        }
        C1006990cJN c1006990cJN = C1006990cJN.LIZ;
        Keva keva = C1006990cJN.LIZIZ;
        c1006990cJN.getClass();
        keva.storeLong(C1006990cJN.LIZ("last_interest_feedback_show_time"), System.currentTimeMillis());
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        EnumC1007000cJO enumC1007000cJO;
        C197039127h c197039127h;
        Integer num;
        Integer num2;
        super.Fk(viewGroup, interfaceC1014340cVE);
        AnoleInterestFeedbackButtonModel anoleInterestFeedbackButtonModel = this.LLJLILLLLZIIL;
        if (anoleInterestFeedbackButtonModel == null || (enumC1007000cJO = this.LLJLIL) == EnumC1007000cJO.LLILLL) {
            return;
        }
        if (enumC1007000cJO == EnumC1007000cJO.LL) {
            C1006990cJN.LIZ.getClass();
            Integer num3 = anoleInterestFeedbackButtonModel.pauseDaysAfterShow;
            if (num3 != null && num3.intValue() >= 0) {
                long jIntValue = ((long) anoleInterestFeedbackButtonModel.pauseDaysAfterShow.intValue()) * 86400000;
                Keva keva = C1006990cJN.LIZIZ;
                long j = keva.getLong(C1006990cJN.LIZ("last_interest_feedback_show_time"), 0L);
                if ((j > 0 && System.currentTimeMillis() - j <= jIntValue) || (num = anoleInterestFeedbackButtonModel.pauseDaysAfterClick) == null || num.intValue() < 0) {
                    return;
                }
                long jIntValue2 = ((long) anoleInterestFeedbackButtonModel.pauseDaysAfterClick.intValue()) * 86400000;
                long j2 = keva.getLong(C1006990cJN.LIZ("last_interest_feedback_feedback_time"), 0L);
                if ((j2 > 0 && System.currentTimeMillis() - j2 <= jIntValue2) || (num2 = anoleInterestFeedbackButtonModel.itemCount) == null || num2.intValue() < 0 || C1006960cJK.LIZIZ.LJII() < anoleInterestFeedbackButtonModel.itemCount.intValue() || anoleInterestFeedbackButtonModel.displayProbability == null || C1006990cJN.LIZJ.nextFloat() >= anoleInterestFeedbackButtonModel.displayProbability.floatValue()) {
                    return;
                }
            } else {
                return;
            }
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.pm, viewGroup, false);
        this.LLJJIJIL = viewTd;
        C197039127h c197039127h2 = null;
        if (viewTd != null) {
            c197039127h = (C197039127h) viewTd.findViewById(R.id.d7t);
        } else {
            c197039127h = null;
        }
        View view = this.LLJJIJIL;
        if (view != null) {
            c197039127h2 = (C197039127h) view.findViewById(R.id.d7l);
        }
        if (c197039127h != null) {
            c197039127h.setText(this.LLJLILLLLZIIL.buttonNoText);
        }
        if (c197039127h2 != null) {
            c197039127h2.setText(this.LLJLILLLLZIIL.buttonYesText);
        }
        if (Intrinsics.LJFF(this.LLJLILLLLZIIL.shouldShowIcon, Boolean.TRUE)) {
            if (c197039127h != null) {
                c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_x_mark));
            }
            if (c197039127h2 != null) {
                c197039127h2.setButtonStartIcon(Integer.valueOf(R.raw.icon_tick_fill_small));
            }
        }
        for (C197039127h c197039127h3 : C1697810uHb.LJIIJJI(c197039127h, c197039127h2)) {
            if (c197039127h3 != null) {
                c197039127h3.setTuxFont(52);
                c197039127h3.setTextColorRes(R.attr.zi);
                c197039127h3.LJJJJLI(true);
                c197039127h3.setMinTextSize(11.0f);
                c197039127h3.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                c197039127h3.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                C631450Opj.LIZ(c197039127h3, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
                c197039127h3.LJJJJL(new AwS595S0100000_16(viewGroup, 354));
            }
        }
        if (c197039127h2 != null) {
            C786410Ut5.I7(new AbS697S0100000_16(this, 8), c197039127h2);
        }
        if (c197039127h != null) {
            C786410Ut5.I7(new AbS697S0100000_16(this, 9), c197039127h);
        }
        C2271391DvN.LIZ(c197039127h, (C1A5L) C2271381DvM.g.getValue());
        C2271391DvN.LIZ(c197039127h2, (C1A5L) C2271381DvM.f.getValue());
        this.LLJJI = new C1009390cNF(-1.0d, -2.0d);
    }

    public C1006980cJM(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        Object c098200Yq;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = EnumC1007000cJO.LL;
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map<String, ? extends Object> map = anoleComponentModel.data;
            c1227904rF.getClass();
            c098200Yq = (AnoleInterestFeedbackButtonModel) C1227904rF.LIZIZ(C1227904rF.LJI(map), AnoleInterestFeedbackButtonModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        this.LLJLILLLLZIIL = (AnoleInterestFeedbackButtonModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }
}
