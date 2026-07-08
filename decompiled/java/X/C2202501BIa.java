package X;

import android.content.Intent;
import com.facebook.CallbackManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1BIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202501BIa implements CallbackManager {
    public static final C2202531BId LIZIZ = new Object() { // from class: X.1BId
    };
    public static final Map<Integer, InterfaceC2202521BIc> LIZJ = new HashMap();
    public final Map<Integer, InterfaceC2202521BIc> LIZ = new HashMap();

    @Override // com.facebook.CallbackManager
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        InterfaceC2202521BIc interfaceC2202521BIc;
        InterfaceC2202521BIc interfaceC2202521BIc2 = (InterfaceC2202521BIc) ((HashMap) this.LIZ).get(Integer.valueOf(i));
        if (interfaceC2202521BIc2 == null) {
            synchronized (LIZIZ) {
                interfaceC2202521BIc = (InterfaceC2202521BIc) ((HashMap) LIZJ).get(Integer.valueOf(i));
            }
            if (interfaceC2202521BIc == null) {
                return false;
            }
            interfaceC2202521BIc.LIZ(i2, intent);
            return true;
        }
        interfaceC2202521BIc2.LIZ(i2, intent);
        return true;
    }
}
