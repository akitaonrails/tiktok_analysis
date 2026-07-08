package X;

import Y.ACallableS424S0100000_19;

/* JADX INFO: renamed from: X.0irW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258800irW extends AbstractC666100QAu<String> {
    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr != null) {
            if (objArr.length == 1 || objArr.length == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS424S0100000_19(objArr, 11), 0);
        return true;
    }
}
