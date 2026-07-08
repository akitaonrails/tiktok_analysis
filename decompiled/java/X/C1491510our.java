package X;

import com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0our, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1491510our implements SparkTracingNativeConfig {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Set<String> LIZLLL;
    public final String LJ;
    public final long LJFF;
    public final boolean LJI;
    public final boolean LJII;

    @Override // com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeConfig
    @InterfaceC1294060jmO
    public final long getPulseInterval() {
        return 0L;
    }

    @Override // com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeConfig
    public final String getReferencesUsed() {
        try {
            return new JSONArray((Collection) this.LIZLLL).toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    @Override // com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeConfig
    public final String getManifestSrc() {
        return this.LIZIZ;
    }

    @Override // com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeConfig
    public final String getReferenceMapSrc() {
        return this.LIZJ;
    }

    @Override // com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeConfig
    public final String getRepoDbStoragePath() {
        return this.LJ;
    }

    @Override // com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeConfig
    public final long getRepoSize() {
        return this.LJFF;
    }

    @Override // com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeConfig
    public final boolean isLogEnable() {
        return this.LJII;
    }

    @Override // com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeConfig
    public final boolean isRecordUsedPropertyOnly() {
        return this.LIZ;
    }

    @Override // com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeConfig
    public final boolean isReferenceMappingEnabled() {
        return this.LJI;
    }

    public C1491510our(long j, String str, String str2, String str3, Set set, boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = set;
        this.LJ = str3;
        this.LJFF = j;
        this.LJI = z2;
        this.LJII = z3;
    }
}
