package X;

import android.content.ClipData;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaMetadataRetriever;
import android.view.View;
import com.lynx.tasm.service.IServiceProvider;

/* JADX INFO: renamed from: X.0jeg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1289280jeg extends IServiceProvider {
    void LIZ(ClipData clipData);

    boolean LIZIZ(SensorManager sensorManager, C1289260jee c1289260jee, Sensor sensor, int i);

    Bitmap LIZJ(View view, Bitmap.Config config);

    void LIZLLL(SensorManager sensorManager, C1289260jee c1289260jee);

    String LJ(MediaMetadataRetriever mediaMetadataRetriever);

    String getLocale();

    Camera openCamera(int i);

    void releaseCamera(Camera camera);
}
