package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0EHr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC362130EHr {
    public static final /* synthetic */ int LJ = 0;
    public final C19EG LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final NLEModel LIZJ;
    public final C0E48 LIZLLL;

    public final TuxIconDrawable LIZ(int i, int i2) {
        if (!C0EJA.LJI()) {
            i = i2;
        }
        return C357540E0a.LJJIJL(i, this.LIZ);
    }

    public final void LIZIZ(List<C361980EHc> list, C361980EHc c361980EHc) {
        if (C289170BVb.LIZ(this.LIZIZ, this.LIZJ)) {
            list.add(c361980EHc);
        }
    }

    public AbstractC362130EHr(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, C0E48 c0e48) {
        this.LIZ = c19eg;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = nLEModel;
        this.LIZLLL = c0e48;
    }
}
