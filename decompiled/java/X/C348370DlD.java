package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DlD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348370DlD extends AbstractC348050Dkh<List<? extends C348380DlE>> {
    public static List LIZIZ(NLEModel nLEModel) {
        ArrayList arrayList = new ArrayList();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (Intrinsics.LJFF(C348350DlB.LJI(nLETrack), "NORMAL")) {
                arrayList2.add(nLETrack);
            }
        }
        ArrayList<NLETrackSlot> arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSortedSlots(), arrayList3);
        }
        for (NLETrackSlot nLETrackSlot : arrayList3) {
            NLESegmentEffect nLESegmentEffectDynamicCast = NLESegmentEffect.dynamicCast(nLETrackSlot.getMainSegment());
            if (nLESegmentEffectDynamicCast != null) {
                arrayList.add(LJ(nLESegmentEffectDynamicCast, nLETrackSlot));
            }
            NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (nLESegmentComposerFilterDynamicCast != null) {
                arrayList.add(LIZLLL(nLESegmentComposerFilterDynamicCast, nLETrackSlot));
            }
        }
        return arrayList;
    }

    public static C348380DlE LIZLLL(NLESegmentComposerFilter nLESegmentComposerFilter, NLETrackSlot nLETrackSlot) {
        C348380DlE c348380DlE = new C348380DlE();
        c348380DlE.LIZLLL = nLESegmentComposerFilter.getEffectSDKFilter().getResourceFile();
        String str = (String) C13LP.LJJJLZIJ(0, nLESegmentComposerFilter.getEffectTags());
        if (str == null) {
            str = "";
        }
        c348380DlE.LJ = str;
        LIZJ(c348380DlE, nLESegmentComposerFilter, nLETrackSlot);
        return c348380DlE;
    }

    public static C348380DlE LJ(NLESegmentEffect nLESegmentEffect, NLETrackSlot nLETrackSlot) {
        C348380DlE c348380DlE = new C348380DlE();
        c348380DlE.LIZLLL = nLESegmentEffect.getEffectSDKEffect().getResourceFile();
        c348380DlE.LJ = nLESegmentEffect.getEffectTag();
        LIZJ(c348380DlE, nLESegmentEffect, nLETrackSlot);
        return c348380DlE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:0|2|(1:4)(1:5)|(3:178|6|7)|(19:9|(1:11)(7:166|12|(1:14)|15|18|(1:20)|21)|22|(10:172|24|(1:26)(1:28)|27|31|(1:33)|35|(1:37)(1:34)|38|(9:170|40|(1:42)(1:44)|43|47|(1:49)|50|(1:52)(1:59)|53)(0))(0)|133|176|134|137|(1:139)|140|(1:142)|143|(1:145)|146|(1:148)|149|(1:153)|154|(2:158|159)(1:180))|54|(21:56|(2:58|60)(7:160|61|(1:63)|64|67|(1:69)|70)|71|(12:162|73|(1:75)(1:77)|76|80|(1:82)|84|(1:86)(1:83)|87|(1:89)(7:164|90|(1:92)|93|96|(1:98)|99)|100|(9:168|102|(1:104)(1:106)|105|109|(1:111)|112|(1:114)(1:119)|115)(0))(0)|133|176|134|137|(0)|140|(0)|143|(0)|146|(0)|149|(2:151|153)|154|(1:156)|158|159)|116|(8:118|174|120|(1:122)|123|126|(1:128)|129)|130|133|176|134|137|(0)|140|(0)|143|(0)|146|(0)|149|(0)|154|(0)|158|159) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01e3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r0 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C348380DlE r7, com.bytedance.ies.nle.editor_jni.NLESegment r8, com.bytedance.ies.nle.editor_jni.NLETrackSlot r9) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C348370DlD.LIZJ(X.0DlE, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }
}
