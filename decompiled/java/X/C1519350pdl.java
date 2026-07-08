package X;

import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pdl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519350pdl extends AbstractC1519240pda {
    public static final C1519350pdl LIZIZ = new C1519350pdl();
    public static Boolean LIZJ;

    @Override // X.AbstractC1519240pda
    public final boolean LJIIIZ(C1519370pdn c1519370pdn) {
        Boolean bool = LIZJ;
        if (bool == null) {
            Boolean boolValueOf = Boolean.valueOf(a0.LJJIIZI(c1519370pdn.LIZLLL.toString(), "consent_data", false));
            LIZJ = boolValueOf;
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        return bool.booleanValue();
    }

    @Override // X.AbstractC1519240pda
    public final void LJI(UniversalPopupAction universalPopupAction, C1519370pdn c1519370pdn) {
        C1914270zuj.LIZ.LIZIZ(null, universalPopupAction, c1519370pdn, new C1892180zL6(this));
    }
}
