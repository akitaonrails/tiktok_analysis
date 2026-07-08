package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.quickmention.IQuickMentionLogicAbility;
import com.ss.android.ugc.aweme.comment.quickmention.QuickMentionLogicComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HnN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.quickmention.QuickMentionLogicComponent$logicInit$1$1", f = "QuickMentionLogicComponent.kt", l = {95}, m = "invokeSuspend")
public final class C451630HnN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ QuickMentionLogicComponent LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451630HnN(QuickMentionLogicComponent quickMentionLogicComponent, C19EG c19eg, InterfaceC1364105Vn<? super C451630HnN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = quickMentionLogicComponent;
        this.LLILLL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C451630HnN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickMentionLogicComponent@beeb.logicInit$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("QuickMentionLogicComponent@beeb.logicInit$1$1");
                return objLJFF;
            }
        }
        C622680Oba.LIZJ(this.LLILLJJLI);
        if (C724240Sb0.LIZ(this.LLILLJJLI) == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("QuickMentionLogicComponent@beeb.logicInit$1$1");
            return unit;
        }
        C1558520qew.LJII(C1558360qeg.LJI(this.LLILLL, null), this.LLILLJJLI, IQuickMentionLogicAbility.class, null, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onParentSet: ");
        if (this.LLILLJJLI.LLILLL.getValue() != null) {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        QuickMentionLogicComponent quickMentionLogicComponent = this.LLILLJJLI;
        C736680Sv4.LJIIIIZZ(quickMentionLogicComponent, (AssemViewModel) quickMentionLogicComponent.LL.getValue(), new C2217381BqS() { // from class: X.0lB1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1347810lB5) obj2).LL;
            }
        }, C736820SvI.LIZLLL(), new C1350690lFj(quickMentionLogicComponent), 4);
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) quickMentionLogicComponent.LLILLL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0((C1350680lFi) quickMentionLogicComponent.LLILZ.getValue());
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("QuickMentionLogicComponent@beeb.logicInit$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
