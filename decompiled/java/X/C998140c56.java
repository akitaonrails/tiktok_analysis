package X;

import Y.ARunnableS116S0100000_16;
import android.animation.Animator;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: renamed from: X.0c56, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998140c56 implements InterfaceC998200c5C<InterfaceC998280c5K> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final InterfaceC998280c5K LL;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS252S0000000_16.get$arr$(567));
    public final C997320c3m LLILLL = new C997320c3m(AFwS252S0000000_16.get$arr$(566));
    public final C997320c3m LLILZ = new C997320c3m(AFwS252S0000000_16.get$arr$(568));
    public final int LLILZIL;
    public final Integer LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C998140c56.class, "componentStatus", "getComponentStatus()Lcom/ss/android/ugc/aweme/ad/feed/descriptive/RevampComponentStatus;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C998140c56.class, "animatorProvider", "getAnimatorProvider()Lcom/ss/android/ugc/aweme/ad/feed/descriptive/DescriptiveAnimatorProvider;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C998140c56.class, "logger", "getLogger()Lcom/ss/android/ugc/aweme/ad/feed/descriptive/CommerceFeedDescriptiveLogger;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    public final C998110c53 LIZ() {
        C997320c3m c997320c3m = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (C998110c53) c997320c3m.LIZ(this);
    }

    public final C998210c5D LIZIZ() {
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (C998210c5D) c997320c3m.LIZ(this);
    }

    public final C1000590c93 LIZJ() {
        C997320c3m c997320c3m = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (C1000590c93) c997320c3m.LIZ(this);
    }

    @Override // X.InterfaceC998200c5C
    public final void LJLJL() {
        this.LL.LIZ().LLFZ("COMMERCE_TOP_CARD_FIRST_STAGE_TASK");
        this.LL.LIZ().LLFZ("COMMERCE_TOP_CARD_SECOND_STAGE_TASK");
    }

    @Override // X.InterfaceC998200c5C
    public final void rk() {
        if (this.LL.LIZJ() || !LIZIZ().LIZLLL) {
            Animator animatorLJIIJ = LIZ().LJIIJ();
            if (animatorLJIIJ != null) {
                animatorLJIIJ.start();
            }
        } else {
            Animator animatorLJIIL = LIZ().LJIIL();
            if (animatorLJIIL != null) {
                animatorLJIIL.start();
            }
            LIZIZ().LIZLLL = false;
        }
        LIZIZ().LJ = false;
    }

    @Override // X.InterfaceC998200c5C
    public final void l1() {
        if (LIZIZ().LIZLLL) {
            Animator animatorLJIIIZ = LIZ().LJIIIZ();
            if (animatorLJIIIZ != null) {
                animatorLJIIIZ.start();
            }
            LIZIZ().LJ = true;
            C1000590c93 c1000590c93LIZJ = LIZJ();
            C1000560c90.LIZ.getClass();
            c1000590c93LIZJ.logAd(C1000560c90.LIZJ);
            return;
        }
        LIZ().LJIILIIL();
        Animator animatorLJIIJJI = LIZ().LJIIJJI();
        if (animatorLJIIJJI != null) {
            animatorLJIIJJI.start();
        }
        LIZIZ().LIZLLL = true;
        LIZIZ().LJ = true;
        C1000590c93 c1000590c93LIZJ2 = LIZJ();
        C1000560c90.LIZ.getClass();
        c1000590c93LIZJ2.logAd(C1000560c90.LIZIZ);
        LIZJ().logAd(C1000560c90.LIZJ);
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC998220c5E Mh() {
        return this.LL;
    }

    public C998140c56(C998160c58 c998160c58) {
        this.LL = c998160c58;
        this.LLILZIL = c998160c58.LIZ;
        this.LLILZLL = c998160c58.LIZIZ;
    }

    @Override // X.InterfaceC998200c5C
    public final void wv2(long j) {
        ARunnableS116S0100000_16 aRunnableS116S0100000_16 = new ARunnableS116S0100000_16(this, 206);
        IVideoPlayTaskManager iVideoPlayTaskManagerLIZ = this.LL.LIZ();
        C988300bpE c988300bpE = new C988300bpE("COMMERCE_TOP_CARD_FIRST_STAGE_TASK");
        c988300bpE.LIZIZ(j);
        c988300bpE.LIZJ = this.LLILZIL * LSPassThroughRecordSizeConfig.DEFAULT;
        c988300bpE.LIZLLL = aRunnableS116S0100000_16;
        c988300bpE.LJ = false;
        iVideoPlayTaskManagerLIZ.LLIFFJFJJ(c988300bpE.LIZ());
        Integer num = this.LLILZLL;
        if (num != null) {
            int iIntValue = num.intValue();
            IVideoPlayTaskManager iVideoPlayTaskManagerLIZ2 = this.LL.LIZ();
            C988300bpE c988300bpE2 = new C988300bpE("COMMERCE_TOP_CARD_SECOND_STAGE_TASK");
            c988300bpE2.LIZIZ(j);
            c988300bpE2.LIZJ = iIntValue * LSPassThroughRecordSizeConfig.DEFAULT;
            c988300bpE2.LIZLLL = new ARunnableS116S0100000_16(this, 205);
            c988300bpE2.LJ = false;
            iVideoPlayTaskManagerLIZ2.LLIFFJFJJ(c988300bpE2.LIZ());
        }
    }
}
