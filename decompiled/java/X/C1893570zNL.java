package X;

import android.content.Intent;
import com.bytedance.router.OpenResultCallback;

/* JADX INFO: renamed from: X.0zNL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893570zNL implements OpenResultCallback {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // com.bytedance.router.OpenResultCallback
    public final void onActionResult(Object obj) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final /* synthetic */ void onEmpty() {
        C1951107kb.LIZ(this);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onIntercept(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onMatched(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onMissed(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final /* synthetic */ void onOpen(Intent intent) {
        C1951107kb.LIZIZ(this, intent);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onSuccess(Intent intent) {
        C1893680zNW c1893680zNW = C1893680zNW.LIZ;
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        c1893680zNW.getClass();
        C1893680zNW.LJII(1, str, str2);
    }

    public C1893570zNL(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onFail(String str, String str2) {
        C1893680zNW c1893680zNW = C1893680zNW.LIZ;
        if (str == null) {
            str = "empty url";
        }
        String str3 = this.LIZIZ;
        c1893680zNW.getClass();
        C1893680zNW.LJII(0, str, str3);
    }
}
