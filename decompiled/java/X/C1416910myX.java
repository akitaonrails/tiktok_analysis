package X;

import Y.ARunnableS122S0100000_22;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AFwS306S0000000_22;
import kotlin.jvm.internal.AFwS343S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0myX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416910myX extends AbstractRunnableC21377818lM implements InterfaceC1408530ml1, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1DRG LLILZLL;
    public final C1664750tQH LLIZ;
    public final LiveData<InterfaceC1452170ntP> LLIZLLLIL;
    public final C1664740tQG LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1416910myX.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1416910myX.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1416910myX.class, "scheduleTaskDelegateLogicApi", "getScheduleTaskDelegateLogicApi()Lcom/ss/android/ugc/gamora/editor/mixediting/ScheduleTaskDelegateLogicApi;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        C2268608ui c2268608uiLJ;
        C112C.LIZ.getClass();
        C112C.LJIIL = null;
        boolean z = true;
        C112C.LIZIZ = true;
        C1403010mc7.LIZ.getMusicService().al();
        C2275708vr.LJI(C1428470nHB.LJIILL(LJIIIZ()), C1428470nHB.LJIILIIL(LJIIIZ()), LJIIIZ().getCreationId());
        C1481605r4.LIZIZ(new ARunnableS122S0100000_22(this, 76));
        C2269208uo.LIZ.getClass();
        if (C2269208uo.LIZIZ.length() == 0) {
            C1414930mvL c1414930mvL = C1414930mvL.LIZ;
            VideoPublishEditModel videoPublishEditModelLJIIIZ = LJIIIZ();
            c1414930mvL.getClass();
            if (C1414930mvL.LJII(videoPublishEditModelLJIIIZ, false) && !LJIIIZ().creativeModel.mixEditingModel.hasModifiedMediaListInEP && (c2268608uiLJ = C2270208uy.LJ(LJIIIZ(), "list")) != null && !c2268608uiLJ.LIZIZ && ((Boolean) C283090B7r.LIZ.getValue()).booleanValue()) {
                String str = c2268608uiLJ.LIZ;
                String str2 = c2268608uiLJ.LJIIJ;
                if (C123100dR.LIZ(str) && !Intrinsics.LJFF(str, "empty") && C123100dR.LIZ(str2)) {
                    C2269208uo.LIZIZ = str;
                    InterfaceC1203040hPa interfaceC1203040hPa = (InterfaceC1203040hPa) this.LLJ.getValue(this, LLJI[2]);
                    if (interfaceC1203040hPa != null) {
                        interfaceC1203040hPa.fC0(str, str2);
                    }
                }
            }
        }
        if (C255690A0h.LIZ()) {
            C1457430o1t c1457430o1t = C1457430o1t.LIZ;
            VideoPublishEditModel videoPublishEditModelLJIIIZ2 = LJIIIZ();
            C2256608sm c2256608sm = new C2256608sm(0);
            c1457430o1t.getClass();
            AbstractC1457480o1y abstractC1457480o1yLIZJ = C1457430o1t.LIZJ(videoPublishEditModelLJIIIZ2, 0, c2256608sm);
            if (abstractC1457480o1yLIZJ != null) {
                AbstractC1921407fo abstractC1921407foLIZIZ = C1457430o1t.LIZIZ(abstractC1457480o1yLIZJ);
                InterfaceC1416920myY interfaceC1416920myYLJJIIJ = C0CHQ.LIZ().LJJIIJ();
                if (C1428500nHE.LIZ()) {
                    EnumC2288308xt enumC2288308xt = EnumC2288308xt.RECOMMEND_EFFECT;
                    C2267408uW c2267408uW = new C2267408uW(new Pair(256, 256));
                    C2267208uU c2267208uU = new C2267208uU(AFwS343S0000000_22.get$arr$(3));
                    C2288508xv c2288508xv = new C2288508xv(AFwS306S0000000_22.get$arr$(12));
                    C573430MeL c573430MeL = C573430MeL.LIZ;
                    VideoPublishEditModel videoPublishEditModelLJIIIZ3 = LJIIIZ();
                    Boolean bool = Boolean.FALSE;
                    c573430MeL.getClass();
                    interfaceC1416920myYLJJIIJ.LIZLLL(enumC2288308xt, abstractC1921407foLIZIZ, c2267408uW, c2267208uU, c2288508xv, C573430MeL.LIZ(videoPublishEditModelLJIIIZ3, bool));
                }
            }
        }
        C1457430o1t c1457430o1t2 = C1457430o1t.LIZ;
        VideoPublishEditModel videoPublishEditModelLJIIIZ4 = LJIIIZ();
        c1457430o1t2.getClass();
        if (!C1457430o1t.LIZ(videoPublishEditModelLJIIIZ4)) {
            C1429400nIg c1429400nIg = C1429400nIg.LIZ;
            VideoPublishEditModel videoPublishEditModelLJIIIZ5 = LJIIIZ();
            c1429400nIg.getClass();
            if (!C1429400nIg.LIZ(videoPublishEditModelLJIIIZ5) && !C565160MEo.LIZIZ(LJIIIZ())) {
                z = false;
            }
        }
        if (C2275708vr.LJ() == null && z) {
            c1457430o1t2.LJ(LJIIIZ());
        }
    }

    public final VideoPublishEditModel LJIIIZ() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJI[0]);
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P0;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZLL;
    }

    public C1416910myX(C1DRG c1drg) {
        this.LLILZLL = c1drg;
        this.LLIZ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLIZLLLIL = ((InterfaceC1455860nzM) C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null).getValue(this, LLJI[1])).g();
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1203040hPa.class, null);
        LJ(AFwS239S0000000_8.get$arr$(208));
    }
}
