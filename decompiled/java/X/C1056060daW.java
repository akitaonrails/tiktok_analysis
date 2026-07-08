package X;

import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0daW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM$onContactAuth$1", f = "RecUserAfterAuthPopupVM.kt", l = {77, 80}, m = "invokeSuspend")
public final class C1056060daW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public boolean LL;
    public int LLILLJJLI;
    public final /* synthetic */ RecUserAfterAuthPopupVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056060daW(RecUserAfterAuthPopupVM recUserAfterAuthPopupVM, InterfaceC1364105Vn<? super C1056060daW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = recUserAfterAuthPopupVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1056060daW(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("RecUserAfterAuthPopupVM@d40f.onContactAuth$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    zBooleanValue = this.LL;
                    C155000ia.LIZIZ(obj);
                    RecUserAfterAuthPopupVM recUserAfterAuthPopupVM = this.LLILLL;
                    new C2008507tr(recUserAfterAuthPopupVM.LL, recUserAfterAuthPopupVM.LLILLJJLI, zBooleanValue, "contact").LIZLLL(null);
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    C1C7U.LIZIZ("RecUserAfterAuthPopupVM@d40f.onContactAuth$1");
                    return boolValueOf;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            RecUserAfterAuthPopupVM recUserAfterAuthPopupVM2 = this.LLILLL;
            InterfaceC1055970daN interfaceC1055970daN = recUserAfterAuthPopupVM2.LLILZ;
            EnumC1074240e3q enumC1074240e3qLIZ = C1074230e3p.LIZ(recUserAfterAuthPopupVM2.LL);
            this.LLILLJJLI = 1;
            obj = interfaceC1055970daN.LIZIZ(enumC1074240e3qLIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RecUserAfterAuthPopupVM@d40f.onContactAuth$1");
                return objLJFF;
            }
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        C338980DQq.LIZ.getClass();
        if (C338980DQq.LIZIZ()) {
            C1071540dzU c1071540dzU = C1071540dzU.LIZIZ;
            if (c1071540dzU.LJ(EnumC1070340dxY.CONTACT).LIZIZ()) {
                InterfaceC1056100daa interfaceC1056100daaLJIIIZ = c1071540dzU.LJIIIZ();
                int value = EnumC1056090daZ.CONTACT_BOOK_SYNCING.getValue();
                this.LL = zBooleanValue;
                this.LLILLJJLI = 2;
                if (interfaceC1056100daaLJIIIZ.LIZ(value, this) == objLJFF) {
                    C1C7U.LIZIZ("RecUserAfterAuthPopupVM@d40f.onContactAuth$1");
                    return objLJFF;
                }
            }
        }
        RecUserAfterAuthPopupVM recUserAfterAuthPopupVM3 = this.LLILLL;
        new C2008507tr(recUserAfterAuthPopupVM3.LL, recUserAfterAuthPopupVM3.LLILLJJLI, zBooleanValue, "contact").LIZLLL(null);
        Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
        C1C7U.LIZIZ("RecUserAfterAuthPopupVM@d40f.onContactAuth$1");
        return boolValueOf2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
