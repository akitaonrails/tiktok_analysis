package X;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FNh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389070FNh extends C09AY implements Function1<View, Boolean> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C389070FNh(int i) {
        super(1);
        this.LL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(android.view.View r5) {
        /*
            r4 = this;
            android.view.View r5 = (android.view.View) r5
            int r3 = r4.LL
            boolean r0 = r5.isAttachedToWindow()
            if (r0 == 0) goto L36
            boolean r0 = r5.isShown()
            if (r0 == 0) goto L36
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r0 = r5.getGlobalVisibleRect(r2)
            if (r0 == 0) goto L36
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L36
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.heightPixels
            int r1 = r1 - r3
            int r0 = r2.bottom
            if (r0 > r1) goto L36
            r0 = 1
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L36:
            r0 = 0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389070FNh.invoke(java.lang.Object):java.lang.Object");
    }
}
