package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import iyl.i3;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570000MXe extends AbstractC1651430t4n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final EnumC1651770t5L LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final C1664740tQG LLJ;
    public final C1664740tQG LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final AwS552S0100000_8 LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C570000MXe.class, "aiTheaterApi", "getAiTheaterApi()Lcom/ss/android/ugc/gamora/recorder/aitheater/RecordAITheaterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C570000MXe.class, "aiTheaterAutoTaskApi", "getAiTheaterAutoTaskApi()Lcom/ss/android/ugc/gamora/recorder/aitheater/AITheaterAutoTaskApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C570000MXe.class, "splitShootApi", "getSplitShootApi()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C570000MXe.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final IAITheaterCreationLauncher.EnterParams LJIJJLI() {
        return (IAITheaterCreationLauncher.EnterParams) this.LLJILJIL.getValue();
    }

    @Override // X.AbstractC1651450t4p
    public final void LJIIJ() {
        C0MW8 c0mw8LJ;
        InterfaceC1651080t4E interfaceC1651080t4ELJIILIIL = LJIILIIL();
        EnumC1651770t5L enumC1651770t5L = this.LLILZLL;
        C1664740tQG c1664740tQG = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        final InterfaceC1659440tHi interfaceC1659440tHi = (InterfaceC1659440tHi) c1664740tQG.getValue(this, interfaceC2217461BqaArr[0]);
        interfaceC1651080t4ELJIILIIL.Kt1(enumC1651770t5L, new InterfaceC1651480t4s<i3, InterfaceC1651550t4z>(interfaceC1659440tHi) { // from class: X.0t4X
            public final InterfaceC1659440tHi LIZ;

            {
                this.LIZ = interfaceC1659440tHi;
            }

            @Override // X.InterfaceC1651480t4s
            public final InterfaceC1651590t53<i3, InterfaceC1651550t4z> LIZ(InterfaceC1651320t4c<? extends i3> interfaceC1651320t4c, final LifecycleOwner lifecycleOwner, final List<View> list) {
                final InterfaceC1659440tHi interfaceC1659440tHi2 = this.LIZ;
                return new C1659090tH9(lifecycleOwner, list, interfaceC1659440tHi2) { // from class: X.0tHA
                    public final InterfaceC1659440tHi LLILZLL;

                    @Override // X.C1659090tH9
                    public final C1659140tHE LJFF(C1659120tHC c1659120tHC) {
                        return new C1659400tHe(this.LL, c1659120tHC, this.LLILLJJLI, this.LLILZLL);
                    }

                    {
                        this.LLILZLL = interfaceC1659440tHi2;
                    }
                };
            }
        });
        if (!C1647240sy2.LIZ().unifyPreloadTasks) {
            IAITheaterFeatureService.LIZ.getClass();
            IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
            if (iAITheaterFeatureServiceLIZ != null && (c0mw8LJ = iAITheaterFeatureServiceLIZ.LJ()) != null) {
                c0mw8LJ.LIZIZ();
            }
            AITheaterProfileService aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null);
            if (aITheaterProfileService != null) {
                aITheaterProfileService.e9("creation");
            }
        }
        InterfaceC560240LyA interfaceC560240LyA = (InterfaceC560240LyA) this.LLIZLLLIL.getValue(this, interfaceC2217461BqaArr[1]);
        if (interfaceC560240LyA != null) {
            interfaceC560240LyA.OO1();
        }
    }

    @Override // X.AbstractC1651450t4p
    public final Function0<i3> LJI() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651770t5L LJIIIZ() {
        return this.LLILZLL;
    }

    public C570000MXe(C1DRG c1drg) {
        super(c1drg);
        this.LLILZLL = EnumC1651770t5L.AI_THEATER;
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1659440tHi.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC560240LyA.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1638550sk1.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1647420syK.class, null);
        this.LLJIJIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(377));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 911));
        this.LLJILJILJ = new AwS552S0100000_8(this, 910);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZIZ(i3 i3Var) {
        LIZIZ(i3Var);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIIZILJ */
    public final void LIZIZ(i3 i3Var) {
        AITheaterProfileService aITheaterProfileService;
        InterfaceC528960Koo interfaceC528960KooJ9;
        InterfaceC550750Lir interfaceC550750LirG9;
        super.LIZIZ(i3Var);
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C1E3D c1e3d = C1E3D.LJIIIIZZ;
        InterfaceC548750Lfd interfaceC548750LfdLIZ = C548910Lft.LIZ(LJIJJLI());
        AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(260);
        c548880Lfq.getClass();
        C548880Lfq.LIZLLL(c1e3d, interfaceC548750LfdLIZ, aFwS239S0000000_8);
        AITheaterProfileService aITheaterProfileService2 = (AITheaterProfileService) this.LLJIJIL.getValue();
        if (aITheaterProfileService2 != null && (interfaceC550750LirG9 = aITheaterProfileService2.g9()) != null) {
            interfaceC550750LirG9.LJIILL();
        }
        AIGCEntranceInfo aIGCEntranceInfo = LJIJJLI().entranceInfo;
        if (aIGCEntranceInfo != null && (aITheaterProfileService = (AITheaterProfileService) this.LLJIJIL.getValue()) != null && (interfaceC528960KooJ9 = aITheaterProfileService.j9()) != null) {
            interfaceC528960KooJ9.LJIIIIZZ(aIGCEntranceInfo);
        }
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZ(C1654400t9a c1654400t9a, Object obj) {
        LIZ(c1654400t9a, (i3) obj);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIJ */
    public final void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ;
        AITheaterProfileService aITheaterProfileService;
        InterfaceC528960Koo interfaceC528960KooJ9;
        String strWg;
        Integer numValueOf;
        super.LIZ(c1654400t9a, i3Var);
        C1664740tQG c1664740tQG = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        InterfaceC1659440tHi interfaceC1659440tHi = (InterfaceC1659440tHi) c1664740tQG.getValue(this, interfaceC2217461BqaArr[0]);
        if (interfaceC1659440tHi != null) {
            interfaceC1659440tHi.b2();
        }
        if (C0BUD.LIZ()) {
            InterfaceC1638550sk1 interfaceC1638550sk1 = (InterfaceC1638550sk1) this.LLJ.getValue(this, interfaceC2217461BqaArr[2]);
            if (interfaceC1638550sk1 != null) {
                strWg = interfaceC1638550sk1.Wg();
            } else {
                strWg = null;
            }
            AIGCEntranceInfo aIGCEntranceInfo = LJIJJLI().entranceInfo;
            if (aIGCEntranceInfo != null) {
                if (strWg != null && strWg.length() != 0) {
                    C1631530sYh.LIZ.getClass();
                    numValueOf = Integer.valueOf(C1631530sYh.LIZIZ(strWg));
                } else {
                    numValueOf = Integer.valueOf(LJIIL().shootMode);
                }
                aIGCEntranceInfo.shootMode = numValueOf;
            }
        }
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C1E3C c1e3c = C1E3C.LJIIIIZZ;
        InterfaceC548750Lfd interfaceC548750LfdLIZ = C548910Lft.LIZ(LJIJJLI());
        AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(260);
        c548880Lfq.getClass();
        C548880Lfq.LIZLLL(c1e3c, interfaceC548750LfdLIZ, aFwS239S0000000_8);
        String strLIZ = C528840Koc.LIZ();
        AIGCEntranceInfo aIGCEntranceInfo2 = LJIJJLI().entranceInfo;
        if (aIGCEntranceInfo2 != null && (aITheaterProfileService = (AITheaterProfileService) this.LLJIJIL.getValue()) != null && (interfaceC528960KooJ9 = aITheaterProfileService.j9()) != null) {
            interfaceC528960KooJ9.LIZLLL(strLIZ, aIGCEntranceInfo2);
        }
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (iAITheaterCreationLauncherLIZ = iAITheaterFeatureServiceLIZ.LIZ()) != null) {
            iAITheaterCreationLauncherLIZ.LIZ(LJIJJLI(), c1654400t9a.LIZ.getContext(), strLIZ, true, new AwS552S0100000_8(this, 912));
        }
    }
}
