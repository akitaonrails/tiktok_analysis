package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditNavigationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119980fFc extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ DecorationEditNavigationViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1119980fFc(DecorationEditNavigationViewModel decorationEditNavigationViewModel) {
        super(1);
        this.LL = decorationEditNavigationViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, android.content.Context] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(android.view.View r10) {
        /*
            r9 = this;
            android.view.View r10 = (android.view.View) r10
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditNavigationViewModel r7 = r9.LL
            r7.getClass()
            boolean r0 = X.C758440Tp4.LIZ
            r8 = 0
            if (r0 == 0) goto L26
            X.14i1<java.lang.Long> r0 = X.InterfaceC1106030et7.A9
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Number r0 = (java.lang.Number) r0
            long r5 = r0.longValue()
            long r3 = java.lang.System.currentTimeMillis()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L33
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L33
        L26:
            X.0fFn r0 = r7.xQ2()
            X.0xOj r0 = r0.LL
            if (r0 == 0) goto L30
            r0.LIZLLL = r8
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            X.00zU r1 = new X.00zU
            r1.<init>()
            android.content.Context r0 = X.C176600m4.LIZ()
            if (r0 == 0) goto L30
            r1.element = r0
            X.0fFY r0 = new X.0fFY
            r0.<init>()
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r10, r0)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1119980fFc.invoke(java.lang.Object):java.lang.Object");
    }
}
