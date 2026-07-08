package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.offline.push.inner.AIGCArchInnerPushHandler$acceptMessage$1", f = "AIGCArchInnerPushHandler.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT, LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C539010LBz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public ICreationAsyncTaskManager LL;
    public ICreationAsyncTaskManager LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C539000LBy LLILZ;
    public final /* synthetic */ C0LZK LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539010LBz(C539000LBy c539000LBy, C0LZK c0lzk, InterfaceC1364105Vn<? super C539010LBz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c539000LBy;
        this.LLILZIL = c0lzk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C539010LBz(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "AIGCArchInnerPushHandler@3957.acceptMessage$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L1c
            if (r0 == r7) goto L41
            if (r0 != r6) goto L81
            X.C155000ia.LIZIZ(r10)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r10)
            X.0LBy r0 = r9.LLILZ
            X.01GW r0 = r0.LLILLJJLI
            java.lang.Object r3 = r0.getValue()
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r3 = (com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager) r3
            if (r3 == 0) goto L16
            X.0LZK r0 = r9.LLILZIL
            java.lang.String r0 = r0.LIZIZ
            r9.LL = r3
            r9.LLILLJJLI = r3
            r9.LLILLL = r7
            java.lang.Object r10 = r3.LIZJ(r0, r9)
            if (r10 != r4) goto L3f
            X.C1C7U.LIZIZ(r8)
            return r4
        L3f:
            r5 = r3
            goto L48
        L41:
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r3 = r9.LLILLJJLI
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r5 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L48:
            X.0LSZ r10 = (X.C0LSZ) r10
            if (r10 == 0) goto L16
            com.ss.android.ugc.aweme.aigc.asynctask.Source r1 = r10.LJIIL
            com.ss.android.ugc.aweme.aigc.asynctask.Source r0 = com.ss.android.ugc.aweme.aigc.asynctask.Source.EFFECT_AIGC
            if (r1 != r0) goto L16
            java.lang.String r1 = "FINISHED"
            java.lang.String r0 = "STARTED"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.Set r1 = X.C13LQ.LJLIIL(r0)
            java.lang.String r0 = r10.LJ
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L16
            r2 = 0
            if (r7 == 0) goto L16
            java.lang.String r0 = r10.LIZ
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r9.LL = r5
            r9.LLILLJJLI = r2
            r9.LLILLL = r6
            java.lang.String r0 = "Inner Push"
            java.lang.Object r0 = r3.LJIJI(r0, r1, r9)
            if (r0 != r4) goto L16
            X.C1C7U.LIZIZ(r8)
            return r4
        L81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C539010LBz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
