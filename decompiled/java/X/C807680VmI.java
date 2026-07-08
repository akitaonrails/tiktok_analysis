package X;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0VmI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.xsearch.xwebview.SearchLynxWebViewService$initWebView$1$1$invoke$1$onPageFinished$2", f = "SearchLynxWebViewService.kt", l = {101, 105, 109, 113, 117}, m = "invokeSuspend")
public final class C807680VmI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ WebView LLILLJJLI;
    public final /* synthetic */ C844230X9x LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C807680VmI(WebView webView, C844230X9x c844230X9x, InterfaceC1364105Vn<? super C807680VmI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = webView;
        this.LLILLL = c844230X9x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C807680VmI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "SearchLynxWebViewService@274c.initWebView$1$1$invoke$1$onPageFinished$2"
            X.C1C7U.LIZ(r9)
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r10.LL
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r0 = 1
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r1 == 0) goto L35
            if (r1 == r0) goto L44
            if (r1 == r8) goto L61
            if (r1 == r7) goto L7e
            if (r1 == r6) goto L9b
            if (r1 != r5) goto Lb8
            X.C155000ia.LIZIZ(r11)
        L21:
            android.webkit.WebView r0 = r10.LLILLJJLI
            if (r0 == 0) goto L2f
            X.0X9x r1 = r10.LLILLL
            android.webkit.WebView r0 = r10.LLILLJJLI
            r1.getClass()
            X.C844230X9x.LIZIZ(r0)
        L2f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L35:
            X.C155000ia.LIZIZ(r11)
            r10.LL = r0
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r10)
            if (r0 != r4) goto L47
            X.C1C7U.LIZIZ(r9)
            return r4
        L44:
            X.C155000ia.LIZIZ(r11)
        L47:
            android.webkit.WebView r0 = r10.LLILLJJLI
            if (r0 == 0) goto L55
            X.0X9x r1 = r10.LLILLL
            android.webkit.WebView r0 = r10.LLILLJJLI
            r1.getClass()
            X.C844230X9x.LIZIZ(r0)
        L55:
            r10.LL = r8
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r10)
            if (r0 != r4) goto L64
            X.C1C7U.LIZIZ(r9)
            return r4
        L61:
            X.C155000ia.LIZIZ(r11)
        L64:
            android.webkit.WebView r0 = r10.LLILLJJLI
            if (r0 == 0) goto L72
            X.0X9x r1 = r10.LLILLL
            android.webkit.WebView r0 = r10.LLILLJJLI
            r1.getClass()
            X.C844230X9x.LIZIZ(r0)
        L72:
            r10.LL = r7
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r10)
            if (r0 != r4) goto L81
            X.C1C7U.LIZIZ(r9)
            return r4
        L7e:
            X.C155000ia.LIZIZ(r11)
        L81:
            android.webkit.WebView r0 = r10.LLILLJJLI
            if (r0 == 0) goto L8f
            X.0X9x r1 = r10.LLILLL
            android.webkit.WebView r0 = r10.LLILLJJLI
            r1.getClass()
            X.C844230X9x.LIZIZ(r0)
        L8f:
            r10.LL = r6
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r10)
            if (r0 != r4) goto L9e
            X.C1C7U.LIZIZ(r9)
            return r4
        L9b:
            X.C155000ia.LIZIZ(r11)
        L9e:
            android.webkit.WebView r0 = r10.LLILLJJLI
            if (r0 == 0) goto Lac
            X.0X9x r1 = r10.LLILLL
            android.webkit.WebView r0 = r10.LLILLJJLI
            r1.getClass()
            X.C844230X9x.LIZIZ(r0)
        Lac:
            r10.LL = r5
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r10)
            if (r0 != r4) goto L21
            X.C1C7U.LIZIZ(r9)
            return r4
        Lb8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C807680VmI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
