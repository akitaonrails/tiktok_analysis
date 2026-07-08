package X;

import com.ss.android.ugc.aweme.creative.model.AudioAlgorithmModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.12Xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19771112Xd implements InterfaceC2240011Clr {
    public final String LIZ;
    public final AudioAlgorithmModel LIZIZ;
    public final List<C1434040nQA> LIZJ;

    @Override // X.InterfaceC2240011Clr
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC2240011Clr
    public final void LIZJ() {
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJII() {
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJIILJJIL() {
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJIILL() {
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJIIZILJ() {
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJIJI() {
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJIIIIZZ() {
        C19771412Xg c19771412Xg = C19771412Xg.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AVSecurityMobHelper onInitMicFailed creationId: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" currentPage ");
        C19771012Xc.LIZ.getClass();
        sbLIZ.append(C19771012Xc.LIZ());
        C201955140j.LJIILJJIL(c19771412Xg, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJIILIIL() {
        AudioAlgorithmModel audioAlgorithmModel = this.LIZIZ;
        if (audioAlgorithmModel != null) {
            audioAlgorithmModel.isMicOn = true;
        }
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJIILLIIL() {
        C19771412Xg c19771412Xg = C19771412Xg.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AVSecurityMobHelper onInitMicSuccess creationId: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" currentPage ");
        C19771012Xc.LIZ.getClass();
        sbLIZ.append(C19771012Xc.LIZ());
        C201955140j.LJIILJJIL(c19771412Xg, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJIJ() {
        C19771412Xg c19771412Xg = C19771412Xg.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AVSecurityMobHelper onInitMic creationId: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" currentPage ");
        C19771012Xc.LIZ.getClass();
        sbLIZ.append(C19771012Xc.LIZ());
        C201955140j.LJIILJJIL(c19771412Xg, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC2240011Clr
    public final void T3() {
        Iterator<C1434040nQA> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            C19712912At.LIZ.LJFF(it2.next());
        }
    }

    @Override // X.InterfaceC2240011Clr
    public final void LIZLLL() {
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZLLL();
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJ() {
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJ();
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJFF() {
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJFF();
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJI() {
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJI();
    }

    public C19771112Xd(String str) {
        this.LIZ = str;
        this.LIZJ = new ArrayList();
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJIIJ(final InterfaceC19771312Xf interfaceC19771312Xf) {
        C1434040nQA c1434040nQA = new C1434040nQA() { // from class: X.12Xe
            @Override // X.C1434040nQA, X.InterfaceC19713512Az
            public final void onAppBackground() {
                interfaceC19771312Xf.onAppBackground();
            }

            @Override // X.C1434040nQA, X.InterfaceC19713512Az
            public final void onAppForeground() {
                interfaceC19771312Xf.onAppForeground();
            }
        };
        ((ArrayList) this.LIZJ).add(c1434040nQA);
        C19712912At.LIZ.LJ(c1434040nQA);
    }

    public C19771112Xd(String str, AudioAlgorithmModel audioAlgorithmModel) {
        this(str);
        this.LIZIZ = audioAlgorithmModel;
    }

    @Override // X.InterfaceC2240011Clr
    public final void LIZ(int i, String str) {
        C19771012Xc c19771012Xc = C19771012Xc.LIZ;
        String str2 = this.LIZ;
        c19771012Xc.getClass();
        C19771012Xc.LIZIZ(i, str2, str);
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJIIL(int i, String str) {
        C19771012Xc c19771012Xc = C19771012Xc.LIZ;
        String str2 = this.LIZ;
        c19771012Xc.getClass();
        C19771412Xg c19771412Xg = C19771412Xg.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AVSecurityMobHelper onOpenCameraFailed creationId: ");
        sbLIZ.append(str2);
        sbLIZ.append(" errCode: ");
        sbLIZ.append(i);
        sbLIZ.append(" msg: ");
        sbLIZ.append(str);
        sbLIZ.append(" currentPage ");
        sbLIZ.append(C19771012Xc.LIZ());
        C201955140j.LJIILJJIL(c19771412Xg, C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str2);
        c0lab.LIZ(i, "error_code");
        c0lab.LJ("msg", str);
        c0lab.LJ("page", C19771012Xc.LIZ());
        C20684815ws.LJIILLIIL("tool_camera_open_fail", c0lab.LIZ);
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIJ();
    }

    @Override // X.InterfaceC2240011Clr
    public final void LJIJJ(int i, String str) {
        C19771012Xc c19771012Xc = C19771012Xc.LIZ;
        String str2 = this.LIZ;
        c19771012Xc.getClass();
        C19771412Xg c19771412Xg = C19771412Xg.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AVSecurityMobHelper onOpenFlashFailed creationId: ");
        sbLIZ.append(str2);
        sbLIZ.append(" errCode: ");
        sbLIZ.append(i);
        sbLIZ.append(" msg: ");
        sbLIZ.append(str);
        sbLIZ.append(" currentPage ");
        sbLIZ.append(C19771012Xc.LIZ());
        C201955140j.LJIILJJIL(c19771412Xg, C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str2);
        c0lab.LIZ(i, "error_code");
        c0lab.LJ("msg", str);
        c0lab.LJ("page", C19771012Xc.LIZ());
        C20684815ws.LJIILLIIL("tool_flash_open_fail", c0lab.LIZ);
    }
}
