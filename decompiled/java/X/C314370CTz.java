package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nows.ui.AICaptionLoadingView$startAnimation$2", f = "AICaptionLoadingView.kt", l = {165, 167, 168, 169, 170}, m = "invokeSuspend")
public final class C314370CTz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C437600HDy LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314370CTz(C437600HDy c437600HDy, InterfaceC1364105Vn<? super C314370CTz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c437600HDy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314370CTz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0074 -> B:16:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r12 = "AICaptionLoadingView@e654.startAnimation$2"
            X.C1C7U.LIZ(r12)
            java.lang.Object r11 = X.C099R.LJFF()
            int r0 = r13.LL
            r2 = 200(0xc8, double:9.9E-322)
            r10 = 204(0xcc, float:2.86E-43)
            r9 = 0
            r8 = 5
            r7 = 4
            r6 = 3
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 == r4) goto L3a
            if (r0 == r5) goto L4b
            if (r0 == r6) goto L5a
            if (r0 == r7) goto L6b
            if (r0 == r8) goto L3a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L29:
            X.C155000ia.LIZIZ(r14)
            r13.LL = r4
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r13)
            if (r0 != r11) goto L3d
            X.C1C7U.LIZIZ(r12)
            return r11
        L3a:
            X.C155000ia.LIZIZ(r14)
        L3d:
            X.0HDy r0 = r13.LLILLJJLI
            r13.LL = r5
            java.lang.Object r0 = r0.LIZ(r4, r10, r9, r13)
            if (r0 != r11) goto L4e
            X.C1C7U.LIZIZ(r12)
            return r11
        L4b:
            X.C155000ia.LIZIZ(r14)
        L4e:
            r13.LL = r6
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r13)
            if (r0 != r11) goto L5d
            X.C1C7U.LIZIZ(r12)
            return r11
        L5a:
            X.C155000ia.LIZIZ(r14)
        L5d:
            X.0HDy r0 = r13.LLILLJJLI
            r13.LL = r7
            java.lang.Object r0 = r0.LIZ(r4, r9, r10, r13)
            if (r0 != r11) goto L6e
            X.C1C7U.LIZIZ(r12)
            return r11
        L6b:
            X.C155000ia.LIZIZ(r14)
        L6e:
            r13.LL = r8
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r13)
            if (r0 != r11) goto L3d
            X.C1C7U.LIZIZ(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314370CTz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
