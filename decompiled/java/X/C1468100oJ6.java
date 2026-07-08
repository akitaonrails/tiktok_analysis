package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.model.IntertrustDrmHelper;
import fyo.e;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.0oJ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1468100oJ6 implements InterfaceC1468120oJ8 {
    public final /* synthetic */ IntertrustDrmHelper LIZ;

    public C1468100oJ6(IntertrustDrmHelper intertrustDrmHelper) {
        this.LIZ = intertrustDrmHelper;
    }

    public final void LIZ(e eVar, String str) {
        if (eVar != null) {
            String str2 = eVar.LIZLLL;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get token return error code: ");
            sbLIZ.append(eVar.LIZ);
            sbLIZ.append(", internal:");
            sbLIZ.append(eVar.LIZIZ);
            sbLIZ.append(", description:");
            sbLIZ.append(eVar.LIZLLL);
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (!str2.contains("Canceled")) {
                IntertrustDrmHelper intertrustDrmHelper = this.LIZ;
                C786410Ut5.LJLJJL(intertrustDrmHelper.LJI, intertrustDrmHelper.LJI.obtainMessage(1, eVar));
                return;
            }
            return;
        }
        IntertrustDrmHelper intertrustDrmHelper2 = this.LIZ;
        if (intertrustDrmHelper2.LIZIZ == null) {
            return;
        }
        try {
            if (intertrustDrmHelper2.LIZ == null) {
                intertrustDrmHelper2.LIZ = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            this.LIZ.LIZ.getDeclaredMethod("processTokenComplete", String.class).invoke(this.LIZ.LIZIZ, str);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("class not found:");
            sbLIZ2.append(e.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("method invoke failied:");
            sbLIZ3.append(e2.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ3));
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("method not found:");
            sbLIZ4.append(e3.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ4));
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("method invoke failied:");
            sbLIZ5.append(e4.getLocalizedMessage());
            C1471660oOq.LIZIZ("IntertrustDrmHelper", C2188811AlT.LIZIZ(sbLIZ5));
        }
    }
}
