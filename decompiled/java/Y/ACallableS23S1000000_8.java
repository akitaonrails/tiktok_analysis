package Y;

import X.C0CHQ;
import X.C0LAB;
import X.C0VSJ;
import X.C1403010mc7;
import X.C194463116f;
import X.C1C7U;
import X.C201955140j;
import X.C2286708xd;
import X.C558570LvT;
import X.C577410Mkl;
import X.C684030QsL;
import X.InterfaceC194468116k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import java.util.concurrent.Callable;
import kotlin.Unit;
import lth.o;

/* JADX INFO: loaded from: classes9.dex */
public class ACallableS23S1000000_8 implements Callable {
    public final int $t;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS23S1000000_8 aCallableS23S1000000_8) {
        String str = aCallableS23S1000000_8.s0;
        String str2 = VideoEditContainerScene.LLLLLILLIL;
        C1C7U.LIZ("VideoEditContainerScene@649c.fetchAndAutoAttachMusic$1L");
        AVMusic aVMusicVk = C1403010mc7.LIZ.getMusicService().Vk(str);
        C1C7U.LIZIZ("VideoEditContainerScene@649c.fetchAndAutoAttachMusic$1L");
        return aVMusicVk;
    }

    public static final Object call$1(ACallableS23S1000000_8 aCallableS23S1000000_8) {
        String str = aCallableS23S1000000_8.s0;
        String str2 = VideoEditContainerScene.LLLLLILLIL;
        C1C7U.LIZ("VideoEditContainerScene@649c.fetchAiselfMusic$1L");
        AVMusic aVMusicVk = C1403010mc7.LIZ.getMusicService().Vk(str);
        C1C7U.LIZIZ("VideoEditContainerScene@649c.fetchAiselfMusic$1L");
        return aVMusicVk;
    }

    public static final Object call$2(ACallableS23S1000000_8 aCallableS23S1000000_8) {
        C1C7U.LIZ("SavePhotoStickerFileUtils@b98f.delete$1");
        try {
            C2286708xd.LJIILLIIL(new C0VSJ(aCallableS23S1000000_8.s0));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("SavePhotoStickerFileUtils delete error", e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SavePhotoStickerFileUtils@b98f.delete$1");
        return unit;
    }

    public static final Object call$3(ACallableS23S1000000_8 aCallableS23S1000000_8) {
        String str = aCallableS23S1000000_8.s0;
        C1C7U.LIZ("AVToolsHelper@51fc.fetchChallengeDetail$1L$1L");
        InterfaceC194468116k interfaceC194468116k = o.LIZLLL;
        AVChallenge aVChallengeLIZJ = C194463116f.LIZJ(str, true);
        C1C7U.LIZIZ("AVToolsHelper@51fc.fetchChallengeDetail$1L$1L");
        return aVChallengeLIZJ;
    }

    public static final Object call$4(ACallableS23S1000000_8 aCallableS23S1000000_8) {
        String str = aCallableS23S1000000_8.s0;
        C1C7U.LIZ("PublishServiceImpl@ed81.getRecoverDraftByDraftPrimaryKey$1L");
        AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(str)));
        C1C7U.LIZIZ("PublishServiceImpl@ed81.getRecoverDraftByDraftPrimaryKey$1L");
        return awemeDraftLJI;
    }

    public static final Object call$5(ACallableS23S1000000_8 aCallableS23S1000000_8) {
        C1C7U.LIZ("MemoryGainPerformanceMonitor@4454.recordAfterClickMemory$1");
        C577410Mkl c577410Mkl = C684030QsL.LIZ;
        if (c577410Mkl != null) {
            String str = aCallableS23S1000000_8.s0;
            C577410Mkl c577410MklLIZ = C684030QsL.LIZ();
            if (c577410MklLIZ != null && c577410Mkl.LIZLLL <= c577410MklLIZ.LIZLLL) {
                C0LAB c0lab = new C0LAB();
                c0lab.LIZIZ(c577410MklLIZ.LIZ - c577410Mkl.LIZ, "delta_mem_pss_dalvik");
                c0lab.LIZIZ(c577410MklLIZ.LIZIZ - c577410Mkl.LIZIZ, "delta_mem_pss_native");
                c0lab.LIZIZ(c577410MklLIZ.LIZJ - c577410Mkl.LIZJ, "delta_mem_pss_total");
                if (C684030QsL.LIZIZ) {
                    c0lab.LJFF("1st_auto_applied", true);
                    C684030QsL.LIZIZ = false;
                } else {
                    c0lab.LJFF("1st_auto_applied", false);
                }
                c0lab.LJ("effect_id", str);
                C0CHQ.LIZ().LIZJ().LJIIIIZZ("tool_performance_memory_gain", c0lab.LIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MemoryGainPerformanceMonitor@4454.recordAfterClickMemory$1");
        return unit;
    }

    public ACallableS23S1000000_8(String str, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 3:
            case 4:
                this.s0 = str;
                break;
            case 2:
            default:
                this.s0 = str;
                break;
        }
    }
}
