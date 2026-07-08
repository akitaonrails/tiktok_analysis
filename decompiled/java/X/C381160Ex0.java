package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ex0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381160Ex0 extends AbstractC538070L8j {
    public final C054G LJII;
    public String LJIIIIZZ;
    public AnonymousClass0956 LJIIIZ;
    public final C01GW LJIIJ;

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final int LJIL() {
        return 80;
    }

    @Override // X.InterfaceC538100L8m
    public final String getTaskName() {
        return "I2V_PRE";
    }

    public C381160Ex0() {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJII = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
        this.LJIIJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(400));
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC354490Dv5
    public final void cancel() {
        super.cancel();
        String str = this.LJIIIIZZ;
        if (str != null) {
            if (C356770Dyl.LIZ()) {
                ((InterfaceC355850DxH) this.LJIIJ.getValue()).LJII(EnumC382030EyP.CANCEL, EnumC2331909Bt.CREATION_ID, str, "GenAITaskService");
            } else {
                C23250099c.LIZLLL(this.LJII, null, null, new C353770Dtv(str, null), 3);
            }
        }
        AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIZILJ(X.C0FQS r18) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381160Ex0.LJIIZILJ(X.0FQS):boolean");
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
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        Object c098200Yq;
        String resourceFile;
        NLESegmentEffect segment;
        AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        List<String> list = c0fqs.LJIJI.LIZ;
        NLETemplateModel nLETemplateModel = c0fqs.LJIIJ;
        if (nLETemplateModel != null && (mainTrack = nLETemplateModel.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null) {
            ArrayList<NLESegmentEffect> arrayList = new ArrayList(C15438062q.LJIJJ(slots, 10));
            for (NLETrackSlot nLETrackSlot : slots) {
                C354260Dui.LIZ.getClass();
                NLEVideoEffect nLEVideoEffectLJI = C354260Dui.LJI(nLETrackSlot);
                if (nLEVideoEffectLJI != null) {
                    segment = nLEVideoEffectLJI.getSegment();
                } else {
                    segment = null;
                }
                arrayList.add(segment);
            }
            for (NLESegmentEffect nLESegmentEffect : arrayList) {
                if (nLESegmentEffect != null) {
                    NLEResourceNode resource = nLESegmentEffect.getResource();
                    if (resource != null && (resourceFile = resource.getResourceFile()) != null) {
                        ((ArrayList) list).add(resourceFile);
                    }
                    String jsonParam = nLESegmentEffect.getJsonParam();
                    if (jsonParam != null && C123100dR.LIZ(jsonParam)) {
                        try {
                            c098200Yq = new JSONObject(jsonParam).optString("editing_effect_algorithm_cache_url");
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null) {
                            ((ArrayList) list).add(c098200Yq);
                        }
                    }
                }
            }
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
            EnumC381980EyK enumC381980EyK = EnumC381980EyK.I2V;
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIIJI(com.ss.android.ugc.aweme.creative.model.CreativeInfo r35, java.lang.String r36, com.bytedance.ies.nle.editor_jni.INLEMediaSession r37, com.bytedance.ies.nle.editor_jni.NLEEditor r38, com.bytedance.ies.nle.editor_jni.NLETrackSlot r39, com.bytedance.ies.nle.editor_jni.NLEVideoEffect r40, X.InterfaceC1364105Vn<? super kotlin.Unit> r41) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381160Ex0.LJJIJIIJI(com.ss.android.ugc.aweme.creative.model.CreativeInfo, java.lang.String, com.bytedance.ies.nle.editor_jni.INLEMediaSession, com.bytedance.ies.nle.editor_jni.NLEEditor, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLEVideoEffect, X.05Vn):java.lang.Object");
    }
}
