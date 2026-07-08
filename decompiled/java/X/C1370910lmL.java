package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;

/* JADX INFO: renamed from: X.0lmL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1370910lmL {
    public String LIZ;
    public String LIZIZ;
    public ShareContentType[] LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public ShareModel LJI;
    public Bundle LJII = new Bundle();

    public C1370910lmL LIZ(Parcel parcel) {
        ShareContentType[] shareContentTypeArr;
        this.LIZ = parcel.readString();
        this.LIZIZ = parcel.readString();
        if (Build.VERSION.SDK_INT >= 33) {
            shareContentTypeArr = (ShareContentType[]) parcel.readArray(ShareContentType.class.getClassLoader(), ShareContentType.class);
        } else {
            shareContentTypeArr = (ShareContentType[]) parcel.readArray(ShareContentType.class.getClassLoader());
        }
        this.LIZJ = shareContentTypeArr;
        this.LJI = (ShareModel) parcel.readParcelable(ShareModel.class.getClassLoader());
        this.LIZLLL = parcel.readString();
        this.LJ = parcel.readString();
        this.LJFF = parcel.readString();
        C786410Ut5.LJJIIJZLJL(this.LJII, parcel.readBundle(getClass().getClassLoader()));
        return this;
    }
}
