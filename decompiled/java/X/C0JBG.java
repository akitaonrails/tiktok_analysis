package X;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS42S0500000_7;
import njp.a;

/* JADX INFO: renamed from: X.0JBG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.launcershortcut.executor.DefaultLauncherShortcutExecutor$tryAddLauncherShortcutInternal$1$1$awaitBroadcastJob$1", f = "DefaultLauncherShortcutExecutor.kt", l = {98}, m = "invokeSuspend")
public final class C0JBG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C816050Vzn LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Function2<Boolean, Throwable, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0JBG(C816050Vzn c816050Vzn, Context context, Function2<? super Boolean, ? super Throwable, Unit> function2, InterfaceC1364105Vn<? super C0JBG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c816050Vzn;
        this.LLILLL = context;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JBG(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [X.0JBF, android.content.BroadcastReceiver] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("DefaultLauncherShortcutExecutor@f994.tryAddLauncherShortcutInternal$1$1$awaitBroadcastJob$1");
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
            final C816050Vzn c816050Vzn = this.LLILLJJLI;
            Context context = this.LLILLL;
            final Function2<Boolean, Throwable, Unit> function2 = this.LLILZ;
            this.LL = 1;
            c816050Vzn.getClass();
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            final C013C c013c = new C013C();
            ?? r10 = new BroadcastReceiver() { // from class: X.0JBF
                public final void LIZ(Context context2) {
                    ((AbstractC1604130rqV) c816050Vzn.LIZIZ.getValue()).LJIIIZ("ShortcutReceiver onReceive");
                    if (c013c.element) {
                        if (context2 != null) {
                            C786410Ut5.LJJIFFI(context2, this);
                        }
                        c013c.element = false;
                        Function2<Boolean, Throwable, Unit> function22 = function2;
                        if (function22 != null) {
                            function22.invoke(Boolean.TRUE, null);
                        }
                        InterfaceC20236714Gf interfaceC20236714Gf = c2252611DEt;
                        C189200o6.m2constructorimpl(null);
                        interfaceC20236714Gf.resumeWith(null);
                    }
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    if (!C2214201BlK.LJIIJJI && intent != null) {
                        if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                            C2188191AkT.LIZIZ();
                        }
                    }
                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        LIZ(context2);
                    } else {
                        C2408409cA.LIZ();
                        LIZ(context2);
                    }
                }
            };
            c2252611DEt.LJJII(new AwS42S0500000_7(c816050Vzn, (C816050Vzn) c013c, (C013C) context, (Context) r10, (C0JBF) function2, (Function2<? super Boolean, ? super Throwable, Unit>) 1));
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.ss.android.ugc.aweme.shortcut.INSTALL_SHORTCUT");
            if (context instanceof Application) {
                if (Build.VERSION.SDK_INT >= 33) {
                    C838410Wul.LJFF(context, r10, intentFilter, 4);
                } else {
                    if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                        ReceiverRegisterCrashOptimizer.doHWReceiverFix();
                    }
                    try {
                        C838410Wul.LJI(context, r10, intentFilter, null, null, 2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                            ReceiverRegisterCrashOptimizer.registerReceiver(r10, intentFilter, null, null);
                        } else {
                            throw e;
                        }
                    }
                }
                c013c.element = true;
            }
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("DefaultLauncherShortcutExecutor@f994.tryAddLauncherShortcutInternal$1$1$awaitBroadcastJob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultLauncherShortcutExecutor@f994.tryAddLauncherShortcutInternal$1$1$awaitBroadcastJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
