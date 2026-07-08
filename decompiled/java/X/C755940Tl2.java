package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0Tl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C755940Tl2 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(362));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(361));

    public static void LIZ(EnumC755930Tl1 enumC755930Tl1, boolean z) {
        Object obj = ((Map) LIZIZ.getValue()).get(enumC755930Tl1);
        if (obj == null) {
            return;
        }
        ((ConcurrentHashMap) LIZ.getValue()).put(obj, Integer.valueOf(z ? 1 : 0));
    }
}
