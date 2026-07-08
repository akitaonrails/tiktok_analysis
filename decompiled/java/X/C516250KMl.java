package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.model.CheckSubOrderResultStruct;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.payment.v2.implement.pay.QueryOrderRepo$pollingCheckOrder$pollResult$1", f = "QueryOrderRepo.kt", l = {123}, m = "invokeSuspend")
public final class C516250KMl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0KO2>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C516190KMf LLILLL;
    public final /* synthetic */ C0KJK LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C118300cf LLILZLL;
    public final /* synthetic */ C118300cf LLIZ;
    public final /* synthetic */ long[] LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C516250KMl(C516190KMf c516190KMf, C0KJK c0kjk, String str, C118300cf c118300cf, C118300cf c118300cf2, long[] jArr, long j, boolean z, InterfaceC1364105Vn<? super C516250KMl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c516190KMf;
        this.LLILZ = c0kjk;
        this.LLILZIL = str;
        this.LLILZLL = c118300cf;
        this.LLIZ = c118300cf2;
        this.LLIZLLLIL = jArr;
        this.LLJ = j;
        this.LLJI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C516250KMl(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C11NZ<R> c11nzLJJJ;
        Object objLIZ = obj;
        C1C7U.LIZ("QueryOrderRepo@6ab2.pollingCheckOrder$pollResult$1");
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
            final C516190KMf c516190KMf = this.LLILLL;
            final C0KJK c0kjk = this.LLILZ;
            final String str = this.LLILZIL;
            final C118300cf c118300cf = this.LLILZLL;
            final C118300cf c118300cf2 = this.LLIZ;
            final long[] jArr = this.LLIZLLLIL;
            final long j = this.LLJ;
            final boolean z = this.LLJI;
            this.LL = str;
            this.LLILLJJLI = 1;
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C11NZ<C470590Icr<CheckSubOrderResultStruct>> c11nzLJ = c516190KMf.LLILZIL.LJ(c0kjk.LJIIIZ, str);
            if (c11nzLJ != null && (c11nzLJJJ = c11nzLJ.LJJJ(new InterfaceC1487280oo2() { // from class: X.0KN3
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj2) {
                    BaseResponse baseResponse = (BaseResponse) obj2;
                    T t = baseResponse.data;
                    if (((CheckSubOrderResultStruct) t).status != 1) {
                        c118300cf.element = baseResponse.statusCode;
                        if (c118300cf2.element < jArr.length) {
                            C516470KNh c516470KNhLIZJ = C516190KMf.LIZJ(c516190KMf, c0kjk, str, System.currentTimeMillis() - j, c118300cf2.element, null, "retry", false, 80);
                            c516190KMf.LLILZIL.getClass();
                            AbstractC516390KMz.LIZ(c516470KNhLIZJ);
                        }
                        return C11NZ.LJJIJLIJ(new Exception("retry"));
                    }
                    return C11NZ.LJJJJZ(t);
                }
            }, false)) != 0) {
                c11nzLJJJ.LJJLIIIJLJLI(new InterfaceC1487280oo2() { // from class: X.0ItT
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj2) {
                        final C118300cf c118300cf3 = c118300cf2;
                        final long[] jArr2 = jArr;
                        final boolean z2 = z;
                        return ((C11NZ) obj2).LJJJ(new InterfaceC1487280oo2() { // from class: X.0ItQ
                            @Override // X.InterfaceC1487280oo2
                            public final Object apply(Object obj3) {
                                C118300cf c118300cf4 = c118300cf3;
                                int i2 = c118300cf4.element;
                                if (i2 >= 0) {
                                    long[] jArr3 = jArr2;
                                    if (i2 < jArr3.length && z2) {
                                        int i3 = i2 + 1;
                                        c118300cf4.element = i3;
                                        return C11NZ.LJJJJZ(obj3).LJJI(jArr3[i3 - 1], TimeUnit.MILLISECONDS);
                                    }
                                }
                                return C11NZ.LJJIJLIJ(new Throwable("retry reaches maximum"));
                            }
                        }, false);
                    }
                }).LJJLL(new C09JN() { // from class: X.0KNT
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("QueryOrderRepo@6ab2.pollingCheckOrder$pollResult$1$1$3");
                        InterfaceC1364105Vn<C0KO2> interfaceC1364105Vn = c23260099m;
                        C0KO2 c0ko2 = new C0KO2(true, (CheckSubOrderResultStruct) obj2, null);
                        C189200o6.m2constructorimpl(c0ko2);
                        interfaceC1364105Vn.resumeWith(c0ko2);
                        C1C7U.LIZIZ("QueryOrderRepo@6ab2.pollingCheckOrder$pollResult$1$1$3");
                    }
                }, new C09JN() { // from class: X.0KNU
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("QueryOrderRepo@6ab2.pollingCheckOrder$pollResult$1$1$4");
                        InterfaceC1364105Vn<C0KO2> interfaceC1364105Vn = c23260099m;
                        C0KO2 c0ko2 = new C0KO2(false, null, (Throwable) obj2);
                        C189200o6.m2constructorimpl(c0ko2);
                        interfaceC1364105Vn.resumeWith(c0ko2);
                        C1C7U.LIZIZ("QueryOrderRepo@6ab2.pollingCheckOrder$pollResult$1$1$4");
                    }
                });
            }
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("QueryOrderRepo@6ab2.pollingCheckOrder$pollResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("QueryOrderRepo@6ab2.pollingCheckOrder$pollResult$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0KO2> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
