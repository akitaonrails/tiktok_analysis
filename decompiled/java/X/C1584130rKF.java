package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rKF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584130rKF extends C09AY implements Function0<InterfaceC1584160rKI> {
    public C1584130rKF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1584160rKI invoke() {
        return C1157804fw.LIZ() ? ((InterfaceC1584170rKJ) ServiceManager.get().getService(ISearchServiceLowEnd.class)).LJL() : ((InterfaceC1584170rKJ) ServiceManager.get().getService(ISearchService.class)).LJL() ? new InterfaceC1584160rKI() { // from class: X.0rKD
            @Override // X.InterfaceC1584160rKI
            public final C1592290rXP LIZ() {
                int i = C1584100rKC.LIZ[C1584190rKL.LIZ().ordinal()];
                Integer numValueOf = Integer.valueOf(R.id.nw4);
                if (i == 1) {
                    C1593140rYm c1593140rYm = new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_discover_fill_light, R.attr.a1h, true, 4);
                    C1593140rYm c1593140rYm2 = new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_discover_dark, R.attr.a1k, true, 4);
                    return new C1592290rXP(c1593140rYm, new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_discover_fill_dark, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_discover_light, R.attr.a1k, true, 4), c1593140rYm2, numValueOf, 32);
                }
                if (i != 2) {
                    C1593140rYm c1593140rYm3 = new C1593140rYm(R.drawable.buo, R.attr.a1h, false, 12);
                    C1593140rYm c1593140rYm4 = new C1593140rYm(R.drawable.bum, R.attr.eg, false, 12);
                    return new C1592290rXP(c1593140rYm3, new C1593140rYm(R.drawable.bun, R.attr.ee, false, 12), new C1593140rYm(R.drawable.buq, R.attr.a1k, false, 12), c1593140rYm4, numValueOf, 32);
                }
                C1593140rYm c1593140rYm5 = new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_discover_fill_light, R.attr.a1h, true, 4);
                C1593140rYm c1593140rYm6 = new C1593140rYm(R.raw.icon_bitmap_exp_05_icon_discover_dark, R.attr.a1h, true, 4);
                return new C1592290rXP(c1593140rYm5, new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_discover_fill_dark, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_05_icon_discover_light, R.attr.a1h, true, 4), c1593140rYm6, numValueOf, 32);
            }
        } : new InterfaceC1584160rKI() { // from class: X.0rKE
            @Override // X.InterfaceC1584160rKI
            public final C1592290rXP LIZ() {
                C1584190rKL.LIZ();
                return new C1592290rXP(new C1593140rYm(R.drawable.bvj, R.attr.a1h, false, 12), (C1593140rYm) null, new C1593140rYm(R.drawable.bvd, R.attr.a1k, false, 12), new C1593140rYm(R.drawable.bve, R.attr.eg, false, 12), Integer.valueOf(R.id.nw4), 34);
            }
        };
    }
}
