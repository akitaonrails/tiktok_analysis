package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ex1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381170Ex1 extends AbstractC538070L8j {
    public String LJIIIIZZ;
    public AnonymousClass0956 LJIIIZ;
    public final C054G LJII = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(399));

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final int LJIL() {
        return 80;
    }

    @Override // X.InterfaceC538100L8m
    public final String getTaskName() {
        return "TEMPLATE_I2I";
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC354490Dv5
    public final void cancel() {
        super.cancel();
        String str = this.LJIIIIZZ;
        if (str != null) {
            if (C356770Dyl.LIZ()) {
                ((InterfaceC355850DxH) this.LJIIJ.getValue()).LJII(EnumC382030EyP.CANCEL, EnumC2331909Bt.CREATION_ID, str, "GenAITaskService");
            } else {
                C23250099c.LIZLLL(this.LJII, null, null, new C353760Dtu(str, null), 3);
            }
        }
        AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final boolean LJIIZILJ(C0FQS c0fqs) {
        boolean z;
        String taskType;
        EditorProAIGCTemplateModel editorProAIGCTemplateModelLIZ;
        List<String> imagePaths;
        NLESegment mainSegment;
        NLEResourceNode resource;
        String resourceFile;
        Set<Integer> setLIZIZ;
        if (!super.LJIIZILJ(c0fqs)) {
            return false;
        }
        NLETemplateModel nLETemplateModel = c0fqs.LJIIJ;
        if (nLETemplateModel != null && (setLIZIZ = C0FPT.LIZIZ(nLETemplateModel)) != null && setLIZIZ.contains(Integer.valueOf(C0CIJ.UGC_NEW_AI_CREATE_I2I.getValue()))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            LIZJ(c0fqs, new C381330ExH("skipped", C2097608Jq.LJIIJ(new Pair("skipped", "true"))));
            return false;
        }
        ArrayList arrayList = new ArrayList();
        NLETemplateModel nLETemplateModel2 = c0fqs.LJIIJ;
        if (nLETemplateModel2 != null) {
            int size = nLETemplateModel2.getTracks().size();
            for (int i = 0; i < size; i++) {
                NLETrack nLETrack = nLETemplateModel2.getTracks().get(i);
                if (nLETrack.getSortedSlots() != null) {
                    int size2 = nLETrack.getSortedSlots().size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        NLETrackSlot nLETrackSlot = nLETrack.getSortedSlots().get(i2);
                        if (C377740ErU.LIZ(nLETrackSlot) != null && nLETrackSlot.getRenderProxy() == null) {
                            EditorProAIGCTemplateModel editorProAIGCTemplateModelLIZ2 = C377740ErU.LIZ(nLETrackSlot);
                            if (editorProAIGCTemplateModelLIZ2 != null) {
                                taskType = editorProAIGCTemplateModelLIZ2.getTaskType();
                            } else {
                                taskType = null;
                            }
                            if (Intrinsics.LJFF(taskType, "image2image") && (editorProAIGCTemplateModelLIZ = C377740ErU.LIZ(nLETrackSlot)) != null && (imagePaths = editorProAIGCTemplateModelLIZ.getImagePaths()) != null && imagePaths.size() == 1 && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null && (resourceFile = resource.getResourceFile()) != null && resourceFile.length() > 0) {
                                arrayList.add(nLETrackSlot);
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            LIZJ(c0fqs, new C381330ExH("skipped", C2097608Jq.LJIIJ(new Pair("skipped", "true"))));
            return false;
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
        this.LJIIIZ = C23250099c.LIZLLL(this.LJII, null, null, new C381070Ewr(arrayList, this, creativeInfoLIZ, str, c0fqs, null), 3);
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
            EnumC381980EyK enumC381980EyK = EnumC381980EyK.TEMPLATE_I2I;
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

    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIIJI(com.ss.android.ugc.aweme.creative.model.CreativeInfo r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, com.bytedance.ies.nle.editor_jni.NLETrackSlot r36, X.InterfaceC1364105Vn<? super kotlin.Unit> r37) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381170Ex1.LJJIJIIJI(com.ss.android.ugc.aweme.creative.model.CreativeInfo, java.lang.String, java.lang.String, java.lang.String, com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.05Vn):java.lang.Object");
    }
}
