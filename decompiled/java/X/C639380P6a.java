package X;

import Y.AObserverS214S0100000_10;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0P6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639380P6a extends AbstractC641560PEk {
    public final SearchStateViewModel LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(637));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1182));

    @Override // X.InterfaceC588620N6u
    public final MutableLiveData<Integer> LIZ() {
        return (MutableLiveData) this.LLILZ.getValue();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isShowingFilters:");
        MutableLiveData<Boolean> mutableLiveData = this.LLILLJJLI.isShowingFilters;
        sbLIZ.append(mutableLiveData != null ? mutableLiveData.getValue() : null);
        sbLIZ.append(" \nshouldBlockMediaPlay:");
        MutableLiveData<Boolean> mutableLiveData2 = this.LLILLJJLI.shouldBlockMediaPlay;
        sbLIZ.append(mutableLiveData2 != null ? mutableLiveData2.getValue() : null);
        sbLIZ.append(" \nisStopAutoPlayByTns:");
        MutableLiveData<Boolean> mutableLiveData3 = this.LLILLJJLI.isStopAutoPlayByTns;
        sbLIZ.append(mutableLiveData3 != null ? mutableLiveData3.getValue() : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C639380P6a(SearchStateViewModel searchStateViewModel, LifecycleOwner lifecycleOwner) {
        this.LLILLJJLI = searchStateViewModel;
        this.LLILLL = lifecycleOwner;
        MutableLiveData<Boolean> mutableLiveData = searchStateViewModel.isShowingFilters;
        if (mutableLiveData != null) {
            mutableLiveData.observe(this.LLILLL, new C513601zK(this, "isShowingFilters", 49));
        }
        MutableLiveData<Boolean> mutableLiveData2 = searchStateViewModel.shouldBlockMediaPlay;
        if (mutableLiveData2 != null) {
            mutableLiveData2.observe(this.LLILLL, new C513601zK(this, "shouldBlockMediaPlay", 49));
        }
        MutableLiveData<Boolean> mutableLiveData3 = searchStateViewModel.isStopAutoPlayByTns;
        if (mutableLiveData3 != null) {
            mutableLiveData3.observe(this.LLILLL, new C513601zK(this, "isStopAutoPlayByTns", 49));
        }
        MutableLiveData<Boolean> mutableLiveData4 = searchStateViewModel.backToMiddle;
        if (mutableLiveData4 != null) {
            mutableLiveData4.observe(this.LLILLL, new AObserverS214S0100000_10(this, 136));
        }
        MutableLiveData<Boolean> mutableLiveData5 = searchStateViewModel.isRefreshingData;
        if (mutableLiveData5 != null) {
            mutableLiveData5.observe(this.LLILLL, new AObserverS214S0100000_10(this, 137));
        }
    }
}
