package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.ShareUserContent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05pz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.user.UserBindInfoRepository$queryUser$1$1", f = "ShareUserViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1474905pz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C09AJ<C1477705qR> LL;
    public final /* synthetic */ IMUser LLILLJJLI;
    public final /* synthetic */ ShareUserContent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1474905pz(C09AJ<C1477705qR> c09aj, IMUser iMUser, ShareUserContent shareUserContent, InterfaceC1364105Vn<? super C1474905pz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c09aj;
        this.LLILLJJLI = iMUser;
        this.LLILLL = shareUserContent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1474905pz(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1477705qR c1477705qR;
        C1C7U.LIZ("UserBindInfoRepository@38de.queryUser$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C09AJ<C1477705qR> c09aj = this.LL;
        IMUser iMUser = this.LLILLJJLI;
        if (iMUser != null) {
            c1477705qR = C1477805qS.LIZIZ(iMUser, this.LLILLL);
        } else {
            ShareUserContent shareUserContent = this.LLILLL;
            String uid = shareUserContent.getUid();
            String name = shareUserContent.getName();
            String desc = shareUserContent.getDesc();
            UrlModel avatar = shareUserContent.getAvatar();
            List<UrlModel> awemeCoverList = shareUserContent.getAwemeCoverList();
            if (awemeCoverList == null) {
                awemeCoverList = C13BV.INSTANCE;
            }
            c1477705qR = new C1477705qR(uid, name, desc, avatar, true, awemeCoverList);
        }
        c09aj.onNext(c1477705qR);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserBindInfoRepository@38de.queryUser$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
