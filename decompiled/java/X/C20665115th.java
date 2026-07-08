package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.15th, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20665115th {
    public static final List<Integer> LIZ = C1697810uHb.LJIILJJIL(Integer.valueOf(R.layout.cta), Integer.valueOf(R.layout.ctg), Integer.valueOf(R.layout.ctc), Integer.valueOf(R.layout.ctd), Integer.valueOf(R.layout.cte), Integer.valueOf(R.layout.ctb), Integer.valueOf(R.layout.ctf), Integer.valueOf(R.layout.ct_));

    public static void LIZ(InnerPushMessage innerPushMessage) {
        InnerPushUITemplate uiTemplate;
        if (C20674015v8.LIZIZ()) {
            Iterator<Integer> it2 = LIZ.iterator();
            while (it2.hasNext()) {
                C20673215v0.LJIIIIZZ(it2.next().intValue());
            }
        }
        if (((Boolean) C20674015v8.LIZJ.getValue()).booleanValue() && (uiTemplate = innerPushMessage.getUiTemplate()) != null) {
            List<Bitmap> list = uiTemplate.preloadAvatar;
            if (list != null) {
                Iterator<Bitmap> it3 = list.iterator();
                while (it3.hasNext()) {
                    C786410Ut5.LJJJJ(it3.next());
                }
            }
            List<Bitmap> list2 = uiTemplate.preloadAvatar;
            if (list2 != null) {
                new ArrayList(list2).clear();
            }
            uiTemplate.setPreloadAvatar(null);
            Bitmap bitmap = uiTemplate.preloadLabelImage;
            if (bitmap != null) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            uiTemplate.setPreloadLabelImage(null);
            Bitmap bitmap2 = uiTemplate.preloadRightImage;
            if (bitmap2 != null) {
                bitmap2.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
            }
            uiTemplate.setPreloadRightImage(null);
            Bitmap bitmap3 = uiTemplate.preloadTopImage;
            if (bitmap3 != null) {
                bitmap3.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap3);
            }
            uiTemplate.setPreloadTopImage(null);
        }
    }
}
