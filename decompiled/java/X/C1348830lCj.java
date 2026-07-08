package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0lCj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348830lCj {
    public final View LIZ;
    public final C1353500lKG LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final TextView LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final EnumC048800Fq LJIIIZ;
    public final int LJIIJ;

    public C1348830lCj(View view, C1353500lKG c1353500lKG, TextView textView, String str, String str2, EnumC048800Fq enumC048800Fq, String str3, int i, int i2) {
        boolean z;
        if ((i2 & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        enumC048800Fq = (i2 & 512) != 0 ? EnumC048800Fq.DEFAULT : enumC048800Fq;
        i = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i;
        this.LIZ = view;
        this.LIZIZ = c1353500lKG;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = textView;
        this.LJI = str;
        this.LJII = str2;
        this.LJIIIIZZ = z;
        this.LJIIIZ = enumC048800Fq;
        this.LJIIJ = i;
    }
}
