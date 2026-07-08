package X;

import com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet;

/* JADX INFO: renamed from: X.0oVF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475630oVF implements InterfaceC1475640oVG {
    public final InterfaceC1475640oVG LIZ;
    public final InterfaceC1475360oUo LIZIZ;
    public final InterfaceC1475680oVK LIZJ;
    public final C1475100oUO LIZLLL;
    public final C1475140oUS LJ = new C1475140oUS();
    public InterfaceC1475360oUo LJFF;

    @Override // X.InterfaceC1475640oVG
    public final void LIZ(InterfaceC1475360oUo interfaceC1475360oUo) {
    }

    public C1475630oVF(InterfaceC1475640oVG interfaceC1475640oVG, AutoBitrateSet autoBitrateSet) {
        InterfaceC1475660oVI interfaceC1475660oVI;
        this.LIZ = interfaceC1475640oVG;
        this.LIZIZ = autoBitrateSet;
        if (C582130MsN.LIZ().getConfig().getDimensionPickConfig().getVersion() != 2) {
            interfaceC1475660oVI = (InterfaceC1475660oVI) C1126604au.LIZ("com.ss.android.ugc.aweme.playerkit.configpickerimpl.ConfigPickerService");
        } else {
            interfaceC1475660oVI = (InterfaceC1475660oVI) C1126604au.LIZ("com.ss.android.ugc.aweme.playerkit.configpickerimplv2.ConfigPickerService");
        }
        this.LIZJ = interfaceC1475660oVI.LIZ();
        this.LIZLLL = new C1475100oUO();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    @Override // X.InterfaceC1475640oVG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1477120oXe LIZIZ(java.util.List<? extends X.InterfaceC1477220oXo> r13, java.util.Map<java.lang.String, java.lang.Object> r14) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1475630oVF.LIZIZ(java.util.List, java.util.Map):X.0oXe");
    }

    public static void LIZJ(String str, InterfaceC1475360oUo interfaceC1475360oUo, boolean z) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(interfaceC1475360oUo.LIZLLL());
        sbLIZ.append(interfaceC1475360oUo.LIZJ());
        sbLIZ.append(interfaceC1475360oUo.LJ());
        sbLIZ.append(interfaceC1475360oUo.LIZIZ());
        sbLIZ.append(interfaceC1475360oUo.LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            str2 = "Default:";
        } else {
            str2 = "Dynamic:";
        }
        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append(strLIZIZ);
        c1477400oY6.LJJIIZ(str, C2188811AlT.LIZIZ(sbLIZ2));
    }
}
