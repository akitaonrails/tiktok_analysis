package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01WQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.tools.net.WeakNetOptUtilsKt$delayReturnWhenError$1$1", f = "WeakNetOptUtils.kt", l = {47, BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C01WQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C259800zU<C09AE> LLILLL;
    public final /* synthetic */ Function1<T, Boolean> LLILZ;
    public final /* synthetic */ LiveData<T> LLILZIL;
    public final /* synthetic */ MediatorLiveData<T> LLILZLL;
    public final /* synthetic */ T LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01WQ(long j, C259800zU<C09AE> c259800zU, Function1<? super T, Boolean> function1, LiveData<T> liveData, MediatorLiveData<T> mediatorLiveData, T t, InterfaceC1364105Vn<? super C01WQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c259800zU;
        this.LLILZ = function1;
        this.LLILZIL = liveData;
        this.LLILZLL = mediatorLiveData;
        this.LLIZ = t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01WQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WeakNetOptUtilsKt@9a83.delayReturnWhenError$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILLL.element = null;
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("WeakNetOptUtilsKt@9a83.delayReturnWhenError$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            System.currentTimeMillis();
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("WeakNetOptUtilsKt@9a83.delayReturnWhenError$1$1");
                return objLJFF;
            }
        }
        System.currentTimeMillis();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C01WP c01wp = new C01WP(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c01wp) == objLJFF) {
            C1C7U.LIZIZ("WeakNetOptUtilsKt@9a83.delayReturnWhenError$1$1");
            return objLJFF;
        }
        this.LLILLL.element = null;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("WeakNetOptUtilsKt@9a83.delayReturnWhenError$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
