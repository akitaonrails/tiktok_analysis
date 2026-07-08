package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Chf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.handlers.MessageOperatorHandler$handleMessageReceive$2", f = "MessageOperatorHandler.kt", l = {379}, m = "invokeSuspend")
public final class C320690Chf extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C321020CiC LLILLJJLI;
    public final /* synthetic */ Message LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C321240CiY LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320690Chf(C321020CiC c321020CiC, Message message, int i, C321240CiY c321240CiY, InterfaceC1364105Vn<? super C320690Chf> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c321020CiC;
        this.LLILLL = message;
        this.LLILZ = i;
        this.LLILZIL = c321240CiY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320690Chf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@3dad.handleMessageReceive$2");
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
            C05YC c05ycLIZ = C320640Cha.LJIIJ.LIZ(C2286608xc.LJ(this.LLILLJJLI.LJIIIIZZ.LJ), C2286608xc.LJFF(this.LLILLJJLI.LJIIIIZZ.LIZLLL));
            if (c05ycLIZ != null) {
                C321110CiL c321110CiL = new C321110CiL(EnumC320720Chi.NEW, Collections.singletonList(this.LLILLL), false, false, false, this.LLILZ, null, this.LLILZIL, 92);
                this.LL = 1;
                if (c05ycLIZ.emit(c321110CiL, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageOperatorHandler@3dad.handleMessageReceive$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@3dad.handleMessageReceive$2");
        return unit;
    }
}
