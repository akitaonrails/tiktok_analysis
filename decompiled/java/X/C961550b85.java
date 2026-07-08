package X;

import Y.AgS296S0100000_15;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0b85, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListFragmentV2$observeViewModel$1", f = "MultiHostInviteListFragmentV2.kt", l = {344}, m = "invokeSuspend")
public final class C961550b85 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MultiHostInviteListFragmentV2 LLILLJJLI;
    public final /* synthetic */ C961560b86 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C961550b85(MultiHostInviteListFragmentV2 multiHostInviteListFragmentV2, C961560b86 c961560b86, InterfaceC1364105Vn<? super C961550b85> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = multiHostInviteListFragmentV2;
        this.LLILLL = c961560b86;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C961550b85(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiHostInviteListFragmentV2@b7f0.observeViewModel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951LIZ = ((InterfaceC961810b8V) this.LLILLJJLI.LLLII.getValue()).LIZ();
            AgS296S0100000_15 agS296S0100000_15 = new AgS296S0100000_15(this.LLILLL, 6);
            this.LL = 1;
            if (anonymousClass0951LIZ.collect(agS296S0100000_15, this) == objLJFF) {
                C1C7U.LIZIZ("MultiHostInviteListFragmentV2@b7f0.observeViewModel$1");
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
