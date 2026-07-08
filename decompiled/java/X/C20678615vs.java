package X;

import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.15vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20678615vs implements InterfaceC20680215w8<C20678915vv> {
    public final C822720WPe LIZ;
    public final C807950Vmj LIZIZ;
    public final List<InterfaceC20680515wB> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC20680215w8
    public final void LIZ(C20679515w1 c20679515w1) {
        String strLIZ;
        OutreachFlowReportItem outreachFlowReportItem;
        InterfaceC20677715vj interfaceC20677715vj = ((C20678915vv) c20679515w1.LIZIZ).LIZ;
        if (interfaceC20677715vj == null || (strLIZ = interfaceC20677715vj.LIZ()) == null || (outreachFlowReportItem = ((C20678915vv) c20679515w1.LIZIZ).LJFF) == null) {
            return;
        }
        if (!C20677515vh.LIZIZ(outreachFlowReportItem.outreachInfo)) {
            c20679515w1.LIZ();
            return;
        }
        this.LIZ.LIZJ(strLIZ, outreachFlowReportItem);
        C807950Vmj c807950Vmj = this.LIZIZ;
        if (c807950Vmj != null) {
            c807950Vmj.LJ.put((K) strLIZ, (V) outreachFlowReportItem);
            if (!c807950Vmj.LJIIIZ) {
                c807950Vmj.LIZIZ(strLIZ, outreachFlowReportItem);
            }
        }
        C20677815vk.Companion.getClass();
        C20677815vk.instance.removeRecord(strLIZ);
        C807950Vmj c807950Vmj2 = this.LIZIZ;
        if (c807950Vmj2 != null) {
            for (InterfaceC20680515wB interfaceC20680515wB : this.LIZJ) {
                new HashMap(c807950Vmj2.LJ);
                interfaceC20680515wB.LIZ();
            }
        }
        c20679515w1.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20678615vs(C822720WPe c822720WPe, C807950Vmj c807950Vmj, List<? extends InterfaceC20680515wB> list) {
        this.LIZ = c822720WPe;
        this.LIZIZ = c807950Vmj;
        this.LIZJ = list;
    }
}
