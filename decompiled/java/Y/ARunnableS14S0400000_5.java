package Y;

import X.AbstractC1585810rMx;
import X.C013C;
import X.C0E48;
import X.C0E4T;
import X.C0E5G;
import X.C0ECG;
import X.C0EGB;
import X.C0EWD;
import X.C0FQ1;
import X.C0FSW;
import X.C0FSX;
import X.C0FSY;
import X.C0FX2;
import X.C0FX3;
import X.C118300cf;
import X.C123P;
import X.C124Q;
import X.C13LP;
import X.C1463860oCG;
import X.C1481605r4;
import X.C1697810uHb;
import X.C1954807lC;
import X.C1C7U;
import X.C2188811AlT;
import X.C259800zU;
import X.C350870DpF;
import X.C354270Duj;
import X.C361700EGa;
import X.C361980EHc;
import X.C362620EJo;
import X.C381370ExL;
import X.C385230F8n;
import X.C389960FQs;
import X.C418440Gaw;
import X.C559870LxZ;
import X.C786410Ut5;
import X.C823050WQl;
import X.EnumC357850E1f;
import X.InterfaceC359940E9g;
import X.InterfaceC366660EZc;
import X.InterfaceC559900Lxc;
import android.content.Context;
import android.os.Handler;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETextTemplateClip;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.scene.Scene;
import com.bytedance.scene.ktx.SceneExtensionsKt$wrapRunnable$observer$1;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.cut_ui.TextItem;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment;
import com.ss.android.ugc.gamora.recorder.ttsreuse.d;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public class ARunnableS14S0400000_5 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((View) this.l0).getParent() == null || ((View) this.l1).getMeasuredHeight() == 0 || ((View) this.l0).getMeasuredHeight() == 0 || ((C118300cf) this.l2).element == ((View) this.l0).getMeasuredHeight()) {
            return;
        }
        ((C362620EJo) this.l3).BA0(((View) this.l1).getMeasuredHeight() + ((View) this.l0).getMeasuredHeight());
    }

    public final void LIZ$1() {
        if (((View) this.l0).getParent() == null || ((View) this.l1).getMeasuredHeight() == 0 || ((View) this.l0).getMeasuredHeight() == 0 || ((C118300cf) this.l2).element == ((View) this.l0).getMeasuredHeight()) {
            return;
        }
        ((TTResourcePanelFragment) this.l3).gT(((View) this.l1).getMeasuredHeight() + ((View) this.l0).getMeasuredHeight());
    }

    public final void LIZ$2() {
        int lineCount = ((C124Q) this.l0).getLineCount();
        TextStickerTextWrap textStickerTextWrapLIZ = C123P.LIZ((C124Q) this.l0, new ArrayList());
        ((TextStickerData) this.l1).setTextWrapList(C1697810uHb.LJ(textStickerTextWrapLIZ));
        ViewGroup viewGroup = ((d) this.l2).LLJILJIL;
        if (viewGroup != null) {
            C786410Ut5.LJJJLZIJ((C124Q) this.l0, viewGroup);
        }
        ((Function2) this.l3).invoke(textStickerTextWrapLIZ, Integer.valueOf(lineCount));
    }

    public final void LIZ$3() {
        float measuredWidth;
        float measuredHeight;
        int i = C0FSW.LIZ[((C0FSX) this.l0).ordinal()];
        if (i == 1) {
            measuredWidth = (((int[]) this.l1)[0] + (((View) this.l2).getMeasuredWidth() / 2.0f)) - (((C0FSY) this.l3).LLILLL.getMeasuredWidth() / 2);
            measuredHeight = ((int[]) this.l1)[1] + ((View) this.l2).getMeasuredHeight() + C418440Gaw.LIZIZ(8);
        } else {
            if (i != 2) {
                throw new C1954807lC();
            }
            measuredWidth = (((int[]) this.l1)[0] + (((View) this.l2).getMeasuredWidth() / 2.0f)) - (((C0FSY) this.l3).LLILLL.getMeasuredWidth() / 2);
            measuredHeight = (((int[]) this.l1)[1] - ((C0FSY) this.l3).LLILLL.getMeasuredHeight()) - C418440Gaw.LIZIZ(8);
        }
        ((C0FSY) this.l3).LJJIJL(measuredWidth, measuredHeight, null, null);
    }

    public final void LIZ$4() {
        INLEPlayer playerApi;
        INLEPlayer playerApi2;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLETrackSlot nLETrackSlotLJIIZILJ = ((C385230F8n) this.l0).LJIIZILJ((TextStickerModel) this.l1);
        if (nLETrackSlotLJIIZILJ == null) {
            return;
        }
        long measuredEndTime = nLETrackSlotLJIIZILJ.getMeasuredEndTime() - nLETrackSlotLJIIZILJ.getMeasuredStartTime();
        NLEModel model = ((C385230F8n) this.l0).LJIIIIZZ.getModel();
        if (model != null) {
            Float f = (Float) this.l2;
            model.setCanvasRatio(f != null ? f.floatValue() : 0.5625f);
        }
        NLEModel model2 = ((C385230F8n) this.l0).LJIIIIZZ.getModel();
        if (model2 != null && (mainTrack = model2.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
            nLESegmentVideoDynamicCast.getAVFile().setDuration(measuredEndTime);
            nLESegmentVideoDynamicCast.setTimeClipEnd(measuredEndTime);
            nLETrackSlot.setEndTime(measuredEndTime);
        }
        ((C385230F8n) this.l0).LJIIJJI = measuredEndTime;
        NLETrackSlot nLETrackSlotLJIILL = ((C385230F8n) this.l0).LJIILL();
        if (nLETrackSlotLJIILL != null) {
            nLETrackSlotLJIILL.setEnable(true);
        }
        ((C385230F8n) this.l0).LJIIIIZZ.commit();
        ((Function0) this.l3).invoke();
        C1463860oCG c1463860oCG = ((C385230F8n) this.l0).LJIIIZ;
        if (c1463860oCG != null && (playerApi2 = c1463860oCG.getPlayerApi()) != null) {
            ((C389960FQs) playerApi2).prepare();
        }
        C385230F8n c385230F8n = (C385230F8n) this.l0;
        C0FX3 c0fx3 = new C0FX3(c385230F8n, 23);
        c385230F8n.getClass();
        C013C c013c = new C013C();
        C1463860oCG c1463860oCG2 = c385230F8n.LJIIIZ;
        if (c1463860oCG2 != null && (playerApi = c1463860oCG2.getPlayerApi()) != null) {
            ((C389960FQs) playerApi).seekTime(0L, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek, new C0FX2(c013c, c0fx3, 10));
        }
        C354270Duj.LIZ(2000L, new AwS406S0200000_5(c013c, c0fx3, 117));
    }

    public final void LIZ$5() {
        if (((C0EGB) this.l0).LLILZ.Wq().getParent() != null) {
            C118300cf c118300cf = (C118300cf) this.l1;
            SurfaceView surfaceViewLJIJJLI = ((C0EGB) this.l0).D5().LJIJJLI();
            c118300cf.element = surfaceViewLJIJJLI != null ? surfaceViewLJIJJLI.getWidth() : 0;
            ((C118300cf) this.l2).element = ((C0EGB) this.l0).LLILZ.Wq().getHeight();
            ((Function2) this.l3).invoke(Integer.valueOf(((C118300cf) this.l1).element), Integer.valueOf(((C118300cf) this.l2).element));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.0ECG, X.0rMx] */
    public final void LIZ$6() {
        final RecyclerView recyclerViewLLII;
        LinearLayoutManager linearLayoutManager;
        if (((RecyclerView) this.l0).getParent() == null || !((C0E48) this.l1).Ls()) {
            return;
        }
        final InterfaceC359940E9g interfaceC359940E9g = (InterfaceC359940E9g) this.l2;
        final VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.l3;
        final C0E48 c0e48 = (C0E48) this.l1;
        if (interfaceC359940E9g == null || videoPublishEditModel == null || (recyclerViewLLII = interfaceC359940E9g.LLII()) == 0) {
            return;
        }
        final C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        final C118300cf c118300cf2 = new C118300cf();
        c118300cf2.element = -1;
        RecyclerView.LayoutManager layoutManager = recyclerViewLLII.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            c118300cf.element = linearLayoutManager.findFirstVisibleItemPosition();
            c118300cf2.element = linearLayoutManager.findLastVisibleItemPosition();
            IntRange intRange = new IntRange(c118300cf.element, c118300cf2.element);
            final ArrayList arrayList = new ArrayList();
            List<C361980EHc> listLJIILJJIL = interfaceC359940E9g.LJIILJJIL();
            if (listLJIILJJIL != null) {
                int i = 0;
                for (C361980EHc c361980EHc : listLJIILJJIL) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    C361980EHc c361980EHc2 = c361980EHc;
                    int i3 = intRange.LL;
                    if (i <= intRange.LLILLJJLI && i3 <= i) {
                        arrayList.add(c361980EHc2.LJI);
                    }
                    i = i2;
                }
            }
            EnumC357850E1f enumC357850E1f = EnumC357850E1f.ENABLE_MULTITHREADED_OPT;
            Boolean bool = Boolean.FALSE;
            final long jQq = ((Boolean) C0E5G.LIZIZ(enumC357850E1f, bool)).booleanValue() ? c0e48.getPlayer().qq() : -1L;
            final Pair<Integer, Integer> pairLJJII = ((Boolean) C0E5G.LIZIZ(enumC357850E1f, bool)).booleanValue() ? u4.LJJII(C350870DpF.LJI(c0e48), false) : new Pair<>(-1, -1);
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0EGZ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EditorProMobHelperKt__EPBasicMobHelperKt@6a62.mobFuncBarShowEventInternal$1$2");
                    try {
                        C361680EFy.LJJLIIIJLLLLLLLZ(arrayList, videoPublishEditModel, c0e48, jQq, pairLJJII);
                        C0EMB.LIZJ(videoPublishEditModel, "trim_page");
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EditorProMobHelperKt__EPBasicMobHelperKt@6a62.mobFuncBarShowEventInternal$1$2");
                }
            });
        }
        C0ECG c0ecg = C361700EGa.LIZ;
        if (c0ecg != null) {
            recyclerViewLLII.removeOnScrollListener(c0ecg);
        }
        ?? r7 = new AbstractC1585810rMx() { // from class: X.0ECG
            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i4) {
                LinearLayoutManager linearLayoutManager2;
                if (i4 == 0) {
                    RecyclerView.LayoutManager layoutManager2 = recyclerViewLLII.getLayoutManager();
                    if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null) {
                        C118300cf c118300cf3 = c118300cf2;
                        C118300cf c118300cf4 = c118300cf;
                        InterfaceC359940E9g interfaceC359940E9g2 = interfaceC359940E9g;
                        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                        C0E48 c0e482 = c0e48;
                        RecyclerView recyclerView2 = recyclerViewLLII;
                        int iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
                        int iFindFirstVisibleItemPosition = linearLayoutManager2.findFirstVisibleItemPosition();
                        if (iFindLastVisibleItemPosition > c118300cf3.element || iFindFirstVisibleItemPosition < c118300cf4.element) {
                            ArrayList arrayList2 = new ArrayList();
                            IntRange intRange2 = new IntRange(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition);
                            IntRange intRange3 = new IntRange(c118300cf4.element, c118300cf3.element);
                            List<C361980EHc> listLJIILJJIL2 = interfaceC359940E9g2.LJIILJJIL();
                            if (listLJIILJJIL2 != null) {
                                int i5 = 0;
                                for (C361980EHc c361980EHc3 : listLJIILJJIL2) {
                                    int i6 = i5 + 1;
                                    if (i5 >= 0) {
                                        C361980EHc c361980EHc4 = c361980EHc3;
                                        int i7 = intRange3.LL;
                                        if (i5 > intRange3.LLILLJJLI || i7 > i5) {
                                            int i8 = intRange2.LL;
                                            if (i5 <= intRange2.LLILLJJLI && i8 <= i5) {
                                                arrayList2.add(c361980EHc4.LJI);
                                            }
                                        }
                                        i5 = i6;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                }
                            }
                            C361680EFy.LJJLIIIJLLLLLLLZ(arrayList2, videoPublishEditModel2, c0e482, -1L, new Pair(-1, -1));
                            recyclerView2.removeOnScrollListener(this);
                        }
                    }
                }
            }
        };
        recyclerViewLLII.addOnScrollListener(r7);
        C361700EGa.LIZ = r7;
    }

    public static final void run$0(ARunnableS14S0400000_5 aRunnableS14S0400000_5) {
        boolean zLIZ;
        C1C7U.LIZ("EPPanelHeightLogicComponent@4285.setResourcePanelTopToConsoleBarBottom$1");
        try {
            aRunnableS14S0400000_5.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EPPanelHeightLogicComponent@4285.setResourcePanelTopToConsoleBarBottom$1");
    }

    public static final void run$1(ARunnableS14S0400000_5 aRunnableS14S0400000_5) {
        boolean zLIZ;
        C1C7U.LIZ("TTResourcePanelFragment@2539.setResourcePanelTopToConsoleBarBottom$1");
        try {
            aRunnableS14S0400000_5.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTResourcePanelFragment@2539.setResourcePanelTopToConsoleBarBottom$1");
    }

    public static final void run$10(ARunnableS14S0400000_5 aRunnableS14S0400000_5) {
        boolean zLIZ;
        C1C7U.LIZ("EditorProMobHelperKt__EPBasicMobHelperKt@6a62.mobFuncBarShowEvent$1$1");
        try {
            aRunnableS14S0400000_5.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditorProMobHelperKt__EPBasicMobHelperKt@6a62.mobFuncBarShowEvent$1$1");
    }

    public static final void run$11(ARunnableS14S0400000_5 aRunnableS14S0400000_5) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateCombineEffectTask@4869.seekToSlot$1");
        try {
            if (!((C381370ExL) aRunnableS14S0400000_5.l0).LJJIIJZLJL()) {
                if (((INLEPlayer) aRunnableS14S0400000_5.l1).getCurrentPosition() == 0) {
                    ((Function0) aRunnableS14S0400000_5.l2).invoke();
                } else {
                    C786410Ut5.LJLIIL(50L, (Handler) aRunnableS14S0400000_5.l3, aRunnableS14S0400000_5);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateCombineEffectTask@4869.seekToSlot$1");
    }

    public static final void run$2(ARunnableS14S0400000_5 aRunnableS14S0400000_5) {
        boolean zLIZ;
        C1C7U.LIZ("TTResourcePanelFragment@2539.setResourcePanelTopToConsoleBarTop$1");
        try {
            if (((View) aRunnableS14S0400000_5.l0).getMeasuredHeight() != 0 && ((View) aRunnableS14S0400000_5.l1).getMeasuredHeight() != 0 && ((View) aRunnableS14S0400000_5.l2).getMeasuredHeight() != 0) {
                ((TTResourcePanelFragment) aRunnableS14S0400000_5.l3).gT(((View) aRunnableS14S0400000_5.l0).getMeasuredHeight() + ((View) aRunnableS14S0400000_5.l1).getMeasuredHeight() + ((View) aRunnableS14S0400000_5.l2).getMeasuredHeight());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTResourcePanelFragment@2539.setResourcePanelTopToConsoleBarTop$1");
    }

    public static final void run$3(ARunnableS14S0400000_5 aRunnableS14S0400000_5) {
        boolean zLIZ;
        C1C7U.LIZ("RecordTtsReuseLogicComponent@a8c0.mockViewToSplitText$1");
        try {
            aRunnableS14S0400000_5.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordTtsReuseLogicComponent@a8c0.mockViewToSplitText$1");
    }

    public static final void run$4(ARunnableS14S0400000_5 aRunnableS14S0400000_5) {
        boolean zLIZ;
        C1C7U.LIZ("StickerGuide@28fc.showGuideInEditLayout$1$1");
        try {
            aRunnableS14S0400000_5.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StickerGuide@28fc.showGuideInEditLayout$1$1");
    }

    public static final void run$5(ARunnableS14S0400000_5 aRunnableS14S0400000_5) {
        boolean zLIZ;
        C1C7U.LIZ("TextStickerPlayer@58de.showSticker$1");
        try {
            aRunnableS14S0400000_5.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TextStickerPlayer@58de.showSticker$1");
    }

    public static final void run$6(ARunnableS14S0400000_5 aRunnableS14S0400000_5) {
        Runnable runnable = (Runnable) aRunnableS14S0400000_5.l0;
        Scene scene = (Scene) aRunnableS14S0400000_5.l1;
        SceneExtensionsKt$wrapRunnable$observer$1 sceneExtensionsKt$wrapRunnable$observer$1 = (SceneExtensionsKt$wrapRunnable$observer$1) aRunnableS14S0400000_5.l2;
        C259800zU c259800zU = (C259800zU) aRunnableS14S0400000_5.l3;
        C1C7U.LIZ("SceneExtensionsKt@d67d.wrapRunnable$1L");
        runnable.run();
        scene.getLifecycle().removeObserver(sceneExtensionsKt$wrapRunnable$observer$1);
        c259800zU.element = null;
        C1C7U.LIZIZ("SceneExtensionsKt@d67d.wrapRunnable$1L");
    }

    public static final void run$7(ARunnableS14S0400000_5 aRunnableS14S0400000_5) {
        Object next;
        Object next2;
        NLETemplateModel nLETemplateModel = (NLETemplateModel) aRunnableS14S0400000_5.l0;
        Context context = (Context) aRunnableS14S0400000_5.l1;
        ArrayList arrayList = (ArrayList) aRunnableS14S0400000_5.l2;
        ArrayList arrayList2 = (ArrayList) aRunnableS14S0400000_5.l3;
        C1C7U.LIZ("CutPlayerActivity$initTemplateData$1$1$1@4a16.onPreSuccess$1L");
        if (nLETemplateModel != null) {
            C0FQ1.LIZJ(nLETemplateModel, context, arrayList);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (NLETrackSlot nLETrackSlot : nLETemplateModel.getMutableTextItems()) {
                    NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    if (nLESegmentTextStickerDynamicCast != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (Intrinsics.LJFF(((TextItem) next2).materialId, nLESegmentTextStickerDynamicCast.getUUID())) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        TextItem textItem = (TextItem) next2;
                        if (textItem != null) {
                            nLESegmentTextStickerDynamicCast.setContent(textItem.text);
                            nLETrackSlot.setRotation((float) textItem.rotation);
                            nLETrackSlot.setStartTime(textItem.targetStartTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                            InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("insertTextItems[] success: segmentText = ");
                            sbLIZ.append(nLESegmentTextStickerDynamicCast);
                            C559870LxZ.LIZ("NLETemplateUtils", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    if (NLESegmentTextTemplate.dynamicCast(nLETrackSlot.getMainSegment()) != null) {
                        for (NLETextTemplateClip nLETextTemplateClip : nLETemplateModel.getAllMutableTextClipsFromSlot(nLETrackSlot)) {
                            Iterator it3 = arrayList2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    if (Intrinsics.LJFF(((TextItem) next).materialId, nLETextTemplateClip.getUUID())) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            TextItem textItem2 = (TextItem) next;
                            if (textItem2 != null) {
                                nLETextTemplateClip.setContent(textItem2.text);
                                InterfaceC559900Lxc interfaceC559900Lxc2 = C559870LxZ.LIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("insertTextItems[] success: textClip = ");
                                sbLIZ2.append(nLETextTemplateClip);
                                C559870LxZ.LIZ("NLETemplateUtils", C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        }
                    }
                }
            }
        }
        C1C7U.LIZIZ("CutPlayerActivity$initTemplateData$1$1$1@4a16.onPreSuccess$1L");
    }

    public static final void run$8(ARunnableS14S0400000_5 aRunnableS14S0400000_5) {
        boolean zLIZ;
        C1C7U.LIZ("EPSceneLegacySurfaceResultHandlerKt@a988.updateSurfaceSizeInternal$1");
        try {
            aRunnableS14S0400000_5.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EPSceneLegacySurfaceResultHandlerKt@a988.updateSurfaceSizeInternal$1");
    }

    public static final void run$9(ARunnableS14S0400000_5 aRunnableS14S0400000_5) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateApplier@dfb.renderSticker$runnable$1");
        try {
            ((C0EWD) aRunnableS14S0400000_5.l0).LJIIJJI = null;
            C1481605r4.LIZIZ(new ARunnableS38S0300000_5((InterfaceC366660EZc) aRunnableS14S0400000_5.l1, (C0E4T) aRunnableS14S0400000_5.l2, (NLEModel) aRunnableS14S0400000_5.l3, 9));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateApplier@dfb.renderSticker$runnable$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS14S0400000_5(Object obj, View view, View view2, View view3, TTResourcePanelFragment<? extends VM> tTResourcePanelFragment) {
        this.$t = tTResourcePanelFragment;
        this.l0 = obj;
        this.l1 = view;
        this.l2 = view2;
        this.l3 = view3;
    }
}
