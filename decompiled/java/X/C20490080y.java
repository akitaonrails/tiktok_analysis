package X;

import Y.ARunnableS103S0100000_3;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.080y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20490080y implements AnonymousClass0812 {
    public static final int[] LIZJ = {4194304, 16777215, 4194560, 16777215, 4194816, 16777215, 21005056, 100, 21037056, 1};
    public Object LIZ;
    public Method LIZIZ;

    @Override // X.AnonymousClass0812
    public final boolean LIZ() {
        try {
            Method method = this.LIZIZ;
            if (method != null) {
                C2204961BRm.a0(method, this.LIZ, new Object[]{0, 5000, LIZJ}, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97ZblugMViyjFoquIVMswvceEmYyJ9ObIiXehIh5WGnbqaelQpDp3Raw", null));
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
        try {
            Class<?> cls = Class.forName("com.mediatek.powerhalmgr.PowerHalMgrImpl");
            Method methodLIZ = C1958307ll.LIZ(cls, "getInstance", new Class[0]);
            if (methodLIZ != null) {
                this.LIZ = C2204961BRm.a0(methodLIZ, null, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97ZblugMViyjFoquIVMswvceEmYyJ9ObIiXehIh5WGnbqaelQpDp3Raw", null));
            }
            if (this.LIZ != null) {
                Class cls2 = Integer.TYPE;
                Method methodLIZ2 = C1958307ll.LIZ(cls, "perfLockAcquire", cls2, cls2, int[].class);
                this.LIZIZ = methodLIZ2;
                if (methodLIZ2 != null) {
                    new C822660WOy(1);
                    return true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    @Override // X.AnonymousClass0812
    public final int getType() {
        return 2;
    }

    public C20490080y() {
        new ARunnableS103S0100000_3(this, 147);
    }

    @Override // X.AnonymousClass0812
    public final void LIZIZ(int i, int[] iArr) {
        int[] iArr2 = LIZJ;
        try {
            Method method = this.LIZIZ;
            if (method != null) {
                Object obj = this.LIZ;
                Object[] objArr = new Object[3];
                objArr[0] = 0;
                objArr[1] = Integer.valueOf(i);
                if (iArr == null) {
                    iArr = iArr2;
                }
                objArr[2] = iArr;
                C2204961BRm.a0(method, obj, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97ZblugMViyjFoquIVMswvceEmYyJ9ObIiXehIh5WGnbqaelQpDp3Raw", null));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
