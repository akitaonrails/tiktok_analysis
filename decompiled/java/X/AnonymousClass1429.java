package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1429, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1429 implements InterfaceC342470Dbh {
    public final CompletionBlock<InterfaceC1801700wzA> LL;
    public final Activity LLILLJJLI;
    public Uri LLILLL;

    public AnonymousClass1429(Activity activity, CompletionBlock completionBlock) {
        this.LL = completionBlock;
        this.LLILLJJLI = activity;
    }

    public final void LIZ(final Activity activity, final Function0<Unit> function0) {
        String[] strArr;
        String str;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            strArr = new String[1];
            if (i >= 34) {
                str = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
            } else {
                str = "android.permission.READ_MEDIA_IMAGES";
            }
            strArr[0] = str;
        } else {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        C19771812Xk.LIZIZ(activity, TokenCert.Companion.with("bpea-studio_blue_verification_permissions"), strArr, new InterfaceC19772112Xn() { // from class: X.142A
            @Override // X.InterfaceC19772112Xn
            public final void LIZ(int[] iArr, String[] strArr2) {
                if (iArr.length != 0) {
                    if (iArr[0] == 0) {
                        function0.invoke();
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 34 && iArr.length == 2 && C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                        function0.invoke();
                        return;
                    }
                    C1233040iBy c1233040iBy = new C1233040iBy(activity);
                    c1233040iBy.LIZJ(activity.getString(2131839204));
                    c1233040iBy.LIZLLL();
                    C2382909Vj.LIZ(this.LL, 1, "Upload Failed", null, 4);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    @Override // X.InterfaceC342470Dbh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onActivityResult(int r10, int r11, android.content.Intent r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1429.onActivityResult(int, int, android.content.Intent):boolean");
    }
}
