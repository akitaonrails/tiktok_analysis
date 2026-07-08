package X;

import Y.ARunnableS113S0100000_13;
import android.os.FileObserver;

/* JADX INFO: renamed from: X.0Vdd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class FileObserverC802310Vdd extends FileObserver {
    public final /* synthetic */ C802230VdV LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileObserverC802310Vdd(C802230VdV c802230VdV, String str) {
        super(str, 1032);
        this.LIZ = c802230VdV;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("disaster: FileObserver event=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if ((i & 8) != 0 || (i & 1024) != 0) {
            if (this.LIZ.LIZLLL) {
                this.LIZ.LIZLLL = false;
            } else {
                C0VXF.postDelayed(new ARunnableS113S0100000_13(this, 201), 100L);
            }
        }
    }
}
