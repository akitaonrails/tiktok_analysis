package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import njp.a;

/* JADX INFO: renamed from: X.0ZKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.repository.VibeFeedDetailOperator$batchPreloadRedDot$2", f = "VibeFeedDetailOperator.kt", l = {95}, m = "invokeSuspend")
public final class C897840ZKc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C0ZA0> LLILLL;
    public final /* synthetic */ C0P32 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897840ZKc(List<C0ZA0> list, C0P32 c0p32, InterfaceC1364105Vn<? super C897840ZKc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c0p32;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C897840ZKc c897840ZKc = new C897840ZKc(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c897840ZKc.LLILLJJLI = obj;
        return c897840ZKc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C0ZA0 c0za0;
        String str2;
        C0ZA0 c0za02;
        EnumC912680ZrG enumC912680ZrG;
        C1C7U.LIZ("VibeFeedDetailOperator@bd0.batchPreloadRedDot$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            String strLIZ = C1575440r6E.LIZ();
            if (strLIZ == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("VibeFeedDetailOperator@bd0.batchPreloadRedDot$2");
                return unit;
            }
            C1DEU c1deuLIZ = C2252461DEe.LIZ(3);
            IntRange intRange = new IntRange(1, this.LLILLL.size());
            List<C0ZA0> list = this.LLILLL;
            C0P32 c0p32 = this.LLILZ;
            ArrayList arrayList = new ArrayList();
            C531650Kt9 it2 = intRange.iterator();
            while (it2.LLILLL) {
                int iNextInt = it2.nextInt() - i2;
                C0ZA0 c0za03 = (C0ZA0) C13LP.LJJJLZIJ(iNextInt, list);
                C099G c099gLIZIZ = null;
                if (c0za03 != null && (str = c0za03.LIZIZ) != null && (c0za0 = (C0ZA0) C13LP.LJJJLZIJ(iNextInt, list)) != null && (str2 = c0za0.LIZ) != null && (c0za02 = (C0ZA0) C13LP.LJJJLZIJ(iNextInt, list)) != null && (enumC912680ZrG = c0za02.LIZJ) != null) {
                    c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C897850ZKd(c1deuLIZ, c0p32, strLIZ, str, str2, enumC912680ZrG, null), 3);
                }
                if (c099gLIZIZ != null) {
                    arrayList.add(c099gLIZIZ);
                }
                i2 = 1;
            }
            this.LL = 1;
            if (C1D9F.LIZ(arrayList, this) == objLJFF) {
                C1C7U.LIZIZ("VibeFeedDetailOperator@bd0.batchPreloadRedDot$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("VibeFeedDetailOperator@bd0.batchPreloadRedDot$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
