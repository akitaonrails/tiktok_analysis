package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0MbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571550MbJ {
    public static final C571550MbJ LIZ = new C571550MbJ();

    public static EditPreviewInfo LIZ(boolean z, Workspace workspace, List list, long[] jArr) {
        Object next;
        int i;
        Object next2;
        int i2;
        int iLJ;
        VideoCutInfo videoCutInfo;
        VideoCutInfo videoCutInfo2;
        if (z) {
            ArrayList arrayList = new ArrayList();
            LIZ.getClass();
            Iterator it2 = list.iterator();
            Object next3 = null;
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    int i3 = ((VideoSegment) next).height;
                    do {
                        Object next4 = it2.next();
                        int i4 = ((VideoSegment) next4).height;
                        if (i3 < i4) {
                            next = next4;
                            i3 = i4;
                        }
                    } while (it2.hasNext());
                }
            }
            VideoSegment videoSegment = (VideoSegment) next;
            if (videoSegment != null) {
                i = videoSegment.height;
            } else {
                i = 0;
            }
            C2265108u9.LIZ(Integer.valueOf(i), "video_height");
            Iterator it3 = list.iterator();
            if (!it3.hasNext()) {
                next2 = null;
            } else {
                next2 = it3.next();
                if (it3.hasNext()) {
                    int i5 = ((VideoSegment) next2).width;
                    do {
                        Object next5 = it3.next();
                        int i6 = ((VideoSegment) next5).width;
                        if (i5 < i6) {
                            next2 = next5;
                            i5 = i6;
                        }
                    } while (it3.hasNext());
                }
            }
            VideoSegment videoSegment2 = (VideoSegment) next2;
            if (videoSegment2 != null) {
                i2 = videoSegment2.width;
            } else {
                i2 = 0;
            }
            C2265108u9.LIZ(Integer.valueOf(i2), "video_width");
            Iterator it4 = list.iterator();
            if (it4.hasNext()) {
                next3 = it4.next();
                if (it4.hasNext()) {
                    int iLJ2 = ((VideoSegment) next3).LJ();
                    do {
                        Object next6 = it4.next();
                        int iLJ3 = ((VideoSegment) next6).LJ();
                        if (iLJ2 < iLJ3) {
                            next3 = next6;
                            iLJ2 = iLJ3;
                        }
                    } while (it4.hasNext());
                }
            }
            VideoSegment videoSegment3 = (VideoSegment) next3;
            if (videoSegment3 != null) {
                iLJ = videoSegment3.LJ();
            } else {
                iLJ = 0;
            }
            C2265108u9.LIZ(Integer.valueOf(iLJ), "video_fps");
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList2.add(C571500MbE.LJFF((VideoSegment) it5.next()));
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
            long j = jArr[0];
            long j2 = jArr[1];
            if (j >= 0 && (videoCutInfo2 = ((EditVideoSegment) ListProtector.get(arrayList, 0)).getVideoCutInfo()) != null) {
                ListProtector.set(arrayList, 0, EditVideoSegment.copy$default((EditVideoSegment) ListProtector.get(arrayList, 0), null, null, null, new VideoCutInfo(videoCutInfo2.getStart() + j, videoCutInfo2.getEnd(), videoCutInfo2.getSpeed(), videoCutInfo2.getRotate()), 7, null));
            }
            if (j2 >= 0 && (videoCutInfo = ((EditVideoSegment) ListProtector.get(arrayList, arrayList.size() - 1)).getVideoCutInfo()) != null) {
                ListProtector.set(arrayList, arrayList.size() - 1, EditVideoSegment.copy$default((EditVideoSegment) ListProtector.get(arrayList, arrayList.size() - 1), null, null, null, new VideoCutInfo(videoCutInfo.getStart(), videoCutInfo.getEnd() - j2, videoCutInfo.getSpeed(), videoCutInfo.getRotate()), 7, null));
            }
            return new C538310L9h(C0CHQ.LIZ().LJJIIZ().getVideoWidth(), C0CHQ.LIZ().LJJIIZ().getVideoHeight(), 28).LIZ(arrayList);
        }
        return new C538330L9j(0, 0, 15).LIZ(new EditVideoSegment(workspace.LIZIZ().getPath(), workspace.LIZ().getPath(), C571500MbE.LJIIJ(workspace.LIZIZ().getPath())));
    }
}
