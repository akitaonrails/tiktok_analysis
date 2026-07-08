package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JBI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.launcershortcut.executor.DefaultLauncherShortcutExecutor$tryAddLauncherShortcutInternal$1$1$1", f = "DefaultLauncherShortcutExecutor.kt", l = {}, m = "invokeSuspend")
public final class C0JBI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ Function2<Boolean, Throwable, Unit> LLILLJJLI;
    public final /* synthetic */ C259800zU<C09AE> LLILLL;
    public final /* synthetic */ C815230VyT LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0JBI(Context context, Function2<? super Boolean, ? super Throwable, Unit> function2, C259800zU<C09AE> c259800zU, C815230VyT c815230VyT, InterfaceC1364105Vn<? super C0JBI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = function2;
        this.LLILLL = c259800zU;
        this.LLILZ = c815230VyT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JBI(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("DefaultLauncherShortcutExecutor@f994.tryAddLauncherShortcutInternal$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LL;
        Intent intent = new Intent();
        intent.setAction("com.ss.android.ugc.aweme.shortcut.INSTALL_SHORTCUT");
        try {
            c098200Yq = Boolean.valueOf(C815220VyS.LJII(this.LL, this.LLILZ, PendingIntent.getBroadcast(context, 1001, intent, 201326592).getIntentSender()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = false;
        }
        if (!((Boolean) c098200Yq).booleanValue()) {
            Function2<Boolean, Throwable, Unit> function2 = this.LLILLJJLI;
            if (function2 != null) {
                function2.invoke(false, new Throwable("tryAddLauncherShortcut requestPinShortcut fail"));
            }
            C09AE c09ae = this.LLILLL.element;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            this.LLILLL.element = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultLauncherShortcutExecutor@f994.tryAddLauncherShortcutInternal$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
