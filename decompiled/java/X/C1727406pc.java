package X;

import com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.06pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactManager$doRealNetworkRequest$2", f = "IMContactManager.kt", l = {899}, m = "invokeSuspend")
public final class C1727406pc extends C09AX implements Function1<InterfaceC1364105Vn<? super IMContactListResponse>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1727406pc(Integer num, Integer num2, int i, int i2, InterfaceC1364105Vn<? super C1727406pc> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLL = num;
        this.LLILZ = num2;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1727406pc(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super IMContactListResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:26:0x00aa
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "IMContactManager@fb8a.doRealNetworkRequest$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r13.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L1f
            if (r0 != r2) goto L17
            int r1 = r13.LL
            X.C155000ia.LIZIZ(r14)     // Catch: java.lang.Throwable -> L24
            goto La6
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1f:
            X.C155000ia.LIZIZ(r14)
            r1 = 0
            goto L5e
        L24:
            r0 = move-exception
        L25:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.1BG1 r4 = X.C1BG1.LIZ
            r4.getClass()
            java.lang.StringBuilder r5 = X.C2188811AlT.LIZ()
            java.lang.String r4 = "retryTimes= "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = ", error="
            r5.append(r4)
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L46
            java.lang.String r0 = "null stack message"
        L46:
            r5.append(r0)
            java.lang.String r5 = X.C2188811AlT.LIZIZ(r5)
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "monitorNetworkRequestError: errorStack="
            r4.append(r0)
            r4.append(r5)
            X.C2188811AlT.LIZIZ(r4)
            int r1 = r1 + 1
        L5e:
            com.ss.android.ugc.aweme.im.common.setting.IMContactSetting r0 = com.ss.android.ugc.aweme.im.common.setting.IMContactSetting.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.common.setting.IMContactSetting$ContactUserListConfig r0 = com.ss.android.ugc.aweme.im.common.setting.IMContactSetting.LIZ()
            int r0 = r0.userListRequestRetryCount
            if (r1 >= r0) goto Lb1
            X.1BG1 r0 = X.C1BG1.LIZ
            r0.getClass()
            boolean r0 = X.C1BG1.LJIJI()
            if (r0 != 0) goto Lb1
            X.01GW r0 = X.C1BG1.LJIIIZ     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r7 = r0.getValue()     // Catch: java.lang.Throwable -> Lad
            com.ss.android.ugc.aweme.im.contacts.impl.data.api.IMContactNetworkApi r7 = (com.ss.android.ugc.aweme.im.contacts.impl.data.api.IMContactNetworkApi) r7     // Catch: java.lang.Throwable -> Lad
            java.lang.Integer r8 = r13.LLILLL     // Catch: java.lang.Throwable -> Lad
            java.lang.Integer r9 = r13.LLILZ     // Catch: java.lang.Throwable -> Lad
            int r0 = r13.LLILZIL     // Catch: java.lang.Throwable -> Lad
            java.lang.Integer r10 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Throwable -> Lad
            int r11 = r13.LLILZLL     // Catch: java.lang.Throwable -> Lad
            r13.LL = r1     // Catch: java.lang.Throwable -> Lad
            r13.LLILLJJLI = r2     // Catch: java.lang.Throwable -> Lad
            r0 = 137979(0x21afb, float:1.9335E-40)
            boolean r0 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r12 = "im_default"
            java.lang.Object r14 = r7.LIZ(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto La0
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()     // Catch: java.lang.Throwable -> Lad
        La0:
            if (r14 != r3) goto La6
            X.C1C7U.LIZIZ(r6)
            return r3
        La6:
            X.C1C7U.LIZIZ(r6)     // Catch: java.lang.Throwable -> Laa
            goto Lb0
        Laa:
            r0 = move-exception
            goto L25
        Lad:
            r0 = move-exception
            goto L25
        Lb0:
            return r14
        Lb1:
            X.C1C7U.LIZIZ(r6)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1727406pc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
