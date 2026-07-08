package X;

import Y.ACallableS431S0100000_28;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Arrays;

/* JADX INFO: renamed from: X.10Ey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19214210Ey extends C1260870iur<AbstractC666100QAu<BaseResponse>, C10F0> {
    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        K k;
        T t = this.LL;
        if (t == 0 || t.getData() == null || (k = this.LLILLJJLI) == 0) {
            return;
        }
        ((C10F0) k).A();
    }

    public C19214210Ey() {
        LJIIJ(new AbstractC666100QAu<BaseResponse>() { // from class: X.10Ez
            @Override // X.AbstractC666100QAu
            public final boolean checkParams(Object... objArr) {
                if (objArr.length == 1) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC666100QAu
            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
                    return false;
                }
                C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS431S0100000_28(objArr, 5), 0);
                return true;
            }
        });
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        int errorCode;
        C23112093u c23112093u;
        C10F0 c10f0 = (C10F0) this.LLILLJJLI;
        if (c10f0 == null) {
            return;
        }
        if ((exc instanceof C23112093u) && (c23112093u = (C23112093u) exc) != null) {
            errorCode = c23112093u.getErrorCode();
        } else {
            errorCode = 0;
        }
        c10f0.t00(errorCode);
    }
}
