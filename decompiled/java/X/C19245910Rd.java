package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: X.10Rd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19245910Rd implements InterfaceC427850Gq7 {
    public final C10SG LL;

    @Override // X.InterfaceC427850Gq7
    public final void A3(Uri uri, C428600GrK c428600GrK) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
    }

    public C19245910Rd(C10SG c10sg) {
        this.LL = c10sg;
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        this.LL.onFailure();
    }
}
