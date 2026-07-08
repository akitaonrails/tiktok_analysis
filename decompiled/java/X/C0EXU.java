package X;

import Y.AObjectS240S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.magic.MagicCombineEffectModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0EXU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EXU extends AbstractC2255721DQs<InterfaceC366350EXx> implements InterfaceC366350EXx, InterfaceC379610EuV {
    public static final C0EYA LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final int LLJZIJLIL;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final InterfaceC366350EXx LLILLL = this;
    public Set<? extends InterfaceC366210EXj> LLILZ = C08CX.INSTANCE;
    public final InterfaceC497601wk LLILZIL;
    public NLEModel LLILZLL;
    public NLEModel LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public InterfaceC350420DoW LLJJJJ;
    public InterfaceC357170DzP LLJJJJJIL;
    public final C0EY4 LLJJJJLIIL;
    public C0EYC LLJJL;
    public C0EYE LLJJLIIIJLLLLLLLZ;
    public C09AE LLJL;
    public C09AE LLJLIL;
    public final InterfaceC383701eN LLJLILLLLZIIL;
    public boolean LLJLL;
    public C05YC<Unit> LLJLLIL;

    /* JADX WARN: Type inference failed for: r0v26, types: [X.0EYA] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EXU.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0EXU.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0), new C2217381BqS(C0EXU.class, "editorContext", "getEditorContext()Lcom/ss/ugc/android/editor/core/EditorContextApi;", 0), new C2217381BqS(C0EXU.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0), new C2217381BqS(C0EXU.class, "epInitLegacyApi", "getEpInitLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0), new C2217381BqS(C0EXU.class, "trackPanelApi", "getTrackPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0), new C2217381BqS(C0EXU.class, "editProSaveApi", "getEditProSaveApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new C2217381BqS(C0EXU.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0), new C2217381BqS(C0EXU.class, "editProAdapterApi", "getEditProAdapterApi()Lcom/ss/android/ugc/gamora/editorpro/infra/EditorProAdapterApiComponent;", 0), new C2217381BqS(C0EXU.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C0EXU.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C0EXU.class, "editToolbar", "getEditToolbar()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(C0EXU.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0)};
        LLJLLL = new Object() { // from class: X.0EYA
        };
        LLJZIJLIL = 8;
    }

    private final boolean B3() {
        return ((Boolean) this.LLJ.getValue()).booleanValue();
    }

    private final InterfaceC1455850nzL G2() {
        return (InterfaceC1455850nzL) this.LLJJJIL.getValue(this, LLJZ[12]);
    }

    private final C0EYP H2() {
        return (C0EYP) this.LLJJIJI.getValue(this, LLJZ[8]);
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJIJIIJIL.getValue(this, LLJZ[9]);
    }

    private final C0E5S O3() {
        return (C0E5S) this.LLJJ.getValue(this, LLJZ[5]);
    }

    private final void P4() {
        List<MultiEditVideoSegmentRecordData> list;
        C0EYB c0eyb = C0EXW.LLJ;
        VideoPublishEditModel videoPublishEditModelV3 = v3();
        c0eyb.getClass();
        int videoLength = videoPublishEditModelV3.getVideoLength();
        MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModelV3.getCurMultiEditVideoRecordData();
        Pair pair = new Pair(Integer.valueOf(videoLength), Integer.valueOf((curMultiEditVideoRecordData == null || (list = curMultiEditVideoRecordData.segmentDataList) == null) ? videoPublishEditModelV3.getEditorProModel().getPipResourcePaths().size() : list.size()));
        this.LLJJL = new C0EYC(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
    }

    private final InterfaceC377540ErA T2() {
        return (InterfaceC377540ErA) this.LLJJI.getValue(this, LLJZ[6]);
    }

    private final InterfaceC1460000o62 W2() {
        return (InterfaceC1460000o62) this.LLJJJ.getValue(this, LLJZ[11]);
    }

    private final DialogC1389620mGW X1() {
        Context contextLIZIZ = C545820Lau.LIZIZ(this.LLILLJJLI);
        if (contextLIZIZ == null) {
            return null;
        }
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(contextLIZIZ);
        dialogC1389620mGW.LJJLL(false);
        dialogC1389620mGW.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0EXz
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return true;
            }
        });
        return dialogC1389620mGW;
    }

    private final C0EC7 i3() {
        return (C0EC7) this.LLJILLL.getValue(this, LLJZ[4]);
    }

    private final InterfaceC359950E9h q3() {
        return (InterfaceC359950E9h) this.LLJIJIL.getValue(this, LLJZ[1]);
    }

    private final C0EGY w2() {
        return (C0EGY) this.LLJJIII.getValue(this, LLJZ[7]);
    }

    public final void F4() {
        LifecycleOwnerExtensionsKt.LIZ(this, new ARunnableS105S0100000_5(this, 68));
    }

    public final C0EOK H3() {
        return (C0EOK) this.LLJILJILJ.getValue(this, LLJZ[3]);
    }

    public final boolean Q3() {
        return ((Boolean) this.LLIZLLLIL.getValue()).booleanValue();
    }

    public final void T4() {
        C09AE c09ae = this.LLJLIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLJLIL = C23250099c.LIZLLL(this.LLILZIL, null, null, new C23185096p(this, null), 3);
    }

    public final void Z4() {
        if (this.LLJJJJ == null) {
            this.LLJJJJ = new InterfaceC350420DoW() { // from class: X.0EY5
                @Override // X.InterfaceC350420DoW
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC350420DoW
                public final void LIZ() {
                    this.LIZ.F4();
                }
            };
        }
        if (this.LLJJJJJIL == null) {
            this.LLJJJJJIL = new C361650EFv() { // from class: X.0EXy
                @Override // X.InterfaceC357170DzP
                public final void LIZIZ(EnumC357140DzM enumC357140DzM, boolean z) {
                    this.LIZ.F4();
                }
            };
        }
        InterfaceC350420DoW interfaceC350420DoW = this.LLJJJJ;
        if (interfaceC350420DoW != null) {
            C350440DoY.LIZIZ = interfaceC350420DoW;
        }
        InterfaceC357170DzP interfaceC357170DzP = this.LLJJJJJIL;
        if (interfaceC357170DzP != null) {
            c3().Bo().LJ(interfaceC357170DzP);
        }
        P4();
    }

    public final InterfaceC357200DzS c3() {
        return (InterfaceC357200DzS) this.LLJILJIL.getValue(this, LLJZ[2]);
    }

    public final void d5() {
        if (this.LLJJJJ != null) {
            C350440DoY.LIZIZ = null;
        }
        if (this.LLJJJJJIL != null) {
            c3().Bo().LJ(null);
        }
    }

    public final C0EY2 m3() {
        return (C0EY2) this.LLJI.getValue(this, LLJZ[0]);
    }

    public final VideoPublishEditModel v3() {
        return (VideoPublishEditModel) this.LLJJIJIL.getValue(this, LLJZ[10]);
    }

    @Override // X.InterfaceC366350EXx
    public void yI() {
        C0EYE c0eye = this.LLJJLIIIJLLLLLLLZ;
        if (c0eye == null) {
            return;
        }
        o4(c0eye);
    }

    private final InterfaceC391240FVq E3() {
        return G2().Nr0().LIZJ();
    }

    private final void O4() {
        List<C0FTJ<StickerModel>> listLLLLLZ;
        List<StickerModel> listS32;
        TextStickerModel textStickerModel;
        BaseStickerModel baseStickerModel;
        InterfaceC391240FVq interfaceC391240FVqE3 = E3();
        if (interfaceC391240FVqE3 != null && (listS32 = interfaceC391240FVqE3.s32()) != null) {
            for (StickerModel stickerModel : listS32) {
                if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && (baseStickerModel = textStickerModel.getBaseStickerModel()) != null) {
                    baseStickerModel.setEnableNLEChange(true);
                }
            }
        }
        InterfaceC391240FVq interfaceC391240FVqE32 = E3();
        if (interfaceC391240FVqE32 == null || (listLLLLLZ = interfaceC391240FVqE32.LLLLLZ(EnumC1466150oFx.TEXT)) == null) {
            return;
        }
        Iterator<C0FTJ<StickerModel>> it2 = listLLLLLZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIIJZLJL().setEnableNLEChange(true);
        }
    }

    public final void H4() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C0EXK(getDiContainer()));
        linkedHashSet.add(new C366040EWs(getDiContainer()));
        linkedHashSet.add(new InterfaceC366210EXj() { // from class: X.0EWr
            public final C0EX2 LL = C0EX2.PIP_TRACK;

            @Override // X.InterfaceC366210EXj
            public final void LIZ() {
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJFF() {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final C0EX2 getTaskType() {
                return this.LL;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LIZJ(NLETrack nLETrack) {
                return C351220Dpo.LLLIIL(nLETrack);
            }

            public static void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
                String resourceFile;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                VecNLETrackSPtr tracks = nLEModel.getTracks();
                ArrayList arrayList3 = new ArrayList();
                for (NLETrack nLETrack : tracks) {
                    NLETrack nLETrack2 = nLETrack;
                    if (!nLETrack2.getMainTrack() && nLETrack2.hasExtra("track_extra_pip") && Intrinsics.LJFF(nLETrack2.getExtra("track_extra_pip"), "true")) {
                        arrayList3.add(nLETrack);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    for (NLETrackSlot nLETrackSlot : ((NLETrack) it2.next()).getSlots()) {
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                        if (nLESegmentVideoDynamicCast != null) {
                            NLEResourceAV aVFile = nLESegmentVideoDynamicCast.getAVFile();
                            if (aVFile == null || (resourceFile = aVFile.getResourceFile()) == null) {
                                resourceFile = "";
                            }
                            arrayList.add(resourceFile);
                            arrayList2.add(nLETrackSlot.getUUID());
                        }
                    }
                }
                videoPublishEditModel.getEditorProModel().setPipResourcePaths(arrayList);
                videoPublishEditModel.getEditorProModel().setPipSlotUuidList(arrayList2);
                videoPublishEditModel.getEditorProModel().setPipUsed(!arrayList.isEmpty());
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
                boolean z;
                VecNLETrackSPtr tracks = c0ey3.LIZ.getTracks();
                if ((tracks instanceof Collection) && tracks.isEmpty()) {
                    z = false;
                } else {
                    Iterator<NLETrack> it2 = tracks.iterator();
                    while (it2.hasNext()) {
                        if (C351220Dpo.LLLIIL(it2.next())) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                }
                if (c0ey3.LIZIZ.getEditorProModel().isPipUsed() != z) {
                    LJIIIIZZ(c0ey3.LIZIZ, c0ey3.LIZ);
                }
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
                LJIIIIZZ(c0ey3.LIZIZ, c0ey3.LIZ);
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
                return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
            }
        });
        linkedHashSet.add(new InterfaceC366210EXj() { // from class: X.0EWw
            public final C0EX2 LL = C0EX2.VIDEO_MASK;
            public final boolean LLILLJJLI = true;

            @Override // X.InterfaceC366210EXj
            public final void LIZ() {
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LIZJ(NLETrack nLETrack) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJFF() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC366210EXj
            public final C0EX2 getTaskType() {
                return this.LL;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                if (nLETrackSlot.getMasks() == null || !(!r0.isEmpty())) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
            @Override // X.InterfaceC366210EXj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJI(X.C0EXH r7, X.C0EY3 r8, X.C366230EXl r9) {
                /*
                    r6 = this;
                    X.0EXG r0 = r7.LIZLLL
                    if (r0 == 0) goto L80
                    java.util.List<com.bytedance.ies.nle.editor_jni.NLETrackSlot> r0 = r0.LIZIZ
                    if (r0 == 0) goto L80
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    java.util.Iterator r1 = r0.iterator()
                L11:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L29
                    java.lang.Object r0 = r1.next()
                    com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
                    com.bytedance.ies.nle.editor_jni.VecNLEMaskSPtr r0 = r0.getMasks()
                    if (r0 != 0) goto L25
                    X.13BV r0 = X.C13BV.INSTANCE
                L25:
                    X.C19719612Di.LJJI(r0, r3)
                    goto L11
                L29:
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r1 = r3.iterator()
                L32:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L50
                    java.lang.Object r0 = r1.next()
                    com.bytedance.ies.nle.editor_jni.NLEMask r0 = (com.bytedance.ies.nle.editor_jni.NLEMask) r0
                    if (r0 == 0) goto L32
                    com.bytedance.ies.nle.editor_jni.NLESegmentMask r0 = r0.getSegment()
                    if (r0 == 0) goto L32
                    com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r0.getEffectSDKMask()
                    if (r0 == 0) goto L32
                    r2.add(r0)
                    goto L32
                L50:
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r0 = 10
                    int r0 = X.C15438062q.LJIJJ(r2, r0)
                    r5.<init>(r0)
                    java.util.Iterator r4 = r2.iterator()
                L5f:
                    boolean r0 = r4.hasNext()
                    if (r0 == 0) goto L86
                    java.lang.Object r0 = r4.next()
                    com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = (com.bytedance.ies.nle.editor_jni.NLEResourceNode) r0
                    com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo r3 = new com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo
                    java.lang.String r2 = r0.getResourceId()
                    java.lang.String r1 = r0.getResourceName()
                    java.lang.String r0 = r0.getResourceFile()
                    r3.<init>(r2, r1, r0)
                    r5.add(r3)
                    goto L5f
                L80:
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    goto L91
                L86:
                    java.util.Set r0 = X.C13LP.LLIIJI(r5)
                    if (r0 == 0) goto L80
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>(r0)
                L91:
                    com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.LIZIZ
                    com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r0 = r0.getEditorProModel()
                    r0.setMaskEffects(r1)
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C366080EWw.LJI(X.0EXH, X.0EY3, X.0EXl):java.lang.Object");
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
                return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
            }
        });
        linkedHashSet.add(new InterfaceC366210EXj() { // from class: X.0EXB
            public final C0EX2 LL = C0EX2.RECORD_AUDIO;
            public boolean LLILLJJLI;

            @Override // X.InterfaceC366210EXj
            public final boolean LJFF() {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final void LIZ() {
                if (C301670Bs5.LIZ()) {
                    this.LLILLJJLI = true;
                }
            }

            @Override // X.InterfaceC366210EXj
            public final C0EX2 getTaskType() {
                return this.LL;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LIZJ(NLETrack nLETrack) {
                NLETrackType trackType = nLETrack.getTrackType();
                NLETrackType nLETrackType = NLETrackType.AUDIO;
                if (trackType != nLETrackType || !Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "AUDIO_RECORD")) {
                    if (nLETrack.getTrackType() == nLETrackType && Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "DUB")) {
                        return true;
                    }
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
                boolean z = this.LLILLJJLI;
                this.LLILLJJLI = false;
                C347140DjE.LIZ(c0ey3.LIZ, c0ey3.LIZIZ, null);
                C350150Do5.LIZ(c0ey3.LIZ, z);
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
                this.LLILLJJLI = true;
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
                return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
            }
        });
        linkedHashSet.add(new InterfaceC366210EXj() { // from class: X.0EWu
            public final C0EX2 LL = C0EX2.VIDEO_CUTOUT_STROKE;
            public final boolean LLILLJJLI = true;

            @Override // X.InterfaceC366210EXj
            public final void LIZ() {
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LIZJ(NLETrack nLETrack) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJFF() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC366210EXj
            public final C0EX2 getTaskType() {
                return this.LL;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                if (C351220Dpo.LLD(nLETrackSlot)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
            @Override // X.InterfaceC366210EXj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJI(X.C0EXH r7, X.C0EY3 r8, X.C366230EXl r9) {
                /*
                    r6 = this;
                    X.0EXG r0 = r7.LIZLLL
                    if (r0 == 0) goto L77
                    java.util.List<com.bytedance.ies.nle.editor_jni.NLETrackSlot> r0 = r0.LIZIZ
                    if (r0 == 0) goto L77
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    java.util.Iterator r2 = r0.iterator()
                L11:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L47
                    java.lang.Object r0 = r2.next()
                    com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
                    com.bytedance.ies.nle.editor_jni.NLEAIMatting r1 = r0.getAIMatting()
                    r0 = 0
                    if (r1 == 0) goto L28
                    com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting r0 = r1.getSegment()
                L28:
                    com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting r0 = com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting.dynamicCast(r0)
                    if (r0 == 0) goto L11
                    com.bytedance.ies.nle.editor_jni.VecNLEMattingStroke r1 = r0.getStrokes()
                    if (r1 == 0) goto L11
                    r0 = 0
                    java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
                    com.bytedance.ies.nle.editor_jni.NLEMattingStroke r0 = (com.bytedance.ies.nle.editor_jni.NLEMattingStroke) r0
                    if (r0 == 0) goto L11
                    com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r0.getStroke()
                    if (r0 == 0) goto L11
                    r3.add(r0)
                    goto L11
                L47:
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r0 = 10
                    int r0 = X.C15438062q.LJIJJ(r3, r0)
                    r5.<init>(r0)
                    java.util.Iterator r4 = r3.iterator()
                L56:
                    boolean r0 = r4.hasNext()
                    if (r0 == 0) goto L7d
                    java.lang.Object r0 = r4.next()
                    com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = (com.bytedance.ies.nle.editor_jni.NLEResourceNode) r0
                    com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo r3 = new com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo
                    java.lang.String r2 = r0.getResourceId()
                    java.lang.String r1 = r0.getResourceName()
                    java.lang.String r0 = r0.getResourceFile()
                    r3.<init>(r2, r1, r0)
                    r5.add(r3)
                    goto L56
                L77:
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    goto L88
                L7d:
                    java.util.Set r0 = X.C13LP.LLIIJI(r5)
                    if (r0 == 0) goto L77
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>(r0)
                L88:
                    com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.LIZIZ
                    com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r0 = r0.getEditorProModel()
                    r0.setCutoutStrokeEffects(r1)
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C366060EWu.LJI(X.0EXH, X.0EY3, X.0EXl):java.lang.Object");
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
                return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
            }
        });
        linkedHashSet.add(new InterfaceC366210EXj() { // from class: X.0EX3
            public final C0EX2 LL = C0EX2.VIDEO_CUTOUT_BLEND;
            public final boolean LLILLJJLI = true;

            @Override // X.InterfaceC366210EXj
            public final void LIZ() {
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LIZJ(NLETrack nLETrack) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJFF() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC366210EXj
            public final C0EX2 getTaskType() {
                return this.LL;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                if (nLETrackSlot.getAIMatting() == null) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
                EditorProEffectInfo editorProEffectInfo;
                List<NLETrackSlot> list;
                NLESegmentAIMatting segment;
                NLEResourceNode blendMask;
                List<NLETrackSlot> list2;
                NLESegmentAIMatting segment2;
                NLEResourceNode blendCutout;
                C0EXG c0exg = c0exh.LIZLLL;
                EditorProEffectInfo editorProEffectInfo2 = null;
                if (c0exg != null && (list2 = c0exg.LIZIZ) != null) {
                    Iterator<NLETrackSlot> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        NLEAIMatting aIMatting = it2.next().getAIMatting();
                        if (aIMatting != null) {
                            segment2 = aIMatting.getSegment();
                        } else {
                            segment2 = null;
                        }
                        NLESegmentAIMatting nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(segment2);
                        if (nLESegmentAIMattingDynamicCast != null && (blendCutout = nLESegmentAIMattingDynamicCast.getBlendCutout()) != null) {
                            editorProEffectInfo = new EditorProEffectInfo(blendCutout.getResourceId(), blendCutout.getResourceName(), blendCutout.getResourceFile());
                            break;
                        }
                    }
                    editorProEffectInfo = null;
                } else {
                    editorProEffectInfo = null;
                }
                C0EXG c0exg2 = c0exh.LIZLLL;
                if (c0exg2 != null && (list = c0exg2.LIZIZ) != null) {
                    Iterator<NLETrackSlot> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        NLEAIMatting aIMatting2 = it3.next().getAIMatting();
                        if (aIMatting2 != null) {
                            segment = aIMatting2.getSegment();
                        } else {
                            segment = null;
                        }
                        NLESegmentAIMatting nLESegmentAIMattingDynamicCast2 = NLESegmentAIMatting.dynamicCast(segment);
                        if (nLESegmentAIMattingDynamicCast2 != null && (blendMask = nLESegmentAIMattingDynamicCast2.getBlendMask()) != null) {
                            editorProEffectInfo2 = new EditorProEffectInfo(blendMask.getResourceId(), blendMask.getResourceName(), blendMask.getResourceFile());
                            break;
                        }
                    }
                }
                c0ey3.LIZIZ.getEditorProModel().setBlendCutoutEffect(editorProEffectInfo);
                c0ey3.LIZIZ.getEditorProModel().setBlendMaskEffect(editorProEffectInfo2);
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
                return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
            }
        });
        linkedHashSet.add(new InterfaceC366210EXj() { // from class: X.0EWx
            public final C0EX2 LL = C0EX2.CHROMA;
            public final boolean LLILLJJLI = true;

            @Override // X.InterfaceC366210EXj
            public final void LIZ() {
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LIZJ(NLETrack nLETrack) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJFF() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC366210EXj
            public final C0EX2 getTaskType() {
                return this.LL;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                if (nLETrackSlot.getChromaChannels() != null && (!r0.isEmpty())) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
            @Override // X.InterfaceC366210EXj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJI(X.C0EXH r8, X.C0EY3 r9, X.C366230EXl r10) {
                /*
                    r7 = this;
                    X.0EXG r0 = r8.LIZLLL
                    if (r0 == 0) goto L92
                    java.util.List<com.bytedance.ies.nle.editor_jni.NLETrackSlot> r0 = r0.LIZIZ
                    if (r0 == 0) goto L92
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    java.util.Iterator r1 = r0.iterator()
                L11:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L29
                    java.lang.Object r0 = r1.next()
                    com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
                    com.bytedance.ies.nle.editor_jni.VecNLEChromaChannelSPtr r0 = r0.getChromaChannels()
                    if (r0 != 0) goto L25
                    X.13BV r0 = X.C13BV.INSTANCE
                L25:
                    X.C19719612Di.LJJI(r0, r3)
                    goto L11
                L29:
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r1 = r3.iterator()
                L32:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L50
                    java.lang.Object r0 = r1.next()
                    com.bytedance.ies.nle.editor_jni.NLEChromaChannel r0 = (com.bytedance.ies.nle.editor_jni.NLEChromaChannel) r0
                    if (r0 == 0) goto L32
                    com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel r0 = r0.getSegment()
                    if (r0 == 0) goto L32
                    com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r0.getEffectSDKChroma()
                    if (r0 == 0) goto L32
                    r2.add(r0)
                    goto L32
                L50:
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>()
                    java.util.Iterator r5 = r2.iterator()
                L59:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto L98
                    java.lang.Object r4 = r5.next()
                    com.bytedance.ies.nle.editor_jni.NLEResourceNode r4 = (com.bytedance.ies.nle.editor_jni.NLEResourceNode) r4
                    java.lang.String r0 = r4.getResourceId()
                    if (r0 == 0) goto L59
                    int r0 = r0.length()
                    if (r0 == 0) goto L59
                    java.lang.String r0 = r4.getResourceFile()
                    if (r0 == 0) goto L59
                    int r0 = r0.length()
                    if (r0 == 0) goto L59
                    com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo r3 = new com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo
                    java.lang.String r2 = r4.getResourceId()
                    java.lang.String r1 = r4.getResourceName()
                    java.lang.String r0 = r4.getResourceFile()
                    r3.<init>(r2, r1, r0)
                    r6.add(r3)
                    goto L59
                L92:
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    goto La3
                L98:
                    java.util.Set r0 = X.C13LP.LLIIJI(r6)
                    if (r0 == 0) goto L92
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>(r0)
                La3:
                    com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.LIZIZ
                    com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r0 = r0.getEditorProModel()
                    r0.setChromaEffects(r1)
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C366090EWx.LJI(X.0EXH, X.0EY3, X.0EXl):java.lang.Object");
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
                return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
            }
        });
        linkedHashSet.add(new C0EXV(getDiContainer()));
        linkedHashSet.add(new InterfaceC366210EXj() { // from class: X.0EWq
            public final C0EX2 LL = C0EX2.ADJUST_FILTER;

            @Override // X.InterfaceC366210EXj
            public final void LIZ() {
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJFF() {
                return true;
            }

            @Override // X.InterfaceC366210EXj
            public final C0EX2 getTaskType() {
                return this.LL;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LIZJ(NLETrack nLETrack) {
                return C351220Dpo.LLIILII(nLETrack);
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
                if (!(filters instanceof Collection) || !filters.isEmpty()) {
                    Iterator<NLEFilter> it2 = filters.iterator();
                    while (it2.hasNext()) {
                        if (C351220Dpo.LLIIL(it2.next())) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0010 A[PHI: r0
              0x0010: PHI (r0v33 java.util.List) = (r0v0 java.util.List), (r0v34 java.util.List) binds: [B:7:0x000a, B:9:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x000c A[PHI: r0
              0x000c: PHI (r0v34 java.util.List) = (r0v0 java.util.List), (r0v35 java.util.List) binds: [B:7:0x000a, B:5:0x0006] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC366210EXj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJI(X.C0EXH r7, X.C0EY3 r8, X.C366230EXl r9) {
                /*
                    Method dump skipped, instruction units count: 236
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C366020EWq.LJI(X.0EXH, X.0EY3, X.0EXl):java.lang.Object");
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
                return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
            }
        });
        linkedHashSet.add(new InterfaceC366210EXj() { // from class: X.0EWp
            public final C0EX2 LL = C0EX2.VIDEO_ANIM;

            @Override // X.InterfaceC366210EXj
            public final void LIZ() {
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LIZJ(NLETrack nLETrack) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJFF() {
                return true;
            }

            @Override // X.InterfaceC366210EXj
            public final C0EX2 getTaskType() {
                return this.LL;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                return !nLETrackSlot.getVideoAnims().isEmpty();
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
                List<NLETrackSlot> list;
                NLEResourceNode effectSDKVideoAnimation;
                NLEResType resourceType;
                String str;
                NLEResourceNode effectSDKVideoAnimation2;
                String resourceId;
                NLEResourceNode effectSDKVideoAnimation3;
                String resourceFile;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                C0EXG c0exg = c0exh.LIZLLL;
                if (c0exg != null && (list = c0exg.LIZIZ) != null) {
                    Iterator<NLETrackSlot> it2 = list.iterator();
                    while (it2.hasNext()) {
                        for (NLEVideoAnimation nLEVideoAnimation : it2.next().getVideoAnims()) {
                            arrayList3.add(C2286608xc.LJFF(nLEVideoAnimation.getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                            NLESegmentVideoAnimation segment = nLEVideoAnimation.getSegment();
                            if (segment != null && (effectSDKVideoAnimation3 = segment.getEffectSDKVideoAnimation()) != null && (resourceFile = effectSDKVideoAnimation3.getResourceFile()) != null) {
                                Boolean.valueOf(arrayList.add(resourceFile));
                            }
                            NLESegmentVideoAnimation segment2 = nLEVideoAnimation.getSegment();
                            if (segment2 != null && (effectSDKVideoAnimation2 = segment2.getEffectSDKVideoAnimation()) != null && (resourceId = effectSDKVideoAnimation2.getResourceId()) != null) {
                                Boolean.valueOf(arrayList2.add(resourceId));
                            }
                            NLESegmentVideoAnimation segment3 = nLEVideoAnimation.getSegment();
                            if (segment3 != null && (effectSDKVideoAnimation = segment3.getEffectSDKVideoAnimation()) != null && (resourceType = effectSDKVideoAnimation.getResourceType()) != null) {
                                int i = C348610Dlb.LIZ[resourceType.ordinal()];
                                if (i != 1) {
                                    if (i != 2) {
                                        str = "video_anim_combo";
                                    } else {
                                        str = "video_anim_out";
                                    }
                                } else {
                                    str = "video_anim_in";
                                }
                                arrayList4.add(str);
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                int i2 = 0;
                for (Object obj : arrayList4) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        sb.append((String) obj);
                        if (i2 != arrayList4.size() - 1) {
                            sb.append(",");
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                EditorProModel editorProModel = c0ey3.LIZIZ.getEditorProModel();
                editorProModel.setVideoAnimResourcePaths(arrayList);
                editorProModel.setVideoAnimEffectIds(arrayList2);
                editorProModel.setVideoAnimDurationList(arrayList3);
                editorProModel.setVideoAnimSelectionListStr(sb.toString());
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
                return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
            }
        });
        linkedHashSet.add(new InterfaceC366210EXj() { // from class: X.0EX0
            public final C0EX2 LL = C0EX2.VIDEO_BG;

            @Override // X.InterfaceC366210EXj
            public final void LIZ() {
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LIZJ(NLETrack nLETrack) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJFF() {
                return true;
            }

            @Override // X.InterfaceC366210EXj
            public final C0EX2 getTaskType() {
                return this.LL;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                NLECanvasType type;
                NLEStyCanvas canvasStyle;
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                if (nLESegmentVideoDynamicCast != null && (canvasStyle = nLESegmentVideoDynamicCast.getCanvasStyle()) != null) {
                    type = canvasStyle.getType();
                } else {
                    type = null;
                }
                if (type == NLECanvasType.IMAGE) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
                List<NLETrackSlot> list;
                NLEStyCanvas canvasStyle;
                NLEResourceNode image;
                ArrayList arrayList = new ArrayList();
                C0EXG c0exg = c0exh.LIZLLL;
                if (c0exg != null && (list = c0exg.LIZIZ) != null) {
                    Iterator<NLETrackSlot> it2 = list.iterator();
                    while (it2.hasNext()) {
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) it2.next().getMainSegment());
                        if (nLESegmentVideoDynamicCast != null && (canvasStyle = nLESegmentVideoDynamicCast.getCanvasStyle()) != null && (image = canvasStyle.getImage()) != null) {
                            arrayList.add(new EditVideoSegment(image.getResourceFile(), null, C571500MbE.LJIIJ(image.getResourceFile()), 2, null));
                        }
                    }
                }
                c0ey3.LIZIZ.getEditorProModel().setVideoBgSegments(arrayList);
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
                return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
            }
        });
        linkedHashSet.add(new InterfaceC366210EXj() { // from class: X.0EWo
            public final C0EX2 LL = C0EX2.MAGIC_DATA;
            public final boolean LLILLJJLI = true;

            @Override // X.InterfaceC366210EXj
            public final void LIZ() {
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LIZJ(NLETrack nLETrack) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJFF() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC366210EXj
            public final C0EX2 getTaskType() {
                return this.LL;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                C351510DqH.LIZ.getClass();
                if (C351510DqH.LJJIL(nLETrackSlot)) {
                    return true;
                }
                VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
                if (!(videoEffects instanceof Collection) || !videoEffects.isEmpty()) {
                    for (NLEVideoEffect nLEVideoEffect : videoEffects) {
                        C351510DqH.LIZ.getClass();
                        if (C351510DqH.LJJIJIL(nLEVideoEffect)) {
                            return true;
                        }
                    }
                }
                VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
                if (!(filters instanceof Collection) || !filters.isEmpty()) {
                    for (NLEFilter nLEFilter : filters) {
                        C351510DqH.LIZ.getClass();
                        if (C351510DqH.LJJIJL(nLEFilter)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
                List<NLETrackSlot> list;
                NLESegmentFilter segment;
                NLEResourceNode effectSDKFilter;
                String resourceFile;
                String extra;
                String jsonParam;
                NLEResourceNode effectSDKEffect;
                String resourceFile2;
                String extra2;
                NLESegment mainSegment;
                NLERenderProxySegment nLERenderProxySegmentDynamicCast;
                NLEResourceNode renderConfigRes;
                C0EXG c0exg = c0exh.LIZLLL;
                if (c0exg == null || (list = c0exg.LIZIZ) == null) {
                    list = C13BV.INSTANCE;
                }
                List<String> magicResourcePaths = c0ey3.LIZIZ.getEditorProModel().getMagicResourcePaths();
                List<String> magicVideoPaths = c0ey3.LIZIZ.getEditorProModel().getMagicVideoPaths();
                List<String> magicEffectResourcePaths = c0ey3.LIZIZ.getEditorProModel().getMagicEffectResourcePaths();
                List<String> magicCombineEffectAlgoCachePaths = c0ey3.LIZIZ.getEditorProModel().getMagicCombineEffectAlgoCachePaths();
                magicResourcePaths.clear();
                magicVideoPaths.clear();
                magicEffectResourcePaths.clear();
                magicCombineEffectAlgoCachePaths.clear();
                MagicCombineEffectModel magicCombineEffectModel = c0ey3.LIZIZ.creativeModel.magicCombineEffectModel;
                C363500EMy.LIZ.getClass();
                C362740EKa.LIZ.getClass();
                C362740EKa.LIZ(magicCombineEffectModel, list);
                for (NLETrackSlot nLETrackSlot : list) {
                    C351510DqH.LIZ.getClass();
                    if (C351510DqH.LJJIL(nLETrackSlot) && C351510DqH.LJJIJLIJ(nLETrackSlot.getRenderProxy())) {
                        NLEResourceAV nLEResourceAVLJJIIJZLJL = C351510DqH.LJJIIJZLJL(nLETrackSlot);
                        if (nLEResourceAVLJJIIJZLJL != null && !TextUtils.isEmpty(nLEResourceAVLJJIIJZLJL.getResourceFile())) {
                            C354260Dui c354260Dui = C354260Dui.LIZ;
                            NLETrackSlot renderProxy = nLETrackSlot.getRenderProxy();
                            c354260Dui.getClass();
                            if (renderProxy == null || !Boolean.parseBoolean(renderProxy.getExtra("ep_replaced_i2i_magic_by_render_proxy"))) {
                                magicVideoPaths.add(nLEResourceAVLJJIIJZLJL.getResourceFile());
                            }
                        }
                        NLETrackSlot renderProxy2 = nLETrackSlot.getRenderProxy();
                        if (renderProxy2 != null && (mainSegment = renderProxy2.getMainSegment()) != null && (nLERenderProxySegmentDynamicCast = NLERenderProxySegment.dynamicCast(mainSegment)) != null && (renderConfigRes = nLERenderProxySegmentDynamicCast.getRenderConfigRes()) != null && !TextUtils.isEmpty(renderConfigRes.getResourceFile())) {
                            magicResourcePaths.add(renderConfigRes.getResourceFile());
                        }
                    }
                    Iterator<NLEVideoEffect> it2 = nLETrackSlot.getVideoEffects().iterator();
                    while (true) {
                        String str = "";
                        if (!it2.hasNext()) {
                            break;
                        }
                        NLEVideoEffect next = it2.next();
                        C351510DqH.LIZ.getClass();
                        if (C351510DqH.LJJIJIL(next)) {
                            NLESegmentEffect segment2 = next.getSegment();
                            if (segment2 != null && (effectSDKEffect = segment2.getEffectSDKEffect()) != null && (resourceFile2 = effectSDKEffect.getResourceFile()) != null && !TextUtils.isEmpty(resourceFile2)) {
                                magicEffectResourcePaths.add(resourceFile2);
                                if (next.hasExtra("ep_client_magic_resource_path") && (extra2 = next.getExtra("ep_client_magic_resource_path")) != null) {
                                    str = extra2;
                                }
                                if (!TextUtils.isEmpty(str)) {
                                    magicResourcePaths.add(str);
                                }
                            }
                            NLESegmentEffect segment3 = next.getSegment();
                            if (segment3 != null && (jsonParam = segment3.getJsonParam()) != null && !TextUtils.isEmpty(jsonParam)) {
                                String strOptString = new JSONObject(jsonParam).optString("editing_effect_algorithm_cache_url");
                                if (!TextUtils.isEmpty(strOptString)) {
                                    magicCombineEffectAlgoCachePaths.add(strOptString);
                                }
                            }
                        }
                    }
                    for (NLEFilter nLEFilter : nLETrackSlot.getFilters()) {
                        C351510DqH.LIZ.getClass();
                        if (C351510DqH.LJJIJL(nLEFilter) && (segment = nLEFilter.getSegment()) != null && (effectSDKFilter = segment.getEffectSDKFilter()) != null && (resourceFile = effectSDKFilter.getResourceFile()) != null && !TextUtils.isEmpty(resourceFile)) {
                            magicEffectResourcePaths.add(resourceFile);
                            if (!nLEFilter.hasExtra("ep_client_magic_resource_path") || (extra = nLEFilter.getExtra("ep_client_magic_resource_path")) == null) {
                                extra = "";
                            }
                            if (!TextUtils.isEmpty(extra)) {
                                magicResourcePaths.add(extra);
                            }
                        }
                    }
                }
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
                return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
            }
        });
        linkedHashSet.add(new InterfaceC366210EXj() { // from class: X.0EWy
            public final C0EX2 LL = C0EX2.RETOUCH;

            @Override // X.InterfaceC366210EXj
            public final void LIZ() {
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LIZJ(NLETrack nLETrack) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJFF() {
                return true;
            }

            @Override // X.InterfaceC366210EXj
            public final C0EX2 getTaskType() {
                return this.LL;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
                if (!(filters instanceof Collection) || !filters.isEmpty()) {
                    Iterator<NLEFilter> it2 = filters.iterator();
                    while (it2.hasNext()) {
                        if (C351220Dpo.LLILZIL(it2.next())) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
                List list;
                C0EXG c0exg = c0exh.LIZLLL;
                if (c0exg == null || (list = c0exg.LIZIZ) == null) {
                    list = C13BV.INSTANCE;
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    List<C351410Dq7> listLJIIJ = C351220Dpo.LJIIJ((NLETrackSlot) it2.next());
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJ, 10));
                    Iterator it3 = ((ArrayList) listLJIIJ).iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((C351410Dq7) it3.next()).LIZ.LIZ);
                    }
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        linkedHashSet2.add(it4.next());
                    }
                }
                c0ey3.LIZIZ.getEditorProModel().setRetouchResPathList(new ArrayList(linkedHashSet2));
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
                return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
            }
        });
        linkedHashSet.add(new InterfaceC366210EXj() { // from class: X.0EXA
            public final C0EX2 LL = C0EX2.REVERSE;

            @Override // X.InterfaceC366210EXj
            public final void LIZ() {
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LIZJ(NLETrack nLETrack) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJFF() {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final C0EX2 getTaskType() {
                return this.LL;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                String strLJJLIIIJJI;
                NLESegment mainSegment = nLETrackSlot.getMainSegment();
                if (mainSegment == null || (strLJJLIIIJJI = C351220Dpo.LJJLIIIJJI(mainSegment)) == null || strLJJLIIIJJI.length() <= 0) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
                List<NLETrackSlot> list;
                String strLJJLIIIJJI;
                List<C0EXF> list2;
                String strLJJLIIIJJI2;
                String strLJJLIIIJJI3;
                List<NLETrackSlot> list3;
                String strLJJLIIIJJI4;
                ArrayList arrayList = new ArrayList(c0ey3.LIZIZ.getEditorProModel().getReverseOriginPaths());
                C0EXG c0exg = c0exh.LIZ;
                if (c0exg != null && (list3 = c0exg.LIZIZ) != null) {
                    Iterator<NLETrackSlot> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        NLESegment mainSegment = it2.next().getMainSegment();
                        if (mainSegment == null || (strLJJLIIIJJI4 = C351220Dpo.LJJLIIIJJI(mainSegment)) == null) {
                            strLJJLIIIJJI4 = "";
                        }
                        if (strLJJLIIIJJI4.length() > 0) {
                            arrayList.add(strLJJLIIIJJI4);
                        }
                    }
                }
                C0EY1 c0ey1 = c0exh.LIZIZ;
                if (c0ey1 != null && (list2 = c0ey1.LIZIZ) != null) {
                    for (C0EXF c0exf : list2) {
                        NLESegment mainSegment2 = c0exf.LIZ.getSecond().getMainSegment();
                        if (mainSegment2 == null || (strLJJLIIIJJI2 = C351220Dpo.LJJLIIIJJI(mainSegment2)) == null) {
                            strLJJLIIIJJI2 = "";
                        }
                        NLESegment mainSegment3 = c0exf.LIZIZ.getSecond().getMainSegment();
                        if (mainSegment3 == null || (strLJJLIIIJJI3 = C351220Dpo.LJJLIIIJJI(mainSegment3)) == null) {
                            strLJJLIIIJJI3 = "";
                        }
                        if (!Intrinsics.LJFF(strLJJLIIIJJI2, strLJJLIIIJJI3)) {
                            if (strLJJLIIIJJI2.length() > 0) {
                                arrayList.remove(strLJJLIIIJJI2);
                            }
                            if (strLJJLIIIJJI3.length() > 0) {
                                arrayList.add(strLJJLIIIJJI3);
                            }
                        }
                    }
                }
                C0EXG c0exg2 = c0exh.LIZJ;
                if (c0exg2 != null && (list = c0exg2.LIZIZ) != null) {
                    Iterator<NLETrackSlot> it3 = list.iterator();
                    while (it3.hasNext()) {
                        NLESegment mainSegment4 = it3.next().getMainSegment();
                        if (mainSegment4 == null || (strLJJLIIIJJI = C351220Dpo.LJJLIIIJJI(mainSegment4)) == null) {
                            strLJJLIIIJJI = "";
                        }
                        if (strLJJLIIIJJI.length() > 0) {
                            arrayList.remove(strLJJLIIIJJI);
                        }
                    }
                }
                c0ey3.LIZIZ.getEditorProModel().setReverseOriginPaths(arrayList);
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
                return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
            }
        });
        linkedHashSet.add(new InterfaceC366210EXj() { // from class: X.0EX1
            public final C0EX2 LL = C0EX2.SOUND_EFFECT;

            @Override // X.InterfaceC366210EXj
            public final void LIZ() {
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJFF() {
                return true;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final C0EX2 getTaskType() {
                return this.LL;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LIZJ(NLETrack nLETrack) {
                return C351220Dpo.LLLILZLLLI(nLETrack);
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
                List list;
                C0EXG c0exg = c0exh.LIZLLL;
                if (c0exg == null || (list = c0exg.LIZ) == null) {
                    list = C13BV.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    VecNLETrackSlotSPtr sortedSlots = ((NLETrack) it2.next()).getSortedSlots();
                    if (sortedSlots != null) {
                        Iterator<NLETrackSlot> it3 = sortedSlots.iterator();
                        while (it3.hasNext()) {
                            SoundEffect soundEffectLIZIZ = C356680Dyc.LIZIZ(it3.next().getExtra("ep_audio_music_id"));
                            if (soundEffectLIZIZ != null) {
                                arrayList.add(soundEffectLIZIZ);
                            }
                        }
                    }
                }
                c0ey3.LIZIZ.creativeModel.soundEffectInfoModel.soundEffectList = arrayList;
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
                return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
            }
        });
        linkedHashSet.add(new InterfaceC366210EXj() { // from class: X.0EX5
            public final C0EX2 LL = C0EX2.TRANSITION;
            public final boolean LLILLJJLI = true;

            @Override // X.InterfaceC366210EXj
            public final void LIZ() {
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LIZJ(NLETrack nLETrack) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJFF() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC366210EXj
            public final C0EX2 getTaskType() {
                return this.LL;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                if (nLETrackSlot.getEndTransition() != null) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
                List<NLETrackSlot> list;
                String resourceFile;
                ArrayList arrayList = new ArrayList();
                C0EXG c0exg = c0exh.LIZLLL;
                if (c0exg != null && (list = c0exg.LIZIZ) != null) {
                    Iterator<NLETrackSlot> it2 = list.iterator();
                    while (it2.hasNext()) {
                        NLESegmentTransition endTransition = it2.next().getEndTransition();
                        if (endTransition != null) {
                            NLEResourceNode effectSDKTransition = endTransition.getEffectSDKTransition();
                            if (effectSDKTransition == null || (resourceFile = effectSDKTransition.getResourceFile()) == null) {
                                resourceFile = "";
                            }
                            if (!TextUtils.isEmpty(resourceFile)) {
                                arrayList.add(resourceFile);
                            }
                        }
                    }
                }
                c0ey3.LIZIZ.getEditorProModel().setTransitionResourcePaths(arrayList);
                return Unit.LIZ;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
                return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
            }
        });
        linkedHashSet.add(new C0EXT(getDiContainer()));
        linkedHashSet.add(new C0EXN(getDiContainer()));
        linkedHashSet.add(new C0EX7(getDiContainer(), new ArrayList(v3().creativeModel.stickerModel.textStickerModels)));
        linkedHashSet.add(new C366110EWz(getDiContainer()));
        linkedHashSet.add(new InterfaceC366210EXj() { // from class: X.0EWv
            public final C0EX2 LL = C0EX2.MATTING;

            @Override // X.InterfaceC366210EXj
            public final void LIZ() {
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LIZJ(NLETrack nLETrack) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
                return false;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJFF() {
                return true;
            }

            @Override // X.InterfaceC366210EXj
            public final C0EX2 getTaskType() {
                return this.LL;
            }

            @Override // X.InterfaceC366210EXj
            public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
                if (nLETrackSlot.getAIMatting() == null && !(!nLETrackSlot.getChromaChannels().isEmpty())) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:69:0x00e7  */
            @Override // X.InterfaceC366210EXj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJI(X.C0EXH r10, X.C0EY3 r11, X.C366230EXl r12) {
                /*
                    Method dump skipped, instruction units count: 256
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C366070EWv.LJI(X.0EXH, X.0EY3, X.0EXl):java.lang.Object");
            }

            @Override // X.InterfaceC366210EXj
            public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
                return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
            }
        });
        linkedHashSet.add(new C0EXC(getDiContainer()));
        linkedHashSet.add(new C0EX6(getDiContainer()));
        linkedHashSet.add(new C0EX4(getDiContainer()));
        linkedHashSet.add(new C0EXQ(getDiContainer()));
        linkedHashSet.add(new C366050EWt(getDiContainer()));
        linkedHashSet.add(new C0EXZ(getDiContainer()));
        this.LLILZ = linkedHashSet;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (Q3()) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerSyncTask cost: ");
            sbLIZ.append(jCurrentTimeMillis2);
            C201955140j.LIZLLL(c563650M8t, "EDADataSyncEngine", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void e4() {
        if (C301680Bs6.LIZ()) {
            C09AE c09ae = this.LLJL;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            this.LLJL = C23250099c.LIZLLL(this.LLILZIL, null, null, new C0EXX(this, null), 3);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Unit> liveEventDx0;
        LiveEvent<Unit> liveEventHy;
        LiveData<Boolean> liveDataQO0;
        super.onCreate();
        InterfaceC359950E9h interfaceC359950E9hQ3 = q3();
        if (interfaceC359950E9hQ3 != null && (liveDataQO0 = interfaceC359950E9hQ3.QO0()) != null) {
            liveDataQO0.observe(this, new AObjectS240S0100000_5(this, 123));
        }
        InterfaceC359950E9h interfaceC359950E9hQ32 = q3();
        if (interfaceC359950E9hQ32 != null && (liveEventHy = interfaceC359950E9hQ32.Hy()) != null) {
            liveEventHy.LIZ(this, new AObjectS240S0100000_5(this, 124));
        }
        InterfaceC359950E9h interfaceC359950E9hQ33 = q3();
        if (interfaceC359950E9hQ33 == null || (liveEventDx0 = interfaceC359950E9hQ33.Dx0()) == null) {
            return;
        }
        liveEventDx0.LIZ(this, new AObjectS240S0100000_5(this, 125));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        d5();
        C2296808zG.LIZJ(this.LLILZIL, null);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public InterfaceC366350EXx o2() {
        return this.LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o4(X.C0EYE r23) {
        /*
            r22 = this;
            r1 = r22
            X.0EY2 r0 = r1.m3()
            r4 = 0
            if (r0 == 0) goto L2c
            androidx.lifecycle.LiveData r0 = r0.zu2()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.getValue()
            X.0EHI r0 = (X.C0EHI) r0
            if (r0 == 0) goto L2c
            X.0ELJ r5 = r0.LJ
        L19:
            X.0DzS r0 = r1.c3()
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C350870DpF.LJI(r0)
            com.bytedance.ies.nle.editor_jni.NLENode r0 = r0.getStage()
            com.bytedance.ies.nle.editor_jni.NLEModel r19 = com.bytedance.ies.nle.editor_jni.NLEModel.dynamicCast(r0)
            if (r19 != 0) goto L2e
            return
        L2c:
            r5 = r4
            goto L19
        L2e:
            X.0EYB r10 = X.C0EXW.LLJ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r1.v3()
            r11 = r23
            boolean r3 = r11.LIZIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r1.v3()
            int r8 = r0.getVideoLength()
            X.0EYC r0 = r1.LLJJL
            if (r0 == 0) goto Lae
            int r6 = r0.LIZ
            int r2 = r0.LIZIZ
        L48:
            X.0EYP r7 = r1.H2()
            X.0nke r9 = r1.JY0()
            boolean r1 = r11.LIZ
            r10.getClass()
            X.0EMy r0 = X.C363500EMy.LIZ
            r0.getClass()
            boolean r0 = X.C363500EMy.LJIIIIZZ(r12)
            X.0o9N r7 = r7.lb2()
            if (r0 == 0) goto Lab
            if (r7 == 0) goto Lab
            X.0nMW r0 = X.C1431780nMW.LIZ
            r0.getClass()
            if (r9 == 0) goto La9
            androidx.lifecycle.LiveData r0 = r9.g()
            if (r0 == 0) goto La9
            java.lang.Object r0 = r0.getValue()
            X.0ntP r0 = (X.InterfaceC1452170ntP) r0
        L79:
            boolean r0 = X.C1431780nMW.LJFF(r12, r0, r7)
            if (r0 == 0) goto Lab
            java.lang.String r20 = "multi_photo"
        L81:
            X.0EYT r11 = new X.0EYT
            long r13 = (long) r8
            long r15 = (long) r6
            r21 = r1
            r18 = r3
            r17 = r2
            r11.<init>(r12, r13, r15, r17, r18, r19, r20, r21)
            if (r5 == 0) goto La7
            boolean r0 = r5.isFromAIPlaygroundLoadingPage()
            r3 = 1
            if (r0 != r3) goto La7
        L97:
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.0EYS r1 = new X.0EYS
            r1.<init>(r11, r3, r4)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r4, r4, r1, r0)
            return
        La7:
            r3 = 0
            goto L97
        La9:
            r0 = r4
            goto L79
        Lab:
            r20 = r4
            goto L81
        Lae:
            r6 = 0
            r2 = 0
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EXU.o4(X.0EYE):void");
    }

    private final void z4(C0EYE c0eye) {
        if (c0eye == null) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = c0eye;
        C363500EMy c363500EMy = C363500EMy.LIZ;
        VideoPublishEditModel videoPublishEditModelV3 = v3();
        c363500EMy.getClass();
        if (C363500EMy.LJIIJ(videoPublishEditModelV3)) {
            return;
        }
        o4(c0eye);
    }

    public final Object K4(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(c3()).getStage());
        if (nLEModelDynamicCast == null) {
            return Unit.LIZ;
        }
        NLEModel nLEModel = this.LLIZ;
        if (nLEModel == null) {
            return Unit.LIZ;
        }
        Object objK5 = k5(nLEModelDynamicCast, nLEModel, interfaceC1364105Vn);
        if (objK5 == C099R.LJFF()) {
            return objK5;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    @Override // X.InterfaceC366350EXx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object YE(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C366190EXh
            if (r0 == 0) goto L60
            r4 = r6
            X.0EXh r4 = (X.C366190EXh) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L53
            if (r0 != r1) goto L66
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0EYH r1 = X.C0EYH.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.v3()
            r1.getClass()
            X.C0EYH.LIZIZ(r0)
            X.0EY2 r0 = r5.m3()
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.TZ0()
            if (r2 == 0) goto L4d
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.v3()
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r1 = r0.getEditorProModel()
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r0 = r2.getEditorProModel()
            boolean r0 = r0.isAdvancedEditDraft()
            r1.setAdvancedEditDraft(r0)
        L4d:
            r5.O4()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L53:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r1
            r0 = 0
            java.lang.Object r0 = r5.W1(r0, r1, r4)
            if (r0 != r2) goto L22
            return r2
        L60:
            X.0EXh r4 = new X.0EXh
            r4.<init>(r5, r6)
            goto L12
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EXU.YE(X.05Vn):java.lang.Object");
    }

    public final Object n5(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1461350o8D.class, new AwS584S0100000_5((InterfaceC20236714Gf) c2252611DEt, 714));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    public C0EXU(C1DRG c1drg, C19A3 c19a3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILZIL = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ));
        this.LLILZLL = new NLEModel();
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(233));
        this.LLJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(234));
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC357200DzS.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), C0EOK.class, null);
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), C0EC7.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), C0E5S.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), C0EGY.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), C0EYP.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
        this.LLJJJJLIIL = new C366250EXn();
        this.LLJLILLLLZIIL = C2191201ApK.LIZ();
        this.LLJLLIL = C09IR.LIZ(0, 1, EnumC2252401DDy.DROP_OLDEST);
    }

    private final void t5(VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2) {
        String strLIZJ;
        NLEModel model;
        videoPublishEditModel.getEditorProModel().setAdvancedEditDraft(true);
        videoPublishEditModel.getEditorProModel().setAdvancedEdit(z);
        NLEModel nLEModelLJI = C350870DpF.LJI(c3());
        if (C295990Biv.LIZ() && z2) {
            C366180EXg.LIZJ(JY0(), nLEModelLJI);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C295990Biv.LIZ() && z2) {
            strLIZJ = C366180EXg.LIZIZ(JY0(), nLEModelLJI);
        } else {
            strLIZJ = C375260EnU.LIZJ(nLEModelLJI);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (Q3()) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getNLEModel().getStoreStr cost: ");
            sbLIZ.append(jCurrentTimeMillis2);
            C201955140j.LIZLLL(c563650M8t, "EDADataSyncEngine", C2188811AlT.LIZIZ(sbLIZ));
        }
        videoPublishEditModel.setNleData(strLIZJ);
        if (B3()) {
            if (C295990Biv.LIZ() && z2) {
                InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
                model = C350870DpF.LJFF(c3()).getModel();
                NLEModel nLEModelLIZ = C366180EXg.LIZ(interfaceC1446740nkeJY0);
                if (nLEModelLIZ != null) {
                    model = nLEModelLIZ;
                }
            } else {
                model = C350870DpF.LJFF(c3()).getModel();
            }
            videoPublishEditModel.setNleModel(NLEModel.dynamicCast(model.deepClone()));
            videoPublishEditModel.setNleDataChange(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W1(boolean r10, boolean r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EXU.W1(boolean, boolean, X.05Vn):java.lang.Object");
    }

    public final Object k5(NLEModel nLEModel, NLEModel nLEModel2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C366270EXp c366270EXp;
        if (nLEModel != null && nLEModel2 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (nLEModel.getId() == nLEModel2.getId()) {
                C13BV c13bv = C13BV.INSTANCE;
                c366270EXp = new C366270EXp(c13bv, c13bv, c13bv, c13bv, c13bv, c13bv, c13bv, c13bv);
            } else {
                VecNLETrackSPtr tracks = nLEModel2.getTracks();
                ArrayList arrayList = new ArrayList();
                for (NLETrack nLETrack : tracks) {
                    VecNLETrackSlotSPtr slots = nLETrack.getSlots();
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(slots, 10));
                    Iterator<NLETrackSlot> it2 = slots.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new Pair(nLETrack, it2.next()));
                    }
                    C19719612Di.LJJI(arrayList2, arrayList);
                }
                VecNLETrackSPtr tracks2 = nLEModel.getTracks();
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(tracks2, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (NLETrack nLETrack2 : tracks2) {
                    linkedHashMap.put(nLETrack2.getUUID(), nLETrack2);
                }
                int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(tracks, 10));
                if (iLIZIZ2 < 16) {
                    iLIZIZ2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ2);
                for (NLETrack nLETrack3 : tracks) {
                    linkedHashMap2.put(nLETrack3.getUUID(), nLETrack3);
                }
                ArrayList<C0EY8> arrayList3 = new ArrayList();
                ArrayList<NLETrack> arrayList4 = new ArrayList();
                ArrayList<NLETrack> arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    NLETrack nLETrack4 = (NLETrack) entry.getValue();
                    NLETrack nLETrack5 = (NLETrack) linkedHashMap2.get(key);
                    if (nLETrack5 == null) {
                        arrayList4.add(nLETrack4);
                    } else if (nLETrack4.getId() != nLETrack5.getId()) {
                        arrayList3.add(new C0EY8(nLETrack4, nLETrack5));
                    }
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    Object key2 = entry2.getKey();
                    Object value = entry2.getValue();
                    if (linkedHashMap.get(key2) == null) {
                        arrayList5.add(value);
                    }
                }
                for (NLETrack nLETrack6 : arrayList4) {
                    VecNLETrackSlotSPtr slots2 = nLETrack6.getSlots();
                    ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(slots2, 10));
                    Iterator<NLETrackSlot> it3 = slots2.iterator();
                    while (it3.hasNext()) {
                        arrayList9.add(new Pair(nLETrack6, it3.next()));
                    }
                    arrayList7.addAll(arrayList9);
                }
                for (NLETrack nLETrack7 : arrayList5) {
                    VecNLETrackSlotSPtr slots3 = nLETrack7.getSlots();
                    ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(slots3, 10));
                    Iterator<NLETrackSlot> it4 = slots3.iterator();
                    while (it4.hasNext()) {
                        arrayList10.add(new Pair(nLETrack7, it4.next()));
                    }
                    arrayList8.addAll(arrayList10);
                }
                for (C0EY8 c0ey8 : arrayList3) {
                    VecNLETrackSlotSPtr slots4 = c0ey8.LIZ.getSlots();
                    int iLIZIZ3 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(slots4, 10));
                    if (iLIZIZ3 < 16) {
                        iLIZIZ3 = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iLIZIZ3);
                    for (NLETrackSlot nLETrackSlot : slots4) {
                        linkedHashMap3.put(nLETrackSlot.getUUID(), nLETrackSlot);
                    }
                    VecNLETrackSlotSPtr slots5 = c0ey8.LIZIZ.getSlots();
                    int iLIZIZ4 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(slots5, 10));
                    if (iLIZIZ4 < 16) {
                        iLIZIZ4 = 16;
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(iLIZIZ4);
                    for (NLETrackSlot nLETrackSlot2 : slots5) {
                        linkedHashMap4.put(nLETrackSlot2.getUUID(), nLETrackSlot2);
                    }
                    for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                        Object key3 = entry3.getKey();
                        NLENode nLENode = (NLENode) entry3.getValue();
                        NLENode nLENode2 = (NLENode) linkedHashMap4.get(key3);
                        if (nLENode2 == null) {
                            arrayList7.add(new Pair(c0ey8.LIZ, nLENode));
                        } else if (nLENode.getId() != nLENode2.getId()) {
                            arrayList6.add(new C0EXF(new Pair(c0ey8.LIZ, nLENode), new Pair(c0ey8.LIZIZ, nLENode2)));
                        }
                    }
                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                        Object key4 = entry4.getKey();
                        Object value2 = entry4.getValue();
                        if (linkedHashMap3.get(key4) == null) {
                            arrayList8.add(new Pair(c0ey8.LIZIZ, value2));
                        }
                    }
                }
                c366270EXp = new C366270EXp(arrayList4, arrayList5, arrayList3, tracks, arrayList7, arrayList8, arrayList6, arrayList);
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (Q3()) {
                C563650M8t c563650M8t = C563650M8t.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("diffChangeNode cost: ");
                sbLIZ.append(jCurrentTimeMillis2);
                C201955140j.LIZLLL(c563650M8t, "EDADataSyncEngine", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("syncDiffResult: ");
                sbLIZ2.append(c366270EXp);
                C201955140j.LIZLLL(c563650M8t, "EDADataSyncEngine", C2188811AlT.LIZIZ(sbLIZ2));
                if (((Boolean) C273450Anf.LIZ.getValue()).booleanValue()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("diff update NLE data: ");
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(c366270EXp.LIZJ, ", ", e3.e, e3.f, 0, null, AFwS234S0000000_5.get$arr$(483), 24);
                    String strLJJLIIIJ2 = C13LP.LJJLIIIJ(c366270EXp.LJI, ", ", e3.e, e3.f, 0, null, AFwS234S0000000_5.get$arr$(482), 24);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("updateTracks: ");
                    sbLIZ4.append(strLJJLIIIJ);
                    sbLIZ4.append(" + updateSlots: ");
                    sbLIZ4.append(strLJJLIIIJ2);
                    sbLIZ3.append(C2188811AlT.LIZIZ(sbLIZ4));
                    C201955140j.LIZLLL(c563650M8t, "EDADataSyncEngine", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            Object objZ1 = Z1(c366270EXp, nLEModel2, jCurrentTimeMillis2, interfaceC1364105Vn);
            if (objZ1 == C099R.LJFF()) {
                return objZ1;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    @Override // X.InterfaceC366350EXx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object OA0(boolean r8, boolean r9, X.C0EYE r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EXU.OA0(boolean, boolean, X.0EYE, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z1(X.C366270EXp r13, com.bytedance.ies.nle.editor_jni.NLEModel r14, long r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            r12 = this;
            r3 = r17
            r9 = r15
            boolean r0 = r3 instanceof X.C366140EXc
            if (r0 == 0) goto Lb8
            r7 = r3
            X.0EXc r7 = (X.C366140EXc) r7
            int r2 = r7.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb8
            int r2 = r2 - r1
            r7.LLIZ = r2
        L15:
            java.lang.Object r1 = r7.LLILZIL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLIZ
            r11 = 0
            r5 = 1
            if (r0 == 0) goto L6c
            if (r0 != r5) goto Lbf
            long r2 = r7.LLILLJJLI
            long r9 = r7.LL
            X.00zU r8 = r7.LLILZ
            X.00zU r6 = r7.LLILLL
            X.C155000ia.LIZIZ(r1)
        L2e:
            r8.element = r1
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            boolean r2 = r12.Q3()
            if (r2 == 0) goto L52
            X.0M8t r4 = X.C563650M8t.LIZIZ
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r2 = "dispatchSyncTaskByPack cost: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r3)
            java.lang.String r2 = "EDADataSyncEngine"
            X.C201955140j.LIZLLL(r4, r2, r3)
        L52:
            boolean r2 = X.C301680Bs6.LIZ()
            if (r2 == 0) goto L69
            long r7 = r9 + r0
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.08tB r5 = new X.08tB
            r5.<init>(r6, r7, r9, r11)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r11, r11, r5, r0)
        L69:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6c:
            X.C155000ia.LIZIZ(r1)
            X.0EY3 r4 = new X.0EY3
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r12.v3()
            X.0EY2 r0 = r12.m3()
            if (r0 == 0) goto Lb3
            androidx.lifecycle.LiveData r0 = r0.zu2()
            if (r0 == 0) goto Lb3
            java.lang.Object r0 = r0.getValue()
            X.0EHI r0 = (X.C0EHI) r0
            if (r0 == 0) goto Lb3
            X.0EHJ r0 = r0.LIZ
            if (r0 == 0) goto Lb3
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LIZJ
        L8f:
            r4.<init>(r14, r1, r0)
            X.00zU r8 = new X.00zU
            r8.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            X.0EY4 r1 = r12.LLJJJJLIIL
            java.util.Set<? extends X.0EXj> r0 = r12.LLILZ
            r12.Q3()
            r7.LLILLL = r8
            r7.LLILZ = r8
            r7.LL = r9
            r7.LLILLJJLI = r2
            r7.LLIZ = r5
            java.lang.Object r1 = r1.LIZ(r13, r0, r4, r7)
            if (r1 != r6) goto Lb5
            return r6
        Lb3:
            r0 = r11
            goto L8f
        Lb5:
            r6 = r8
            goto L2e
        Lb8:
            X.0EXc r7 = new X.0EXc
            r7.<init>(r12, r3)
            goto L15
        Lbf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EXU.Z1(X.0EXp, com.bytedance.ies.nle.editor_jni.NLEModel, long, X.05Vn):java.lang.Object");
    }
}
