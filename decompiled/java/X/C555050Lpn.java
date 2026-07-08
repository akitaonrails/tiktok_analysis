package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Lpn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiuikit.impl.input.mentionpanel.component.InputMentionPanelComponent$searchMentionUsers$2", f = "InputMentionPanelComponent.kt", l = {281}, m = "invokeSuspend")
public final class C555050Lpn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1279504zZ LLILLJJLI;
    public final /* synthetic */ C555030Lpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555050Lpn(C1279504zZ c1279504zZ, C555030Lpl c555030Lpl, InterfaceC1364105Vn<? super C555050Lpn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1279504zZ;
        this.LLILLL = c555030Lpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C555050Lpn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InputMentionPanelComponent@aece.searchMentionUsers$2");
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
            if (this.LLILLJJLI.LIZ.length() == 0) {
                C555030Lpl c555030Lpl = this.LLILLL;
                this.LL = 1;
                obj = c555030Lpl.F4(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("InputMentionPanelComponent@aece.searchMentionUsers$2");
                    return objLJFF;
                }
            } else {
                this.LLILLL.i3(new AwS587S0100000_8(this.LLILLJJLI, 51));
                this.LLILLL.P4().getOperator().refresh();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("InputMentionPanelComponent@aece.searchMentionUsers$2");
                return unit;
            }
        }
        this.LLILLL.i3(new AwS374S0200000_8((List) obj, (List<C555070Lpp>) this.LLILLJJLI, (C1279504zZ) 18));
        this.LLILLL.P4().getOperator().refresh();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InputMentionPanelComponent@aece.searchMentionUsers$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
