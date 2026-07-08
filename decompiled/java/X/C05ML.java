package X;

import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ML, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedVM$applyLike$1", f = "SocialThoughtAggregatedVM.kt", l = {332}, m = "invokeSuspend")
public final class C05ML extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ SocialThoughtAggregatedVM LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ ThoughtInfo LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05ML(boolean z, String str, SocialThoughtAggregatedVM socialThoughtAggregatedVM, String str2, ThoughtInfo thoughtInfo, InterfaceC1364105Vn<? super C05ML> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = socialThoughtAggregatedVM;
        this.LLILZLL = str2;
        this.LLIZ = thoughtInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05ML c05ml = new C05ML(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c05ml.LLILLJJLI = obj;
        return c05ml;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "SocialThoughtAggregatedVM@9f7c.applyLike$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 1
            if (r0 == 0) goto L20
            if (r0 != r4) goto L18
            java.lang.Object r3 = r7.LLILLJJLI
            X.01wk r3 = (X.InterfaceC497601wk) r3
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Throwable -> L42 java.util.concurrent.CancellationException -> L67
            goto L61
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L20:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r3 = r7.LLILLJJLI
            X.01wk r3 = (X.InterfaceC497601wk) r3
            boolean r0 = r7.LLILLL     // Catch: java.lang.Throwable -> L40 java.util.concurrent.CancellationException -> L67
            if (r0 == 0) goto L2d
            r2 = 1
            goto L2e
        L2d:
            r2 = 2
        L2e:
            com.ss.android.ugc.aweme.social.thought.api.ThoughtApi r1 = com.ss.android.ugc.aweme.social.thought.api.ThoughtApi.LIZIZ     // Catch: java.lang.Throwable -> L40 java.util.concurrent.CancellationException -> L67
            java.lang.String r0 = r7.LLILZ     // Catch: java.lang.Throwable -> L40 java.util.concurrent.CancellationException -> L67
            r7.LLILLJJLI = r3     // Catch: java.lang.Throwable -> L40 java.util.concurrent.CancellationException -> L67
            r7.LL = r4     // Catch: java.lang.Throwable -> L40 java.util.concurrent.CancellationException -> L67
            java.lang.Object r0 = r1.interactThought(r0, r2, r7)     // Catch: java.lang.Throwable -> L40 java.util.concurrent.CancellationException -> L67
            if (r0 != r5) goto L61
            X.C1C7U.LIZIZ(r6)
            return r5
        L40:
            r0 = move-exception
            goto L43
        L42:
            r0 = move-exception
        L43:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            boolean r0 = X.C2296808zG.LJI(r3)
            if (r0 != 0) goto L52
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L52:
            com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedVM r0 = r7.LLILZIL
            com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService r2 = r0.wQ2()
            if (r2 == 0) goto L61
            java.lang.String r1 = r7.LLILZLL
            com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo r0 = r7.LLIZ
            r2.LJII(r1, r0)
        L61:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L67:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05ML.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
