package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentTimeEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.ugc.android.davinciresource.DavinciResourceLibraryLoader;
import com.ss.ugc.android.davinciresource.jni.AlgorithmResourceFinder;
import com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc;
import com.ss.ugc.android.editor.components.base.api.IMagicProcessorService;
import dmt.av.video.StoredLiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS29S0100001_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Dyr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C356830Dyr implements InterfaceC356850Dyt {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final NLEEditor LIZ;
    public final C348100Dkm LIZIZ;
    public final StoredLiveData<C1452720nuI> LIZJ;
    public final C19EG LIZLLL;
    public final boolean LJ = true;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 70));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 72));
    public final InterfaceC356750Dyj LJII;
    public NLENode LJIIIIZZ;
    public String LJIIIZ;
    public final C01GW LJIIJ;

    public final DialogC1390150mHN LJIIJ() {
        return (DialogC1390150mHN) this.LJI.getValue();
    }

    public final NLEModel LJIIJJI() {
        if (this.LIZ.getModel() != null) {
            return this.LIZ.getModel();
        }
        NLEModel nLEModel = new NLEModel();
        this.LIZ.setModel(nLEModel);
        return nLEModel;
    }

    public final void LIZ() {
        VecNLETrackSlotSPtr vecNLETrackSlotSPtrLJIILIIL = LJIILIIL(LJIIJJI());
        if (vecNLETrackSlotSPtrLJIILIIL != null) {
            Iterator<NLETrackSlot> it2 = vecNLETrackSlotSPtrLJIILIIL.iterator();
            while (it2.hasNext()) {
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) it2.next().getMainSegment());
                if (nLESegmentVideoDynamicCast != null && nLESegmentVideoDynamicCast.getCanvasStyle() == null) {
                    nLESegmentVideoDynamicCast.setCanvasStyle(new NLEStyCanvas());
                }
            }
        }
    }

    public final void LJ() {
        Iterator<NLETrack> it2 = C351220Dpo.LJJIJLIJ(LJIIJJI()).iterator();
        while (it2.hasNext()) {
            LJIIJJI().removeTrack(it2.next());
        }
        LJI("", EnumC356070Dxd.DONE);
    }

    public final List<NLETrack> LJIJI() {
        VecNLETrackSPtr sortedTracks = LJIIJJI().getSortedTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : sortedTracks) {
            if (Intrinsics.LJFF(nLETrack.getExtra("EffectTrackType"), "VIDEO_ANIM")) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static String LJII(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null) {
            return null;
        }
        if (C348520DlS.LJII(nLETrackSlot)) {
            return "time";
        }
        if (C348520DlS.LJIIIIZZ(nLETrackSlot)) {
            return LJIIZILJ(nLETrackSlot, "nleExtraEffectCategory");
        }
        if (nLETrackSlot.hasExtra("anim_type")) {
            return nLETrackSlot.getExtra("nleExtraEffectCategory");
        }
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment == null) {
            return null;
        }
        return mainSegment.getExtra("nleExtraEffectCategory");
    }

    public static String LJIIIIZZ(NLETrackSlot nLETrackSlot) {
        NLEVideoEffect nLEVideoEffect;
        VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
        if (videoEffects != null && (nLEVideoEffect = (NLEVideoEffect) C13LP.LJJJLL(videoEffects)) != null) {
            C351510DqH.LIZ.getClass();
            if (C351510DqH.LJJIJIIJIL(nLEVideoEffect) && nLEVideoEffect.hasExtra("nleExtraEffectKey")) {
                return nLEVideoEffect.getExtra("nleExtraEffectKey");
            }
            return "";
        }
        return "";
    }

    public static String LJIIL(NLETrackSlot nLETrackSlot) {
        if (C348520DlS.LJIIIIZZ(nLETrackSlot)) {
            if (nLETrackSlot != null) {
                return LJIIZILJ(nLETrackSlot, "nleExtraEffectKey");
            }
            return null;
        }
        if (nLETrackSlot != null) {
            return C351220Dpo.LJJZ(nLETrackSlot);
        }
        return null;
    }

    public static VecNLETrackSlotSPtr LJIILIIL(NLEModel nLEModel) {
        if (C348520DlS.LJI(nLEModel)) {
            NLETrack nLETrack = (NLETrack) C13LP.LJJJLZIJ(0, C348520DlS.LIZJ(nLEModel));
            if (nLETrack != null) {
                return nLETrack.getSortedSlots();
            }
            return null;
        }
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            return mainTrack.getSortedSlots();
        }
        return null;
    }

    public static List LJIILJJIL(NLEModel nLEModel) {
        NLEVideoEffect nLEVideoEffect;
        NLESegmentFilter segment;
        NLETrackSlot renderProxy;
        VecNLETrackSlotSPtr vecNLETrackSlotSPtrLJIILIIL = LJIILIIL(nLEModel);
        if (vecNLETrackSlotSPtrLJIILIIL == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrackSlot nLETrackSlot : vecNLETrackSlotSPtrLJIILIIL) {
            NLETrackSlot nLETrackSlot2 = nLETrackSlot;
            if (nLETrackSlot2 != null && (renderProxy = nLETrackSlot2.getRenderProxy()) != null && renderProxy.getMainSegment() != null) {
                arrayList2.add(nLETrackSlot);
            }
        }
        if (!arrayList2.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("server rendering slot list size : ");
            sbLIZ.append(Integer.valueOf(arrayList2.size()));
            C201955140j.LIZIZ("EditEffectNLEHandler", C2188811AlT.LIZIZ(sbLIZ));
            arrayList.addAll(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (NLETrackSlot nLETrackSlot3 : vecNLETrackSlotSPtrLJIILIIL) {
            NLEFilter nLEFilter = (NLEFilter) C13LP.LJJJLL(nLETrackSlot3.getFilters());
            if (nLEFilter != null && (segment = nLEFilter.getSegment()) != null && !Intrinsics.LJFF(segment.getFilterName(), NLEEditorJniJNI.NLEFilterName_getAUDIO_VOICE_BEAUTIFY_FILTER())) {
                arrayList3.add(nLETrackSlot3);
            }
        }
        if (!arrayList3.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("server rendering slot list size : ");
            sbLIZ2.append(Integer.valueOf(arrayList3.size()));
            C201955140j.LIZIZ("EditEffectNLEHandler", C2188811AlT.LIZIZ(sbLIZ2));
            arrayList.addAll(arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        for (NLETrackSlot nLETrackSlot4 : vecNLETrackSlotSPtrLJIILIIL) {
            NLETrackSlot nLETrackSlot5 = nLETrackSlot4;
            VecNLEVideoEffectSPtr videoEffects = nLETrackSlot5.getVideoEffects();
            if (videoEffects != null && (nLEVideoEffect = (NLEVideoEffect) C13LP.LJJJLZIJ(0, videoEffects)) != null) {
                C351510DqH.LIZ.getClass();
                if (C351510DqH.LJJIJIIJIL(nLEVideoEffect) && !nLETrackSlot5.getFeatureList().contains("UGC_ASYNC_I2V")) {
                    arrayList4.add(nLETrackSlot4);
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("combined rendering slot list size : ");
            sbLIZ3.append(Integer.valueOf(arrayList4.size()));
            C201955140j.LIZIZ("EditEffectNLEHandler", C2188811AlT.LIZIZ(sbLIZ3));
            arrayList.addAll(arrayList4);
        }
        ArrayList arrayList5 = new ArrayList();
        for (NLETrackSlot nLETrackSlot6 : vecNLETrackSlotSPtrLJIILIIL) {
            C354260Dui.LIZ.getClass();
            if (C354260Dui.LJIIIZ(nLETrackSlot6) != null) {
                arrayList5.add(nLETrackSlot6);
            }
        }
        if (!arrayList5.isEmpty()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("slow motion slot list size : ");
            sbLIZ4.append(arrayList5.size());
            C201955140j.LIZIZ("EditEffectNLEHandler", C2188811AlT.LIZIZ(sbLIZ4));
            arrayList.addAll(arrayList5);
        }
        C201955140j.LIZIZ("EditEffectNLEHandler", "returning empty slot list");
        return arrayList;
    }

    public static Integer LJIILL(NLEModel nLEModel) {
        NLETrackSlot nLETrackSlotLJIILLIIL = LJIILLIIL(nLEModel);
        if (nLETrackSlotLJIILLIIL != null) {
            if (C346680DiU.LIZIZ(nLETrackSlotLJIILLIIL)) {
                return 1;
            }
            NLESegment mainSegment = nLETrackSlotLJIILLIIL.getMainSegment();
            if (mainSegment != null) {
                return Integer.valueOf((int) NLESegmentTimeEffect.dynamicCast(mainSegment).getTimeEffectType());
            }
            return null;
        }
        return null;
    }

    public static NLETrackSlot LJIILLIIL(NLEModel nLEModel) {
        NLETrack nLETrackLIZLLL = C348520DlS.LIZLLL(nLEModel);
        if (nLETrackLIZLLL != null) {
            return nLETrackLIZLLL.getSlotByIndex(0);
        }
        return null;
    }

    public static List LJIJ(NLEModel nLEModel) {
        List tracks;
        Object next;
        VecNLETrackSlotSPtr sortedSlots;
        if (C348520DlS.LJI(nLEModel)) {
            tracks = C348520DlS.LIZJ(nLEModel);
        } else {
            tracks = nLEModel.getTracks();
        }
        if (tracks != null) {
            Iterator it2 = tracks.iterator();
            do {
                next = null;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
            } while (!C351220Dpo.LLLLILI((NLETrack) next));
            NLETrack nLETrack = (NLETrack) next;
            if (nLETrack != null && (sortedSlots = nLETrack.getSortedSlots()) != null) {
                return sortedSlots;
            }
        }
        return C13BV.INSTANCE;
    }

    public final String LJIIIZ(NLETrackSlot nLETrackSlot) {
        if (!C348520DlS.LJII(nLETrackSlot) && !C346680DiU.LIZIZ(nLETrackSlot)) {
            String strLJJZ = C351220Dpo.LJJZ(nLETrackSlot);
            if (strLJJZ == null) {
                return "";
            }
            return strLJJZ;
        }
        return String.valueOf(LJIILL(LJIIJJI()));
    }

    public final Pair<NLETrackSlot, NLETrackSlot> LJIJJLI(EffectModel effectModel) {
        NLETrack next;
        boolean z;
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSession;
        String str = effectModel.videoAnimType;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        double d = effectModel.videoAnimDefaultDuration;
        String str3 = effectModel.resDir;
        String str4 = effectModel.name;
        String str5 = effectModel.key;
        String str6 = effectModel.resourceId;
        String str7 = effectModel.extra;
        if (str7 != null) {
            str2 = str7;
        }
        C351740Dqe c351740Dqe = new C351740Dqe(str, d, str3, str4, str5, str6, str2, "editingeffect", effectModel.entrancePoint, effectModel.index + 1);
        Iterator<NLETrack> it2 = LJIIJJI().getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C351220Dpo.LLLLILI(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next == null) {
            z = true;
        } else {
            z = false;
        }
        final NLEModel nLEModelLJIIJJI = LJIIJJI();
        final NLEEditor nLEEditor = this.LIZ;
        InterfaceC351730Dqd interfaceC351730Dqd = new InterfaceC351730Dqd(nLEModelLJIIJJI, nLEEditor) { // from class: X.0Dp4
            public final NLEModel LIZ;
            public final NLEEditor LIZIZ;

            @Override // X.InterfaceC351730Dqd
            public final void LIZ(C350800Dp8 c350800Dp8) {
                NLETrack trackBySlot;
                NLEModel nLEModel = this.LIZ;
                if (nLEModel != null && (trackBySlot = nLEModel.getTrackBySlot(c350800Dp8.LIZ)) != null) {
                    trackBySlot.getMainTrack();
                }
            }

            @Override // X.InterfaceC351730Dqd
            public final C443120HZe LJFF(C350780Dp6 c350780Dp6) {
                boolean z2;
                VecNLETrackSPtr tracks;
                NLETrack next2;
                long jLJIILJJIL;
                NLEVideoAnimation nLEVideoAnimationLJII;
                NLEResType resourceType;
                NLESegmentVideoAnimation segment;
                NLEResourceNode resource;
                NLETrackSlot nLETrackSlot = c350780Dp6.LIZ;
                C351510DqH c351510DqH = C351510DqH.LIZ;
                String str8 = c350780Dp6.LIZJ;
                c351510DqH.getClass();
                NLEVideoAnimation nLEVideoAnimationLJIJ = C351510DqH.LJIJ(nLETrackSlot, str8);
                VecNLEVideoAnimationSPtr videoAnims = nLETrackSlot.getVideoAnims();
                if (videoAnims != null) {
                    for (NLEVideoAnimation nLEVideoAnimation : videoAnims) {
                        if (nLEVideoAnimation != null && (segment = nLEVideoAnimation.getSegment()) != null && (resource = segment.getResource()) != null) {
                            resourceType = resource.getResourceType();
                        } else {
                            resourceType = null;
                        }
                        if (resourceType == NLEResType.ANIMATION_VIDEO) {
                            nLETrackSlot.removeVideoAnim(nLEVideoAnimation);
                        }
                    }
                }
                if (nLEVideoAnimationLJIJ == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                NLEModel nLEModel = this.LIZ;
                if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
                    Iterator<NLETrack> it3 = tracks.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            NLETrack nLETrack = next2;
                            if (nLETrack.getMainTrack() && nLETrack.getEnable()) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    NLETrack nLETrack2 = next2;
                    if (nLETrack2 != null) {
                        C351510DqH.LIZ.getClass();
                        long jLJJIJ = C351510DqH.LJJIJ(nLETrack2, nLETrackSlot);
                        long jLJJIIZI = C351510DqH.LJJIIZI(nLETrackSlot);
                        if (nLEVideoAnimationLJIJ != null && C351220Dpo.LLJIJIL(nLEVideoAnimationLJIJ)) {
                            jLJIILJJIL = nLEVideoAnimationLJIJ.getStartTime();
                        } else {
                            jLJIILJJIL = C351510DqH.LJIILJJIL(nLETrack2, nLETrackSlot);
                        }
                        long jLJI = C351510DqH.LJI(c350780Dp6, nLETrack2, z2, jLJIILJJIL);
                        long jLJ = C351510DqH.LJ(c350780Dp6, nLETrack2, jLJIILJJIL);
                        if (jLJI >= jLJJIJ) {
                            jLJJIJ = jLJI;
                        }
                        if (jLJ < jLJJIIZI) {
                            jLJJIIZI = jLJ;
                        }
                        if (Intrinsics.LJFF(c350780Dp6.LIZJ, "combo_video_anim") && Math.abs(jLJJIIZI - jLJJIJ) < 10000) {
                            return new C443120HZe(Boolean.FALSE, Boolean.valueOf(z2), null);
                        }
                        if (!z2) {
                            nLETrackSlot.removeVideoAnim(nLEVideoAnimationLJIJ);
                            nLEVideoAnimationLJII = LJII(c350780Dp6, jLJJIJ, jLJJIIZI);
                            nLETrackSlot.addVideoAnim(nLEVideoAnimationLJII);
                        } else {
                            nLEVideoAnimationLJII = LJII(c350780Dp6, jLJJIJ, jLJJIIZI);
                            nLETrackSlot.addVideoAnim(nLEVideoAnimationLJII);
                        }
                        return new C443120HZe(Boolean.TRUE, Boolean.valueOf(z2), nLEVideoAnimationLJII);
                    }
                }
                return new C443120HZe(Boolean.FALSE, Boolean.TRUE, null);
            }

            {
                this.LIZ = nLEModelLJIIJJI;
                this.LIZIZ = nLEEditor;
            }

            public static void LJI(C350760Dp4 c350760Dp4, EnumC356070Dxd enumC356070Dxd) {
                c350760Dp4.getClass();
                if (enumC356070Dxd != null) {
                    int i = C350610Dop.LIZ[enumC356070Dxd.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new C1954807lC();
                            }
                            return;
                        } else {
                            NLEEditor nLEEditor2 = c350760Dp4.LIZIZ;
                            if (nLEEditor2 != null) {
                                nLEEditor2.done(null);
                                return;
                            }
                            return;
                        }
                    }
                    NLEEditor nLEEditor3 = c350760Dp4.LIZIZ;
                    if (nLEEditor3 != null) {
                        nLEEditor3.commit();
                    }
                }
            }

            @Override // X.InterfaceC351730Dqd
            public final Pair<NLETrack, NLETrackSlot> LIZIZ(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
                NLETrack trackBySlot;
                if (nLETrackSlot == null) {
                    return null;
                }
                NLEModel nLEModel = this.LIZ;
                if (nLEModel != null && (trackBySlot = nLEModel.getTrackBySlot(nLETrackSlot)) != null && C351220Dpo.LLJJIII(trackBySlot)) {
                    trackBySlot.removeSlot(nLETrackSlot);
                    LJI(this, enumC356070Dxd);
                    return new Pair<>(trackBySlot, nLETrackSlot);
                }
                return new Pair<>(null, null);
            }

            @Override // X.InterfaceC351730Dqd
            public final void LIZJ(C350790Dp7 c350790Dp7, EnumC356070Dxd enumC356070Dxd) {
                NLETrack trackBySlot;
                NLEModel nLEModel = this.LIZ;
                if (nLEModel != null && (trackBySlot = nLEModel.getTrackBySlot(c350790Dp7.LIZ)) != null && trackBySlot.getMainTrack()) {
                    NLETrackSlot nLETrackSlot = c350790Dp7.LIZ;
                    C351510DqH c351510DqH = C351510DqH.LIZ;
                    String str8 = c350790Dp7.LIZIZ;
                    c351510DqH.getClass();
                    NLEVideoAnimation nLEVideoAnimationLJIJ = C351510DqH.LJIJ(nLETrackSlot, str8);
                    if (nLEVideoAnimationLJIJ != null) {
                        nLEVideoAnimationLJIJ.setStartTime(c350790Dp7.LIZJ);
                        nLEVideoAnimationLJIJ.setEndTime(c350790Dp7.LIZLLL);
                    }
                    C350700Doy.LJIIIIZZ(nLEModel, nLETrackSlot, c350790Dp7.LIZIZ);
                    LJI(this, enumC356070Dxd);
                }
            }

            @Override // X.InterfaceC351730Dqd
            public final void LJ(C350650Dot c350650Dot, EnumC356070Dxd enumC356070Dxd) {
                NLETrack trackBySlot;
                NLEModel nLEModel = this.LIZ;
                if (nLEModel != null && (trackBySlot = nLEModel.getTrackBySlot(c350650Dot.LIZ)) != null && trackBySlot.getMainTrack()) {
                    NLETrackSlot nLETrackSlot = c350650Dot.LIZ;
                    C351510DqH c351510DqH = C351510DqH.LIZ;
                    String str8 = c350650Dot.LIZIZ;
                    c351510DqH.getClass();
                    NLEVideoAnimation nLEVideoAnimationLJIJ = C351510DqH.LJIJ(nLETrackSlot, str8);
                    if (nLEVideoAnimationLJIJ != null) {
                        nLETrackSlot.removeVideoAnim(nLEVideoAnimationLJIJ);
                    }
                    C350700Doy.LIZIZ(nLEModel, nLETrackSlot, c350650Dot.LIZIZ);
                    LJI(this, enumC356070Dxd);
                }
            }

            public static NLEVideoAnimation LJII(C350780Dp6 c350780Dp6, long j, long j2) {
                NLEResType nLEResType;
                NLEResourceNode effectSDKVideoAnimation;
                NLEResType nLEResType2;
                NLEVideoAnimation nLEVideoAnimation = new NLEVideoAnimation();
                nLEVideoAnimation.setIsNewAnim(true);
                nLEVideoAnimation.setStartTime(j);
                nLEVideoAnimation.setEndTime(j2);
                NLESegmentVideoAnimation nLESegmentVideoAnimation = new NLESegmentVideoAnimation();
                NLEResourceNode nLEResourceNode = new NLEResourceNode();
                nLEResourceNode.setResourceFile(c350780Dp6.LIZLLL);
                nLEResourceNode.setResourceId(c350780Dp6.LJFF);
                nLEResourceNode.setResourceName(c350780Dp6.LJ);
                String str8 = c350780Dp6.LIZJ;
                if (Intrinsics.LJFF(str8, "in_video_anim")) {
                    nLEResType = NLEResType.ANIMATION_VIDEO_IN;
                } else if (Intrinsics.LJFF(str8, "out_video_anim")) {
                    nLEResType = NLEResType.ANIMATION_VIDEO_OUT;
                } else {
                    nLEResType = NLEResType.ANIMATION_VIDEO_COMBO;
                }
                nLEResourceNode.setResourceType(nLEResType);
                nLESegmentVideoAnimation.setEffectSDKVideoAnimation(nLEResourceNode);
                nLEVideoAnimation.setSegment(nLESegmentVideoAnimation);
                nLEVideoAnimation.setExtra("anim_type", c350780Dp6.LIZJ);
                nLEVideoAnimation.setExtra("ep_anim_default_duration", String.valueOf(c350780Dp6.LIZIZ));
                NLESegmentVideoAnimation segment = nLEVideoAnimation.getSegment();
                if (segment != null && (effectSDKVideoAnimation = segment.getEffectSDKVideoAnimation()) != null) {
                    effectSDKVideoAnimation.setResourceId(c350780Dp6.LJFF);
                    effectSDKVideoAnimation.setResourceFile(c350780Dp6.LIZLLL);
                    effectSDKVideoAnimation.setResourceName(c350780Dp6.LJ);
                    String str9 = c350780Dp6.LIZJ;
                    if (Intrinsics.LJFF(str9, "in_video_anim")) {
                        nLEResType2 = NLEResType.ANIMATION_VIDEO_IN;
                    } else if (Intrinsics.LJFF(str9, "out_video_anim")) {
                        nLEResType2 = NLEResType.ANIMATION_VIDEO_OUT;
                    } else {
                        nLEResType2 = NLEResType.ANIMATION_VIDEO_COMBO;
                    }
                    effectSDKVideoAnimation.setResourceType(nLEResType2);
                }
                return nLEVideoAnimation;
            }

            @Override // X.InterfaceC351730Dqd
            public final NLETrackSlot LIZLLL(C350780Dp6 c350780Dp6, EnumC356070Dxd enumC356070Dxd, NLEModel nLEModel) {
                NLETrack trackBySlot;
                long startTime;
                NLETrackSlot nLETrackSlotLJII;
                NLEResourceNode effectSDKVideoAnimation;
                NLEResType nLEResType;
                NLEResType nLEResType2;
                NLEResType resourceType;
                NLESegmentVideoAnimation segment;
                NLEResourceNode resource;
                if (nLEModel == null) {
                    return null;
                }
                Iterator<NLETrack> it3 = nLEModel.getTracks().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    NLETrack next2 = it3.next();
                    NLETrack nLETrack = next2;
                    if (nLETrack.getMainTrack() && nLETrack.getEnable()) {
                        if (next2 == null || (trackBySlot = nLEModel.getTrackBySlot(c350780Dp6.LIZ)) == null || !trackBySlot.getMainTrack()) {
                            return null;
                        }
                        NLETrackSlot nLETrackSlot = c350780Dp6.LIZ;
                        C351510DqH c351510DqH = C351510DqH.LIZ;
                        String str8 = c350780Dp6.LIZJ;
                        c351510DqH.getClass();
                        NLEVideoAnimation nLEVideoAnimationLJIJ = C351510DqH.LJIJ(nLETrackSlot, str8);
                        VecNLEVideoAnimationSPtr videoAnims = nLETrackSlot.getVideoAnims();
                        if (videoAnims != null) {
                            for (NLEVideoAnimation nLEVideoAnimation : videoAnims) {
                                if (nLEVideoAnimation != null && (segment = nLEVideoAnimation.getSegment()) != null && (resource = segment.getResource()) != null) {
                                    resourceType = resource.getResourceType();
                                } else {
                                    resourceType = null;
                                }
                                if (resourceType == NLEResType.ANIMATION_VIDEO) {
                                    nLETrackSlot.removeVideoAnim(nLEVideoAnimation);
                                }
                            }
                        }
                        NLETrack mainTrack = nLEModel.getMainTrack();
                        if (nLEVideoAnimationLJIJ == null) {
                            NLEVideoAnimation nLEVideoAnimation2 = new NLEVideoAnimation();
                            nLEVideoAnimation2.setIsNewAnim(true);
                            nLEVideoAnimation2.setExtra("anim_type", c350780Dp6.LIZJ);
                            nLEVideoAnimation2.setExtra("ep_anim_default_duration", String.valueOf(c350780Dp6.LIZIZ));
                            C351510DqH.LIZ.getClass();
                            nLEVideoAnimation2.setStartTime(C351510DqH.LJFF(c350780Dp6, mainTrack, C351510DqH.LJIILJJIL(mainTrack, nLETrackSlot)));
                            nLEVideoAnimation2.setEndTime(C351510DqH.LIZLLL(c350780Dp6, mainTrack, C351510DqH.LJIILJJIL(mainTrack, nLETrackSlot)));
                            NLESegmentVideoAnimation nLESegmentVideoAnimation = new NLESegmentVideoAnimation();
                            NLEResourceNode nLEResourceNode = new NLEResourceNode();
                            nLEResourceNode.setResourceFile(c350780Dp6.LIZLLL);
                            nLEResourceNode.setResourceId(c350780Dp6.LJFF);
                            nLEResourceNode.setResourceName(c350780Dp6.LJ);
                            String str9 = c350780Dp6.LIZJ;
                            if (Intrinsics.LJFF(str9, "in_video_anim")) {
                                nLEResType2 = NLEResType.ANIMATION_VIDEO_IN;
                            } else if (Intrinsics.LJFF(str9, "out_video_anim")) {
                                nLEResType2 = NLEResType.ANIMATION_VIDEO_OUT;
                            } else {
                                nLEResType2 = NLEResType.ANIMATION_VIDEO_COMBO;
                            }
                            nLEResourceNode.setResourceType(nLEResType2);
                            nLESegmentVideoAnimation.setEffectSDKVideoAnimation(nLEResourceNode);
                            nLEVideoAnimation2.setSegment(nLESegmentVideoAnimation);
                            nLETrackSlot.addVideoAnim(nLEVideoAnimation2);
                            nLETrackSlotLJII = C350700Doy.LIZ(nLEModel, nLETrackSlot, c350780Dp6.LIZJ, c350780Dp6.LIZIZ);
                        } else {
                            if (C351220Dpo.LLJIJIL(nLEVideoAnimationLJIJ)) {
                                startTime = nLEVideoAnimationLJIJ.getStartTime();
                            } else {
                                startTime = 0;
                            }
                            nLEVideoAnimationLJIJ.setIsNewAnim(true);
                            nLEVideoAnimationLJIJ.setExtra("ep_anim_default_duration", String.valueOf(c350780Dp6.LIZIZ));
                            C351510DqH.LIZ.getClass();
                            nLEVideoAnimationLJIJ.setStartTime(C351510DqH.LJFF(c350780Dp6, mainTrack, startTime));
                            nLEVideoAnimationLJIJ.setEndTime(C351510DqH.LIZLLL(c350780Dp6, mainTrack, startTime));
                            NLESegmentVideoAnimation segment2 = nLEVideoAnimationLJIJ.getSegment();
                            if (segment2 != null && (effectSDKVideoAnimation = segment2.getEffectSDKVideoAnimation()) != null) {
                                effectSDKVideoAnimation.setResourceFile(c350780Dp6.LIZLLL);
                                effectSDKVideoAnimation.setResourceId(c350780Dp6.LJFF);
                                effectSDKVideoAnimation.setResourceName(c350780Dp6.LJ);
                                String str10 = c350780Dp6.LIZJ;
                                if (Intrinsics.LJFF(str10, "in_video_anim")) {
                                    nLEResType = NLEResType.ANIMATION_VIDEO_IN;
                                } else if (Intrinsics.LJFF(str10, "out_video_anim")) {
                                    nLEResType = NLEResType.ANIMATION_VIDEO_OUT;
                                } else {
                                    nLEResType = NLEResType.ANIMATION_VIDEO_COMBO;
                                }
                                effectSDKVideoAnimation.setResourceType(nLEResType);
                            }
                            nLETrackSlotLJII = C350700Doy.LJII(nLEModel, nLETrackSlot, c350780Dp6.LIZJ, c350780Dp6.LIZIZ);
                        }
                        LJI(this, enumC356070Dxd);
                        return nLETrackSlotLJII;
                    }
                }
                return null;
            }
        };
        C19EG c19eg = this.LIZLLL;
        NLEModel nLEModelLJIIJJI2 = LJIIJJI();
        NLEEditor nLEEditor2 = this.LIZ;
        C348100Dkm c348100Dkm = this.LIZIZ;
        if (c348100Dkm != null && (iNLEMediaSession = c348100Dkm.LIZIZ) != null) {
            playerApi = iNLEMediaSession.getPlayerApi();
        } else {
            playerApi = null;
        }
        Pair<NLETrackSlot, NLETrackSlot> pairLIZ = new C351720Dqc(c19eg, nLEModelLJIIJJI2, nLEEditor2, playerApi, interfaceC351730Dqd, null, this.LJ).LIZ(c351740Dqe, null, false, LJIIJJI());
        NLETrackSlot second = pairLIZ.getSecond();
        if (second != null) {
            if (z) {
                for (NLETrack nLETrack : C348520DlS.LIZIZ(LJIIJJI())) {
                    nLETrack.setLayer(nLETrack.getLayer() + 1);
                }
            }
            second.setExtra("nleExtraEffectDesignerId", effectModel.designerId);
            second.setExtra("nleExtraEffectSource", String.valueOf(effectModel.source));
            LJI(C0E1V.ADD_VIDEO_EFFECT.getNameId(), EnumC356070Dxd.DONE);
        }
        return pairLIZ;
    }

    public final void LJJII(Function0<Unit> function0) {
        List<NLETrack> listLIZJ = C348520DlS.LIZJ(this.LIZ.getModel());
        function0.invoke();
        if (((ArrayList) C348520DlS.LIZJ(this.LIZ.getModel())).isEmpty()) {
            for (NLETrack nLETrack : (ArrayList) listLIZJ) {
                nLETrack.setEnable(false);
                this.LIZ.getModel().addTrack(nLETrack);
            }
            C348100Dkm c348100Dkm = this.LIZIZ;
            if (c348100Dkm != null) {
                c348100Dkm.LJIIL();
            }
        }
    }

    public final void LJJIIJ(EnumC357140DzM enumC357140DzM) {
        C0E1X c0e1x;
        String strLIZ;
        String description = this.LIZ.getBranch().getHead().getDescription();
        if (description != null && description.length() != 0 && (c0e1x = (C0E1X) C051R.LIZ(description, C0E1X.class)) != null && (strLIZ = C0E1W.LIZ(c0e1x, enumC357140DzM, this.LIZLLL, (Map) this.LJIIJ.getValue())) != null && strLIZ.length() > 0) {
            C15L2.LIZ(this.LIZLLL, strLIZ);
        }
    }

    public static void LIZJ(NLENode nLENode, EffectModel effectModel) {
        C201955140j.LIZIZ("EditEffectNLEHandler", "processing extra to NLENode");
        nLENode.setExtra("nleExtraEffectKey", effectModel.key);
        nLENode.setExtra("nleExtraEffectType", String.valueOf(effectModel.type));
        nLENode.setExtra("original_effect_name", effectModel.name);
        nLENode.setExtra("nleExtraEffectColor", String.valueOf(effectModel.color));
        nLENode.setExtra("nleExtraEffectTag", effectModel.extra);
        nLENode.setExtra("nleExtraEffectDirectory", effectModel.resDir);
        nLENode.setExtra("nleExtraEffectSelectedColor", String.valueOf(effectModel.color));
        nLENode.setExtra("nleExtraEffectCategory", effectModel.category);
        nLENode.setExtra("nleExtraEffectSource", String.valueOf(effectModel.source));
        nLENode.setExtra("nleExtraEffectDesignerId", effectModel.designerId);
        nLENode.setExtra("nleExtraEffectDesignerEncryptedId", effectModel.designerEncryptedId);
        nLENode.setExtra("nleExtraEffectIndex", String.valueOf(effectModel.index));
        nLENode.setExtra("nleExtraEffectSelectFrom", effectModel.selectFrom);
        nLENode.setExtra("nleExtraEffectExtra", effectModel.extra);
        nLENode.setExtra("nleExtraEffectEntrancePoint", effectModel.entrancePoint);
        String str = effectModel.iconUrl;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        nLENode.setExtra("nleExtraEffectIconUrl", str);
        nLENode.setExtra("nle_extra_resource_id", effectModel.resourceId);
        String str3 = effectModel.challenge;
        if (str3 != null) {
            str2 = str3;
        }
        nLENode.setExtra("nleExtraEffectChallenge", str2);
    }

    public static String LJIIZILJ(NLETrackSlot nLETrackSlot, String str) {
        Object objLJJJLL;
        NLESegmentFilter segment;
        NLEFilter nLEFilter;
        NLESegmentFilter segment2;
        NLETrackSlot renderProxy = nLETrackSlot.getRenderProxy();
        if (renderProxy != null && renderProxy.getMainSegment() != null) {
            if (!nLETrackSlot.getRenderProxy().getMainSegment().hasExtra(str)) {
                return null;
            }
            return nLETrackSlot.getRenderProxy().getMainSegment().getExtra(str);
        }
        VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
        if (filters != null) {
            objLJJJLL = C13LP.LJJJLL(filters);
        } else {
            objLJJJLL = null;
        }
        if (objLJJJLL != null) {
            NLEFilter nLEFilter2 = (NLEFilter) C13LP.LJJJLL(nLETrackSlot.getFilters());
            if (nLEFilter2 == null || (segment = nLEFilter2.getSegment()) == null || !segment.hasExtra(str) || (nLEFilter = (NLEFilter) C13LP.LJJJLL(nLETrackSlot.getFilters())) == null || (segment2 = nLEFilter.getSegment()) == null) {
                return null;
            }
            return segment2.getExtra(str);
        }
        VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
        if (videoEffects == null || C13LP.LJJJLZIJ(0, videoEffects) == null) {
            return null;
        }
        NLENode nLENode = (NLENode) C13LP.LJJJLL(nLETrackSlot.getVideoEffects());
        if (nLENode != null && nLENode.hasExtra(str)) {
            NLENode nLENode2 = (NLENode) C13LP.LJJJLL(nLETrackSlot.getVideoEffects());
            if (nLENode2 == null) {
                return null;
            }
            return nLENode2.getExtra(str);
        }
        if (!nLETrackSlot.hasExtra(str)) {
            return null;
        }
        return nLETrackSlot.getExtra(str);
    }

    public final void LIZLLL(int i, Pair<Long, Long> pair) {
        C1452720nuI c1452720nuILJII;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    c1452720nuILJII = C1452720nuI.LJI();
                } else if (pair == null) {
                    return;
                } else {
                    c1452720nuILJII = new C1452720nuI("3", pair.getFirst().longValue(), pair.getSecond().longValue());
                }
            } else if (pair == null) {
                return;
            } else {
                c1452720nuILJII = new C1452720nuI("2", pair.getFirst().longValue(), pair.getSecond().longValue());
            }
        } else {
            c1452720nuILJII = C1452720nuI.LJII();
        }
        this.LIZJ.setValue(c1452720nuILJII);
    }

    public final void LJI(String str, EnumC356070Dxd enumC356070Dxd) {
        if (enumC356070Dxd != null) {
            int i = C350600Doo.LIZ[enumC356070Dxd.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (str.length() == 0) {
                        C350410DoV.LIZ(this.LIZ, true, false);
                        return;
                    } else {
                        C350410DoV.LIZLLL(this.LIZ, true, C051R.LIZIZ(new C0E1X(str, null, null, null, null, 30)), false, true);
                        return;
                    }
                }
                return;
            }
            this.LIZ.commit();
        }
    }

    public final void LJIL(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        NLEModel nLEModelDynamicCast;
        VecNLETrackSlotSPtr sortedSlots;
        int iIndexOf;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots2;
        NLETrackSlot nLETrackSlot2;
        VecNLETrackSlotSPtr sortedSlots3;
        NLENode nLENode;
        String uuid;
        ArrayList<NLETrackSlot> arrayList;
        VecNLETrackSlotSPtr sortedSlots4;
        long endTime;
        long j;
        VecNLETrackSlotSPtr sortedSlots5;
        NLETrack next;
        ArrayList arrayList2;
        NLENode nLENode2 = nLEModel;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if ((nLENode2 != null || (nLENode2 = this.LJIIIIZZ) != null) && (nLEModelDynamicCast = NLEModel.dynamicCast(nLENode2)) != null) {
            NLETrack mainTrack2 = nLEModelDynamicCast.getMainTrack();
            int size = 0;
            if (mainTrack2 != null && (sortedSlots5 = mainTrack2.getSortedSlots()) != null) {
                for (NLETrackSlot nLETrackSlot3 : sortedSlots5) {
                    linkedHashMap.put(nLETrackSlot3.getUUID(), new ArrayList());
                    for (Object obj : C1697810uHb.LJ("in_video_anim", "out_video_anim", "combo_video_anim")) {
                        Iterator<NLETrack> it2 = LJIIJJI().getTracks().iterator();
                        do {
                            next = null;
                            if (!it2.hasNext()) {
                                break;
                            } else {
                                next = it2.next();
                            }
                        } while (!C351220Dpo.LLLLILI(next));
                        NLETrack nLETrack = next;
                        if (nLETrack != null) {
                            Iterator<NLETrackSlot> it3 = nLETrack.getSortedSlots().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    NLETrackSlot next2 = it3.next();
                                    NLETrackSlot nLETrackSlot4 = next2;
                                    if (nLETrackSlot4.hasExtra("anim_type")) {
                                        boolean zLJFF = Intrinsics.LJFF(nLETrackSlot4.getExtra("anim_type"), obj);
                                        if (C350700Doy.LJ(nLEModelDynamicCast.getMainTrack(), nLETrackSlot4, nLETrackSlot3) && zLJFF) {
                                            if (next2 != null && (arrayList2 = (ArrayList) linkedHashMap.get(nLETrackSlot3.getUUID())) != null) {
                                                arrayList2.add(next2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            NLETrack mainTrack3 = LJIIJJI().getMainTrack();
            if (mainTrack3 != null && (sortedSlots = mainTrack3.getSortedSlots()) != null && (iIndexOf = sortedSlots.indexOf(nLETrackSlot)) != -1 && (mainTrack = nLEModelDynamicCast.getMainTrack()) != null && (sortedSlots2 = mainTrack.getSortedSlots()) != null && (nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(iIndexOf, sortedSlots2)) != null) {
                long duration = nLETrackSlot.getDuration() - nLETrackSlot2.getDuration();
                ArrayList<NLETrackSlot> arrayList3 = (ArrayList) linkedHashMap.get(nLETrackSlot.getUUID());
                if (arrayList3 != null) {
                    for (NLETrackSlot nLETrackSlot5 : arrayList3) {
                        if (duration < 0) {
                            if (C351220Dpo.LLLLIL(nLETrackSlot5)) {
                                long startTime = nLETrackSlot2.getStartTime();
                                C351510DqH.LIZ.getClass();
                                endTime = startTime + C351510DqH.LJJIIZI(nLETrackSlot2);
                            } else {
                                endTime = nLETrackSlot2.getEndTime();
                            }
                            long endTime2 = endTime - nLETrackSlot5.getEndTime();
                            long duration2 = (nLETrackSlot5.getDuration() + endTime2) - 100000;
                            long j2 = -duration;
                            if (endTime2 + 1 <= j2 && j2 <= duration2) {
                                long duration3 = nLETrackSlot5.getDuration() - (j2 - endTime2);
                                if (nLETrackSlot5.getStartTime() <= 1000) {
                                    j = -nLETrackSlot5.getStartTime();
                                } else {
                                    j = 0;
                                }
                                nLETrackSlot5.setStartTime(j + nLETrackSlot5.getStartTime());
                                nLETrackSlot5.setEndTime(nLETrackSlot5.getStartTime() + duration3);
                                C350700Doy.LJIIIZ(LJIIJJI(), nLETrackSlot5);
                                nLETrackSlot5.setDuration(duration3);
                                C350640Dos.LIZLLL(LJIIJJI(), nLETrackSlot5);
                            } else if (j2 > duration2) {
                                LJIIJJI().getTrackBySlot(nLETrackSlot5).removeSlot(nLETrackSlot5);
                                C350640Dos.LIZJ(nLETrackSlot5, nLETrackSlot, LJIIJJI(), this.LIZ);
                            }
                        } else if (C351220Dpo.LLLIIIIL(nLETrackSlot5)) {
                            C350640Dos.LIZ(nLETrackSlot5, nLETrackSlot);
                            C350700Doy.LJIIIZ(LJIIJJI(), nLETrackSlot5);
                        }
                        C350700Doy.LJIIJ(LJIIJJI(), nLETrackSlot5, nLETrackSlot);
                    }
                }
                NLETrack mainTrack4 = LJIIJJI().getMainTrack();
                if (mainTrack4 != null && (sortedSlots4 = mainTrack4.getSortedSlots()) != null) {
                    size = sortedSlots4.size();
                }
                IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(iIndexOf + 1, size);
                int i = intRangeLJIILJJIL.LL;
                int i2 = intRangeLJIILJJIL.LLILLJJLI;
                if (i > i2) {
                    return;
                }
                while (true) {
                    NLETrack mainTrack5 = LJIIJJI().getMainTrack();
                    if (mainTrack5 != null && (sortedSlots3 = mainTrack5.getSortedSlots()) != null && (nLENode = (NLENode) C13LP.LJJJLZIJ(i, sortedSlots3)) != null && (uuid = nLENode.getUUID()) != null && (arrayList = (ArrayList) linkedHashMap.get(uuid)) != null) {
                        for (NLETrackSlot nLETrackSlot6 : arrayList) {
                            nLETrackSlot6.setStartTime(nLETrackSlot6.getStartTime() + duration);
                            nLETrackSlot6.setEndTime(nLETrackSlot6.getEndTime() + duration);
                            C350640Dos.LIZLLL(LJIIJJI(), nLETrackSlot6);
                        }
                    }
                    if (i != i2) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final Pair<NLETrack, NLETrackSlot> LJJ(NLETrackSlot nLETrackSlot, boolean z) {
        NLEVideoAnimation nLEVideoAnimation;
        NLETrack next;
        NLETrackSlot next2;
        NLETrackSlot nLETrackSlot2;
        NLETrack mainTrack;
        Iterator<NLETrack> it2 = C351220Dpo.LJJIJLIJ(LJIIJJI()).iterator();
        do {
            nLEVideoAnimation = null;
            if (it2.hasNext()) {
                next = it2.next();
                Iterator<NLETrackSlot> it3 = next.getSlots().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (Intrinsics.LJFF(next2.getUUID(), nLETrackSlot.getUUID())) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                nLETrackSlot2 = next2;
            } else {
                return new Pair<>(null, null);
            }
        } while (nLETrackSlot2 == null);
        if (C351220Dpo.LLLLIL(nLETrackSlot2)) {
            if (C348520DlS.LJI(LJIIJJI()) && !C348520DlS.LIZJ(LJIIJJI()).isEmpty()) {
                mainTrack = (NLETrack) ListProtector.get(C348520DlS.LIZJ(LJIIJJI()), 0);
            } else if (LJIIJJI().getMainTrack() == null) {
                mainTrack = new NLETrack();
                mainTrack.setMainTrack(true);
                LJIIJJI().addTrack(mainTrack);
            } else {
                mainTrack = LJIIJJI().getMainTrack();
            }
            NLETrackSlot nLETrackSlot3 = (NLETrackSlot) C13LP.LJJJLL(mainTrack.getSlots());
            if (nLETrackSlot3 != null) {
                Iterator<NLEVideoAnimation> it4 = nLETrackSlot3.getVideoAnims().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    NLEVideoAnimation next3 = it4.next();
                    if (Intrinsics.LJFF(next3.getExtra("anim_type"), nLETrackSlot2.getExtra("anim_type"))) {
                        nLEVideoAnimation = next3;
                        break;
                    }
                }
                NLEVideoAnimation nLEVideoAnimation2 = nLEVideoAnimation;
                if (nLEVideoAnimation2 != null) {
                    nLETrackSlot3.removeVideoAnim(nLEVideoAnimation2);
                }
            }
        }
        next.removeSlot(nLETrackSlot2);
        if (next.getSlots().isEmpty()) {
            LJIIJJI().removeTrack(next);
        }
        if (z) {
            LJI(C0E1V.DELETE.getNameId(), EnumC356070Dxd.DONE);
        }
        return new Pair<>(next, nLETrackSlot2);
    }

    public final void LJJI(VideoPublishEditModel videoPublishEditModel, NLETrackSlot nLETrackSlot) {
        InterfaceC356750Dyj interfaceC356750Dyj = this.LJII;
        if (interfaceC356750Dyj != null) {
            NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(LJIIJJI().deepClone());
            LJJIFFI(nLETrackSlot, interfaceC356750Dyj);
            LJIL(nLEModelDynamicCast, nLETrackSlot);
        }
        ArrayList<EffectPointModel> effectList = videoPublishEditModel.getEffectList();
        ArrayList arrayList = new ArrayList();
        for (EffectPointModel effectPointModel : effectList) {
            if (Intrinsics.LJFF(effectPointModel.getResourceId(), C351220Dpo.LJJZ(nLETrackSlot))) {
                arrayList.add(effectPointModel);
            }
        }
        videoPublishEditModel.setEffectList(new ArrayList<>(arrayList));
        LJI(C0E1V.DELETE.getNameId(), EnumC356070Dxd.DONE);
    }

    public final void LJJIFFI(NLETrackSlot nLETrackSlot, InterfaceC356750Dyj interfaceC356750Dyj) {
        NLETrackSlot renderProxy;
        int i = 0;
        if (nLETrackSlot != null && (renderProxy = nLETrackSlot.getRenderProxy()) != null && renderProxy.getMainSegment() != null) {
            nLETrackSlot.setProcessor(new VecString(new String[0]));
            nLETrackSlot.setRenderProxy(new NLETrackSlot());
            nLETrackSlot.removeExtraWithKey("ep_magic_resource_id");
            nLETrackSlot.removeExtraWithKey("ep_magic_effect_id");
            C354260Dui.LIZ.getClass();
            nLETrackSlot.removeExtraWithKey("ep_magic_category_id");
            return;
        }
        String extra = nLETrackSlot.getExtra("ep_magic_resource_id");
        if (extra == null) {
            extra = "";
        }
        String extra2 = nLETrackSlot.getExtra("ep_magic_effect_id");
        if (extra2 == null) {
            extra2 = "";
        }
        if (!(!a0.LJJJIL(extra))) {
            return;
        }
        NLEModel nLEModelLJIIJJI = LJIIJJI();
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(extra2, new String[]{","}, 0, 6);
        for (Object obj : a0.LJJLIIIJILLIZJL(extra, new String[]{","}, 0, 6)) {
            int i2 = i + 1;
            if (i >= 0) {
                String str = (String) obj;
                if (!a0.LJJJIL(str)) {
                    String str2 = (String) C13LP.LJJJLZIJ(i, listLJJLIIIJILLIZJL);
                    if (str2 == null) {
                        str2 = "";
                    }
                    interfaceC356750Dyj.LIZJ(new C354240Dug(new C354510Dv7(null, str, str2, null, null, null, null, null, null, 0, false, 4089), nLETrackSlot, nLEModelLJIIJJI));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LJJIII(long j, boolean z) {
        NLEModel nLEModelLJIIJJI = LJIIJJI();
        List<NLETrack> listLJJIJLIJ = C351220Dpo.LJJIJLIJ(nLEModelLJIIJJI);
        ArrayList<NLETrackSlot> arrayList = new ArrayList();
        Iterator<NLETrack> it2 = listLJJIJLIJ.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        for (NLETrackSlot nLETrackSlot : arrayList) {
            if (nLETrackSlot.getEndTime() > j) {
                if (nLETrackSlot.getStartTime() >= j) {
                    NLETrack trackBySlot = nLEModelLJIIJJI.getTrackBySlot(nLETrackSlot);
                    trackBySlot.removeSlot(nLETrackSlot);
                    if (trackBySlot.getSlots().isEmpty()) {
                        nLEModelLJIIJJI.removeTrack(trackBySlot);
                    }
                } else {
                    nLETrackSlot.setEndTime(j);
                }
            }
        }
        if (z) {
            LJI("", EnumC356070Dxd.DONE);
        }
    }

    public static final void LJFF(C356830Dyr c356830Dyr, NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        NLETrack trackBySlot = c356830Dyr.LJIIJJI().getTrackBySlot(nLETrackSlot);
        if (trackBySlot == null) {
            return;
        }
        if (trackBySlot.getSlots().size() == 1) {
            nLEModel.removeTrack(trackBySlot);
        } else {
            trackBySlot.removeSlot(nLETrackSlot);
        }
    }

    public final void LJIJJ(final EffectModel effectModel, Context context, final Function1<? super String, Unit> function1, final Function0<Unit> function0) {
        NLETrack mainTrack;
        C0E00 c0e00;
        if (!C20510015Ni.LIZ.LJIIIIZZ()) {
            if (context != null) {
                C1627000sRO.LIZIZ(context, true);
                if (function1 != null) {
                    function1.invoke("Network Error");
                    return;
                }
                return;
            }
            return;
        }
        DialogC1390150mHN dialogC1390150mHNLJIIJ = LJIIJ();
        if (dialogC1390150mHNLJIIJ != null) {
            dialogC1390150mHNLJIIJ.LLILZLL = new InterfaceC1389630mGX() { // from class: X.0Dyu
                @Override // X.InterfaceC1389630mGX
                public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                    InterfaceC356750Dyj interfaceC356750Dyj = this.LIZ.LJII;
                    if (interfaceC356750Dyj != null) {
                        interfaceC356750Dyj.Hs();
                    }
                    C356830Dyr c356830Dyr = this.LIZ;
                    String str = c356830Dyr.LJIIIZ;
                    if (str != null) {
                        c356830Dyr.LIZ.restore(str);
                        c356830Dyr.LIZ.commit();
                    }
                    C356830Dyr c356830Dyr2 = this.LIZ;
                    Function1<String, Unit> function12 = function1;
                    c356830Dyr2.getClass();
                    C01TT.LIZLLL(new C356890Dyx(c356830Dyr2, null, function12, "cancel", 0));
                }
            };
        }
        this.LJIIIZ = this.LIZ.store();
        if (C348520DlS.LJI(LJIIJJI())) {
            mainTrack = (NLETrack) ListProtector.get(C348520DlS.LIZJ(LJIIJJI()), 0);
        } else if (LJIIJJI().getMainTrack() == null) {
            mainTrack = new NLETrack();
            mainTrack.setMainTrack(true);
            LJIIJJI().addTrack(mainTrack);
        } else {
            mainTrack = LJIIJJI().getMainTrack();
        }
        final NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, mainTrack.getSortedSlots());
        if (nLETrackSlot != null) {
            NLENode nLENodeDeepClone = LJIIJJI().deepClone(false);
            InterfaceC356750Dyj interfaceC356750Dyj = this.LJII;
            if (interfaceC356750Dyj != null) {
                LJJIFFI(nLETrackSlot, interfaceC356750Dyj);
                ArrayList arrayList = new ArrayList();
                if (effectModel.isServerEffect().booleanValue()) {
                    arrayList.add(EnumC356200Dxq.PHOTO);
                    c0e00 = C0E00.SERVER_GAME_PLAY;
                } else if (effectModel.isClientEffect().booleanValue()) {
                    arrayList.add(EnumC356200Dxq.VIDEO);
                    c0e00 = C0E00.CLIENT_GAME_PLAY;
                } else {
                    arrayList.add(EnumC356200Dxq.PHOTO);
                    c0e00 = C0E00.COMBINE_GAME_PLAY;
                }
                String str = effectModel.name;
                String str2 = effectModel.resourceId;
                String str3 = effectModel.key;
                String str4 = effectModel.resDir;
                String str5 = effectModel.category;
                if (str5 == null) {
                    str5 = "";
                }
                C354240Dug c354240Dug = new C354240Dug(new C354510Dv7(str, str2, str3, str4, arrayList, c0e00, null, str5, null, 0, false, 3904), nLETrackSlot, LJIIJJI());
                InterfaceC356750Dyj interfaceC356750Dyj2 = this.LJII;
                if (interfaceC356750Dyj2 != null) {
                    interfaceC356750Dyj2.LIZIZ(c354240Dug, new InterfaceC356810Dyp() { // from class: X.0Dyv
                        @Override // X.InterfaceC356810Dyp
                        public final void onStart() {
                            C201955140j.LIZIZ("EditEffectNLEHandler", "onStart");
                            C356830Dyr c356830Dyr = this.LIZ;
                            c356830Dyr.getClass();
                            C01TT.LIZLLL(new AwS549S0100000_5(c356830Dyr, 73));
                        }

                        @Override // X.InterfaceC356810Dyp
                        public final void LIZ(C356900Dyy c356900Dyy) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onFail :: ");
                            sbLIZ.append(c356900Dyy.LIZIZ);
                            sbLIZ.append(". ");
                            sbLIZ.append(c356900Dyy.LIZ);
                            C201955140j.LIZIZ("EditEffectNLEHandler", C2188811AlT.LIZIZ(sbLIZ));
                            C356830Dyr c356830Dyr = this.LIZ;
                            String str6 = c356830Dyr.LJIIIZ;
                            if (str6 != null) {
                                c356830Dyr.LIZ.restore(str6);
                                c356830Dyr.LIZ.commit();
                            }
                            C356830Dyr c356830Dyr2 = this.LIZ;
                            Function1<String, Unit> function12 = function1;
                            int i = c356900Dyy.LIZ;
                            String str7 = c356900Dyy.LIZIZ;
                            c356830Dyr2.getClass();
                            C01TT.LIZLLL(new C356890Dyx(c356830Dyr2, str7, function12, "mix effect fail", i));
                        }

                        @Override // X.InterfaceC356810Dyp
                        public final void LIZIZ(C354570DvD c354570DvD) {
                            VecNLEVideoEffectSPtr videoEffects;
                            NLEVideoEffect nLEVideoEffect;
                            NLESegment mainSegment;
                            NLESegment mainSegment2;
                            NLESegmentFilter segment;
                            C201955140j.LIZIZ("EditEffectNLEHandler", "onSuccess");
                            C356830Dyr c356830Dyr = this.LIZ;
                            NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                            EffectModel effectModel2 = effectModel;
                            Function0<Unit> function02 = function0;
                            c356830Dyr.getClass();
                            if (effectModel2.isClientEffect().booleanValue()) {
                                C201955140j.LIZIZ("EditEffectNLEHandler", "processing client rendering extra");
                                NLEFilter nLEFilter = (NLEFilter) C13LP.LJJJLL(nLETrackSlot2.getFilters());
                                if (nLEFilter != null && (segment = nLEFilter.getSegment()) != null) {
                                    C201955140j.LIZIZ("EditEffectNLEHandler", "processing client rendering filter segment");
                                    C356830Dyr.LIZJ(segment, effectModel2);
                                }
                                NLETrackSlot renderProxy = nLETrackSlot2.getRenderProxy();
                                if (renderProxy != null && (mainSegment2 = renderProxy.getMainSegment()) != null) {
                                    C201955140j.LIZIZ("EditEffectNLEHandler", "processing client rendering main segment");
                                    C356830Dyr.LIZJ(mainSegment2, effectModel2);
                                }
                            } else if (effectModel2.isServerEffect().booleanValue()) {
                                NLETrackSlot renderProxy2 = nLETrackSlot2.getRenderProxy();
                                if (renderProxy2 != null && (mainSegment = renderProxy2.getMainSegment()) != null) {
                                    C201955140j.LIZIZ("EditEffectNLEHandler", "processing server rendering extra");
                                    C356830Dyr.LIZJ(mainSegment, effectModel2);
                                }
                            } else if (effectModel2.isCombinedEffect().booleanValue() && (videoEffects = nLETrackSlot2.getVideoEffects()) != null && (nLEVideoEffect = (NLEVideoEffect) C13LP.LJJJLZIJ(0, videoEffects)) != null) {
                                C351510DqH.LIZ.getClass();
                                if (C351510DqH.LJJIJIIJIL(nLEVideoEffect)) {
                                    C201955140j.LIZIZ("EditEffectNLEHandler", "processing combined rendering extra");
                                    C356830Dyr.LIZJ(nLETrackSlot2, effectModel2);
                                }
                            }
                            C354260Dui.LIZ.getClass();
                            C354260Dui.LIZJ(nLETrackSlot2);
                            C354260Dui.LIZIZ(nLETrackSlot2, effectModel2.resourceId, effectModel2.key, effectModel2.name, effectModel2.iconUrl);
                            String str6 = effectModel2.category;
                            if (str6 == null) {
                                str6 = "";
                            }
                            nLETrackSlot2.setExtra("ep_magic_category_id", str6);
                            C1440005kM.LIZ(new IEvent() { // from class: X.0Dyw
                                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                                public final /* synthetic */ IEvent post() {
                                    C1440005kM.LIZ(this);
                                    return this;
                                }

                                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                                public final /* synthetic */ IEvent postSticky() {
                                    C1440005kM.LIZIZ(this);
                                    return this;
                                }
                            });
                            c356830Dyr.LJJIII(nLETrackSlot2.getDuration(), false);
                            C01TT.LIZLLL(new AwS249S0300000_5(nLETrackSlot2, (NLETrackSlot) c356830Dyr, (C356830Dyr) function02, (Function0<Unit>) 2));
                        }

                        @Override // X.InterfaceC356810Dyp
                        public final void onProgress(int i) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onProgress ::  ");
                            sbLIZ.append(i);
                            C201955140j.LIZIZ("EditEffectNLEHandler", C2188811AlT.LIZIZ(sbLIZ));
                            C356830Dyr c356830Dyr = this.LIZ;
                            c356830Dyr.getClass();
                            C01TT.LIZLLL(new AwS29S0100001_5(c356830Dyr, i, 0));
                        }
                    });
                }
                this.LJIIIIZZ = nLENodeDeepClone;
                return;
            }
            C201955140j.LIZIZ("EditEffectNLEHandler", "magic processor manager is null");
        }
    }

    public C356830Dyr(NLEEditor nLEEditor, C348100Dkm c348100Dkm, StoredLiveData storedLiveData, C19EG c19eg, CreativeInfo creativeInfo) {
        INLEMediaSession iNLEMediaSession;
        NLEMediaConfig mediaConfig;
        this.LIZ = nLEEditor;
        this.LIZIZ = c348100Dkm;
        this.LIZJ = storedLiveData;
        this.LIZLLL = c19eg;
        Application application = c19eg.getApplication();
        EnumC20227914Cv enumC20227914Cv = EnumC20227914Cv.STYLE_EFFECT;
        C13W1 c13w1 = new C13W1(application, enumC20227914Cv, creativeInfo);
        C356740Dyi c356740Dyi = new C356740Dyi();
        c356740Dyi.LIZ = c13w1;
        c356740Dyi.LIZIZ = c13w1;
        c356740Dyi.LIZJ = c13w1;
        c356740Dyi.LIZLLL = c13w1;
        c356740Dyi.LJ = c13w1;
        C357530Dzz c357530DzzLIZ = c356740Dyi.LIZ();
        IMagicProcessorService iMagicProcessorService = (IMagicProcessorService) C792600V7i.LIZ(IMagicProcessorService.class);
        if (iMagicProcessorService != null) {
            DavinciResourceLibraryLoader.INSTANCE.loadLibrary();
            InterfaceC356750Dyj magicProcessorManager = iMagicProcessorService.getMagicProcessorManager();
            magicProcessorManager.LIZLLL(C786410Ut5.P3(c19eg), c357530DzzLIZ, new DAVUnZipFunc() { // from class: X.08SU
                @Override // com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc
                public final boolean unZip(String str, String str2, boolean z) {
                    boolean zRenameTo = false;
                    if (str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str2);
                        sbLIZ.append("_temp");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                        if (c0vsj.exists()) {
                            c0vsj.delete();
                        }
                        try {
                            C13SB.LJIJJLI(str, strLIZIZ);
                            String absolutePath = c0vsj.getAbsolutePath();
                            if (new C0VSJ(str2).exists()) {
                                C08QA.LJIIZILJ(new C0VSJ(str2));
                            }
                            C0VSJ c0vsj2 = new C0VSJ(absolutePath);
                            C0VSJ c0vsj3 = new C0VSJ(str2);
                            if (c0vsj2.exists()) {
                                zRenameTo = c0vsj2.renameTo(c0vsj3);
                            }
                            if (z) {
                                new C0VSJ(str).delete();
                                return zRenameTo;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C201955140j.LJI("EditEffectNLEHandler", e);
                        }
                    }
                    return zRenameTo;
                }
            });
            String path = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(enumC20227914Cv, "", true).getPath();
            if (c348100Dkm != null && (iNLEMediaSession = c348100Dkm.LIZIZ) != null && (mediaConfig = iNLEMediaSession.getMediaConfig()) != null) {
                mediaConfig.getNleMediaAbConfig();
            }
            NLEMediaConfig nLEMediaConfig = new NLEMediaConfig();
            nLEMediaConfig.setMediaLogLevel(LogLevel.LEVEL_INFO);
            magicProcessorManager.LIZ(C1697810uHb.LJ(new C354210Dud(), new C354220Due(), new C354470Dv3(nLEEditor, C0F9X.LIZ(nLEMediaConfig, null, nLEEditor, 8).getPlayerApi(), path)));
            this.LJII = magicProcessorManager;
            C20005413Pg c20005413PgLIZ = C13Q5.LIZ();
            InterfaceC20008113Qh interfaceC20008113Qh = new InterfaceC20008113Qh() { // from class: X.0Dyq
                @Override // X.InterfaceC20008113Qh
                public final String LIZ(String str) {
                    return AlgorithmResourceFinder.resourceFinder(null, "", str);
                }
            };
            synchronized (c20005413PgLIZ) {
                try {
                    c20005413PgLIZ.LJI = interfaceC20008113Qh;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LJIIJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(50));
    }

    public static NLETrackSlot LIZIZ(C356830Dyr c356830Dyr, EffectModel effectModel, long j, long j2, int i, boolean z, int i2) {
        boolean z2;
        NLETrack nLETrackLIZIZ;
        int layer;
        if ((i2 & 16) != 0) {
            z = false;
        }
        boolean z3 = true;
        if ((i2 & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c356830Dyr.getClass();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_global_effect_canvas_adapt_android", true, false)) {
            c356830Dyr.LIZ();
        }
        long j3 = j + j2;
        Pair pair = new Pair(Long.valueOf(j), Long.valueOf(j3));
        if (z) {
            C351510DqH c351510DqH = C351510DqH.LIZ;
            NLEModel nLEModelLJIIJJI = c356830Dyr.LJIIJJI();
            c351510DqH.getClass();
            nLETrackLIZIZ = C351510DqH.LIZ(nLEModelLJIIJJI);
        } else {
            NLEModel nLEModelLJIIJJI2 = c356830Dyr.LJIIJJI();
            List<NLETrack> listLIZIZ = C348520DlS.LIZIZ(nLEModelLJIIJJI2);
            ArrayList<NLETrackSlot> arrayList = new ArrayList();
            Iterator<NLETrack> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getSlots(), arrayList);
            }
            for (NLETrackSlot nLETrackSlot : arrayList) {
                if (nLETrackSlot.getEndTime() > j && nLETrackSlot.getStartTime() < j3) {
                    NLETrack trackBySlot = c356830Dyr.LJIIJJI().getTrackBySlot(nLETrackSlot);
                    NLETrackSlot nLETrackSlotDynamicCast = null;
                    if (nLETrackSlot.getStartTime() >= j && nLETrackSlot.getEndTime() <= j3) {
                        LJFF(c356830Dyr, nLEModelLJIIJJI2, nLETrackSlot);
                    } else if (nLETrackSlot.getStartTime() < j) {
                        if (nLETrackSlot.getEndTime() > j3 && (nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone(z3))) != null) {
                            nLETrackSlotDynamicCast.setStartTime(j3);
                        }
                        nLETrackSlot.setEndTime(j);
                    } else if (nLETrackSlot.getEndTime() > j3) {
                        nLETrackSlot.setStartTime(j3);
                    }
                    long endTime = nLETrackSlot.getEndTime() - nLETrackSlot.getStartTime();
                    long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
                    long j5 = i;
                    if (endTime / j4 < j5) {
                        LJFF(c356830Dyr, nLEModelLJIIJJI2, nLETrackSlot);
                    }
                    if (nLETrackSlotDynamicCast != null) {
                        if ((nLETrackSlotDynamicCast.getEndTime() - nLETrackSlotDynamicCast.getStartTime()) / j4 < j5) {
                            break;
                        }
                        nLETrackSlotDynamicCast.setTransformZ(trackBySlot.getLayer() + 10000);
                        trackBySlot.addSlot(nLETrackSlotDynamicCast);
                    } else {
                        continue;
                    }
                }
                z3 = true;
            }
            nLETrackLIZIZ = C356600DyU.LIZIZ(C348520DlS.LIZIZ(c356830Dyr.LJIIJJI()), pair);
            if (nLETrackLIZIZ == null) {
                C351510DqH c351510DqH2 = C351510DqH.LIZ;
                NLEModel nLEModelLJIIJJI3 = c356830Dyr.LJIIJJI();
                c351510DqH2.getClass();
                nLETrackLIZIZ = C351510DqH.LIZ(nLEModelLJIIJJI3);
            }
        }
        boolean zLIZLLL = C351420Dq8.LIZLLL(c356830Dyr.LJIIJJI());
        NLETrackSlot nLETrackSlotLIZ = C350490Dod.LIZ(effectModel, j, j3);
        if (zLIZLLL) {
            layer = C351420Dq8.LJ(c356830Dyr.LJIIJJI(), EnumC355980DxU.EFFECT);
        } else {
            layer = nLETrackLIZIZ.getLayer() + 10000;
        }
        nLETrackSlotLIZ.setTransformZ(layer);
        C356600DyU.LJII(nLETrackSlotLIZ, effectModel, c356830Dyr.LJIIJJI(), EnumC356310Dy1.EDIT);
        nLETrackLIZIZ.setRewind(c356830Dyr.LJIIJJI().getRewind());
        nLETrackLIZIZ.addSlot(nLETrackSlotLIZ);
        if (z2) {
            c356830Dyr.LJI(C0E1V.ADD_VIDEO_EFFECT.getNameId(), EnumC356070Dxd.COMMIT);
        }
        return nLETrackSlotLIZ;
    }
}
