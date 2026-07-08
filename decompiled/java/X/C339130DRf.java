package X;

import android.graphics.Bitmap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0DRf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339130DRf implements InterfaceC1331910klR {
    public final /* synthetic */ C05XL<Unit> LL;
    public final /* synthetic */ String LLILLJJLI;

    @Override // X.InterfaceC1331910klR
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC1331910klR
    public final void onCanceled() {
        this.LL.LJIIZILJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        this.LL.LJIIZILJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        String message;
        String str = this.LLILLJJLI;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        C21197617xO.LIZLLL(str, message);
        this.LL.LJIIZILJ(Unit.LIZ);
    }

    public C339130DRf(String str, C05XL c05xl) {
        this.LL = c05xl;
        this.LLILLJJLI = str;
    }
}
