package X;

import com.bytedance.android.livesdk.livesetting.game.MaxTnsPiracyReportDataSize;
import java.util.List;

/* JADX INFO: renamed from: X.01sW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C471401sW {
    public final int LIZ = MaxTnsPiracyReportDataSize.INSTANCE.getValue();
    public final String LIZIZ;
    public final String LIZJ;
    public final List<InterfaceC471501sX> LIZLLL;
    public final long LJ;
    public final long LJFF;

    public C471401sW(String str, String str2, List list, Long l, Long l2) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = list;
        this.LJ = 1000L;
        this.LJFF = 30000L;
        if (l != null) {
            long jLongValue = l.longValue();
            this.LJ = jLongValue < 500 ? 500L : jLongValue;
        }
        if (l2 != null) {
            long jLongValue2 = l2.longValue();
            this.LJFF = jLongValue2 >= 30000 ? jLongValue2 : 30000L;
        }
    }
}
