package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPAnchorData;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AiPlaygroundCameraModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361780EGi implements InterfaceC359970E9j {
    public final C19A3 LL;
    public final C0EY2 LLILLJJLI;
    public final C0EC7 LLILLL;
    public final C0EGY LLILZ;
    public final C0E5S LLILZIL;
    public final C0E48 LLILZLL;

    @Override // X.InterfaceC359970E9j
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC359970E9j
    public final void LIZIZ(LifecycleOwner lifecycleOwner) {
        final String openEditToolType;
        C0EC7 c0ec7;
        LiveData<Boolean> liveDataXi1;
        final VideoPublishEditModel editModel = this.LLILLJJLI.getEditModel();
        if (editModel == null) {
            return;
        }
        if (C1416310mxZ.LJJ(editModel)) {
            openEditToolType = "ep_ai";
        } else if (C537970L7z.LIZIZ(editModel.creativeModel.editorProSchemeModel)) {
            openEditToolType = C537970L7z.LIZ(editModel.creativeModel.editorProSchemeModel);
        } else {
            openEditToolType = editModel.getEditorProModel().getOpenEditToolType();
        }
        if ((!editModel.creativeModel.draftInfoModel.isDraft || Intrinsics.LJFF(openEditToolType, "ai_video")) && (c0ec7 = this.LLILLL) != null && (liveDataXi1 = c0ec7.xi1()) != null) {
            liveDataXi1.observe(lifecycleOwner, new Observer() { // from class: X.0EGh
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    NLETrackSlot nLETrackSlot;
                    boolean z;
                    InterfaceC359850E8x interfaceC359850E8xB20;
                    C0EGY c0egy;
                    InterfaceC359940E9g interfaceC359940E9gAZ0;
                    VecNLETrackSlotSPtr sortedSlots;
                    NLETrack mainTrack;
                    VecNLETrackSlotSPtr slots;
                    NLETrackSlot nLETrackSlot2;
                    C0EGY c0egy2;
                    C0EHF c0ehfRr2;
                    InterfaceC361830EGn interfaceC361830EGn;
                    C0EHF c0ehfRr22;
                    AbstractC357570E0d abstractC357570E0d;
                    String str = openEditToolType;
                    if (str != null) {
                        C361980EHc c361980EHcLJ = null;
                        switch (str.hashCode()) {
                            case -1349063220:
                                if (str.equals("cutout")) {
                                    C361780EGi c361780EGi = this;
                                    String str2 = openEditToolType;
                                    C0E48 c0e48 = c361780EGi.LLILZLL;
                                    if (c0e48 != null) {
                                        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
                                        NLETrack mainTrack2 = nLEModelLJI.getMainTrack();
                                        if (mainTrack2 != null && (sortedSlots = mainTrack2.getSortedSlots()) != null) {
                                            nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, sortedSlots);
                                        } else {
                                            nLETrackSlot = null;
                                        }
                                        if (nLETrackSlot != null) {
                                            nLETrackSlot.setExtra("slot_extra_customize_from_editor_tab", "true");
                                            nLETrackSlot.setExtra("slot_extra_tool_type_from_editor_tab", str2);
                                            c361780EGi.LLILZIL.I61(nLEModelLJI, false, false);
                                            if (nLETrackSlot.getAIMatting() != null) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            c361780EGi.LLILZIL.G22(nLETrackSlot, C0E6E.CLIP, EnumC358760E4s.NORMAL, false, C359960E9i.LIZ(null), true);
                                        } else {
                                            z = false;
                                        }
                                        C0EGY c0egy3 = c361780EGi.LLILZ;
                                        if (c0egy3 != null) {
                                            interfaceC359850E8xB20 = c0egy3.B20();
                                        } else {
                                            interfaceC359850E8xB20 = null;
                                        }
                                        if (interfaceC359850E8xB20 != null) {
                                            c361980EHcLJ = interfaceC359850E8xB20.LJ("bottom_item_edit_cutout");
                                        }
                                        if (!z && !C301700Bs8.LIZ() && c361980EHcLJ != null && c361980EHcLJ.LJII && (c0egy = c361780EGi.LLILZ) != null && (interfaceC359940E9gAZ0 = c0egy.AZ0()) != null) {
                                            interfaceC359940E9gAZ0.LJIIIZ("bottom_item_edit_cutout");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case -1215511132:
                                if (str.equals("ai_video")) {
                                    C361780EGi c361780EGi2 = this;
                                    VideoPublishEditModel videoPublishEditModel = editModel;
                                    c361780EGi2.getClass();
                                    AiPlaygroundCameraModel aiPlaygroundCameraModel = videoPublishEditModel.creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel;
                                    if (aiPlaygroundCameraModel.autoSelectAiCreateVideoClip) {
                                        aiPlaygroundCameraModel.autoSelectAiCreateVideoClip = false;
                                        C0E48 c0e482 = c361780EGi2.LLILZLL;
                                        if (c0e482 != null && (mainTrack = C350870DpF.LJI(c0e482).getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) != null) {
                                            c361780EGi2.LLILZIL.G22(nLETrackSlot2, C0E6E.CLIP, EnumC358760E4s.NORMAL, false, false, false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case -50093235:
                                if (str.equals("captions") && (c0egy2 = this.LLILZ) != null && (c0ehfRr2 = c0egy2.Rr2()) != null && (interfaceC361830EGn = (InterfaceC361830EGn) c0ehfRr2.LIZJ(InterfaceC361830EGn.class)) != null) {
                                    interfaceC361830EGn.LJI(null, false);
                                    break;
                                }
                                break;
                            case 96706620:
                                if (str.equals("ep_ai")) {
                                    this.LIZJ(editModel);
                                }
                                break;
                            case 103655853:
                                if (str.equals("magic")) {
                                    C361780EGi c361780EGi3 = this;
                                    EPAnchorData ePAnchorData = editModel.creativeModel.editorProSchemeModel.anchorData;
                                    C0EGY c0egy4 = c361780EGi3.LLILZ;
                                    if (c0egy4 != null && (c0ehfRr22 = c0egy4.Rr2()) != null && (abstractC357570E0d = (AbstractC357570E0d) c0ehfRr22.LIZJ(AbstractC357570E0d.class)) != null) {
                                        abstractC357570E0d.LJIILJJIL(ePAnchorData, c361780EGi3.LLILZLL, false);
                                        break;
                                    }
                                }
                                break;
                            case 1376878921:
                                if (str.equals("new_edit")) {
                                    this.LIZJ(editModel);
                                }
                                break;
                        }
                    }
                }
            });
        }
    }

    public final void LIZJ(VideoPublishEditModel videoPublishEditModel) {
        C0E48 c0e48;
        AbstractC359260E6q abstractC359260E6q;
        EnumC378720Et4 enumC378720Et4 = EnumC378720Et4.TEXT_TO_IMAGE_CREATION;
        String str = videoPublishEditModel.creativeModel.editorProAIGCInfoModel.editorTabAlbumAICreate.deeplinkEpAIScene;
        if (str.length() != 0) {
            if (Intrinsics.LJFF(str, "open_ai_video")) {
                enumC378720Et4 = EnumC378720Et4.TEXT_TO_VIDEO_CREATION;
            }
            C0E48 c0e482 = this.LLILZLL;
            if (c0e482 != null) {
                C375820EoO.LIZ(this.LL, c0e482, C376260Ep6.class, new C379120Eti(c0e482, videoPublishEditModel, enumC378720Et4, null, null, null, false, false, false, false, null, null, System.currentTimeMillis(), EnumC378910EtN.UNKNOWN, 4088), 16);
                return;
            }
        }
        C363500EMy.LIZ.getClass();
        if (C363500EMy.LJIILJJIL(videoPublishEditModel) && (c0e48 = this.LLILZLL) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C19A3 c19a3 = this.LL;
            C0E9B c0e9b = C0E9B.LIZIZ;
            C375820EoO.LIZ(c19a3, c0e48, C376260Ep6.class, new C379120Eti(c0e48, videoPublishEditModel, null, null, null, c0e9b, false, false, false, false, null, null, jCurrentTimeMillis, EnumC378910EtN.ALBUM, 4060), 16);
            C378370EsV c378370EsV = C378370EsV.LIZ;
            C379140Etk.LIZ.getClass();
            if (C379140Etk.LJI()) {
                abstractC359260E6q = C359280E6s.LIZIZ;
            } else {
                abstractC359260E6q = C359270E6r.LIZIZ;
            }
            c378370EsV.getClass();
            C378370EsV.LJII(videoPublishEditModel, c0e9b, abstractC359260E6q);
        }
    }

    public C361780EGi(C19A3 c19a3, C0EY2 c0ey2, C0EC7 c0ec7, C0EGY c0egy, C0E5S c0e5s, C0E48 c0e48) {
        this.LL = c19a3;
        this.LLILLJJLI = c0ey2;
        this.LLILLL = c0ec7;
        this.LLILZ = c0egy;
        this.LLILZIL = c0e5s;
        this.LLILZLL = c0e48;
    }
}
