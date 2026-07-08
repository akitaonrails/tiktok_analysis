package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0hAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193980hAy<T> extends C09AY implements Function1<T, C610040NwI> {
    public C1193980hAy() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0NwI] */
    @Override // kotlin.jvm.functions.Function1
    public final C610040NwI invoke(Object obj) {
        return new InterfaceC702540Rh6() { // from class: X.0NwI
            public VideoItemParams LL;

            @Override // X.InterfaceC702540Rh6
            public final void D6(Object obj2) {
                VideoItemParams videoItemParams;
                if (obj2 instanceof VideoItemParams) {
                    videoItemParams = (VideoItemParams) obj2;
                } else {
                    videoItemParams = null;
                }
                this.LL = videoItemParams;
            }

            @Override // X.InterfaceC700000Rd0
            public final void l0(boolean z) {
                String aid;
                Aweme aweme;
                PoiDataStruct poiDataStruct;
                Aweme aweme2;
                PoiDataStruct poiDataStruct2;
                Aweme aweme3;
                Aweme aweme4;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aid: ");
                VideoItemParams videoItemParams = this.LL;
                String desc = null;
                if (videoItemParams != null && (aweme4 = videoItemParams.getAweme()) != null) {
                    aid = aweme4.getAid();
                } else {
                    aid = null;
                }
                sbLIZ.append(aid);
                sbLIZ.append(", desc:");
                VideoItemParams videoItemParams2 = this.LL;
                if (videoItemParams2 != null && (aweme3 = videoItemParams2.getAweme()) != null) {
                    desc = aweme3.getDesc();
                }
                sbLIZ.append(desc);
                sbLIZ.append(", isWin:");
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
                VideoItemParams videoItemParams3 = this.LL;
                if (videoItemParams3 != null && (aweme2 = videoItemParams3.getAweme()) != null && (poiDataStruct2 = aweme2.getPoiDataStruct()) != null) {
                    poiDataStruct2.setTagShowed(z);
                }
                VideoItemParams videoItemParams4 = this.LL;
                if (videoItemParams4 != null && (aweme = videoItemParams4.getAweme()) != null && (poiDataStruct = aweme.getPoiDataStruct()) != null) {
                    poiDataStruct.setAnchorAvoidResult(!z);
                }
            }
        };
    }
}
