package X;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostResource;

/* JADX INFO: renamed from: X.0TGF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TGF {
    public static int LIZ;

    public static void LIZ(String str) {
        if (str != null && !TextUtils.isEmpty(str) && LIZ <= 3) {
            LIZ++;
            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            if (iHostResource != null) {
                iHostResource.NP0(str);
            }
        }
    }
}
