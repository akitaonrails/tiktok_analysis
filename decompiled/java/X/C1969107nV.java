package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.07nV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1969107nV {
    public final InterfaceC1100840ekk LIZ;

    public C1969107nV() {
        InterfaceC1100840ekk interfaceC1100840ekk;
        try {
            interfaceC1100840ekk = (InterfaceC1100840ekk) Class.forName("com.bytedance.android.livesdk.gift.debugservice.mock.DebugToolSimpleMockServiceImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createDebugService. exception=");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("DebugToolsSimpleMockHelper", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC1100840ekk = null;
        }
        this.LIZ = interfaceC1100840ekk;
    }
}
