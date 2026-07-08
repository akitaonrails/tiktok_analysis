package X;

import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenSparkCell;
import com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenSparkModule;
import com.bytedance.hybrid.spark.raven.component.builtin.spark.SparkRavenUIAssem;

/* JADX INFO: renamed from: X.0gKi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161580gKi implements InterfaceC1161480gKY, InterfaceC1161470gKX {
    @Override // X.InterfaceC1161120gJy
    public final void LIZ() {
    }

    @Override // X.InterfaceC1161470gKX
    public final C19719912Dl LIZLLL() {
        return C13LE.LIZ(SparkRavenUIAssem.class);
    }

    @Override // X.InterfaceC1161120gJy
    public final void service() {
    }

    @Override // X.InterfaceC1161120gJy
    public final InterfaceC1161070gJt<?> LIZIZ() {
        return new InterfaceC1161070gJt<RavenSparkModule>() { // from class: X.0gKj
            @Override // X.InterfaceC1161070gJt
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1161070gJt
            public final Class<RavenSparkModule> LIZ() {
                return RavenSparkModule.class;
            }
        };
    }

    @Override // X.InterfaceC1161480gKY
    public final void LIZJ(C18Z8 c18z8) {
        c18z8.LJIILJJIL(RavenSparkCell.class);
    }

    @Override // X.InterfaceC1161120gJy
    public final boolean LJ(BaseComponentData baseComponentData) {
        if ((baseComponentData instanceof RavenSparkModule) && C1533950q1J.LJ(((RavenSparkModule) baseComponentData).getSchema())) {
            return true;
        }
        return false;
    }
}
