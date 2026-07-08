package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0md6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403620md6 {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, List<String> list, EnumC1403590md3 enumC1403590md3, String str, String str2) {
        String key;
        VecNLETrackSlotSPtr slots;
        String extra;
        NLESegment mainSegment;
        String extra2;
        NLEModel nleModel = videoPublishEditModel.getNleModel();
        if (nleModel != null) {
            ArrayList<EffectPointModel> effectList = videoPublishEditModel.getEffectList();
            ArrayList arrayList = new ArrayList();
            for (EffectPointModel effectPointModel : effectList) {
                if (C1403700mdE.LIZLLL(effectPointModel)) {
                    arrayList.add(effectPointModel);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((EffectPointModel) it2.next()).getKey());
            }
            AwS388S0200000_22 awS388S0200000_22 = new AwS388S0200000_22(arrayList2, list, (List<String>) 16);
            Iterator<NLETrack> it3 = C348520DlS.LIZ(nleModel).iterator();
            while (it3.hasNext()) {
                VecNLETrackSlotSPtr slots2 = it3.next().getSlots();
                if (slots2 != null) {
                    for (NLETrackSlot nLETrackSlot : slots2) {
                        if (nLETrackSlot != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (extra2 = mainSegment.getExtra(str)) != null && extra2.length() > 0) {
                            awS388S0200000_22.invoke(extra2);
                        }
                    }
                }
            }
            NLETrack mainTrack = nleModel.getMainTrack();
            if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
                for (NLETrackSlot nLETrackSlot2 : slots) {
                    if (nLETrackSlot2 != null && (extra = nLETrackSlot2.getExtra(str2)) != null && extra.length() > 0) {
                        awS388S0200000_22.invoke(extra);
                    }
                }
                return;
            }
            return;
        }
        AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(list, (List<CreateAnchorInfo>) 93);
        for (EffectPointModel effectPointModel2 : videoPublishEditModel.creativeModel.editEffectModel.effectList) {
            int i = C1403610md5.LIZ[enumC1403590md3.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    key = effectPointModel2.getResourceId();
                } else {
                    throw new C1954807lC();
                }
            } else {
                key = effectPointModel2.getKey();
            }
            awS601S0100000_22.invoke(key);
        }
    }
}
