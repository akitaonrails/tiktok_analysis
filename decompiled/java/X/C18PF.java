package X;

import Y.ARunnableS20S1200000_16;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.libra.EcUgVsaEnableReshowAfterClickSettings;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.18PF, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18PF implements InterfaceC21280118Pn {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C21279318Pf LIZIZ;
    public final /* synthetic */ Aweme LIZJ;
    public final /* synthetic */ Aweme LIZLLL;

    @Override // X.InterfaceC21280118Pn
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC21280118Pn
    public final void LIZ() {
        if (((Number) C276480AsY.LIZ.getValue()).intValue() == 1) {
            C18PZ c18pz = C18PZ.LIZ;
            C21279318Pf c21279318Pf = this.LIZIZ;
            Aweme aweme = this.LIZJ;
            c18pz.getClass();
            C18PZ.LJII(c21279318Pf, aweme, null);
        }
    }

    @Override // X.InterfaceC21280118Pn
    public final void LIZIZ() {
        final String str = this.LIZ;
        try {
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.18PG
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EcUgVSAManager@aafd.firstShowVSAProductCard$1$1$1$1$onCardInitFail$$inlined$runOnWorkerThread$1");
                    try {
                        C18PZ c18pz = C18PZ.LIZ;
                        String str2 = str;
                        c18pz.getClass();
                        C18PZ.LJ("init fail", str2);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EcUgVSAManager@aafd.firstShowVSAProductCard$1$1$1$1$onCardInitFail$$inlined$runOnWorkerThread$1");
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC21280118Pn
    public final void LIZJ(Context context) {
        try {
            C823050WQl.LIZJ().execute(new ARunnableS20S1200000_16(context, this.LIZLLL, this.LIZ, 9));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071 A[PHI: r1
      0x0071: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v7 java.lang.String) binds: [B:32:0x006f, B:28:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC21280118Pn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18PF.LJFF(com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct):void");
    }

    @Override // X.InterfaceC21280118Pn
    public final void LJ(final Context context, final EcUgProduct ecUgProduct, final C1740600vOc c1740600vOc) {
        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
        if (iMallLandingPerfTracker != null) {
            iMallLandingPerfTracker.onClickMallEntry("fyp_vsa_shoptab", null);
        }
        final Aweme aweme = this.LIZLLL;
        final String str = this.LIZ;
        final C21279318Pf c21279318Pf = this.LIZIZ;
        final Aweme aweme2 = this.LIZJ;
        try {
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.18PH
                public final void LIZ() {
                    C01GW c01gw = C21278818Pa.LIZ;
                    C21278818Pa.LJIILIIL(aweme, str);
                    if (((Number) C276480AsY.LIZ.getValue()).intValue() == 2) {
                        C18PZ c18pz = C18PZ.LIZ;
                        C21279318Pf c21279318Pf2 = c21279318Pf;
                        Aweme aweme3 = aweme2;
                        List listSingletonList = Collections.singletonList(C123500dV.LIZIZ(ecUgProduct.productId));
                        c18pz.getClass();
                        C18PZ.LJII(c21279318Pf2, aweme3, listSingletonList);
                    }
                    C21278918Pb c21278918Pb = C21278918Pb.LIZ;
                    Context context2 = context;
                    Aweme aweme4 = aweme;
                    String str2 = str;
                    c21278918Pb.getClass();
                    C21278918Pb.LIZJ(context2, aweme4, str2, false);
                    if (EcUgVsaEnableReshowAfterClickSettings.LIZ(C21278418Ow.LJII(C21278418Ow.LIZ, context, null, aweme, aweme2, C123500dV.LIZIZ(ecUgProduct.productId), EnumC21279418Pg.PRODUCT_CARD, true, c1740600vOc, 2))) {
                        C18PZ.LJI = true;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EcUgVSAManager@aafd.firstShowVSAProductCard$1$1$1$1$onCardContentClick$$inlined$runOnWorkerThread$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EcUgVSAManager@aafd.firstShowVSAProductCard$1$1$1$1$onCardContentClick$$inlined$runOnWorkerThread$1");
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C18PF(String str, C21279318Pf c21279318Pf, Aweme aweme, Aweme aweme2) {
        this.LIZ = str;
        this.LIZIZ = c21279318Pf;
        this.LIZJ = aweme;
        this.LIZLLL = aweme2;
    }
}
