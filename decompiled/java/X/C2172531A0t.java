package X;

import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS16S2300000_21;

/* JADX INFO: renamed from: X.1A0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2172531A0t {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C19EG c19eg, final C2172521A0s c2172521A0s, final AwS16S2300000_21 awS16S2300000_21) {
        String[] strArr;
        if (Build.VERSION.SDK_INT == 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO"};
        } else {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        C19771812Xk.LIZIZ(c19eg, TokenCert.Companion.with("bpea-ecom_highlight_store_video"), strArr, new InterfaceC19772112Xn() { // from class: X.1A0u
            @Override // X.InterfaceC19772112Xn
            public final void LIZ(int[] iArr, String[] strArr2) {
                if (iArr != null && iArr.length != 0 && iArr[0] == 0) {
                    Function0<Unit> function0 = awS16S2300000_21;
                    if (function0 != null) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                c2172521A0s.onFailed("permission_deny");
            }
        });
    }
}
