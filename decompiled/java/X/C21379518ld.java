package X;

import android.app.Application;
import android.content.Context;
import android.text.SpannableStringBuilder;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.18ld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21379518ld {
    public static C1860140yVQ LIZIZ(String str) {
        Application application;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        boolean z = false;
        WeakReference<Application> weakReference = C18ZY.LIZ;
        C21419518s5 c21419518s5 = null;
        if (weakReference != null && (application = weakReference.get()) != null) {
            C21419418s4 c21419418s4 = new C21419418s4(C445120Hcs.LIZ(12), 0.0f, false, 0.0f, 0, 0, 0, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, -2, 16777215);
            C14S5<Context> c14s5 = C21379618le.LIZ;
            z = false;
            c21419518s5 = new C21419518s5(application, false, c21419418s4, new WeakReference(null), null);
        }
        return new C1860140yVQ(spannableStringBuilder, z, z, z, c21419518s5, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016 A[Catch: all -> 0x014f, PHI: r6
      0x0016: PHI (r6v3 android.widget.TextView) = (r6v0 android.widget.TextView), (r6v1 android.widget.TextView), (r6v1 android.widget.TextView) binds: [B:5:0x0008, B:7:0x000e, B:9:0x0014] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x014f, blocks: (B:6:0x000a, B:8:0x0010, B:14:0x0022, B:27:0x007e, B:28:0x0085, B:30:0x008d, B:32:0x0095, B:34:0x009d, B:35:0x00a7, B:37:0x00ab, B:39:0x00b3, B:40:0x00bd, B:42:0x00d8, B:47:0x010a, B:43:0x00dc, B:53:0x0121, B:56:0x0133, B:50:0x0113, B:19:0x0050, B:21:0x0054, B:26:0x0068, B:25:0x0064, B:22:0x005c, B:10:0x0016, B:12:0x001a, B:59:0x0149), top: B:66:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1860140yVQ LIZ(X.InterfaceC1860060yVI r21, java.lang.String r22, int r23, X.C21419418s4 r24, java.util.Map r25) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21379518ld.LIZ(X.0yVI, java.lang.String, int, X.18s4, java.util.Map):X.0yVQ");
    }
}
