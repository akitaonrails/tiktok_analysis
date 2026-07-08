package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0CnP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.popup.service.EcUgPopupService$openDeeplinkAndAwaitTargetDestroy$job$1", f = "EcUgPopupService.kt", l = {293}, m = "invokeSuspend")
public final class C324250CnP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324250CnP(String str, Function0<Unit> function0, InterfaceC1364105Vn<? super C324250CnP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324250CnP(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0CnQ, java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcUgPopupService@c79f.openDeeplinkAndAwaitTargetDestroy$job$1");
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
            C1740260vO4 c1740260vO4 = C1740260vO4.LIZ;
            final String str = this.LLILLJJLI;
            this.LL = 1;
            c1740260vO4.getClass();
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            ?? r2 = new InterfaceC324270CnR() { // from class: X.0CnQ
                @Override // X.InterfaceC324270CnR
                public final void LIZ(String str2) {
                    if (Intrinsics.LJFF(str, str2)) {
                        InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                        Boolean bool = Boolean.TRUE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC20236714Gf.resumeWith(bool);
                        C1740260vO4.LIZIZ.remove(this);
                    }
                }
            };
            c2252611DEt.LJJII(new AwS583S0100000_4((C324260CnQ) r2, 325));
            C1740260vO4.LIZIZ.add((InterfaceC324270CnR) r2);
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("EcUgPopupService@c79f.openDeeplinkAndAwaitTargetDestroy$job$1");
                return objLJFF;
            }
        }
        this.LLILLL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcUgPopupService@c79f.openDeeplinkAndAwaitTargetDestroy$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
