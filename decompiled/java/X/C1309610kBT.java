package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kBT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.trending.list.model.ECTrendingRepo$operator$1$writeImpression$1", f = "ECTrendingRepo.kt", l = {145}, m = "invokeSuspend")
public final class C1309610kBT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1743010vSV LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1309610kBT(C1743010vSV c1743010vSV, boolean z, InterfaceC1364105Vn<? super C1309610kBT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1743010vSV;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1309610kBT(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterable iterable;
        C1C7U.LIZ("ECTrendingRepo@56f7.operator$1$writeImpression$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                Iterable iterable2 = (Iterable) this.LL;
                C155000ia.LIZIZ(obj);
                iterable = iterable2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLL.LLILZIL.isEmpty()) {
                C1309620kBU.LIZ("repo");
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ECTrendingRepo@56f7.operator$1$writeImpression$1");
                return unit;
            }
            C1743010vSV c1743010vSV = this.LLILLL;
            if (c1743010vSV.LLILZ && !this.LLILZ) {
                C1309620kBU.LIZ("repo");
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("ECTrendingRepo@56f7.operator$1$writeImpression$1");
                return unit2;
            }
            c1743010vSV.LLILZ = true;
            List listLLIIII = C13LP.LLIIII(c1743010vSV.LLILZIL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start impression ");
            sbLIZ.append(listLLIIII.size());
            sbLIZ.append(" isflush ");
            sbLIZ.append(this.LLILZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C1309620kBU.LIZ("repo");
            C2126408Us c2126408Us = C2126308Ur.LIZIZ;
            C1309600kBS c1309600kBS = new C1309600kBS(this.LLILLL, listLLIIII, null);
            this.LL = listLLIIII;
            this.LLILLJJLI = 1;
            obj = C23250099c.LJI(this, c2126408Us, c1309600kBS);
            iterable = listLLIIII;
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ECTrendingRepo@56f7.operator$1$writeImpression$1");
                return objLJFF;
            }
        }
        C0X52 c0x52 = (C0X52) obj;
        if (c0x52 != null && c0x52.LIZJ()) {
            this.LLILLL.LLILZIL.removeAll(C13LP.LLIIJI(iterable));
        }
        this.LLILLL.LLILZ = false;
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("ECTrendingRepo@56f7.operator$1$writeImpression$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
