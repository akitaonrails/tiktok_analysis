package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.18mk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21386418mk extends C21386818mo {
    public final Uri LJ;
    public final Object LJFF;
    public final EnumC1334360kpO LJI;
    public final InterfaceC427850Gq7 LJII;
    public final InterfaceC658750Psf LJIIIIZZ;
    public final Pair<Integer, Integer> LJIIIZ;
    public final EnumC714850S2h LJIIJ;
    public final C1331990klZ LJIIJJI;

    public C21386418mk() {
        this(null, null, null, null, null, null, null, 4095);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21386418mk(ImageUrlModel imageUrlModel, EnumC1334360kpO enumC1334360kpO, C708750Rr7 c708750Rr7, C630010OnP c630010OnP, Pair pair, EnumC714850S2h enumC714850S2h, String str, int i) {
        int i2;
        imageUrlModel = (i & 2) != 0 ? null : imageUrlModel;
        enumC1334360kpO = (i & 4) != 0 ? EnumC1334360kpO.MEDIUM : enumC1334360kpO;
        c708750Rr7 = (i & 8) != 0 ? null : c708750Rr7;
        c630010OnP = (i & 16) != 0 ? null : c630010OnP;
        pair = (i & 32) != 0 ? null : pair;
        enumC714850S2h = (i & 64) != 0 ? EnumC714850S2h.DEFAULT : enumC714850S2h;
        if ((i & 512) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        super((Drawable) null, i2, (Drawable) null, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str);
        this.LJ = null;
        this.LJFF = imageUrlModel;
        this.LJI = enumC1334360kpO;
        this.LJII = c708750Rr7;
        this.LJIIIIZZ = c630010OnP;
        this.LJIIIZ = pair;
        this.LJIIJ = enumC714850S2h;
        this.LJIIJJI = null;
    }
}
