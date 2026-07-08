package bytedance.io;

import X.C2188811AlT;
import X.C2500009qw;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class BdMediaItem implements Parcelable {
    public static final Parcelable.Creator<BdMediaItem> CREATOR = new C2500009qw(1);
    public String album;
    public long albumId;
    public String artist;
    public long bucketId;
    public String bucketName;
    public long dateAdded;
    public long dateToken;
    public long duration;
    public long fileSize;
    public int height;
    public long id;
    public String mimeType;
    public long modify;
    public int musicType;
    public String name;
    public int orientation;
    public String relativePath;
    public String resolution;
    public String title;
    public Uri uri;
    public int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BdMediaItem{id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", name='");
        sbLIZ.append(this.name);
        sbLIZ.append('\'');
        sbLIZ.append(", modify=");
        sbLIZ.append(this.modify);
        sbLIZ.append(", dateAdded=");
        sbLIZ.append(this.dateAdded);
        sbLIZ.append(", mimeType='");
        sbLIZ.append(this.mimeType);
        sbLIZ.append('\'');
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", fileSize=");
        sbLIZ.append(this.fileSize);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", musicType=");
        sbLIZ.append(this.musicType);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", relativePath='");
        sbLIZ.append(this.relativePath);
        sbLIZ.append('\'');
        sbLIZ.append(", dateToken=");
        sbLIZ.append(this.dateToken);
        sbLIZ.append(", orientation=");
        sbLIZ.append(this.orientation);
        sbLIZ.append(", resolution='");
        sbLIZ.append(this.resolution);
        sbLIZ.append('\'');
        sbLIZ.append(", album='");
        sbLIZ.append(this.album);
        sbLIZ.append('\'');
        sbLIZ.append(", artist='");
        sbLIZ.append(this.artist);
        sbLIZ.append('\'');
        sbLIZ.append(", title='");
        sbLIZ.append(this.title);
        sbLIZ.append('\'');
        sbLIZ.append(", albumId=");
        sbLIZ.append(this.albumId);
        sbLIZ.append(", bucketId=");
        sbLIZ.append(this.bucketId);
        sbLIZ.append(", bucketName=");
        sbLIZ.append(this.bucketName);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BdMediaItem() {
    }

    public BdMediaItem(Parcel parcel) {
        this.id = parcel.readLong();
        this.name = parcel.readString();
        this.modify = parcel.readLong();
        this.dateAdded = parcel.readLong();
        this.mimeType = parcel.readString();
        this.duration = parcel.readLong();
        this.fileSize = parcel.readLong();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.musicType = parcel.readInt();
        this.uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.relativePath = parcel.readString();
        this.dateToken = parcel.readLong();
        this.orientation = parcel.readInt();
        this.resolution = parcel.readString();
        this.album = parcel.readString();
        this.artist = parcel.readString();
        this.title = parcel.readString();
        this.albumId = parcel.readLong();
        this.bucketId = parcel.readLong();
        this.bucketName = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeLong(this.modify);
        parcel.writeLong(this.dateAdded);
        parcel.writeString(this.mimeType);
        parcel.writeLong(this.duration);
        parcel.writeLong(this.fileSize);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.musicType);
        parcel.writeParcelable(this.uri, i);
        parcel.writeString(this.relativePath);
        parcel.writeLong(this.dateToken);
        parcel.writeInt(this.orientation);
        parcel.writeString(this.resolution);
        parcel.writeString(this.album);
        parcel.writeString(this.artist);
        parcel.writeString(this.title);
        parcel.writeLong(this.albumId);
        parcel.writeLong(this.bucketId);
        parcel.writeString(this.bucketName);
    }
}
