package X;

import android.app.Activity;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12LD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12LD {
    public final ClassLoader LIZ;
    public final C12LH LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.window.extensions.layout.WindowLayoutComponent LIZ() {
        /*
            r4 = this;
            kotlin.jvm.internal.AwS573S0100000_29 r1 = new kotlin.jvm.internal.AwS573S0100000_29
            r0 = 19
            r1.<init>(r4, r0)
            r3 = 1
            r2 = 0
            r1.invoke()     // Catch: java.lang.ClassNotFoundException -> Ld java.lang.NoClassDefFoundError -> L12
            goto L18
        Ld:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L16
        L12:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L16:
            r0 = 0
            goto L19
        L18:
            r0 = 1
        L19:
            if (r0 == 0) goto L57
            kotlin.jvm.internal.AwS573S0100000_29 r1 = new kotlin.jvm.internal.AwS573S0100000_29
            r0 = 20
            r1.<init>(r4, r0)
            java.lang.String r0 = "WindowExtensionsProvider#getWindowExtensions is not valid"
            boolean r0 = X.C1184404kE.LIZ(r0, r1)
            if (r0 == 0) goto L57
            kotlin.jvm.internal.AwS573S0100000_29 r1 = new kotlin.jvm.internal.AwS573S0100000_29
            r0 = 21
            r1.<init>(r4, r0)
            java.lang.String r0 = "WindowExtensions#getWindowLayoutComponent is not valid"
            boolean r0 = X.C1184404kE.LIZ(r0, r1)
            if (r0 == 0) goto L57
            kotlin.jvm.internal.AwS573S0100000_29 r1 = new kotlin.jvm.internal.AwS573S0100000_29
            r0 = 16
            r1.<init>(r4, r0)
            java.lang.String r0 = "FoldingFeature class is not valid"
            boolean r0 = X.C1184404kE.LIZ(r0, r1)
            if (r0 == 0) goto L57
            X.12L8 r0 = X.C12L8.LIZ
            r0.getClass()
            int r1 = X.C12L8.LIZ()
            if (r1 != r3) goto L5a
            boolean r2 = r4.LIZIZ()
        L57:
            if (r2 == 0) goto La6
            goto L99
        L5a:
            r0 = 2
            if (r0 > r1) goto L97
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 > r0) goto L97
            r0 = 1
        L63:
            if (r0 == 0) goto L57
            boolean r0 = r4.LIZIZ()
            if (r0 == 0) goto L95
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "WindowLayoutComponent#addWindowLayoutInfoListener("
            r1.append(r0)
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = ", androidx.window.extensions.core.util.function.Consumer) is not valid"
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            kotlin.jvm.internal.AwS573S0100000_29 r1 = new kotlin.jvm.internal.AwS573S0100000_29
            r0 = 18
            r1.<init>(r4, r0)
            boolean r0 = X.C1184404kE.LIZ(r2, r1)
            if (r0 == 0) goto L95
        L93:
            r2 = r3
            goto L57
        L95:
            r3 = 0
            goto L93
        L97:
            r0 = 0
            goto L63
        L99:
            androidx.window.extensions.WindowExtensions r0 = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions()     // Catch: java.lang.UnsupportedOperationException -> La2
            androidx.window.extensions.layout.WindowLayoutComponent r0 = r0.getWindowLayoutComponent()     // Catch: java.lang.UnsupportedOperationException -> La2
            return r0
        La2:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12LD.LIZ():androidx.window.extensions.layout.WindowLayoutComponent");
    }

    public final boolean LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sbLIZ.append(Activity.class.getName());
        sbLIZ.append(", java.util.function.Consumer) is not valid");
        return C1184404kE.LIZ(C2188811AlT.LIZIZ(sbLIZ), new AwS573S0100000_29(this, 17));
    }

    public C12LD(ClassLoader classLoader, C12LH c12lh) {
        this.LIZ = classLoader;
        this.LIZIZ = c12lh;
    }
}
