package X;

import android.graphics.drawable.Drawable;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0EHs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362140EHs extends AbstractC362130EHr {
    public final Drawable LJFF;
    public final C361980EHc LJI;
    public final C361980EHc LJII;
    public final C361980EHc LJIIIIZZ;
    public final C361980EHc LJIIIZ;

    public final boolean LIZJ() {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
        return (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.isFromCreateTemplate) ? false : true;
    }

    public C362140EHs(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, C0E48 c0e48, Drawable drawable, C361980EHc c361980EHc, C361980EHc c361980EHc2, C361980EHc c361980EHc3, C361980EHc c361980EHc4) {
        super(c19eg, videoPublishEditModel, nLEModel, c0e48);
        this.LJFF = drawable;
        this.LJI = c361980EHc;
        this.LJII = c361980EHc2;
        this.LJIIIIZZ = c361980EHc3;
        this.LJIIIZ = c361980EHc4;
    }
}
