package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity$loopGettingReplayFragment$1", f = "LiveReplayVideoClipActivity.kt", l = {782}, m = "invokeSuspend")
public final class C488710JEn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveReplayVideoClipActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C488710JEn(LiveReplayVideoClipActivity liveReplayVideoClipActivity, InterfaceC1364105Vn<? super C488710JEn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveReplayVideoClipActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C488710JEn c488710JEn = new C488710JEn(this.LLILLL, interfaceC1364105Vn);
        c488710JEn.LLILLJJLI = obj;
        return c488710JEn;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0080 -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "LiveReplayVideoClipActivity@182e.loopGettingReplayFragment$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r11.LL
            r8 = 1
            if (r0 == 0) goto L6f
            if (r0 != r8) goto L8f
            java.lang.Object r7 = r11.LLILLJJLI
            X.01wk r7 = (X.InterfaceC497601wk) r7
            X.C155000ia.LIZIZ(r12)
        L17:
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity r0 = r11.LLILLL
            java.util.Map<kotlin.Pair<java.lang.Long, java.lang.Long>, java.lang.Long> r0 = r0.LLJZIJLIL
            boolean r0 = r0.isEmpty()
            r5 = 0
            if (r0 != 0) goto L86
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity r0 = r11.LLILLL
            java.util.Map<kotlin.Pair<java.lang.Long, java.lang.Long>, java.lang.Long> r0 = r0.LLJZIJLIL
            int r0 = r0.size()
            if (r0 > r8) goto L86
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity r0 = r11.LLILLL
            java.util.Map<kotlin.Pair<java.lang.Long, java.lang.Long>, java.lang.Long> r0 = r0.LLJZIJLIL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Collection r0 = r0.values()
            java.lang.Object r0 = X.C13LP.LJJJJZ(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L4f
            X.C2296808zG.LIZJ(r7, r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L4f:
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity r6 = r11.LLILLL
            r6.getClass()
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r0 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.broadcast.api.IBroadcastService r0 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r0
            X.11NZ r5 = r0.getLiveReplayFragment(r3)
            X.0xsi r2 = new X.0xsi
            r2.<init>(r6, r3)
            Y.AfS10S0100100_27 r1 = new Y.AfS10S0100100_27
            r0 = 5
            r1.<init>(r6, r3, r0)
            r5.LJJLL(r2, r1)
            goto L76
        L6f:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r7 = r11.LLILLJJLI
            X.01wk r7 = (X.InterfaceC497601wk) r7
        L76:
            r11.LLILLJJLI = r7
            r11.LL = r8
            r0 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r11)
            if (r0 != r9) goto L17
            X.C1C7U.LIZIZ(r10)
            return r9
        L86:
            X.C2296808zG.LIZJ(r7, r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L8f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C488710JEn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
