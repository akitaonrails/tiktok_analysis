package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18u4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21431818u4 implements InterfaceC21447618wc {
    public final AbstractC21446018wM LIZ;

    public C21431818u4(C21437118uv c21437118uv) {
        this.LIZ = c21437118uv;
    }

    public static C448930Hj1 LIZ(String str) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int length = str.length();
        int i = length - 1;
        for (int i2 = i; i2 > -1; i2--) {
            if (Character.isDigit(str.charAt(i2))) {
                int i3 = i2 + 1;
                try {
                    float f = CastFloatProtector.parseFloat(str.substring(0, i3));
                    if (i2 == i) {
                        strSubstring = null;
                    } else {
                        strSubstring = str.substring(i3, length);
                    }
                    return new C448930Hj1(f, strSubstring);
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
        }
        return null;
    }
}
