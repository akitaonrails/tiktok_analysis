package X;

import com.bytedance.ies.abmock.ConfigItem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307710C4j extends C09AY implements Function0<HashSet<String>> {
    public C307710C4j() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final HashSet<String> invoke() {
        HashSet<String> hashSet = new HashSet<>();
        for (Map.Entry entry : ((HashMap) C2502809rO.LIZ).entrySet()) {
            Object key = entry.getKey();
            if (((ConfigItem) entry.getValue()).isLaunch) {
                hashSet.add(key);
            }
        }
        for (Map.Entry entry2 : ((HashMap) C2502809rO.LIZIZ).entrySet()) {
            Object key2 = entry2.getKey();
            if (((ConfigItem) entry2.getValue()).isLaunch) {
                hashSet.add(key2);
            }
        }
        return hashSet;
    }
}
