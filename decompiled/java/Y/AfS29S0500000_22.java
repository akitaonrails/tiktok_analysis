package Y;

import X.C013C;
import X.C09JN;
import X.C13LP;
import X.C1456980o1A;
import X.C1458080o2w;
import X.C1458390o3R;
import X.C1946707jt;
import X.C1C7U;
import X.C201955140j;
import X.C201962140q;
import X.C2188811AlT;
import X.C259800zU;
import android.app.Activity;
import com.ss.android.ugc.aweme.setting.performance.AutoMusicDiskCacheOpt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.utils.IEditMusicServiceApi;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class AfS29S0500000_22 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final void accept$0(AfS29S0500000_22 afS29S0500000_22, Object obj) {
        Long lLIZIZ;
        Activity activity;
        String musicId;
        String name;
        String musicId2;
        C1C7U.LIZ("StaticImageVideoAutoMusicLoader@362b.getRecommendMusic$1$2$1");
        IEditMusicServiceApi iEditMusicServiceApiLIZIZ = C1456980o1A.LIZIZ();
        if (iEditMusicServiceApiLIZIZ != null) {
            MusicModel musicModel = (MusicModel) C13LP.LJJJLL((List) ((C259800zU) afS29S0500000_22.l0).element);
            String musicId3 = null;
            if (musicModel != null && (musicId2 = musicModel.getMusicId()) != null) {
                lLIZIZ = C1946707jt.LIZIZ(musicId2);
            } else {
                lLIZIZ = null;
            }
            WeakReference<Activity> weakReference = ((C1458080o2w) afS29S0500000_22.l1).LJIIIZ;
            if (weakReference != null) {
                activity = weakReference.get();
            } else {
                activity = null;
            }
            iEditMusicServiceApiLIZIZ.LJFF(lLIZIZ, activity);
            C1458080o2w c1458080o2w = (C1458080o2w) afS29S0500000_22.l1;
            String creationId = ((VideoPublishEditModel) afS29S0500000_22.l2).getCreationId();
            MusicModel musicModel2 = (MusicModel) C13LP.LJJJLL((List) ((C259800zU) afS29S0500000_22.l0).element);
            if (musicModel2 != null) {
                musicId = musicModel2.getMusicId();
            } else {
                musicId = null;
            }
            c1458080o2w.getClass();
            C1458080o2w.LJIIIIZZ(creationId, musicId);
            if (AutoMusicDiskCacheOpt.LIZ() && ((C013C) afS29S0500000_22.l3).element) {
                IEditMusicServiceApi iEditMusicServiceApiLIZIZ2 = C1456980o1A.LIZIZ();
                if (iEditMusicServiceApiLIZIZ2 != null) {
                    iEditMusicServiceApiLIZIZ2.LJ();
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C201962140q c201962140q = C201962140q.LIZIZ;
            C1458390o3R.LIZ.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getRecommendMusic error, use backup result, backupMusicName:");
            MusicModel musicModel3 = (MusicModel) C13LP.LJJJLL((List) ((C259800zU) afS29S0500000_22.l0).element);
            if (musicModel3 != null) {
                name = musicModel3.getName();
            } else {
                name = null;
            }
            sbLIZ.append(name);
            sbLIZ.append(" backupMusicId: ");
            MusicModel musicModel4 = (MusicModel) C13LP.LJJJLL((List) ((C259800zU) afS29S0500000_22.l0).element);
            if (musicModel4 != null) {
                musicId3 = musicModel4.getMusicId();
            }
            sbLIZ.append(musicId3);
            sbLIZ.append(", error: ");
            sbLIZ.append((Throwable) afS29S0500000_22.l4);
            C201955140j.LJIILL(c201962140q, "MusicCapsuleProcessTracker", C2188811AlT.LIZIZ(sbLIZ));
            C1C7U.LIZIZ("StaticImageVideoAutoMusicLoader@362b.getRecommendMusic$1$2$1");
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void accept$1(AfS29S0500000_22 afS29S0500000_22, Object obj) {
        Long lLIZIZ;
        Activity activity;
        String musicId;
        String name;
        String musicId2;
        C1C7U.LIZ("StaticImageVideoAutoMusicLoader@362b.getRecommendMusicWithMeta$1$2$1");
        IEditMusicServiceApi iEditMusicServiceApiLIZIZ = C1456980o1A.LIZIZ();
        if (iEditMusicServiceApiLIZIZ != null) {
            MusicModel musicModel = (MusicModel) C13LP.LJJJLL((List) ((C259800zU) afS29S0500000_22.l0).element);
            String musicId3 = null;
            if (musicModel != null && (musicId2 = musicModel.getMusicId()) != null) {
                lLIZIZ = C1946707jt.LIZIZ(musicId2);
            } else {
                lLIZIZ = null;
            }
            WeakReference<Activity> weakReference = ((C1458080o2w) afS29S0500000_22.l1).LJIIIZ;
            if (weakReference != null) {
                activity = weakReference.get();
            } else {
                activity = null;
            }
            iEditMusicServiceApiLIZIZ.LJFF(lLIZIZ, activity);
            C1458080o2w c1458080o2w = (C1458080o2w) afS29S0500000_22.l1;
            String creationId = ((VideoPublishEditModel) afS29S0500000_22.l2).getCreationId();
            MusicModel musicModel2 = (MusicModel) C13LP.LJJJLL((List) ((C259800zU) afS29S0500000_22.l0).element);
            if (musicModel2 != null) {
                musicId = musicModel2.getMusicId();
            } else {
                musicId = null;
            }
            c1458080o2w.getClass();
            C1458080o2w.LJIIIIZZ(creationId, musicId);
            if (AutoMusicDiskCacheOpt.LIZ() && ((C013C) afS29S0500000_22.l3).element) {
                IEditMusicServiceApi iEditMusicServiceApiLIZIZ2 = C1456980o1A.LIZIZ();
                if (iEditMusicServiceApiLIZIZ2 != null) {
                    iEditMusicServiceApiLIZIZ2.LJ();
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C201962140q c201962140q = C201962140q.LIZIZ;
            C1458390o3R.LIZ.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getRecommendMusicWithMeta error, use backup result, backupMusicName:");
            MusicModel musicModel3 = (MusicModel) C13LP.LJJJLL((List) ((C259800zU) afS29S0500000_22.l0).element);
            if (musicModel3 != null) {
                name = musicModel3.getName();
            } else {
                name = null;
            }
            sbLIZ.append(name);
            sbLIZ.append(" backupMusicId: ");
            MusicModel musicModel4 = (MusicModel) C13LP.LJJJLL((List) ((C259800zU) afS29S0500000_22.l0).element);
            if (musicModel4 != null) {
                musicId3 = musicModel4.getMusicId();
            }
            sbLIZ.append(musicId3);
            sbLIZ.append(", error: ");
            sbLIZ.append((Throwable) afS29S0500000_22.l4);
            C201955140j.LJIILL(c201962140q, "MusicCapsuleProcessTracker", C2188811AlT.LIZIZ(sbLIZ));
            C1C7U.LIZIZ("StaticImageVideoAutoMusicLoader@362b.getRecommendMusicWithMeta$1$2$1");
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS29S0500000_22(C259800zU c259800zU, C259800zU<List<MusicModel>> c259800zU2, C1458080o2w c1458080o2w, VideoPublishEditModel videoPublishEditModel, C013C c013c, Throwable th) {
        this.$t = th;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c1458080o2w;
        this.l3 = videoPublishEditModel;
        this.l4 = c013c;
    }
}
