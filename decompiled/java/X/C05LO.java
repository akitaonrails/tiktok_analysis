package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05LO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.recallmessage.ReEditViewModel$reportWithGroupOwner$1$groupOwnerAccountType$1", f = "ReEditViewModel.kt", l = {}, m = "invokeSuspend")
public final class C05LO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05LO(String str, InterfaceC1364105Vn<? super C05LO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LO(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        C1C7U.LIZ("ReEditViewModel@fcd5.reportWithGroupOwner$1$groupOwnerAccountType$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(this.LL, null, "im_local_db");
        if (iMUserLJIIL == null || (imUserBizInfo = iMUserLJIIL.getImUserBizInfo()) == null || (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) == null || (str = userB2CAccountInfo.userTags) == null) {
            str = "";
        }
        C1C7U.LIZIZ("ReEditViewModel@fcd5.reportWithGroupOwner$1$groupOwnerAccountType$1");
        return str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
