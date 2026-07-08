package X;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09BO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.sharedar.viewmodel.SessionShareViewModel$loadFriendsData$1", f = "SessionShareViewModel.kt", l = {266}, m = "invokeSuspend")
public final class C09BO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2385709Wl LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09BO(C2385709Wl c2385709Wl, boolean z, InterfaceC1364105Vn<? super C09BO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2385709Wl;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09BO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SessionShareViewModel@57ac.loadFriendsData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2385709Wl c2385709Wl = this.LLILLJJLI;
            long j = c2385709Wl.LJ;
            this.LL = 1;
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C2385609Wk(c2385709Wl, j, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SessionShareViewModel@57ac.loadFriendsData$1");
                return objLJFF;
            }
        }
        Collection collection = (Collection) obj;
        MutableLiveData<List<C2386409Ws>> mutableLiveData = this.LLILLJJLI.LIZ;
        if (this.LLILLL) {
            ArrayList arrayList = new ArrayList();
            Collection value = this.LLILLJJLI.LIZ.getValue();
            if (value == null) {
                value = C13BV.INSTANCE;
            }
            arrayList.addAll(value);
            arrayList.addAll(collection);
            collection = arrayList;
        }
        mutableLiveData.setValue((List<C2386409Ws>) collection);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SessionShareViewModel@57ac.loadFriendsData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
