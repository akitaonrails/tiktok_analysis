package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Nfr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.component.surveybutton.BottomSurveyButtonClickEvent$invoke$4", f = "FeedBottomSurveySensor.kt", l = {}, m = "invokeSuspend")
public final class C599850Nfr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C599830Nfp LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C599850Nfr(C599830Nfp c599830Nfp, String str, InterfaceC1364105Vn<? super C599850Nfr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c599830Nfp;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C599850Nfr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function0<C690870R8b> function0;
        C690870R8b c690870R8bInvoke;
        C0RJN c0rjnLIZIZ;
        Fragment fragment;
        IViewPagerComponentAbility iViewPagerComponentAbility;
        C1C7U.LIZ("BottomSurveyButtonClickEvent@6221.invoke$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C704830Rkn c704830Rkn = this.LL.LL;
        if (c704830Rkn != null && (function0 = c704830Rkn.LIZ) != null && (c690870R8bInvoke = function0.invoke()) != null && (c0rjnLIZIZ = c690870R8bInvoke.LIZIZ()) != null && (fragment = c0rjnLIZIZ.LJ) != null) {
            if (!fragment.isAdded()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BottomSurveyButtonClickEvent@6221.invoke$4");
                return unit;
            }
            if (Intrinsics.LJFF(this.LLILLJJLI, "like")) {
                C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                c1389890mGx.LJIIIZ(2131857834);
                c1389890mGx.LJIIJJI();
                this.LL.getClass();
                C1389890mGx c1389890mGx2 = new C1389890mGx(fragment);
                c1389890mGx2.LJIIIZ(2131857834);
                c1389890mGx2.LJIIJJI();
            } else if (Intrinsics.LJFF(this.LLILLJJLI, "dislike")) {
                this.LL.getClass();
                C1389890mGx c1389890mGx3 = new C1389890mGx(fragment);
                c1389890mGx3.LJIIIZ(2131857835);
                c1389890mGx3.LJIIJJI();
                this.LL.getClass();
                InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(fragment);
                if (interfaceC665370Q7zLJ != null && (iViewPagerComponentAbility = (IViewPagerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IViewPagerComponentAbility.class, null)) != null) {
                    iViewPagerComponentAbility.rH();
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("BottomSurveyButtonClickEvent@6221.invoke$4");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("BottomSurveyButtonClickEvent@6221.invoke$4");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
