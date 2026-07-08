package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Clh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239911Clh {
    public final Aweme LIZ;
    public int LIZIZ;
    public final List<PhotoModeImageUrlModel> LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJFF;
    public final Set<Integer> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2239911Clh)) {
            return false;
        }
        C2239911Clh c2239911Clh = (C2239911Clh) obj;
        return Intrinsics.LJFF(this.LIZ, c2239911Clh.LIZ) && this.LIZIZ == c2239911Clh.LIZIZ;
    }

    public C2239911Clh(Aweme aweme, int i) {
        List<PhotoModeImageUrlModel> imageList;
        this.LIZ = aweme;
        this.LIZIZ = i;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null) {
            imageList = photoModeImageInfo.getImageList();
        } else {
            imageList = null;
        }
        this.LIZJ = imageList;
        this.LJI = new LinkedHashSet();
    }
}
