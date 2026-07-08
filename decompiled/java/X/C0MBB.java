package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0MBB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MBB {
    public static final String LIZIZ(int i, InterfaceC1680500tpg interfaceC1680500tpg) {
        return C569930MWx.LIZ(interfaceC1680500tpg).getString(i);
    }

    public static final String LIZJ(int i, Object[] objArr, InterfaceC1680500tpg interfaceC1680500tpg) {
        return C569930MWx.LIZ(interfaceC1680500tpg).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String LIZ(int i, int i2, Object[] objArr, InterfaceC1680500tpg interfaceC1680500tpg) {
        return C569930MWx.LIZ(interfaceC1680500tpg).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
    }
}
