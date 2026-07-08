package X;

import com.ss.android.ugc.bytebench.EditorDowngradeOptiStrategy;

/* JADX INFO: renamed from: X.0oFN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465790oFN implements InterfaceC1103404Tg {
    public static final /* synthetic */ C1465790oFN LJIILLIIL = new C1465790oFN();
    public final /* synthetic */ InterfaceC1103404Tg LJIILL;

    @Override // X.InterfaceC1103404Tg
    public final boolean isDowngrade() {
        return this.LJIILL.isDowngrade();
    }

    public C1465790oFN() {
        InterfaceC1103404Tg interfaceC1103404Tg;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_sticker_panel_show_opti", true, false)) {
            C201955140j.LIZ("[DowngradeOptiApi] ByteBenchDowngrade enable");
            C212350188e c212350188eLIZJ = C212350188e.LIZJ();
            C0CHQ.LIZ().getApplicationService();
            C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C19221910Hx.LIZ());
            interfaceC1103404Tg = (c09gaLIZIZ == null || (interfaceC1103404Tg = (InterfaceC1103404Tg) c09gaLIZIZ.LJII(EditorDowngradeOptiStrategy.class)) == null) ? new InterfaceC1103404Tg() { // from class: X.04ek
                @Override // X.InterfaceC1103404Tg
                public final boolean isDowngrade() {
                    return false;
                }
            } : interfaceC1103404Tg;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[DowngradeOptiApi] Downgrade: ");
            sbLIZ.append(interfaceC1103404Tg.isDowngrade());
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C201955140j.LIZ("[DowngradeOptiApi] use DefaultApi");
            interfaceC1103404Tg = new InterfaceC1103404Tg() { // from class: X.04ek
                @Override // X.InterfaceC1103404Tg
                public final boolean isDowngrade() {
                    return false;
                }
            };
        }
        this.LJIILL = interfaceC1103404Tg;
    }
}
