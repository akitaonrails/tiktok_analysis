package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Kxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C534620Kxw extends C2217421BqW implements Function0<Unit> {
    public C534620Kxw(C1652290t6B c1652290t6B) {
        super(0, c1652290t6B, C1652290t6B.class, "hideLoading", "hideLoading()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1652290t6B c1652290t6B = (C1652290t6B) this.receiver;
        ((Handler) c1652290t6B.LLJJIJI.getValue()).removeCallbacksAndMessages(null);
        CreativeLoadingDialog creativeLoadingDialog = c1652290t6B.LLJJIJIIJIL;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
        }
        return Unit.LIZ;
    }
}
