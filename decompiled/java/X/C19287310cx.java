package X;

import android.content.Context;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVCameraService;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.ss.android.vesdk.algorithm.VEBachQRCodeResult;
import com.ss.android.vesdk.algorithm.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.10cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19287310cx implements C0TJN {
    public final InterfaceC19289210dG LIZ;
    public IQRCodeScanner LIZIZ;
    public final C19272110aV LIZJ;

    public final void LIZ() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C313910CSf(this, null), 3);
    }

    public C19287310cx(Context context, SurfaceHolder surfaceHolder, InterfaceC19289210dG interfaceC19289210dG, String str) {
        IAbilityService iAbilityServiceAbilityService;
        IAVCameraService iAVCameraServiceCameraService;
        this.LIZ = interfaceC19289210dG;
        this.LIZJ = new C19272110aV(str);
        IExternalService iExternalService = (IExternalService) ServiceManager.get().getService(IExternalService.class);
        if (iExternalService != null && (iAbilityServiceAbilityService = iExternalService.abilityService()) != null && (iAVCameraServiceCameraService = iAbilityServiceAbilityService.cameraService()) != null) {
            iAVCameraServiceCameraService.getCustomScanner(true, context, surfaceHolder, new IAVCameraService.IAVCameraReadyCallback<IQRCodeScanner>() { // from class: X.10d1
                @Override // com.ss.android.ugc.aweme.services.external.ability.IAVCameraService.IAVCameraReadyCallback
                public final void finish(IQRCodeScanner iQRCodeScanner) {
                    IQRCodeScanner iQRCodeScanner2 = iQRCodeScanner;
                    final C19287310cx c19287310cx = this.LIZ;
                    c19287310cx.LIZIZ = iQRCodeScanner2;
                    if (iQRCodeScanner2 != null) {
                        iQRCodeScanner2.setVEScanListener(new InterfaceC448730Hih() { // from class: X.10cw
                            @Override // X.InterfaceC448730Hih
                            public final void LIZ(List<s> list) {
                                VEBachQRCodeResult vEBachQRCodeResult;
                                String result;
                                C19287310cx c19287310cx2;
                                C19272110aV c19272110aV;
                                c19287310cx.getClass();
                                IQRCodeScanner iQRCodeScanner3 = c19287310cx.LIZIZ;
                                if (iQRCodeScanner3 != null) {
                                    iQRCodeScanner3.stop();
                                }
                                s sVar = null;
                                if (list != null) {
                                    sVar = (s) C13LP.LJJJLL(list);
                                }
                                if ((sVar instanceof VEBachQRCodeResult) && (vEBachQRCodeResult = (VEBachQRCodeResult) sVar) != null && (result = vEBachQRCodeResult.getResult()) != null && (c19272110aV = (c19287310cx2 = c19287310cx).LIZJ) != null) {
                                    Iterator it2 = ((ArrayList) c19272110aV.LIZJ).iterator();
                                    while (it2.hasNext()) {
                                        result = ((InterfaceC1791040why) it2.next()).LIZ(result);
                                    }
                                    Iterator it3 = ((ArrayList) c19272110aV.LIZIZ).iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (((InterfaceC19271510aP) it3.next()).LIZIZ(0, result)) {
                                                break;
                                            }
                                        } else {
                                            Iterator it4 = ((ArrayList) c19272110aV.LIZ).iterator();
                                            while (it4.hasNext()) {
                                                if (((InterfaceC19271510aP) it4.next()).LIZIZ(0, result)) {
                                                    InterfaceC19289210dG interfaceC19289210dG2 = c19287310cx2.LIZ;
                                                    if (interfaceC19289210dG2 != null) {
                                                        interfaceC19289210dG2.onSuccess();
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                InterfaceC19289210dG interfaceC19289210dG3 = c19287310cx.LIZ;
                                if (interfaceC19289210dG3 != null) {
                                    interfaceC19289210dG3.LIZ();
                                }
                            }
                        });
                    }
                    IQRCodeScanner iQRCodeScanner3 = this.LIZ.LIZIZ;
                    if (iQRCodeScanner3 != null) {
                        iQRCodeScanner3.setScanProcessListener(new IQRCodeScanner.ScanProcessListenr() { // from class: X.10dK
                            @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner.ScanProcessListenr
                            public final void onCameraOpenSuccess() {
                            }

                            @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner.ScanProcessListenr
                            public final void onCameraScanStarted() {
                            }

                            @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner.ScanProcessListenr
                            public final void onFirstRenderSuccess() {
                            }
                        });
                    }
                    InterfaceC19289210dG interfaceC19289210dG2 = this.LIZ.LIZ;
                    if (interfaceC19289210dG2 != null) {
                        interfaceC19289210dG2.onInit();
                    }
                    IQRCodeScanner iQRCodeScanner4 = this.LIZ.LIZIZ;
                    if (iQRCodeScanner4 != null) {
                        iQRCodeScanner4.startScanVE();
                    }
                }
            }, C497740JfY.LJIIZILJ(), C497740JfY.LJIILLIIL());
        }
    }
}
