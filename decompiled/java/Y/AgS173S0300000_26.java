package Y;

import X.C1346605Ou;
import X.C1704480uSM;
import X.C1704510uSP;
import X.C1715330ujr;
import X.C1715830ukf;
import X.C1715910ukn;
import X.C1715930ukp;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import android.content.Context;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS101S0110000_14;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class AgS173S0300000_26 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$0(X.C1346605Ou r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1704520uSQ
            if (r0 == 0) goto L27
            r4 = r9
            X.0uSQ r4 = (X.C1704520uSQ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r5 = 1
            if (r0 == 0) goto L2d
            if (r0 == r5) goto L7d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L27:
            X.0uSQ r4 = new X.0uSQ
            r4.<init>(r7, r9)
            goto L12
        L2d:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r0 = r7.l0
            X.0uSM r0 = (X.C1704480uSM) r0
            java.util.concurrent.atomic.AtomicInteger r0 = r0.LIZJ
            int r0 = r0.get()
            java.lang.String r3 = "WorkflowAutoLifecycle"
            if (r0 > 0) goto L8b
            java.lang.Object r0 = r7.l1
            java.util.List r0 = (java.util.List) r0
            boolean r0 = X.C1407205f4.LIZ(r8, r0)
            if (r0 == 0) goto L88
            X.0LX3 r6 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "pause workflow="
            r1.append(r0)
            java.lang.Object r0 = r7.l0
            X.0uSM r0 = (X.C1704480uSM) r0
            java.lang.String r0 = r0.LIZ
            r1.append(r0)
            java.lang.String r0 = " after drain nodes finished"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZLLL(r6, r3, r0)
            java.lang.Object r0 = r7.l2
            X.0uSP r0 = (X.C1704510uSP) r0
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r1 = r0.LIZ
            java.lang.Object r0 = r7.l0
            X.0uSM r0 = (X.C1704480uSM) r0
            java.lang.String r0 = r0.LIZ
            r4.LLILLL = r5
            X.0LiW r0 = r1.LJIIJJI(r0)
            if (r0 != r2) goto L80
            return r2
        L7d:
            X.C155000ia.LIZIZ(r1)
        L80:
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "drain finished"
            r1.<init>(r0)
            throw r1
        L88:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L8b:
            X.0LX3 r2 = X.C0LX3.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "cancel draining workflow="
            r1.append(r0)
            java.lang.Object r0 = r7.l0
            X.0uSM r0 = (X.C1704480uSM) r0
            java.lang.String r0 = r0.LIZ
            r1.append(r0)
            java.lang.String r0 = " due to new observer"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZLLL(r2, r3, r0)
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "new observer attached"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS173S0300000_26.LIZ$0(X.05Ou, X.05Vn):java.lang.Object");
    }

    public static final Object emit$0(AgS173S0300000_26 agS173S0300000_26, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1715830ukf c1715830ukf = (C1715830ukf) obj;
        if (c1715830ukf.LIZIZ) {
            C1715330ujr.LIZJ(((C1715930ukp) agS173S0300000_26.l0).LJIIJJI);
        } else {
            View view = ((C1715930ukp) agS173S0300000_26.l0).LJIIJJI;
            if (view != null && view.getVisibility() != 4) {
                C786410Ut5.LJLLLLLL(4, view);
            }
        }
        boolean z = !c1715830ukf.LIZ;
        ((C1715930ukp) agS173S0300000_26.l0).LJIIJ.setEnabled(z);
        ((C1715930ukp) agS173S0300000_26.l0).LIZLLL.LJJ(new AwS101S0110000_14(z, (BioEnrollFragment) agS173S0300000_26.l1, 2), "skip");
        c1715830ukf.LJFF.LIZ(new AwS600S0100000_21((BioEnrollFragment) agS173S0300000_26.l1, 106));
        c1715830ukf.LIZJ.LIZ(new AwS605S0100000_26((BioEnrollFragment) agS173S0300000_26.l1, 80));
        c1715830ukf.LIZLLL.LIZ(new AwS605S0100000_26((BioEnrollFragment) agS173S0300000_26.l1, 81));
        c1715830ukf.LJ.LIZ(new AwS605S0100000_26((BioEnrollFragment) agS173S0300000_26.l1, 82));
        c1715830ukf.LJI.LIZ(new AwS392S0200000_26((Context) agS173S0300000_26.l2, (BioEnrollFragment) agS173S0300000_26.l1, 9));
        c1715830ukf.LJII.LIZ(new AwS392S0200000_26(c1715830ukf, (BioEnrollFragment) agS173S0300000_26.l1, 10));
        c1715830ukf.LJIIIZ.LIZ(new AwS605S0100000_26((BioEnrollFragment) agS173S0300000_26.l1, 83));
        BioEnrollFragment bioEnrollFragment = (BioEnrollFragment) agS173S0300000_26.l1;
        BottomSheetBehavior<?> bottomSheetBehavior = bioEnrollFragment.LLJI;
        if (bottomSheetBehavior != null && c1715830ukf.LIZ) {
            C1715910ukn c1715910ukn = bioEnrollFragment.NR().LLILZ;
            if ((Intrinsics.LJFF(c1715910ukn.LJFF, "FIXED_SETTINGS") || c1715910ukn.LJFF.length() == 0) && bottomSheetBehavior.getState() != 5) {
                bottomSheetBehavior.setState(5);
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object emit$1(AgS173S0300000_26 agS173S0300000_26, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS173S0300000_26.LIZ$0((C1346605Ou) obj, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS173S0300000_26(Object obj, C1704480uSM c1704480uSM, List<String> list, C1704510uSP c1704510uSP) {
        this.$t = c1704510uSP;
        this.l0 = obj;
        this.l1 = c1704480uSM;
        this.l2 = list;
    }
}
