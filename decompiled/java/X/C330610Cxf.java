package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Cxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C330610Cxf {
    public static final /* synthetic */ C330610Cxf LIZ = new C330610Cxf();
    public static volatile InterfaceC328690CuZ LIZIZ;

    public static InterfaceC328690CuZ LIZ() {
        InterfaceC328690CuZ interfaceC328690CuZ = LIZIZ;
        if (interfaceC328690CuZ != null) {
            return interfaceC328690CuZ;
        }
        synchronized ("com.larus.business.markdown.impl.MarkdownServiceImpl") {
            try {
                InterfaceC328690CuZ interfaceC328690CuZ2 = LIZIZ;
                if (interfaceC328690CuZ2 != null) {
                    return interfaceC328690CuZ2;
                }
                try {
                    LIZIZ = (InterfaceC328690CuZ) Class.forName("nz6.a").newInstance();
                    return LIZIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}
