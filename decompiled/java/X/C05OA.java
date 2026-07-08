package X;

import com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05OA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem$startNoVideoAnimation$1$1", f = "RssIntroAssem.kt", l = {230}, m = "invokeSuspend")
public final class C05OA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public RssIntroAssem LLILZ;
    public int LLILZIL;
    public final /* synthetic */ RssIntroAssem LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05OA(RssIntroAssem rssIntroAssem, InterfaceC1364105Vn<? super C05OA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = rssIntroAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05OA(this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0038 -> B:6:0x001b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "RssIntroAssem@3b99.startNoVideoAnimation$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILZIL
            r5 = 1
            if (r0 == 0) goto L3a
            if (r0 != r5) goto L42
            int r4 = r8.LLILLL
            int r1 = r8.LLILLJJLI
            int r3 = r8.LL
            com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem r0 = r8.LLILZ
            X.C155000ia.LIZIZ(r9)
        L1b:
            r0.Go(r4)
            int r4 = r1 + 1
            if (r4 >= r3) goto L3d
        L22:
            r8.LLILZ = r0
            r8.LL = r3
            r8.LLILLJJLI = r4
            r8.LLILLL = r4
            r8.LLILZIL = r5
            r1 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r1 = X.AnonymousClass0958.LIZIZ(r1, r8)
            if (r1 != r6) goto L38
            X.C1C7U.LIZIZ(r7)
            return r6
        L38:
            r1 = r4
            goto L1b
        L3a:
            X.C155000ia.LIZIZ(r9)
        L3d:
            com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem r0 = r8.LLILZLL
            r4 = 0
            r3 = 3
            goto L22
        L42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05OA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
