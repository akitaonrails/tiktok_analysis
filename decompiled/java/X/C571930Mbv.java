package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Mbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571930Mbv {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment LIZIZ(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r6, java.util.Map r7) {
        /*
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r2 = new com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment
            r2.<init>(r6)
            java.lang.String r0 = r6.LJFF()
            java.lang.Object r0 = r7.get(r0)
            r3 = 0
            if (r0 == 0) goto L62
            r6.LJFF()
            java.lang.String r0 = r6.LJFF()
            java.lang.Object r7 = r7.get(r0)
            com.ss.android.vesdk.VEUtils$VEVideoFileInfo r7 = (com.ss.android.vesdk.VEUtils.VEVideoFileInfo) r7
            if (r7 == 0) goto L61
            int r0 = r7.rotation
            int r0 = r0 % 180
            if (r0 == 0) goto L37
            int r1 = r7.height
            int r0 = r7.width
            r7.height = r0
            r7.width = r1
            X.1ESb r0 = X.C2281551ESb.LIZIZ
            boolean r0 = r0.LJJIJIIJIL()
            if (r0 == 0) goto L37
            r7.rotation = r3
        L37:
            int r0 = r7.width
            r2.width = r0
            int r0 = r7.height
            r2.height = r0
            int r0 = r7.duration
            long r0 = (long) r0
            r2.duration = r0
            long r5 = r2.LIZLLL()
            long r3 = r2.duration
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L51
            r2.LJIIJ(r3)
        L51:
            int r0 = r7.fps
            r2.fps = r0
            int r0 = r7.bitrate
            r2.bitRate = r0
            int r0 = r7.keyFrameCount
            r2.gop = r0
            int r0 = r7.codec
            r2.codecId = r0
        L61:
            return r2
        L62:
            java.lang.String r0 = r6.LJFF()
            com.ss.android.vesdk.VEUtils$VEVideoFileInfo r7 = com.ss.android.vesdk.VEUtils.getVideoFileInfo(r0)
            if (r7 == 0) goto L61
            int r0 = r7.rotation
            int r0 = r0 % 180
            if (r0 == 0) goto L37
            int r1 = r7.height
            int r0 = r7.width
            r7.height = r0
            r7.width = r1
            X.1ESb r0 = X.C2281551ESb.LIZIZ
            boolean r0 = r0.LJJIJIIJIL()
            if (r0 == 0) goto L37
            r7.rotation = r3
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C571930Mbv.LIZIZ(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, java.util.Map):com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment");
    }

    public static ArrayList LIZ(List list, boolean z, Map map, boolean z2, int i) {
        VideoSegment videoSegment;
        int i2 = 0;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            map = C2097608Jq.LJ();
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            if (list.size() == 1) {
                if (!z && !C2471909mP.LJJIIJZLJL((MediaModel) ListProtector.get(list, 0))) {
                    arrayList.add(LIZIZ((MediaModel) ListProtector.get(list, 0), map));
                } else {
                    arrayList.add(new VideoSegment((MediaModel) ListProtector.get(list, 0)));
                    return arrayList;
                }
            } else {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    int i3 = i2 + 1;
                    MediaModel mediaModel = (MediaModel) it2.next();
                    if (z2 && map.get(mediaModel.LJFF()) != null) {
                        videoSegment = LIZIZ(mediaModel, map);
                    } else {
                        videoSegment = new VideoSegment(mediaModel);
                    }
                    videoSegment.videoIndex = i2;
                    arrayList.add(videoSegment);
                    i2 = i3;
                }
            }
        }
        return arrayList;
    }
}
