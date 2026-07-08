package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.NoticeboardGuestController;

/* JADX INFO: renamed from: X.01G7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01G7 {
    public final String LIZ;
    public final NoticeboardGuestController.ImageMetaData LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageInfo(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", metadata=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C01G7(String str, NoticeboardGuestController.ImageMetaData imageMetaData) {
        this.LIZ = str;
        this.LIZIZ = imageMetaData;
    }
}
