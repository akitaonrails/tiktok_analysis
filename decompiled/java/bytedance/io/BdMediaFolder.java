package bytedance.io;

import X.C2500009qw;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BdMediaFolder implements Parcelable {
    public static final Parcelable.Creator<BdMediaFolder> CREATOR = new C2500009qw(0);
    public long bucketId;
    public ArrayList<BdMediaItem> data;
    public long firstDateAdded;
    public Uri firstImagePath;
    public String firstMimeType;
    public String folderName;
    public int folderTotalNum;
    public ArrayList<BdMediaItem> images;
    public boolean isAllAblubm;
    public ArrayList<BdMediaItem> videos;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BdMediaFolder() {
        this.bucketId = -1L;
        this.data = new ArrayList<>();
        this.images = new ArrayList<>();
        this.videos = new ArrayList<>();
    }

    public BdMediaFolder(Parcel parcel) {
        boolean z;
        this.bucketId = -1L;
        this.data = new ArrayList<>();
        this.images = new ArrayList<>();
        this.videos = new ArrayList<>();
        this.bucketId = parcel.readLong();
        this.folderName = parcel.readString();
        this.firstImagePath = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.firstMimeType = parcel.readString();
        this.firstDateAdded = parcel.readLong();
        this.folderTotalNum = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isAllAblubm = z;
        Parcelable.Creator<BdMediaItem> creator = BdMediaItem.CREATOR;
        this.data = parcel.createTypedArrayList(creator);
        this.images = parcel.createTypedArrayList(creator);
        this.videos = parcel.createTypedArrayList(creator);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.bucketId);
        parcel.writeString(this.folderName);
        parcel.writeParcelable(this.firstImagePath, i);
        parcel.writeString(this.firstMimeType);
        parcel.writeLong(this.firstDateAdded);
        parcel.writeInt(this.folderTotalNum);
        parcel.writeByte(this.isAllAblubm ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.data);
        parcel.writeTypedList(this.images);
        parcel.writeTypedList(this.videos);
    }
}
