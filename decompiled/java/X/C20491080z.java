package X;

import Y.ARunnableS103S0100000_3;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.080z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20491080z implements AnonymousClass0812 {
    public static final int[] LIZJ = {1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1086455808, 40, 1086439424, 60, 1082130944, 4095};
    public Object LIZ;
    public Method LIZIZ;

    @Override // X.AnonymousClass0812
    public final boolean LIZ() {
        try {
            Method method = this.LIZIZ;
            if (method != null) {
                C2204961BRm.a0(method, this.LIZ, new Object[]{5000, LIZJ}, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97ZblugMViyjFoquIVMswvceEmYyJ9ObIiXehIh5WHXsjYKMUYba6wWnlA==", null));
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    @Override // X.AnonymousClass0812
    public final void LIZJ(boolean z) {
    }

    @Override // X.AnonymousClass0812
    public final boolean LIZLLL() {
        Constructor[] constructorArr;
        try {
            Class<?> cls = Class.forName("com.qualcomm.qti.Performance");
            try {
                constructorArr = (Constructor[]) Class.class.getDeclaredMethod("getDeclaredConstructors", new Class[0]).invoke(cls, new Object[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                constructorArr = null;
            }
            if (constructorArr != null) {
                if (constructorArr.length > 1) {
                    this.LIZ = constructorArr[1].newInstance(AnonymousClass0810.LIZ.LJFF);
                } else if (constructorArr.length == 1) {
                    this.LIZ = constructorArr[0].newInstance(new Object[0]);
                }
            }
            if (this.LIZ != null) {
                Method methodLIZ = C1958307ll.LIZ(cls, "perfLockAcquire", Integer.TYPE, int[].class);
                this.LIZIZ = methodLIZ;
                if (methodLIZ != null) {
                    new C822660WOy(1);
                    return true;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return false;
    }

    @Override // X.AnonymousClass0812
    public final int getType() {
        return 1;
    }

    public C20491080z() {
        new ARunnableS103S0100000_3(this, 148);
    }

    @Override // X.AnonymousClass0812
    public final void LIZIZ(int i, int[] iArr) {
        int[] iArr2 = LIZJ;
        try {
            Method method = this.LIZIZ;
            if (method != null) {
                Object obj = this.LIZ;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i);
                if (iArr == null) {
                    iArr = iArr2;
                }
                objArr[1] = iArr;
                C2204961BRm.a0(method, obj, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97ZblugMViyjFoquIVMswvceEmYyJ9ObIiXehIh5WHXsjYKMUYba6wWnlA==", null));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
