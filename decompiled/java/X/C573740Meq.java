package X;

import android.app.PendingIntent;
import android.content.Intent;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.appwidget.CameraWidgetProvider;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Meq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573740Meq {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(239));

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static PendingIntent LIZIZ(C19EG c19eg, String str, String str2, String str3, String str4) {
        Intent intent = new Intent(c19eg, (Class<?>) CameraWidgetProvider.class);
        intent.setAction("");
        intent.putExtra("shoot_way", str);
        intent.putExtra("enter_from", str2);
        intent.putExtra("creation_id", str3);
        intent.putExtra(Scene.SCENE_SERVICE, str4);
        return PendingIntent.getBroadcast(c19eg, 0, intent, 201326592);
    }
}
