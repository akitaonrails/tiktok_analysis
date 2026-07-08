package X;

import com.ss.android.ugc.aweme.business.common.dc.SkylightUnifiedDB;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.service.SkylightLiveStoreServiceImpl$batchRead$rows$1", f = "SkylightLiveStoreServiceImpl.kt", l = {139}, m = "invokeSuspend")
public final class C611060Nxw extends C09AX implements Function2<SkylightUnifiedDB, InterfaceC1364105Vn<? super List<? extends C611170Ny7>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C611060Nxw(List<String> list, InterfaceC1364105Vn<? super C611060Nxw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C611060Nxw c611060Nxw = new C611060Nxw(this.LLILLL, interfaceC1364105Vn);
        c611060Nxw.LLILLJJLI = obj;
        return c611060Nxw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightLiveStoreServiceImpl@14e4.batchRead$rows$1");
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
            InterfaceC611050Nxv interfaceC611050NxvLIZ = ((SkylightUnifiedDB) this.LLILLJJLI).LIZ();
            List<String> list = this.LLILLL;
            this.LL = 1;
            obj = interfaceC611050NxvLIZ.LIZIZ(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SkylightLiveStoreServiceImpl@14e4.batchRead$rows$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SkylightLiveStoreServiceImpl@14e4.batchRead$rows$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SkylightUnifiedDB skylightUnifiedDB, InterfaceC1364105Vn<? super List<? extends C611170Ny7>> interfaceC1364105Vn) {
        return ((a) create(skylightUnifiedDB, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
