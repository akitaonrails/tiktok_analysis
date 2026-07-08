package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.SparkHostApiImpl;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ps3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528210ps3 implements InterfaceC1528230ps5 {
    public InterfaceC1528230ps5 LIZ;
    public final ISparkHostApi LIZIZ = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);

    public final void LIZIZ(InterfaceC1528230ps5 interfaceC1528230ps5) {
        SparkHostApiImpl sparkHostApiImplLLIZ;
        ISparkHostApi iSparkHostApi = this.LIZIZ;
        if (iSparkHostApi != null && (sparkHostApiImplLLIZ = iSparkHostApi.LLIZ()) != null) {
            sparkHostApiImplLLIZ.LLLILZLLLI(this);
        }
        this.LIZ = interfaceC1528230ps5;
    }

    @Override // X.InterfaceC1528230ps5
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        InterfaceC1528230ps5 interfaceC1528230ps5 = this.LIZ;
        if (interfaceC1528230ps5 != null) {
            interfaceC1528230ps5.LIZ(c821280WJq, jSONObject);
        }
    }
}
