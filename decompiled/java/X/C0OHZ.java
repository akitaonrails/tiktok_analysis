package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0OHZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel$updateBulletinListToNew$1$2", f = "BulletinListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0OHZ extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinListViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OHZ(BulletinListViewModel bulletinListViewModel, InterfaceC1364105Vn<? super C0OHZ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = bulletinListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OHZ(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("BulletinListViewModel@dbe7.updateBulletinListToNew$1$2");
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
        C13BV c13bv = C13BV.INSTANCE;
        C2286608xc.LJFF(0L);
        C2286608xc.LJFF(0L);
        C2286608xc.LJFF(0L);
        EnumC617610OKh.LOCAL_NETWORK_AVAILABLE.getStatusCode();
        BulletinListViewModel bulletinListViewModel = this.LL;
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        Exception exc = new Exception();
        c317290CcB.getClass();
        BulletinListViewModel.NQ2(bulletinListViewModel, c13bv, new C316650Cb9(exc), 4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinListViewModel@dbe7.updateBulletinListToNew$1$2");
        return unit;
    }
}
