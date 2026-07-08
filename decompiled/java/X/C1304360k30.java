package X;

import com.lynx.canvas.CanvasPermissionManager;

/* JADX INFO: renamed from: X.0k30, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304360k30 {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ long LIZJ;

    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request permission video:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" audio:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" result ");
        sbLIZ.append(true);
        C1288370jdD.LIZJ("KryptonCanvasPermissionManager", C2188811AlT.LIZIZ(sbLIZ));
        CanvasPermissionManager.nativeOnUserMediaPermissionResponse(this.LIZJ, true);
    }

    public C1304360k30(boolean z, boolean z2, long j) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = j;
    }
}
