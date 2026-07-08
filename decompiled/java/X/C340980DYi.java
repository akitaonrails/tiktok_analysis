package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.manager.AnchorPrefixManager$prefetchPrefix$1$2$1", f = "AnchorPrefixManager.kt", l = {}, m = "invokeSuspend")
public final class C340980DYi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C340980DYi(List<String> list, InterfaceC1364105Vn<? super C340980DYi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C340980DYi c340980DYi = new C340980DYi(this.LLILLJJLI, interfaceC1364105Vn);
        c340980DYi.LL = obj;
        return c340980DYi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnchorPrefixManager@ed48.prefetchPrefix$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> list = this.LLILLJJLI;
        try {
            for (String str : list) {
                C1326790kdB.LIZ.getClass();
                if (C1326790kdB.LIZJ(str)) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AnchorPrefixManager@ed48.prefetchPrefix$1$2$1");
                    return unit;
                }
            }
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            C03IT c03it = new C03IT(list);
            c1326790kdB.getClass();
            C189200o6.m2constructorimpl(C1326790kdB.LIZLLL(c03it).LJIIZILJ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AnchorPrefixManager@ed48.prefetchPrefix$1$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
