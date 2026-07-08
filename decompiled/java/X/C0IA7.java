package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0IA7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel$fetchMsgByIdxAndSetMsgToReply$1", f = "SendMessageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0IA7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SendMessageViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IA7(SendMessageViewModel sendMessageViewModel, String str, long j, long j2, Function0<Unit> function0, InterfaceC1364105Vn<? super C0IA7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sendMessageViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0IA7(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        C0IAH c0iaa;
        C1C7U.LIZ("SendMessageViewModel@52c6.fetchMsgByIdxAndSetMsgToReply$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            pair = new Pair(((C0I39) this.LL.LLILZIL.getValue()).LIZIZ(this.LLILLL, this.LLILLJJLI), null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            pair = new Pair(null, e);
        }
        Object first = pair.getFirst();
        Object second = pair.getSecond();
        if (this.LL.LLILLL != this.LLILZ) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SendMessageViewModel@52c6.fetchMsgByIdxAndSetMsgToReply$1");
            return unit;
        }
        if (first != null) {
            c0iaa = new C0IA9(first);
        } else {
            String str = this.LLILLJJLI;
            long j = this.LLILLL;
            C0I0B.LJFF.LIZIZ();
            C830490Whz c830490Whz = new C830490Whz();
            c830490Whz.put("conversation_id", str);
            c830490Whz.put("index", String.valueOf(j));
            C20684815ws.LJIILLIIL("reply_message_not_found", c830490Whz);
            c0iaa = new C0IAA(second);
        }
        this.LL.setState(new AwS585S0100000_6(c0iaa, (C0IAH<? extends Object>) 422));
        Function0<Unit> function0 = this.LLILZIL;
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SendMessageViewModel@52c6.fetchMsgByIdxAndSetMsgToReply$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
