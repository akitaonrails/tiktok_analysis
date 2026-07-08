package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;

/* JADX INFO: renamed from: X.0QKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668700QKu implements C0QJ6 {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    @Override // X.C0QJ6
    public final int LIZ() {
        NextLiveData<Integer> nextLiveDataXQ2;
        Integer value;
        SearchStartViewModel searchStartViewModel = this.LIZ.LLJLL;
        if (searchStartViewModel == null || (nextLiveDataXQ2 = searchStartViewModel.xQ2()) == null || (value = nextLiveDataXQ2.getValue()) == null) {
            return 0;
        }
        return value.intValue();
    }

    @Override // X.C0QJ6
    public final void LIZJ() {
        C0QLX c0qlx = this.LIZ.LLLFFI;
        if (c0qlx != null) {
            c0qlx.LJII(0);
        }
        C0QLX c0qlx2 = this.LIZ.LLLFF;
        if (c0qlx2 != null) {
            c0qlx2.LJII(0);
        }
    }

    @Override // X.InterfaceC671320QUw
    public final NextLiveData<Boolean> LJ() {
        SearchStartViewModel searchStartViewModel = this.LIZ.LLJLL;
        if (searchStartViewModel != null) {
            return (NextLiveData) searchStartViewModel.LLJILLL.getValue();
        }
        return null;
    }

    @Override // X.C0QJ6
    public final int LJI() {
        SearchStartViewModel searchStartViewModel = this.LIZ.LLJLL;
        if (searchStartViewModel != null) {
            return searchStartViewModel.LLILLL;
        }
        return 0;
    }

    @Override // X.InterfaceC671320QUw
    public final NextLiveData<Boolean> getEcMiddleAIStateObservable() {
        InterfaceC668730QKx interfaceC668730QKx = this.LIZ.LLLIZZ;
        if (interfaceC668730QKx != null) {
            return interfaceC668730QKx.getEcMiddleAIStateObservable();
        }
        return null;
    }

    @Override // X.C0QJ6
    public final int getInnerState() {
        SearchResultFragmentNew searchResultFragmentNew = this.LIZ;
        if (C650500PfM.LIZJ(C640270P9l.LIZJ(searchResultFragmentNew, searchResultFragmentNew.getActivity()))) {
            C0QLX c0qlx = this.LIZ.LLLFFI;
            if (c0qlx != null) {
                return c0qlx.getInnerState();
            }
            return 0;
        }
        C0QLX c0qlx2 = this.LIZ.LLLFF;
        if (c0qlx2 != null) {
            return c0qlx2.getInnerState();
        }
        return 0;
    }

    public C668700QKu(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }

    @Override // X.C0QJ6
    public final void LIZIZ(Integer num) {
        int iIntValue;
        SearchStartViewModel searchStartViewModel = this.LIZ.LLJLL;
        if (searchStartViewModel != null) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            searchStartViewModel.LLILLL = iIntValue;
        }
    }

    @Override // X.C0QJ6
    public final void LIZLLL(int i) {
        SearchStartViewModel searchStartViewModel = this.LIZ.LLJLL;
        if (searchStartViewModel != null) {
            searchStartViewModel.LLILLJJLI = i;
        }
    }

    @Override // X.C0QJ6
    public final void LJFF(int i) {
        NextLiveData<Integer> nextLiveDataXQ2;
        SearchStartViewModel searchStartViewModel = this.LIZ.LLJLL;
        if (searchStartViewModel != null && (nextLiveDataXQ2 = searchStartViewModel.xQ2()) != null) {
            nextLiveDataXQ2.setValue(Integer.valueOf(i));
        }
    }
}
