package X;

import Y.AObjectS243S0100000_14;
import Y.AObserverS218S0100000_14;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS91S0200000_22;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import iyl.i3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS108S0110000_22;
import kotlin.jvm.internal.AwS15S0002000_22;
import kotlin.jvm.internal.AwS163S1100000_14;
import kotlin.jvm.internal.AwS35S0001000_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import nv7.c0;
import oyl.d0;

/* JADX INFO: renamed from: X.0o5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459970o5z extends C19A3 implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final C862640Xsk LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C1DRG LLJILLL;
    public boolean LLJJ;
    public d0 LLJJI;
    public final C1664740tQG LLJJIII;
    public final C1664750tQH LLJJIJI;
    public final C1664750tQH LLJJIJIIJIL;
    public final C1664750tQH LLJJIJIL;
    public final C01GW LLJJJ = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public InterfaceC1414530muh LLJJJIL;
    public final C1664740tQG LLJJJJ;
    public final C1664740tQG LLJJJJJIL;
    public final C1664740tQG LLJJJJLIIL;
    public final C1664740tQG LLJJL;
    public final Set<String> LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public CountDownTimerC1466530oGZ LLJLLIL;

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1459970o5z.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1459970o5z.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0), new C2217381BqS(C1459970o5z.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(C1459970o5z.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C1459970o5z.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0), new C2217381BqS(C1459970o5z.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0), new C2217381BqS(C1459970o5z.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new C2217381BqS(C1459970o5z.class, "imageEditPreviewApi", "getImageEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0), new C2217381BqS(C1459970o5z.class, "aiLivePhotoApi", "getAiLivePhotoApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePhotoApi;", 0), new C2217381BqS(C1459970o5z.class, "templateAutoCutAIApi", "getTemplateAutoCutAIApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/TemplateAutoCutAIApi;", 0), new C2217381BqS(C1459970o5z.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0)};
        LLJLLL = new C862640Xsk();
    }

    public final InterfaceC1455860nzM LLLLIL() {
        return (InterfaceC1455860nzM) this.LLJJJ.getValue();
    }

    public final InterfaceC1460000o62 LLLLILI() {
        return (InterfaceC1460000o62) this.LLJJIJIIJIL.getValue(this, LLJZ[2]);
    }

    public final VideoPublishEditModel LLLLJ() {
        return (VideoPublishEditModel) this.LLJJIJIL.getValue(this, LLJZ[3]);
    }

    public final C1652180t60 LLLLJI() {
        return (C1652180t60) this.LLJLILLLLZIIL.getValue();
    }

    public final C1662030tLt LLLLL() {
        return (C1662030tLt) this.LLJLL.getValue();
    }

    public final int LLLLLIL() {
        c0.LIZ.getClass();
        C1660590tJZ c1660590tJZ = c0.LJFF;
        Context contextRequireSceneContext = requireSceneContext();
        if (C1462920oAk.LIZLLL() && c1660590tJZ != null && getSceneContext() != null) {
            return c1660590tJZ.LJ(contextRequireSceneContext).topMargin + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + (c1660590tJZ.LJI() ? ScreenUtils.getStatusBarHeight(contextRequireSceneContext) : 0);
        }
        int i = C1428160nGg.LIZ;
        return C1428160nGg.LIZ + ScreenUtils.getStatusBarHeight(contextRequireSceneContext);
    }

    public final void LLLLLJLJLL() {
        boolean z;
        String string;
        Boolean value;
        Boolean value2;
        Boolean value3;
        AudioEnhanceParam audioEnhanceParam;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        List<SingleImageData> imageList2;
        SingleImageData singleImageData;
        SrcLiveVideoInfo srcLiveInfo;
        C0ETY c0ety;
        Class<InterfaceC1453200nv4> cls;
        AwS601S0100000_22 awS601S0100000_22;
        List list;
        Boolean bool;
        C19EG c19eg;
        Boolean value4;
        Boolean value5;
        Boolean value6;
        LLJLLL.getClass();
        C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
        C201955140j.LIZLLL(c1459900o5s, "EditTitleBarScene", "initTitleBar");
        this.LLJL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildToolbarListView isToolbarInit: ");
        sbLIZ.append(this.LLJJ);
        C201955140j.LIZLLL(c1459900o5s, "EditTitleBarScene", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJ) {
            C1652180t60 c1652180t60LLLLJI = LLLLJI();
            List<C1460620o72> listLLLLIIIILLL = LLLLIIIILLL(((InterfaceC1460110o6D) this.LLJLIL.getValue()).LIZ());
            ArrayList<C1460620o72> arrayList = new ArrayList();
            for (C1460620o72 c1460620o72 : listLLLLIIIILLL) {
                if (c1460620o72.LIZ != 24) {
                    arrayList.add(c1460620o72);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (C1460620o72 c1460620o722 : arrayList) {
                C1460610o71 c1460610o71 = C1460610o71.LIZ;
                VideoPublishEditModel videoPublishEditModelLLLLJ = LLLLJ();
                d0 d0Var = this.LLJJI;
                if (d0Var == null) {
                    d0Var = null;
                }
                boolean zLJIILJJIL = d0Var.LJIILJJIL();
                LiveData<Boolean> liveDataHB = LLLLILI().hB(c1460620o722.LIZ);
                boolean zBooleanValue = (liveDataHB == null || (value6 = liveDataHB.getValue()) == null) ? true : value6.booleanValue();
                LiveData<Boolean> liveDataLQ1 = LLLLILI().lQ1(c1460620o722.LIZ);
                boolean zBooleanValue2 = (liveDataLQ1 == null || (value5 = liveDataLQ1.getValue()) == null) ? true : value5.booleanValue();
                LiveData<Boolean> liveDataDD2 = LLLLILI().dD2(c1460620o722.LIZ);
                C1460140o6G c1460140o6G = new C1460140o6G(zBooleanValue, (liveDataDD2 == null || (value4 = liveDataDD2.getValue()) == null) ? c1460620o722.LJI : value4.booleanValue(), zBooleanValue2);
                c1460610o71.getClass();
                arrayList2.add(C1460610o71.LIZ(c1460620o722, videoPublishEditModelLLLLJ, zLJIILJJIL, c1460140o6G));
            }
            c1652180t60LLLLJI.LIZJ(arrayList2, false, null);
        } else {
            this.LLJJ = true;
            d0 d0Var2 = this.LLJJI;
            if (d0Var2 == null) {
                d0Var2 = null;
            }
            d0Var2.LJIJJ(LLLLJI(), new AwS566S0100000_22(this, 781));
            C1652180t60 c1652180t60LLLLJI2 = LLLLJI();
            List<C1460620o72> listLLLLIIIILLL2 = LLLLIIIILLL(((InterfaceC1460110o6D) this.LLJLIL.getValue()).LIZ());
            ArrayList<C1460620o72> arrayList3 = new ArrayList();
            for (C1460620o72 c1460620o723 : listLLLLIIIILLL2) {
                if (c1460620o723.LIZ != 24) {
                    arrayList3.add(c1460620o723);
                }
            }
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            for (C1460620o72 c1460620o724 : arrayList3) {
                C1460610o71 c1460610o712 = C1460610o71.LIZ;
                VideoPublishEditModel videoPublishEditModelLLLLJ2 = LLLLJ();
                d0 d0Var3 = this.LLJJI;
                if (d0Var3 == null) {
                    d0Var3 = null;
                }
                boolean zLJIILJJIL2 = d0Var3.LJIILJJIL();
                LiveData<Boolean> liveDataHB2 = LLLLILI().hB(c1460620o724.LIZ);
                boolean zBooleanValue3 = (liveDataHB2 == null || (value3 = liveDataHB2.getValue()) == null) ? true : value3.booleanValue();
                LiveData<Boolean> liveDataLQ12 = LLLLILI().lQ1(c1460620o724.LIZ);
                boolean zBooleanValue4 = (liveDataLQ12 == null || (value2 = liveDataLQ12.getValue()) == null) ? true : value2.booleanValue();
                LiveData<Boolean> liveDataDD22 = LLLLILI().dD2(c1460620o724.LIZ);
                C1460140o6G c1460140o6G2 = new C1460140o6G(zBooleanValue3, (liveDataDD22 == null || (value = liveDataDD22.getValue()) == null) ? c1460620o724.LJI : value.booleanValue(), zBooleanValue4);
                c1460610o712.getClass();
                arrayList4.add(C1460610o71.LIZ(c1460620o724, videoPublishEditModelLLLLJ2, zLJIILJJIL2, c1460140o6G2));
            }
            c1652180t60LLLLJI2.LIZJ(arrayList4, false, null);
            if (!C0CHQ.LIZ().getAccountService().LJIIJJI()) {
                C363500EMy c363500EMy = C363500EMy.LIZ;
                VideoPublishEditModel videoPublishEditModelLLLLJ3 = LLLLJ();
                c363500EMy.getClass();
                if (!C363500EMy.LJIIJJI(videoPublishEditModelLLLLJ3)) {
                    LLLLIL().ww2().observe(this, new AObserverS218S0100000_14(this, 23));
                }
            }
            if (C1428560nHK.LIZ() && !C1428470nHB.LJJZZI(LLLLJ()) && !C388010FJf.LIZ()) {
                LLLLIL().ww2().observe(this, new AObjectS243S0100000_14(this, 9));
            }
            if ((!LLLLJ().creativeModel.stickerModel.dmGroupChatStickerModel.isEmpty()) && ((DMGroupChatStickerModel) C13LP.LJJJJZI(LLLLJ().creativeModel.stickerModel.dmGroupChatStickerModel)).getUseNewToolTip()) {
                z = true;
                string = getString(2131838719);
            } else {
                z = false;
                string = getString(2131845527);
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C861100XqG(this, z, new AwS163S1100000_14(this, string, 2), null), 2);
        }
        if (LLLLJ().isAutoEnhanceEnable()) {
            C363500EMy.LIZ.getClass();
            if (C363500EMy.LJIIIIZZ == null) {
                Activity activity = this.mActivity;
                if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
                    C363500EMy.LJIIIIZZ = new C1459930o5v(c19eg, LLLLJ(), new AwS566S0100000_22(this, 784));
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
                c1459930o5v3.LIZIZ(new AwS108S0110000_22(this, zBooleanValue5, 12));
            }
        }
        InterfaceC1452170ntP value7 = LLLLIL().g().getValue();
        if (LLLLJ().isStickPointMode()) {
            LLLLILI().Uh1(8, false);
            LLLLILI().Uh1(7, false);
            LLLLILI().ut0(7, false);
        }
        InterfaceC1418580n1E interfaceC1418580n1E = (InterfaceC1418580n1E) ((C0ETY) this.LLJILLL.LJII(C0ETY.class, null)).MY1(InterfaceC1418580n1E.class);
        if (interfaceC1418580n1E == null || !interfaceC1418580n1E.FR0()) {
            LLLLILI().Uh1(7, false);
            LLLLILI().ut0(7, false);
        }
        if (C1428520nHG.LJIIIIZZ(LLLLJ())) {
            if (C1428520nHG.LJJJJL(LLLLJ())) {
                LLLLILI().ut0(6, true);
            } else {
                LLLLILI().ut0(6, false);
            }
        }
        if (C1428520nHG.LJIIJJI(LLLLJ()) && LLLLJ().getOrigin() == 2) {
            LLLLILI().ut0(6, true);
        }
        if (C1416310mxZ.LJJJLZIJ(LLLLJ(), C1428550nHJ.LIZ())) {
            LLLLILI().ut0(25, true);
        } else {
            LLLLILI().ut0(25, true);
        }
        if (C1428470nHB.LJJJJJ(LLLLJ()) || C1428470nHB.LJLLLL(LLLLJ())) {
            LLLLILI().Uh1(11, false);
            LLLLILI().rm(11, true);
        } else if ((u4.LJJIJ(LLLLJ()) || C1414450muZ.LJIIIIZZ(value7, LLLLJ())) && !C1418530n19.LIZIZ(LLLLJ())) {
            LLLLILI().Uh1(11, false);
            LLLLILI().rm(11, true);
        } else {
            CanvasVideoData canvasVideoData = LLLLJ().getCanvasVideoData();
            if (canvasVideoData != null && C1444940nhk.LJFF(canvasVideoData)) {
                LLLLILI().Uh1(11, false);
                LLLLILI().rm(11, false);
            } else if ((u4.LJJIIJ(LLLLJ()) && LLLLJ().getVoiceVolume() > 0.0f) || LLLLJ().hasRecord() || C366800EZq.LIZ(LLLLJ(), null)) {
                LLLLILI().Uh1(11, true);
                LLLLILI().rm(11, true);
            } else if (!u4.LJLJLJ(LLLLJ()) || LLLLJ().creativeModel.inlineCaptionModel == null) {
                LLLLILI().Uh1(11, false);
                if (C1428470nHB.LJZL(LLLLJ())) {
                    LLLLILI().rm(11, false);
                }
            } else {
                LLLLILI().Uh1(11, true);
                LLLLILI().rm(11, true);
            }
        }
        if (LLLLJ().isCurrentAutoCutMode()) {
            LLLLILI().ut0(26, false);
            LLLLILI().Ux(26, false);
        } else {
            LLLLILI().ut0(26, true);
        }
        C013C c013c = new C013C();
        c013c.element = !C0EM4.LIZ() ? LLLLJ().isDuet() || LLLLJ().getMMusicPath() == null || LLLLJ().isStickPointMode() || C1428470nHB.LJLIIL(LLLLJ()) : LLLLJ().isDuet() || LLLLJ().getMMusicPath() == null || LLLLJ().isStickPointMode();
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(LLLLJ().creativeModel.musicBuzModel);
        if (LLLLJ().isMvThemeVideoType() && aVMusicExtractAVMusic != null) {
            MvCreateVideoData mvCreateVideoData = LLLLJ().getMvCreateVideoData();
            if (!C580130Mp9.LIZ(mvCreateVideoData != null ? mvCreateVideoData.musicIds : null)) {
                MvCreateVideoData mvCreateVideoData2 = LLLLJ().getMvCreateVideoData();
                if (mvCreateVideoData2 == null || (list = mvCreateVideoData2.musicIds) == null) {
                    list = C13BV.INSTANCE;
                }
                if (list.contains(aVMusicExtractAVMusic.getMusicId())) {
                    c013c.element = false;
                }
            }
        }
        if (C0MT6.LIZ()) {
            C1DRG c1drg = this.LLJILLL;
            VideoPublishEditModel videoPublishEditModelLLLLJ4 = LLLLJ();
            if (LazyLoadEditLazyGroupPhase1.LIZ().enableMergeEPLazy) {
                c0ety = (C0ETY) c1drg.LJII(C0ETY.class, null);
                cls = InterfaceC1453200nv4.class;
                awS601S0100000_22 = new AwS601S0100000_22(c013c, 581);
            } else if (C365940EWi.LIZLLL(videoPublishEditModelLLLLJ4)) {
                c0ety = (C0ETY) c1drg.LJII(C0ETY.class, null);
                cls = InterfaceC1453200nv4.class;
                awS601S0100000_22 = new AwS601S0100000_22(c013c, 582);
            } else {
                InterfaceC1453200nv4 interfaceC1453200nv4 = (InterfaceC1453200nv4) ((C05YF) c1drg.LJIIL(null, InterfaceC1453200nv4.class));
                if (interfaceC1453200nv4 != null) {
                    interfaceC1453200nv4.eg(c013c.element);
                }
            }
            c0ety.Sd(cls, awS601S0100000_22);
        } else {
            LLLLILI().ut0(8, c013c.element);
            LLLLIL().g().observe(C372650EjH.LIZIZ(this), new AObserverS225S0100000_22(this, 136));
        }
        boolean zLIZ = C0MT6.LIZ();
        if ((C1428470nHB.LJJZZI(LLLLJ()) || C1428470nHB.LJZL(LLLLJ())) && zLIZ) {
            LLLLILI().ut0(8, false);
            LLLLILI().Uh1(8, false);
        }
        if (C1428470nHB.LJJZZI(LLLLJ()) && (imageAlbumData = LLLLJ().getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null && imageList.size() == 1) {
            ImageAlbumData imageAlbumData2 = LLLLJ().getImageAlbumData();
            LLLLLLZ((imageAlbumData2 == null || (imageList2 = imageAlbumData2.getImageList()) == null || (singleImageData = (SingleImageData) C13LP.LJJJLZIJ(0, imageList2)) == null || (srcLiveInfo = singleImageData.getSrcLiveInfo()) == null) ? null : srcLiveInfo.getLivePhotoPreviewMode());
        }
        if (C1446580nkO.LIZ() && (audioEnhanceParam = LLLLJ().getAudioEnhanceParam()) != null && C1439120nYM.LIZ(audioEnhanceParam, LLLLJ())) {
            LLLLILI().rm(14, true);
            InterfaceC1460000o62 interfaceC1460000o62LLLLILI = LLLLILI();
            AudioEnhanceParam audioEnhanceParam2 = LLLLJ().getAudioEnhanceParam();
            interfaceC1460000o62LLLLILI.Ux(14, audioEnhanceParam2 != null ? C349220Dma.LIZ(audioEnhanceParam2) : false);
        } else {
            LLLLILI().rm(14, false);
        }
        Boolean bool2 = Boolean.FALSE;
        LiveData<Boolean> liveDataLQ13 = LLLLILI().lQ1(20);
        if (bool2.equals(liveDataLQ13 != null ? liveDataLQ13.getValue() : null)) {
            LLLLILI().ut0(20, false);
        } else {
            LLLLILI().ut0(20, true);
        }
        if (u4.LJJIJ(LLLLJ()) || C1414450muZ.LJIIIIZZ(value7, LLLLJ()) || C1428470nHB.LJJJJJ(LLLLJ()) || C1414450muZ.LJI(value7, LLLLJ()) || C1428470nHB.LJLLLL(LLLLJ()) || C1414450muZ.LJIIL(value7, LLLLJ())) {
            LLLLILI().ut0(20, false);
        }
        if (C0EYU.LIZ(value7, LLLLJ())) {
            if (LLLLLJIL()) {
                LLLLILI().Ux(2, true);
            } else {
                LLLLILI().Ux(2, false);
            }
        }
        LiveData<Boolean> liveDataV01 = LLLLILI().v01(1105);
        if (liveDataV01 != null && Intrinsics.LJFF(liveDataV01.getValue(), bool2)) {
            LLLLILI().rm(1105, false);
        }
        C1414930mvL c1414930mvL = C1414930mvL.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLLJ5 = LLLLJ();
        c1414930mvL.getClass();
        if (C1414930mvL.LJIIJ(videoPublishEditModelLLLLJ5) || C1417220mz2.LIZ(LLLLJ()) || C1417210mz1.LIZJ(LLLLJ())) {
            boolean z2 = LLLLJ().isCurrentAutoCutMode() || C0EYU.LIZJ(value7, LLLLJ()) || C0EYU.LIZIZ(LLLLJ(), null, value7);
            C201955140j.LJ("NewEditToolbarScene -> useTemplate = " + z2);
            LLLLILI().Uh1(15, !(LLLLJ().creativeModel.stickerModel.isAiCaptionAdded && LLLLJ().creativeModel.stickerModel.memeSoundMusicParam != null && C338630DPh.LIZ()) && (!z2 || C1414450muZ.LIZ(LLLLJ())));
            if (!(C1414450muZ.LJIIJJI(LLLLJ()) || (z2 && !LLLLLILLIL()))) {
                LLLLILI().Ux(21, false);
            } else if (!C1459800o5i.LIZ(LLLLJ())) {
                LLLLILI().Ux(21, true);
            }
        }
        if (C1428470nHB.LLIIIJ(LLLLJ())) {
            LLLLILI().ut0(23, LLLLJ().hasTextSticker());
        }
        if (LLLLJ().creativeModel.pugcTemplateData.featureCodes.contains(Integer.valueOf(C0CIJ.UGC_I2V_FRAME.getValue()))) {
            LLLLILI().Uh1(15, false);
            LLLLILI().Uh1(11, false);
            LLLLILI().ut0(11, false);
        }
        LLLLLZ();
        if (C1428520nHG.LJIIJJI(LLLLJ())) {
            C1459710o5Z.LIZLLL(C1459710o5Z.LJI, "voice");
        } else {
            C1459710o5Z.LIZLLL(-1, "voice");
        }
        if (C1444940nhk.LJII(LLLLJ().getCanvasVideoData()) && !C1444940nhk.LJIIJ(LLLLJ().getCanvasVideoData()) && !C1428470nHB.LJJJJZI(LLLLJ()) && LLLLJ().creativeModel.aiCreateModel == null) {
            C1459710o5Z.LIZLLL(C1459710o5Z.LJII, "canvas_gesture");
        }
        if (C1428470nHB.LJJJLZIJ(LLLLJ()) && u4.LJJJJZI(LLLLJ())) {
            C1459710o5Z.LIZLLL(C1459710o5Z.LJIIIIZZ, "cut_optimized");
        }
    }

    public final void LLLLLL() {
        C1446760nkg.LIZ.getClass();
        if ((!C1446760nkg.LIZJ() || C1216510hlJ.LIZ().getBoolean("ai_cover_entry_guide_shown", false)) && C1403920mda.LIZ(LLLLJ(), false) && !C568750MSj.LIZIZ(LLLLJ()) && !C573570MeZ.LIZLLL(LLLLJ())) {
            String string = getString(2131829975);
            C862640Xsk c862640Xsk = LLJLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("keva_repo_photo_template");
            sbLIZ.append(C0CHQ.LIZ().getAccountService().getCurrentUserID());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            AwS163S1100000_14 awS163S1100000_14 = new AwS163S1100000_14(this, string, 3);
            c862640Xsk.getClass();
            C862640Xsk.LIZ(strLIZIZ, "keva_repo_photo_template", awS163S1100000_14);
        }
    }

    public final boolean LLLLLILLIL() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        NLETrack mainTrack;
        if (LLLLJ().getEditMusicSyncMode()) {
            return true;
        }
        InterfaceC1452170ntP value = LLLLIL().g().getValue();
        return Intrinsics.LJFF("true", (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null || (mainTrack = model.getMainTrack()) == null) ? null : mainTrack.getExtra("ep_stick_point_switch"));
    }

    public final boolean LLLLLJIL() {
        Collection<NLETrackSlot> arrayList;
        NLEModel nLEModelLIZ;
        VecNLETrackSPtr tracks;
        InterfaceC1452170ntP value = LLLLIL().g().getValue();
        if (value == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null || (tracks = nLEModelLIZ.getTracks()) == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList();
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getSlots(), arrayList);
            }
        }
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            for (NLETrackSlot nLETrackSlot : arrayList) {
                if (C351220Dpo.LLJJI(nLETrackSlot) && !Intrinsics.LJFF(nLETrackSlot.getExtra("is_from_template"), "true")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLZZ() {
        /*
            r3 = this;
            X.0nzM r1 = r3.LLLLIL()
            boolean r0 = r1 instanceof X.InterfaceC1446740nke
            if (r0 == 0) goto L24
            X.0nke r1 = (X.InterfaceC1446740nke) r1
            r2 = 1
            if (r1 == 0) goto L24
            boolean r0 = r1.eS0()
            if (r0 != r2) goto L24
            boolean r0 = r3.LLLLLJIL()
            if (r0 == 0) goto L24
        L19:
            kotlin.jvm.internal.AwS139S0110000_22 r1 = new kotlin.jvm.internal.AwS139S0110000_22
            r0 = 8
            r1.<init>(r3, r2, r0)
            X.C1524705y1.LIZJ(r1)
            return
        L24:
            r2 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459970o5z.LLLLLLZZ():void");
    }

    public final void LLLLLZ() {
        InterfaceC1452170ntP value;
        boolean zLJIILJJIL;
        if (C565160MEo.LIZJ(LLLLJ())) {
            boolean z = false;
            if (LLLLJ().getAILivePhotoModel().LJII()) {
                LLLLILI().Uh1(15, false);
                LLLLILI().Uh1(11, false);
                LLLLILI().Uh1(16, false);
                LLLLILI().Uh1(26, false);
                LLLLILI().Uh1(1104, false);
                LLLLILI().Uh1(1105, false);
                if (!C1414940mvM.LIZJ(LLLLJ())) {
                    LLLLILI().Uh1(21, false);
                }
                if (C0C0E.LIZ()) {
                    LLLLJ();
                    boolean z2 = !C1428520nHG.LJJLIIIJLLLLLLLZ();
                    LLLLILI().Uh1(8000, z2);
                    LLLLILI().Uh1(8001, z2);
                    return;
                }
                return;
            }
            if (LLLLJ().getAILivePhotoModel().LJIIIZ()) {
                LLLLILI().Uh1(15, false);
                LLLLILI().Uh1(11, false);
                LLLLILI().Uh1(1104, false);
                LLLLILI().Uh1(26, !LLLLJ().isCurrentAutoCutMode());
                LLLLILI().Uh1(16, true);
                LLLLILI().Uh1(1105, LLLLJ().isLivePhotoEdit());
                LLLLLLIL(false);
                if (C1414940mvM.LIZJ(LLLLJ())) {
                    return;
                }
                LLLLILI().Uh1(21, false);
                return;
            }
            LLLLILI().Uh1(1800, !C0MDL.LJ(LLLLJ()));
            LLLLILI().Uh1(15, ((LLLLJ().creativeModel.stickerModel.isAiCaptionAdded && LLLLJ().creativeModel.stickerModel.memeSoundMusicParam != null && C338630DPh.LIZ()) || (!(zLJIILJJIL = C1414450muZ.LJIILJJIL((value = LLLLIL().g().getValue()), LLLLJ())) ? !((zLJIILJJIL || C0EYU.LIZJ(value, LLLLJ())) && 0 == 0) : C1414450muZ.LIZ(LLLLJ())) || LLLLJ().creativeModel.pugcTemplateData.featureCodes.contains(Integer.valueOf(C0CIJ.UGC_I2V_FRAME.getValue()))) ? false : true);
            InterfaceC1460000o62 interfaceC1460000o62LLLLILI = LLLLILI();
            InterfaceC1452170ntP value2 = LLLLIL().g().getValue();
            if ((C1414450muZ.LJII(value2, LLLLJ()) && C366810EZr.LIZ(LLLLJ())) || C1414450muZ.LJIIIIZZ(value2, LLLLJ()) || C1414450muZ.LJI(value2, LLLLJ()) || C1414450muZ.LJIIL(value2, LLLLJ()) || C1428470nHB.LJJJJJ(LLLLJ()) || C1428470nHB.LJLLLL(LLLLJ()) || (((u4.LJJIJ(LLLLJ()) || C1414450muZ.LJIIIIZZ(value2, LLLLJ())) && !C1418530n19.LIZIZ(LLLLJ())) || ((!u4.LJJIIJ(LLLLJ()) || LLLLJ().getVoiceVolume() <= 0.0f) && !LLLLJ().hasRecord() && !C366800EZq.LIZ(LLLLJ(), null) && (!u4.LJLJLJ(LLLLJ()) || LLLLJ().creativeModel.inlineCaptionModel == null)))) {
                z = true;
            }
            interfaceC1460000o62LLLLILI.Uh1(11, !z);
            LLLLILI().Uh1(1104, !LLLLJ().isCurrentAutoCutMode());
            LLLLILI().Uh1(16, true);
            LLLLILI().Uh1(26, !LLLLJ().isCurrentAutoCutMode());
            LLLLILI().Uh1(21, true);
            LLLLILI().Uh1(1105, LLLLJ().isLivePhotoEdit());
            if (!C1414940mvM.LIZJ(LLLLJ())) {
                LLLLILI().Uh1(21, true);
            }
            LLLLJ();
            if (C1428520nHG.LJJLIIIJLLLLLLLZ() && C0C0E.LIZ()) {
                LLLLLLIL(C1414450muZ.LIZ(LLLLJ()));
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C0CHQ.LIZ().getPublishService().LJIIIZ(getLifecycle());
        C365730EVn.LIZ.LJFF(null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        Boolean value;
        Boolean value2;
        Boolean value3;
        super.onResume();
        if (this.LLJL && C1428470nHB.LLIIIILZ(LLLLJ())) {
            boolean z = LLLLJ().creativeModel.imageEditModel.enterFromImagePublishPreview;
            boolean z2 = LLLLJ().isFromRestoreRecover() && this.LLJILLL.LJIIL(null, InterfaceC572210McN.class) == null;
            if (z || z2) {
                List<C1460620o72> listLLLLIIIILLL = LLLLIIIILLL(new C1459690o5X(this, this.LLJILLL, new AwS566S0100000_22(this, 782)).LIZ());
                ArrayList<C1460620o72> arrayList = new ArrayList();
                for (C1460620o72 c1460620o72 : listLLLLIIIILLL) {
                    if (c1460620o72.LIZ != 24) {
                        arrayList.add(c1460620o72);
                    }
                }
                C1652180t60 c1652180t60LLLLJI = LLLLJI();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                for (C1460620o72 c1460620o722 : arrayList) {
                    C1460610o71 c1460610o71 = C1460610o71.LIZ;
                    VideoPublishEditModel videoPublishEditModelLLLLJ = LLLLJ();
                    d0 d0Var = this.LLJJI;
                    if (d0Var == null) {
                        d0Var = null;
                    }
                    boolean zLJIILJJIL = d0Var.LJIILJJIL();
                    LiveData<Boolean> liveDataHB = LLLLILI().hB(c1460620o722.LIZ);
                    boolean zBooleanValue = (liveDataHB == null || (value3 = liveDataHB.getValue()) == null) ? true : value3.booleanValue();
                    LiveData<Boolean> liveDataLQ1 = LLLLILI().lQ1(c1460620o722.LIZ);
                    boolean zBooleanValue2 = (liveDataLQ1 == null || (value2 = liveDataLQ1.getValue()) == null) ? true : value2.booleanValue();
                    LiveData<Boolean> liveDataDD2 = LLLLILI().dD2(c1460620o722.LIZ);
                    C1460140o6G c1460140o6G = new C1460140o6G(zBooleanValue, (liveDataDD2 == null || (value = liveDataDD2.getValue()) == null) ? c1460620o722.LJI : value.booleanValue(), zBooleanValue2);
                    c1460610o71.getClass();
                    arrayList2.add(C1460610o71.LIZ(c1460620o722, videoPublishEditModelLLLLJ, zLJIILJJIL, c1460140o6G));
                }
                c1652180t60LLLLJI.LIZJ(arrayList2, false, null);
            }
        }
        LLLLLL();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public C1459970o5z(C1DRG c1drg) {
        this.LLJILLL = c1drg;
        this.LLJJIII = C1664770tQJ.LIZIZ(c1drg, InterfaceC377540ErA.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(c1drg, InterfaceC1461390o8H.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1418580n1E.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455850nzL.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1451050nrb.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455680nz4.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1417440mzO.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1417050myl.class, null);
        this.LLJJLIIIJLLLLLLLZ = new LinkedHashSet();
        this.LLJLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 766));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 765));
        this.LLJLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 767));
    }

    public static final void LLLLLLJ(C1459970o5z c1459970o5z) {
        String strLIZ = c1459970o5z.LLLLJ().getAILivePhotoModel().LIZIZ().failReasonMsg;
        if (strLIZ == null || strLIZ.length() == 0) {
            strLIZ = C0MED.LIZ(C0MEB.POST_TOAST_TRY_RESTORED, new Object[0]);
        }
        c1459970o5z.LLLLLLLLLL(1800, new C1662100tM0(EnumC1651790t5N.TUX_TIP_AI_LIVE_FAIL_RETRY, strLIZ, "", false, -1L, null, EnumC862650Xsl.BELOW_ICON, AFwS210S0000000_22.get$arr$(269), new AwS566S0100000_22(c1459970o5z, 762), EnumC1662090tLz.TUX_TIP, null, null, C0MED.LIZ(C0MEB.POST_TOAST_CTA_RETRY, new Object[0]), 3104));
    }

    public final List<C1460620o72> LLLLIIIILLL(List<C1460620o72> list) {
        if (C568750MSj.LIZIZ(LLLLJ())) {
            ArrayList arrayList = new ArrayList();
            for (C1460620o72 c1460620o72 : list) {
                List listLJIIJJI = C1697810uHb.LJIIJJI(17, 1200, 15, 21, 6, 20, 2, 1800, 1100, 16, 25);
                List<Integer> list2 = C1460620o72.LJIILIIL;
                if (!listLJIIJJI.contains(Integer.valueOf(c1460620o72.LIZ & (-8193)))) {
                    arrayList.add(c1460620o72);
                }
            }
            return arrayList;
        }
        if (C1428470nHB.LJJLIL(LLLLJ())) {
            ArrayList arrayList2 = new ArrayList();
            for (C1460620o72 c1460620o722 : list) {
                if (!C1697810uHb.LJIIJJI(21, 15, 2, 20).contains(Integer.valueOf(c1460620o722.LIZ))) {
                    arrayList2.add(c1460620o722);
                }
            }
            return arrayList2;
        }
        return list;
    }

    public final String LLLLIILL(long j) {
        if (Intrinsics.LJFF(LLLLJ().creativeModel.aiLivePhotoModel.pageDataCache.fallbackToOldModel, Boolean.TRUE) && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_ai_alive_people_disclaimer", true, false)) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_ai_alive_people_disclaimer_model_visible", true, false)) {
                if (C0A18.LIZ()) {
                    return C0MED.LIZ(C0MEB.EDITING_PAGE_TOOLTIP_PEOPLE_DISCLAIMER1, new Object[0]);
                }
                return requireSceneContext().getString(2131825333);
            }
            if (C0A18.LIZ()) {
                return C0MED.LIZ(C0MEB.EDITING_PAGE_TOOLTIP_PEOPLE_DISCLAIMER2, new Object[0]);
            }
            return requireSceneContext().getString(2131825334);
        }
        return C0T8Y.LIZ(2131755020, 2131755019, j, requireSceneContext());
    }

    public final void LLLLLLIL(boolean z) {
        LLLLILI().Uh1(8000, z);
        LLLLILI().Uh1(8001, z);
        LLLLILI().ut0(8000, z);
        LLLLILI().ut0(8001, z);
    }

    public final void LLLLLLL(C1464760oDi c1464760oDi) {
        Pair<Boolean, Boolean> value = LLLLILI().x8().getValue();
        if (value != null && !value.getFirst().booleanValue()) {
            return;
        }
        d0 d0Var = this.LLJJI;
        d0 d0Var2 = null;
        if (d0Var == null) {
            d0Var = null;
        }
        if (d0Var.LJIILIIL()) {
            d0 d0Var3 = this.LLJJI;
            if (d0Var3 != null) {
                d0Var2 = d0Var3;
            }
            d0Var2.LIZJ();
            C12WG.LIZLLL(this, new ARunnableS91S0200000_22(this, c1464760oDi, 24), 500L);
            return;
        }
        LLLLLLLLL(this, c1464760oDi);
    }

    public final void LLLLLLZ(LivePhotoPreviewMode livePhotoPreviewMode) {
        if (!this.LLJJ || livePhotoPreviewMode == null) {
            return;
        }
        Pair<Integer, Integer> pairLIZIZ = C534280KxO.LIZIZ(livePhotoPreviewMode);
        int iIntValue = pairLIZIZ.getFirst().intValue();
        int iIntValue2 = pairLIZIZ.getSecond().intValue();
        if (C1428470nHB.LJJZZI(LLLLJ())) {
            LLLLJI().LJI(1105, new AwS35S0001000_22(iIntValue, 25));
            return;
        }
        CountDownTimerC1466530oGZ countDownTimerC1466530oGZ = this.LLJLLIL;
        if (countDownTimerC1466530oGZ != null) {
            countDownTimerC1466530oGZ.cancel();
        }
        this.LLJLLIL = new CountDownTimerC1466530oGZ(this, 0);
        LLLLJI().LJI(1105, new AwS15S0002000_22(iIntValue, iIntValue2, 1));
        CountDownTimerC1466530oGZ countDownTimerC1466530oGZ2 = this.LLJLLIL;
        if (countDownTimerC1466530oGZ2 != null) {
            countDownTimerC1466530oGZ2.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03c4  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459970o5z.onActivityCreated(android.os.Bundle):void");
    }

    public static final void LLLLLLLLL(C1459970o5z c1459970o5z, C1464760oDi c1464760oDi) {
        c1459970o5z.LLLLLLLLLL(1800, new C1662100tM0(EnumC1651790t5N.TUX_TIP_AI_LIVE_PROGRESS, c1459970o5z.LLLLIILL(c1464760oDi.LIZLLL), "", false, -1L, null, EnumC862650Xsl.BELOW_ICON, new AwS566S0100000_22(c1459970o5z, 763), new AwS566S0100000_22(c1459970o5z, 764), EnumC1662090tLz.TUX_TIP, null, null, null, 7200));
    }

    public final boolean LLLLLLLLLL(int i, C1662100tM0 c1662100tM0) {
        i3 next;
        InterfaceC1657880tFC interfaceC1657880tFC;
        C1654400t9a c1654400t9aLIZLLL;
        ViewGroup viewGroup;
        d0 d0Var = this.LLJJI;
        if (d0Var == null) {
            d0Var = null;
        }
        Iterator<i3> it2 = d0Var.getCurrentDisplayListData().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LLILLL.getType() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        i3 i3Var = next;
        if (i3Var != null && (interfaceC1657880tFC = d0Var.getItemMap().get(i3Var.LLJLIL)) != null && (c1654400t9aLIZLLL = interfaceC1657880tFC.LIZLLL()) != null) {
            d0 d0Var2 = this.LLJJI;
            if (d0Var2 == null) {
                d0Var2 = null;
            }
            ViewParent parent = d0Var2.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                LLLLL().LJII(viewGroup, c1654400t9aLIZLLL, c1662100tM0);
                return true;
            }
        }
        return false;
    }

    public final void LLLLLLLZIL(int i, boolean z) {
        LLLLJI().LJI(i, new AwS35S0010000_22(z, 27));
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (LLLLJ().isPhotoSwap()) {
            d0 d0Var = new d0(requireSceneContext());
            this.LLJJI = d0Var;
            d0Var.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150)));
            d0Var.setOrientation(1);
            int iLIZ = C1461700o8m.LIZ(C786410Ut5.N3(d0Var.getContext()));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, ScreenUtils.getScreenWidth(d0Var.getContext()));
            layoutParams.gravity = 8388613;
            layoutParams.topMargin = iLIZ;
            C786410Ut5.t7(d0Var, layoutParams);
            d0Var.setGravity(16);
            return d0Var;
        }
        d0 d0Var2 = new d0(requireSceneContext());
        this.LLJJI = d0Var2;
        d0Var2.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150)));
        Integer numValueOf = Integer.valueOf(LLLLLIL());
        if (C1428470nHB.LJJLIIIJLLLLLLLZ(LLLLJ())) {
            i = 200;
        } else {
            i = 100;
        }
        C426750GoL.LJIIL(d0Var2, null, numValueOf, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), 21);
        d0Var2.setOrientation(1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 8388613;
        C786410Ut5.t7(d0Var2, layoutParams2);
        d0Var2.setMaxHeight(((ScreenUtils.getFullScreenHeight(requireSceneContext()) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(requireSceneContext())) - d0Var2.getPaddingTop()) - d0Var2.getPaddingBottom());
        return d0Var2;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
