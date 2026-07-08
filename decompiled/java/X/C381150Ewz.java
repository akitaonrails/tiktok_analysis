package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ewz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381150Ewz extends AbstractC538070L8j {
    public String LJIIIIZZ;
    public AnonymousClass0956 LJIIIZ;
    public C0CI4 LJIIJJI;
    public final C054G LJII = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public Set<Integer> LJIIJ = C08CX.INSTANCE;
    public final C01GW LJIIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(398));

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final int LJIL() {
        return 80;
    }

    @Override // X.InterfaceC538100L8m
    public final String getTaskName() {
        return "TEMPLATE_FL2V";
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC354490Dv5
    public final void cancel() {
        super.cancel();
        String str = this.LJIIIIZZ;
        if (str != null) {
            if (C356770Dyl.LIZ()) {
                ((InterfaceC355850DxH) this.LJIIL.getValue()).LJII(EnumC382030EyP.CANCEL, EnumC2331909Bt.CREATION_ID, str, "GenAITaskService");
            } else {
                C23250099c.LIZLLL(this.LJII, null, null, new C353750Dtt(str, null), 3);
            }
        }
        AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public static boolean LJJIJIIJI(NLETrackSlot nLETrackSlot) {
        String taskType;
        EditorProAIGCTemplateModel editorProAIGCTemplateModelLIZ = C377740ErU.LIZ(nLETrackSlot);
        String taskType2 = null;
        if (editorProAIGCTemplateModelLIZ != null) {
            taskType = editorProAIGCTemplateModelLIZ.getTaskType();
        } else {
            taskType = null;
        }
        if (!Intrinsics.LJFF(taskType, "image2image")) {
            EditorProAIGCTemplateModel editorProAIGCTemplateModelLIZ2 = C377740ErU.LIZ(nLETrackSlot);
            if (editorProAIGCTemplateModelLIZ2 != null) {
                taskType2 = editorProAIGCTemplateModelLIZ2.getTaskType();
            }
            if (!Intrinsics.LJFF(taskType2, "text2image")) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIZILJ(X.C0FQS r19) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381150Ewz.LJIIZILJ(X.0FQS):boolean");
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
            EnumC381980EyK enumC381980EyK = EnumC381980EyK.TEMPLATE_FL2V;
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIIJIL(com.ss.android.ugc.aweme.creative.model.CreativeInfo r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, kotlin.Pair<? extends com.bytedance.ies.nle.editor_jni.NLETrackSlot, ? extends com.bytedance.ies.nle.editor_jni.NLETrackSlot> r42, X.InterfaceC1364105Vn<? super kotlin.Unit> r43) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381150Ewz.LJJIJIIJIL(com.ss.android.ugc.aweme.creative.model.CreativeInfo, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair, X.05Vn):java.lang.Object");
    }
}
