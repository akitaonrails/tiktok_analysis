package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EPX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EPX {
    public static final int LIZ(C113G c113g) {
        InterfaceC361400EEw interfaceC361400EEw = c113g.LJJIL;
        if (interfaceC361400EEw == null) {
            return c113g.LJJIJLIJ ? 1 : 0;
        }
        if (interfaceC361400EEw instanceof C364090EPf) {
            if (Intrinsics.LJFF(((C364090EPf) interfaceC361400EEw).LIZJ, EnumC361420EEy.SEARCH_HEAD.getTypeVal())) {
                return 2;
            }
            return c113g.LJJIJLIJ ? 1 : 0;
        }
        throw new C1954807lC();
    }

    public static final C364090EPf LIZIZ(boolean z) {
        if (C0A1I.LIZ() == 0) {
            return null;
        }
        if (!z) {
            return new C364090EPf(R.raw.icon_magnifying_glass, R.attr.a1h, EnumC361420EEy.SEARCH_TAIL.getTypeVal());
        }
        if (C0A1I.LIZ() == 1) {
            return new C364090EPf(R.raw.icon_magnifying_glass, R.attr.zk, EnumC361420EEy.SEARCH_HEAD.getTypeVal());
        }
        if (C0A1I.LIZ() != 2) {
            return null;
        }
        return new C364090EPf(0, 0, EnumC361420EEy.SEARCH_FLOAT.getTypeVal());
    }
}
