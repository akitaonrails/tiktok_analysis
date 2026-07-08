package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ams.SearchAppMeasurementModule;
import kotlin.jvm.internal.AwS410S0200000_9;

/* JADX INFO: renamed from: X.0N8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588970N8d extends C0N8C {
    public final C01GW LIZJ;
    public final String LIZLLL = "general_search_outflow";
    public final /* synthetic */ SearchAppMeasurementModule LJ;

    @Override // X.C0N8C
    public final C0N0Y LIZ() {
        return this.LJ.LL.getPlayerManager();
    }

    public final String LIZIZ() {
        return (String) this.LIZJ.getValue();
    }

    public C588970N8d(SearchAppMeasurementModule searchAppMeasurementModule) {
        this.LJ = searchAppMeasurementModule;
        this.LIZJ = C452501pT.LIZIZ(new AwS410S0200000_9(searchAppMeasurementModule, this, 9));
    }
}
