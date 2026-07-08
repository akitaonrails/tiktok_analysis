package X;

import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: renamed from: X.0U2X, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U2X {
    public final String LIZ;
    public final long LIZIZ;
    public final ImageModel LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("id:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", name:");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0U2X(long j, String str, ImageModel imageModel) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = imageModel;
    }
}
