package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0db8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.helper.SocialRecFriendsDialogHelper$onlineRecWhenNoAuthDialogLogic$1", f = "SocialRecFriendsDialogHelper.kt", l = {280}, m = "invokeSuspend")
public final class C1056440db8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1072730e1P LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056440db8(C1072730e1P c1072730e1P, InterfaceC1364105Vn<? super C1056440db8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1072730e1P;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1056440db8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialRecFriendsDialogHelper@6ca4.onlineRecWhenNoAuthDialogLogic$1");
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
            InterfaceC1056430db7 interfaceC1056430db7LJIILL = C2277891EDz.LIZIZ.LJIILL();
            String strInvoke = this.LLILLJJLI.LIZIZ.invoke();
            this.LL = 1;
            if (interfaceC1056430db7LJIILL.LIZ(C1071540dzU.LIZIZ.LIZIZ(), strInvoke, false, this) == objLJFF) {
                C1C7U.LIZIZ("SocialRecFriendsDialogHelper@6ca4.onlineRecWhenNoAuthDialogLogic$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialRecFriendsDialogHelper@6ca4.onlineRecWhenNoAuthDialogLogic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
