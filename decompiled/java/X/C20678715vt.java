package X;

import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15vt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20678715vt implements InterfaceC20680215w8<C20678915vv> {
    public final C807950Vmj LIZ;

    public C20678715vt(C807950Vmj c807950Vmj) {
        this.LIZ = c807950Vmj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC20680215w8
    public final void LIZ(C20679515w1 c20679515w1) {
        String strLIZ;
        OutreachInfo outreachInfo;
        OutreachFlowReportItem orCreateRecord;
        InterfaceC20677715vj interfaceC20677715vj = ((C20678915vv) c20679515w1.LIZIZ).LIZ;
        if (interfaceC20677715vj == null || (strLIZ = interfaceC20677715vj.LIZ()) == null || (outreachInfo = ((C20678915vv) c20679515w1.LIZIZ).LIZIZ) == null) {
            return;
        }
        if (C20677515vh.LIZIZ(outreachInfo)) {
            C807950Vmj c807950Vmj = this.LIZ;
            if (c807950Vmj != null) {
                AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(517);
                Object objInvoke = c807950Vmj.LJ.get(strLIZ);
                if (objInvoke == null) {
                    objInvoke = aFwS221S0000000_31.invoke();
                    c807950Vmj.LJ.put((K) strLIZ, (V) objInvoke);
                    if (!c807950Vmj.LJIIIZ) {
                        c807950Vmj.LIZIZ(strLIZ, objInvoke);
                    }
                }
                orCreateRecord = (OutreachFlowReportItem) objInvoke;
            } else {
                orCreateRecord = null;
                if (C123100dR.LIZ(((C20678915vv) c20679515w1.LIZIZ).LIZJ) && orCreateRecord != null) {
                    orCreateRecord.setTriggerScene(((C20678915vv) c20679515w1.LIZIZ).LIZJ);
                }
                ((C20678915vv) c20679515w1.LIZIZ).LJFF = orCreateRecord;
                c20679515w1.LIZ();
            }
        } else {
            C20677815vk.Companion.getClass();
            orCreateRecord = C20677815vk.instance.getOrCreateRecord(strLIZ);
        }
        if (orCreateRecord != null) {
            orCreateRecord.setOutreachInfo(((C20678915vv) c20679515w1.LIZIZ).LIZIZ);
        }
        if (C123100dR.LIZ(((C20678915vv) c20679515w1.LIZIZ).LIZJ)) {
            orCreateRecord.setTriggerScene(((C20678915vv) c20679515w1.LIZIZ).LIZJ);
        }
        ((C20678915vv) c20679515w1.LIZIZ).LJFF = orCreateRecord;
        c20679515w1.LIZ();
    }
}
