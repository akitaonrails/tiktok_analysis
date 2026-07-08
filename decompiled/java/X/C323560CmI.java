package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CmI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager$getBatchAwemeCacheItem$3", f = "AwemeFetchManager.kt", l = {136}, m = "invokeSuspend")
public final class C323560CmI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ AbstractC2252651DEx LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323560CmI(List<String> list, List<String> list2, AbstractC2252651DEx abstractC2252651DEx, InterfaceC1364105Vn<? super C323560CmI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = abstractC2252651DEx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C323560CmI c323560CmI = new C323560CmI(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c323560CmI.LLILLJJLI = obj;
        return c323560CmI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwemeFetchManager@5bcc.getBatchAwemeCacheItem$3");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<String> list = this.LLILLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZLLL(interfaceC497601wk, null, null, new C323540CmG(it2.next(), null), 3));
            }
            Object[] array = arrayList.toArray(new C09AE[0]);
            AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C323550CmH(this.LLILZ, this.LLILZIL, null), 3);
            C323580CmK c323580CmK = new C323580CmK(2);
            c323580CmK.LIZIZ(array);
            c323580CmK.LIZ(anonymousClass0956LIZLLL);
            C09AE[] c09aeArr = (C09AE[]) c323580CmK.LIZLLL(new C09AE[c323580CmK.LIZJ()]);
            this.LL = 1;
            if (C1D9F.LIZLLL(c09aeArr, this) == objLJFF) {
                C1C7U.LIZIZ("AwemeFetchManager@5bcc.getBatchAwemeCacheItem$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeFetchManager@5bcc.getBatchAwemeCacheItem$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
