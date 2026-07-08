package X;

import com.bytedance.android.starship.solaria.profile.repository.SolariaProfileModel;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0efz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097890efz extends C09AY implements Function0<SolariaProfileModel> {
    public C1097890efz() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SolariaProfileModel invoke() {
        SolariaProfileModel solariaProfileModel;
        C1097900eg0.LIZ.getClass();
        try {
            String string = ((Keva) C1097900eg0.LIZIZ.getValue()).getString("profile_entry", null);
            if (string != null && (solariaProfileModel = (SolariaProfileModel) C7740030o.LIZ().getGson().LJII(string, SolariaProfileModel.class)) != null) {
                solariaProfileModel.getFlatGroup$solaria_release();
                return solariaProfileModel;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((Keva) C1097900eg0.LIZIZ.getValue()).erase("profile_entry");
        }
        return null;
    }
}
