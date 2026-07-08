package X;

import android.util.Pair;
import com.google.android.gms.maps.model.StampStyle;
import com.google.android.gms.maps.model.StrokeStyle;

/* JADX INFO: renamed from: X.0WsS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C836980WsS {
    public float LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public final StampStyle LJ;

    public C836980WsS(StrokeStyle strokeStyle) {
        this.LIZ = strokeStyle.zza;
        Pair pairLJLZ = strokeStyle.LJLZ();
        this.LIZIZ = ((Integer) pairLJLZ.first).intValue();
        this.LIZJ = ((Integer) pairLJLZ.second).intValue();
        this.LIZLLL = strokeStyle.zzd;
        this.LJ = strokeStyle.zze;
    }
}
