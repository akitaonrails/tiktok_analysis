package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z06, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tars.impl.TarsPipeLine$preloadResource$1", f = "TarsPipeLine.kt", l = {235}, m = "invokeSuspend")
public final class C0Z06 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0Z0A LLILLL;
    public final /* synthetic */ InterfaceC882520Yji LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z06(InterfaceC882520Yji interfaceC882520Yji, C0Z0A c0z0a, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0z0a;
        this.LLILZ = interfaceC882520Yji;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0Z06 c0z06 = new C0Z06(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c0z06.LLILLJJLI = obj;
        return c0z06;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TarsPipeLine@e947.preloadResource$1");
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
            ArrayList arrayList = new ArrayList();
            List<InterfaceC892680Z0g> listLIZJ = this.LLILLL.LIZJ();
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC892680Z0g interfaceC892680Z0g : listLIZJ) {
                if (interfaceC892680Z0g instanceof C0Z03) {
                    arrayList2.add(interfaceC892680Z0g);
                }
            }
            C0Z0A c0z0a = this.LLILLL;
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C0Z07(c0z0a, (C0Z03) it2.next(), null), 3));
            }
            List<InterfaceC892680Z0g> listLIZJ2 = this.LLILLL.LIZJ();
            C0Z0A c0z0a2 = this.LLILLL;
            ArrayList arrayList3 = new ArrayList();
            Iterator<InterfaceC892680Z0g> it3 = listLIZJ2.iterator();
            while (it3.hasNext()) {
                Iterable iterable = (Iterable) ((LinkedHashMap) c0z0a2.LIZLLL).get(it3.next());
                if (iterable == null) {
                    iterable = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(iterable, arrayList3);
            }
            C0Z0A c0z0a3 = this.LLILLL;
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C0Z05(c0z0a3, (C0Z0D) it4.next(), null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TarsPipeLine@e947.preloadResource$1");
                return objLJFF;
            }
        }
        InterfaceC882520Yji interfaceC882520Yji = this.LLILZ;
        if (interfaceC882520Yji != null) {
            interfaceC882520Yji.onSuccess(obj);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TarsPipeLine@e947.preloadResource$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
