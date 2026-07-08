package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0tVB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.passwordless.leaked.HasPasskeyPageKt$HasPasskeyPage$2$1", f = "HasPasskeyPage.kt", l = {}, m = "invokeSuspend")
public final class C1667790tVB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DialogC1389620mGW LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ C05P1<AbstractC1667800tVC> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1667790tVB(DialogC1389620mGW dialogC1389620mGW, Function0<Unit> function0, Function0<Unit> function02, C05P1<? extends AbstractC1667800tVC> c05p1, InterfaceC1364105Vn<? super C1667790tVB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dialogC1389620mGW;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
        this.LLILZ = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1667790tVB(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HasPasskeyPageKt@c0cf.HasPasskeyPage$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0FNV.LIZ(this.LL);
        AbstractC1667800tVC value = this.LLILZ.getValue();
        if (!Intrinsics.LJFF(value, C1667810tVD.LIZ)) {
            if (Intrinsics.LJFF(value, C1667830tVF.LIZ)) {
                this.LLILLJJLI.invoke();
            } else if (Intrinsics.LJFF(value, C1667840tVG.LIZ)) {
                this.LLILLL.invoke();
            } else if (Intrinsics.LJFF(value, C1667850tVH.LIZ)) {
                C786410Ut5.J4(this.LL);
            } else {
                throw new C1954807lC();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HasPasskeyPageKt@c0cf.HasPasskeyPage$2$1");
        return unit;
    }
}
