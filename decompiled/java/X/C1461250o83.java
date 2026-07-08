package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0o83, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461250o83 {
    public final String LIZ;
    public final String LIZIZ;
    public final Effect LIZJ;
    public final String LIZLLL;
    public float LJ;
    public boolean LJFF;

    public final boolean LIZ() {
        return C123100dR.LIZ(this.LIZIZ) && C2286708xd.LIZJ(this.LIZIZ) && C2286708xd.LJIIL(this.LIZIZ) > 0;
    }

    public final boolean LIZIZ() {
        return C123100dR.LIZ(this.LIZ) && C2286708xd.LIZJ(this.LIZ) && C2286708xd.LJIIL(this.LIZ) > 0;
    }

    public C1461250o83(String str, String str2, Effect effect, String str3, int i) {
        float f;
        Effect effect2 = effect;
        String str4 = str2;
        String str5 = (i & 1) != 0 ? "" : str;
        str4 = (i & 2) != 0 ? "" : str4;
        effect2 = (i & 8) != 0 ? new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null) : effect2;
        String str6 = (i & 32) == 0 ? str3 : "";
        if ((i & 128) != 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.LIZ = str5;
        this.LIZIZ = str4;
        this.LIZJ = effect2;
        this.LIZLLL = str6;
        this.LJ = f;
        this.LJFF = false;
    }
}
