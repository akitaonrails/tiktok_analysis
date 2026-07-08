package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.DMSendToFriendMenuActionHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.DMSendToFriendMenuActionHelper$getUsers$1", f = "DMSendToFriendMenuActionHelper.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C451750HnZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DMSendToFriendMenuActionHelper LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451750HnZ(DMSendToFriendMenuActionHelper dMSendToFriendMenuActionHelper, InterfaceC1364105Vn<? super C451750HnZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dMSendToFriendMenuActionHelper;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C451750HnZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMSendToFriendMenuActionHelper@572c.getUsers$1");
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
            C0O22 c0o22 = C0O22.LIZ;
            this.LL = 1;
            if (c0o22.LIZLLL(this) == objLJFF) {
                C1C7U.LIZIZ("DMSendToFriendMenuActionHelper@572c.getUsers$1");
                return objLJFF;
            }
        }
        C0O22.LIZ.getClass();
        ArrayList arrayList = new ArrayList(C0O22.LIZIZ);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof IMUser) {
                arrayList2.add(obj2);
            }
        }
        List listLL = C13LP.LL(arrayList2, 3);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listLL) {
            IMUser iMUser = (IMUser) obj3;
            IIMContactUtilService.LIZ.getClass();
            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
            if (iIMContactUtilServiceLIZ != null && !iIMContactUtilServiceLIZ.LJIIIZ(iMUser)) {
                arrayList3.add(obj3);
            }
        }
        this.LLILLJJLI.LIZJ = C13LP.LL(arrayList3, 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMSendToFriendMenuActionHelper@572c.getUsers$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
