package X;

import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: renamed from: X.0ayv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955870ayv {
    public final long LIZ;
    public final String LIZIZ;
    public final ImageModel LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InvitationGuestItem(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C955870ayv(long j, String str, ImageModel imageModel) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = imageModel;
    }
}
