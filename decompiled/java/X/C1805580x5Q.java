package X;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0x5Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805580x5Q implements InterfaceC1806020x68 {
    public static final C1805580x5Q LIZ = new C1805580x5Q();
    public static final Map<Boolean, InterfaceC1806020x68> LIZIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Boolean.FALSE, new InterfaceC1806020x68() { // from class: X.0x31
            @Override // X.InterfaceC1806020x68
            public final int LIZIZ(int i) {
                return 2131842049;
            }

            @Override // X.InterfaceC1806020x68
            public final boolean LIZLLL(int i, int i2) {
                return false;
            }

            @Override // X.InterfaceC1806020x68
            public final boolean LJI(int i, int i2, Context context, C1803830x2b c1803830x2b) {
                return false;
            }

            @Override // X.InterfaceC1806020x68
            public final void LJFF(int i, int i2, int i3, int i4, String str) {
                String str2 = str;
                C766270U4b.LIZLLL(2131851936);
                C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                if (str2 == null) {
                    str2 = "";
                }
                C1803800x2Y.LJIJ(c1803800x2Y, null, "package", "context", null, "toast", i, i2, i3, str2, null, null, null, null, null, 32256);
            }
        });
        LIZIZ = linkedHashMap;
    }

    @Override // X.InterfaceC1806020x68
    public final int LIZIZ(int i) {
        InterfaceC1806020x68 interfaceC1806020x68 = (InterfaceC1806020x68) ((LinkedHashMap) LIZIZ).get(Boolean.FALSE);
        if (interfaceC1806020x68 != null) {
            return interfaceC1806020x68.LIZIZ(i);
        }
        return 0;
    }

    @Override // X.InterfaceC1806020x68
    public final boolean LIZLLL(int i, int i2) {
        InterfaceC1806020x68 interfaceC1806020x68 = (InterfaceC1806020x68) ((LinkedHashMap) LIZIZ).get(Boolean.FALSE);
        if (interfaceC1806020x68 != null) {
            return interfaceC1806020x68.LIZLLL(i, i2);
        }
        return false;
    }

    @Override // X.InterfaceC1806020x68
    public final boolean LJI(int i, int i2, Context context, C1803830x2b c1803830x2b) {
        InterfaceC1806020x68 interfaceC1806020x68 = (InterfaceC1806020x68) ((LinkedHashMap) LIZIZ).get(Boolean.FALSE);
        if (interfaceC1806020x68 != null) {
            return interfaceC1806020x68.LJI(i, i2, context, c1803830x2b);
        }
        return false;
    }

    @Override // X.InterfaceC1806020x68
    public final void LJFF(int i, int i2, int i3, int i4, String str) {
        InterfaceC1806020x68 interfaceC1806020x68 = (InterfaceC1806020x68) ((LinkedHashMap) LIZIZ).get(Boolean.FALSE);
        if (interfaceC1806020x68 != null) {
            interfaceC1806020x68.LJFF(i, i2, i3, i4, str);
        }
    }
}
