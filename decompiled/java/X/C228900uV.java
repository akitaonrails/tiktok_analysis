package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00uV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C228900uV extends C09AY implements Function1 {
    public final /* synthetic */ MediatorLiveData<Pair<Object, Object>> LL;
    public final /* synthetic */ LiveData<Object> LLILLJJLI;
    public final /* synthetic */ LiveData<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C228900uV(MediatorLiveData<Pair<Object, Object>> mediatorLiveData, LiveData<Object> liveData, LiveData<Object> liveData2) {
        super(1);
        this.LL = mediatorLiveData;
        this.LLILLJJLI = liveData;
        this.LLILLL = liveData2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.LL.setValue(new Pair<>(this.LLILLJJLI.getValue(), this.LLILLL.getValue()));
        return Unit.LIZ;
    }
}
