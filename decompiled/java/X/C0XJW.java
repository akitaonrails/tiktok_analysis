package X;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0XJW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJW {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ() {
        List listLJJLIIIJILLIZJL;
        String[] strArr;
        C807360Vlm c807360VlmLJIIIIZZ = C2211631BhB.LJIIIIZZ();
        String str = "";
        if (c807360VlmLJIIIIZZ == null) {
            return "";
        }
        String[] strArr2 = (String[]) a0.LJJLIIIJILLIZJL(c807360VlmLJIIIIZZ.LIZIZ, new String[]{e3.d}, 0, 6).toArray(new String[0]);
        String str2 = strArr2.length > 1 ? strArr2[1] : "b0";
        String str3 = c807360VlmLJIIIIZZ.LIZJ;
        if (str3 != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{e3.d}, 0, 6)) != null && (strArr = (String[]) listLJJLIIIJILLIZJL.toArray(new String[0])) != null && strArr.length > 1) {
            str = strArr[1];
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(',');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(Activity activity, TokenCert tokenCert, Function0 function0, Function0 function02, Function1 function1) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 33) {
            if (function02 != null) {
                function02.invoke();
                return;
            }
            return;
        }
        int iLIZ = C838410Wul.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download pre check permission, result: ");
        sbLIZ.append(iLIZ);
        sbLIZ.append(", is granted: ");
        if (iLIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2344809Gs.LIZLLL(4, "download-request-permission", C2188811AlT.LIZIZ(sbLIZ));
        if (iLIZ == 0) {
            if (function02 == null) {
                return;
            }
            function02.invoke();
            return;
        }
        C1374720lsU.LJIIIIZZ(activity, tokenCert, function1, function0, function02);
    }
}
