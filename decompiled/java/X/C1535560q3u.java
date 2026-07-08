package X;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: X.0q3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535560q3u implements InterfaceC1535470q3l {
    public final /* synthetic */ C259800zU<Uri> LIZ;

    public C1535560q3u(C259800zU<Uri> c259800zU) {
        this.LIZ = c259800zU;
    }

    @Override // X.InterfaceC1535470q3l
    public final /* synthetic */ Map getRequestHeaders() {
        return null;
    }

    @Override // X.InterfaceC1535470q3l
    public final /* synthetic */ boolean isForMainFrame() {
        return false;
    }

    @Override // X.InterfaceC1535470q3l
    public final Uri getUrl() {
        return this.LIZ.element;
    }
}
