package X;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WWZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.popup.manager.EcUgShopTabPopupManager$awaitSafPopupThenLoad$2$lifecycleObserver$1$onResume$1", f = "EcUgShopTabPopupManager.kt", l = {762}, m = "invokeSuspend")
public final class C0WWZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC824510WWb LLILLL;
    public final /* synthetic */ Fragment LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ InterfaceC20236714Gf<Boolean> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0WWZ(InterfaceC824510WWb interfaceC824510WWb, Fragment fragment, String str, Function2<? super Boolean, ? super String, Unit> function2, boolean z, InterfaceC20236714Gf<? super Boolean> interfaceC20236714Gf, InterfaceC1364105Vn<? super C0WWZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC824510WWb;
        this.LLILZ = fragment;
        this.LLILZIL = str;
        this.LLILZLL = function2;
        this.LLIZ = z;
        this.LLIZLLLIL = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0WWZ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd A[PHI: r1
      0x00bd: PHI (r1v15 androidx.fragment.app.FragmentManager) = (r1v11 androidx.fragment.app.FragmentManager), (r1v27 androidx.fragment.app.FragmentManager) binds: [B:58:0x01a1, B:29:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016b  */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, X.0VvC] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WWZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
