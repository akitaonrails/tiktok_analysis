package X;

import com.bytedance.keva.Keva;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0XWA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XWA {
    public static final C0XWA LIZ = new C0XWA();
    public static final C01GW LIZIZ;
    public static final Set<String> LIZJ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(303));
        LIZIZ = c01gwLIZIZ;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LIZJ = linkedHashSet;
        linkedHashSet.addAll(((Keva) c01gwLIZIZ.getValue()).getStringSet("refresh_key", C08CX.INSTANCE));
    }
}
