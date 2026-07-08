package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0ORU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.core.service.BulletinBoardDataServiceImplInternal$updateBulletinBoardStyleStructList$1", f = "BulletinBoardDataServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0ORU extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<BulletinStyleStruct> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ORU(List<BulletinStyleStruct> list, InterfaceC1364105Vn<? super C0ORU> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ORU(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        C619390ORd c619390ORdLIZ;
        C1C7U.LIZ("BulletinBoardDataServiceImplInternal@8dc8.updateBulletinBoardStyleStructList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C622080Oac c622080OacLIZJ = C622190Oan.LJFF().LIZJ();
        List<BulletinStyleStruct> list = this.LL;
        if (list != null) {
            arrayList = new ArrayList();
            for (BulletinStyleStruct bulletinStyleStruct : list) {
                if (bulletinStyleStruct != null && (c619390ORdLIZ = C0ORT.LIZ(bulletinStyleStruct)) != null) {
                    arrayList.add(c619390ORdLIZ);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        c622080OacLIZJ.getClass();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c622080OacLIZJ.LIZ((C619390ORd) it2.next());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinBoardDataServiceImplInternal@8dc8.updateBulletinBoardStyleStructList$1");
        return unit;
    }
}
