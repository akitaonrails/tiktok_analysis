package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.periodic.BulletinSubscribePeriodicHandler$startPolling$1", f = "BulletinSubscribePeriodicHandler.kt", l = {79, 80}, m = "invokeSuspend")
public final class C617370OJj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C617360OJi LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C617370OJj(C617360OJi c617360OJi, InterfaceC1364105Vn<? super C617370OJj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c617360OJi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C617370OJj c617370OJj = new C617370OJj(this.LLILLL, interfaceC1364105Vn);
        c617370OJj.LLILLJJLI = obj;
        return c617370OJj;
    }

    /* JADX WARN: Path cross not found for [B:16:0x0037, B:30:0x0067], limit reached: 44 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0085 -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r13 = "BulletinSubscribePeriodicHandler@f270.startPolling$1"
            X.C1C7U.LIZ(r13)
            java.lang.Object r10 = X.C099R.LJFF()
            int r0 = r14.LL
            r9 = 2
            r8 = 1
            if (r0 == 0) goto L8b
            if (r0 == r8) goto L74
            if (r0 != r9) goto L99
            java.lang.Object r1 = r14.LLILLJJLI
            X.01wk r1 = (X.InterfaceC497601wk) r1
            X.C155000ia.LIZIZ(r15)
        L1a:
            boolean r0 = X.C2296808zG.LJI(r1)
            if (r0 == 0) goto L93
            X.0OJi r11 = r14.LLILLL
            r11.getClass()
            com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinWithDrawConfig r12 = X.C617420OJo.LIZ
            java.lang.Integer r0 = r12.enableLimit
            if (r0 == 0) goto L72
            int r0 = r0.intValue()
            if (r0 != r8) goto L72
            r0 = 1
        L32:
            r2 = 180000(0x2bf20, double:8.8932E-319)
            if (r0 == 0) goto L67
            long r6 = r11.LIZLLL
            long r4 = r11.LIZJ
            long r6 = r6 - r4
            java.lang.Long r0 = r12.withDrawLimitTotalTime
            if (r0 == 0) goto L63
            long r4 = r0.longValue()
        L44:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L67
            com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinPeriodicRequestSettingItem r0 = r11.LIZIZ
            java.lang.Long r0 = r0.shortPollingInterval
            if (r0 == 0) goto L60
            long r2 = r0.longValue()
        L52:
            r14.LLILLJJLI = r1
            r14.LL = r8
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r14)
            if (r0 != r10) goto L7b
            X.C1C7U.LIZIZ(r13)
            return r10
        L60:
            r2 = 10000(0x2710, double:4.9407E-320)
            goto L52
        L63:
            r4 = 180000(0x2bf20, double:8.8932E-319)
            goto L44
        L67:
            com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinPeriodicRequestSettingItem r0 = r11.LIZIZ
            java.lang.Long r0 = r0.longPollingInterval
            if (r0 == 0) goto L52
            long r2 = r0.longValue()
            goto L52
        L72:
            r0 = 0
            goto L32
        L74:
            java.lang.Object r1 = r14.LLILLJJLI
            X.01wk r1 = (X.InterfaceC497601wk) r1
            X.C155000ia.LIZIZ(r15)
        L7b:
            X.0OJi r0 = r14.LLILLL
            r14.LLILLJJLI = r1
            r14.LL = r9
            java.lang.Object r0 = r0.LIZIZ(r14)
            if (r0 != r10) goto L1a
            X.C1C7U.LIZIZ(r13)
            return r10
        L8b:
            X.C155000ia.LIZIZ(r15)
            java.lang.Object r1 = r14.LLILLJJLI
            X.01wk r1 = (X.InterfaceC497601wk) r1
            goto L1a
        L93:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r13)
            return r0
        L99:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C617370OJj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
