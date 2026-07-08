package X;

import Y.AComparatorS24S0000000_5;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResults;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EZl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftFileRestoreHandlers$restore$2", f = "IDraftFileRestoreHandler.kt", l = {144}, m = "invokeSuspend")
public final class C366750EZl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DraftFileRestoreResults>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0LQ2 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C366750EZl(C0LQ2 c0lq2, InterfaceC1364105Vn<? super C366750EZl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0lq2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C366750EZl c366750EZl = new C366750EZl(this.LLILZ, interfaceC1364105Vn);
        c366750EZl.LLILLL = obj;
        return c366750EZl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        Object objLIZ = obj;
        C1C7U.LIZ("DraftFileRestoreHandlers@aee8.restore$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            jCurrentTimeMillis = System.currentTimeMillis();
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = 10;
            int size = 80 / this.LLILZ.LIZIZ.size();
            C0LQ2 c0lq2 = this.LLILZ;
            List<InterfaceC365900EWe> list = c0lq2.LIZIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<InterfaceC365900EWe> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C366730EZj(it2.next(), c118300cf, size, c0lq2, null), 3));
            }
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            objLIZ = C1D9F.LIZ(arrayList, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("DraftFileRestoreHandlers@aee8.restore$2");
                return objLJFF;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = ((Iterable) objLIZ).iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI((Iterable) it3.next(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!((DraftFileRestoreResult) obj2).isSuc()) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (((DraftFileRestoreResult) obj3).blockCreative) {
                arrayList5.add(obj3);
            }
        }
        arrayList4.addAll(C13LP.LJLLLL(new AComparatorS24S0000000_5(20), arrayList5));
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : arrayList3) {
            if (!((DraftFileRestoreResult) obj4).blockCreative) {
                arrayList7.add(obj4);
            }
        }
        arrayList6.addAll(C13LP.LJLLLL(new AComparatorS24S0000000_5(21), arrayList7));
        DraftFileRestoreResults draftFileRestoreResults = new DraftFileRestoreResults(System.currentTimeMillis() - jCurrentTimeMillis, arrayList4, arrayList6);
        C1C7U.LIZIZ("DraftFileRestoreHandlers@aee8.restore$2");
        return draftFileRestoreResults;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DraftFileRestoreResults> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
