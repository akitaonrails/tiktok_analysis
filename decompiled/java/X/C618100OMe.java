package X;

import com.ss.android.ugc.aweme.inbox.bulletin.core.convert.model.SimpleBulletinBoardInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0OMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.core.service.BulletinBoardDataServiceImplInternal$saveSimpleBulletinBoardAccountInfoAsync$1", f = "BulletinBoardDataServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C618100OMe extends C09AX implements Function1<InterfaceC1364105Vn<? super C618110OMf>, Object> {
    public final /* synthetic */ SimpleBulletinBoardInfo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C618100OMe(SimpleBulletinBoardInfo simpleBulletinBoardInfo, InterfaceC1364105Vn<? super C618100OMe> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = simpleBulletinBoardInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C618100OMe(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C618110OMf> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardDataServiceImplInternal@8dc8.saveSimpleBulletinBoardAccountInfoAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C618110OMf c618110OMfLIZJ = C0OMZ.LIZJ(this.LL);
        if (!C622190Oan.LJFF().LIZIZ().LIZ(c618110OMfLIZJ)) {
            c618110OMfLIZJ = null;
        }
        C1C7U.LIZIZ("BulletinBoardDataServiceImplInternal@8dc8.saveSimpleBulletinBoardAccountInfoAsync$1");
        return c618110OMfLIZJ;
    }
}
