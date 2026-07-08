package X;

import Y.AfS176S0100000_7;
import Y.AkS0S1500100_7;
import Y.AkS52S0210000_7;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.fans.PolingSuperFanContractStatusResult;

/* JADX INFO: renamed from: X.0KP8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.revenue.level.impl.superfan.payment.impl.pay.FanQueryOrderRepo$pollingCheckOrder$pollResult$1", f = "FanQueryOrderRepo.kt", l = {106}, m = "invokeSuspend")
public final class C0KP8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0KPC>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0KP7 LLILLL;
    public final /* synthetic */ C0KP3 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C118300cf LLILZLL;
    public final /* synthetic */ C118300cf LLIZ;
    public final /* synthetic */ long[] LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KP8(C0KP7 c0kp7, C0KP3 c0kp3, String str, C118300cf c118300cf, C118300cf c118300cf2, long[] jArr, long j, boolean z, InterfaceC1364105Vn<? super C0KP8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0kp7;
        this.LLILZ = c0kp3;
        this.LLILZIL = str;
        this.LLILZLL = c118300cf;
        this.LLIZ = c118300cf2;
        this.LLIZLLLIL = jArr;
        this.LLJ = j;
        this.LLJI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KP8(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C11NZ<R> c11nzLJJJ;
        Object objLIZ = obj;
        C1C7U.LIZ("FanQueryOrderRepo@67ce.pollingCheckOrder$pollResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C0KP7 c0kp7 = this.LLILLL;
            C0KP3 c0kp3 = this.LLILZ;
            String str = this.LLILZIL;
            C118300cf c118300cf = this.LLILZLL;
            C118300cf c118300cf2 = this.LLIZ;
            long[] jArr = this.LLIZLLLIL;
            long j = this.LLJ;
            boolean z = this.LLJI;
            this.LL = str;
            this.LLILLJJLI = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C11NZ<C470590Icr<PolingSuperFanContractStatusResult>> c11nzLJ = c0kp7.LIZIZ.LJ(c0kp3.LJIIIZ, str);
            if (c11nzLJ != null && (c11nzLJJJ = c11nzLJ.LJJJ(new AkS0S1500100_7(str, c118300cf, j, c118300cf2, jArr, c0kp7, c0kp3, 0), false)) != 0) {
                c11nzLJJJ.LJJLIIIJLJLI(new AkS52S0210000_7(c118300cf2, jArr, z, 0)).LJJLL(new AfS176S0100000_7(c23260099m, 1), new AfS176S0100000_7(c23260099m, 2));
            }
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("FanQueryOrderRepo@67ce.pollingCheckOrder$pollResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FanQueryOrderRepo@67ce.pollingCheckOrder$pollResult$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0KPC> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
