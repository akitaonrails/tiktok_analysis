package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterPinPageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0DNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterPinPageAssem$pinListener$2$1$onInputComplete$1", f = "EnterPinPageAssem.kt", l = {389, 400}, m = "invokeSuspend")
public final class C338090DNf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EnterPinPageAssem LLILLL;
    public final /* synthetic */ CharSequence LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C338090DNf(EnterPinPageAssem enterPinPageAssem, CharSequence charSequence, InterfaceC1364105Vn<? super C338090DNf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = enterPinPageAssem;
        this.LLILZ = charSequence;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C338090DNf c338090DNf = new C338090DNf(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c338090DNf.LLILLJJLI = obj;
        return c338090DNf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EnterPinPageAssem@83fb.pinListener$2$1$onInputComplete$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String string = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EnterPinPageAssem@83fb.pinListener$2$1$onInputComplete$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLL.lp().getState().LLILLL;
            if (str == null) {
                EnterPinPageAssem enterPinPageAssem = this.LLILLL;
                Context context = enterPinPageAssem.getContext();
                if (context != null) {
                    string = context.getString(2131834217);
                }
                enterPinPageAssem.hp(string);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("EnterPinPageAssem@83fb.pinListener$2$1$onInputComplete$1");
                return unit2;
            }
            CampusFlowViewModel campusFlowViewModelIp = this.LLILLL.ip();
            C0DHZ c0dhz = this.LLILLL.lp().getState().LLILLJJLI;
            String strValueOf = String.valueOf(this.LLILZ);
            this.LL = 1;
            obj = campusFlowViewModelIp.xQ2(c0dhz, strValueOf, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EnterPinPageAssem@83fb.pinListener$2$1$onInputComplete$1");
                return objLJFF;
            }
        }
        C443120HZe c443120HZe = (C443120HZe) obj;
        Object first = c443120HZe.getFirst();
        String str2 = (String) c443120HZe.getSecond();
        Integer num = (Integer) c443120HZe.getThird();
        EnterPinPageAssem enterPinPageAssem2 = this.LLILLL;
        enterPinPageAssem2.LLLFZ = false;
        TuxTextView tuxTextView = enterPinPageAssem2.LLJJJJLIIL;
        if (tuxTextView != null) {
            tuxTextView.setEnabled(true);
        }
        this.LLILLL.mp();
        if (first == EnumC337930DMp.SUCCEED_ADD) {
            C0DOO c0doo = C0DOO.LIZ;
            C1245860iWe enterFrom = this.LLILLL.ip().getEnterFrom();
            EnumC330310CxB enumC330310CxB = EnumC330310CxB.SUCCESS;
            c0doo.getClass();
            C0DOO.LJIILL(enterFrom, enumC330310CxB);
            this.LLILLL.lp().xQ2().LIZLLL();
            CampusFlowViewModel campusFlowViewModelIp2 = this.LLILLL.ip();
            this.LL = 2;
            if (campusFlowViewModelIp2.zQ2(this) == objLJFF) {
                C1C7U.LIZIZ("EnterPinPageAssem@83fb.pinListener$2$1$onInputComplete$1");
                return objLJFF;
            }
        } else {
            C0DOO c0doo2 = C0DOO.LIZ;
            C1245860iWe enterFrom2 = this.LLILLL.ip().getEnterFrom();
            EnumC330310CxB enumC330310CxB2 = EnumC330310CxB.FAIL;
            c0doo2.getClass();
            C0DOO.LJIILL(enterFrom2, enumC330310CxB2);
            if (num != null && num.intValue() == 3002535) {
                C0DOO.LJII(C0DNU.WRONG_CODE, C0DNV.ENTER_PIN_PAGE);
            } else if (Intrinsics.LJFF(str2, "Error, please try again")) {
                C0DOO.LJII(C0DNU.NETWORK_ISSUE_CODE, C0DNV.ENTER_PIN_PAGE);
            } else {
                C0DOO.LJII(C0DNU.SAVE_SCHOOL_FAIL, C0DNV.ENTER_PIN_PAGE);
            }
            C1754640vlG c1754640vlG = this.LLILLL.LLJJJJ;
            if (c1754640vlG != null) {
                c1754640vlG.LJ("", true);
            }
            EnterPinPageAssem enterPinPageAssem3 = this.LLILLL;
            if (str2 == null) {
                Context context2 = enterPinPageAssem3.getContext();
                if (context2 != null) {
                    string = context2.getString(2131847010);
                }
            } else {
                string = str2;
            }
            enterPinPageAssem3.hp(string);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EnterPinPageAssem@83fb.pinListener$2$1$onInputComplete$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
