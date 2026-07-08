package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.065h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.im.activestatus.ActivityStatusCompensationExternalDataSourceImpl$onGetMessage$1", f = "ActivityStatusCompensationExternalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
public final class C15507065h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C15511065l LL;
    public final /* synthetic */ List<C869590Y9l> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15507065h(C15511065l c15511065l, List<C869590Y9l> list, InterfaceC1364105Vn<? super C15507065h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c15511065l;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15507065h(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numValueOf;
        C1C7U.LIZ("ActivityStatusCompensationExternalDataSourceImpl@63fe.onGetMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C15511065l c15511065l = this.LL;
        List<C869590Y9l> list = this.LLILLJJLI;
        C1231704rr c1231704rr = c15511065l.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive msg size ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (C869590Y9l c869590Y9l : list) {
                C869590Y9l c869590Y9l2 = c869590Y9l;
                if (!C0ZDX.LJJJJIZL(c869590Y9l2) && c869590Y9l2.getSender() > 0 && c869590Y9l2.getConversationType() != AbstractC1711506n3.LIZIZ) {
                    arrayList.add(c869590Y9l);
                }
            }
            ArrayList<C869590Y9l> arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                C869590Y9l c869590Y9l3 = (C869590Y9l) obj2;
                C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(c869590Y9l3.getConversationId());
                if (c0y8tLJIL != null && !C882340YjQ.LJ(c0y8tLJIL) && C15511065l.LIZJ(c869590Y9l3.getSender())) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (C869590Y9l c869590Y9l4 : arrayList2) {
                arrayList3.add(new C0NXK(String.valueOf(c869590Y9l4.getSender()), c869590Y9l4.getCreatedAt() / 1000, 0L));
            }
            C1231704rr c1231704rr2 = c15511065l.LLILZIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateActivityStatusWithMsg final update size ");
            sbLIZ2.append(arrayList3.size());
            C2188811AlT.LIZIZ(sbLIZ2);
            c1231704rr2.LIZIZ();
            if (!arrayList3.isEmpty()) {
                c15511065l.LIZLLL(arrayList3);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusCompensationExternalDataSourceImpl@63fe.onGetMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
