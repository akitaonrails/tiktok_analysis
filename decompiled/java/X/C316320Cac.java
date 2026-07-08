package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C316320Cac implements InterfaceC346701Wf, InterfaceC1635506an {
    public final /* synthetic */ AIPortraitTabViewModel LL;

    public C316320Cac(AIPortraitTabViewModel aIPortraitTabViewModel) {
        this.LL = aIPortraitTabViewModel;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC346701Wf) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C1696260uF6(2, this.LL, AIPortraitTabViewModel.class, "applyCameoState", "applyCameoState(Lcom/ss/android/ugc/aweme/theater/common/AITheaterProfileState;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC549230LgP interfaceC549230LgP = (InterfaceC549230LgP) obj;
        AIPortraitTabViewModel aIPortraitTabViewModel = this.LL;
        aIPortraitTabViewModel.getClass();
        if (!(interfaceC549230LgP instanceof C558690Lvf)) {
            C2252321DDq c2252321DDq = aIPortraitTabViewModel.LLJI;
            c2252321DDq.setValue(C569820MWm.LIZ((C569820MWm) c2252321DDq.getValue(), interfaceC549230LgP, null, false, false, null, 254));
            if (!(interfaceC549230LgP instanceof C316340Cae)) {
                aIPortraitTabViewModel.LLJJI = false;
            } else if (!aIPortraitTabViewModel.LLJJI) {
                aIPortraitTabViewModel.LLJJI = true;
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(aIPortraitTabViewModel), null, null, new C0CZJ(aIPortraitTabViewModel, null), 3);
            }
        }
        Unit unit = Unit.LIZ;
        C099R.LJFF();
        return unit;
    }
}
