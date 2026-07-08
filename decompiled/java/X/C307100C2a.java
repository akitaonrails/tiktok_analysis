package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.settings.ThirdPartyBindingEntry;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0C2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307100C2a {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5307));

    public static final ThirdPartyBindingEntry LIZ() {
        ThirdPartyBindingEntry thirdPartyBindingEntry;
        try {
            SettingsManager.LIZLLL().getClass();
            thirdPartyBindingEntry = (ThirdPartyBindingEntry) SettingsManager.LJII("third_party_binding", ThirdPartyBindingEntry.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return thirdPartyBindingEntry == null ? (ThirdPartyBindingEntry) LIZ.getValue() : thirdPartyBindingEntry;
    }
}
