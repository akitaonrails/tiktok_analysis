package X;

import Y.ACallableS243S0200000_11;

/* JADX INFO: renamed from: X.0SwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737380SwC extends AbstractC666100QAu<String> {
    public Boolean LL = Boolean.FALSE;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS243S0200000_11(this, objArr, 0), 0);
        return true;
    }
}
