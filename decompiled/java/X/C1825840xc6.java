package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0xc6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825840xc6 extends AbstractC1826160xcc<C1825850xc7, AbstractC991520buQ<? extends Unit>> {
    public final InterfaceC1826050xcR LIZ;

    public C1825840xc6(C490610JLv c490610JLv) {
        this.LIZ = c490610JLv;
    }

    public final void LIZ(C1825850xc7 c1825850xc7) {
        PcsDialogAbility pcsDialogAbility;
        try {
            InterfaceC665370Q7z interfaceC665370Q7z = c1825850xc7.LJ;
            if (interfaceC665370Q7z != null && (pcsDialogAbility = (PcsDialogAbility) C1558520qew.LIZ(interfaceC665370Q7z, PcsDialogAbility.class, null)) != null) {
                pcsDialogAbility.cj0();
            }
            if (c1825850xc7.LIZIZ.length() == 0) {
                new C991530buR(new IllegalArgumentException("Third-party schema is empty"), "Cannot open third-party service without schema");
                return;
            }
            this.LIZ.LJ(c1825850xc7.LIZ, c1825850xc7.LIZIZ, c1825850xc7.LIZJ);
            C1822730xX5.LIZIZ(new C1822950xXR("click", EnumC1785280wYg.THIRD_PARTY_SERVICE.getSkuFeatureName(), null, null, null, null, c1825850xc7.LIZLLL, (C1822330xWR) c1825850xc7.LJFF.getValue(), 60));
            new C991510buP(Unit.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            new C991530buR(e, "Failed to open third-party service");
        }
    }
}
