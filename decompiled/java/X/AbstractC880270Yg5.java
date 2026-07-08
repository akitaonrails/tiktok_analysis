package X;

import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Yg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC880270Yg5<T> {
    public static final /* synthetic */ int LIZIZ = 0;
    public final PrivacySettingsFeature LIZ = C1336205Ku.LIZ(false).getImPrivacySettings();

    static {
        new C880280Yg6();
    }

    public final C880150Yft LIZ(C880310Yg9 c880310Yg9) {
        boolean z;
        int i;
        int i2 = 1;
        int i3 = 0;
        if (c880310Yg9.LIZLLL && this.LIZ.LJIJJLI(true)) {
            z = true;
        } else {
            z = false;
        }
        if (c880310Yg9.LJIIIIZZ) {
            i = c880310Yg9.LIZ;
        } else {
            i = 0;
        }
        if ((!c880310Yg9.LIZIZ || !c880310Yg9.LIZJ) && !c880310Yg9.LJFF && !c880310Yg9.LJ && c880310Yg9.LJIIJ != FilterTabType.SPAM && (!c880310Yg9.LIZLLL || !z)) {
            if (i != 0 || !c880310Yg9.LJI || !c880310Yg9.LJII) {
                i2 = 0;
            }
            i3 = i + i2;
        }
        Pair pairLIZIZ = C880280Yg6.LIZIZ(c880310Yg9);
        return new C880150Yft(((Number) pairLIZIZ.getFirst()).intValue(), (EnumC880300Yg8) pairLIZIZ.getSecond(), i3);
    }
}
