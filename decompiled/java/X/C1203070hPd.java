package X;

import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: renamed from: X.0hPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203070hPd {
    public static final GoogleMapOptions LIZ(C1203050hPb c1203050hPb) {
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i = C1203080hPe.LIZ[c1203050hPb.LJFF.ordinal()];
        int i2 = 1;
        if (i != 1) {
            int i3 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i3 = 4;
                    if (i != 4) {
                        if (i != 5) {
                            throw new C1954807lC();
                        }
                        i2 = i3;
                    }
                } else {
                    i2 = i3;
                }
            }
        } else {
            i2 = 0;
        }
        googleMapOptions.zzd = i2;
        googleMapOptions.zzi = Boolean.valueOf(c1203050hPb.LIZIZ);
        googleMapOptions.zzh = Boolean.valueOf(c1203050hPb.LIZLLL);
        googleMapOptions.zzk = Boolean.valueOf(c1203050hPb.LIZJ);
        googleMapOptions.zzj = Boolean.valueOf(c1203050hPb.LJ);
        Boolean bool = c1203050hPb.LJIIIIZZ;
        if (bool != null) {
            googleMapOptions.zzr = Boolean.valueOf(bool.booleanValue());
        }
        Double d = c1203050hPb.LIZ;
        if (d != null) {
            googleMapOptions.zzo = Float.valueOf((float) d.doubleValue());
        }
        return googleMapOptions;
    }
}
