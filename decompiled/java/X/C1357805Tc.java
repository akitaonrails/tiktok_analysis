package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.contactselect.ContactSelectPanelKt$TopSelectedAvatarRow$1$1", f = "ContactSelectPanel.kt", l = {479}, m = "invokeSuspend")
public final class C1357805Tc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ InterfaceC1676320tiw LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1357805Tc(C1690080u58 c1690080u58, Function0<Unit> function0, InterfaceC1676320tiw interfaceC1676320tiw, InterfaceC1364105Vn<? super C1357805Tc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690080u58;
        this.LLILLL = function0;
        this.LLILZ = interfaceC1676320tiw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1357805Tc(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactSelectPanelKt@b0ce.TopSelectedAvatarRow$1$1");
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
            if (this.LLILZ.LIZLLL() != -1) {
                C1690080u58 c1690080u58 = this.LLILLJJLI;
                int iLIZLLL = this.LLILZ.LIZLLL();
                this.LL = 1;
                C1687100u0K c1687100u0K = C1690080u58.LJIL;
                if (c1690080u58.LJFF(iLIZLLL, 0, this) == objLJFF) {
                    C1C7U.LIZIZ("ContactSelectPanelKt@b0ce.TopSelectedAvatarRow$1$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ContactSelectPanelKt@b0ce.TopSelectedAvatarRow$1$1");
            return unit;
        }
        this.LLILLL.invoke();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ContactSelectPanelKt@b0ce.TopSelectedAvatarRow$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
