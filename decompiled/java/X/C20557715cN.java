package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.videoadaption.adaptioncontext.VideoAdaptionManagerContext;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15cN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20557715cN extends C09AY implements Function0<C20561315cx> {
    public final /* synthetic */ CellAdaptionComponentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20557715cN(CellAdaptionComponentV2 cellAdaptionComponentV2) {
        super(0);
        this.LL = cellAdaptionComponentV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C20561315cx invoke() {
        String strIp = this.LL.ip();
        VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ(this.LL);
        return new C20561315cx(strIp, new VideoAdaptionManagerContext(videoItemParams != null ? videoItemParams.mEventType : null, this.LL.hp()));
    }
}
