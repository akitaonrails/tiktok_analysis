package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.AwS465S0200000_30;

/* JADX INFO: renamed from: X.14VI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14VI {
    public final WeakReference<Activity> LIZ;
    public final InterfaceC20274014Uo LIZIZ;
    public final ExecutorService LIZJ;
    public Uri LIZLLL;
    public String LJ;
    public String LJFF;
    public C14UV LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public LocalServiceAlbumVM LJIIJ;

    public C14VI(WeakReference weakReference, C14VJ c14vj) {
        this.LIZ = weakReference;
        this.LIZIZ = c14vj;
        C2123408To c2123408To = new C2123408To(C0WQX.SERIAL);
        c2123408To.LIZIZ = "takePhoto";
        this.LIZJ = C823050WQl.LIZ(new C2123508Tp(c2123408To));
    }

    public final void LIZ(C14VK c14vk, LocalServiceAlbumVM localServiceAlbumVM) {
        boolean z;
        this.LJIIJ = localServiceAlbumVM;
        Activity activity = this.LIZ.get();
        if (activity == null) {
            this.LIZIZ.LIZ(1, "Activity not found");
            return;
        }
        if (!activity.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            this.LIZIZ.LIZ(1, "Camera feature not found");
            return;
        }
        if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(activity.getPackageManager()) == null) {
            this.LIZIZ.LIZ(1, "Camera app not found");
            return;
        }
        this.LJFF = c14vk.cameraType;
        if (!c14vk.compressImage && !c14vk.needBase64Data) {
            z = false;
        } else {
            z = true;
        }
        this.LJII = z;
        this.LJIIIZ = c14vk.compressOption;
        this.LJIIIIZZ = c14vk.saveToPhotoAlbum;
        boolean zLIZIZ = C442100HVg.LIZIZ(activity, new String[]{"android.permission.CAMERA"});
        if (!this.LJIIIIZZ ? zLIZIZ : !(Build.VERSION.SDK_INT < 33 ? !zLIZIZ || C838410Wul.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0 : !zLIZIZ || C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_IMAGES") != 0)) {
            C14UV c14uv = this.LJI;
            if (c14uv != null) {
                c14uv.cancel(false);
            }
            C14UV c14uv2 = new C14UV(activity, this, this.LJIIIIZZ);
            C0WP3.LIZLLL(c14uv2, this.LIZJ, new Unit[0]);
            this.LJI = c14uv2;
            return;
        }
        C442100HVg.LIZJ(activity, new AwS465S0200000_30(activity, this, 17));
    }
}
