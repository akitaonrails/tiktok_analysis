package X;

import com.ss.android.ugc.aweme.verify.bio.BioVerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08qR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.bio.BioVerifyViewModel$sendVerifyEvent$1", f = "BioVerifyViewModel.kt", l = {424, 426, 428}, m = "invokeSuspend")
public final class C2242108qR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ BioVerifyViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2242108qR(BioVerifyViewModel bioVerifyViewModel, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = bioVerifyViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2242108qR(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("BioVerifyViewModel@d5f8.sendVerifyEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLJJLI;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C1713570uh1 c1713570uh1 = this.LLILLL.LLJ;
                if (c1713570uh1 != null) {
                    String eventName = EnumC2242008qQ.PAGE_RENDERED.getEventName();
                    this.LL = 1;
                    if (c1713570uh1.LJIILIIL(eventName, null, this) == objLJFF) {
                        C1C7U.LIZIZ("BioVerifyViewModel@d5f8.sendVerifyEvent$1");
                        return objLJFF;
                    }
                }
            } else if (Intrinsics.LJFF(this.LLILLJJLI, "PASS")) {
                C1713570uh1 c1713570uh12 = this.LLILLL.LLJ;
                if (c1713570uh12 != null) {
                    String eventName2 = EnumC2242008qQ.VERIFY_SUCCEEDED_PAGE_CLOSED.getEventName();
                    this.LL = 2;
                    if (c1713570uh12.LJIILIIL(eventName2, null, this) == objLJFF) {
                        C1C7U.LIZIZ("BioVerifyViewModel@d5f8.sendVerifyEvent$1");
                        return objLJFF;
                    }
                }
            } else {
                C1713570uh1 c1713570uh13 = this.LLILLL.LLJ;
                if (c1713570uh13 != null) {
                    String eventName3 = EnumC2242008qQ.PAGE_CLOSED.getEventName();
                    this.LL = 3;
                    if (c1713570uh13.LJIILIIL(eventName3, null, this) == objLJFF) {
                        C1C7U.LIZIZ("BioVerifyViewModel@d5f8.sendVerifyEvent$1");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BioVerifyViewModel@d5f8.sendVerifyEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
