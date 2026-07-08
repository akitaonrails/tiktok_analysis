package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0L1O, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L1O {
    public final Effect LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0L1O(Effect effect, String str, String str2, String str3, String str4, int i, int i2) {
        String str5;
        int i3 = i;
        String str6 = str3;
        String str7 = (i2 & 8) != 0 ? "" : str2;
        str6 = (i2 & 16) != 0 ? "" : str6;
        String str8 = (i2 & 32) == 0 ? str4 : "";
        if ((i2 & 64) != 0) {
            str5 = "photo";
        } else {
            str5 = null;
        }
        this(effect, str, str7, str6, str8, str5, (i2 & 128) != 0 ? -1 : i3);
    }

    public C0L1O(Effect effect, String str, String str2, String str3, String str4, String str5, int i) {
        this.LIZ = effect;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = i;
    }
}
