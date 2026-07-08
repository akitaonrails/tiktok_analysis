package X;

import java.util.List;

/* JADX INFO: renamed from: X.07Xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1878107Xf implements InterfaceC1878707Xl {
    public abstract boolean LIZIZ(EnumC1980607pM enumC1980607pM, String str);

    public abstract List<EnumC1980607pM> LIZJ();

    @Override // X.InterfaceC1878707Xl
    public final boolean LIZ(EnumC1980607pM enumC1980607pM, String str) {
        if (!LIZJ().contains(enumC1980607pM)) {
            return false;
        }
        return LIZIZ(enumC1980607pM, str);
    }
}
