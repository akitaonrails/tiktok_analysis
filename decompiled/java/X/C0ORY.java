package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0ORY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.core.service.BulletinBoardDataServiceImplInternal$saveBulletinBoardItemAsync$1", f = "BulletinBoardDataServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0ORY extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinItem LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ORY(BulletinItem bulletinItem, String str, boolean z, InterfaceC1364105Vn<? super C0ORY> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = bulletinItem;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ORY(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C619390ORd c619390ORdLIZIZ;
        C1C7U.LIZ("BulletinBoardDataServiceImplInternal@8dc8.saveBulletinBoardItemAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BulletinItem bulletinItem = this.LL;
        String str = this.LLILLJJLI;
        boolean z = this.LLILLL;
        C619020OPs.LIZIZ.getValue().getClass();
        C619060OPw c619060OPwLIZ = AbstractC618980OPo.LIZ(bulletinItem, str, z);
        if (c619060OPwLIZ != null) {
            Boolean.valueOf(C622190Oan.LJFF().LIZ().LIZ(Collections.singletonList(c619060OPwLIZ)));
        }
        User publishUser = this.LL.getPublishUser();
        if (publishUser != null && (c619390ORdLIZIZ = C619400ORe.LIZIZ(publishUser)) != null) {
            C622190Oan.LJFF().LIZLLL().LIZ(c619390ORdLIZIZ);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("BulletinBoardDataServiceImplInternal@8dc8.saveBulletinBoardItemAsync$1");
        return unit;
    }
}
