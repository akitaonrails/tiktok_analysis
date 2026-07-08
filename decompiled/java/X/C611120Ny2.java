package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.business.common.dc.SkylightUnifiedDB;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ny2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.service.SkylightLiveStoreServiceImpl$batchWrite$2", f = "SkylightLiveStoreServiceImpl.kt", l = {117}, m = "invokeSuspend")
public final class C611120Ny2 extends C09AX implements Function2<SkylightUnifiedDB, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ArrayList<C611160Ny6> LLILLL;
    public final /* synthetic */ C611110Ny1 LLILZ;
    public final /* synthetic */ C611150Ny5 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C611120Ny2(ArrayList<C611160Ny6> arrayList, C611110Ny1 c611110Ny1, C611150Ny5 c611150Ny5, InterfaceC1364105Vn<? super C611120Ny2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = arrayList;
        this.LLILZ = c611110Ny1;
        this.LLILZIL = c611150Ny5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C611120Ny2 c611120Ny2 = new C611120Ny2(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c611120Ny2.LLILLJJLI = obj;
        return c611120Ny2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightLiveStoreServiceImpl@14e4.batchWrite$2");
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
            ArrayList<C611160Ny6> arrayList = this.LLILLL;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator<C611160Ny6> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().LIZ);
            }
            this.LL = 1;
            if (interfaceC611050NxvLIZ.LIZJ(arrayList2, this) == objLJFF) {
                C1C7U.LIZIZ("SkylightLiveStoreServiceImpl@14e4.batchWrite$2");
                return objLJFF;
            }
        }
        C611110Ny1 c611110Ny1 = this.LLILZ;
        ArrayList<C611160Ny6> arrayList3 = this.LLILLL;
        if (!this.LLILZIL.LIZ) {
            c611110Ny1.getClass();
        } else {
            synchronized (c611110Ny1.LIZJ) {
                try {
                    for (C611160Ny6 c611160Ny6 : arrayList3) {
                        Long l = c611160Ny6.LIZIZ;
                        if (l != null) {
                            ((C603820NmG) c611110Ny1.LIZLLL.getValue()).LIZLLL(c611160Ny6.LIZ.LIZ, Long.valueOf(l.longValue()));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkylightLiveStoreServiceImpl@14e4.batchWrite$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SkylightUnifiedDB skylightUnifiedDB, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(skylightUnifiedDB, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
