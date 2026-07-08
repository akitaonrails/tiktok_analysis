package Y;

import X.C0LAB;
import X.C1C7U;
import X.C2341909Fp;
import X.C856670Xj7;
import X.C857730Xkp;
import X.InterfaceC2342209Fs;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewScene;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes15.dex */
public class ACallableS30S0100100_14 implements Callable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS30S0100100_14 aCallableS30S0100100_14) {
        C1C7U.LIZ("ImagePublishPreviewScene@8961.onViewCreated$2$1");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(aCallableS30S0100100_14.j1, "duration");
        c0lab.LJ("type", "publish_preview");
        c0lab.LJ("content_type", "publish_image_preview");
        c0lab.LJ("enter_from", ((ImagePublishPreviewScene) aCallableS30S0100100_14.l0).LLJJL.creativeModel.postPageModel.previewEnterFrom);
        C2341909Fp.LIZ("tool_performance_publish_cover_first_frame", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImagePublishPreviewScene@8961.onViewCreated$2$1");
        return unit;
    }

    public static final Object call$1(ACallableS30S0100100_14 aCallableS30S0100100_14) {
        C1C7U.LIZ("CaptionComponent@1f90.snapshotCaptionStateForPublish$1");
        C857730Xkp c857730Xkp = (C857730Xkp) aCallableS30S0100100_14.l0;
        C856670Xj7 c856670Xj7 = c857730Xkp.LJIIIIZZ;
        VideoPublishEditModel videoPublishEditModel = c857730Xkp.LIZIZ;
        long j = aCallableS30S0100100_14.j1;
        c856670Xj7.getClass();
        C856670Xj7.LIZIZ(videoPublishEditModel, "publish", j);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionComponent@1f90.snapshotCaptionStateForPublish$1");
        return unit;
    }

    public ACallableS30S0100100_14(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
