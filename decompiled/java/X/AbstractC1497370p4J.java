package X;

import android.content.Context;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0p4J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1497370p4J {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Context LIZ;

    public abstract C1497360p4I LIZ(boolean z);

    public abstract void LIZIZ();

    public abstract void LIZJ();

    public abstract void LIZLLL();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[class=");
        sbLIZ.append(getClass().getName());
        sbLIZ.append(", name=");
        LIZIZ();
        sbLIZ.append("App-Packaged-Cronet-Provider");
        sbLIZ.append(", version=");
        LIZJ();
        sbLIZ.append("107.0.5273.2");
        sbLIZ.append(", enabled=");
        LIZLLL();
        sbLIZ.append(true);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC1497370p4J(Context context) {
        if (context != null) {
            this.LIZ = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
