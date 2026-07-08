package X;

import com.google.gson.Gson;
import com.google.gson.a;
import com.google.gson.b;
import com.google.gson.e;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.09Dy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2337609Dy {
    public static Gson LIZ;
    public static final Set<String> LIZIZ = Collections.singleton("uuid");
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(587));

    public static Gson LIZ() {
        if (LIZ == null) {
            e eVar = (e) LIZJ.getValue();
            final Set<String> set = LIZIZ;
            eVar.LJ(new a(set) { // from class: X.09Dx
                public final Set<String> LIZ;

                @Override // com.google.gson.a
                public final boolean shouldSkipClass(Class<?> cls) {
                    return false;
                }

                {
                    this.LIZ = set;
                }

                @Override // com.google.gson.a
                public final boolean shouldSkipField(b bVar) {
                    return this.LIZ.contains(bVar.LIZIZ());
                }
            });
            LIZ = eVar.LIZ();
        }
        Gson gson = LIZ;
        return gson == null ? C0CHQ.LIZ().getGson() : gson;
    }
}
