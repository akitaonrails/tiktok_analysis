package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ex2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381180Ex2 extends AbstractC538070L8j {
    public String LJIIIIZZ;
    public AnonymousClass0956 LJIIIZ;
    public final C054G LJII = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(397));

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final int LJIL() {
        return 80;
    }

    @Override // X.InterfaceC538100L8m
    public final String getTaskName() {
        return "TRANSITION_FRAME_PRE";
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC354490Dv5
    public final void cancel() {
        super.cancel();
        String str = this.LJIIIIZZ;
        if (str != null) {
            if (C356770Dyl.LIZ()) {
                ((InterfaceC355850DxH) this.LJIIJ.getValue()).LJII(EnumC382030EyP.CANCEL, EnumC2331909Bt.CREATION_ID, str, "GenAITaskService");
            } else {
                C23250099c.LIZLLL(this.LJII, null, null, new C353740Dts(str, null), 3);
            }
        }
        AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final boolean LJIIZILJ(C0FQS c0fqs) {
        Set<Integer> setLIZIZ;
        NLETemplateModel nLETemplateModel;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot nLETrackSlot;
        VecNLEVideoEffectSPtr videoEffects;
        NLETrack mainTrack2;
        VecNLETrackSlotSPtr slots;
        VecNLEVideoEffectSPtr videoEffects2;
        NLEVideoEffect nLEVideoEffect;
        String resourceFile;
        NLEResourceNode resource;
        if (!super.LJIIZILJ(c0fqs)) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add TransitionFrameTask: ");
        sbLIZ.append(c0fqs.LJIIIZ);
        C381530Exb.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ));
        NLETemplateModel nLETemplateModel2 = c0fqs.LJIIJ;
        if (nLETemplateModel2 != null && (setLIZIZ = C0FPT.LIZIZ(nLETemplateModel2)) != null && setLIZIZ.contains(Integer.valueOf(C0CIJ.UGC_I2V_FRAME.getValue())) && 1 != 0 && (nLETemplateModel = c0fqs.LJIIJ) != null && (mainTrack = nLETemplateModel.getMainTrack()) != null && (sortedSlots = mainTrack.getSortedSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(sortedSlots)) != null && (videoEffects = nLETrackSlot.getVideoEffects()) != null && C13LP.LJJJLL(videoEffects) != null) {
            NLETemplateModel nLETemplateModel3 = c0fqs.LJIIJ;
            if (nLETemplateModel3 != null && (mainTrack2 = nLETemplateModel3.getMainTrack()) != null && (slots = mainTrack2.getSlots()) != null) {
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLL(slots);
                NLETrackSlot nLETrackSlot3 = (NLETrackSlot) C13LP.LJJLIIIJL(slots);
                if (nLETrackSlot2 != null && (videoEffects2 = nLETrackSlot2.getVideoEffects()) != null && (nLEVideoEffect = (NLEVideoEffect) C13LP.LJJJLL(videoEffects2)) != null) {
                    NLESegmentEffect segment = nLEVideoEffect.getSegment();
                    if (segment != null && (resource = segment.getResource()) != null) {
                        resourceFile = resource.getResourceFile();
                    } else {
                        resourceFile = null;
                    }
                    if (!C2286708xd.LIZJ(resourceFile)) {
                        EnumC355970DxT enumC355970DxT = EnumC355970DxT.EFFECT_PATH_NOT_EXIST_ERROR;
                        LJJIIZ(new C381350ExJ(enumC355970DxT.getCode(), enumC355970DxT.getMsg(), 4));
                        return false;
                    }
                    ArrayList arrayList = new ArrayList();
                    NLETrackSlot nLETrackSlot4 = null;
                    for (NLETrackSlot nLETrackSlot5 : slots) {
                        if (nLETrackSlot4 != null) {
                            arrayList.add(new Pair(nLETrackSlot4, nLETrackSlot5));
                        }
                        nLETrackSlot4 = nLETrackSlot5;
                    }
                    String str = c0fqs.LJ;
                    if (str == null) {
                        return false;
                    }
                    CreativeInfo creativeInfoLIZ = C0F1Q.LIZ(c0fqs.LIZIZ);
                    if (!creativeInfoLIZ.isValid()) {
                        LJJIIZ(new C381350ExJ(10001, "creativeInfo is invalid.", 4));
                        return false;
                    }
                    this.LJIIIIZZ = creativeInfoLIZ.getCreationId();
                    this.LJIIIZ = C23250099c.LIZLLL(this.LJII, null, null, new C381110Ewv(nLEVideoEffect, arrayList, c0fqs, nLETrackSlot3, this, creativeInfoLIZ, str, nLETrackSlot2.getExtra("ep_magic_effect_id"), nLETrackSlot2.getExtra("ep_magic_resource_id"), null), 3);
                }
            }
            return false;
        }
        LIZJ(c0fqs, new C381330ExH("skipped", C2097608Jq.LJIIJ(new Pair("skipped", "true"))));
        return false;
    }

    @Override // X.AbstractC538070L8j
    public final void LJJIIZ(C381350ExJ c381350ExJ) {
        AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        super.LJJIIZ(c381350ExJ);
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final void LIZJ(C0FQS c0fqs, C381330ExH c381330ExH) {
        AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        super.LIZJ(c0fqs, c381330ExH);
    }

    public final void LJJIJ(C0FQS c0fqs, List<C381230Ex7> list) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ASYNC_TASK size=");
        ArrayList arrayList = (ArrayList) list;
        sbLIZ.append(arrayList.size());
        C381530Exb.LIZLLL(this, C2188811AlT.LIZIZ(sbLIZ));
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            C381230Ex7 c381230Ex7 = (C381230Ex7) next;
            String str = c381230Ex7.LIZ;
            EnumC381980EyK enumC381980EyK = EnumC381980EyK.TRANSITION_FRAME;
            if (Intrinsics.LJFF(str, enumC381980EyK.getTypeName())) {
                C381530Exb.LIZLLL(this, String.valueOf(c381230Ex7));
            } else {
                C381530Exb.LIZIZ(this, String.valueOf(c381230Ex7));
            }
            if (Intrinsics.LJFF(c381230Ex7.LIZ, enumC381980EyK.getTypeName()) && !Intrinsics.LJFF(c381230Ex7.LIZIZ, "CANCELED") && !c381230Ex7.LIZJ) {
                arrayList2.add(next);
            }
        }
        Object obj = null;
        if (arrayList2.isEmpty()) {
            LIZJ(c0fqs, null);
            return;
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (Intrinsics.LJFF(((C381230Ex7) next2).LIZIZ, "FAILED")) {
                obj = next2;
                break;
            }
        }
        C381230Ex7 c381230Ex72 = (C381230Ex7) obj;
        if (c381230Ex72 != null) {
            c0fqs.LJIJI.LIZIZ = true;
            LJJIIZ(new C381350ExJ(c381230Ex72.LIZLLL, c381230Ex72.LJ, 4));
        } else {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                i += ((C381230Ex7) it4.next()).LJFF;
            }
            LJJIIZI(((i * 1.0f) / 5) * arrayList2.size());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIIJI(com.ss.android.ugc.aweme.creative.model.CreativeInfo r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, kotlin.Pair<? extends com.bytedance.ies.nle.editor_jni.NLETrackSlot, ? extends com.bytedance.ies.nle.editor_jni.NLETrackSlot> r42, java.lang.String r43, java.lang.String r44, X.InterfaceC1364105Vn<? super kotlin.Unit> r45) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381180Ex2.LJJIJIIJI(com.ss.android.ugc.aweme.creative.model.CreativeInfo, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
