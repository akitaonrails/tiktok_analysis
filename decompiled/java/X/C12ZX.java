package X;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzba;
import com.google.android.gms.measurement.internal.zzbf;

/* JADX INFO: renamed from: X.12ZX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12ZX {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final Bundle LIZLLL;

    public final zzbf LIZ() {
        return new zzbf(this.LIZ, new zzba(new Bundle(this.LIZLLL)), this.LIZIZ, this.LIZJ);
    }

    public final String toString() {
        return "origin=" + this.LIZIZ + ",name=" + this.LIZ + ",params=" + String.valueOf(this.LIZLLL);
    }

    public static C12ZX LIZIZ(zzbf zzbfVar) {
        return new C12ZX(zzbfVar.zzd, zzbfVar.zza, zzbfVar.zzc, zzbfVar.zzb.LLIFFJFJJ());
    }

    public C12ZX(long j, String str, String str2, Bundle bundle) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = bundle;
        this.LIZJ = j;
    }
}
