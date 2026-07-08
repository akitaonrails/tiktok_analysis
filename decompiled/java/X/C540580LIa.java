package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540580LIa extends C09AY implements Function1<VideoPublishEditModel, List<? extends String>> {
    public C540580LIa() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends String> invoke(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        if (!C1428470nHB.LJZ(videoPublishEditModel2) && !C1428470nHB.LJJZZI(videoPublishEditModel2)) {
            return C13BV.INSTANCE;
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel2.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getSrcImageInfo().getPath());
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
