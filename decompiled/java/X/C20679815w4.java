package X;

import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;

/* JADX INFO: renamed from: X.15w4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20679815w4 implements InterfaceC20680215w8<C20680115w7> {
    public static final C20679815w4 LIZ = new C20679815w4();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20680215w8
    public final void LIZ(C20679515w1 c20679515w1) {
        C20646415qg c20646415qg = ((C20680115w7) c20679515w1.LIZIZ).LIZ;
        if (c20646415qg == null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("outreach_flow_report_progress", "outreach flow record cache failed! cause 'OutreachDataKey' is null!");
            C20571615ec.LIZ.getClass();
            C20571615ec.LIZLLL("OutreachRecordCacheProcessor: remove memory item cache success!");
            return;
        }
        C20679915w5.Companion.getClass();
        OutreachFlowReportItem orCreateRecord = C20679915w5.instance.getOrCreateRecord(c20646415qg);
        T t = c20679515w1.LIZIZ;
        if (((C20680115w7) t).LIZIZ != null) {
            orCreateRecord.setOutreachInfo(((C20680115w7) t).LIZIZ);
        }
        if (C123100dR.LIZ(((C20680115w7) c20679515w1.LIZIZ).LIZLLL)) {
            orCreateRecord.setTriggerScene(((C20680115w7) c20679515w1.LIZIZ).LIZLLL);
        }
        if (C123100dR.LIZ(((C20680115w7) c20679515w1.LIZIZ).LIZJ)) {
            orCreateRecord.setTriggerTiming(((C20680115w7) c20679515w1.LIZIZ).LIZJ);
        }
        ((C20680115w7) c20679515w1.LIZIZ).LJI = orCreateRecord;
        c20679515w1.LIZ();
    }
}
