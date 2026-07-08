package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestPageVM;
import com.ss.android.ugc.aweme.im.contacts.api.model.MessageRequestSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS593S0100000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Yof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestPageVM$onPrepared$1", f = "MessageRequestPageVM.kt", l = {109}, m = "invokeSuspend")
public final class C885590Yof extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageRequestPageVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C885590Yof(MessageRequestPageVM messageRequestPageVM, InterfaceC1364105Vn<? super C885590Yof> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageRequestPageVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C885590Yof(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestPageVM@32a0.onPrepared$1");
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
                C1C7U.LIZIZ("MessageRequestPageVM@32a0.onPrepared$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.setState(new AwS593S0100000_14((MessageRequestSetting) obj, 46));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestPageVM@32a0.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
