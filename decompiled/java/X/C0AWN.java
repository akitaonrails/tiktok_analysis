package X;

import java.util.List;

/* JADX INFO: renamed from: X.0AWN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0AWN extends C0CX4 {
    public static final C0AWN LIZ = new C0AWN();

    @Override // X.C0CX4
    public final boolean LIZLLL() {
        return ((Boolean) C0AWM.LIZ.getValue()).booleanValue();
    }

    @Override // X.C0CX5
    public final List LIZJ(Integer num, List list) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = ((Number) C0AWC.LIZ.getValue()).intValue();
        }
        return C0CX8.LIZ(list, Integer.valueOf(iIntValue));
    }
}
