package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayViewModel$fetch$1", f = "ECLiveVideoReplayViewModel.kt", l = {48}, m = "invokeSuspend")
public final class C1568750qvR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public MutableLiveData LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ ECLiveVideoReplayViewModel LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568750qvR(ECLiveVideoReplayViewModel eCLiveVideoReplayViewModel, String str, String str2, String str3, InterfaceC1364105Vn<? super C1568750qvR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = eCLiveVideoReplayViewModel;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1568750qvR(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "ECLiveVideoReplayViewModel@d990.fetch$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r8 = 1
            if (r0 == 0) goto L1d
            if (r0 != r8) goto L15
            long r1 = r10.LL
            androidx.lifecycle.MutableLiveData r6 = r10.LLILLJJLI
            goto L40
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1d:
            X.C155000ia.LIZIZ(r11)
            long r1 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayViewModel r0 = r10.LLILZ     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L7c
            androidx.lifecycle.MutableLiveData<X.0r1A> r6 = r0.LL     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L7c
            X.188E r5 = com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayViewModel.LLILLL     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L7c
            java.lang.String r4 = r10.LLILZIL     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L7c
            java.lang.String r3 = r10.LLILZLL     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L7c
            java.lang.String r0 = r10.LLIZ     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L7c
            r10.LLILLJJLI = r6     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L7c
            r10.LL = r1     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L7c
            r10.LLILLL = r8     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L7c
            java.lang.Object r11 = r5.LIZ(r4, r3, r0, r10)     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L7c
            if (r11 != r7) goto L43
            X.C1C7U.LIZIZ(r9)
            return r7
        L40:
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L7c
        L43:
            r6.postValue(r11)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L7c
            goto L76
        L47:
            r3 = move-exception
            goto L4a
        L49:
            r3 = move-exception
        L4a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayViewModel r0 = r10.LLILZ
            androidx.lifecycle.MutableLiveData<X.0r1A> r7 = r0.LL
            X.188H r6 = new X.188H
            java.lang.String r5 = r3.getMessage()
            if (r5 != 0) goto L61
            java.lang.Class r0 = r3.getClass()
            java.lang.String r5 = r0.getSimpleName()
        L61:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6e
            r3 = 0
        L6e:
            int r1 = (int) r3
            r0 = -3
            r6.<init>(r0, r1, r5, r8)
            r7.postValue(r6)
        L76:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1568750qvR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
