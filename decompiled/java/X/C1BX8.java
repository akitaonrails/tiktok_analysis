package X;

import com.ss.android.legoapi.ISysOptTaskApi;
import com.ss.android.ugc.aweme.legoImp.SysOptTaskImpl;

/* JADX INFO: renamed from: X.1BX8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BX8 implements ISysOptTaskApi {
    public static final C1BX8 LIZIZ = new C1BX8();
    public final /* synthetic */ ISysOptTaskApi LIZ;

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final C0CCZ LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    public C1BX8() {
        ISysOptTaskApi iSysOptTaskApi;
        Object objLIZ = C04TD.LIZ(ISysOptTaskApi.class, false);
        if (objLIZ != null) {
            iSysOptTaskApi = (ISysOptTaskApi) objLIZ;
        } else {
            if (C04TD.M1 == null) {
                synchronized (ISysOptTaskApi.class) {
                    if (C04TD.M1 == null) {
                        C04TD.M1 = new SysOptTaskImpl();
                    }
                }
            }
            iSysOptTaskApi = C04TD.M1;
        }
        this.LIZ = iSysOptTaskApi;
    }
}
