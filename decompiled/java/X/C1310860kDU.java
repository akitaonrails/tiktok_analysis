package X;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kDU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310860kDU implements InterfaceC1310880kDW {
    @Override // X.InterfaceC1310880kDW
    public final void onInitialize(Context context) {
    }

    @Override // X.InterfaceC1310880kDW
    public final boolean LIZ(C1310800kDO c1310800kDO) {
        if (!Intrinsics.LJFF(c1310800kDO.LIZIZ, "js_blocking") && !Intrinsics.LJFF(c1310800kDO.LIZIZ, "resource")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1310880kDW
    public final Map<String, Object> LIZIZ(C1310800kDO c1310800kDO) {
        return C294801Cg.LIZJ(null, c1310800kDO.LIZLLL);
    }
}
