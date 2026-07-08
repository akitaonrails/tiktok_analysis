package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.Extra;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Chd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.handlers.MessageOperatorHandler$handleMessageUpdate$1", f = "MessageOperatorHandler.kt", l = {335}, m = "invokeSuspend")
public final class C320670Chd extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C321020CiC LLILLJJLI;
    public final /* synthetic */ Message LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Extra LLILZLL;
    public final /* synthetic */ C321240CiY LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320670Chd(C321020CiC c321020CiC, Message message, int i, String str, Extra extra, C321240CiY c321240CiY, InterfaceC1364105Vn<? super C320670Chd> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c321020CiC;
        this.LLILLL = message;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = extra;
        this.LLIZ = c321240CiY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320670Chd(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@3dad.handleMessageUpdate$1");
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
            C05YC c05ycLIZIZ = C320640Cha.LJIIJ.LIZIZ(C2286608xc.LJ(this.LLILLJJLI.LJIIIIZZ.LJ), C2286608xc.LJFF(this.LLILLJJLI.LJIIIIZZ.LIZLLL));
            if (c05ycLIZIZ != null) {
                C321120CiM c321120CiM = new C321120CiM(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ);
                this.LL = 1;
                if (c05ycLIZIZ.emit(c321120CiM, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageOperatorHandler@3dad.handleMessageUpdate$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@3dad.handleMessageUpdate$1");
        return unit;
    }
}
