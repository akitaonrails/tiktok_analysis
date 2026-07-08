package X;

import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS31S0010000_16;
import njp.a;

/* JADX INFO: renamed from: X.0cAo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM$awaitAllSync$1", f = "RecUserAfterAuthPopupVM.kt", l = {108}, m = "invokeSuspend")
public final class C1001680cAo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecUserAfterAuthPopupVM LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<Boolean> LLILLL;
    public final /* synthetic */ AnonymousClass0957<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001680cAo(RecUserAfterAuthPopupVM recUserAfterAuthPopupVM, AnonymousClass0957<Boolean> anonymousClass0957, AnonymousClass0957<Boolean> anonymousClass09572, InterfaceC1364105Vn<? super C1001680cAo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recUserAfterAuthPopupVM;
        this.LLILLL = anonymousClass0957;
        this.LLILZ = anonymousClass09572;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001680cAo(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecUserAfterAuthPopupVM@d40f.awaitAllSync$1");
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
            RecUserAfterAuthPopupVM recUserAfterAuthPopupVM = this.LLILLJJLI;
            AnonymousClass0957<Boolean> anonymousClass0957 = this.LLILLL;
            AnonymousClass0957<Boolean> anonymousClass09572 = this.LLILZ;
            this.LL = 1;
            obj = recUserAfterAuthPopupVM.vQ2(anonymousClass0957, anonymousClass09572, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RecUserAfterAuthPopupVM@d40f.awaitAllSync$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("auth sync is success: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append('!');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1264320j0Q.getClass();
        C1264320j0Q.LIZLLL("Auth_RecUser", strLIZIZ);
        this.LLILLJJLI.setState(new AwS31S0010000_16(zBooleanValue, 9));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecUserAfterAuthPopupVM@d40f.awaitAllSync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
