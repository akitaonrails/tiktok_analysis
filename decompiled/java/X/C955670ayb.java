package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;

/* JADX INFO: renamed from: X.0ayb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C955670ayb {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public C961720b8M LIZLLL;

    public boolean LIZJ() {
        return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1() && ((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJII() > 0;
    }

    public final boolean LIZ() {
        boolean zLIZJ = LIZJ();
        boolean zLJJIII = C915980Zwa.LJII().LJJIII();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isInMgAndNotAllowToCohost; inMg=");
        sbLIZ.append(zLIZJ);
        sbLIZ.append(", enableCohostInMg=");
        sbLIZ.append(zLJJIII);
        C20441214yg.LIZIZ("BaseMultiHostViewHolderData", C2188811AlT.LIZIZ(sbLIZ));
        return zLIZJ && !zLJJIII;
    }
}
