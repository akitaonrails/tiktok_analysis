package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ihx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.follow.TopLiveBubbleManager$showTopLiveBubble$1", f = "TopLiveBubbleManager.kt", l = {457, 459}, m = "invokeSuspend")
public final class C473750Ihx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Pair LL;
    public int LLILLJJLI;
    public final /* synthetic */ C482800IwY LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C473750Ihx(C482800IwY c482800IwY, String str, InterfaceC1364105Vn<? super C473750Ihx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c482800IwY;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C473750Ihx(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "TopLiveBubbleManager@e3c2.showTopLiveBubble$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L6b
            if (r0 == r1) goto L7c
            if (r0 != r2) goto La7
            kotlin.Pair r3 = r6.LL
            X.C155000ia.LIZIZ(r7)
        L18:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto L61
            X.0IwY r0 = r6.LLILLL
            com.bytedance.keva.Keva r4 = r0.LJIIZILJ()
            java.lang.String r2 = "toplive_golive_bubble_show_time_v2"
            long r0 = java.lang.System.currentTimeMillis()
            r4.storeLong(r2, r0)
            X.0IwY r0 = r6.LLILLL
            com.bytedance.keva.Keva r2 = r0.LJIIZILJ()
            java.lang.Object r0 = r3.getSecond()
            webcast.api.room.StrategyData r0 = (webcast.api.room.StrategyData) r0
            if (r0 == 0) goto L69
            webcast.api.room.ShowMode r0 = r0.showMode
            if (r0 == 0) goto L69
            webcast.api.room.TopliveTooltip r0 = r0.topliveTooltip
            if (r0 == 0) goto L69
            int r1 = r0.goLiveButtonStyle
        L47:
            java.lang.String r0 = "toplive_golive_anim_style"
            r2.storeInt(r0, r1)
            X.0IwY r0 = r6.LLILLL
            com.bytedance.keva.Keva r2 = r0.LJIIZILJ()
            java.lang.Object r0 = r3.getSecond()
            webcast.api.room.StrategyData r0 = (webcast.api.room.StrategyData) r0
            if (r0 == 0) goto L67
            java.lang.String r1 = r0.strategyId
        L5c:
            java.lang.String r0 = "toplive_golive_strategy_id"
            r2.storeString(r0, r1)
        L61:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L67:
            r1 = 0
            goto L5c
        L69:
            r1 = 0
            goto L47
        L6b:
            X.C155000ia.LIZIZ(r7)
            X.0IwY r0 = r6.LLILLL
            r6.LLILLJJLI = r1
            java.lang.Object r7 = r0.LJIJ(r6)
            if (r7 != r3) goto L7f
            X.C1C7U.LIZIZ(r5)
            return r3
        L7c:
            X.C155000ia.LIZIZ(r7)
        L7f:
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r1 = r7.getFirst()
            java.lang.String r0 = "golive_guide"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L61
            X.0IwY r1 = r6.LLILLL
            java.lang.Object r0 = r7.getSecond()
            webcast.api.room.StrategyData r0 = (webcast.api.room.StrategyData) r0
            r6.LL = r7
            r6.LLILLJJLI = r2
            java.lang.Object r0 = r1.LJIILJJIL(r0, r6)
            if (r0 != r3) goto La3
            X.C1C7U.LIZIZ(r5)
            return r3
        La3:
            r3 = r7
            r7 = r0
            goto L18
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C473750Ihx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
