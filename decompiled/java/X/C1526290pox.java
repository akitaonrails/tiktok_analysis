package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526290pox implements InterfaceC1526760ppi {
    public final Context LIZ;

    public final void LIZ() {
        if (C1526890ppv.LIZJ(this.LIZ).LIZ()) {
            return;
        }
        C1527890prX.LIZJ("no flag or header is null, tryS y open sync and compensator");
        C1526890ppv.LIZJ(this.LIZ).LIZLLL(true);
        ((InterfaceC1526270pov) C808470VnZ.LIZ(InterfaceC1526270pov.class)).LJJJJLI();
    }

    public final void LIZIZ() {
        try {
            InterfaceC1526270pov interfaceC1526270pov = (InterfaceC1526270pov) C808470VnZ.LIZ(InterfaceC1526270pov.class);
            if (interfaceC1526270pov != null) {
                interfaceC1526270pov.reset();
            }
            InterfaceC1525900poK c1527670prB = (InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class);
            if (c1527670prB == null) {
                c1527670prB = new C1527670prB(this.LIZ);
            }
            c1527670prB.LJJLJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZJ() {
        ((InterfaceC1526270pov) C808470VnZ.LIZ(InterfaceC1526270pov.class)).reset();
        C1526890ppv.LIZJ(this.LIZ).LIZLLL(false);
    }

    public C1526290pox(Context context) {
        this.LIZ = context;
    }

    public final String LIZLLL(C0X52<?> c0x52) {
        List<C080U> arrayList;
        Object obj;
        boolean z;
        if (c0x52 == null) {
            arrayList = null;
        } else {
            try {
                arrayList = c0x52.LIZ.LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (c0x52 == null) {
            obj = null;
        } else {
            obj = c0x52.LIZIZ;
        }
        String strValueOf = String.valueOf(obj);
        Iterator<C080U> it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                C080U next = it2.next();
                if (Intrinsics.LJFF(next.LIZ.toLowerCase(), "x-bytesync-flag")) {
                    String str = next.LIZIZ;
                    if (Intrinsics.LJFF(str, "1001")) {
                        LIZJ();
                    } else {
                        if (Intrinsics.LJFF(str, "1002")) {
                            LIZJ();
                            LIZIZ();
                        }
                        z = true;
                    }
                    strValueOf = null;
                    z = true;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            LIZ();
        }
        return strValueOf;
    }
}
