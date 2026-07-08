package X;

import android.view.View;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0PdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649390PdZ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(702));
    public static final C649350PdV LIZIZ = new InterfaceC649280PdO() { // from class: X.0PdV
        @Override // X.InterfaceC649280PdO
        public final void LIZ(View view) {
            int iHashCode;
            Boolean bool = Boolean.TRUE;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C649390PdZ.LIZ.getValue();
            if (view != null) {
                iHashCode = view.hashCode();
            } else {
                iHashCode = 0;
            }
            concurrentHashMap.put(Integer.valueOf(iHashCode), bool);
            C1440005kM.LIZ(new C649160PdC(view));
        }
    };
}
