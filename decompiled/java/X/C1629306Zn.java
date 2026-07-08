package X;

import Y.AgS193S0200000_2;
import android.view.View;
import com.ss.android.ugc.aweme.im.quickchat.ui.IMUnifiedQuickInputDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Zn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.ui.IMUnifiedQuickInputDialogFragment$onViewCreated$1", f = "IMUnifiedQuickInputDialogFragment.kt", l = {221, 222}, m = "invokeSuspend")
public final class C1629306Zn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ IMUnifiedQuickInputDialogFragment LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1629306Zn(IMUnifiedQuickInputDialogFragment iMUnifiedQuickInputDialogFragment, View view, InterfaceC1364105Vn<? super C1629306Zn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = iMUnifiedQuickInputDialogFragment;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1629306Zn c1629306Zn = new C1629306Zn(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1629306Zn.LLILLJJLI = obj;
        return c1629306Zn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("IMUnifiedQuickInputDialogFragment@9799.onViewCreated$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                throw new C2197108jB();
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            AnonymousClass0951 anonymousClass0951 = this.LLILLL.MR().LLIZ;
            C1629206Zm c1629206Zm = new C1629206Zm(null);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (C09IC.LJIJ(anonymousClass0951, this, c1629206Zm) == objLJFF) {
                C1C7U.LIZIZ("IMUnifiedQuickInputDialogFragment@9799.onViewCreated$1");
                return objLJFF;
            }
        }
        C2252321DDq c2252321DDq = this.LLILLL.MR().LLILZLL;
        AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(this.LLILZ, interfaceC497601wk, 4);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (c2252321DDq.collect(agS193S0200000_2, this) == objLJFF) {
            C1C7U.LIZIZ("IMUnifiedQuickInputDialogFragment@9799.onViewCreated$1");
            return objLJFF;
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
