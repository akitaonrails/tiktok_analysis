package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0OI3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.BulletinDataCenter$channelTypeComputed$1", f = "BulletinDataCenter.kt", l = {}, m = "invokeSuspend")
public final class C0OI3 extends C09AX implements InterfaceC1631630sYr<EnumC617060OIe, EnumC617010OHz, BulletinBoardInfo, InterfaceC1364105Vn<? super EnumC617480OJu>, Object> {
    public /* synthetic */ EnumC617060OIe LL;
    public /* synthetic */ EnumC617010OHz LLILLJJLI;
    public /* synthetic */ BulletinBoardInfo LLILLL;

    public C0OI3(InterfaceC1364105Vn<? super C0OI3> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinDataCenter@f17c.channelTypeComputed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC617480OJu enumC617480OJuLIZ = C0OIV.LIZ(this.LL, C2286608xc.LJ(this.LLILLJJLI.getStatus()), this.LLILLL.status);
        C1C7U.LIZIZ("BulletinDataCenter@f17c.channelTypeComputed$1");
        return enumC617480OJuLIZ;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(EnumC617060OIe enumC617060OIe, EnumC617010OHz enumC617010OHz, BulletinBoardInfo bulletinBoardInfo, InterfaceC1364105Vn<? super EnumC617480OJu> interfaceC1364105Vn) {
        C0OI3 c0oi3 = new C0OI3(interfaceC1364105Vn);
        c0oi3.LL = enumC617060OIe;
        c0oi3.LLILLJJLI = enumC617010OHz;
        c0oi3.LLILLL = bulletinBoardInfo;
        return c0oi3.invokeSuspend(Unit.LIZ);
    }
}
