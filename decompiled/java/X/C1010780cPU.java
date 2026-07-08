package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cPU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010780cPU {
    public final InterfaceC1010450cOx LIZ;
    public final C1010630cPF LIZIZ;
    public final LifecycleOwner LIZJ;
    public final Aweme LIZLLL;
    public final Set<EnumC1010840cPa> LJ;
    public final SearchAdEventLogger LJFF;
    public IVideoPlayTaskManager LJI;
    public boolean LJII;

    public final long LIZ() {
        return this.LIZ.getVideoLength();
    }

    public final void LIZIZ() {
        IVideoPlayTaskManager iVideoPlayTaskManager;
        IVideoPlayTaskManager iVideoPlayTaskManager2;
        this.LJI = this.LIZ.g70();
        int iLIZ = (int) (LIZ() * 0.25d);
        int iLIZ2 = (int) (LIZ() * 0.5d);
        int iLIZ3 = (int) (LIZ() * 0.75d);
        IVideoPlayTaskManager iVideoPlayTaskManager3 = this.LJI;
        if (iVideoPlayTaskManager3 != null) {
            C988300bpE c988300bpE = new C988300bpE("searchVideoAutoPlayTimingTask");
            c988300bpE.LIZIZ(LIZ());
            c988300bpE.LIZJ = 200;
            c988300bpE.LIZLLL = new ARunnableS116S0100000_16(this, 108);
            c988300bpE.LJ = true;
            iVideoPlayTaskManager3.LLIFFJFJJ(c988300bpE.LIZ());
        }
        IVideoPlayTaskManager iVideoPlayTaskManager4 = this.LJI;
        if (iVideoPlayTaskManager4 != null) {
            C988300bpE c988300bpE2 = new C988300bpE("searchVideoFirstQuartileTimingTask");
            c988300bpE2.LIZIZ(LIZ());
            c988300bpE2.LIZJ = iLIZ;
            c988300bpE2.LIZLLL = new ARunnableS116S0100000_16(this, 109);
            c988300bpE2.LJ = true;
            iVideoPlayTaskManager4.LLIFFJFJJ(c988300bpE2.LIZ());
        }
        IVideoPlayTaskManager iVideoPlayTaskManager5 = this.LJI;
        if (iVideoPlayTaskManager5 != null) {
            C988300bpE c988300bpE3 = new C988300bpE("searchVideoMidQuartileTimingTask");
            c988300bpE3.LIZIZ(LIZ());
            c988300bpE3.LIZJ = iLIZ2;
            c988300bpE3.LIZLLL = new ARunnableS116S0100000_16(this, 110);
            c988300bpE3.LJ = true;
            iVideoPlayTaskManager5.LLIFFJFJJ(c988300bpE3.LIZ());
        }
        IVideoPlayTaskManager iVideoPlayTaskManager6 = this.LJI;
        if (iVideoPlayTaskManager6 != null) {
            C988300bpE c988300bpE4 = new C988300bpE("searchVideoThirdQuartileTimingTask");
            c988300bpE4.LIZIZ(LIZ());
            c988300bpE4.LIZJ = iLIZ3;
            c988300bpE4.LIZLLL = new ARunnableS116S0100000_16(this, 111);
            c988300bpE4.LJ = true;
            iVideoPlayTaskManager6.LLIFFJFJJ(c988300bpE4.LIZ());
        }
        if (LIZ() >= 2000 && (iVideoPlayTaskManager2 = this.LJI) != null) {
            C988300bpE c988300bpE5 = new C988300bpE("SearchAd2sPlayProgressTrack");
            c988300bpE5.LIZIZ(LIZ());
            c988300bpE5.LIZJ = 2000;
            c988300bpE5.LIZLLL = new ARunnableS116S0100000_16(this, 112);
            c988300bpE5.LJ = true;
            iVideoPlayTaskManager2.LLIFFJFJJ(c988300bpE5.LIZ());
        }
        if (LIZ() < 6000 || (iVideoPlayTaskManager = this.LJI) == null) {
            return;
        }
        C988300bpE c988300bpE6 = new C988300bpE("SearchAd6sPlayProgressTrack");
        c988300bpE6.LIZIZ(LIZ());
        c988300bpE6.LIZJ = 6000;
        c988300bpE6.LIZLLL = new ARunnableS116S0100000_16(this, 113);
        c988300bpE6.LJ = true;
        iVideoPlayTaskManager.LLIFFJFJJ(c988300bpE6.LIZ());
    }

    public final void LIZJ() {
        InterfaceC1011430cQX interfaceC1011430cQX;
        C1009940cO8.LIZIZ(this.LIZ, this.LIZJ, C2097608Jq.LJIIIIZZ(new Pair(C1010930cPj.LIZ, new AwS560S0100000_16(this, 649)), new Pair(C1010900cPg.LIZ, new AwS560S0100000_16(this, 650)), new Pair(C1010910cPh.LIZ, new AwS560S0100000_16(this, 651)), new Pair(C1010920cPi.LIZ, new AwS560S0100000_16(this, 652)), new Pair(C1010940cPk.LIZ, new AwS560S0100000_16(this, 653))));
        C1010640cPG c1010640cPGUe = this.LIZ.ue();
        if (c1010640cPGUe == null || (interfaceC1011430cQX = c1010640cPGUe.LIZ) == null) {
            return;
        }
        interfaceC1011430cQX.LIZLLL(EnumC1011130cQ3.RETURN_FROM_DETAIL, new AwS560S0100000_16(this, 654));
    }

    public final void LIZLLL(EnumC1010840cPa enumC1010840cPa) {
        C1023960ckk c1023960ckk;
        AFwS252S0000000_16 aFwS252S0000000_16;
        Boolean bool;
        switch (C1010830cPZ.LIZ[enumC1010840cPa.ordinal()]) {
            case 1:
                C1009980cOC.LIZ.getClass();
                c1023960ckk = C1009980cOC.LJJLIIIJ;
                break;
            case 2:
                C1009980cOC.LIZ.getClass();
                c1023960ckk = C1009980cOC.LJJLIIIJLJLI;
                break;
            case 3:
                C1009980cOC.LIZ.getClass();
                c1023960ckk = C1009980cOC.LJJLIIIJLLLLLLLZ;
                break;
            case 4:
                C1009980cOC.LIZ.getClass();
                c1023960ckk = C1009980cOC.LJJLIIJ;
                break;
            case 5:
                C1009980cOC.LIZ.getClass();
                c1023960ckk = C1009980cOC.LJJLIL;
                break;
            case 6:
                C1009980cOC.LIZ.getClass();
                c1023960ckk = C1009980cOC.LJJLJ;
                break;
            case 7:
                C1009980cOC.LIZ.getClass();
                c1023960ckk = C1009980cOC.LJJLL;
                break;
            case 8:
                C1009980cOC.LIZ.getClass();
                c1023960ckk = C1009980cOC.LJJLJLI;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                C1009980cOC.LIZ.getClass();
                c1023960ckk = C1009980cOC.LJJLIIIJJIZ;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C1009980cOC.LIZ.getClass();
                c1023960ckk = C1009980cOC.LJJLIIIJL;
                break;
            default:
                throw new C1954807lC();
        }
        Map<EnumC1010840cPa, Boolean> map = this.LIZIZ.LIZIZ;
        if (map != null && (bool = map.get(enumC1010840cPa)) != null && !bool.booleanValue()) {
            return;
        }
        switch (C1010850cPb.LIZ[enumC1010840cPa.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (((HashSet) this.LJ).contains(enumC1010840cPa)) {
                    return;
                }
                break;
        }
        C01GW c01gw = C1010760cPS.LIZ;
        Aweme aweme = this.LIZLLL;
        String second = c1023960ckk.LJI.getSecond();
        if (C2264471DkD.LJ() && C1010760cPS.LIZIZ.contains(c1023960ckk) && C1010760cPS.LIZ().LIZ(aweme, String.valueOf(second))) {
            MeasurementDependencyModules.LIZ.getClass();
            C04TF.LIZ().isDebug();
        } else {
            if ((C2264471DkD.LJFF() || C2264471DkD.LIZJ()) && C1010760cPS.LIZ().LIZ(aweme, String.valueOf(second))) {
                MeasurementDependencyModules.LIZ.getClass();
                C04TF.LIZ().isDebug();
                aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(449);
            } else {
                MeasurementDependencyModules.LIZ.getClass();
                C04TF.LIZ().isDebug();
                aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(450);
            }
            this.LJFF.logAd(c1023960ckk, aFwS252S0000000_16);
        }
        enumC1010840cPa.name();
        this.LIZ.getCurrentPosition();
        this.LIZ.s2();
        int i = C2510609se.LIZ;
        ((HashSet) this.LJ).add(enumC1010840cPa);
    }

    public C1010780cPU(InterfaceC1010450cOx interfaceC1010450cOx, C1010630cPF c1010630cPF) {
        C19EG c19egLIZIZ;
        this.LIZ = interfaceC1010450cOx;
        this.LIZIZ = c1010630cPF;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view = interfaceC1010450cOx.Mh().getView();
        Context contextLIZ = interfaceC1010450cOx.Mh().LIZ();
        if (contextLIZ != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(contextLIZ);
        } else {
            c19egLIZIZ = null;
        }
        sAFHelper.getClass();
        this.LIZJ = SAFHelper.LJIJI(view, c19egLIZIZ);
        Aweme aweme = interfaceC1010450cOx.Mh().getAweme();
        this.LIZLLL = aweme;
        this.LJ = new HashSet();
        this.LJFF = new SearchAdEventLogger(aweme, interfaceC1010450cOx, C1010120cOQ.LJIIIIZZ(aweme));
    }
}
