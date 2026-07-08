package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0NHI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NHI implements InterfaceC1475420oUu {
    public final Aweme LIZ;
    public final C0NHS LIZIZ;
    public final String LIZJ;
    public long LIZLLL;

    @Override // X.InterfaceC1475420oUu
    public final void LIZ(int i, long j, long j2, String str) {
    }

    public C0NHI(Aweme aweme, C0NH2 c0nh2) {
        this.LIZ = aweme;
        this.LIZIZ = c0nh2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aweme.getAid());
        sbLIZ.append("golden_house");
        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1475420oUu
    public final void LIZIZ(int i, long j, String str, String str2) {
        if (!TextUtils.equals(this.LIZJ, str)) {
            return;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 5) {
                    if (i == 8) {
                        this.LIZIZ.LIZ();
                        return;
                    }
                    return;
                }
                this.LIZIZ.LIZIZ();
                return;
            }
            this.LIZIZ.LIZJ(System.currentTimeMillis() - this.LIZLLL);
            return;
        }
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZIZ.LIZLLL(j, jCurrentTimeMillis - this.LIZLLL, this.LIZ, str2);
    }
}
