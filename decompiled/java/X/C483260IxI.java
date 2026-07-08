package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.PreviewSurveyViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483260IxI extends C09AY implements Function0<C1ACA> {
    public final /* synthetic */ PreviewSurveyViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C483260IxI(PreviewSurveyViewModel previewSurveyViewModel) {
        super(0);
        this.LL = previewSurveyViewModel;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1ACA, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C1ACA invoke() {
        DataChannel dataChannel = this.LL.getDataChannel();
        if (dataChannel != null) {
            return dataChannel.gg0(C748910TZh.class);
        }
        return null;
    }
}
