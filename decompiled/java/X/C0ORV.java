package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0ORV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.core.service.BulletinBoardDataServiceImplInternal$updateBulletinBoardStyleStruct$1", f = "BulletinBoardDataServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0ORV extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinStyleStruct LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ORV(BulletinStyleStruct bulletinStyleStruct, InterfaceC1364105Vn<? super C0ORV> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = bulletinStyleStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ORV(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardDataServiceImplInternal@8dc8.updateBulletinBoardStyleStruct$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C622080Oac c622080OacLIZJ = C622190Oan.LJFF().LIZJ();
        C619390ORd c619390ORdLIZ = C0ORT.LIZ(this.LL);
        if (c619390ORdLIZ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BulletinBoardDataServiceImplInternal@8dc8.updateBulletinBoardStyleStruct$1");
            return unit;
        }
        c622080OacLIZJ.LIZ(c619390ORdLIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinBoardDataServiceImplInternal@8dc8.updateBulletinBoardStyleStruct$1");
        return unit2;
    }
}
