package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.services.external.ui.MediaChooseResultListener;

/* JADX INFO: renamed from: X.0KxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534170KxD implements MediaChooseResultListener {
    public final /* synthetic */ Intent LIZ;

    @Override // com.ss.android.ugc.aweme.services.external.ui.MediaChooseResultListener
    public final void onMediaChooseSuccess() {
        C522360KeA.LIZ(C523870Kgb.LIZIZ(this.LIZ, C0L92.SUCCESS, ""));
    }

    public C534170KxD(Intent intent) {
        this.LIZ = intent;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.MediaChooseResultListener
    public final void onMediaChooseFail(String str) {
        C522360KeA.LIZ(C523870Kgb.LIZIZ(this.LIZ, C0L92.FAILED, str));
    }
}
