package X;

import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaSource;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0L5H, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L5H {
    public static final int LIZ(CameraLayoutModel cameraLayoutModel) {
        ArrayList<LayoutMediaSource> arrayList = cameraLayoutModel.layoutItemSources;
        int i = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<LayoutMediaSource> it2 = arrayList.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next() == LayoutMediaSource.CAPTURE && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public static final int LIZIZ(CameraLayoutModel cameraLayoutModel) {
        ArrayList<LayoutMediaSource> arrayList = cameraLayoutModel.layoutItemSources;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public static final int LIZJ(CameraLayoutModel cameraLayoutModel) {
        ArrayList<LayoutMediaType> arrayList = cameraLayoutModel.layoutItemTypes;
        int i = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<LayoutMediaType> it2 = arrayList.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next() == LayoutMediaType.LIVE_PHOTO && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public static final int LIZLLL(CameraLayoutModel cameraLayoutModel) {
        ArrayList<LayoutMediaType> arrayList = cameraLayoutModel.layoutItemTypes;
        int i = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<LayoutMediaType> it2 = arrayList.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next() == LayoutMediaType.PHOTO && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public static final int LJ(CameraLayoutModel cameraLayoutModel) {
        ArrayList<LayoutMediaSource> arrayList = cameraLayoutModel.layoutItemSources;
        int i = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<LayoutMediaSource> it2 = arrayList.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next() == LayoutMediaSource.UPLOAD && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public static final int LJFF(CameraLayoutModel cameraLayoutModel) {
        ArrayList<LayoutMediaType> arrayList = cameraLayoutModel.layoutItemTypes;
        int i = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<LayoutMediaType> it2 = arrayList.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next() == LayoutMediaType.VIDEO && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }
}
