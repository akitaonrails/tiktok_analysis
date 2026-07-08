package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XD8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XD8 {
    public static final C0XCR LIZ = new AbstractC824140WUq<Boolean>() { // from class: X.0XCR
        @Override // X.AbstractC824140WUq
        public final Boolean LIZ(Object[] objArr) {
            try {
                Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                return Boolean.valueOf("harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return Boolean.FALSE;
            }
        }
    };
}
