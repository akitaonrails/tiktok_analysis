package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00vJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C233900vJ implements C09FQ {
    public final Function1<Class<?>, Boolean> LIZ;
    public final Map<String, Class<?>> LIZIZ = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public C233900vJ(Function1<? super Class<?>, Boolean> function1) {
        this.LIZ = function1;
    }

    @Override // X.C09FQ
    public final void LIZ(Class cls, String str) {
        if (this.LIZ.invoke(cls).booleanValue()) {
            this.LIZIZ.put(str, cls);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
