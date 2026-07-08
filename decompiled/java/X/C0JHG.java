package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.pcs.course.model.CreatePcsAwemeResponse;
import com.ss.android.ugc.aweme.live.pcs.course.model.SMBCourseVideoCopy;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import java.util.UUID;

/* JADX INFO: renamed from: X.0JHG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JHG implements InterfaceC489200JGk {
    public C0JH6 LIZIZ;
    public long LIZLLL;
    public Aweme LJ;
    public CreatePcsAwemeResponse.Data LJFF;
    public PublishModel LJI;
    public C0JH1 LIZ = C0JH1.UNKNOWN;
    public String LIZJ = "";
    public final long LJII = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;

    @Override // X.InterfaceC489200JGk
    public final void LJFF() {
    }

    @Override // X.InterfaceC489200JGk
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC489200JGk
    public final boolean LJIIJ() {
        return false;
    }

    @Override // X.InterfaceC489200JGk
    public final int LJIIL() {
        return 0;
    }

    @Override // X.InterfaceC489200JGk
    public final int LJIILJJIL() {
        return 0;
    }

    @Override // X.InterfaceC489200JGk
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC489200JGk
    public final boolean LJIL() {
        return false;
    }

    @Override // X.InterfaceC489200JGk
    public final boolean isMute() {
        return false;
    }

    @Override // X.InterfaceC489200JGk
    public final String LIZIZ() {
        String aid;
        Aweme aweme = this.LJ;
        return (aweme == null || (aid = aweme.getAid()) == null) ? "" : aid;
    }

    @Override // X.InterfaceC489200JGk
    public final String LIZJ() {
        String str;
        PublishModel publishModel = this.LJI;
        return (publishModel == null || (str = publishModel.creationId) == null) ? "" : str;
    }

    @Override // X.InterfaceC489200JGk
    public final int LIZLLL() {
        return this.LIZ.isUploaded() ? 2 : 0;
    }

    @Override // X.InterfaceC489200JGk
    public final int LJI() {
        return this.LIZ.isUploaded() ? 3 : 0;
    }

    @Override // X.InterfaceC489200JGk
    public final String LJII() {
        PublishModel publishModel = this.LJI;
        if (publishModel != null) {
            return publishModel.expectPublishTaskId;
        }
        return null;
    }

    @Override // X.InterfaceC489200JGk
    public final int LJIJ() {
        return this.LIZ.isUploaded() ? 3 : 0;
    }

    @Override // X.InterfaceC489200JGk
    public final int LJIJI() {
        return this.LIZ.isUploaded() ? 3 : 0;
    }

    @Override // X.InterfaceC489200JGk
    public final Aweme LJIJJLI() {
        Video video;
        String aid;
        Gson gson;
        SMBCourseVideoCopy sMBCourseVideoCopy;
        if (this.LJ == null) {
            GsonProvider gsonProvider = (GsonProvider) PluggableExtentionKt.pluggableSpi$default(GsonProvider.class, false, false, false, 14, null);
            Aweme aweme = null;
            str = null;
            String str = null;
            aweme = null;
            if (gsonProvider != null && (gson = gsonProvider.getGson()) != null) {
                CreatePcsAwemeResponse.Data data = this.LJFF;
                if (data != null && (sMBCourseVideoCopy = data.courseVideo) != null) {
                    str = sMBCourseVideoCopy.awemeStructStr;
                }
                aweme = (Aweme) GsonProtectorUtils.fromJson(gson, str, Aweme.class);
            }
            this.LJ = aweme;
            if (aweme != null && (video = aweme.getVideo()) != null) {
                Aweme aweme2 = this.LJ;
                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                    aid = "";
                }
                video.setSourceId(aid);
            }
        }
        return this.LJ;
    }

    @Override // X.InterfaceC489200JGk
    public final int LIZ() {
        return C489210JGl.LIZ(this);
    }

    @Override // X.InterfaceC489200JGk
    public final C0JH1 LJIIIIZZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC489200JGk
    public final String LJIILIIL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC489200JGk
    public final long LJIIZILJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC489200JGk
    public final C0JH6 LJIJJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC489200JGk
    public final long LJ(boolean z) {
        SMBCourseVideoCopy sMBCourseVideoCopy;
        CreatePcsAwemeResponse.Data data = this.LJFF;
        if (data != null && (sMBCourseVideoCopy = data.courseVideo) != null) {
            return sMBCourseVideoCopy.videoId;
        }
        if (z) {
            return this.LJII;
        }
        return 0L;
    }

    @Override // X.InterfaceC489200JGk
    public final boolean LJIIJJI(InterfaceC489200JGk interfaceC489200JGk) {
        return C489210JGl.LIZIZ(this, interfaceC489200JGk);
    }

    @Override // X.InterfaceC489200JGk
    public final void LJIILL(C0JH1 c0jh1) {
        this.LIZ = c0jh1;
    }
}
