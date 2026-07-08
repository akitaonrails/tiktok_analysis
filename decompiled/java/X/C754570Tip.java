package X;

import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: renamed from: X.0Tip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C754570Tip {
    public String LIZ;
    public String LIZIZ;
    public ImageModel LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserInfo(displayId='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', nickName='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', avatar=");
        ImageModel imageModel = this.LIZJ;
        sbLIZ.append(imageModel != null ? Integer.valueOf(imageModel.hashCode()) : null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C754570Tip(String str, String str2, ImageModel imageModel) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = imageModel;
    }
}
