package Y;

import X.AbstractC19484711Kz;
import X.C098200Yq;
import X.C0FNV;
import X.C11S5;
import X.C1266080j3G;
import X.C1370940lmO;
import X.C1377620lxA;
import X.C1377650lxD;
import X.C1389890mGx;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2196951Ayb;
import X.C2196981Aye;
import X.C259800zU;
import X.C621180OYa;
import X.C842150X1x;
import X.DialogC1389620mGW;
import X.EnumC2192711Arl;
import X.InterfaceC1236660iHo;
import X.InterfaceC1487280oo2;
import Y.ARunnableS121S0100000_21;
import Y.ARunnableS40S0110000_21;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.View;
import com.bytedance.pipo.ttpay.recharge.qrcode.QrCodeFragment;
import com.bytedance.pipo.ttpay.recharge.share.QrCodeShareConfiguration;
import com.bytedance.pipo.ttpay.recharge.share.QrCodeShareModel;
import com.bytedance.pipo.ttpay.recharge.share.QrCodeSharePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import com.ss.android.ugc.aweme.minis.page.main.fragment.ShareSheetPanelFragment;
import com.ss.android.ugc.aweme.minis.viewmodel.NativeGameViewModel;
import defpackage.h2;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public class ARunnableS40S0110000_21 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Object c098200Yq;
        QrCodeFragment qrCodeFragment = (QrCodeFragment) this.l0;
        View view = qrCodeFragment.LLJL;
        if (view != null) {
            boolean z = this.z1;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), view);
            if (z) {
                try {
                    h2.LIZJ(qrCodeFragment.requireContext(), bitmapCreateBitmap);
                    DialogC1389620mGW dialogC1389620mGWWR = qrCodeFragment.WR();
                    if (dialogC1389620mGWWR != null) {
                        C0FNV.LIZ(dialogC1389620mGWWR);
                    }
                    C1389890mGx c1389890mGx = new C1389890mGx(qrCodeFragment);
                    c1389890mGx.LJIIIZ(2131840374);
                    c1389890mGx.LJIIJJI();
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    DialogC1389620mGW dialogC1389620mGWWR2 = qrCodeFragment.WR();
                    if (dialogC1389620mGWWR2 != null) {
                        C0FNV.LIZ(dialogC1389620mGWWR2);
                    }
                    C1389890mGx c1389890mGx2 = new C1389890mGx(qrCodeFragment);
                    c1389890mGx2.LJIIIZ(2131840373);
                    c1389890mGx2.LJIIJJI();
                }
                C189200o6.m1boximpl(c098200Yq);
                return;
            }
            try {
                qrCodeFragment.requireContext();
                qrCodeFragment.LLJLLIL = h2.LIZIZ(bitmapCreateBitmap);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
            DialogC1389620mGW dialogC1389620mGWWR3 = qrCodeFragment.WR();
            if (dialogC1389620mGWWR3 != null) {
                C0FNV.LIZ(dialogC1389620mGWWR3);
            }
            Uri uri = qrCodeFragment.LLJLLIL;
            if (uri != null) {
                C1377620lxA c1377620lxA = new C1377620lxA(new QrCodeShareModel(new C1377650lxD(String.valueOf(uri.getPath()))));
                C1370940lmO c1370940lmO = new C1370940lmO();
                c1370940lmO.LIZ = "pipo_qr_code";
                c1370940lmO.LIZIZ = c1377620lxA.LIZIZ();
                c1370940lmO.LIZLLL = "";
                c1370940lmO.LJ = "";
                c1370940lmO.LJFF = "";
                c1370940lmO.LIZJ = c1377620lxA.LIZLLL();
                c1370940lmO.LJI = c1377620lxA.LIZ;
                c1370940lmO.LJII = c1377620lxA.LJFF();
                QrCodeSharePackage qrCodeSharePackage = new QrCodeSharePackage(c1370940lmO, AFwS259S0000000_21.get$arr$(374));
                C19EG activity = qrCodeFragment.getActivity();
                if (activity != null && C621180OYa.LIZ.LJIIZILJ(qrCodeSharePackage, activity, QrCodeShareConfiguration.LLILLJJLI) != null) {
                    return;
                }
            }
            DialogC1389620mGW dialogC1389620mGWWR4 = qrCodeFragment.WR();
            if (dialogC1389620mGWWR4 != null) {
                C0FNV.LIZ(dialogC1389620mGWWR4);
            }
            C1389890mGx c1389890mGx3 = new C1389890mGx(qrCodeFragment);
            c1389890mGx3.LJIIIZ(2131840375);
            c1389890mGx3.LJIIJJI();
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    public final void LIZ$1() {
        AbstractC19484711Kz abstractC19484711KzLJIJJLI;
        C2196981Aye c2196981Aye = ((MiniGameFragment) this.l0).LLJJJ;
        if (c2196981Aye != null) {
            c2196981Aye.LJIIJJI = "https://connect.tiktok-minis.com/game/icon.png";
            c2196981Aye.LIZJ(c2196981Aye.LJII);
        }
        C2196981Aye c2196981Aye2 = ((MiniGameFragment) this.l0).LLJJJ;
        if (c2196981Aye2 != null) {
            c2196981Aye2.LIZLLL("Debug server is connecting...");
        }
        final MiniGameFragment miniGameFragment = (MiniGameFragment) this.l0;
        NativeGameViewModel nativeGameViewModel = miniGameFragment.LLLLLLLLL;
        if (nativeGameViewModel != null) {
            SchemaParserData schemaParserData = miniGameFragment.LLJJL;
            final boolean z = this.z1;
            InterfaceC1236660iHo interfaceC1236660iHo = new InterfaceC1236660iHo() { // from class: X.0mCX
                @Override // X.InterfaceC1236660iHo
                public final void LIZJ() {
                    Activity activityHS = miniGameFragment.hS();
                    if (activityHS != null) {
                        activityHS.runOnUiThread(new ARunnableS121S0100000_21(miniGameFragment, 154));
                    }
                }

                @Override // X.InterfaceC1236660iHo
                public final void LIZ(boolean z2) {
                    if (z2) {
                        Activity activityHS = miniGameFragment.hS();
                        if (activityHS != null) {
                            activityHS.runOnUiThread(new ARunnableS40S0110000_21(miniGameFragment, z, 2));
                            return;
                        }
                        return;
                    }
                    Activity activityHS2 = miniGameFragment.hS();
                    if (activityHS2 == null) {
                        return;
                    }
                    activityHS2.runOnUiThread(new ARunnableS121S0100000_21(miniGameFragment, 155));
                }
            };
            C2196951Ayb c2196951Ayb = nativeGameViewModel.LL;
            c2196951Ayb.getClass();
            NetworkResponse networkResponse = new NetworkResponse(null, -1, false, null, false, null, null);
            if (schemaParserData == null) {
                int i = C2187451AjH.LIZ;
                abstractC19484711KzLJIJJLI = AbstractC19484711Kz.LJIJJLI(networkResponse);
            } else {
                String str = schemaParserData.clientKey;
                if (str == null || str.length() == 0) {
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchMetaData, invalid clientKey:");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    abstractC19484711KzLJIJJLI = AbstractC19484711Kz.LJIJJLI(networkResponse);
                } else {
                    schemaParserData.minisStage.ordinal();
                    if (schemaParserData.minisStage == EnumC2192711Arl.MINIS_STAGE_DEBUG) {
                        EnumC2192711Arl.MINIS_STAGE_PROD.ordinal();
                    }
                    C259800zU c259800zU = new C259800zU();
                    c259800zU.element = new NetworkResponse(null, -1, false, null, false, null, null);
                    abstractC19484711KzLJIJJLI = AbstractC19484711Kz.LJIJJ(c2196951Ayb.LIZIZ.LIZIZ(str)).LJIIZILJ(new AkS326S0200000_19(c2196951Ayb, c259800zU, 3)).LJJI(new InterfaceC1487280oo2() { // from class: X.01eJ
                        @Override // X.InterfaceC1487280oo2
                        public final Object apply(Object obj) {
                            String string;
                            Throwable th = (Throwable) obj;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("fetchMetaData, error occurred, cause:");
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                string = cause.toString();
                            } else {
                                string = null;
                            }
                            sbLIZ2.append(string);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            return AbstractC19484711Kz.LJIILLIIL(th);
                        }
                    });
                }
            }
            abstractC19484711KzLJIJJLI.LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new C1266080j3G(interfaceC1236660iHo, 2));
        }
    }

    public static final void run$0(ARunnableS40S0110000_21 aRunnableS40S0110000_21) {
        boolean zLIZ;
        C1C7U.LIZ("ShareSheetPanelFragment@267a.onOperationLayoutVisibilityChanged$1");
        try {
            ((ShareSheetPanelFragment) aRunnableS40S0110000_21.l0).ZR(aRunnableS40S0110000_21.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareSheetPanelFragment@267a.onOperationLayoutVisibilityChanged$1");
    }

    public static final void run$1(ARunnableS40S0110000_21 aRunnableS40S0110000_21) {
        boolean zLIZ;
        C1C7U.LIZ("QrCodeFragment@85b5.saveOrShareQrCode$onPermissionGranted$1$1$2");
        try {
            aRunnableS40S0110000_21.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("QrCodeFragment@85b5.saveOrShareQrCode$onPermissionGranted$1$1$2");
    }

    public static final void run$2(ARunnableS40S0110000_21 aRunnableS40S0110000_21) {
        boolean zLIZ;
        C1C7U.LIZ("MiniGameFragment@6eb9.initNativeDebug$1$1$1$onMinisDevAuthorizationResult$1");
        try {
            C2196981Aye c2196981Aye = ((MiniGameFragment) aRunnableS40S0110000_21.l0).LLJJJ;
            if (c2196981Aye != null) {
                c2196981Aye.LIZLLL("Debug server is connecting...");
            }
            if (aRunnableS40S0110000_21.z1) {
                ((MiniGameFragment) aRunnableS40S0110000_21.l0).LT();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniGameFragment@6eb9.initNativeDebug$1$1$1$onMinisDevAuthorizationResult$1");
    }

    public static final void run$3(ARunnableS40S0110000_21 aRunnableS40S0110000_21) {
        boolean zLIZ;
        C1C7U.LIZ("MiniGameFragment@6eb9.initNativeDebug$1$1");
        try {
            aRunnableS40S0110000_21.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniGameFragment@6eb9.initNativeDebug$1$1");
    }

    public ARunnableS40S0110000_21(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
