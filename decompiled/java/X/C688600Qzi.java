package X;

import android.text.style.ClickableSpan;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qzi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.commentlist.adapter.SearchPrefetchDownEventListener$handleDelayPrefetch$1", f = "SearchPrefetchDownEventListener.kt", l = {123, 126}, m = "invokeSuspend")
public final class C688600Qzi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C688610Qzj LLILLJJLI;
    public final /* synthetic */ ClickableSpan LLILLL;
    public final /* synthetic */ TextView LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C688600Qzi(C688610Qzj c688610Qzj, ClickableSpan clickableSpan, TextView textView, InterfaceC1364105Vn<? super C688600Qzi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c688610Qzj;
        this.LLILLL = clickableSpan;
        this.LLILZ = textView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C688600Qzi(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "SearchPrefetchDownEventListener@ef73.handleDelayPrefetch$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LL
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 == r2) goto L50
            if (r0 != r4) goto L85
            X.C155000ia.LIZIZ(r7)
        L16:
            X.0Qzj r2 = r6.LLILLJJLI
            boolean r0 = r2.LJI
            if (r0 == 0) goto L2b
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJII = r0
            X.0Qzj r2 = r6.LLILLJJLI
            android.text.style.ClickableSpan r1 = r6.LLILLL
            android.widget.TextView r0 = r6.LLILZ
            r2.LIZIZ(r1, r0)
        L2b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L31:
            X.C155000ia.LIZIZ(r7)
            X.0QzY r0 = X.C688500QzY.LIZ
            r0.getClass()
            X.01GW r0 = X.C688500QzY.LIZJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.settings.PressedPrefetchConfig r0 = (com.ss.android.ugc.aweme.feed.settings.PressedPrefetchConfig) r0
            int r0 = r0.firstWaitTime
            long r0 = (long) r0
            r6.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r3) goto L53
            X.C1C7U.LIZIZ(r5)
            return r3
        L50:
            X.C155000ia.LIZIZ(r7)
        L53:
            X.0Qzj r2 = r6.LLILLJJLI
            boolean r0 = r2.LIZJ
            if (r0 == 0) goto L75
            X.0QzY r0 = X.C688500QzY.LIZ
            r0.getClass()
            X.01GW r0 = X.C688500QzY.LIZJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.settings.PressedPrefetchConfig r0 = (com.ss.android.ugc.aweme.feed.settings.PressedPrefetchConfig) r0
            int r0 = r0.secondWaitTime
            long r0 = (long) r0
            r6.LL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r3) goto L16
            X.C1C7U.LIZIZ(r5)
            return r3
        L75:
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJII = r0
            X.0Qzj r2 = r6.LLILLJJLI
            android.text.style.ClickableSpan r1 = r6.LLILLL
            android.widget.TextView r0 = r6.LLILZ
            r2.LIZIZ(r1, r0)
            goto L2b
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C688600Qzi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
