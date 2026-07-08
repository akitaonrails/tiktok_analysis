package X;

import android.graphics.Region;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.07l6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1954207l6 implements InvocationHandler {
    public Region LL;
    public Field LLILLJJLI;
    public Field LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 82));

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        Field field;
        try {
            if (this.LLILLJJLI == null) {
                Field declaredField = objArr[0].getClass().getDeclaredField("touchableRegion");
                this.LLILLJJLI = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            }
            if (this.LLILLL == null) {
                Field declaredField2 = objArr[0].getClass().getDeclaredField("mTouchableInsets");
                this.LLILLL = declaredField2;
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                }
            }
            if (this.LL == null && (field = this.LLILLL) != null) {
                field.set(objArr[0], 0);
            }
            Region region = this.LL;
            if (region != null) {
                Field field2 = this.LLILLJJLI;
                if (field2 != null) {
                    obj2 = field2.get(objArr[0]);
                } else {
                    obj2 = null;
                }
                ((Region) obj2).set(region);
                Field field3 = this.LLILLL;
                if (field3 != null) {
                    field3.set(objArr[0], 3);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OnComputeInternalInsetsListener invoke: ");
            sbLIZ.append(e);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }
}
