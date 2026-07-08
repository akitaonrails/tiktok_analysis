package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.templatecore.templatedata.TextStickerBizModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0EK3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EK3 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(277));

    public final void LIZ() {
        boolean zLJI = MethodIDManager.LJI(202421);
        C1453060nuq.LIZ((InterfaceC1635410sex) this.LIZ.getValue());
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LIZIZ(NLEModel nLEModel) {
        C0E4Z.LIZ.getClass();
        if (!C0E4Z.LJ(nLEModel)) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1431005iu(null), 3);
    }

    public final void LIZJ(NLEModel nLEModel) {
        Pair<String, String> pairLIZJ;
        String second;
        NLESegment mainSegment;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getTrackType() == NLETrackType.STICKER) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack2.getSlots());
                if (nLETrackSlot != null) {
                    mainSegment = nLETrackSlot.getMainSegment();
                } else {
                    mainSegment = null;
                }
                if (NLESegmentTextSticker.dynamicCast((NLENode) mainSegment) != null) {
                    arrayList.add(nLETrack);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
            if (slots != null) {
                Iterator<NLETrackSlot> it3 = slots.iterator();
                while (it3.hasNext()) {
                    try {
                        TextStickerBizModel textStickerBizModel = (TextStickerBizModel) C0CHQ.LIZ().getGson().LJII(it3.next().getExtra("biz_data"), TextStickerBizModel.class);
                        if (textStickerBizModel != null && (pairLIZJ = C0FGD.LIZJ(textStickerBizModel.ttsInfo.voiceResId)) != null && (second = pairLIZJ.getSecond()) != null && second.length() > 0) {
                            linkedHashSet.add(second);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C201955140j.LJI("EPModelPreloader.preloadTTSEffects error", e);
                    }
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("panel", "speaking-voice");
        ((InterfaceC1635410sex) this.LIZ.getValue()).Cg(C13LP.LLIIII(linkedHashSet), linkedHashMap, new IFetchEffectListByIdsListener() { // from class: X.0EKI
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
            public final void onFail(ExceptionResult exceptionResult) {
                Integer numValueOf;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetch voice res failed,code: ");
                String msg = null;
                if (exceptionResult != null) {
                    numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(" msg: ");
                if (exceptionResult != null) {
                    msg = exceptionResult.getMsg();
                }
                sbLIZ.append(msg);
                C201955140j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectListResponse effectListResponse) {
                List<Effect> data;
                EffectListResponse effectListResponse2 = effectListResponse;
                if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null) {
                    for (Effect effect : data) {
                        C0LE8.LIZ.getClass();
                        C0LE8.LJFF.LIZJ(effect, "speaking-voice", effect.getResourceId());
                    }
                    return;
                }
                C201955140j.LJIIZILJ("fetch voice res success but data is empty");
            }
        });
    }
}
