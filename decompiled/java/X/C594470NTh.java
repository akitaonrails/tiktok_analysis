package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.UnreadIMAwemeIdProvider$updateAwemeIdList$1$2", f = "UnreadIMAwemeIdProvider.kt", l = {}, m = "invokeSuspend")
public final class C594470NTh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C594480NTi LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594470NTh(C594480NTi c594480NTi, InterfaceC1364105Vn<? super C594470NTh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c594480NTi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594470NTh(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnreadIMAwemeIdProvider@c77b.updateAwemeIdList$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C594480NTi c594480NTi = this.LL;
        InterfaceC594490NTj interfaceC594490NTj = c594480NTi.LLILLJJLI;
        if (interfaceC594490NTj != null) {
            List<C0NPA> list = c594480NTi.LLILLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C0NPA c0npa : list) {
                arrayList.add(new C912500Zqy(c0npa.LJIIIZ, c0npa.LIZLLL, null));
            }
            interfaceC594490NTj.LIZ(new C597250Nbf(arrayList, false));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnreadIMAwemeIdProvider@c77b.updateAwemeIdList$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
