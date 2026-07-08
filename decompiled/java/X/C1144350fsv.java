package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0fsv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144350fsv {
    public final DataChannel LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final C1149870g1p LJII;

    public /* synthetic */ C1144350fsv(DataChannel dataChannel, int i, long j, String str, String str2, String str3, int i2) {
        this((i2 & 1) != 0 ? null : dataChannel, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) == 0 ? str3 : "", null, null);
    }

    public C1144350fsv(DataChannel dataChannel, int i, long j, String str, String str2, String str3, String str4, C1149870g1p c1149870g1p) {
        this.LIZ = dataChannel;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = c1149870g1p;
    }
}
