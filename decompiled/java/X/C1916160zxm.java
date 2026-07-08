package X;

import android.app.backup.BackupManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AutobackupService;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916160zxm extends C09AY implements Function0<C1916130zxj> {
    public final /* synthetic */ C1916120zxi LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1916160zxm(C1916120zxi c1916120zxi) {
        super(0);
        this.LL = c1916120zxi;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0zxj] */
    @Override // kotlin.jvm.functions.Function0
    public final C1916130zxj invoke() {
        final C1916120zxi c1916120zxi = this.LL;
        return new InterfaceC1916060zxc() { // from class: X.0zxj
            @Override // X.InterfaceC1916060zxc
            public final void LIZ() {
                c1916120zxi.LIZ(true);
                C01GW<C1916120zxi> c01gw = C1916120zxi.LIZLLL;
                AutobackupService.LIZJ().LIZIZ().edit().putBoolean("consent_acceptance_from_backup", true).putString("last_acceptance_country_code", C1916120zxi.LJIIIIZZ.getStoreRegionUpperCase().toLowerCase(Locale.ROOT)).apply();
                BackupManager.dataChanged(C1BWL.LIZ().getPackageName());
                Keva keva = C1916120zxi.LJI;
                keva.storeBoolean("is_consent_accepted", true);
                keva.storeBoolean("have_passed_consent", true);
                keva.storeInt("consent_reason", 6);
            }

            @Override // X.InterfaceC1916060zxc
            public final void LIZIZ(String str) {
                int i;
                c1916120zxi.LIZIZ = System.currentTimeMillis();
                if (str != null) {
                    c1916120zxi.LIZ = str;
                }
                C1916120zxi c1916120zxi2 = c1916120zxi;
                c1916120zxi2.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", c1916120zxi2.LIZ);
                C01GW<C1916120zxi> c01gw = C1916120zxi.LIZLLL;
                if (C1916110zxh.LIZJ().LJIIL() == EnumC1915930zxP.KR) {
                    i = 1;
                } else {
                    i = 0;
                }
                c2344009Gk.LIZJ(i, "is_region_kr");
                c2344009Gk.LJIIIIZZ("consent_region", C1916120zxi.LJIIIIZZ.getStoreRegionUpperCase());
                C10SV.LIZ(c2344009Gk);
                Map<String, String> map = c2344009Gk.LIZ;
                C807840VmY.LIZ(map);
                C10SV.LIZIZ(C10H5.SHOW_CONSENT_BOX, map);
            }
        };
    }
}
