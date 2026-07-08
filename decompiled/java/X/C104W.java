package X;

import android.content.Context;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.104W, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C104W implements InterfaceC191831102z {
    public final String LL;

    public C104W(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC191831102z
    public final CharSequence LIZJ(Context context, CharSequence charSequence) {
        int i;
        C106V.LIZ.getClass();
        C106V.LIZIZ().getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, "dm_setting_potential_connection");
        if (privacySettingsRestrictionItemLJIIJJI == null) {
            privacySettingsRestrictionItemLJIIJJI = new PrivacySettingsRestrictionItem(2, 0, null, 0, -1, null);
        }
        if (Intrinsics.LJFF(this.LL, "dm_setting_potential_connection")) {
            if (privacySettingsRestrictionItemLJIIJJI.tipsType == 4) {
                i = 2131830790;
            } else {
                i = 2131830791;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf != null) {
                String string = context.getResources().getString(numValueOf.intValue());
                if (string != null) {
                    return string;
                }
            }
        }
        return charSequence;
    }
}
