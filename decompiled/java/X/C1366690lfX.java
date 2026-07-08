package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;

/* JADX INFO: renamed from: X.0lfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366690lfX implements DurationPerfMon {
    public static final /* synthetic */ C1366690lfX LIZJ = new C1366690lfX();
    public final /* synthetic */ DurationPerfMon LIZIZ;

    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon
    public final boolean LIZ(C450520Hla c450520Hla) {
        return this.LIZIZ.LIZ(c450520Hla);
    }

    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon
    public final boolean LIZIZ(AbstractC1492605sq abstractC1492605sq, boolean z) {
        return this.LIZIZ.LIZIZ(abstractC1492605sq, z);
    }

    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon
    public final void LIZJ(AbstractC1492605sq abstractC1492605sq, AbstractC1493005su abstractC1493005su) {
        this.LIZIZ.LIZJ(abstractC1492605sq, abstractC1493005su);
    }

    public C1366690lfX() {
        DurationPerfMon durationPerfMon = (DurationPerfMon) PluggableExtentionKt.pluggableSpiForReal(DurationPerfMon.class);
        this.LIZIZ = durationPerfMon == null ? new DurationPerfMon() { // from class: X.0lfY
            @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon
            public final boolean LIZ(C450520Hla c450520Hla) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon
            public final boolean LIZIZ(AbstractC1492605sq abstractC1492605sq, boolean z) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon
            public final void LIZJ(AbstractC1492605sq abstractC1492605sq, AbstractC1493005su abstractC1493005su) {
            }
        } : durationPerfMon;
    }
}
