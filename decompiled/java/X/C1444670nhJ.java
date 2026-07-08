package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;

/* JADX INFO: renamed from: X.0nhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1444670nhJ implements C11U6<VideoCreation> {
    public final long LIZ;

    @Override // X.C11U6
    public final void onFailure(Throwable th) {
    }

    public C1444670nhJ(long j) {
        this.LIZ = j;
    }

    @Override // X.C11U6
    public final void onSuccess(VideoCreation videoCreation) {
        VideoCreation videoCreation2 = videoCreation;
        if (videoCreation2 instanceof UploadAuthKeyConfig) {
            if (C522620Kea.LIZ()) {
                UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) videoCreation2;
                uploadAuthKeyConfig.saveTime = this.LIZ;
                C0CHQ.LIZ().getRegionService();
                uploadAuthKeyConfig.currentRegion = C20186013yc.LIZ();
            }
            String json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), videoCreation2);
            C1444650nhH.LIZ.getClass();
            C1444650nhH.LJFF(json);
            C1444650nhH.LJI((UploadAuthKeyConfig) videoCreation2, this.LIZ);
        }
    }
}
