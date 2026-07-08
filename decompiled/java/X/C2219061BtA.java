package X;

import android.app.Application;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2219061BtA extends C09AY implements Function0<Application> {
    public C2219061BtA() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Application invoke() {
        Application appContext;
        InterfaceC2219141BtI interfaceC2219141BtI = C2219091BtD.LJIIIZ;
        if (interfaceC2219141BtI == null || (appContext = interfaceC2219141BtI.getAppContext()) == null) {
            throw new RuntimeException("Lazy value not initialized yet.");
        }
        return appContext;
    }
}
