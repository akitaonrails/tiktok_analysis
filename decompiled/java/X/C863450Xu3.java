package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xu3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.BatchMarkConversationReadUseCase$callbackSuccess$2", f = "BatchMarkConversationReadUseCase.kt", l = {}, m = "invokeSuspend")
public final class C863450Xu3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C864340XvU LL;
    public final /* synthetic */ List<C0Y8T> LLILLJJLI;
    public final /* synthetic */ InterfaceC863600XuI<List<String>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863450Xu3(C864340XvU c864340XvU, List<C0Y8T> list, InterfaceC863600XuI<List<String>> interfaceC863600XuI, InterfaceC1364105Vn<? super C863450Xu3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c864340XvU;
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC863600XuI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863450Xu3(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BatchMarkConversationReadUseCase@9ae8.callbackSuccess$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callbackSuccess, conv num: ");
        sbLIZ.append(this.LLILLJJLI.size());
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "BatchMarkConversationReadHandler", C2188811AlT.LIZIZ(sbLIZ), 4);
        InterfaceC863600XuI<List<String>> interfaceC863600XuI = this.LLILLL;
        if (interfaceC863600XuI != null) {
            List<C0Y8T> list = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C0Y8T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getConversationId());
            }
            interfaceC863600XuI.onSuccess(arrayList);
        }
        C0YEM c0yem = this.LL.LIZIZ;
        C0Y8T[] c0y8tArr = (C0Y8T[]) this.LLILLJJLI.toArray(new C0Y8T[0]);
        C864870XwL.LJIILIIL(c0yem, (C0Y8T[]) Arrays.copyOf(c0y8tArr, c0y8tArr.length));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BatchMarkConversationReadUseCase@9ae8.callbackSuccess$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
