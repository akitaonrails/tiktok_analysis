package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0saQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632600saQ {
    public static final <KEY, RESULT, INFO> boolean LIZ(InterfaceC1632590saP<KEY, RESULT, INFO> interfaceC1632590saP, KEY key) {
        Pair<EnumC1641380soa, Boolean> pairLIZLLL = interfaceC1632590saP.LIZLLL(key);
        if (pairLIZLLL != null) {
            EnumC1641380soa first = pairLIZLLL.getFirst();
            if (first == EnumC1641380soa.PENDING || first == EnumC1641380soa.START) {
                return true;
            }
            return false;
        }
        return false;
    }
}
