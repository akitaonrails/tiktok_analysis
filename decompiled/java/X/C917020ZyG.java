package X;

/* JADX INFO: renamed from: X.0ZyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C917020ZyG {
    public final /* synthetic */ C944270agD LIZ;

    public C917020ZyG(C944270agD c944270agD) {
        this.LIZ = c944270agD;
    }

    public final void LIZ(String str) {
        C20441214yg.LIZIZ("LinkControlPresenter", "onRecharge isTryUnload=true");
        if (this.LIZ.mView != 0) {
            boolean zLIZ = C915980Zwa.LJI().LJIIJ().LIZ();
            boolean zGC2 = ((InterfaceC944250agB) this.LIZ.mView).GC2(4);
            if (zLIZ && zGC2) {
                C20441214yg.LIZIZ("LinkControlPresenter", "onRecharge isTryUnload=true, onCoHostTurnedOff");
                C915980Zwa.LJII().LJJZ(str);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRecharge false, isInProgress=");
            sbLIZ.append(zLIZ);
            sbLIZ.append(",isContainsCoHostMode=");
            sbLIZ.append(zGC2);
            C20441214yg.LIZIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
