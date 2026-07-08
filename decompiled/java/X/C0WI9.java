package X;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: renamed from: X.0WI9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0WI9 implements C0XBX {
    public C0WI8 LIZ;

    @Override // X.C0XBX
    public abstract String LIZ(String str);

    @Override // X.C0XBX
    public abstract void LIZJ(String str, String str2);

    public void LIZLLL(List<String> list) {
        C0WI8 c0wi8 = this.LIZ;
        if (c0wi8 != null) {
            c0wi8.LIZLLL(list);
        }
    }

    @Override // X.C0XBX
    public final String LIZIZ(String str, String str2) {
        C0WI8 c0wi8 = this.LIZ;
        String strLIZ = LIZ("device_id");
        boolean z = !TextUtils.isEmpty(str);
        boolean z2 = !TextUtils.isEmpty(strLIZ);
        if (!z && z2) {
            str = strLIZ;
        }
        if (c0wi8 != null) {
            str2 = c0wi8.LIZIZ(str, str2);
            if ((!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(strLIZ)) && (str2 == null || !str2.equals(strLIZ))) {
                LIZJ("device_id", str2);
                return str2;
            }
        } else {
            if (!z && !z2) {
                if (!(!TextUtils.isEmpty(str2))) {
                }
                LIZJ("device_id", str2);
                return str2;
            }
            str2 = str;
            if (z && (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(strLIZ))) {
                if (str2 != null && str2.equals(strLIZ)) {
                    return str2;
                }
                LIZJ("device_id", str2);
                return str2;
            }
        }
        return str2;
    }
}
