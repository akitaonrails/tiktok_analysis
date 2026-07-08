package X;

import Y.ACallableS243S0200000_11;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0SwD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737390SwD extends AbstractC666100QAu<C0WIY<String, Integer>> {
    public int LL;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1 || !(objArr[0] instanceof HashMap)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        boolean zLJI = MethodIDManager.LJI(137333);
        if (!super.sendRequest(objArr)) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return false;
        }
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS243S0200000_11(objArr, this, 5), 0);
        if (zLJI) {
            MethodIDManager.LJ();
            return true;
        }
        return true;
    }
}
