package X;

import Y.ARunnableS15S0101000_4;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.ui.innerskylight.FollowingInnerSkylightAssem;
import com.ss.android.ugc.aweme.feed.ui.innerskylight.FollowingInnerSkylightAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DVF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.innerskylight.FollowingInnerSkylightAssem$initPowerList$2$3", f = "FollowingInnerSkylightAssem.kt", l = {171}, m = "invokeSuspend")
public final class C0DVF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FollowingInnerSkylightAssem LLILLJJLI;
    public final /* synthetic */ ViewOnAttachStateChangeListenerC20604515jv LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DVF(FollowingInnerSkylightAssem followingInnerSkylightAssem, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, InterfaceC1364105Vn<? super C0DVF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = followingInnerSkylightAssem;
        this.LLILLL = viewOnAttachStateChangeListenerC20604515jv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DVF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingInnerSkylightAssem@81e1.initPowerList$2$3");
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
            FollowingInnerSkylightAssemViewModel followingInnerSkylightAssemViewModelHp = this.LLILLJJLI.hp();
            followingInnerSkylightAssemViewModelHp.getClass();
            this.LLILLL.getState().LJIILL(followingInnerSkylightAssemViewModelHp.LL, null);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("FollowingInnerSkylightAssem@81e1.initPowerList$2$3");
                return objLJFF;
            }
        }
        FollowingInnerSkylightAssem followingInnerSkylightAssem = this.LLILLJJLI;
        FollowingInnerSkylightAssemViewModel followingInnerSkylightAssemViewModelHp2 = followingInnerSkylightAssem.hp();
        followingInnerSkylightAssemViewModelHp2.getClass();
        int i2 = followingInnerSkylightAssemViewModelHp2.LLILLJJLI;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = followingInnerSkylightAssem.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS15S0101000_4(viewOnAttachStateChangeListenerC20604515jv, i2, followingInnerSkylightAssem, 0));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingInnerSkylightAssem@81e1.initPowerList$2$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
