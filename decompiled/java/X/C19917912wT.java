package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.12wT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19917912wT implements Serializable {
    public static final long serialVersionUID = 0;
    public final Class<?> LL;
    public final String LLILLJJLI;
    public final byte[] LLILLL;

    public final Class<?> LIZ() throws ClassNotFoundException {
        Class<?> cls = this.LL;
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(this.LLILLJJLI, false, C19917912wT.class.getClassLoader());
        if (InterfaceC19925612xi.class.isAssignableFrom(cls2)) {
            return cls2;
        }
        throw new ClassNotFoundException();
    }

    public Object readResolve() {
        try {
            Field declaredField = LIZ().getDeclaredField("DEFAULT_INSTANCE");
            declaredField.setAccessible(true);
            InterfaceC19928112y7 interfaceC19928112y7NewBuilderForType = ((InterfaceC19925612xi) declaredField.get(null)).newBuilderForType();
            interfaceC19928112y7NewBuilderForType.mergeFrom(this.LLILLL);
            return interfaceC19928112y7NewBuilderForType.buildPartial();
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Unable to understand proto buffer", e);
        } catch (ClassNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unable to find proto buffer class: ");
            sbLIZ.append(this.LLILLJJLI);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e2);
        } catch (IllegalAccessException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new RuntimeException("Unable to call parsePartialFrom", e3);
        } catch (NoSuchFieldException e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Unable to find DEFAULT_INSTANCE in ");
            sbLIZ2.append(this.LLILLJJLI);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e4);
        } catch (SecurityException e5) {
            TryCatchGuardChecker.doCheck(e5);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Unable to call DEFAULT_INSTANCE in ");
            sbLIZ3.append(this.LLILLJJLI);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3), e5);
        }
    }

    public C19917912wT(InterfaceC19925612xi interfaceC19925612xi) {
        this.LL = interfaceC19925612xi.getClass();
        this.LLILLJJLI = interfaceC19925612xi.getClass().getName();
        this.LLILLL = interfaceC19925612xi.toByteArray();
    }

    public static C19917912wT of(InterfaceC19925612xi interfaceC19925612xi) {
        return new C19917912wT(interfaceC19925612xi);
    }
}
