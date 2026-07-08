package X;

import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent;
import com.ss.android.ugc.aweme.im.streaming.sugar.internal.StreamingSugarImpl;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZfO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.sugar.internal.StreamingSugarImpl$insertAndStream$1", f = "StreamingSugarImpl.kt", l = {188}, m = "invokeSuspend")
public final class C905320ZfO extends C09AX implements Function2<InterfaceC346701Wf<? super InterfaceC905820ZgC>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C905350ZfR LLILLL;
    public final /* synthetic */ StreamingSugarImpl LLILZ;
    public final /* synthetic */ EnumC905800ZgA LLILZIL;
    public final /* synthetic */ RetryInfoComponent LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C905320ZfO(C905350ZfR c905350ZfR, StreamingSugarImpl streamingSugarImpl, EnumC905800ZgA enumC905800ZgA, RetryInfoComponent retryInfoComponent, InterfaceC1364105Vn<? super C905320ZfO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c905350ZfR;
        this.LLILZ = streamingSugarImpl;
        this.LLILZIL = enumC905800ZgA;
        this.LLILZLL = retryInfoComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C905320ZfO c905320ZfO = new C905320ZfO(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c905320ZfO.LLILLJJLI = obj;
        return c905320ZfO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1736806r8 c1736806r8LIZIZ;
        C1C7U.LIZ("StreamingSugarImpl@76a7.insertAndStream$1");
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
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            String string = this.LLILLL.LIZIZ;
            if (string.length() == 0) {
                string = UUID.randomUUID().toString();
            }
            InterfaceC905630Zft interfaceC905630Zft = this.LLILZ.LLILLJJLI;
            C905350ZfR c905350ZfR = this.LLILLL;
            interfaceC905630Zft.LJ(string, c905350ZfR.LIZ, c905350ZfR.LIZJ, this.LLILZIL, c905350ZfR.LJFF, c905350ZfR.LIZLLL, c905350ZfR.LJ);
            this.LLILZ.LLILLJJLI.LJII(string);
            FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) this.LLILZ.LLILZIL.getValue();
            if (fakeMsgOperatorService != null) {
                String str = this.LLILLL.LIZ;
                C1684506ih c1684506ih = new C1684506ih();
                c1684506ih.LIZLLL(53);
                c1684506ih.LIZJ = string;
                c1736806r8LIZIZ = fakeMsgOperatorService.LIZIZ(str, c1684506ih, null, null, null);
            } else {
                c1736806r8LIZIZ = null;
            }
            this.LLILZ.LLILLJJLI.LJIIIIZZ(string);
            if (c1736806r8LIZIZ == null) {
                this.LLILZ.LLILLJJLI.LJFF(string, EnumC905780Zg8.INSERT_CARD_FAILED, null, null, null, false, null);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StreamingSugarImpl@76a7.insertAndStream$1");
                return unit;
            }
            this.LLILZ.LLILLJJLI.LIZIZ(string);
            InterfaceC905750Zg5 interfaceC905750Zg5 = this.LLILZ.LL;
            C905350ZfR c905350ZfR2 = this.LLILLL;
            C095D c095dLIZJ = interfaceC905750Zg5.LIZJ(string, c905350ZfR2.LIZLLL, c905350ZfR2.LJ, c905350ZfR2.LIZ, c905350ZfR2.LIZJ, c905350ZfR2.LJFF, this.LLILZLL);
            this.LL = 1;
            if (C09IC.LJIILLIIL(this, c095dLIZJ, interfaceC346701Wf) == objLJFF) {
                C1C7U.LIZIZ("StreamingSugarImpl@76a7.insertAndStream$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StreamingSugarImpl@76a7.insertAndStream$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super InterfaceC905820ZgC> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
