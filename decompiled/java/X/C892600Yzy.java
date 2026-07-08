package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yzy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tars.impl.TarsPipeLine$downloadResource$1$results$1", f = "TarsPipeLine.kt", l = {193}, m = "invokeSuspend")
public final class C892600Yzy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Pair<? extends C0Z03, ? extends C189200o6<? extends Object>>>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0Z0A LLILLL;
    public final /* synthetic */ InterfaceC882520Yji LLILZ;
    public final /* synthetic */ AtomicBoolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C892600Yzy(C0Z0A c0z0a, InterfaceC882520Yji interfaceC882520Yji, AtomicBoolean atomicBoolean, InterfaceC1364105Vn<? super C892600Yzy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0z0a;
        this.LLILZ = interfaceC882520Yji;
        this.LLILZIL = atomicBoolean;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C892600Yzy c892600Yzy = new C892600Yzy(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c892600Yzy.LLILLJJLI = obj;
        return c892600Yzy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("TarsPipeLine@e947.downloadResource$1$results$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<InterfaceC892680Z0g> listLIZJ = this.LLILLL.LIZJ();
            ArrayList arrayList = new ArrayList();
            for (InterfaceC892680Z0g interfaceC892680Z0g : listLIZJ) {
                if (interfaceC892680Z0g instanceof C0Z03) {
                    arrayList.add(interfaceC892680Z0g);
                }
            }
            C0Z0A c0z0a = this.LLILLL;
            InterfaceC882520Yji interfaceC882520Yji = this.LLILZ;
            AtomicBoolean atomicBoolean = this.LLILZIL;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C892590Yzx((C0Z03) it2.next(), c0z0a, interfaceC882520Yji, atomicBoolean, null), 3));
                i2 = 1;
            }
            this.LL = i2;
            objLIZ = C1D9F.LIZ(arrayList2, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("TarsPipeLine@e947.downloadResource$1$results$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TarsPipeLine@e947.downloadResource$1$results$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Pair<? extends C0Z03, ? extends C189200o6<? extends Object>>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
