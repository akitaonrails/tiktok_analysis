package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MY9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MY9 {
    public static final Set<String> LIZIZ() {
        C1433240nOs.LIZ.getClass();
        return C1433240nOs.LJII;
    }

    public static final Function1<InterfaceC1364105Vn<? super Unit>, Object> LIZ(PublishModel publishModel) {
        C1433240nOs.LIZ.getClass();
        if (publishModel == null) {
            return null;
        }
        return C1433240nOs.LJFF.remove(publishModel.publishId);
    }

    public static final void LIZJ(int i, C19EG c19eg, VideoPublishEditModel videoPublishEditModel, boolean z) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        C1433240nOs.LIZ.getClass();
        if (C1428470nHB.LJJZZI(videoPublishEditModel) && videoPublishEditModel.getImageAlbumData() != null && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null && !imageList.isEmpty()) {
            String creationId = videoPublishEditModel.getCreationId();
            C1433240nOs.LJI.put(creationId, C23250099c.LIZLLL((InterfaceC497601wk) C1433240nOs.LIZIZ.getValue(), null, null, new C1433140nOi(creationId, videoPublishEditModel, c19eg, i, z, null), 3));
        }
    }
}
