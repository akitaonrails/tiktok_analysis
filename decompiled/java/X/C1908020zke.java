package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908020zke {
    public static final C1908020zke LIZ = new C1908020zke();

    public static void LIZ(Context context, String str, int i, String str2) {
        String strLIZIZ;
        Uri uri = UriProtector.parse(str);
        String strLIZIZ2 = C1907940zkW.LIZIZ(uri, "music_id");
        if (strLIZIZ2 == null || (strLIZIZ = C1907940zkW.LIZIZ(uri, "share_id")) == null) {
            return;
        }
        String strLIZIZ3 = C1907940zkW.LIZIZ(uri, "shoot_way");
        if (strLIZIZ3 == null) {
            strLIZIZ3 = "share_sound";
        }
        if ((i == R.id.pds || i == R.id.wvv) && context != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("shoot_way", strLIZIZ3);
            c2344009Gk.LJIIIIZZ("open_platform_share_id", strLIZIZ);
            c2344009Gk.LJIIIIZZ("channel", str2);
            C20684815ws.LJIILLIIL("shoot", c2344009Gk.LIZ);
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.shootWay(strLIZIZ3);
            builder.musicId(strLIZIZ2);
            builder.shareId(strLIZIZ);
            builder.clientId(str2);
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(context, strLIZIZ3, new C580990MqX(context, builder, 3));
        }
    }
}
