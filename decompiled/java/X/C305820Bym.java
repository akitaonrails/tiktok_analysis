package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.anchor.settings.CardFrequency;

/* JADX INFO: renamed from: X.0Bym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305820Bym {
    public static final CardFrequency LIZ = new CardFrequency(120, 5, 5);

    public static CardFrequency LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            CardFrequency cardFrequency = LIZ;
            CardFrequency cardFrequency2 = (CardFrequency) settingsManagerLIZLLL.LJIIIIZZ("profile_card_frequency_control", CardFrequency.class, cardFrequency);
            return cardFrequency2 != null ? cardFrequency2 : cardFrequency;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return LIZ;
        }
    }
}
