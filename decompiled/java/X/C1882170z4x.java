package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882170z4x implements C0T7K {
    public final /* synthetic */ Function0<Unit> LIZ;
    public final /* synthetic */ Function0<Unit> LIZIZ;

    public C1882170z4x(C1882200z50 c1882200z50, C1882250z55 c1882250z55) {
        this.LIZ = c1882200z50;
        this.LIZIZ = c1882250z55;
    }

    @Override // X.C0T7K
    public final void LIZ(int i, String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleCTAClickJump success:");
        sbLIZ.append(z);
        sbLIZ.append(", code:");
        sbLIZ.append(i);
        sbLIZ.append(", msg:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("GameDownloadService", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            this.LIZ.invoke();
        } else {
            this.LIZIZ.invoke();
        }
    }
}
