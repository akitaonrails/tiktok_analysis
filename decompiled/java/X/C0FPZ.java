package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.EffectMobParams;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FPZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FPZ {
    public static final C0FPZ LIZ = new C0FPZ();

    public static EffectMobParams LIZJ(EffectModel effectModel) {
        boolean z;
        String str = effectModel.key;
        String str2 = effectModel.entrancePoint;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = effectModel.resourceId;
        if (str4 == null) {
            str4 = "";
        }
        int i = effectModel.index;
        boolean z2 = effectModel.isFromEditPro;
        if (C1403680mdC.LIZLLL(effectModel).length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str5 = effectModel.category;
        if (str5 != null) {
            str3 = str5;
        }
        return new EffectMobParams(i, 1024, System.currentTimeMillis(), str2, str, str4, "", str3, C1403680mdC.LIZLLL(effectModel), z2, z);
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, InterfaceC1446740nke interfaceC1446740nke) {
        NLEModel nLEModelLIZ;
        C356830Dyr c356830Dyr;
        String extra;
        String extra2;
        String extra3;
        InterfaceC1452170ntP value = interfaceC1446740nke.g().getValue();
        if (value == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null) {
            return;
        }
        InterfaceC356850Dyt interfaceC356850DytAz1 = interfaceC1446740nke.az1();
        if ((interfaceC356850DytAz1 instanceof C356830Dyr) && (c356830Dyr = (C356830Dyr) interfaceC356850DytAz1) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) c356830Dyr.LJIJI()).iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
                if (slots != null) {
                    Iterator<NLETrackSlot> it3 = slots.iterator();
                    while (it3.hasNext()) {
                        NLESegment mainSegment = it3.next().getMainSegment();
                        if (mainSegment != null) {
                            extra3 = mainSegment.getExtra("nleExtraEffectKey");
                        } else {
                            extra3 = null;
                        }
                        arrayList.add(extra3);
                    }
                }
            }
            Iterator<NLETrack> it4 = C351220Dpo.LJJIJLIJ(nLEModelLIZ).iterator();
            while (it4.hasNext()) {
                Iterator<NLETrackSlot> it5 = it4.next().getSlots().iterator();
                while (it5.hasNext()) {
                    NLESegment mainSegment2 = it5.next().getMainSegment();
                    if (mainSegment2 != null) {
                        extra2 = mainSegment2.getExtra("nleExtraEffectKey");
                    } else {
                        extra2 = null;
                    }
                    arrayList.add(extra2);
                }
            }
            VecNLETrackSPtr tracks = nLEModelLIZ.getTracks();
            ArrayList arrayList2 = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (Intrinsics.LJFF(C348350DlB.LJI(nLETrack), "TIME")) {
                    arrayList2.add(nLETrack);
                }
            }
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                Iterator<NLETrackSlot> it7 = ((NLETrack) it6.next()).getSlots().iterator();
                while (it7.hasNext()) {
                    NLESegment mainSegment3 = it7.next().getMainSegment();
                    if (mainSegment3 != null) {
                        extra = mainSegment3.getExtra("nleExtraEffectKey");
                    } else {
                        extra = null;
                    }
                    arrayList.add(extra);
                }
            }
            Iterator<EffectPointModel> it8 = interfaceC1446740nke.o9().iterator();
            while (it8.hasNext()) {
                arrayList.add(it8.next().getKey());
            }
            Iterator<EffectMobParams> it9 = videoPublishEditModel.creativeModel.mixEditingModel.effectMobParamsList.iterator();
            while (it9.hasNext()) {
                EffectMobParams next = it9.next();
                if (arrayList.contains(next.effectId)) {
                    LIZ(videoPublishEditModel, next, null);
                    it9.remove();
                }
            }
        }
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, EffectMobParams effectMobParams, Function0 function0) {
        String str;
        C1412440mrK.LIZ.getClass();
        C0LAB c0labLIZJ = C1412440mrK.LIZJ(videoPublishEditModel, function0);
        c0labLIZJ.LIZ(effectMobParams.index + 1, "index");
        c0labLIZJ.LIZ(effectMobParams.isEditorPro ? 1 : 0, "is_editor_pro");
        c0labLIZJ.LJ("effect_resource_id", effectMobParams.effectResourceId);
        c0labLIZJ.LJ("music_id", effectMobParams.musicId);
        if (effectMobParams.isEditProp) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLIZJ.LJ("is_edit_prop", str);
        c0labLIZJ.LJ("effect_entrance_position", effectMobParams.effectEntrancePosition);
        c0labLIZJ.LIZIZ(System.currentTimeMillis() - effectMobParams.applyTime, "duration");
        c0labLIZJ.LJ("tab_name", effectMobParams.tabName);
        if (effectMobParams.isEditProp) {
            c0labLIZJ.LJ("prop_id", effectMobParams.propId);
            c0labLIZJ.LJ("effect_id", "");
        } else {
            c0labLIZJ.LJ("prop_id", "");
            c0labLIZJ.LJ("effect_id", effectMobParams.effectId);
        }
        if (effectMobParams.isMixEditRecommend) {
            c0labLIZJ.LJ("mix_request_id", videoPublishEditModel.creativeModel.mixEditingModel.requestId);
        }
        C565300MFc.LIZ(videoPublishEditModel, c0labLIZJ);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("effect_play_end", c0labLIZJ.LIZ);
    }
}
