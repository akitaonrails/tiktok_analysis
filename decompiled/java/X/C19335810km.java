package X;

import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.10km, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19335810km implements InterfaceC1680560tpm {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1680560tpm
    public final void dispose() {
        switch (this.$t) {
            case 0:
                dispose$0(this);
                break;
            case 1:
                dispose$1(this);
                break;
        }
    }

    public static final void dispose$0(C19335810km c19335810km) {
        IPNSChangeRegionService iPNSChangeRegionService;
        if (!C1207404nw.LIZ() && (iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null)) != null) {
            iPNSChangeRegionService.LJII((C19286510cp) c19335810km.l0);
        }
    }

    public static final void dispose$1(C19335810km c19335810km) {
        IPNSChangeRegionService iPNSChangeRegionService;
        if (!C1207404nw.LIZ() && (iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null)) != null) {
            iPNSChangeRegionService.LJII((C19286410co) c19335810km.l0);
        }
    }

    public C19335810km(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
