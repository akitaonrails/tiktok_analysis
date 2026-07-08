package X;

import android.graphics.Point;

/* JADX INFO: renamed from: X.10tf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19390910tf {
    public final EnumC19384410sc LIZ;
    public final Point LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RememberableWindowState(windowMode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", adhereToLeft=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", relativePositionY=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19390910tf(EnumC19384410sc enumC19384410sc, Point point, boolean z, float f) {
        this.LIZ = enumC19384410sc;
        this.LIZIZ = point;
        this.LIZJ = z;
        this.LIZLLL = f;
    }
}
