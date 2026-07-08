package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.quickmention.QuickMentionLogicComponent$componentChangeListener$2$1$onPageSelected$1$1", f = "QuickMentionLogicComponent.kt", l = {}, m = "invokeSuspend")
public final class C1480005qo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ User LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1480005qo(User user, InterfaceC1364105Vn<? super C1480005qo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = user;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1480005qo(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickMentionLogicComponent@beeb.componentChangeListener$2$1$onPageSelected$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LJ().LIZLLL(this.LL.getUid(), this.LL.getSecUid(), "im_input");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QuickMentionLogicComponent@beeb.componentChangeListener$2$1$onPageSelected$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
