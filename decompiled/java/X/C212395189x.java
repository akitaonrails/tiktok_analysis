package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.189x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212395189x extends C09AY implements Function0<C212396189y> {
    public C212395189x() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.189y] */
    @Override // kotlin.jvm.functions.Function0
    public final C212396189y invoke() {
        return new C18A0<String, C212392189u>() { // from class: X.189y
            public final ConcurrentHashMap<String, C212392189u> LIZ = new ConcurrentHashMap<>();

            @Override // X.C18A0
            public final C212392189u get(Object obj) {
                return this.LIZ.get(obj);
            }

            @Override // X.C18A0
            public final void LIZ(Object obj, C212392189u c212392189u) {
                this.LIZ.put(obj, c212392189u);
            }
        };
    }
}
