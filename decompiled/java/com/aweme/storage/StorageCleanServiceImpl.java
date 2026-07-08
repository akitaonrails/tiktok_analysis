package com.aweme.storage;

import X.C04TD;
import X.C0A20;
import X.C0A24;
import X.C0CS6;
import X.C1110304Vx;
import X.C15O7;
import X.C2188811AlT;
import X.C2426709f7;
import X.C823050WQl;
import Y.ACallableS46S0210000_4;
import android.content.Context;
import com.ss.android.ugc.aweme.api.ICommonLogger;
import com.ss.android.ugc.aweme.base.storage.IStorageCleanService;

/* JADX INFO: loaded from: classes5.dex */
public final class StorageCleanServiceImpl implements IStorageCleanService {
    public static IStorageCleanService LIZJ() {
        Object objLIZ = C04TD.LIZ(IStorageCleanService.class, false);
        if (objLIZ != null) {
            return (IStorageCleanService) objLIZ;
        }
        if (C04TD.LIZJ == null) {
            synchronized (IStorageCleanService.class) {
                if (C04TD.LIZJ == null) {
                    C04TD.LIZJ = new StorageCleanServiceImpl();
                }
            }
        }
        return C04TD.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.base.storage.IStorageCleanService
    public final int LIZ() {
        return ((Number) C0A20.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.base.storage.IStorageCleanService
    public final void LIZIZ(Context context, C0CS6 c0cs6) {
        if (!C2426709f7.LIZIZ && ((Boolean) C0A24.LIZ.getValue()).booleanValue()) {
            C15O7.LIZIZ(new ACallableS46S0210000_4(context, c0cs6, 0), C823050WQl.LIZLLL(), null);
            return;
        }
        ICommonLogger iCommonLoggerLIZ = C1110304Vx.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("manualClean completeForceClean: ");
        sbLIZ.append(C2426709f7.LIZIZ);
        sbLIZ.append(", exp: ");
        sbLIZ.append(((Boolean) C0A24.LIZ.getValue()).booleanValue());
        iCommonLoggerLIZ.i("test_clean", C2188811AlT.LIZIZ(sbLIZ));
        c0cs6.LIZ(-1L, false);
    }
}
