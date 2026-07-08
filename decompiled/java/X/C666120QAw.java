package X;

import com.ss.android.ugc.aweme.detail.model.BatchDetailList;

/* JADX INFO: renamed from: X.0QAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C666120QAw extends C1260870iur<C683690Qrn, InterfaceC653820Pki> {
    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        T t;
        if (this.LLILLJJLI == 0 || (t = this.LL) == 0 || t.getData() == null) {
            return;
        }
        ((InterfaceC653820Pki) this.LLILLJJLI).Pc2(((BatchDetailList) this.LL.getData()).items);
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((InterfaceC653820Pki) k).YB1(exc);
        }
    }
}
