package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.ShareUserContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05py, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.user.UserBindInfoRepository$queryUser$1$3$onQueryResult$1", f = "ShareUserViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1474805py extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C09AJ<C1477705qR> LL;
    public final /* synthetic */ IMUser LLILLJJLI;
    public final /* synthetic */ ShareUserContent LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ IMUser LLILZIL;
    public final /* synthetic */ Function1<IMUser, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1474805py(C09AJ<C1477705qR> c09aj, IMUser iMUser, ShareUserContent shareUserContent, boolean z, IMUser iMUser2, Function1<? super IMUser, Unit> function1, InterfaceC1364105Vn<? super C1474805py> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c09aj;
        this.LLILLJJLI = iMUser;
        this.LLILLL = shareUserContent;
        this.LLILZ = z;
        this.LLILZIL = iMUser2;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1474805py(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function1<IMUser, Unit> function1;
        String uid;
        C1C7U.LIZ("UserBindInfoRepository@38de.queryUser$1$3$onQueryResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isDisposed()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("UserBindInfoRepository@38de.queryUser$1$3$onQueryResult$1");
            return unit;
        }
        this.LL.onNext(C1477805qS.LIZIZ(this.LLILLJJLI, this.LLILLL));
        if (this.LLILZ && (uid = this.LLILLJJLI.getUid()) != null) {
            IMContactApi.LIZ.getClass();
            Boolean.valueOf(C069P.LIZ().LJ().LJJII(uid));
        }
        if (this.LLILZIL == null && (function1 = this.LLILZLL) != null) {
            function1.invoke(this.LLILLJJLI);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("UserBindInfoRepository@38de.queryUser$1$3$onQueryResult$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
