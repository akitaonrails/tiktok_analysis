package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0Ijq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474920Ijq {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context) {
        return ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocationPermissionGranted(context);
    }

    public static Object LIZIZ(C19EG c19eg, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C1AUE c1aue = new C1AUE() { // from class: X.0Ijn
            @Override // X.C1AUE
            public final void LIZ() {
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                }
            }

            @Override // X.C1AUE
            public final void LIZIZ() {
                if (C474850Ijj.LIZJ() != null) {
                    C474870Ijl.LIZ();
                }
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                }
            }

            @Override // X.C1AUE
            public final void onCancel(int i) {
                if (C474850Ijj.LIZJ() != null) {
                    C474870Ijl.LIZ();
                }
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf.resumeWith(bool);
                }
            }
        };
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (str2 == null) {
            str2 = "nearby_live_feed";
        }
        iHostAppContext.requestLocationPermission("global_live", "nearby_live", c19eg, new C475030Ik1(str, str2), c1aue);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
