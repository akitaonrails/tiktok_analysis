package X;

import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: renamed from: X.0fKf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123110fKf {
    public final long LIZ;
    public final long LIZIZ;
    public final ImageModel LIZJ;
    public final ImageModel LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FastGiftUpdateEvent{giftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", speedyGiftGreyIcon=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", speedyGiftColorfulIcon=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1123110fKf(long j, long j2, ImageModel imageModel, ImageModel imageModel2) {
        this.LIZ = j2;
        this.LIZIZ = j;
        this.LIZJ = imageModel;
        this.LIZLLL = imageModel2;
    }
}
