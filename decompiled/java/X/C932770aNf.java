package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932770aNf {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final float LIZLLL;
    public final int LJ;
    public final Drawable LJFF;
    public final float LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final C0UX6 LJIIIZ;
    public final boolean LJIIJ;
    public final Function1<View, Unit> LJIIJJI;

    public C932770aNf() {
        throw null;
    }

    public C932770aNf(int i, int i2, String str, float f, int i3, Drawable drawable, float f2, boolean z, boolean z2, boolean z3, Function1 function1, int i4) {
        z2 = (i4 & 256) != 0 ? false : z2;
        z3 = (i4 & 1024) != 0 ? true : z3;
        function1 = (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : function1;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = f;
        this.LJ = i3;
        this.LJFF = drawable;
        this.LJI = f2;
        this.LJII = z;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = null;
        this.LJIIJ = z3;
        this.LJIIJJI = function1;
    }
}
