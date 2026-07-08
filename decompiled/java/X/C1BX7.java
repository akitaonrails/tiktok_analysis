package X;

import com.ss.android.legoapi.ICrashSdkTaskApi;
import com.ss.android.ugc.aweme.legoImp.CrashSdkTaskImpl;

/* JADX INFO: renamed from: X.1BX7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BX7 implements ICrashSdkTaskApi {
    public static final C1BX7 LIZIZ = new C1BX7();
    public final /* synthetic */ ICrashSdkTaskApi LIZ;

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LIZ(EnumC799870VZh enumC799870VZh) {
        return this.LIZ.LIZ(enumC799870VZh);
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final C0CCZ LJIIIIZZ(EnumC799870VZh enumC799870VZh) {
        return this.LIZ.LJIIIIZZ(enumC799870VZh);
    }

    public C1BX7() {
        ICrashSdkTaskApi iCrashSdkTaskApi;
        Object objLIZ = C04TD.LIZ(ICrashSdkTaskApi.class, false);
        if (objLIZ != null) {
            iCrashSdkTaskApi = (ICrashSdkTaskApi) objLIZ;
        } else {
            if (C04TD.J1 == null) {
                synchronized (ICrashSdkTaskApi.class) {
                    if (C04TD.J1 == null) {
                        C04TD.J1 = new CrashSdkTaskImpl();
                    }
                }
            }
            iCrashSdkTaskApi = C04TD.J1;
        }
        this.LIZ = iCrashSdkTaskApi;
    }
}
