package X;

import Y.AObserverS212S0100000_8;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;

/* JADX INFO: renamed from: X.0M1X, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M1X implements C0M1L {
    public DraftBoxPageViewModel LIZ;
    public C562140M2y LIZIZ;

    @Override // X.C0M1L
    public final void onDestroy() {
    }

    @Override // X.C0M1L
    public final void LIZ(View view, DraftBoxPageViewModel draftBoxPageViewModel, InterfaceC561590M0v interfaceC561590M0v) {
        C562140M2y c562140M2y;
        Context context;
        C19EG c19egLIZIZ;
        MutableLiveData<Long> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        if (view instanceof C562140M2y) {
            c562140M2y = (C562140M2y) view;
        } else {
            c562140M2y = null;
        }
        this.LIZIZ = c562140M2y;
        this.LIZ = draftBoxPageViewModel;
        if (c562140M2y != null && (context = c562140M2y.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            DraftBoxPageViewModel draftBoxPageViewModel2 = this.LIZ;
            if (draftBoxPageViewModel2 != null && (mutableLiveData2 = draftBoxPageViewModel2.LL) != null) {
                mutableLiveData2.observe(c19egLIZIZ, new AObserverS212S0100000_8(this, 113));
            }
            DraftBoxPageViewModel draftBoxPageViewModel3 = this.LIZ;
            if (draftBoxPageViewModel3 != null && (mutableLiveData = draftBoxPageViewModel3.LLILLL) != null) {
                mutableLiveData.observe(c19egLIZIZ, new AObserverS212S0100000_8(this, 114));
            }
        }
    }
}
