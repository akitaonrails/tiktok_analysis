package X;

import Y.ACallableS426S0100000_21;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;

/* JADX INFO: renamed from: X.0lq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373260lq8 extends AbstractC666100QAu {
    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 1 || !(objArr[0] instanceof C1387290mCl)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC666100QAu
    public final boolean sendRequest(final Object... objArr) {
        boolean zLJI = MethodIDManager.LJI(137151);
        if (!super.sendRequest(objArr)) {
            if (zLJI) {
                MethodIDManager.LJ();
                return false;
            }
            return false;
        }
        this.mHandler.postDelayed(new Runnable() { // from class: X.0lq7
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AwemeStatusModel@d54d.sendRequest$1");
                try {
                    C1BVK.LIZIZ().LIZ(this.LLILLJJLI.mHandler, new ACallableS426S0100000_21(objArr, 17), 0);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AwemeStatusModel@d54d.sendRequest$1");
            }
        }, 500L);
        if (zLJI) {
            MethodIDManager.LJ();
            return true;
        }
        return true;
    }
}
