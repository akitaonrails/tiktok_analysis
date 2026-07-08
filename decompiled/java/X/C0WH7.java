package X;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdl;

/* JADX INFO: renamed from: X.0WH7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WH7 {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Boolean LJ;
    public final long LJFF;
    public final zzdl LJI;
    public final boolean LJII;
    public final Long LJIIIIZZ;
    public final String LJIIIZ;

    public C0WH7(Context context, zzdl zzdlVar, Long l) {
        this.LJII = true;
        C0W3J.LJIIIIZZ(context);
        Context contextN3 = C786410Ut5.N3(context);
        C0W3J.LJIIIIZZ(contextN3);
        this.LIZ = contextN3;
        this.LJIIIIZZ = l;
        if (zzdlVar != null) {
            this.LJI = zzdlVar;
            this.LIZIZ = zzdlVar.zzf;
            this.LIZJ = zzdlVar.zze;
            this.LIZLLL = zzdlVar.zzd;
            this.LJII = zzdlVar.zzc;
            this.LJFF = zzdlVar.zzb;
            this.LJIIIZ = zzdlVar.zzh;
            Bundle bundle = zzdlVar.zzg;
            if (bundle != null) {
                this.LJ = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
