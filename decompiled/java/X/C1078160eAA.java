package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0eAA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078160eAA {
    public static InterfaceC1078810eBD LIZ() {
        if (C1077600e9G.LJIIL == null) {
            try {
                C1077600e9G.LJIIL = (InterfaceC1078810eBD) Class.forName("com.bytedance.android.widget.widget.load.LiveWidgetLoadInfoRepository").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "InitWidgetLoadInfoRepository");
            }
        }
        return C1077600e9G.LJIIL;
    }
}
