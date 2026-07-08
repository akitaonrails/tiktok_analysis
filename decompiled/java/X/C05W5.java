package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.history.AdWebHistoryFragment;
import com.ss.android.ugc.aweme.history.AdWebHistoryViewModel;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05W5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryFragment$deleteHistoryItem$2", f = "AdWebHistoryFragment.kt", l = {}, m = "invokeSuspend")
public final class C05W5 extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AdWebHistoryFragment LL;
    public final /* synthetic */ C1053410dWF LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05W5(AdWebHistoryFragment adWebHistoryFragment, C1053410dWF c1053410dWF, InterfaceC1364105Vn<? super C05W5> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = adWebHistoryFragment;
        this.LLILLJJLI = c1053410dWF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05W5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1053500dWO abstractC1053500dWO;
        C1053410dWF c1053410dWF;
        AdWebHistoryViewModel adWebHistoryViewModel;
        MutableLiveData<List<AbstractC1053500dWO>> mutableLiveData;
        List<AbstractC1053500dWO> value;
        AbstractC1053500dWO next;
        C1C7U.LIZ("AdWebHistoryFragment@bd5c.deleteHistoryItem$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AdWebHistoryFragment adWebHistoryFragment = this.LL;
        C1053410dWF c1053410dWF2 = this.LLILLJJLI;
        String str = c1053410dWF2.LIZIZ;
        Long l = c1053410dWF2.LJIIIIZZ;
        AdWebHistoryViewModel adWebHistoryViewModel2 = adWebHistoryFragment.LLILLJJLI;
        if (adWebHistoryViewModel2 != null && (mutableLiveData = adWebHistoryViewModel2.LLILLL) != null && (value = mutableLiveData.getValue()) != null) {
            Iterator<AbstractC1053500dWO> it2 = value.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    AbstractC1053500dWO abstractC1053500dWO2 = next;
                    if (abstractC1053500dWO2 instanceof C1053410dWF) {
                        C1053410dWF c1053410dWF3 = (C1053410dWF) abstractC1053500dWO2;
                        if (Intrinsics.LJFF(c1053410dWF3.LIZIZ, str) && Intrinsics.LJFF(c1053410dWF3.LJIIIIZZ, l)) {
                            break;
                        }
                    }
                } else {
                    next = null;
                    break;
                }
            }
            abstractC1053500dWO = next;
        } else {
            abstractC1053500dWO = null;
        }
        if ((abstractC1053500dWO instanceof C1053410dWF) && (c1053410dWF = (C1053410dWF) abstractC1053500dWO) != null && c1053410dWF.LJII != null && (adWebHistoryViewModel = this.LL.LLILLJJLI) != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(adWebHistoryViewModel), C0PEM.LIZJ, null, new C1315205Cs(adWebHistoryViewModel, Collections.singletonList(c1053410dWF.LJII), new AwS581S0100000_2(this.LL, 622), null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdWebHistoryFragment@bd5c.deleteHistoryItem$2");
        return unit;
    }
}
