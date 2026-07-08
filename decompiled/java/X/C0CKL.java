package X;

import com.ss.android.legoapi.abtest.IABLegoTaskApi;
import com.ss.android.legoimpl.ABLegoTaskImpl;

/* JADX INFO: renamed from: X.0CKL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CKL implements IABLegoTaskApi {
    public static final C0CKL LIZIZ = new C0CKL();
    public final /* synthetic */ IABLegoTaskApi LIZ;

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final C0CCZ LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final C0CCZ LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public C0CKL() {
        IABLegoTaskApi iABLegoTaskApi;
        Object objLIZ = C04TD.LIZ(IABLegoTaskApi.class, false);
        if (objLIZ != null) {
            iABLegoTaskApi = (IABLegoTaskApi) objLIZ;
        } else {
            if (C04TD.LJJLIIIIJ == null) {
                synchronized (IABLegoTaskApi.class) {
                    if (C04TD.LJJLIIIIJ == null) {
                        C04TD.LJJLIIIIJ = new ABLegoTaskImpl();
                    }
                }
            }
            iABLegoTaskApi = C04TD.LJJLIIIIJ;
        }
        this.LIZ = iABLegoTaskApi;
    }
}
