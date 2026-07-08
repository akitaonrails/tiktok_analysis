package X;

import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0ZIQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZIQ implements Serializable {
    public static final int $stable = 8;
    public final String enterMethod;
    public final VideoInfoFromURLResponse requestResult;
    public final int subType;

    public C0ZIQ(VideoInfoFromURLResponse videoInfoFromURLResponse, int i, String str) {
        this.requestResult = videoInfoFromURLResponse;
        this.subType = i;
        this.enterMethod = str;
    }
}
