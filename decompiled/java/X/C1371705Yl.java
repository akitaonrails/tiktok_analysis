package X;

import com.ss.android.ugc.aweme.launcershortcut.LauncherShortcutService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05Yl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.launcershortcut.LauncherShortcutService$openPermissionSettingPage$1$awaitBackToForegroundJob$1", f = "LauncherShortcutService.kt", l = {190}, m = "invokeSuspend")
public final class C1371705Yl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LauncherShortcutService LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371705Yl(LauncherShortcutService launcherShortcutService, C013C c013c, Function0<Unit> function0, InterfaceC1364105Vn<? super C1371705Yl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = launcherShortcutService;
        this.LLILLL = c013c;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1371705Yl(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.05Ym, X.18ZN] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LauncherShortcutService@f16f.openPermissionSettingPage$1$awaitBackToForegroundJob$1");
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
            final LauncherShortcutService launcherShortcutService = this.LLILLJJLI;
            final AwS368S0200000_2 awS368S0200000_2 = new AwS368S0200000_2(this.LLILLL, (C013C) this.LLILZ, (Function0<Unit>) 157);
            this.LL = 1;
            launcherShortcutService.getClass();
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            ?? r2 = new C18ZN() { // from class: X.05Ym
                @Override // X.C18ZN
                public final void onAppBackground() {
                    ((AbstractC1604130rqV) launcherShortcutService.LIZ.getValue()).LJIIIZ("onAppBackground");
                    awS368S0200000_2.invoke(Boolean.TRUE);
                }

                @Override // X.C18ZN
                public final void onAppForeground() {
                    ((AbstractC1604130rqV) launcherShortcutService.LIZ.getValue()).LJIIIZ("onAppForeground");
                    ActivityStack.removeAppBackGroundListener(this);
                    awS368S0200000_2.invoke(Boolean.FALSE);
                    InterfaceC20236714Gf interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(null);
                    interfaceC20236714Gf.resumeWith(null);
                }
            };
            c2252611DEt.LJJII(new AwS581S0100000_2((C1371805Ym) r2, 650));
            ActivityStack.addNonWeakAppBackGroundListener(r2);
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("LauncherShortcutService@f16f.openPermissionSettingPage$1$awaitBackToForegroundJob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LauncherShortcutService@f16f.openPermissionSettingPage$1$awaitBackToForegroundJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
