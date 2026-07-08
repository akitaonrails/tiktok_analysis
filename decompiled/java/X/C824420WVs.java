package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSelectedSubPageItem;
import com.ss.android.ugc.awemepushapi.IPushApi;
import java.util.List;

/* JADX INFO: renamed from: X.0WVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824420WVs {
    public static final C824420WVs LIZ = new C824420WVs();

    public static final boolean LIZ(String str) {
        if (str != null && C303010BuF.LIZ().isSystemNotifyChannel(str) && Build.VERSION.SDK_INT >= 26) {
            String realChannelId = C303010BuF.LIZ().getRealChannelId(str);
            C844470XAv.LIZ.getClass();
            NotificationChannel notificationChannel = ((NotificationManager) C786410Ut5.H2(C844470XAv.LIZ(), "notification")).getNotificationChannel(realChannelId);
            if (notificationChannel != null && notificationChannel.getImportance() == 0) {
                return false;
            }
        }
        return true;
    }

    public static final C419910GdJ LIZJ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        int iN3 = C786410Ut5.n3(C844470XAv.LIZ().getResources(), str, "raw", C844470XAv.LIZ().getPackageName());
        if (iN3 == 0) {
            return null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = iN3;
        return c419910GdJ;
    }

    public static final List<PushSelectedSubPageItem> LIZLLL(Context context) {
        return C1697810uHb.LJIIJJI(new PushSelectedSubPageItem(context.getString(2131832273), null, 1, null), new PushSelectedSubPageItem(context.getString(2131832279), null, 2, null), new PushSelectedSubPageItem(context.getString(2131832276), null, 3, null));
    }

    public static final boolean LIZIZ(Context context, String str) {
        if (C824390WVp.LIZJ(context)) {
            return true;
        }
        IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null);
        if (iUnKnownOwnershipBusinessOuterService != null) {
            iUnKnownOwnershipBusinessOuterService.LJIL(context, str);
        }
        return false;
    }

    public static final void LJ(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            String realChannelId = ((IPushApi) ServiceManager.get().getService(IPushApi.class)).getRealChannelId(str);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openChannelSettings(new: ");
            sbLIZ.append(realChannelId);
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.setFlags(268435456);
            C844470XAv.LIZ.getClass();
            intent.putExtra("android.provider.extra.APP_PACKAGE", C844470XAv.LIZ().getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", realChannelId);
            if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV95BXyDsvMYQql+hFMznIimQ7IVt0f34VDoQ==", null));
            }
        }
    }
}
