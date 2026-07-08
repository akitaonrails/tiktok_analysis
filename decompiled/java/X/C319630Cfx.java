package X;

import defpackage.w2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cfx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ui.TakoChatRootFragment$attachChatFragmentWithLoading$4$4$pullNewCompleteDeferred$1", f = "TakoChatRootFragment.kt", l = {339}, m = "invokeSuspend")
public final class C319630Cfx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super w2>, Object> {
    public int LL;
    public final /* synthetic */ C1863380yae LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319630Cfx(C1863380yae c1863380yae, InterfaceC1364105Vn<? super C319630Cfx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1863380yae;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319630Cfx(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoChatRootFragment@b942.attachChatFragmentWithLoading$4$4$pullNewCompleteDeferred$1");
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
            C05YC c05ycLIZ = C1863380yae.LJJII.LIZ(C2286608xc.LJ(this.LLILLJJLI.LJIIIIZZ), C2286608xc.LJFF(this.LLILLJJLI.LJII), this.LLILLJJLI.LJIILIIL);
            if (c05ycLIZ != null) {
                C346450Di7 c346450Di7 = new C346450Di7(c05ycLIZ, 4);
                this.LL = 1;
                obj = C09IC.LJIIZILJ(c346450Di7, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoChatRootFragment@b942.attachChatFragmentWithLoading$4$4$pullNewCompleteDeferred$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("TakoChatRootFragment@b942.attachChatFragmentWithLoading$4$4$pullNewCompleteDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super w2> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
