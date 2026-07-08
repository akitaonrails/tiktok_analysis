package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.10F3, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10F3 extends C1260870iur<AbstractC666100QAu<BaseResponse>, C10F0> {
    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        K k;
        T t = this.LL;
        if (t == 0 || t.getData() == null || (k = this.LLILLJJLI) == 0) {
            return;
        }
        ((C10F0) k).A();
    }

    public C10F3() {
        LJIIJ(new AbstractC666100QAu<BaseResponse>() { // from class: X.10F4
            @Override // X.AbstractC666100QAu
            public final boolean checkParams(Object... objArr) {
                if (objArr.length >= 2 && objArr.length <= 5) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC666100QAu
            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                final String str = (String) objArr[0];
                final int iIntValue = ((Integer) objArr[1]).intValue();
                C1BVK.LIZIZ().LIZ(this.mHandler, new Callable() { // from class: X.10F5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("PrivateSettingChangePresenter@f317.<init>$1$sendRequest$1");
                        Object[] objArr2 = objArr;
                        if (objArr2.length == 2) {
                            BaseResponse baseResponseLJIILIIL = PushSettingsApiManager.LJIILIIL(iIntValue, str);
                            C1C7U.LIZIZ("PrivateSettingChangePresenter@f317.<init>$1$sendRequest$1");
                            return baseResponseLJIILIIL;
                        }
                        if (objArr2.length == 3) {
                            Object obj = objArr2[2];
                            if (obj instanceof Integer) {
                                BaseResponse baseResponseLJIIL = PushSettingsApiManager.LJIIL(iIntValue, ((Integer) obj).intValue(), str);
                                C1C7U.LIZIZ("PrivateSettingChangePresenter@f317.<init>$1$sendRequest$1");
                                return baseResponseLJIIL;
                            }
                        }
                        if (objArr2.length == 4) {
                            PushSettingsApiManager.LJIILIIL(iIntValue, str);
                            Object[] objArr3 = objArr;
                            BaseResponse baseResponseLJIILIIL2 = PushSettingsApiManager.LJIILIIL(((Integer) objArr3[3]).intValue(), (String) objArr3[2]);
                            C1C7U.LIZIZ("PrivateSettingChangePresenter@f317.<init>$1$sendRequest$1");
                            return baseResponseLJIILIIL2;
                        }
                        if (objArr2.length != 5) {
                            BaseResponse baseResponseLJIILJJIL = PushSettingsApiManager.LJIILJJIL(iIntValue, str, (String) objArr2[2]);
                            C1C7U.LIZIZ("PrivateSettingChangePresenter@f317.<init>$1$sendRequest$1");
                            return baseResponseLJIILJJIL;
                        }
                        PushSettingsApiManager.LJIIL(iIntValue, ((Integer) objArr2[4]).intValue(), str);
                        Object[] objArr4 = objArr;
                        BaseResponse baseResponseLJIILIIL3 = PushSettingsApiManager.LJIILIIL(((Integer) objArr4[3]).intValue(), (String) objArr4[2]);
                        C1C7U.LIZIZ("PrivateSettingChangePresenter@f317.<init>$1$sendRequest$1");
                        return baseResponseLJIILIIL3;
                    }
                }, 0);
                return true;
            }
        });
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((C10F0) k).rY();
        }
    }
}
