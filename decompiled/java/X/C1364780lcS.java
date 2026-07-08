package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.manager.QuickShareManager$onLoadComplete$2$1", f = "QuickShareManager.kt", l = {121}, m = "invokeSuspend")
public final class C1364780lcS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<IMContact> LLILLJJLI;
    public final /* synthetic */ ViewOnTouchListenerC1364760lcQ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1364780lcS(ViewOnTouchListenerC1364760lcQ viewOnTouchListenerC1364760lcQ, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = viewOnTouchListenerC1364760lcQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1364780lcS(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List listSingletonList;
        InterfaceC1369790lkX interfaceC1369790lkXInvoke;
        List listSingletonList2;
        InterfaceC1369790lkX interfaceC1369790lkXInvoke2;
        List listSingletonList3;
        InterfaceC1369790lkX interfaceC1369790lkXInvoke3;
        List listSingletonList4;
        InterfaceC1369790lkX interfaceC1369790lkXInvoke4;
        C1C7U.LIZ("QuickShareManager@5ebc.onLoadComplete$2$1");
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
            ViewOnTouchListenerC1364750lcP.LL.getClass();
            C1364810lcV c1364810lcV = (C1364810lcV) ViewOnTouchListenerC1364750lcP.LLJ.getValue();
            List<IMContact> list = this.LLILLJJLI;
            Function0<? extends InterfaceC1369790lkX> function0 = ViewOnTouchListenerC1364750lcP.LLILZIL;
            Function0<? extends InterfaceC1369790lkX> function02 = ViewOnTouchListenerC1364750lcP.LLILZLL;
            c1364810lcV.getClass();
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            switch (C296800BkE.LIZ()) {
                case 1:
                    c13dvLIZIZ.addAll(C1364810lcV.LIZ(c1364810lcV, list, 0, 6));
                    break;
                case 2:
                    c13dvLIZIZ.addAll(C1364810lcV.LIZ(c1364810lcV, list, 0, 4));
                    break;
                case 3:
                    c13dvLIZIZ.addAll(C1364810lcV.LIZ(c1364810lcV, list, 0, 6));
                    if (c13dvLIZIZ.size() < 4) {
                        if (function0 == null || (interfaceC1369790lkXInvoke4 = function0.invoke()) == null || (listSingletonList4 = Collections.singletonList(new C1364830lcX(interfaceC1369790lkXInvoke4))) == null) {
                            listSingletonList4 = C13BV.INSTANCE;
                        }
                        c13dvLIZIZ.addAll(0, listSingletonList4);
                    }
                    break;
                case 4:
                    if (function0 == null || (interfaceC1369790lkXInvoke3 = function0.invoke()) == null || (listSingletonList3 = Collections.singletonList(new C1364830lcX(interfaceC1369790lkXInvoke3))) == null) {
                        listSingletonList3 = C13BV.INSTANCE;
                    }
                    c13dvLIZIZ.addAll(listSingletonList3);
                    c13dvLIZIZ.addAll(C1364810lcV.LIZ(c1364810lcV, list, 4 - c13dvLIZIZ.size(), 2));
                    break;
                case 5:
                    c13dvLIZIZ.addAll(C1364810lcV.LIZ(c1364810lcV, list, 0, 6));
                    if (c13dvLIZIZ.size() < 4) {
                        if (function02 == null || (interfaceC1369790lkXInvoke2 = function02.invoke()) == null || (listSingletonList2 = Collections.singletonList(new C1364830lcX(interfaceC1369790lkXInvoke2))) == null) {
                            listSingletonList2 = C13BV.INSTANCE;
                        }
                        c13dvLIZIZ.addAll(0, listSingletonList2);
                    }
                    break;
                case 6:
                    if (function02 == null || (interfaceC1369790lkXInvoke = function02.invoke()) == null || (listSingletonList = Collections.singletonList(new C1364830lcX(interfaceC1369790lkXInvoke))) == null) {
                        listSingletonList = C13BV.INSTANCE;
                    }
                    c13dvLIZIZ.addAll(listSingletonList);
                    c13dvLIZIZ.addAll(C1364810lcV.LIZ(c1364810lcV, list, 4 - c13dvLIZIZ.size(), 2));
                    break;
            }
            List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
            if (listLIZ.isEmpty()) {
                ViewOnTouchListenerC1364760lcQ viewOnTouchListenerC1364760lcQ = this.LLILLL;
                if (C1388190mED.LIZIZ(viewOnTouchListenerC1364760lcQ.LLILZLL) != null) {
                    C487280J9a.LIZJ(viewOnTouchListenerC1364760lcQ);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("QuickShareManager@5ebc.onLoadComplete$2$1");
                return unit;
            }
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1364770lcR c1364770lcR = new C1364770lcR(this.LLILLL, listLIZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1364770lcR) == objLJFF) {
                C1C7U.LIZIZ("QuickShareManager@5ebc.onLoadComplete$2$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("QuickShareManager@5ebc.onLoadComplete$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
