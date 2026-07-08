package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility;
import com.ss.android.ugc.aweme.api.series.ICommerceFeedSeriesService;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS81S0100100_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cNL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009450cNL implements InterfaceC1008930cMV, InterfaceC1007910cKr, InterfaceC1009610cNb {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final Context LIZJ;
    public final C0SM6 LJII;
    public final IAnoleManager LJIIJ;
    public final AwemeRawAd LJIIJJI;
    public View LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public C1001520cAY LJIIZILJ;
    public InterfaceC1009510cNR LJIJI;
    public IAnoleMaskAbility LJIJJ;
    public InterfaceC1009570cNX LJIJJLI;
    public final C01GW LJIL;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(611));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(518));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(511));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1340));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(513));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(515));
    public long LJIILLIIL = 1;
    public final Set<String> LJIJ = new LinkedHashSet();

    @Override // X.InterfaceC1008930cMV
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJII(String str) {
    }

    @Override // X.InterfaceC1009610cNb
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIILLIIL(InterfaceC990760btC interfaceC990760btC) {
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIIZILJ(boolean z) {
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIJ(Aweme aweme, C19EG c19eg) {
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIJI(boolean z) {
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIJJ() {
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJ(AbstractC1000340c8e abstractC1000340c8e, View view) {
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIIJZLJL() {
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIJIIJI(JSONObject jSONObject) {
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIJIL(InterfaceC990750btB interfaceC990750btB) {
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIJL(int i) {
    }

    @Override // X.InterfaceC1007910cKr
    public final void LJJLIIJ() {
    }

    @Override // X.InterfaceC1007910cKr
    public final int LLJILLL() {
        return 0;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014390cVJ LLJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final void P() {
    }

    @Override // X.InterfaceC1007910cKr
    public final void U2() {
    }

    @Override // X.InterfaceC1007910cKr
    public final JSONObject V2() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final void f3(long j, String str, String str2, AwS81S0100100_16 awS81S0100100_16) {
    }

    @Override // X.InterfaceC1007910cKr
    public final void g3(int i) {
    }

    @Override // X.InterfaceC1007910cKr
    public final Integer i3() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final void o0() {
    }

    @Override // X.InterfaceC1007910cKr
    public final void pauseVideo() {
    }

    @Override // X.InterfaceC1007910cKr
    public final long r1() {
        return 0L;
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJFF() {
        IAnoleManager iAnoleManager = this.LJIIJ;
        if (iAnoleManager != null) {
            iAnoleManager.LJFF();
        }
        C1022620cia.LJ("OrganicFeedItemModuleImpl", "releasePanel");
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJI() {
        IAnoleManager iAnoleManager = this.LJIIJ;
        if (iAnoleManager != null) {
            iAnoleManager.clear();
        }
    }

    @Override // X.InterfaceC1009610cNb
    public final boolean LJIIJ() {
        return this.LJIILIIL || this.LJIILJJIL;
    }

    @Override // X.InterfaceC1008930cMV
    public final C1009490cNP LJIILJJIL() {
        return (C1009490cNP) this.LJIIIZ.getValue();
    }

    @Override // X.InterfaceC1008930cMV
    public final C1017200cZq LJIL() {
        return (C1017200cZq) this.LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIII() {
        ((Handler) this.LIZLLL.getValue()).removeCallbacksAndMessages(null);
        IAnoleManager iAnoleManager = this.LJIIJ;
        if (iAnoleManager != null) {
            iAnoleManager.LIZ();
        }
        IVideoPlayTaskManager iVideoPlayTaskManagerLJJIZ = LJJIZ();
        if (iVideoPlayTaskManagerLJJIZ != null) {
            iVideoPlayTaskManagerLJJIZ.reset();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewHolderUnSelected,aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJIILLIIL = 1L;
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIIJ() {
        IAnoleManager iAnoleManager = this.LJIIJ;
        if (iAnoleManager != null) {
            iAnoleManager.LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHostDestroy,aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIIZ() {
        ICommerceFeedSeriesService iCommerceFeedSeriesService;
        Aweme aweme = this.LIZ;
        if (!C1017070cZd.LLILLIZIL(aweme) || aweme == null || (iCommerceFeedSeriesService = (ICommerceFeedSeriesService) this.LJI.getValue()) == null) {
            return;
        }
        iCommerceFeedSeriesService.fA(this.LIZ);
    }

    @Override // X.InterfaceC1008930cMV
    public final InterfaceC736670Sv3 LJJIJLIJ() {
        return (InterfaceC736670Sv3) this.LJIL.getValue();
    }

    public final Activity LJJIL() {
        Activity activityLIZIZ;
        Activity activityLIZ = C1388190mED.LIZ(this.LIZJ);
        if (activityLIZ != null) {
            return activityLIZ;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (((abstractC1387200mCcLJ != null ? abstractC1387200mCcLJ.LIZ : null) instanceof C0J5E) && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            return C1388190mED.LIZ(activityLIZIZ);
        }
        return null;
    }

    public final IVideoPlayTaskManager LJJIZ() {
        return (IVideoPlayTaskManager) this.LJ.getValue();
    }

    public final void LJJJ() {
        IAnoleManager iAnoleManager = this.LJIIJ;
        if (iAnoleManager == null || !iAnoleManager.LJIILL()) {
            return;
        }
        EnumC1001380cAK enumC1001380cAK = EnumC1001380cAK.ANOLE_COMPONENT_OPERATION;
        C1001520cAY c1001520cAY = new C1001520cAY(enumC1001380cAK.getTaskIdWithType(this.LIZ.getAid()), EnumC599900Nfw.FEED);
        c1001520cAY.LIZJ = new AwS417S0200000_16(this, c1001520cAY, 114);
        c1001520cAY.LJ = EnumC1001450cAR.DIRECT_DISCARD;
        c1001520cAY.LIZLLL = enumC1001380cAK;
        c1001520cAY.LJI = C0NO3.MAIN;
        C1001410cAN.LIZIZ.LJI(c1001520cAY);
        this.LJIIZILJ = c1001520cAY;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014390cVJ Y2() {
        if (this.LJIIL != null) {
            return new C1014390cVJ(new C1009390cNF(r6.getWidth(), r6.getHeight()), new PointF(r6.getWidth() / 2, r6.getHeight() / 2));
        }
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final HashMap<String, Object> Z2() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("play_order", Long.valueOf(this.LJIILLIIL));
        return map;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1008080cL8 c3() {
        InterfaceC1000280c8Y interfaceC1000280c8Y;
        String strLIZ = C1014230cV3.LIZ("scene_anole_format");
        C1020420cf2 c1020420cf2 = new C1020420cf2();
        Bundle bundle = new Bundle();
        AwS595S0100000_16 awS595S0100000_16 = null;
        ICommercializeAdService iCommercializeAdService = (ICommercializeAdService) PluggableExtentionKt.pluggableSpi$default(ICommercializeAdService.class, false, false, false, 14, null);
        InterfaceC988500bpY interfaceC988500bpYQ = iCommercializeAdService != null ? iCommercializeAdService.Q(17) : null;
        if ((interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) && (interfaceC1000280c8Y = (InterfaceC1000280c8Y) interfaceC988500bpYQ) != null) {
            interfaceC1000280c8Y.LJIJJ(this.LIZJ, bundle, this.LIZ);
        }
        return new C1008080cL8(bundle, strLIZ, c1020420cf2, awS595S0100000_16, 24);
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean e3() {
        return this.LJIILIIL || this.LJIILJJIL;
    }

    @Override // X.InterfaceC1008930cMV
    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unbind,aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1008930cMV
    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[prerender] aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        sbLIZ.append(", ");
        C2188811AlT.LIZIZ(sbLIZ);
        IAnoleManager iAnoleManager = this.LJIIJ;
        if (iAnoleManager != null) {
            iAnoleManager.LIZLLL();
        }
        LJJJ();
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIFFI() {
        ICommerceFeedSeriesService iCommerceFeedSeriesService;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPagerResume,aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        Aweme aweme = this.LIZ;
        if (!C1017070cZd.LLILLIZIL(aweme) || aweme == null || (iCommerceFeedSeriesService = (ICommerceFeedSeriesService) this.LJI.getValue()) == null) {
            return;
        }
        iCommerceFeedSeriesService.fA(this.LIZ);
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIIZI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPagerPause,aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1007910cKr
    public final ViewGroup b3() {
        return C1009190cMv.LIZ(LJJIL());
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean d3() {
        String str;
        Activity activityLJJIL = LJJIL();
        C19EG c19eg = activityLJJIL instanceof C19EG ? (C19EG) activityLJJIL : null;
        if (c19eg == null) {
            return false;
        }
        String str2 = this.LIZIZ;
        if (Intrinsics.LJFF(str2, "homepage_hot")) {
            str = "For You";
        } else {
            if (!Intrinsics.LJFF(str2, "homepage_follow")) {
                return false;
            }
            str = "Following";
        }
        return Hox.LLJILJIL.LIZ(c19eg).KQ2(str) && c19eg.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED;
    }

    @Override // X.InterfaceC1008930cMV
    public final void onDestroyView() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroyView,aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1008930cMV
    public final void preload() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        AwemeRawAd awemeRawAd = this.LJIIJJI;
        Aweme aweme = this.LIZ;
        String aid = aweme != null ? aweme.getAid() : null;
        if (awemeRawAd == null || aid == null) {
            return;
        }
        C1009340cNA c1009340cNA = new C1009340cNA(aid, this.LIZ.getGroupId(), this.LIZ, awemeRawAd, null, null, null, 112);
        IAnoleService iAnoleService = (IAnoleService) this.LJFF.getValue();
        if (iAnoleService != null) {
            C1015470cX3.LIZ(iAnoleService, c1009340cNA);
        }
    }

    @Override // X.InterfaceC1008930cMV
    public final Aweme LJIIIIZZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1008930cMV
    public final InterfaceC1009510cNR LJIIIZ() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC1008930cMV
    public final C0SM6 LJJI() {
        return this.LJII;
    }

    @Override // X.InterfaceC1007910cKr
    public final long LJJLIL() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC1008930cMV
    public final IAnoleManager Ri() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJ(View view) {
        this.LJIIL = view;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind,aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIIJJI(IAnoleMaskAbility iAnoleMaskAbility) {
        this.LJIJJ = iAnoleMaskAbility;
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIIL(C1009150cMr c1009150cMr) {
        this.LJIJJLI = c1009150cMr;
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIILL(AbstractC1007980cKy abstractC1007980cKy) {
        if (abstractC1007980cKy instanceof C697010RVr) {
            this.LJIILIIL = ((C697010RVr) abstractC1007980cKy).LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CommentDialogStatus = ");
            sbLIZ.append(this.LJIILIIL);
            C2188811AlT.LIZIZ(sbLIZ);
        } else if (abstractC1007980cKy instanceof C988750bpx) {
            this.LJIILJJIL = ((C988750bpx) abstractC1007980cKy).LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ShareDialogStatus = ");
            sbLIZ2.append(this.LJIILJJIL);
            C2188811AlT.LIZIZ(sbLIZ2);
        } else if (!(abstractC1007980cKy instanceof C988760bpy) && (abstractC1007980cKy instanceof C692050RCp)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("HostVisibilityChanged = ");
            sbLIZ3.append(abstractC1007980cKy);
            sbLIZ3.append(".visibility");
            C2188811AlT.LIZIZ(sbLIZ3);
            if (((C692050RCp) abstractC1007980cKy).LIZ) {
                ((C584800Mwg) C1048110dNh.LIZLLL.LIZ()).LIZIZ = null;
            }
        }
        IAnoleManager iAnoleManager = this.LJIIJ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIZILJ(abstractC1007980cKy);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("handleEvent,AnoleFromBusinessEvent= ");
        sbLIZ4.append(abstractC1007980cKy.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ4);
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIJJLI(InterfaceC1009510cNR interfaceC1009510cNR) {
        this.LJIJI = interfaceC1009510cNR;
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJII(AbstractC997470c41 abstractC997470c41) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playStateChanged, playState = ");
        sbLIZ.append(abstractC997470c41);
        C2188811AlT.LIZIZ(sbLIZ);
        if (abstractC997470c41 instanceof C995850c1P) {
            IVideoPlayTaskManager iVideoPlayTaskManagerLJJIZ = LJJIZ();
            if (iVideoPlayTaskManagerLJJIZ != null) {
                iVideoPlayTaskManagerLJJIZ.LL();
            }
        } else if (abstractC997470c41 instanceof C997510c45) {
            IVideoPlayTaskManager iVideoPlayTaskManagerLJJIZ2 = LJJIZ();
            if (iVideoPlayTaskManagerLJJIZ2 != null) {
                iVideoPlayTaskManagerLJJIZ2.LLD();
            }
        } else if (abstractC997470c41 instanceof C997490c43) {
            IVideoPlayTaskManager iVideoPlayTaskManagerLJJIZ3 = LJJIZ();
            if (iVideoPlayTaskManagerLJJIZ3 != null) {
                iVideoPlayTaskManagerLJJIZ3.LLFF();
            }
        } else if (abstractC997470c41 instanceof C997480c42) {
            this.LJIILLIIL++;
            IVideoPlayTaskManager iVideoPlayTaskManagerLJJIZ4 = LJJIZ();
            if (iVideoPlayTaskManagerLJJIZ4 != null) {
                iVideoPlayTaskManagerLJJIZ4.LJJIJIIJIL();
            }
        }
        IAnoleManager iAnoleManager = this.LJIIJ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIZILJ(abstractC997470c41);
        }
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIJ(C0RA7 c0ra7) {
        IVideoPlayTaskManager iVideoPlayTaskManagerLJJIZ = LJJIZ();
        if (iVideoPlayTaskManagerLJJIZ != null) {
            iVideoPlayTaskManagerLJJIZ.LLFII(c0ra7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    @Override // X.InterfaceC1008930cMV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(int r7) {
        /*
            r6 = this;
            java.lang.Class<com.ss.android.ugc.aweme.specact.api.ISpecActService> r0 = com.ss.android.ugc.aweme.specact.api.ISpecActService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.specact.api.ISpecActService r0 = (com.ss.android.ugc.aweme.specact.api.ISpecActService) r0
            if (r0 == 0) goto L72
            boolean r1 = r0.LJJIJLIJ()
            r0 = 1
            if (r1 != r0) goto L72
        L17:
            r6.LJIILL = r0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "bind, specWidgetShow is "
            r1.append(r0)
            boolean r0 = r6.LJIILL
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "OrganicFeedItemModuleImpl"
            X.C1022620cia.LIZ(r0, r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onViewHolderSelected,aweme = "
            r1.append(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LIZ
            java.lang.String r0 = r0.getAid()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            com.ss.android.ugc.aweme.IAnoleManager r0 = r6.LJIIJ
            if (r0 == 0) goto L4c
            r0.LIZJ()
        L4c:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.LIZ
            boolean r0 = X.C1017070cZd.LLILLIZIL(r1)
            if (r0 == 0) goto L65
            if (r1 == 0) goto L65
            X.01GW r0 = r6.LJI
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.api.series.ICommerceFeedSeriesService r1 = (com.ss.android.ugc.aweme.api.series.ICommerceFeedSeriesService) r1
            if (r1 == 0) goto L65
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LIZ
            r1.fA(r0)
        L65:
            X.0dKo r2 = X.C1046320dKo.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.LIZ
            android.content.Context r0 = r6.LIZJ
            r2.getClass()
            X.C1046320dKo.LIZ(r0, r1)
            return
        L72:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1009450cNL.LJJIJIIJIL(int):void");
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014410cVL LLJJIJI(String str) {
        InterfaceC1009510cNR interfaceC1009510cNR = this.LJIJI;
        if (interfaceC1009510cNR != null) {
            return interfaceC1009510cNR.LLJJIJI(str);
        }
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1009390cNF W2(String str) {
        int iLJIILJJIL;
        if (Intrinsics.LJFF(str, EnumC696280RSw.ANOLE_BELOW_INTERACTIVE_SLOT.getSlotName())) {
            iLJIILJJIL = C418440Gaw.LJFF(C497820Jfg.LIZIZ(r1), this.LIZJ);
        } else if (Intrinsics.LJFF(str, EnumC696280RSw.FEED_ANOLE_ABOVE_INTERACTIVE_SLOT.getSlotName())) {
            iLJIILJJIL = C12ES.LJIIJ(this.LIZJ);
        } else {
            iLJIILJJIL = C12ES.LJIILJJIL((C12ES.LJIIJ(r2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), this.LIZJ);
        }
        return new C1009390cNF(iLJIILJJIL, -1.0d);
    }

    @Override // X.InterfaceC1007910cKr
    public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
        String renderStrategy;
        Integer numValueOf;
        C1001520cAY c1001520cAY;
        AnoleComponentModel anoleComponentModelAk;
        String str;
        AnoleComponentModel anoleComponentModelAk2;
        if (abstractC991850bux instanceof C989580brI) {
        }
        if (abstractC991850bux instanceof C991590buX) {
            C991590buX c991590buX = (C991590buX) abstractC991850bux;
            boolean z = true;
            if (c991590buX.LIZ != 1) {
                z = false;
            }
            String str2 = c991590buX.LIZIZ;
            Integer numValueOf2 = null;
            if (interfaceC1007930cKt != null && (anoleComponentModelAk2 = interfaceC1007930cKt.Ak()) != null) {
                renderStrategy = anoleComponentModelAk2.getRenderStrategy();
            } else {
                renderStrategy = null;
            }
            if (Intrinsics.LJFF(renderStrategy, "idle_prerender")) {
                if (z) {
                    if (interfaceC1007930cKt != null && (anoleComponentModelAk = interfaceC1007930cKt.Ak()) != null && (str = anoleComponentModelAk.type) != null) {
                        this.LJIJ.add(str);
                    }
                    Set<String> set = this.LJIJ;
                    if (set != null) {
                        numValueOf = Integer.valueOf(set.size());
                    } else {
                        numValueOf = null;
                    }
                    Set<AnoleComponentModel> setLIZ = C0PR2.LIZ(this.LIZ);
                    if (setLIZ != null) {
                        numValueOf2 = Integer.valueOf(setLIZ.size());
                    }
                    if (Intrinsics.LJFF(numValueOf, numValueOf2) && (c1001520cAY = this.LJIIZILJ) != null) {
                        c1001520cAY.LIZJ();
                    }
                } else if (!Intrinsics.LJFF(str2, "prerender_not_invoke") && !Intrinsics.LJFF(str2, "prerender_time_limit_exceeded")) {
                    LJJJ();
                } else {
                    C1001520cAY c1001520cAY2 = this.LJIIZILJ;
                    if (c1001520cAY2 != null) {
                        c1001520cAY2.LJFF = EnumC1001490cAV.CANCELLED;
                    }
                }
            }
        }
        InterfaceC1009510cNR interfaceC1009510cNR = this.LJIJI;
        if (interfaceC1009510cNR != null) {
            interfaceC1009510cNR.zk(abstractC991850bux, interfaceC1007930cKt);
        }
        InterfaceC1009570cNX interfaceC1009570cNX = this.LJIJJLI;
        if (interfaceC1009570cNX != null) {
            interfaceC1009570cNX.LIZIZ(abstractC991850bux, interfaceC1007930cKt);
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final void LLJJIII(String str, View.OnLayoutChangeListener onLayoutChangeListener) {
        InterfaceC1009510cNR interfaceC1009510cNR = this.LJIJI;
        if (interfaceC1009510cNR != null) {
            interfaceC1009510cNR.LLJJIII(str, onLayoutChangeListener);
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final void X2(String str, ViewOnLayoutChangeListenerC1014330cVD viewOnLayoutChangeListenerC1014330cVD) {
        InterfaceC1009510cNR interfaceC1009510cNR = this.LJIJI;
        if (interfaceC1009510cNR != null) {
            interfaceC1009510cNR.xk(str, viewOnLayoutChangeListenerC1014330cVD);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1009450cNL(android.content.Context r14, com.ss.android.ugc.aweme.feed.model.Aweme r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1009450cNL.<init>(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean a3(String str, Runnable runnable, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerPlayProgressObserver,token = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (((Boolean) C275530Ar1.LIZ.getValue()).booleanValue() && a0.LJJIIZI(str, EnumC1008920cMU.ONESTOP_NATIVE_CTABUTTON.getType(), false)) {
            return C786410Ut5.LJLIIL(i, (Handler) this.LIZLLL.getValue(), runnable);
        }
        Video video = this.LIZ.getVideo();
        if (video == null) {
            return false;
        }
        int duration = video.getDuration();
        IVideoPlayTaskManager iVideoPlayTaskManagerLJJIZ = LJJIZ();
        if (iVideoPlayTaskManagerLJJIZ != null) {
            C988300bpE c988300bpE = new C988300bpE(str);
            c988300bpE.LIZIZ(duration);
            c988300bpE.LIZJ = i;
            c988300bpE.LIZLLL = runnable;
            c988300bpE.LJ = true;
            iVideoPlayTaskManagerLJJIZ.LLIFFJFJJ(c988300bpE.LIZ());
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean h3(String str, InterfaceC1007930cKt interfaceC1007930cKt, AnoleComponentAppearModel anoleComponentAppearModel) {
        String type = interfaceC1007930cKt.getType();
        if (!Intrinsics.LJFF(type, EnumC1008920cMU.LYNX_END_LAYER.getType()) && !Intrinsics.LJFF(type, EnumC1008920cMU.NATIVE_END_LAYER.getType())) {
            if (Intrinsics.LJFF(type, EnumC1008920cMU.QXPX_STICKER.getType())) {
                if (this.LJIILL || LJIIJ()) {
                    return false;
                }
                return true;
            }
            if (LJIIJ()) {
                return false;
            }
            return true;
        }
        IAnoleMaskAbility iAnoleMaskAbility = this.LJIJJ;
        if (iAnoleMaskAbility == null) {
            return false;
        }
        return iAnoleMaskAbility.Vg();
    }
}
