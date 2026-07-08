package X;

import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.1DOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255111DOj extends AbstractC574600MgE {
    @Override // X.AbstractC574600MgE
    public final int LIZ(VEEditor vEEditor, boolean z) {
        if (z) {
            InterfaceC2255101DOi interfaceC2255101DOi = vEEditor.LL;
            if (interfaceC2255101DOi == null) {
                C2484209oO.LIZJ("VEEditor", "MV IS NOT SUPPORT !!!");
                return -900;
            }
            return interfaceC2255101DOi.updateMVResources(null, null, null);
        }
        InterfaceC2255101DOi interfaceC2255101DOi2 = vEEditor.LL;
        if (interfaceC2255101DOi2 == null) {
            C2484209oO.LIZJ("VEEditor", "MV IS NOT SUPPORT !!!");
            return -900;
        }
        return interfaceC2255101DOi2.initMV(null, null, null, null, 0, 0);
    }
}
