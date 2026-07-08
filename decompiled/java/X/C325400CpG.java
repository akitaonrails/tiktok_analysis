package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.watchfocus.WatchFocusPresenter$showWatchFocusDelay$1$1", f = "WatchFocusPresenter.kt", l = {124, 132}, m = "invokeSuspend")
public final class C325400CpG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C325420CpI LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C325400CpG(long j, boolean z, C325420CpI c325420CpI, long j2, boolean z2, InterfaceC1364105Vn<? super C325400CpG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = c325420CpI;
        this.LLILZIL = j2;
        this.LLILZLL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C325400CpG(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "WatchFocusPresenter@2a96.showWatchFocusDelay$1$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L3e
            if (r0 == r2) goto L4f
            if (r0 != r3) goto L73
            X.C155000ia.LIZIZ(r7)
        L16:
            boolean r0 = r6.LLILZLL
            if (r0 == 0) goto L36
            X.0CpI r0 = r6.LLILZ
            X.0CpH r0 = r0.LIZLLL
            r0.LLLLZLLLI()
        L21:
            X.0CpI r0 = r6.LLILZ
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r0.LIZIZ
            java.lang.Class<X.0ThU> r2 = X.C753740ThU.class
            r0 = 0
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            r3.SX0(r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L36:
            X.0CpI r0 = r6.LLILZ
            X.0CpH r0 = r0.LIZLLL
            r0.LLL()
            goto L21
        L3e:
            X.C155000ia.LIZIZ(r7)
            long r0 = r6.LLILLJJLI
            r6.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r4) goto L52
            X.C1C7U.LIZIZ(r5)
            return r4
        L4f:
            X.C155000ia.LIZIZ(r7)
        L52:
            boolean r0 = r6.LLILLL
            if (r0 == 0) goto L6b
            X.0CpI r0 = r6.LLILZ
            X.0CpH r0 = r0.LIZLLL
            r0.c()
        L5d:
            long r0 = r6.LLILZIL
            r6.LL = r3
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r4) goto L16
            X.C1C7U.LIZIZ(r5)
            return r4
        L6b:
            X.0CpI r0 = r6.LLILZ
            X.0CpH r0 = r0.LIZLLL
            r0.T0()
            goto L5d
        L73:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C325400CpG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
