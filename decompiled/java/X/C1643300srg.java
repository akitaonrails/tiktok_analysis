package X;

import android.graphics.Bitmap;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0srg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643300srg {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Effect LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final EnumC1154660g9Y LJIIIZ;
    public boolean LJIIJ;
    public final Bitmap LJIIJJI;

    public C1643300srg() {
        this(null, null, null, null, null, null, 0, 0, 0, null, false, null, 4095);
    }

    public C1643300srg(String str, String str2, String str3, String str4, String str5, Effect effect, int i, int i2, int i3, EnumC1154660g9Y enumC1154660g9Y, boolean z, Bitmap bitmap, int i4) {
        int i5 = i3;
        EnumC1154660g9Y enumC1154660g9Y2 = enumC1154660g9Y;
        boolean z2 = z;
        str = (i4 & 1) != 0 ? "" : str;
        str2 = (i4 & 2) != 0 ? "" : str2;
        str3 = (i4 & 4) != 0 ? "" : str3;
        String str6 = (i4 & 8) == 0 ? str4 : "";
        str5 = (i4 & 16) != 0 ? null : str5;
        effect = (i4 & 32) != 0 ? null : effect;
        i = (i4 & 64) != 0 ? 62 : i;
        int i6 = (i4 & 128) == 0 ? i2 : 62;
        i5 = (i4 & 256) != 0 ? 20 : i5;
        enumC1154660g9Y2 = (i4 & 512) != 0 ? EnumC1154660g9Y.REMOTE : enumC1154660g9Y2;
        z2 = (i4 & 1024) != 0 ? false : z2;
        Bitmap bitmap2 = (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? bitmap : null;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str6;
        this.LJ = str5;
        this.LJFF = effect;
        this.LJI = i;
        this.LJII = i6;
        this.LJIIIIZZ = i5;
        this.LJIIIZ = enumC1154660g9Y2;
        this.LJIIJ = z2;
        this.LJIIJJI = bitmap2;
    }
}
