package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0IAF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel$sendMessage$6", f = "SendMessageViewModel.kt", l = {176}, m = "invokeSuspend")
public final class C0IAF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05YC<C0IAH<Object>> LLILLJJLI;
    public final /* synthetic */ SendMessageViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IAF(C05YC<C0IAH<Object>> c05yc, SendMessageViewModel sendMessageViewModel, InterfaceC1364105Vn<? super C0IAF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05yc;
        this.LLILLL = sendMessageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0IAF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMessageViewModel@52c6.sendMessage$6");
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
            C05YC<C0IAH<Object>> c05yc = this.LLILLJJLI;
            C0IAE c0iae = new C0IAE(null);
            this.LL = 1;
            obj = C09IC.LJIJ(c05yc, this, c0iae);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SendMessageViewModel@52c6.sendMessage$6");
                return objLJFF;
            }
        }
        C0IAH c0iah = (C0IAH) obj;
        if (c0iah instanceof C0IA9) {
            this.LLILLL.setState(new AwS585S0100000_6(c0iah, (C0IAH<? extends Object>) 116));
        } else if (c0iah instanceof C0IAG) {
            SendMessageViewModel sendMessageViewModel = this.LLILLL;
            sendMessageViewModel.LLILLJJLI = 3;
            sendMessageViewModel.setState(new AwS585S0100000_6(c0iah, (C0IAH<? extends Object>) 117));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendMessageViewModel@52c6.sendMessage$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
