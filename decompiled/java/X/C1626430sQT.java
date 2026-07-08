package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0sQT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1626430sQT {
    public static final boolean LIZ(InterfaceC1624480sNK interfaceC1624480sNK, Effect effect, boolean z) {
        return interfaceC1624480sNK.getStickerRepository().LJIILLIIL().LIZ(effect, z);
    }

    public static final boolean LIZIZ(InterfaceC1624480sNK interfaceC1624480sNK, Effect effect, boolean z) {
        boolean z2;
        Pair<EnumC1641380soa, Boolean> pairLIZLLL = interfaceC1624480sNK.getStickerRepository().LJIILLIIL().LIZLLL(new C1629340sVA(effect, false, null, 6));
        if (pairLIZLLL != null) {
            EnumC1641380soa first = pairLIZLLL.getFirst();
            boolean zBooleanValue = pairLIZLLL.getSecond().booleanValue();
            if (first != EnumC1641380soa.PENDING && first != EnumC1641380soa.START) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z) {
                return z2;
            }
            if (z2 && zBooleanValue) {
                return true;
            }
        }
        return false;
    }
}
