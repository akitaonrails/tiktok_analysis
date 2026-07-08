package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PJL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PJL {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T extends X.0PHY<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T extends X.0PHY<T>] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0PHY, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0PHY, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0PHY] */
    public static final <T extends C0PHY<T>> T LIZ(T t, Function1<? super T, Boolean> function1) {
        boolean zBooleanValue = function1.invoke(t).booleanValue();
        t = t;
        if (!zBooleanValue) {
            while (true) {
                if (t == 0) {
                    break;
                }
                if (((C0PHY) t).LIZIZ() != null) {
                    if (function1.invoke((Object) t).booleanValue()) {
                        break;
                    }
                    t = ((C0PHY) t).LIZIZ();
                } else {
                    while (t != 0 && !function1.invoke((Object) t).booleanValue()) {
                        t = ((C0PHY) t).LIZ();
                    }
                }
            }
        }
        return (T) t;
    }
}
