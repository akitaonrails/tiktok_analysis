package X;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.push.PushBody;
import com.bytedance.push.notification.PushActivity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vr3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC810630Vr3 {
    public abstract Notification LIZ(Context context, PushBody pushBody, Bitmap bitmap);

    public static Notification LIZIZ(Notification.Builder builder, Context context, String str, String str2) {
        Bitmap bitmapDecodeResource;
        try {
            bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).applicationInfo.icon);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bitmapDecodeResource = null;
        }
        Notification.Builder contentText = builder.setContentTitle(str).setContentText(str2);
        contentText.setStyle(new Notification.BigTextStyle().bigText(str2));
        if (bitmapDecodeResource != null && !bitmapDecodeResource.isRecycled()) {
            contentText = contentText.setLargeIcon(bitmapDecodeResource);
        }
        return contentText.build();
    }

    public static Notification LIZJ(Notification.Builder builder, Context context, PushBody pushBody, Bitmap bitmap) {
        Bitmap bitmapDecodeResource = null;
        if (context == null || pushBody == null) {
            return null;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            pushBody.imageType = 0;
        }
        int i = pushBody.imageType;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return LIZIZ(builder, context, pushBody.title, pushBody.text);
                }
                String str = pushBody.title;
                builder.setContentTitle(str).setContentText(pushBody.text).setLargeIcon(bitmap);
                return builder.build();
            }
            String str2 = pushBody.title;
            String str3 = pushBody.text;
            try {
                bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).applicationInfo.icon);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            Notification.Builder contentText = builder.setContentTitle(str2).setContentText(str3);
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle().bigPicture(bitmap).setSummaryText(str3).setBigContentTitle(str2);
            if (bitmapDecodeResource != null && !bitmapDecodeResource.isRecycled()) {
                bigContentTitle = bigContentTitle.bigLargeIcon(bitmapDecodeResource);
            }
            contentText.setStyle(bigContentTitle).setLargeIcon(bitmap);
            return contentText.build();
        }
        return LIZIZ(builder, context, pushBody.title, pushBody.text);
    }

    public final void LIZLLL(Context context, int i, PushBody pushBody, Bitmap bitmap) {
        try {
            NotificationManager notificationManager = (NotificationManager) C786410Ut5.H2(context, "notification");
            Intent intent = new Intent(C786410Ut5.N3(context), (Class<?>) PushActivity.class);
            intent.putExtra("push_body", pushBody.LIZ());
            intent.putExtra("from_notification", true);
            intent.putExtra("message_from", i);
            intent.addFlags(268435456);
            if (pushBody.mIsPassThough) {
                Notification notificationLIZ = LIZ(context, pushBody, bitmap);
                if (notificationLIZ == null) {
                    return;
                }
                int i2 = (int) (pushBody.id % 2147483647L);
                notificationLIZ.contentIntent = PendingIntent.getActivity(context, i2, intent, 67108864);
                notificationManager.notify("app_notify", i2, notificationLIZ);
                C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("show notification finish. ");
                sbLIZ.append(pushBody);
                C2188811AlT.LIZIZ(sbLIZ);
                c809150Vof.getClass();
                return;
            }
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyUc9fIAydv9syP11iHMBV3VXU3TLr0UMXYAoT9BgvOlYbxcPuVJOI=", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
