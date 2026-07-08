package X;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.00wg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C242400wg<T> implements Observer {
    public final /* synthetic */ Function2<MediatorLiveData<T>, Object, Unit> LL;
    public final /* synthetic */ MediatorLiveData<T> LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    public C242400wg(Function2<? super MediatorLiveData<T>, Object, Unit> function2, MediatorLiveData<T> mediatorLiveData) {
        this.LL = function2;
        this.LLILLJJLI = mediatorLiveData;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Function2<MediatorLiveData<T>, Object, Unit> function2 = this.LL;
        MediatorLiveData<T> mediatorLiveData = this.LLILLJJLI;
        function2.invoke(mediatorLiveData, mediatorLiveData);
    }
}
