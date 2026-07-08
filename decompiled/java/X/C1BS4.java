package X;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.MarkerOptions;

/* JADX INFO: renamed from: X.1BS4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BS4 {
    public static final void LIZ(C1178140glQ c1178140glQ, MarkerOptions markerOptions) {
        markerOptions.zzm = 1.0f;
        markerOptions.zzh = c1178140glQ.LIZJ;
        markerOptions.zzb = c1178140glQ.LIZIZ;
        float f = c1178140glQ.LJ;
        float f2 = c1178140glQ.LIZLLL;
        markerOptions.zze = f;
        markerOptions.zzf = f2;
        markerOptions.zzn = c1178140glQ.LJFF;
        Bitmap bitmap = c1178140glQ.LIZ;
        if (bitmap != null) {
            markerOptions.zzd = C1BT8.LIZ(bitmap);
        }
    }
}
