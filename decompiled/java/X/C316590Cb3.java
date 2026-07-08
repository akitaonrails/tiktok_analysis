package X;

import com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cb3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService$performSugSearch$2", f = "HorizontalMentionMixSearchService.kt", l = {}, m = "invokeSuspend")
public final class C316590Cb3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C237600vu>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ HorizontalMentionMixSearchService LLILZIL;
    public final /* synthetic */ C20612815lG LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316590Cb3(List<String> list, long j, String str, String str2, HorizontalMentionMixSearchService horizontalMentionMixSearchService, C20612815lG c20612815lG, InterfaceC1364105Vn<? super C316590Cb3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = horizontalMentionMixSearchService;
        this.LLILZLL = c20612815lG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316590Cb3(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:3:0x000c, B:5:0x0021, B:6:0x002c, B:8:0x0032, B:10:0x003c, B:13:0x0042, B:15:0x0054, B:16:0x0058, B:19:0x006c, B:18:0x006a), top: B:24:0x000c }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "HorizontalMentionMixSearchService@7d75.performSugSearch$2"
            X.C1C7U.LIZ(r9)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r11)
            r4 = 0
            X.0Cal r6 = X.C316410Cal.LIZ     // Catch: java.lang.Exception -> L76
            java.util.List<java.lang.String> r5 = r10.LL     // Catch: java.lang.Exception -> L76
            long r2 = r10.LLILLJJLI     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = r10.LLILLL     // Catch: java.lang.Exception -> L76
            java.lang.String r0 = r10.LLILZ     // Catch: java.lang.Exception -> L76
            r6.getClass()     // Catch: java.lang.Exception -> L76
            com.ss.android.ugc.aweme.search.model.SearchUserSugResponse r5 = X.C316410Cal.LIZJ(r2, r1, r5, r0)     // Catch: java.lang.Exception -> L76
            java.util.List<? extends com.ss.android.ugc.aweme.search.model.SearchSugEntity> r0 = r5.sugList     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L6a
            java.lang.String r8 = r10.LLILLL     // Catch: java.lang.Exception -> L76
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L76
            r6.<init>()     // Catch: java.lang.Exception -> L76
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Exception -> L76
        L2c:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L58
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L76
            com.ss.android.ugc.aweme.search.model.SearchSugEntity r1 = (com.ss.android.ugc.aweme.search.model.SearchSugEntity) r1     // Catch: java.lang.Exception -> L76
            com.ss.android.ugc.aweme.search.model.SugExtraInfo r0 = r1.sugExtraInfo     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L2c
            java.lang.String r0 = r5.requestId     // Catch: java.lang.Exception -> L76
            if (r0 != 0) goto L42
            java.lang.String r0 = ""
        L42:
            X.15l7 r3 = X.C20611815l6.LIZ(r1, r0, r8)     // Catch: java.lang.Exception -> L76
            X.0CbM r2 = new X.0CbM     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = "SuG"
            r0 = 2
            r2.<init>(r1, r0, r4)     // Catch: java.lang.Exception -> L76
            X.15l7 r0 = X.C20611915l7.LIZ(r3, r2)     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L2c
            r6.add(r0)     // Catch: java.lang.Exception -> L76
            goto L2c
        L58:
            com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService r0 = r10.LLILZIL     // Catch: java.lang.Exception -> L76
            X.15lG r1 = r10.LLILZLL     // Catch: java.lang.Exception -> L76
            r0.getClass()     // Catch: java.lang.Exception -> L76
            X.0CbD r0 = X.C316690CbD.LIZ     // Catch: java.lang.Exception -> L76
            r0.getClass()     // Catch: java.lang.Exception -> L76
            java.util.List r2 = X.C316690CbD.LIZJ(r6, r1)     // Catch: java.lang.Exception -> L76
            if (r2 != 0) goto L6c
        L6a:
            X.13BV r2 = X.C13BV.INSTANCE     // Catch: java.lang.Exception -> L76
        L6c:
            X.00vu r1 = new X.00vu     // Catch: java.lang.Exception -> L76
            boolean r0 = r5.LIZ()     // Catch: java.lang.Exception -> L76
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L76
            goto L81
        L76:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00vu r1 = new X.00vu
            X.13BV r0 = X.C13BV.INSTANCE
            r1.<init>(r0, r4)
        L81:
            X.C1C7U.LIZIZ(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C316590Cb3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C237600vu> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
