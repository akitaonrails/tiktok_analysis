package X;

import android.view.View;
import com.bytedance.android.livesdk.broadcast.preview.widget.GamePreviewDecouplingWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ULb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.GamePreviewDecouplingWidget$checkDecouplingWidgetShow$1$2", f = "GamePreviewDecouplingWidget.kt", l = {167, 171}, m = "invokeSuspend")
public final class C770690ULb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GamePreviewDecouplingWidget LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C770690ULb(View view, GamePreviewDecouplingWidget gamePreviewDecouplingWidget, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = gamePreviewDecouplingWidget;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C770690ULb(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "GamePreviewDecouplingWidget@a156.checkDecouplingWidgetShow$1$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LL
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L1c
            if (r0 == r1) goto L33
            if (r0 != r6) goto L5c
            X.C155000ia.LIZIZ(r9)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r9)
            com.bytedance.android.livesdk.broadcast.preview.widget.GamePreviewDecouplingWidget r0 = r8.LLILLJJLI
            boolean r0 = r0.LLIZ
            if (r0 == 0) goto L3b
            r8.LL = r1
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r8)
            if (r0 != r5) goto L36
            X.C1C7U.LIZIZ(r7)
            return r5
        L33:
            X.C155000ia.LIZIZ(r9)
        L36:
            com.bytedance.android.livesdk.broadcast.preview.widget.GamePreviewDecouplingWidget r1 = r8.LLILLJJLI
            r0 = 0
            r1.LLIZ = r0
        L3b:
            java.lang.String r1 = "VideoModeContainer"
            java.lang.String r0 = "decoupling_center_banner try visible2"
            X.C20441214yg.LIZIZ(r1, r0)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r4 = X.C2107308Nj.LIZ
            X.0ULa r3 = new X.0ULa
            android.view.View r2 = r8.LLILLL
            com.bytedance.android.livesdk.broadcast.preview.widget.GamePreviewDecouplingWidget r1 = r8.LLILLJJLI
            r0 = 0
            r3.<init>(r2, r1, r0)
            r8.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r8, r4, r3)
            if (r0 != r5) goto L16
            X.C1C7U.LIZIZ(r7)
            return r5
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C770690ULb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
