package X;

import com.ss.android.ugc.aweme.relation.fragment.muflist.MufUserCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0mMO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.MufUserCell$onBindItemView$3", f = "MufUserCell.kt", l = {}, m = "invokeSuspend")
public final class C1393260mMO extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ MufUserCell LL;
    public final /* synthetic */ C1247690iZb LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1393260mMO(MufUserCell mufUserCell, C1247690iZb c1247690iZb, InterfaceC1364105Vn<? super C1393260mMO> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = mufUserCell;
        this.LLILLJJLI = c1247690iZb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1393260mMO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MufUserCell@4ff4.onBindItemView$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.T5(this.LLILLJJLI, EnumC1393270mMP.MESSAGE_BUTTON);
        C1C7U.LIZIZ("MufUserCell@4ff4.onBindItemView$3");
        return false;
    }
}
