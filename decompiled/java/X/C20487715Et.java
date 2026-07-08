package X;

import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.15Et, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownViewModel$onVsAnimationStart$1", f = "MatchCountDownViewModel.kt", l = {86}, m = "invokeSuspend")
public final class C20487715Et extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MatchCountDownViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20487715Et(MatchCountDownViewModel matchCountDownViewModel, InterfaceC1364105Vn<? super C20487715Et> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = matchCountDownViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20487715Et(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        String str2;
        C1C7U.LIZ("MatchCountDownViewModel@197b.onVsAnimationStart$1");
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
            C20488215Ey<C20487815Eu> c20488215Ey = this.LLILLJJLI.LLILLJJLI;
            this.LL = 1;
            obj = c20488215Ey.LIZIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MatchCountDownViewModel@197b.onVsAnimationStart$1");
                return objLJFF;
            }
        }
        C20487815Eu c20487815Eu = (C20487815Eu) obj;
        if (c20487815Eu == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MatchCountDownViewModel@197b.onVsAnimationStart$1");
            return unit;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVsAnimationStart source image=");
        sbLIZ.append(c20487815Eu.LIZ.LIZ);
        sbLIZ.append(" arrow=");
        C20486515Eh c20486515Eh = c20487815Eu.LJ;
        if (c20486515Eh == null || (obj2 = c20486515Eh.LIZ) == null) {
            obj2 = "default";
        }
        sbLIZ.append(obj2);
        sbLIZ.append(" text=");
        if (c20487815Eu.LIZJ.LIZ != null) {
            str = "server_or_rule_text";
        } else {
            str = "normal_text";
        }
        sbLIZ.append(str);
        sbLIZ.append(" jump=");
        String str3 = c20487815Eu.LJI;
        if (str3 != null && !a0.LJJJIL(str3)) {
            str2 = "schema";
        } else if (c20487815Eu.LJFF != null) {
            str2 = "target";
        } else {
            str2 = "none";
        }
        sbLIZ.append(str2);
        C20441214yg.LJIIIZ("MatchCountDownViewModel", C2188811AlT.LIZIZ(sbLIZ));
        MatchCountDownViewModel matchCountDownViewModel = this.LLILLJJLI;
        matchCountDownViewModel.setState(new AwS397S0200000_31(c20487815Eu, matchCountDownViewModel, 87));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MatchCountDownViewModel@197b.onVsAnimationStart$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
