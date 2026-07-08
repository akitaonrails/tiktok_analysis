package X;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13gU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C20073613gU extends C2217421BqW implements Function0<C20075313gl> {
    public C20073613gU(Object obj) {
        super(0, obj, C20071013g4.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C20075313gl invoke() {
        View view = (View) this.receiver;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            view.setImportantForContentCapture(1);
        } else if (i < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSession = view.getContentCaptureSession();
        if (contentCaptureSession != null) {
            return new C20075313gl(contentCaptureSession, view);
        }
        return null;
    }
}
