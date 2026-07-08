package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0YVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875230YVd {
    public static final /* synthetic */ int LIZ = 0;

    public static C869590Y9l LIZIZ(String str) {
        return C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJJ(CastLongProtector.parseLong(str));
    }

    public static void LIZJ(C0Y3I c0y3i, List list) {
        if (list != null && !list.isEmpty()) {
            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJIIIIZZ(c0y3i, list);
        }
    }

    public static void LIZ(C869590Y9l c869590Y9l, boolean z, InterfaceC863600XuI interfaceC863600XuI) {
        if (c869590Y9l != null && C123100dR.LIZ(c869590Y9l.getUuid())) {
            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZ(c869590Y9l, z, interfaceC863600XuI);
        }
    }
}
