package X;

import android.content.Context;
import com.ss.android.ugc.aweme.changeregion.sdk.model.Country;

/* JADX INFO: renamed from: X.0uQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1703430uQf extends AbstractC1703340uQW<C1703420uQe> {
    @Override // X.AbstractC1703340uQW
    public final C1703420uQe LIZ() {
        C1703420uQe c1703420uQe = (C1703420uQe) this.LIZ.getValue();
        if (c1703420uQe == null) {
            return new C1703420uQe(false, new Country("", ""), null, null);
        }
        boolean z = c1703420uQe.LIZ;
        Country country = c1703420uQe.LIZIZ;
        Country country2 = new Country(country.code, country.name);
        Country country3 = c1703420uQe.LIZJ;
        return new C1703420uQe(z, country2, country3 != null ? new Country(country3.code, country3.name) : null, c1703420uQe.LIZLLL);
    }

    @Override // X.AbstractC1703340uQW
    public void LIZIZ(Context context) {
        String str;
        C1703420uQe c1703420uQe = (C1703420uQe) this.LIZ.getValue();
        if (c1703420uQe != null && (str = c1703420uQe.LIZLLL) != null) {
            C100C.LIZ.LJ().LIZ(context, str, null, null, null);
        }
    }
}
