package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0IA8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel$fetchMsgByIdAndSetMsgToReply$1", f = "SendMessageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0IA8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SendMessageViewModel LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IA8(SendMessageViewModel sendMessageViewModel, Long l, long j, InterfaceC1364105Vn<? super C0IA8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sendMessageViewModel;
        this.LLILLJJLI = l;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0IA8(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        C1C7U.LIZ("SendMessageViewModel@52c6.fetchMsgByIdAndSetMsgToReply$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String message = null;
        try {
            pair = new Pair(((C0I39) this.LL.LLILZIL.getValue()).LIZ(this.LLILLJJLI.longValue()), null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            pair = new Pair(null, e);
        }
        C869590Y9l c869590Y9l = (C869590Y9l) pair.getFirst();
        Exception exc = (Exception) pair.getSecond();
        SendMessageViewModel sendMessageViewModel = this.LL;
        if (sendMessageViewModel.LLILLL != this.LLILLL) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SendMessageViewModel@52c6.fetchMsgByIdAndSetMsgToReply$1");
            return unit;
        }
        if (c869590Y9l != null) {
            sendMessageViewModel.setState(new AwS585S0100000_6(c869590Y9l, 420));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fail ");
            if (exc != null) {
                message = exc.getMessage();
            }
            sbLIZ.append(message);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LL.setState(new AwS585S0100000_6(exc, 421));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SendMessageViewModel@52c6.fetchMsgByIdAndSetMsgToReply$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
