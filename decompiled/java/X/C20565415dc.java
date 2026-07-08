package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.smartparams.AdaptionRegularResultOperator;

/* JADX INFO: renamed from: X.15dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20565415dc extends AbstractC20569415eG {
    public final C20479515Bp LIZIZ;
    public final AdaptionRegularResultOperator LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tag:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rect:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20565415dc(C20479515Bp c20479515Bp, AdaptionRegularResultOperator adaptionRegularResultOperator) {
        super("sticker");
        this.LIZIZ = c20479515Bp;
        this.LIZJ = adaptionRegularResultOperator;
    }
}
