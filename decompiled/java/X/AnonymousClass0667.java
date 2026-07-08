package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0667, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.monitor.StreakFakeWriteMonitor$monitorDataUpdate$1", f = "StreakFakeWriteMonitor.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0667 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StreakData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0667(StreakData streakData, InterfaceC1364105Vn<? super AnonymousClass0667> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = streakData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0667(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "StreakFakeWriteMonitor@39fe.monitorDataUpdate$1"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            r0 = 2
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            com.ss.android.ugc.aweme.im.streak.api.StreakData r0 = r5.LL
            java.lang.String r1 = r0.source
            java.lang.String r0 = "fake_write"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L73
            java.lang.String r2 = "1"
        L1c:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "isFakeData"
            r1.<init>(r0, r2)
            r0 = 0
            r3[r0] = r1
            com.ss.android.ugc.aweme.im.streak.api.StreakData r0 = r5.LL
            java.lang.String r2 = r0.convId
            if (r2 != 0) goto L2e
            java.lang.String r2 = ""
        L2e:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "conversation_id"
            r1.<init>(r0, r2)
            r0 = 1
            r3[r0] = r1
            java.util.Map r3 = X.C2097608Jq.LJIIIIZZ(r3)
            X.0I0B r2 = X.C0I0B.LJFF
            r2.LIZJ()
            boolean r0 = X.C894660Z7w.LIZLLL()
            if (r0 != 0) goto L50
            r2.LIZJ()
            boolean r0 = X.C894660Z7w.LJ()
            if (r0 == 0) goto L65
        L50:
            boolean r0 = X.C1590906Kt.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "streak_fake_data_update, "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1590906Kt.LIZ(r0)
        L65:
            r2.LIZIZ()
            java.lang.String r0 = "streak_fake_data_update"
            X.C20684815ws.LJIILLIIL(r0, r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L73:
            java.lang.String r2 = "0"
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0667.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
