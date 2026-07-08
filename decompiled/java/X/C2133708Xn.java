package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08Xn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2133708Xn {
    public final Object LIZ;
    public final Field LIZIZ;
    public final Class LIZJ;

    public C2133708Xn(Class cls, Object obj, Field field) {
        this.LIZ = obj;
        this.LIZIZ = field;
        this.LIZJ = cls;
    }

    public final Object LIZ() {
        try {
            return this.LIZJ.cast(this.LIZIZ.get(this.LIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C2133208Xi(C786410Ut5.j4("Failed to get value of field %s of type %s on object of type %s", new Object[]{this.LIZIZ.getName(), this.LIZ.getClass().getName(), this.LIZJ.getName()}), e);
        }
    }

    public final void LIZIZ(Object obj) {
        try {
            this.LIZIZ.set(this.LIZ, obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C2133208Xi(C786410Ut5.j4("Failed to set value of field %s of type %s on object of type %s", new Object[]{this.LIZIZ.getName(), this.LIZ.getClass().getName(), this.LIZJ.getName()}), e);
        }
    }
}
