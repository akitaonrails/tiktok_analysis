package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.creative.model.TemplateDynamicSlotModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;

/* JADX INFO: renamed from: X.0L7B, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L7B {
    public final NLETemplateModel LIZ;
    public NLEModel LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final AVMusic LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public TemplateDynamicSlotModel LJIIJJI = null;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateData(nleTemplateModel = ");
        sbLIZ.append(this.LIZ != null);
        sbLIZ.append(", nleModel = ");
        sbLIZ.append(this.LIZIZ != null);
        sbLIZ.append(", avMusic = ");
        AVMusic aVMusic = this.LJIIIIZZ;
        sbLIZ.append(aVMusic != null ? aVMusic.getMusicId() : null);
        sbLIZ.append(", musicPath = ");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0L7B(NLETemplateModel nLETemplateModel, NLEModel nLEModel, long j, String str, String str2, String str3, String str4, String str5, AVMusic aVMusic, String str6, boolean z) {
        this.LIZ = nLETemplateModel;
        this.LIZIZ = nLEModel;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = aVMusic;
        this.LJIIIZ = str6;
        this.LJIIJ = z;
    }
}
