package X;

import Y.AObjectS245S0100000_22;
import Y.AObserverS104S0101000_22;
import Y.AObserverS220S0100000_16;
import Y.AObserverS225S0100000_22;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS108S0110000_22;
import kotlin.jvm.internal.AwS139S0110000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS601S0100000_22;
import nv7.c0;

/* JADX INFO: renamed from: X.0o5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459960o5y extends C19A3 implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final C1DRG LLJILLL;
    public boolean LLJJ;
    public C1658060tFU LLJJI;
    public final C1664740tQG LLJJIII;
    public final C1664750tQH LLJJIJI;
    public final C1664750tQH LLJJIJIIJIL;
    public final C1664750tQH LLJJIJIL;
    public final C1466810oH1 LLJJJ = new C1466810oH1(this, 10);
    public final C01GW LLJJJIL = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public final C1664750tQH LLJJJJ;
    public final C1664740tQG LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    public final void LLLLL() {
        Boolean value;
        Boolean value2;
        Boolean value3;
        AudioEnhanceParam audioEnhanceParam;
        List list;
        Boolean bool;
        C19EG c19eg;
        Boolean value4;
        Boolean value5;
        Boolean value6;
        this.LLJJJJLIIL = true;
        if (this.LLJJ) {
            C1657940tFI c1657940tFILLLLJ = LLLLJ();
            List<C1460620o72> listLLLLIIIILLL = LLLLIIIILLL(((InterfaceC1460110o6D) this.LLJJL.getValue()).LIZ());
            ArrayList<C1460620o72> arrayList = new ArrayList();
            for (C1460620o72 c1460620o72 : listLLLLIIIILLL) {
                if (c1460620o72.LIZ != 24) {
                    arrayList.add(c1460620o72);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (C1460620o72 c1460620o722 : arrayList) {
                C1460610o71 c1460610o71 = C1460610o71.LIZ;
                VideoPublishEditModel videoPublishEditModelLLLLILI = LLLLILI();
                LiveData<Boolean> liveDataHB = LLLLIL().hB(c1460620o722.LIZ);
                boolean zBooleanValue = (liveDataHB == null || (value6 = liveDataHB.getValue()) == null) ? true : value6.booleanValue();
                LiveData<Boolean> liveDataLQ1 = LLLLIL().lQ1(c1460620o722.LIZ);
                boolean zBooleanValue2 = (liveDataLQ1 == null || (value5 = liveDataLQ1.getValue()) == null) ? true : value5.booleanValue();
                LiveData<Boolean> liveDataDD2 = LLLLIL().dD2(c1460620o722.LIZ);
                C1460140o6G c1460140o6G = new C1460140o6G(zBooleanValue, (liveDataDD2 == null || (value4 = liveDataDD2.getValue()) == null) ? c1460620o722.LJI : value4.booleanValue(), zBooleanValue2);
                c1460610o71.getClass();
                arrayList2.add(C1460610o71.LIZ(c1460620o722, videoPublishEditModelLLLLILI, true, c1460140o6G));
            }
            c1657940tFILLLLJ.LIZJ(arrayList2, false, null);
        } else {
            this.LLJJ = true;
            C1658060tFU c1658060tFU = this.LLJJI;
            if (c1658060tFU != null) {
                C1658060tFU.LIZLLL(c1658060tFU, LLLLJ());
            }
            C1657940tFI c1657940tFILLLLJ2 = LLLLJ();
            List<C1460620o72> listLLLLIIIILLL2 = LLLLIIIILLL(((InterfaceC1460110o6D) this.LLJJL.getValue()).LIZ());
            ArrayList<C1460620o72> arrayList3 = new ArrayList();
            for (C1460620o72 c1460620o723 : listLLLLIIIILLL2) {
                if (c1460620o723.LIZ != 24) {
                    arrayList3.add(c1460620o723);
                }
            }
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            for (C1460620o72 c1460620o724 : arrayList3) {
                C1460610o71 c1460610o712 = C1460610o71.LIZ;
                VideoPublishEditModel videoPublishEditModelLLLLILI2 = LLLLILI();
                LiveData<Boolean> liveDataHB2 = LLLLIL().hB(c1460620o724.LIZ);
                boolean zBooleanValue3 = (liveDataHB2 == null || (value3 = liveDataHB2.getValue()) == null) ? true : value3.booleanValue();
                LiveData<Boolean> liveDataLQ12 = LLLLIL().lQ1(c1460620o724.LIZ);
                boolean zBooleanValue4 = (liveDataLQ12 == null || (value2 = liveDataLQ12.getValue()) == null) ? true : value2.booleanValue();
                LiveData<Boolean> liveDataDD22 = LLLLIL().dD2(c1460620o724.LIZ);
                C1460140o6G c1460140o6G2 = new C1460140o6G(zBooleanValue3, (liveDataDD22 == null || (value = liveDataDD22.getValue()) == null) ? c1460620o724.LJI : value.booleanValue(), zBooleanValue4);
                c1460610o712.getClass();
                arrayList4.add(C1460610o71.LIZ(c1460620o724, videoPublishEditModelLLLLILI2, true, c1460140o6G2));
            }
            c1657940tFILLLLJ2.LIZJ(arrayList4, false, null);
        }
        if (LLLLILI().isAutoEnhanceEnable()) {
            C363500EMy.LIZ.getClass();
            if (C363500EMy.LJIIIIZZ == null) {
                Activity activity = this.mActivity;
                if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
                    C363500EMy.LJIIIIZZ = new C1459930o5v(c19eg, LLLLILI(), new AwS566S0100000_22(this, 776));
                    String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
                    C1459930o5v c1459930o5v = C363500EMy.LJIIIIZZ;
                    if (c1459930o5v != null) {
                        c1459930o5v.LJ = Boolean.valueOf(!C363750ENx.LIZLLL(currentUserID));
                    }
                }
            }
            C1459930o5v c1459930o5v2 = C363500EMy.LJIIIIZZ;
            boolean zBooleanValue5 = (c1459930o5v2 == null || (bool = c1459930o5v2.LJ) == null) ? false : bool.booleanValue();
            C1459930o5v c1459930o5v3 = C363500EMy.LJIIIIZZ;
            if (c1459930o5v3 != null) {
                c1459930o5v3.LIZIZ(new AwS108S0110000_22(this, zBooleanValue5, 11));
            }
        }
        InterfaceC1452170ntP value7 = LLLLIILL().g().getValue();
        if (LLLLILI().isStickPointMode()) {
            LLLLIL().Uh1(8, false);
            LLLLIL().Uh1(7, false);
            LLLLIL().ut0(7, false);
        }
        C1664740tQG c1664740tQG = this.LLJJJJJIL;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLJLIL;
        InterfaceC1418580n1E interfaceC1418580n1E = (InterfaceC1418580n1E) c1664740tQG.getValue(this, interfaceC2217461BqaArr[7]);
        if (interfaceC1418580n1E == null || !interfaceC1418580n1E.FR0()) {
            LLLLIL().Uh1(7, false);
            LLLLIL().ut0(7, false);
        }
        if (C1428520nHG.LJIIIIZZ(LLLLILI())) {
            if (C1428520nHG.LJJJJL(LLLLILI())) {
                LLLLIL().ut0(6, true);
            } else {
                LLLLIL().ut0(6, false);
            }
        }
        if (C1428520nHG.LJIIJJI(LLLLILI()) && LLLLILI().getOrigin() == 2) {
            LLLLIL().ut0(6, true);
        }
        if (C1416310mxZ.LJJJLZIJ(LLLLILI(), C1428550nHJ.LIZ())) {
            LLLLIL().ut0(25, false);
        } else {
            LLLLIL().ut0(25, true);
        }
        if ((u4.LJJIJ(LLLLILI()) || C1414450muZ.LJIIIIZZ(value7, LLLLILI())) && !C1418530n19.LIZIZ(LLLLILI())) {
            LLLLIL().Uh1(11, false);
            LLLLIL().rm(11, true);
        } else {
            CanvasVideoData canvasVideoData = LLLLILI().getCanvasVideoData();
            if (canvasVideoData != null && C1444940nhk.LJFF(canvasVideoData)) {
                LLLLIL().Uh1(11, false);
                LLLLIL().rm(11, false);
            } else if ((u4.LJJIIJ(LLLLILI()) && LLLLILI().getVoiceVolume() > 0.0f) || LLLLILI().hasRecord() || C366800EZq.LIZ(LLLLILI(), null)) {
                LLLLIL().Uh1(11, true);
                LLLLIL().rm(11, true);
            } else if (!u4.LJLJLJ(LLLLILI()) || LLLLILI().creativeModel.inlineCaptionModel == null) {
                LLLLIL().Uh1(11, false);
                if (C1428470nHB.LJZL(LLLLILI())) {
                    LLLLIL().rm(11, false);
                }
            } else {
                LLLLIL().Uh1(11, true);
                LLLLIL().rm(11, true);
            }
        }
        if (LLLLILI().isCurrentAutoCutMode()) {
            LLLLIL().ut0(26, false);
            LLLLIL().Ux(26, false);
        } else {
            LLLLIL().ut0(26, true);
        }
        boolean z = (LLLLILI().isDuet() || LLLLILI().getMMusicPath() == null || LLLLILI().isStickPointMode()) ? false : true;
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(LLLLILI().creativeModel.musicBuzModel);
        if (LLLLILI().isMvThemeVideoType() && aVMusicExtractAVMusic != null) {
            MvCreateVideoData mvCreateVideoData = LLLLILI().getMvCreateVideoData();
            if (!C580130Mp9.LIZ(mvCreateVideoData != null ? mvCreateVideoData.musicIds : null)) {
                MvCreateVideoData mvCreateVideoData2 = LLLLILI().getMvCreateVideoData();
                if (mvCreateVideoData2 == null || (list = mvCreateVideoData2.musicIds) == null) {
                    list = C13BV.INSTANCE;
                }
                if (list.contains(aVMusicExtractAVMusic.getMusicId())) {
                    z = false;
                }
            }
        }
        if (C0MT6.LIZ()) {
            InterfaceC1453200nv4 interfaceC1453200nv4 = (InterfaceC1453200nv4) this.LLJJJ.getValue(this, interfaceC2217461BqaArr[4]);
            if (interfaceC1453200nv4 != null) {
                interfaceC1453200nv4.eg(z);
            }
        } else {
            LLLLIL().ut0(8, z);
            LLLLIILL().g().observe(C372650EjH.LIZIZ(this), new AObserverS225S0100000_22(this, 131));
        }
        if (C1428470nHB.LJJZZI(LLLLILI()) || C1428470nHB.LJZL(LLLLILI())) {
            LLLLIL().ut0(8, false);
            LLLLIL().Uh1(8, false);
        }
        if (C1446580nkO.LIZ() && (audioEnhanceParam = LLLLILI().getAudioEnhanceParam()) != null && C1439120nYM.LIZ(audioEnhanceParam, LLLLILI())) {
            LLLLIL().rm(14, true);
            InterfaceC1460000o62 interfaceC1460000o62LLLLIL = LLLLIL();
            AudioEnhanceParam audioEnhanceParam2 = LLLLILI().getAudioEnhanceParam();
            interfaceC1460000o62LLLLIL.Ux(14, audioEnhanceParam2 != null ? C349220Dma.LIZ(audioEnhanceParam2) : false);
        } else {
            LLLLIL().rm(14, false);
        }
        Boolean bool2 = Boolean.FALSE;
        LiveData<Boolean> liveDataLQ13 = LLLLIL().lQ1(20);
        if (bool2.equals(liveDataLQ13 != null ? liveDataLQ13.getValue() : null)) {
            LLLLIL().ut0(20, false);
        } else {
            LLLLIL().ut0(20, true);
        }
        if ((u4.LJJIJ(LLLLILI()) || C1414450muZ.LJIIIIZZ(value7, LLLLILI())) && !C1418530n19.LIZIZ(LLLLILI())) {
            LLLLIL().ut0(20, false);
        }
        C1414930mvL c1414930mvL = C1414930mvL.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLLILI3 = LLLLILI();
        c1414930mvL.getClass();
        if (C1414930mvL.LJIIJ(videoPublishEditModelLLLLILI3) || C1417220mz2.LIZ(LLLLILI())) {
            boolean zIsCurrentAutoCutMode = LLLLILI().isCurrentAutoCutMode();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PhotoEditToolbarScene -> useTemplate = ");
            sbLIZ.append(zIsCurrentAutoCutMode);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            LLLLIL().Uh1(15, !zIsCurrentAutoCutMode);
            if (C1414930mvL.LJIIJ(LLLLILI())) {
                LLLLIL().Ux(21, zIsCurrentAutoCutMode);
            }
        }
        if (C1428520nHG.LJIIJJI(LLLLILI())) {
            C1459710o5Z.LIZLLL(C1459710o5Z.LJI, "voice");
        } else {
            C1459710o5Z.LIZLLL(-1, "voice");
        }
        if (C1444940nhk.LJII(LLLLILI().getCanvasVideoData()) && !C1444940nhk.LJIIJ(LLLLILI().getCanvasVideoData()) && !C1428470nHB.LJJJJZI(LLLLILI()) && LLLLILI().creativeModel.aiCreateModel == null) {
            C1459710o5Z.LIZLLL(C1459710o5Z.LJII, "canvas_gesture");
        }
        if (C1428470nHB.LJJJLZIJ(LLLLILI()) && u4.LJJJJZI(LLLLILI())) {
            C1459710o5Z.LIZLLL(C1459710o5Z.LJIIIIZZ, "cut_optimized");
        }
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1459960o5y.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1459960o5y.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1459960o5y.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1459960o5y.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1459960o5y.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1459960o5y.class, "editTitleBarApi", "getEditTitleBarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1459960o5y.class, "mixEditingMaterialApi", "getMixEditingMaterialApi()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingAssetsApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1459960o5y.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
    }

    public final InterfaceC1455860nzM LLLLIILL() {
        return (InterfaceC1455860nzM) this.LLJJJIL.getValue();
    }

    public final InterfaceC1460000o62 LLLLIL() {
        return (InterfaceC1460000o62) this.LLJJIJIIJIL.getValue(this, LLJLIL[2]);
    }

    public final VideoPublishEditModel LLLLILI() {
        return (VideoPublishEditModel) this.LLJJIJIL.getValue(this, LLJLIL[3]);
    }

    public final C1657940tFI LLLLJ() {
        return (C1657940tFI) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final int LLLLJI() {
        c0.LIZ.getClass();
        C1660590tJZ c1660590tJZ = c0.LJFF;
        Context contextRequireSceneContext = requireSceneContext();
        if (C1462920oAk.LIZLLL() && c1660590tJZ != null && getSceneContext() != null) {
            return c1660590tJZ.LJ(contextRequireSceneContext).topMargin + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + (c1660590tJZ.LJI() ? ScreenUtils.getStatusBarHeight(contextRequireSceneContext) : 0);
        }
        int i = C1428160nGg.LIZ;
        return C1428160nGg.LIZ + ScreenUtils.getStatusBarHeight(contextRequireSceneContext);
    }

    public final boolean LLLLLIL() {
        if (!C1428470nHB.LLIIIILZ(LLLLILI())) {
            return false;
        }
        if (LLLLILI().creativeModel.imageEditModel.enterFromImagePublishPreview) {
            return true;
        }
        return LLLLILI().isFromRestoreRecover() && this.LLJILLL.LJIIL(null, InterfaceC572210McN.class) == null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        Animator animator;
        super.onDestroyView();
        C0CHQ.LIZ().getPublishService().LJIIIZ(getLifecycle());
        C1658060tFU c1658060tFU = this.LLJJI;
        if (c1658060tFU == null || (animator = c1658060tFU.LLILZLL) == null) {
            return;
        }
        animator.cancel();
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        Boolean value;
        Boolean value2;
        Boolean value3;
        super.onResume();
        if (this.LLJJ && LLLLLIL()) {
            List<C1460620o72> listLLLLIIIILLL = LLLLIIIILLL(new C1459690o5X(this, this.LLJILLL, new AwS566S0100000_22(this, 770)).LIZ());
            ArrayList<C1460620o72> arrayList = new ArrayList();
            for (C1460620o72 c1460620o72 : listLLLLIIIILLL) {
                if (c1460620o72.LIZ != 24) {
                    arrayList.add(c1460620o72);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (C1460620o72 c1460620o722 : arrayList) {
                C1460610o71 c1460610o71 = C1460610o71.LIZ;
                VideoPublishEditModel videoPublishEditModelLLLLILI = LLLLILI();
                LiveData<Boolean> liveDataHB = LLLLIL().hB(c1460620o722.LIZ);
                boolean zBooleanValue = (liveDataHB == null || (value3 = liveDataHB.getValue()) == null) ? true : value3.booleanValue();
                LiveData<Boolean> liveDataLQ1 = LLLLIL().lQ1(c1460620o722.LIZ);
                boolean zBooleanValue2 = (liveDataLQ1 == null || (value2 = liveDataLQ1.getValue()) == null) ? true : value2.booleanValue();
                LiveData<Boolean> liveDataDD2 = LLLLIL().dD2(c1460620o722.LIZ);
                C1460140o6G c1460140o6G = new C1460140o6G(zBooleanValue, (liveDataDD2 == null || (value = liveDataDD2.getValue()) == null) ? c1460620o722.LJI : value.booleanValue(), zBooleanValue2);
                c1460610o71.getClass();
                arrayList2.add(C1460610o71.LIZ(c1460620o722, videoPublishEditModelLLLLILI, true, c1460140o6G));
            }
            LLLLJ().LIZJ(arrayList2, false, null);
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public C1459960o5y(C1DRG c1drg) {
        this.LLJILLL = c1drg;
        this.LLJJIII = C1664770tQJ.LIZIZ(c1drg, InterfaceC377540ErA.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(c1drg, InterfaceC1461390o8H.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(c1drg, InterfaceC1457600o2A.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1414530muh.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1418580n1E.class, null);
        this.LLJJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 750));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 749));
        this.LLJL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(262));
    }

    public final List<C1460620o72> LLLLIIIILLL(List<C1460620o72> list) {
        int size;
        ArrayList arrayList;
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = LLLLILI().getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        if (C1428470nHB.LJJLIL(LLLLILI())) {
            if (size > 1) {
                arrayList = new ArrayList();
                for (C1460620o72 c1460620o72 : list) {
                    if (c1460620o72.LIZ != 21) {
                        arrayList.add(c1460620o72);
                    }
                }
            } else {
                arrayList = new ArrayList();
                for (C1460620o72 c1460620o722 : list) {
                    if (!C1697810uHb.LJIIJJI(8213, 8207, 8194, 8212).contains(Integer.valueOf(c1460620o722.LIZ))) {
                        arrayList.add(c1460620o722);
                    }
                }
            }
            return arrayList;
        }
        return list;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        LiveEvent<AVMusic> liveEventB7;
        super.onActivityCreated(bundle);
        C1658060tFU c1658060tFU = this.LLJJI;
        if (c1658060tFU != null) {
            Object obj = new Object() { // from class: X.0o6N
            };
            if (!c1658060tFU.LLJJIJI.contains(obj)) {
                c1658060tFU.LLJJIJI.add(obj);
            }
        }
        C1664750tQH c1664750tQH = this.LLJJIJI;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLJLIL;
        ((InterfaceC1461390o8H) c1664750tQH.getValue(this, interfaceC2217461BqaArr[1])).LIZIZ(new GestureInteractItem(0, new C0FUM() { // from class: X.0o68
            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    return true;
                }
                return this instanceof C1417630mzh;
            }
        }));
        LLLLIL().x8().observe(C372650EjH.LIZIZ(this), new AObjectS245S0100000_22(this, 241));
        LLLLIL().yB2().observe(this, new AObserverS220S0100000_16(this, 15));
        LLLLIL().QM1().observe(this, new AObserverS220S0100000_16(this, 16));
        LLLLIL().ug0().observe(this, new AObserverS220S0100000_16(this, 10));
        ((InterfaceC1457610o2B) this.LLJJJJ.getValue(this, interfaceC2217461BqaArr[5])).In0(this, new AwS595S0100000_16(this, 154));
        LLLLIL().ci1(this, new AwS601S0100000_22(this, 545));
        LLLLIILL().ww2().observe(this, new AObserverS225S0100000_22(this, 122));
        LLLLIL().L31(this, new AwS601S0100000_22(this, 551));
        LLLLIL().gr1(this, new AwS601S0100000_22(this, 560));
        LLLLIL().gK0(this, new AwS601S0100000_22(this, 585));
        LLLLIL().zD2(this, new AwS601S0100000_22(this, 590));
        LLLLIL().tA(this, new AwS601S0100000_22(this, 591));
        InterfaceC1453200nv4 interfaceC1453200nv4 = (InterfaceC1453200nv4) this.LLJJJ.getValue(this, interfaceC2217461BqaArr[4]);
        if (interfaceC1453200nv4 != null && (liveEventB7 = interfaceC1453200nv4.b7()) != null) {
            liveEventB7.LIZ(this, new AObjectS245S0100000_22(this, 240));
        }
        InterfaceC1452170ntP value = LLLLIILL().g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
            C1450840nrG.LIZ(nLEEditor, "PhotoEditToolbarScene#initObserver", this, new C354000DuI() { // from class: X.0o5r
                @Override // X.C354000DuI
                public final void LIZ() {
                    InterfaceC1455860nzM interfaceC1455860nzMLLLLIILL = this.LIZ.LLLLIILL();
                    InterfaceC1446740nke interfaceC1446740nke = interfaceC1455860nzMLLLLIILL instanceof InterfaceC1446740nke ? (InterfaceC1446740nke) interfaceC1455860nzMLLLLIILL : null;
                    boolean z = false;
                    if (interfaceC1446740nke != null && interfaceC1446740nke.eS0()) {
                        z = true;
                    }
                    C1524705y1.LIZJ(new AwS139S0110000_22(this.LIZ, z, 9));
                }
            });
        }
        Iterator<Integer> it2 = C1460620o72.LJIILJJIL.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            LiveData<Boolean> liveDataV01 = LLLLIL().v01(iIntValue);
            if (liveDataV01 != null) {
                liveDataV01.observe(this, new AObserverS104S0101000_22(this, iIntValue, 0));
            }
            LiveData<ImageUrlModel> liveDataCs0 = LLLLIL().cs0(iIntValue);
            if (liveDataCs0 != null) {
                liveDataCs0.observe(this, new AObserverS104S0101000_22(this, iIntValue, 1));
            }
            LiveData<Boolean> liveDataLQ1 = LLLLIL().lQ1(iIntValue);
            if (liveDataLQ1 != null) {
                liveDataLQ1.observe(this, new AObserverS104S0101000_22(this, iIntValue, 2));
            }
            LiveData<Boolean> liveDataHB = LLLLIL().hB(iIntValue);
            if (liveDataHB != null) {
                liveDataHB.observe(this, new AObserverS104S0101000_22(this, iIntValue, 4));
            }
            LiveData<Boolean> liveDataDD2 = LLLLIL().dD2(iIntValue);
            if (liveDataDD2 != null) {
                liveDataDD2.observe(this, new AObserverS104S0101000_22(this, iIntValue, 6));
            }
        }
        ((IVideoLengthChecker) ServiceManager.get().getService(IVideoLengthChecker.class)).LIZLLL(this, LLLLILI(), LLLLIILL());
        LLLLIL().WM1(this, new AwS601S0100000_22(this, 596));
        if (!(!C1411560mpu.LIZIZ) || C1428470nHB.LJJZZI(LLLLILI()) || LLLLILI().creativeModel.editModel.isFromEditAutoCut || LLLLILI().isPhotoSwap()) {
            LLLLL();
        }
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1658060tFU c1658060tFU = new C1658060tFU(requireSceneContext());
        c1658060tFU.setId(R.id.qe0);
        this.LLJJI = c1658060tFU;
        c1658060tFU.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150)));
        C426750GoL.LJIIL(c1658060tFU, null, Integer.valueOf(LLLLJI()), null, Integer.valueOf(C1428150nGf.LIZIZ() + C1428150nGf.LIZLLL), 21);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 8388613;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1658060tFU);
        c1658060tFU.setLayoutParams(layoutParams);
        return c1658060tFU;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
