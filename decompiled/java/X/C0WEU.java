package X;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0WEU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WEU {
    public final String LIZ;
    public Map<Class<?>, Object> LIZIZ;

    public final C0WEV LIZ() {
        return new C0WEV(this.LIZ, this.LIZIZ == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.LIZIZ)));
    }

    public C0WEU(String str) {
        this.LIZ = str;
    }

    public final void LIZIZ(Annotation annotation) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        ((HashMap) this.LIZIZ).put(annotation.annotationType(), annotation);
    }
}
