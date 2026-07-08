package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0UoG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783420UoG extends C783400UoE {
    public static final C783420UoG LIZJ = new C783420UoG();

    public C783420UoG() {
        super(0);
    }

    @Override // X.C783400UoE, X.InterfaceC783410UoF
    public final boolean LIZ() {
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (c1119850fFP.LIZIZ == null && c1119850fFP.LJJI != null) {
            c1119850fFP.LJJI.getClass();
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            c1119850fFP.LIZIZ = new C783430UoH(iHostAppContext != null ? iHostAppContext.currentLocale() : null);
        }
        C783430UoH c783430UoH = c1119850fFP.LIZIZ;
        if (c783430UoH != null) {
            c1119850fFP.LIZJ();
            if (C2273311DyT.LIZ(c783430UoH.LIZ).equals("he-IL")) {
                return false;
            }
        }
        return this.LIZ;
    }
}
