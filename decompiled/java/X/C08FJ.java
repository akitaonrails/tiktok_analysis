package X;

/* JADX INFO: renamed from: X.08FJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08FJ<T> extends C08FE {
    public static C08FG protectorType = C08FG.CAST_NUMBER;

    public static <T> T tryProtect(Throwable th, Class<?> cls) {
        return (T) C08FE.tryProtect(protectorType, th, cls);
    }
}
