package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13it, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20088513it extends AbstractC20055413dY implements InterfaceC20051913cz {
    public C1776880wL8 LLJJ;
    public InterfaceC20089713j5 LLJJI;
    public final C20088713iv LLJJIII;
    public boolean LLJJIJI = true;
    public C20053713dH LLJJIJIIJIL;

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
        if (C258120A9q.LIZ()) {
            this.LLJJIJI = true;
            C20088713iv c20088713iv = this.LLJJIII;
            c20088713iv.LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleAttachNode itemId: ");
            sbLIZ.append(c20088713iv.LIZ.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        boolean z;
        if (C258120A9q.LIZ()) {
            C20053713dH c20053713dH = this.LLJJIJIIJIL;
            if (c20053713dH != null) {
                int iHashCode = c20053713dH.hashCode();
                ConcurrentHashMap<Integer, List<WeakReference<C20088513it>>> concurrentHashMap = C20089413j2.LIZJ;
                if (concurrentHashMap.containsKey(Integer.valueOf(iHashCode))) {
                    List<WeakReference<C20088513it>> list = concurrentHashMap.get(Integer.valueOf(iHashCode));
                    if (list != null) {
                        Iterator<WeakReference<C20088513it>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().get(), this)) {
                                it2.remove();
                                z = true;
                                break;
                            }
                        }
                        z = false;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("removeCurNodeToRoot deleteSuccess: ");
                        sbLIZ.append(z);
                        sbLIZ.append("  node: ");
                        sbLIZ.append(this.LLJJ.LIZ);
                        C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        z = false;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("removeCurNodeToRoot deleteSuccess: ");
                        sbLIZ2.append(z);
                        sbLIZ2.append("  node: ");
                        sbLIZ2.append(this.LLJJ.LIZ);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
                this.LLJJIJIIJIL = null;
            }
            C20088713iv c20088713iv = this.LLJJIII;
            c20088713iv.LIZ("handleDetachNode");
            c20088713iv.LIZIZ();
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComposeExposureModifierNode(rootNode=");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LLJJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    @Override // X.InterfaceC20051913cz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIII(p2.j1 r9) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20088513it.LLIIII(p2.j1):void");
    }

    public C20088513it(C1776880wL8 c1776880wL8, InterfaceC20089713j5 interfaceC20089713j5) {
        this.LLJJ = c1776880wL8;
        this.LLJJI = interfaceC20089713j5;
        this.LLJJIII = new C20088713iv(this.LLJJ, this.LLJJI);
    }
}
