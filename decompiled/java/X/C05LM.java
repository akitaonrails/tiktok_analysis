package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05LM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.LongClickHandler$prefetchGroupOwnerAccountType$1$accountType$1", f = "LongClickHandler.kt", l = {943}, m = "invokeSuspend")
public final class C05LM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05LM(String str, InterfaceC1364105Vn<? super C05LM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LM(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        C1C7U.LIZ("LongClickHandler@7f82.prefetchGroupOwnerAccountType$1$accountType$1");
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
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            String str2 = this.LLILLJJLI;
            this.LL = 1;
            obj = c1bgsLJ.LJIJ(str2, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LongClickHandler@7f82.prefetchGroupOwnerAccountType$1$accountType$1");
                return objLJFF;
            }
        }
        IMUser iMUser = (IMUser) obj;
        if (iMUser == null || (imUserBizInfo = iMUser.getImUserBizInfo()) == null || (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) == null || (str = userB2CAccountInfo.userTags) == null) {
            str = "";
        }
        C1C7U.LIZIZ("LongClickHandler@7f82.prefetchGroupOwnerAccountType$1$accountType$1");
        return str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
