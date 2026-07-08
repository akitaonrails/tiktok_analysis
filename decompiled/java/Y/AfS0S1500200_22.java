package Y;

import X.C013C;
import X.C09JN;
import X.C13LP;
import X.C1456980o1A;
import X.C1458080o2w;
import X.C1458390o3R;
import X.C1458410o3T;
import X.C1946707jt;
import X.C1C7U;
import X.C201955140j;
import X.C201962140q;
import X.C2188811AlT;
import X.C259800zU;
import android.app.Activity;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.setting.performance.AutoMusicDiskCacheOpt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.utils.IEditMusicServiceApi;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class AfS0S1500200_22 implements C09JN {
    public final int $t;
    public long j6;
    public long j7;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S1500200_22 afS0S1500200_22, Object obj) {
        Long lLIZIZ;
        Activity activity;
        String musicId;
        String musicId2;
        C1C7U.LIZ("StaticImageVideoAutoMusicLoader@362b.getRecommendMusic$1$1");
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecommendMusic timeout:");
        sbLIZ.append(System.currentTimeMillis() - afS0S1500200_22.j6);
        C201955140j.LJIILJJIL(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        ((IAnotherMusicService) afS0S1500200_22.l1).dl();
        C1458410o3T.LJIIL(afS0S1500200_22.s0);
        C1458390o3R.LIZ.getClass();
        C1458390o3R.LJJ();
        IEditMusicServiceApi iEditMusicServiceApiLIZIZ = C1456980o1A.LIZIZ();
        if (iEditMusicServiceApiLIZIZ != null) {
            MusicModel musicModel = (MusicModel) C13LP.LJJJLL((List) ((C259800zU) afS0S1500200_22.l2).element);
            String musicId3 = null;
            if (musicModel != null && (musicId2 = musicModel.getMusicId()) != null) {
                lLIZIZ = C1946707jt.LIZIZ(musicId2);
            } else {
                lLIZIZ = null;
            }
            WeakReference<Activity> weakReference = ((C1458080o2w) afS0S1500200_22.l3).LJIIIZ;
            if (weakReference != null) {
                activity = weakReference.get();
            } else {
                activity = null;
            }
            iEditMusicServiceApiLIZIZ.LJFF(lLIZIZ, activity);
            C1458080o2w c1458080o2w = (C1458080o2w) afS0S1500200_22.l3;
            String creationId = ((VideoPublishEditModel) afS0S1500200_22.l4).getCreationId();
            MusicModel musicModel2 = (MusicModel) C13LP.LJJJLL((List) ((C259800zU) afS0S1500200_22.l2).element);
            if (musicModel2 != null) {
                musicId = musicModel2.getMusicId();
            } else {
                musicId = null;
            }
            c1458080o2w.getClass();
            C1458080o2w.LJIIIIZZ(creationId, musicId);
            if (AutoMusicDiskCacheOpt.LIZ() && ((C013C) afS0S1500200_22.l5).element) {
                IEditMusicServiceApi iEditMusicServiceApiLIZIZ2 = C1456980o1A.LIZIZ();
                if (iEditMusicServiceApiLIZIZ2 != null) {
                    iEditMusicServiceApiLIZIZ2.LJ();
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getRecommendMusic timeout, use backup result timeout: ");
            sbLIZ2.append(afS0S1500200_22.j7);
            sbLIZ2.append(", backupMusicId: ");
            MusicModel musicModel3 = (MusicModel) C13LP.LJJJLL((List) ((C259800zU) afS0S1500200_22.l2).element);
            if (musicModel3 != null) {
                musicId3 = musicModel3.getMusicId();
            }
            sbLIZ2.append(musicId3);
            C201955140j.LJIILL(c201962140q, "MusicCapsuleProcessTracker", C2188811AlT.LIZIZ(sbLIZ2));
            C1C7U.LIZIZ("StaticImageVideoAutoMusicLoader@362b.getRecommendMusic$1$1");
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void accept$1(AfS0S1500200_22 afS0S1500200_22, Object obj) {
        Long lLIZIZ;
        Activity activity;
        String musicId;
        String musicId2;
        C1C7U.LIZ("StaticImageVideoAutoMusicLoader@362b.getRecommendMusicWithMeta$1$1");
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecommendMusicWithMeta timeout:");
        sbLIZ.append(System.currentTimeMillis() - afS0S1500200_22.j6);
        C201955140j.LJIILJJIL(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        ((IAnotherMusicService) afS0S1500200_22.l1).dl();
        C1458410o3T.LJIIL(afS0S1500200_22.s0);
        C1458390o3R.LIZ.getClass();
        C1458390o3R.LJJ();
        IEditMusicServiceApi iEditMusicServiceApiLIZIZ = C1456980o1A.LIZIZ();
        if (iEditMusicServiceApiLIZIZ != null) {
            MusicModel musicModel = (MusicModel) C13LP.LJJJLL((List) ((C259800zU) afS0S1500200_22.l2).element);
            String musicId3 = null;
            if (musicModel != null && (musicId2 = musicModel.getMusicId()) != null) {
                lLIZIZ = C1946707jt.LIZIZ(musicId2);
            } else {
                lLIZIZ = null;
            }
            WeakReference<Activity> weakReference = ((C1458080o2w) afS0S1500200_22.l3).LJIIIZ;
            if (weakReference != null) {
                activity = weakReference.get();
            } else {
                activity = null;
            }
            iEditMusicServiceApiLIZIZ.LJFF(lLIZIZ, activity);
            C1458080o2w c1458080o2w = (C1458080o2w) afS0S1500200_22.l3;
            String creationId = ((VideoPublishEditModel) afS0S1500200_22.l4).getCreationId();
            MusicModel musicModel2 = (MusicModel) C13LP.LJJJLL((List) ((C259800zU) afS0S1500200_22.l2).element);
            if (musicModel2 != null) {
                musicId = musicModel2.getMusicId();
            } else {
                musicId = null;
            }
            c1458080o2w.getClass();
            C1458080o2w.LJIIIIZZ(creationId, musicId);
            if (AutoMusicDiskCacheOpt.LIZ() && ((C013C) afS0S1500200_22.l5).element) {
                IEditMusicServiceApi iEditMusicServiceApiLIZIZ2 = C1456980o1A.LIZIZ();
                if (iEditMusicServiceApiLIZIZ2 != null) {
                    iEditMusicServiceApiLIZIZ2.LJ();
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getRecommendMusicWithMeta timeout, use backup result timeout: ");
            sbLIZ2.append(afS0S1500200_22.j7);
            sbLIZ2.append(", backupMusicId: ");
            MusicModel musicModel3 = (MusicModel) C13LP.LJJJLL((List) ((C259800zU) afS0S1500200_22.l2).element);
            if (musicModel3 != null) {
                musicId3 = musicModel3.getMusicId();
            }
            sbLIZ2.append(musicId3);
            C201955140j.LJIILL(c201962140q, "MusicCapsuleProcessTracker", C2188811AlT.LIZIZ(sbLIZ2));
            C1C7U.LIZIZ("StaticImageVideoAutoMusicLoader@362b.getRecommendMusicWithMeta$1$1");
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0011: IPUT (r11 I:java.lang.String), (r0 I:Y.AfS0S1500200_22) (LINE:150994961) Y.AfS0S1500200_22.s0 java.lang.String, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0003: IPUT (r2 I:long), (r0 I:Y.AfS0S1500200_22) (LINE:150994947) Y.AfS0S1500200_22.j6 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:java.lang.Object), (r0 I:Y.AfS0S1500200_22) (LINE:150994949) Y.AfS0S1500200_22.l1 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.AfS0S1500200_22, java.lang.Object] */
    public AfS0S1500200_22(long j, long j2, IAnotherMusicService iAnotherMusicService, C259800zU<List<MusicModel>> c259800zU, C1458080o2w c1458080o2w, VideoPublishEditModel videoPublishEditModel, C013C c013c, long j3, String str) {
        long j4;
        Object obj;
        String str2;
        obj.$t = str;
        obj.j6 = j4;
        obj.l1 = obj;
        obj.l2 = iAnotherMusicService;
        obj.l3 = c259800zU;
        obj.l4 = c1458080o2w;
        obj.l5 = videoPublishEditModel;
        obj.j7 = c013c;
        obj.s0 = str2;
        ?? obj2 = new Object();
    }
}
