package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.experiment.SystemMediaPickerImageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0L0I, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L0I {
    public static final C0L0I LIZ = new C0L0I();
    public static final CopyOnWriteArrayList<Uri> LIZIZ = new CopyOnWriteArrayList<>();
    public static final ConcurrentHashMap<String, TikTokMediaModel> LIZJ = new ConcurrentHashMap<>();
    public static int LIZLLL = -1;

    public static boolean LIZIZ() {
        return (LIZIZ.isEmpty() ^ true) && C522640Kec.LIZ();
    }

    public static void LIZ(C19EG c19eg, C0L91 c0l91) {
        String[] strArr;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        if (C2401309b1.LIZ()) {
            Object[] objArrLJIIIIZZ = C13DL.LJIIIIZZ("image/heif", ((SystemMediaPickerImageConfig) C0L32.LIZIZ.getValue()).supportMimeTyps.toArray(new String[0]));
            int length = objArrLJIIIIZZ.length;
            Object[] objArrCopyOf = Arrays.copyOf(objArrLJIIIIZZ, length + 1);
            objArrCopyOf[length] = "image/heic";
            strArr = (String[]) objArrCopyOf;
        } else {
            strArr = (String[]) ((SystemMediaPickerImageConfig) C0L32.LIZIZ.getValue()).supportMimeTyps.toArray(new String[0]);
        }
        int i = C524400KhS.LIZ[c0l91.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    strArr = new String[]{"video/*"};
                } else {
                    throw new C1954807lC();
                }
            }
        } else {
            strArr = (String[]) C13DL.LJIIIIZZ("video/*", strArr);
        }
        Intent intent = new Intent("android.provider.action.PICK_IMAGES");
        intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", MediaStore.getPickImagesMaxLimit());
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        C2429209fW.LIZ().appendDataFlowId(intent, 1207969301);
        if (intent.resolveActivity(c19eg.getPackageManager()) != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent, "Activity_startActivityForResult_2");
            C1701330uNH.LIZ(intent, c19eg);
            C2204961BRm.LLJJJJJIL(12353, intent, c19eg, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkcfBgI0ODPb91LyjQZq8ouckNS06t23ZNOe/7M1Ff6XRJJRA3q91QC+oNA==", null));
            return;
        }
        C530000KqU.LIZIZ("TikTok-CreativeMediaSelector", AFwS194S0000000_8.get$arr$(480));
    }
}
