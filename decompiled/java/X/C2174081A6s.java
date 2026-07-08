package X;

import android.app.Activity;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1A6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.screenshot.ScreenShotMonitor$stopListen$2", f = "ScreenShotMonitor.kt", l = {}, m = "invokeSuspend")
public final class C2174081A6s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ WeakReference<Activity> LL;
    public final /* synthetic */ C2174091A6t LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2174081A6s(WeakReference<Activity> weakReference, C2174091A6t c2174091A6t, InterfaceC1364105Vn<? super C2174081A6s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = weakReference;
        this.LLILLJJLI = c2174091A6t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2174081A6s(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2174111A6v c2174111A6v;
        C1C7U.LIZ("ScreenShotMonitor@2fa1.stopListen$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Activity activity = this.LL.get();
        Unit unit = null;
        if (activity != null) {
            C2174091A6t c2174091A6t = this.LLILLJJLI;
            C717590SCv c717590SCv = c2174091A6t.LJII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C2174091A6t.LJIIIZ;
            c717590SCv.LIZIZ(null);
            C20343314it c20343314it = C20343314it.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Activity[");
            sbLIZ.append(activity);
            sbLIZ.append("]: Try to stop screen shot listener: isHasScreenShotListen: ");
            sbLIZ.append(c2174091A6t.LIZ);
            sbLIZ.append(" isHasScreenShotCaptureCallback: ");
            sbLIZ.append(c2174091A6t.LIZIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20343314it.getClass();
            C20343314it.LIZ(strLIZIZ);
            if (c2174091A6t.LIZ) {
                try {
                    C2174101A6u c2174101A6u = c2174091A6t.LIZJ;
                    if (c2174101A6u != null) {
                        activity.getContentResolver().unregisterContentObserver(c2174101A6u);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20343314it c20343314it2 = C20343314it.LIZ;
                    String string = e.toString();
                    c20343314it2.getClass();
                    C20343314it.LIZ(string);
                }
                c2174091A6t.LIZJ = null;
                try {
                    C2174101A6u c2174101A6u2 = c2174091A6t.LIZLLL;
                    if (c2174101A6u2 != null) {
                        activity.getContentResolver().unregisterContentObserver(c2174101A6u2);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C20343314it c20343314it3 = C20343314it.LIZ;
                    String string2 = e2.toString();
                    c20343314it3.getClass();
                    C20343314it.LIZ(string2);
                }
                c2174091A6t.LIZLLL = null;
                C20343314it c20343314it4 = C20343314it.LIZ;
                String str = e3.e + activity + "] Stop listen";
                c20343314it4.getClass();
                C20343314it.LIZ(str);
                c2174091A6t.LIZ = false;
                c2174091A6t.LIZ(0L);
            }
            if (c2174091A6t.LIZIZ && Build.VERSION.SDK_INT >= 34 && (c2174111A6v = c2174091A6t.LJI) != null) {
                try {
                    activity.unregisterScreenCaptureCallback(c2174111A6v);
                    c2174091A6t.LIZIZ = false;
                    c2174091A6t.LIZ(0L);
                    C20343314it c20343314it5 = C20343314it.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('[');
                    sbLIZ2.append(activity);
                    sbLIZ2.append("] Stop listen");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c20343314it5.getClass();
                    C20343314it.LIZ(strLIZIZ2);
                } catch (IllegalStateException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    c2174091A6t.LIZIZ = false;
                    C20343314it c20343314it6 = C20343314it.LIZ;
                    String string3 = e3.toString();
                    c20343314it6.getClass();
                    C20343314it.LIZ(string3);
                }
            }
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("ScreenShotMonitor@2fa1.stopListen$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
