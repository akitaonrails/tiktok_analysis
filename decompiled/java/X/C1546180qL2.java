package X;

import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qL2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546180qL2 implements InterfaceC1051160dSc {
    public final SparkContext LIZ;
    public final C1537720q7O LIZIZ;

    @Override // X.InterfaceC1051160dSc
    public final void LIZIZ() {
        C1537720q7O c1537720q7O = this.LIZIZ;
        if (c1537720q7O != null) {
            c1537720q7O.load();
        }
    }

    @Override // X.InterfaceC1051160dSc
    public final SparkContext LLIILZL() {
        SparkContext sparkContext = this.LIZ;
        if (sparkContext != null) {
            return sparkContext;
        }
        C1537720q7O c1537720q7O = this.LIZIZ;
        C1537480q70 hybridContext = c1537720q7O != null ? c1537720q7O.getHybridContext() : null;
        if (hybridContext instanceof SparkContext) {
            return (SparkContext) hybridContext;
        }
        return null;
    }

    @Override // X.InterfaceC1051160dSc
    public final void destroy() {
        C1537720q7O c1537720q7O = this.LIZIZ;
        if (c1537720q7O != null) {
            c1537720q7O.LLD(true);
        }
    }

    @Override // X.InterfaceC1051160dSc
    public final String getContainerId() {
        C1537480q70 hybridContext;
        String str;
        C1537720q7O c1537720q7O = this.LIZIZ;
        if (c1537720q7O != null && (hybridContext = c1537720q7O.getHybridContext()) != null && (str = hybridContext.containerId) != null) {
            return str;
        }
        SparkContext sparkContext = this.LIZ;
        if (sparkContext != null) {
            return sparkContext.containerId;
        }
        return null;
    }

    @Override // X.InterfaceC1051160dSc
    public final View getView() {
        C1537720q7O c1537720q7O = this.LIZIZ;
        if (c1537720q7O == null) {
            return null;
        }
        return c1537720q7O;
    }

    @Override // X.InterfaceC1051160dSc
    public final void onHide() {
        C1537720q7O c1537720q7O = this.LIZIZ;
        if (c1537720q7O != null) {
            c1537720q7O.onHide();
        }
    }

    @Override // X.InterfaceC1051160dSc
    public final void release() {
        C1537720q7O c1537720q7O = this.LIZIZ;
        if (c1537720q7O != null) {
            c1537720q7O.LLD(true);
        }
    }

    @Override // X.InterfaceC1051160dSc
    public final void close() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        SparkContext sparkContextLLIILZL = LLIILZL();
        if (sparkContextLLIILZL == null || (interfaceC1059280dfiLJJIJLIJ = sparkContextLLIILZL.LJJIJLIJ()) == null) {
            return;
        }
        interfaceC1059280dfiLJJIJLIJ.close();
    }

    @Override // X.InterfaceC1051160dSc
    public final void refresh() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        SparkContext sparkContextLLIILZL = LLIILZL();
        if (sparkContextLLIILZL == null || (interfaceC1059280dfiLJJIJLIJ = sparkContextLLIILZL.LJJIJLIJ()) == null) {
            return;
        }
        interfaceC1059280dfiLJJIJLIJ.refresh();
    }

    @Override // X.InterfaceC1051160dSc
    public final InterfaceC1541990qEH getKitView() {
        return this.LIZIZ;
    }

    public C1546180qL2(SparkContext sparkContext, C1537720q7O c1537720q7O) {
        this.LIZ = sparkContext;
        this.LIZIZ = c1537720q7O;
    }

    @Override // X.InterfaceC1051160dSc
    public final void LIZ(String str, JSONObject jSONObject) {
        C1537720q7O c1537720q7O = this.LIZIZ;
        if (c1537720q7O != null) {
            c1537720q7O.LIZ(str, jSONObject);
        }
    }
}
