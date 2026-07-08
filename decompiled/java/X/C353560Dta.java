package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Dta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C353560Dta {
    public static final C353560Dta LIZ = new C353560Dta();

    public static boolean LJFF() {
        EditModelProvider.Companion.getClass();
        EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
        VideoPublishEditModel editModel = editModelProviderLIZIZ != null ? editModelProviderLIZIZ.getEditModel() : null;
        if (editModel == null || !editModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_add_magic_tab", true, false);
        }
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("studio_editor_pro_add_magic_tab_in_pugc", false);
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return ((Boolean) C274030Aob.LIZ.getValue()).booleanValue();
        }
        return ((Boolean) C274020Aoa.LIZ.getValue()).booleanValue();
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return ((Boolean) C273750Ao9.LIZ.getValue()).booleanValue();
        }
        if (((Boolean) C273750Ao9.LIZ.getValue()).booleanValue()) {
            return true;
        }
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return ((Boolean) C273760AoA.LIZ.getValue()).booleanValue();
        }
        return false;
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return ((Boolean) C273710Ao5.LIZ.getValue()).booleanValue();
        }
        if (((Boolean) C273710Ao5.LIZ.getValue()).booleanValue()) {
            return true;
        }
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return ((Boolean) C273730Ao7.LIZ.getValue()).booleanValue();
        }
        return false;
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return ((Boolean) C273770AoB.LIZ.getValue()).booleanValue();
        }
        if (((Boolean) C273770AoB.LIZ.getValue()).booleanValue()) {
            return true;
        }
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return ((Boolean) C273540Ano.LIZ.getValue()).booleanValue();
        }
        return false;
    }

    public static boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if (videoPublishEditModel.getEditorProModel().getMagicResourcePaths().isEmpty() && ((ArrayList) C1416310mxZ.LJJIJLIJ(videoPublishEditModel)).isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean LJI(NLEModel nLEModel) {
        boolean zLJIJI = C357540E0a.LJIJI(nLEModel);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_add_magic_after_effect", true, false) || zLJIJI) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(NLETrackSlot nLETrackSlot) {
        if (Intrinsics.LJFF(nLETrackSlot.getExtra("biz_magic_is_combine_gameplay_render_with_effect"), "true") || Intrinsics.LJFF(nLETrackSlot.getExtra("biz_magic_is_combine_gameplay_render_with_effect"), "1")) {
            return true;
        }
        VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
        if (!(videoEffects instanceof Collection) || !videoEffects.isEmpty()) {
            for (NLEVideoEffect nLEVideoEffect : videoEffects) {
                C354260Dui.LIZ.getClass();
                String extra = nLEVideoEffect.getExtra("nleExtraEffectExtra");
                if (extra == null) {
                    extra = "{}";
                }
                if (C354260Dui.LJIIL(extra)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void LJIIJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        String extra;
        String extra2;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (C351220Dpo.LLLLJ(nLETrack)) {
                    arrayList.add(nLETrack);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((NLETrack) it2.next()).getSlots());
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                for (NLETrackSlot nLETrackSlot : (AbstractList) it3.next()) {
                    LIZ.getClass();
                    EditModelProvider.Companion.getClass();
                    InterfaceC356750Dyj magicProcessorManager$tools_camera_edit_release = C0E1T.LIZ().getMagicProcessorManager$tools_camera_edit_release();
                    if (magicProcessorManager$tools_camera_edit_release != null) {
                        if (!nLETrackSlot.hasExtra("ep_magic_resource_id") || (extra = nLETrackSlot.getExtra("ep_magic_resource_id")) == null) {
                            extra = "";
                        }
                        if (!nLETrackSlot.hasExtra("ep_magic_effect_id") || (extra2 = nLETrackSlot.getExtra("ep_magic_effect_id")) == null) {
                            extra2 = "";
                        }
                        if (!a0.LJJJIL(extra)) {
                            int i = 0;
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
                                        magicProcessorManager$tools_camera_edit_release.LIZJ(new C354240Dug(new C354510Dv7(null, str, str2, null, null, null, null, null, null, 0, false, 4089), nLETrackSlot, nLEModel));
                                    }
                                    i = i2;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    public static void LJIIJJI(C0E48 c0e48) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        if (c0e48 != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
            long maxEnd = c0e48.Rn().getMaxEnd();
            NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(c0e48).deepClone());
            NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLLLLLLIL.deepClone());
            EditModelProvider.Companion.getClass();
            InterfaceC356750Dyj magicProcessorManager$tools_camera_edit_release = C0E1T.LIZ().getMagicProcessorManager$tools_camera_edit_release();
            if (magicProcessorManager$tools_camera_edit_release != null) {
                LIZ.getClass();
                LJIIIZ(c0e48, nLETrackSlotLLLLLLIL, magicProcessorManager$tools_camera_edit_release);
                c0e48.Rn().timeSort();
            }
            LIZ.getClass();
            TrackLinkageManagerProvider.Companion.getClass();
            AbstractC349500Dn2 businessTrackLinkageManager = C356700Dye.LIZ().getBusinessTrackLinkageManager();
            if (businessTrackLinkageManager != null) {
                businessTrackLinkageManager.LIZJ(new C349510Dn3("clip_video", C1697810uHb.LJ(new C349470Dmz(nLETrackSlotDynamicCast, c0e48.LLLLLLIL(), null, 1, 20)), nLEModelDynamicCast));
            }
            if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
                C351510DqH.LJIIIZ(C351510DqH.LIZ, c0e48);
            }
            if (c0e48.Rn().getMaxEnd() > maxEnd) {
                C351510DqH.LIZ.getClass();
                C351510DqH.LIZIZ(maxEnd, c0e48);
            }
        }
    }

    public static boolean LJII(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        C363500EMy.LIZ.getClass();
        if (C363500EMy.LJIIJ(videoPublishEditModel)) {
            if (!((Boolean) C287330BNz.LIZ.getValue()).booleanValue() && !C357540E0a.LJIJI(nLEModel)) {
                return false;
            }
            return true;
        }
        return LJI(nLEModel);
    }

    public static void LJIIIZ(C0E48 c0e48, NLETrackSlot nLETrackSlot, InterfaceC356750Dyj interfaceC356750Dyj) {
        String extra;
        String extra2;
        if (!nLETrackSlot.hasExtra("ep_magic_resource_id") || (extra = nLETrackSlot.getExtra("ep_magic_resource_id")) == null) {
            extra = "";
        }
        if (!nLETrackSlot.hasExtra("ep_magic_effect_id") || (extra2 = nLETrackSlot.getExtra("ep_magic_effect_id")) == null) {
            extra2 = "";
        }
        if (!a0.LJJJIL(extra)) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
            int i = 0;
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
                        interfaceC356750Dyj.LIZJ(new C354240Dug(new C354510Dv7(null, str, str2, null, null, null, null, null, null, 0, false, 4089), nLETrackSlot, nLEModelLJI));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
