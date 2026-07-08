package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.01cm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C373801cm {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(499));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(498));

    public static void LIZIZ(String str) {
        AnonymousClass0957 anonymousClass0957 = (AnonymousClass0957) ((ConcurrentHashMap) LIZ.getValue()).remove(str);
        if (anonymousClass0957 != null && anonymousClass0957.isCompleted()) {
            ((Map) LIZIZ.getValue()).put(str, anonymousClass0957.LIZLLL());
        }
    }

    public static void LIZJ(List list) {
        if (!((ConcurrentHashMap) LIZ.getValue()).isEmpty()) {
            C23250099c.LJ(C23271099x.INSTANCE, new C373701cl(list, null));
        }
    }

    public static void LIZ(String str, AnonymousClass0957 anonymousClass0957) {
        if (anonymousClass0957 == null) {
            return;
        }
        ((ConcurrentHashMap) LIZ.getValue()).put(str, anonymousClass0957);
    }
}
