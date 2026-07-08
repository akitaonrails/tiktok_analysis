package X;

import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TTKUserCommunicationServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS156S0400000_28;

/* JADX INFO: renamed from: X.0pdY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519220pdY implements InterfaceC1519250pdb {
    public final /* synthetic */ C1519130pdP LIZ;
    public final /* synthetic */ Integer LIZIZ;
    public final /* synthetic */ int LIZJ;

    @Override // X.InterfaceC1519250pdb
    public final InterfaceC1519200pdW LIZ() {
        InterfaceC1519250pdb interfaceC1519250pdbLIZ;
        C1519130pdP c1519130pdP = this.LIZ;
        Integer num = this.LIZIZ;
        c1519130pdP.getClass();
        InterfaceC1518910pd3 interfaceC1518910pd3LJ = C1519130pdP.LJ(num);
        InterfaceC1519200pdW interfaceC1519200pdWLIZ = (interfaceC1518910pd3LJ == null || (interfaceC1519250pdbLIZ = interfaceC1518910pd3LJ.LIZ()) == null) ? null : interfaceC1519250pdbLIZ.LIZ();
        if (!C13LP.LJJJJ(this.LIZIZ, TTKUserCommunicationServiceImpl.LLJIJIL)) {
            return interfaceC1519200pdWLIZ == null ? new InterfaceC1519200pdW() { // from class: X.0pdc
                @Override // X.InterfaceC1519200pdW
                public final void LIZ() {
                }

                @Override // X.InterfaceC1519200pdW
                public final void LIZIZ(Map map, AwS156S0400000_28 awS156S0400000_28) {
                    awS156S0400000_28.invoke();
                }
            } : interfaceC1519200pdWLIZ;
        }
        final List<AbstractC1519240pda> listLIZ = ((TTKUserCommunicationService) ServiceManager.get().getService(TTKUserCommunicationService.class)).LIZ();
        return new InterfaceC1519200pdW() { // from class: X.0pdX
            @Override // X.InterfaceC1519200pdW
            public final void LIZ() {
            }

            @Override // X.InterfaceC1519200pdW
            public final void LIZIZ(Map map, AwS156S0400000_28 awS156S0400000_28) {
                Iterator<AbstractC1519240pda> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    if (it2.next().LJIIJ(map)) {
                        PopupManager.LIZJ(C1852080yIQ.class);
                        return;
                    }
                }
                awS156S0400000_28.invoke();
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    @Override // X.InterfaceC1519250pdb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LIZIZ() {
        /*
            r5 = this;
            X.0pdP r1 = r5.LIZ
            java.lang.Integer r0 = r5.LIZIZ
            r1.getClass()
            X.0pd3 r0 = X.C1519130pdP.LJ(r0)
            if (r0 == 0) goto L59
            X.0pdb r0 = r0.LIZ()
            if (r0 == 0) goto L59
            java.util.Map r0 = r0.LIZIZ()
            if (r0 == 0) goto L59
        L19:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r0)
            java.lang.Integer r3 = r5.LIZIZ
            int r2 = r5.LIZJ
            if (r3 == 0) goto L57
            int r0 = r3.intValue()
        L28:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "scene"
            r4.put(r0, r1)
            X.0pcf r0 = X.EnumC1518670pcf.SCENE_COLD_LAUNCH
            int r1 = r0.getValue()
            if (r3 == 0) goto L3f
            int r0 = r3.intValue()
            if (r0 == r1) goto L4d
        L3f:
            X.0pcf r0 = X.EnumC1518670pcf.SCENE_LOGIN
            int r1 = r0.getValue()
            if (r3 == 0) goto L56
            int r0 = r3.intValue()
            if (r0 != r1) goto L56
        L4d:
            java.lang.String r1 = "on_nuj_or_login"
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r4.put(r1, r0)
        L56:
            return r4
        L57:
            r0 = -1
            goto L28
        L59:
            java.util.Map r0 = X.C2097608Jq.LJ()
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1519220pdY.LIZIZ():java.util.Map");
    }

    @Override // X.InterfaceC1519250pdb
    public final InterfaceC1914220zue LIZJ() {
        InterfaceC1519250pdb interfaceC1519250pdbLIZ;
        C1519130pdP c1519130pdP = this.LIZ;
        Integer num = this.LIZIZ;
        c1519130pdP.getClass();
        InterfaceC1518910pd3 interfaceC1518910pd3LJ = C1519130pdP.LJ(num);
        InterfaceC1914220zue interfaceC1914220zueLIZJ = (interfaceC1518910pd3LJ == null || (interfaceC1519250pdbLIZ = interfaceC1518910pd3LJ.LIZ()) == null) ? null : interfaceC1519250pdbLIZ.LIZJ();
        if (!C13LP.LJJJJ(this.LIZIZ, TTKUserCommunicationServiceImpl.LLJIJIL)) {
            return interfaceC1914220zueLIZJ;
        }
        final List<AbstractC1519240pda> listLIZ = ((TTKUserCommunicationService) ServiceManager.get().getService(TTKUserCommunicationService.class)).LIZ();
        InterfaceC1914220zue interfaceC1914220zue = new InterfaceC1914220zue() { // from class: X.0pdZ
            @Override // X.InterfaceC1914220zue
            public final void LIZJ(Boolean bool, String str) {
            }

            @Override // X.InterfaceC1914220zue
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1914220zue
            public final void LIZ(C1519370pdn c1519370pdn) {
                Iterator<AbstractC1519240pda> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(c1519370pdn);
                }
            }

            @Override // X.InterfaceC1914220zue
            public final void LJFF(C1519370pdn c1519370pdn) {
                C1518590pcX.LIZ();
                Iterator<AbstractC1519240pda> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LJFF(c1519370pdn);
                }
            }

            @Override // X.InterfaceC1914220zue
            public final void LIZIZ(String str, C1519370pdn c1519370pdn) {
                Iterator<AbstractC1519240pda> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LJIIIZ(c1519370pdn);
                }
            }

            @Override // X.InterfaceC1914220zue
            public final void LJ(UniversalPopupAction universalPopupAction, C1519370pdn c1519370pdn) {
                Iterator<AbstractC1519240pda> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LJ(universalPopupAction, c1519370pdn);
                }
            }
        };
        InterfaceC1914220zue.LIZ.getClass();
        return new C1914230zuf(interfaceC1914220zueLIZJ, interfaceC1914220zue);
    }

    public C1519220pdY(C1519130pdP c1519130pdP, Integer num, int i) {
        this.LIZ = c1519130pdP;
        this.LIZIZ = num;
        this.LIZJ = i;
    }
}
