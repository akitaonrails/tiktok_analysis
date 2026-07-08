package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestRootPageVM;
import com.ss.android.ugc.aweme.im.contacts.api.model.MessageRequestSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS593S0100000_14;
import njp.a;

/* JADX INFO: renamed from: X.0YsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestRootPageVM$onPrepared$1", f = "MessageRequestRootPageVM.kt", l = {39}, m = "invokeSuspend")
public final class C887890YsN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageRequestRootPageVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C887890YsN(MessageRequestRootPageVM messageRequestRootPageVM, InterfaceC1364105Vn<? super C887890YsN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageRequestRootPageVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C887890YsN(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestRootPageVM@69cc.onPrepared$1");
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
            this.LL = 1;
            obj = c885630Yoj.LJI(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MessageRequestRootPageVM@69cc.onPrepared$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.setState(new AwS593S0100000_14((MessageRequestSetting) obj, 47));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestRootPageVM@69cc.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
