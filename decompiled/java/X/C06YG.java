package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06YG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.data.datasource.StreakInlineMsgModel$checkFrequencyControl$2$1$1", f = "StreakInlineMsgModel.kt", l = {}, m = "invokeSuspend")
public final class C06YG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C06YD LL;
    public final /* synthetic */ FakeMessage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06YG(C06YD c06yd, FakeMessage fakeMessage, InterfaceC1364105Vn<? super C06YG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c06yd;
        this.LLILLJJLI = fakeMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06YG(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakInlineMsgModel@79c4.checkFrequencyControl$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1674906h9 c1674906h9 = (C1674906h9) this.LL.LJ.getValue();
        c1674906h9.LIZ.storeLong("streak_continue_last_allowed_order", this.LLILLJJLI.getOrderIndex());
        this.LL.LJIIIIZZ = true;
        C1755106u5 c1755106u5 = this.LL.LJIIJ;
        if (c1755106u5 != null) {
            c1755106u5.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakInlineMsgModel@79c4.checkFrequencyControl$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
