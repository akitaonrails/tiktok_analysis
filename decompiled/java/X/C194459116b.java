package X;

import com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;

/* JADX INFO: renamed from: X.116b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194459116b extends C1260870iur<C116T, InterfaceC194460116c> {
    @Override // X.C1260870iur
    public final void LJIILIIL() {
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((InterfaceC194460116c) k).M5();
        }
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        T t;
        K k = this.LLILLJJLI;
        if (k == 0 || (t = this.LL) == 0) {
            return;
        }
        ((InterfaceC194460116c) k).gd1((SearchSugChallengeList) t.getData());
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((InterfaceC194460116c) k).d7(exc);
        }
    }
}
