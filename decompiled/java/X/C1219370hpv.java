package X;

import com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hpv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell$bindRelationButton$1$2$1", f = "InboxLiveBaseCell.kt", l = {449}, m = "invokeSuspend")
public final class C1219370hpv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RelationButton LLILLJJLI;
    public final /* synthetic */ InboxLiveBaseCell<AbstractC1598130rgp> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219370hpv(RelationButton relationButton, InboxLiveBaseCell<AbstractC1598130rgp> inboxLiveBaseCell, InterfaceC1364105Vn<? super C1219370hpv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = relationButton;
        this.LLILLL = inboxLiveBaseCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219370hpv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxLiveBaseCell@a4b1.bindRelationButton$1$2$1");
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
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1222110huL c1222110huL = new C1222110huL(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1222110huL) == objLJFF) {
                C1C7U.LIZIZ("InboxLiveBaseCell@a4b1.bindRelationButton$1$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxLiveBaseCell@a4b1.bindRelationButton$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
