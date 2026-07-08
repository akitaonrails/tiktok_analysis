package X;

import Y.ACallableS424S0100000_19;

/* JADX INFO: renamed from: X.0irV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258790irV extends AbstractC666100QAu<String> {
    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length == 1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS424S0100000_19(objArr, 10), 0);
        return true;
    }
}
