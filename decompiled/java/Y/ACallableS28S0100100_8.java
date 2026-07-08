package Y;

import X.C0LAB;
import X.C1C7U;
import X.C2341909Fp;
import X.C571770Mbf;
import X.InterfaceC2342209Fs;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public class ACallableS28S0100100_8 implements Callable {
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

    public static final Object call$0(ACallableS28S0100100_8 aCallableS28S0100100_8) {
        C1C7U.LIZ("MvChoosePhotoScene@c985.mobPhotoPanelShow$1$1");
        ((MvChoosePhotoScene) aCallableS28S0100100_8.l0).getUiResponseEventMobHelper().LIZ(-1, aCallableS28S0100100_8.j1, "click_album", true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.mobPhotoPanelShow$1$1");
        return unit;
    }

    public static final Object call$1(ACallableS28S0100100_8 aCallableS28S0100100_8) {
        C1C7U.LIZ("VideoPublishStageKt@6e0a.mobSaveDraft$1");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(aCallableS28S0100100_8.j1, "duration");
        c0lab.LJ("videoPath", ((AwemeDraft) aCallableS28S0100100_8.l0).LJI);
        c0lab.LIZIZ(((AwemeDraft) aCallableS28S0100100_8.l0).lastEditTime, "modify_time");
        C571770Mbf c571770Mbf = new C571770Mbf();
        c571770Mbf.LIZ = (AwemeDraft) aCallableS28S0100100_8.l0;
        c0lab.LIZIZ(c571770Mbf.LIZIZ(), "size");
        C2341909Fp.LIZ("tool_performance_draft_save", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoPublishStageKt@6e0a.mobSaveDraft$1");
        return unit;
    }

    public ACallableS28S0100100_8(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
