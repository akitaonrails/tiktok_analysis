package X;

import android.app.Application;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09mR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2472109mR extends C09AY implements Function0<Application> {
    public C2472109mR() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Application invoke() {
        InterfaceC2472209mS interfaceC2472209mS = C2471909mP.LJII;
        if (interfaceC2472209mS != null) {
            return interfaceC2472209mS.getApplication();
        }
        return null;
    }
}
