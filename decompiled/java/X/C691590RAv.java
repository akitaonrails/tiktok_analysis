package X;

import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691590RAv extends C09AY implements Function0<C691540RAq> {
    public final /* synthetic */ C0SR4 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C691590RAv(C0SR4 c0sr4) {
        super(0);
        this.LL = c0sr4;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0RAq] */
    @Override // kotlin.jvm.functions.Function0
    public final C691540RAq invoke() {
        return new C0SZR<VideoBaseCell, VideoItemParams>(this.LL) { // from class: X.0RAq
            @Override // X.C0SZR
            public final String LIZLLL(C0OB8 c0ob8, C0RGF c0rgf, int i) {
                VideoItemParams videoItemParams = (VideoItemParams) c0ob8;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("feed_proxy_aid_null: scene: ");
                sbLIZ.append(((VideoBaseCell) c0rgf).LLLIIL());
                sbLIZ.append(", pageType: ");
                sbLIZ.append(videoItemParams.mPageType);
                sbLIZ.append(", eventType: ");
                sbLIZ.append(videoItemParams.mEventType);
                sbLIZ.append(", fragment: ");
                sbLIZ.append(videoItemParams.fragment);
                sbLIZ.append(", adapterType: ");
                sbLIZ.append(videoItemParams.adapterType);
                sbLIZ.append(", enterMethod: ");
                sbLIZ.append(videoItemParams.mEnterMethodValue);
                sbLIZ.append(", requestId: ");
                sbLIZ.append(videoItemParams.mRequestId);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }
}
