package X;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxError;
import j27.s;

/* JADX INFO: renamed from: X.0jxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1301120jxm {
    public Typeface LIZ(s sVar, EnumC1301150jxp enumC1301150jxp, String str) {
        if (!TextUtils.isEmpty(str) && enumC1301150jxp != EnumC1301150jxp.LOCAL) {
            int iIndexOf = str.indexOf("base64,");
            if (str.startsWith("data:") && iIndexOf != -1) {
                try {
                    return C08JN.LIZIZ(sVar, Base64.decode(str.substring(iIndexOf + 7), 0));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    String message = e.getMessage();
                    sVar.getClass();
                    sVar.LJJIFFI(str, "font", new LynxError(30203, message));
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
