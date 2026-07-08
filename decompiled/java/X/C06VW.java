package X;

import Y.AgS193S0200000_2;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.fragment.EditShareSelectFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06VW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.fragment.EditShareSelectFragment$initTuxNavBar$2", f = "EditShareSelectFragment.kt", l = {349}, m = "invokeSuspend")
public final class C06VW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EditShareSelectFragment LLILLJJLI;
    public final /* synthetic */ TuxNavBar LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06VW(EditShareSelectFragment editShareSelectFragment, TuxNavBar tuxNavBar, InterfaceC1364105Vn<? super C06VW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = editShareSelectFragment;
        this.LLILLL = tuxNavBar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06VW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditShareSelectFragment@a63b.initTuxNavBar$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            EditShareSelectFragment editShareSelectFragment = this.LLILLJJLI;
            C2252321DDq c2252321DDq = editShareSelectFragment.LLLFF;
            AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(this.LLILLL, editShareSelectFragment, 9);
            this.LL = 1;
            if (c2252321DDq.collect(agS193S0200000_2, this) == objLJFF) {
                C1C7U.LIZIZ("EditShareSelectFragment@a63b.initTuxNavBar$2");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
