package X;

import com.bytedance.retrofit2.mime.TypedByteArray;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0QfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676050QfT implements Serializable {
    public static final int $stable = 8;
    public String detection;
    public String detectionIdx;
    public Integer height;
    public transient TypedByteArray image;
    public String imageTosUri;
    public String localPath;
    public Integer width;

    public C676050QfT() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean isReady() {
        return (this.image == null && this.imageTosUri == null) ? false : true;
    }

    public final void setDetection(String str) {
        this.detection = str;
    }

    public final void setDetectionIdx(String str) {
        this.detectionIdx = str;
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    public final void setImage(TypedByteArray typedByteArray) {
        this.image = typedByteArray;
    }

    public final void setImageTosUri(String str) {
        this.imageTosUri = str;
    }

    public final void setLocalPath(String str) {
        this.localPath = str;
    }

    public final void setWidth(Integer num) {
        this.width = num;
    }

    public C676050QfT(TypedByteArray typedByteArray, String str, String str2, String str3, Integer num, Integer num2, String str4) {
        this.image = typedByteArray;
        this.imageTosUri = str;
        this.detection = str2;
        this.detectionIdx = str3;
        this.width = num;
        this.height = num2;
        this.localPath = str4;
    }
}
