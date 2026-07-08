package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;

/* JADX INFO: renamed from: X.08ZO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08ZO {
    public static Uri LIZ(Context context, C0VSJ c0vsj) {
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(context.getPackageName());
            sbLIZ.append(".fileprovider");
            return FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, C2188811AlT.LIZIZ(sbLIZ), c0vsj);
        }
        return Uri.fromFile(c0vsj);
    }
}
