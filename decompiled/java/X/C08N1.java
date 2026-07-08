package X;

import dalvik.system.DexFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.08N1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08N1 {
    public static Constructor<?> LIZ;

    public static DexFile LIZ(byte[] bArr) throws NoSuchMethodException {
        if (LIZ == null) {
            Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            declaredMethod.setAccessible(true);
            Constructor<?> constructor = (Constructor) declaredMethod.invoke(DexFile.class, new Class[]{ByteBuffer.class});
            if (constructor != null && !constructor.isAccessible()) {
                constructor.setAccessible(true);
            }
            LIZ = constructor;
        }
        return (DexFile) LIZ.newInstance(ByteBuffer.wrap(bArr));
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0043: MOVE (r6 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777283), block:B:24:0x0043 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<dalvik.system.DexFile> LIZIZ(java.lang.String r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08N1.LIZIZ(java.lang.String):java.util.List");
    }
}
