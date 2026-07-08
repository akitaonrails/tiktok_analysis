package X;

import Y.AObjectS386S0100000_11;
import Y.AObserverS215S0100000_11;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0S3L, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S3L extends C0S3Z {
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;

    public C0S3L(C0S3T c0s3t) {
        super(c0s3t);
        C0S3Y.LIZ("ProgressDescPresenter");
        this.LJIIIIZZ = C452501pT.LIZIZ(new AObjectS386S0100000_11(this, 5));
        this.LJIIIZ = C452501pT.LIZIZ(new AObjectS386S0100000_11(this, 6));
        this.LJIIJ = C452501pT.LIZIZ(new AObjectS386S0100000_11(this, 7));
        new AObserverS215S0100000_11(this, 32);
        new AObserverS215S0100000_11(this, 33);
    }

    public final String LJIIIZ(int i) {
        int i2;
        String strValueOf;
        String strValueOf2;
        if (i <= 0) {
            i2 = 0;
        } else {
            i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
        }
        getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        int i3 = i2 / 60;
        if (i3 < 10) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('0');
            sbLIZ2.append(i3);
            strValueOf = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strValueOf = String.valueOf(i3);
        }
        sbLIZ.append(strValueOf);
        sbLIZ.append(':');
        int i4 = i2 % 60;
        if (i4 < 10) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('0');
            sbLIZ3.append(i4);
            strValueOf2 = C2188811AlT.LIZIZ(sbLIZ3);
        } else {
            strValueOf2 = String.valueOf(i4);
        }
        sbLIZ.append(strValueOf2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
