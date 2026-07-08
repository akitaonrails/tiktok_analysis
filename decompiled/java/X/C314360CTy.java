package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nows.ui.AICaptionLoadingView$startAnimation$1", f = "AICaptionLoadingView.kt", l = {154, 156, 157, 158, 159}, m = "invokeSuspend")
public final class C314360CTy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C437600HDy LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314360CTy(C437600HDy c437600HDy, InterfaceC1364105Vn<? super C314360CTy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c437600HDy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314360CTy(this.LLILLJJLI, interfaceC1364105Vn);
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
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r11 = "AICaptionLoadingView@e654.startAnimation$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r10 = X.C099R.LJFF()
            int r1 = r12.LL
            r2 = 200(0xc8, double:9.9E-322)
            r9 = 0
            r8 = 204(0xcc, float:2.86E-43)
            r7 = 5
            r6 = 4
            r5 = 3
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 == r0) goto L3a
            if (r1 == r4) goto L4b
            if (r1 == r5) goto L5a
            if (r1 == r6) goto L6b
            if (r1 == r7) goto L3a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L29:
            X.C155000ia.LIZIZ(r13)
            r12.LL = r0
            r0 = 0
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r12)
            if (r0 != r10) goto L3d
            X.C1C7U.LIZIZ(r11)
            return r10
        L3a:
            X.C155000ia.LIZIZ(r13)
        L3d:
            X.0HDy r0 = r12.LLILLJJLI
            r12.LL = r4
            java.lang.Object r0 = r0.LIZ(r9, r8, r9, r12)
            if (r0 != r10) goto L4e
            X.C1C7U.LIZIZ(r11)
            return r10
        L4b:
            X.C155000ia.LIZIZ(r13)
        L4e:
            r12.LL = r5
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r12)
            if (r0 != r10) goto L5d
            X.C1C7U.LIZIZ(r11)
            return r10
        L5a:
            X.C155000ia.LIZIZ(r13)
        L5d:
            X.0HDy r0 = r12.LLILLJJLI
            r12.LL = r6
            java.lang.Object r0 = r0.LIZ(r9, r9, r8, r12)
            if (r0 != r10) goto L6e
            X.C1C7U.LIZIZ(r11)
            return r10
        L6b:
            X.C155000ia.LIZIZ(r13)
        L6e:
            r12.LL = r7
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r12)
            if (r0 != r10) goto L3d
            X.C1C7U.LIZIZ(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314360CTy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
