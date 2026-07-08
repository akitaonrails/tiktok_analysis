package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 77, 79, 81}, m = "invokeSuspend")
public final class C314690CVf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C09AE LLILLJJLI;
    public final /* synthetic */ C319410Cfb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314690CVf(C09AE c09ae, C319410Cfb c319410Cfb, InterfaceC1364105Vn<? super C314690CVf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09ae;
        this.LLILLL = c319410Cfb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314690CVf(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0076 -> B:32:0x0079). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r10.LL
            r1 = 500(0x1f4, double:2.47E-321)
            r3 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r5 = 4
            r4 = 3
            r9 = 2
            r8 = 1
            if (r0 == 0) goto L2d
            if (r0 == r8) goto L29
            if (r0 == r9) goto L55
            if (r0 == r4) goto L25
            if (r0 != r5) goto L1d
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Throwable -> L85
            goto L79
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L25:
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Throwable -> L85
            goto L67
        L29:
            X.C155000ia.LIZIZ(r11)
            goto L3d
        L2d:
            X.C155000ia.LIZIZ(r11)
            X.09AE r0 = r10.LLILLJJLI
            if (r0 == 0) goto L3d
            r10.LL = r8
            java.lang.Object r0 = X.C23118094a.LIZLLL(r0, r10)
            if (r0 != r6) goto L3d
            return r6
        L3d:
            X.0Cfb r0 = r10.LLILLL     // Catch: java.lang.Throwable -> L85
            X.05ZL r0 = r0.LIZJ     // Catch: java.lang.Throwable -> L85
            X.13FI r0 = (X.C13FI) r0     // Catch: java.lang.Throwable -> L85
            r0.LJIILJJIL(r7)     // Catch: java.lang.Throwable -> L85
            X.0Cfb r0 = r10.LLILLL     // Catch: java.lang.Throwable -> L85
            boolean r0 = r0.LIZ     // Catch: java.lang.Throwable -> L85
            if (r0 != 0) goto L5e
            r10.LL = r9     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = X.AnonymousClass0958.LIZ(r10)     // Catch: java.lang.Throwable -> L85
            if (r0 != r6) goto L58
            return r6
        L55:
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Throwable -> L85
        L58:
            X.08jB r0 = new X.08jB     // Catch: java.lang.Throwable -> L85
            r0.<init>()     // Catch: java.lang.Throwable -> L85
            throw r0     // Catch: java.lang.Throwable -> L85
        L5e:
            r10.LL = r4     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r1, r10)     // Catch: java.lang.Throwable -> L8a
            if (r0 != r6) goto L67
            goto L83
        L67:
            X.0Cfb r0 = r10.LLILLL     // Catch: java.lang.Throwable -> L8a
            X.05ZL r0 = r0.LIZJ     // Catch: java.lang.Throwable -> L8a
            X.13FI r0 = (X.C13FI) r0     // Catch: java.lang.Throwable -> L8a
            r0.LJIILJJIL(r3)     // Catch: java.lang.Throwable -> L8a
            r10.LL = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r1, r10)     // Catch: java.lang.Throwable -> L8a
            if (r0 != r6) goto L79
            goto L84
        L79:
            X.0Cfb r0 = r10.LLILLL     // Catch: java.lang.Throwable -> L8a
            X.05ZL r0 = r0.LIZJ     // Catch: java.lang.Throwable -> L8a
            X.13FI r0 = (X.C13FI) r0     // Catch: java.lang.Throwable -> L8a
            r0.LJIILJJIL(r7)     // Catch: java.lang.Throwable -> L8a
            goto L5e
        L83:
            return r6
        L84:
            return r6
        L85:
            r1 = move-exception
        L86:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L8a
            goto L8c
        L8a:
            r1 = move-exception
            goto L86
        L8c:
            X.0Cfb r0 = r10.LLILLL
            X.05ZL r0 = r0.LIZJ
            X.13FI r0 = (X.C13FI) r0
            r0.LJIILJJIL(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314690CVf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
