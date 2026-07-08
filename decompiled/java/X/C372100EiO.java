package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EiO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C372100EiO extends C2217421BqW implements Function2<VideoPublishEditModel, Boolean, AbstractC2217051Bpv> {
    public C372100EiO(C372050EiJ c372050EiJ) {
        super(2, c372050EiJ, C372050EiJ.class, "getCaptionRecognizePresenter", "getCaptionRecognizePresenter(Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;Z)Lcom/ss/android/ugc/aweme/shortvideo/subtitle/BaseRecognizeCaptionPresenter;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final AbstractC2217051Bpv invoke(VideoPublishEditModel videoPublishEditModel, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        return ((C372050EiJ) this.receiver).tD0(videoPublishEditModel, zBooleanValue);
    }
}
