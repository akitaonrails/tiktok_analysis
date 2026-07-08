package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0bUS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.tracer.score.MatchScoreAccuracyHelper$startPeriodicCheck$1", f = "MatchScoreAccuracyHelper.kt", l = {69}, m = "invokeSuspend")
public final class C975420bUS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C975420bUS(InterfaceC1364105Vn<? super C975420bUS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C975420bUS c975420bUS = new C975420bUS(interfaceC1364105Vn);
        c975420bUS.LLILLJJLI = obj;
        return c975420bUS;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "MatchScoreAccuracyHelper@1942.startPeriodicCheck$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 != r3) goto L49
            java.lang.Object r0 = r6.LLILLJJLI
            X.01wk r0 = (X.InterfaceC497601wk) r0
            X.C155000ia.LIZIZ(r7)
        L17:
            X.0bUU r1 = X.EnumC975440bUU.PERIODIC
            java.lang.String r2 = r1.getValue()
            r1 = -1
            X.C975400bUQ.LIZ(r1, r2)
        L21:
            boolean r1 = X.C2296808zG.LJI(r0)
            if (r1 == 0) goto L43
            com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchScoreTrackSetting r1 = com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchScoreTrackSetting.INSTANCE
            long r1 = r1.getPeriodicCheckInterval()
            r6.LLILLJJLI = r0
            r6.LL = r3
            java.lang.Object r1 = X.AnonymousClass0958.LIZIZ(r1, r6)
            if (r1 != r4) goto L17
            X.C1C7U.LIZIZ(r5)
            return r4
        L3b:
            X.C155000ia.LIZIZ(r7)
            java.lang.Object r0 = r6.LLILLJJLI
            X.01wk r0 = (X.InterfaceC497601wk) r0
            goto L21
        L43:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975420bUS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
