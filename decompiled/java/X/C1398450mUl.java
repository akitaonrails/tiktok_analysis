package X;

import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0mUl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398450mUl {
    public final Context LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final Boolean LJIIJJI;

    public /* synthetic */ C1398450mUl(Context context, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, Boolean bool, int i2) {
        this(context, i, false, false, z, z2, z3, z4, (i2 & 256) != 0 ? false : z5, false, (i2 & 1024) != 0 ? null : str, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? bool : null);
    }

    public C1398450mUl(Context context, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str, Boolean bool) {
        this.LIZ = context;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = z5;
        this.LJII = z6;
        this.LJIIIIZZ = z7;
        this.LJIIIZ = z8;
        this.LJIIJ = str;
        this.LJIIJJI = bool;
    }
}
