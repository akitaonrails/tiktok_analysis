package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS478S0200000_9;
import njp.a;

/* JADX INFO: renamed from: X.0Nny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.view.invite.BulletinInviteDelegate$bind$1", f = "BulletinInviteDelegate.kt", l = {49}, m = "invokeSuspend")
public final class C604880Nny extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C616980OHw LLILLJJLI;
    public final /* synthetic */ C604810Nnr LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C604880Nny(C616980OHw c616980OHw, C604810Nnr c604810Nnr, InterfaceC1364105Vn<? super C604880Nny> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c616980OHw;
        this.LLILLL = c604810Nnr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C604880Nny(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinInviteDelegate@2245.bind$1");
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
            C616980OHw c616980OHw = this.LLILLJJLI;
            AwS478S0200000_9 awS478S0200000_9 = new AwS478S0200000_9(c616980OHw, this.LLILLL, 5);
            this.LL = 1;
            if (c616980OHw.LIZIZ(awS478S0200000_9, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinInviteDelegate@2245.bind$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinInviteDelegate@2245.bind$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
