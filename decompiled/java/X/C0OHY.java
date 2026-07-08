package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0OHY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel$getBulletinResultWrapper$3", f = "BulletinListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0OHY extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinListViewModel LL;
    public final /* synthetic */ C259800zU<C616870OHl> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OHY(BulletinListViewModel bulletinListViewModel, C259800zU<C616870OHl> c259800zU, InterfaceC1364105Vn<? super C0OHY> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = bulletinListViewModel;
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OHY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.0OHl] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("BulletinListViewModel@dbe7.getBulletinResultWrapper$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status:no network， channelID: ");
        C0OLV c0olvHh2 = this.LL.Hh2();
        if (c0olvHh2 != null) {
            str = c0olvHh2.LL;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(' ');
        C0OPX.LJIILIIL("/tiktok/bulletin/item/list/", "fetch", C2188811AlT.LIZIZ(sbLIZ));
        C259800zU<C616870OHl> c259800zU = this.LLILLJJLI;
        EnumC044600Ea enumC044600Ea = EnumC044600Ea.ERROR;
        C13BV c13bv = C13BV.INSTANCE;
        Long lLJFF = C2286608xc.LJFF(0L);
        Long lLJFF2 = C2286608xc.LJFF(0L);
        C2286608xc.LJFF(0L);
        c259800zU.element = new C616870OHl(enumC044600Ea, false, null, c13bv, 0, 0, lLJFF, lLJFF2, EnumC617610OKh.LOCAL_NETWORK_AVAILABLE.getStatusCode());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinListViewModel@dbe7.getBulletinResultWrapper$3");
        return unit;
    }
}
