package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0ORZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.core.service.BulletinBoardDataServiceImplInternal$saveBulletinBoardItemList$2", f = "BulletinBoardDataServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0ORZ extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinListResponse LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C0ORW LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ORZ(BulletinListResponse bulletinListResponse, String str, boolean z, C0ORW c0orw, InterfaceC1364105Vn<? super C0ORZ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = bulletinListResponse;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = c0orw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ORZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardDataServiceImplInternal@8dc8.saveBulletinBoardItemList$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean.valueOf(C622190Oan.LJFF().LIZ().LIZ(C619020OPs.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL)));
        C0ORW c0orw = this.LLILZ;
        List list = this.LL.bulletinItems;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        c0orw.getClass();
        Unit unitLJIIZILJ = C0ORW.LJIIZILJ(list);
        C1C7U.LIZIZ("BulletinBoardDataServiceImplInternal@8dc8.saveBulletinBoardItemList$2");
        return unitLJIIZILJ;
    }
}
