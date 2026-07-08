package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.GroupSearchContentUpdateEngine$startGroupDataSyncing$1", f = "GroupSearchContentUpdateEngine.kt", l = {238}, m = "invokeSuspend")
public final class C597150NbV extends C09AX implements Function2<C597130NbT, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C907490Zit LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597150NbV(C907490Zit c907490Zit, InterfaceC1364105Vn<? super C597150NbV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c907490Zit;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C597150NbV c597150NbV = new C597150NbV(this.LLILLL, interfaceC1364105Vn);
        c597150NbV.LLILLJJLI = obj;
        return c597150NbV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupSearchContentUpdateEngine@13e9.startGroupDataSyncing$1");
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
            C597130NbT c597130NbT = (C597130NbT) this.LLILLJJLI;
            C1231704rr c1231704rr = this.LLILLL.LIZJ;
            c597130NbT.toString();
            c1231704rr.LIZIZ();
            C907490Zit c907490Zit = this.LLILLL;
            c907490Zit.LIZJ.LIZ(c597130NbT.LIZIZ, c907490Zit.LJIIJ);
            List<C0Y8T> list = c597130NbT.LIZIZ;
            Function1<C0Y8T, C907840ZjS> function1 = this.LLILLL.LJII;
            ArrayList arrayList = new ArrayList();
            Iterator<C0Y8T> it2 = list.iterator();
            while (it2.hasNext()) {
                C907840ZjS c907840ZjSInvoke = function1.invoke(it2.next());
                if (c907840ZjSInvoke != null) {
                    arrayList.add(c907840ZjSInvoke);
                }
            }
            this.LLILLL.LIZJ.LIZJ(arrayList, C597160NbW.LL);
            int iOrdinal = c597130NbT.LIZ.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        C2286608xc.LJ(this.LLILLL.LIZIZ.LJ(arrayList));
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C907490Zit c907490Zit2 = this.LLILLL;
                    this.LL = 1;
                    if (c907490Zit2.LIZ(this) == objLJFF) {
                        C1C7U.LIZIZ("GroupSearchContentUpdateEngine@13e9.startGroupDataSyncing$1");
                        return objLJFF;
                    }
                }
            } else {
                C2286608xc.LJ(this.LLILLL.LIZIZ.LJFF(arrayList, true));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupSearchContentUpdateEngine@13e9.startGroupDataSyncing$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C597130NbT c597130NbT, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c597130NbT, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
