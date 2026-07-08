package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingVerticalAssem;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingVerticalAssem$processAnimation$2", f = "TakoOnboardingVerticalCell.kt", l = {114}, m = "invokeSuspend")
public final class C443300HZw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ TakoOnboardingVerticalAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C443300HZw(int i, TakoOnboardingVerticalAssem takoOnboardingVerticalAssem, InterfaceC1364105Vn<? super C443300HZw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = takoOnboardingVerticalAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C443300HZw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoOnboardingVerticalAssem@8d69.processAnimation$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = ((long) this.LLILLJJLI) * 80;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("TakoOnboardingVerticalAssem@8d69.processAnimation$2");
                return objLJFF;
            }
        }
        TakoOnboardingVerticalAssem takoOnboardingVerticalAssem = this.LLILLL;
        Context context = takoOnboardingVerticalAssem.getContentView().getContext();
        C21647019ng c21647019ng = new C21647019ng(context, takoOnboardingVerticalAssem.getContentView(), new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.33f), new C1342130l1v(0.86f), new C1342130l1v(0.2f), new C1342130l1v(1.0f), 250L), Collections.singletonList(new C19746412Nq("alpha_anim", new C0HUY(0.0f, 1.0f)))), false);
        View contentView = takoOnboardingVerticalAssem.getContentView();
        EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.SPRING;
        C21647019ng c21647019ng2 = new C21647019ng(context, contentView, new C19746312Np(enumC19746112Nn, new C0HU6(new C1342130l1v(321.0f), new C1342130l1v(22.252f)), C1697810uHb.LJIIJJI(new C19746412Nq("scale_x_anim", new C0HIW(0.85f, 1.0f)), new C19746412Nq("scale_y_anim", new C0HIX(0.85f, 1.0f)))), false);
        C21647019ng c21647019ng3 = new C21647019ng(context, takoOnboardingVerticalAssem.getContentView(), new C19746312Np(enumC19746112Nn, new C0HU6(new C1342130l1v(321.0f), new C1342130l1v(22.252f)), Collections.singletonList(new C19746412Nq("translation_y_anim", new C0HV5(30.0f, 0.0f)))), false);
        c21647019ng.LJI(true);
        c21647019ng2.LJI(true);
        c21647019ng3.LJI(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoOnboardingVerticalAssem@8d69.processAnimation$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
