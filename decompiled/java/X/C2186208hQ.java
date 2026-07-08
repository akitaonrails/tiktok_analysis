package X;

import com.ss.android.ugc.aweme.business.live.cell.LiveSkylightBigAvatarCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08hQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.business.live.cell.LiveSkylightBigAvatarCell$bindRelationButton$1$3$1", f = "LiveSkylightBigAvatarCell.kt", l = {345}, m = "invokeSuspend")
public final class C2186208hQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveSkylightBigAvatarCell LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2186208hQ(LiveSkylightBigAvatarCell liveSkylightBigAvatarCell, InterfaceC1364105Vn<? super C2186208hQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveSkylightBigAvatarCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2186208hQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveSkylightBigAvatarCell@40ab.bindRelationButton$1$3$1");
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
            C432980GyO c432980GyO = new C432980GyO(this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c432980GyO) == objLJFF) {
                C1C7U.LIZIZ("LiveSkylightBigAvatarCell@40ab.bindRelationButton$1$3$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveSkylightBigAvatarCell@40ab.bindRelationButton$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
