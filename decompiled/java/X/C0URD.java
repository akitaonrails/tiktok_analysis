package X;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0URD, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0URD {
    public static boolean LJ;
    public static final C01GW<C0URD> LJFF = C452501pT.LIZ(EnumC452301pR.NONE, AFwS199S0000000_12.get$arr$(277));
    public long LIZIZ;
    public final PriorityQueue<C0URE> LIZ = new PriorityQueue<>();
    public final Stack<C0URF> LIZJ = new Stack<>();
    public final Stack<String> LIZLLL = new Stack<>();

    public final void LIZJ() {
        C20441214yg.LIZIZ("DialogPriorityManager", "onDialogHideAndShowNextPendingDialog");
        if (this.LIZJ.size() > 0) {
            this.LIZJ.pop();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pop stack,showingDialogPriorityStack:");
            sbLIZ.append(this.LIZJ);
            C20441214yg.LIZIZ("DialogPriorityManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LIZLLL.size() > 0) {
            this.LIZLLL.pop();
        }
        C0URE c0urePeek = this.LIZ.peek();
        if (c0urePeek == null || !LIZIZ(c0urePeek.LLILLJJLI)) {
            C20441214yg.LIZIZ("DialogPriorityManager", "showNextPendingDialog : next dialog is null");
            return;
        }
        C20441214yg.LIZIZ("DialogPriorityManager", "showNextPendingDialog : show next dialog");
        C786410Ut5.B4(c0urePeek.LL);
        C0UQ3 c0uq3 = c0urePeek.LLILZ;
        if (c0uq3 != null) {
            c0uq3.LIZ();
        }
        this.LIZ.poll();
        this.LIZJ.add(c0urePeek.LLILLJJLI);
        this.LIZLLL.add(c0urePeek.LLILZIL);
    }

    public C0URD() {
        C20441214yg.LIZIZ("DialogPriorityManager", "DialogPriorityManager init");
        LJ = true;
    }

    public final boolean LIZIZ(C0URF c0urf) {
        C0URF c0urfPeek;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkCanShowDialog, dialogPriority:");
        sbLIZ.append(c0urf);
        sbLIZ.append(",showingDialogPriorityStack:");
        sbLIZ.append(this.LIZJ);
        C20441214yg.LIZIZ("DialogPriorityManager", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZJ.size() > 0) {
            c0urfPeek = this.LIZJ.peek();
        } else {
            c0urfPeek = C0URF.EMPTY;
        }
        if (c0urf.getPriorityInt() > c0urfPeek.getPriorityInt()) {
            return true;
        }
        return false;
    }

    public final void LIZ(DialogC19728412Gs dialogC19728412Gs, C0URF c0urf, C0UQ3 c0uq3, String str) {
        boolean z;
        if (LIZIZ(c0urf)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show dialog, dialogPriority:");
            sbLIZ.append(c0urf.getPriorityInt());
            sbLIZ.append(",showingDialogPriorityStack:");
            sbLIZ.append(this.LIZJ);
            C20441214yg.LIZIZ("DialogPriorityManager", C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.B4(dialogC19728412Gs);
            if (c0uq3 != null) {
                c0uq3.LIZ();
            }
            this.LIZJ.add(c0urf);
            this.LIZLLL.add(str);
            return;
        }
        Iterator<C0URE> it2 = this.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                C0URE next = it2.next();
                if (str != null && Intrinsics.LJFF(str, next.LLILZIL)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("existSameDialogTagInPendingList:");
            sbLIZ2.append(str);
            sbLIZ2.append(",pendingDialogPriorityList:");
            sbLIZ2.append(this.LIZ);
            C20441214yg.LIZIZ("DialogPriorityManager", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        for (String str2 : this.LIZLLL) {
            if (str != null && Intrinsics.LJFF(str, str2)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("existSameDialogTagInShowingDialogTagStack:");
                sbLIZ3.append(str);
                sbLIZ3.append(",pendingDialogPriorityList:");
                sbLIZ3.append(this.LIZ);
                C20441214yg.LIZIZ("DialogPriorityManager", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("add pending list, dialogPriority:");
        sbLIZ4.append(c0urf.getPriorityInt());
        sbLIZ4.append(",showingDialogPriorityStack:");
        sbLIZ4.append(this.LIZJ);
        C20441214yg.LIZIZ("DialogPriorityManager", C2188811AlT.LIZIZ(sbLIZ4));
        PriorityQueue<C0URE> priorityQueue = this.LIZ;
        long j = this.LIZIZ;
        this.LIZIZ = 1 + j;
        priorityQueue.add(new C0URE(dialogC19728412Gs, c0urf, j, c0uq3, str));
    }
}
