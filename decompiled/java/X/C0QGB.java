package X;

import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0QGB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QGB extends AbstractC1542100qES {
    public final WeakReference<DynamicSingleIntermediateFragmentNew> LL;
    public TemplateData LLILLJJLI;
    public final ArrayList<TemplateData> LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    @Override // X.AbstractC1537870q7d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIIIL(X.InterfaceC1541990qEH r10) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QGB.LJLIIIL(X.0qEH):void");
    }

    @Override // X.AbstractC1537870q7d
    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C0QGA c0qga = new C0QGA();
        c0qga.LIZ(620, "blank page lynx load failed");
        c0qga.LJIIJ = System.currentTimeMillis();
        c0qga.LJIIIZ = SearchMiddleMonitor.INSTANCE.getEnterFrom();
        c0qga.LIZLLL = 1;
        C662670Pyz.LIZ.getClass();
        String strLIZ = C662670Pyz.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        c0qga.LIZJ = strLIZ;
        c0qga.LJIIJJI = 1;
        c0qga.LIZJ();
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        SearchMiddleMonitor.INSTANCE.loadLynx();
    }

    public C0QGB(WeakReference<DynamicSingleIntermediateFragmentNew> weakReference, TemplateData templateData, ArrayList<TemplateData> arrayList) {
        this.LL = weakReference;
        this.LLILLJJLI = templateData;
        this.LLILLL = arrayList;
    }
}
