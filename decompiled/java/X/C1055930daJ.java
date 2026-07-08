package X;

import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0daJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM$onFacebookAuth$1", f = "RecUserAfterAuthPopupVM.kt", l = {65}, m = "invokeSuspend")
public final class C1055930daJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ RecUserAfterAuthPopupVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055930daJ(RecUserAfterAuthPopupVM recUserAfterAuthPopupVM, InterfaceC1364105Vn<? super C1055930daJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recUserAfterAuthPopupVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1055930daJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecUserAfterAuthPopupVM@d40f.onFacebookAuth$1");
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
            InterfaceC1004520cFO interfaceC1004520cFO = recUserAfterAuthPopupVM.LLILZIL;
            EnumC1074240e3q enumC1074240e3qLIZ = C1074230e3p.LIZ(recUserAfterAuthPopupVM.LL);
            this.LL = 1;
            obj = interfaceC1004520cFO.LIZIZ(enumC1074240e3qLIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RecUserAfterAuthPopupVM@d40f.onFacebookAuth$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        RecUserAfterAuthPopupVM recUserAfterAuthPopupVM2 = this.LLILLJJLI;
        new C2008507tr(recUserAfterAuthPopupVM2.LL, recUserAfterAuthPopupVM2.LLILLJJLI, zBooleanValue, "facebook").LIZLLL(null);
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        C1C7U.LIZIZ("RecUserAfterAuthPopupVM@d40f.onFacebookAuth$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
