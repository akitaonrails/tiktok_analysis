package X;

/* JADX INFO: renamed from: X.0wa7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786170wa7 implements InterfaceC1846110y8n {
    public final /* synthetic */ C20632315oP LIZ;

    @Override // X.InterfaceC1846110y8n
    public final void LIZ(C1845940y8W c1845940y8W) {
    }

    @Override // X.InterfaceC1846110y8n
    public final void LIZJ(C1845940y8W c1845940y8W) {
    }

    public C1786170wa7(C20632315oP c20632315oP) {
        this.LIZ = c20632315oP;
    }

    @Override // X.InterfaceC1846110y8n
    public final void LIZIZ(C1845940y8W c1845940y8W) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTabSelected position=");
        sbLIZ.append(c1845940y8W.LIZLLL);
        sbLIZ.append(" currentItem=");
        sbLIZ.append(this.LIZ.getCurrentItem());
        C20441214yg.LIZIZ("TuxTabBarViewPager2Exts", C2188811AlT.LIZIZ(sbLIZ));
        int currentItem = this.LIZ.getCurrentItem();
        int i = c1845940y8W.LIZLLL;
        if (currentItem != i) {
            this.LIZ.LJ(i, false);
        }
    }
}
