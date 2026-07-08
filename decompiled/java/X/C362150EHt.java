package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0EHt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362150EHt extends AbstractC362130EHr {
    public final C362120EHq LJFF;
    public final ArrayList<C361980EHc> LJI;

    public final boolean LIZJ() {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
        return (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.isFromCreateTemplate) ? false : true;
    }

    public C362150EHt(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, C0E48 c0e48, C362120EHq c362120EHq) {
        super(c19eg, videoPublishEditModel, nLEModel, c0e48);
        this.LJFF = c362120EHq;
        this.LJI = new ArrayList<>();
    }
}
