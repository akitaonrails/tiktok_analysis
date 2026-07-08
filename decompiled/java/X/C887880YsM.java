package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestRootPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS132S0110000_14;
import njp.a;

/* JADX INFO: renamed from: X.0YsM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestRootPageVM$changePrioritySwitch$2", f = "MessageRequestRootPageVM.kt", l = {139}, m = "invokeSuspend")
public final class C887880YsM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ MessageRequestRootPageVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C887880YsM(boolean z, MessageRequestRootPageVM messageRequestRootPageVM, InterfaceC1364105Vn<? super C887880YsM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = messageRequestRootPageVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C887880YsM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestRootPageVM@69cc.changePrioritySwitch$2");
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
            C885630Yoj c885630Yoj = C885630Yoj.LIZ;
            boolean z = this.LLILLJJLI;
            boolean z2 = !z;
            AwS132S0110000_14 awS132S0110000_14 = new AwS132S0110000_14(this.LLILLL, z, 2);
            AwS132S0110000_14 awS132S0110000_142 = new AwS132S0110000_14(this.LLILLL, this.LLILLJJLI, 3);
            this.LL = 1;
            if (c885630Yoj.LJII(z2, awS132S0110000_14, awS132S0110000_142, this) == objLJFF) {
                C1C7U.LIZIZ("MessageRequestRootPageVM@69cc.changePrioritySwitch$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestRootPageVM@69cc.changePrioritySwitch$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
