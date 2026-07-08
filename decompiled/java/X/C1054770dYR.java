package X;

import android.app.Activity;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.Map;

/* JADX INFO: renamed from: X.0dYR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054770dYR extends AbstractC1968807nS {
    public final /* synthetic */ SparkContext LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.07nZ] */
    @Override // X.InterfaceC1969407nY
    public final C1969507nZ LIZJ() {
        return new Object() { // from class: X.07nZ
        };
    }

    @Override // X.InterfaceC1969407nY
    public final Map<String, String> getParams() {
        return C08RQ.LIZJ(this.LIZIZ.containerId);
    }

    @Override // X.InterfaceC1969407nY
    public final Activity getActivity() {
        return C1537820q7Y.LIZLLL();
    }

    public C1054770dYR(SparkContext sparkContext) {
        this.LIZIZ = sparkContext;
    }
}
