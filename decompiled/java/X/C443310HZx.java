package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingHorizontalAssem;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingHorizontalAssem$processAnimation$2", f = "TakoOnBoardingHorizontalCell.kt", l = {325}, m = "invokeSuspend")
public final class C443310HZx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC443320HZy LLILLJJLI;
    public final /* synthetic */ TakoOnboardingHorizontalAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C443310HZx(AbstractC443320HZy abstractC443320HZy, TakoOnboardingHorizontalAssem takoOnboardingHorizontalAssem, InterfaceC1364105Vn<? super C443310HZx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC443320HZy;
        this.LLILLL = takoOnboardingHorizontalAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C443310HZx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoOnboardingHorizontalAssem@a86d.processAnimation$2");
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
            long j = this.LLILLJJLI.LIZ;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("TakoOnboardingHorizontalAssem@a86d.processAnimation$2");
                return objLJFF;
            }
        }
        TakoOnboardingHorizontalAssem takoOnboardingHorizontalAssem = this.LLILLL;
        AbstractC443320HZy abstractC443320HZy = this.LLILLJJLI;
        Context context = takoOnboardingHorizontalAssem.getContentView().getContext();
        C21647019ng c21647019ng = new C21647019ng(context, takoOnboardingHorizontalAssem.getContentView(), new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.33f), new C1342130l1v(0.86f), new C1342130l1v(0.2f), new C1342130l1v(1.0f), 350L), Collections.singletonList(new C19746412Nq("alpha_anim", new C0HUY(0.0f, 1.0f)))), false);
        View contentView = takoOnboardingHorizontalAssem.getContentView();
        EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.SPRING;
        C21647019ng c21647019ng2 = new C21647019ng(context, contentView, new C19746312Np(enumC19746112Nn, new C0HU6(new C1342130l1v(88.0f), new C1342130l1v(14.071f)), C1697810uHb.LJIIJJI(new C19746412Nq("scale_x_anim", new C0HIW(0.85f, 1.0f)), new C19746412Nq("scale_y_anim", new C0HIX(0.85f, 1.0f)))), false);
        C21647019ng c21647019ng3 = new C21647019ng(context, takoOnboardingHorizontalAssem.getContentView(), new C19746312Np(enumC19746112Nn, new C0HU6(new C1342130l1v(88.0f), new C1342130l1v(14.071f)), Collections.singletonList(new C19746412Nq("translation_x_anim", new C082N(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(abstractC443320HZy.LIZIZ))), 0.0f)))), false);
        C21647019ng c21647019ng4 = new C21647019ng(context, takoOnboardingHorizontalAssem.getContentView(), new C19746312Np(enumC19746112Nn, new C0HU6(new C1342130l1v(88.0f), new C1342130l1v(14.071f)), Collections.singletonList(new C19746412Nq("translation_y_anim", new C0HV5(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(abstractC443320HZy.LIZJ))), 0.0f)))), false);
        C21647019ng c21647019ng5 = new C21647019ng(context, takoOnboardingHorizontalAssem.getContentView(), new C19746312Np(enumC19746112Nn, new C0HU6(new C1342130l1v(88.0f), new C1342130l1v(14.071f)), Collections.singletonList(new C19746412Nq("rotation_anim", new C1880107Xz(abstractC443320HZy.LIZLLL, abstractC443320HZy.LJ)))), false);
        c21647019ng.LJI(true);
        c21647019ng2.LJI(true);
        c21647019ng3.LJI(true);
        c21647019ng4.LJI(true);
        c21647019ng5.LJI(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoOnboardingHorizontalAssem@a86d.processAnimation$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
