package X;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13ie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20087013ie {
    public final Context LIZ;
    public final int LIZIZ;
    public long LIZJ = 0;
    public EdgeEffect LIZLLL;
    public EdgeEffect LJ;
    public EdgeEffect LJFF;
    public EdgeEffect LJI;
    public EdgeEffect LJII;
    public EdgeEffect LJIIIIZZ;
    public EdgeEffect LJIIIZ;
    public EdgeEffect LJIIJ;

    public final EdgeEffect LIZIZ() {
        EdgeEffect edgeEffect = this.LJ;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectLIZ = LIZ(EnumC1684030tvN.Vertical);
        this.LJ = edgeEffectLIZ;
        return edgeEffectLIZ;
    }

    public final EdgeEffect LIZJ() {
        EdgeEffect edgeEffect = this.LJFF;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectLIZ = LIZ(EnumC1684030tvN.Horizontal);
        this.LJFF = edgeEffectLIZ;
        return edgeEffectLIZ;
    }

    public final EdgeEffect LIZLLL() {
        EdgeEffect edgeEffect = this.LJI;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectLIZ = LIZ(EnumC1684030tvN.Horizontal);
        this.LJI = edgeEffectLIZ;
        return edgeEffectLIZ;
    }

    public final EdgeEffect LJ() {
        EdgeEffect edgeEffect = this.LIZLLL;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectLIZ = LIZ(EnumC1684030tvN.Vertical);
        this.LIZLLL = edgeEffectLIZ;
        return edgeEffectLIZ;
    }

    public final boolean LJFF() {
        return LJIIIIZZ(this.LJ);
    }

    public final boolean LJI() {
        return LJIIIIZZ(this.LJFF);
    }

    public final boolean LJII() {
        return LJIIIIZZ(this.LJI);
    }

    public final boolean LJIIIZ() {
        return LJIIIIZZ(this.LIZLLL);
    }

    public static boolean LJIIIIZZ(EdgeEffect edgeEffect) {
        boolean z = false;
        if (edgeEffect == null) {
            return false;
        }
        if (C20087213ig.LIZIZ(edgeEffect) == 0.0f) {
            z = true;
        }
        return !z;
    }

    public final EdgeEffect LIZ(EnumC1684030tvN enumC1684030tvN) {
        EdgeEffect edgeEffect;
        Context context = this.LIZ;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                edgeEffect = new EdgeEffect(context, null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                edgeEffect = new EdgeEffect(context);
            }
        } else {
            edgeEffect = new C20087313ih(context);
        }
        edgeEffect.setColor(this.LIZIZ);
        if (!C1682900ttY.LIZIZ(this.LIZJ, 0L)) {
            if (enumC1684030tvN == EnumC1684030tvN.Vertical) {
                long j = this.LIZJ;
                edgeEffect.setSize((int) (j >> 32), (int) (j & 4294967295L));
            } else {
                long j2 = this.LIZJ;
                edgeEffect.setSize((int) (4294967295L & j2), (int) (j2 >> 32));
                return edgeEffect;
            }
        }
        return edgeEffect;
    }

    public C20087013ie(Context context, int i) {
        this.LIZ = context;
        this.LIZIZ = i;
    }
}
