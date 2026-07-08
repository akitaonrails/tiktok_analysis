package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cmq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel$deleteTargetLiveFragmentInfo$1", f = "LiveHighlightViewModel.kt", l = {828}, m = "invokeSuspend")
public final class C323900Cmq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ LiveHighlightViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323900Cmq(LiveHighlightViewModel liveHighlightViewModel, InterfaceC1364105Vn<? super C323900Cmq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveHighlightViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323900Cmq(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "LiveHighlightViewModel@9d4.deleteTargetLiveFragmentInfo$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L1b
            if (r0 != r5) goto L13
            long r1 = r9.LL
            goto L6f
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1b:
            X.C155000ia.LIZIZ(r10)
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel r0 = r9.LLILLL
            X.002o r0 = r0.getState()
            X.0xqW r0 = (X.C1834780xqW) r0
            X.06Xk<X.0xqC> r0 = r0.LLILZ
            java.lang.Object r0 = r0.LIZ()
            X.0xqC r0 = (X.C1834580xqC) r0
            r6 = 0
            if (r0 == 0) goto L3e
            long r1 = r0.LLILZ
        L34:
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L41
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L3e:
            r1 = 0
            goto L34
        L41:
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel r0 = r9.LLILLL
            X.002o r0 = r0.getState()
            X.0xqW r0 = (X.C1834780xqW) r0
            X.06Xk<X.0xqC> r0 = r0.LLILZ
            java.lang.Object r0 = r0.LIZ()
            X.0xqC r0 = (X.C1834580xqC) r0
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel r0 = r9.LLILLL     // Catch: java.lang.Exception -> L80
            X.0Cn0 r0 = r0.LL     // Catch: java.lang.Exception -> L80
            X.0Cmz r0 = r0.LLILLJJLI     // Catch: java.lang.Exception -> L80
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L80
            r9.LL = r1     // Catch: java.lang.Exception -> L80
            r9.LLILLJJLI = r5     // Catch: java.lang.Exception -> L80
            X.0Cn0 r0 = r0.LL     // Catch: java.lang.Exception -> L80
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightApi r0 = r0.LIZ()     // Catch: java.lang.Exception -> L80
            java.lang.Object r10 = r0.deleteLiveFragmentInfo(r3, r9)     // Catch: java.lang.Exception -> L80
            if (r10 != r4) goto L72
            X.C1C7U.LIZIZ(r8)
            return r4
        L6f:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Exception -> L82
        L72:
            X.0Icr r10 = (X.C470590Icr) r10     // Catch: java.lang.Exception -> L82
            T r0 = r10.data     // Catch: java.lang.Exception -> L82
            tikcast.api.anchor.AnchorLiveFragmentDeleteResponse$ResponseData r0 = (tikcast.api.anchor.AnchorLiveFragmentDeleteResponse.ResponseData) r0     // Catch: java.lang.Exception -> L82
            if (r0 == 0) goto L93
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel r0 = r9.LLILLL     // Catch: java.lang.Exception -> L82
            r0.AQ2(r1)     // Catch: java.lang.Exception -> L82
            goto L93
        L80:
            r0 = move-exception
            goto L83
        L82:
            r0 = move-exception
        L83:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            int r3 = X.C512300K7g.LIZIZ(r0)
            r0 = 10011(0x271b, float:1.4028E-41)
            if (r3 != r0) goto L93
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel r0 = r9.LLILLL
            r0.AQ2(r1)
        L93:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323900Cmq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
