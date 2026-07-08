package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0haZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1209850haZ {
    public final C1208410hYF LIZ;

    public C1209850haZ(C1208410hYF c1208410hYF) {
        this.LIZ = c1208410hYF;
    }

    public final boolean LIZ(int i, long j) {
        long jLongValue;
        Object objValueOf;
        int i2 = this.LIZ.LIZJ;
        if (i2 > 0 && i >= i2) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        List<Long> list = this.LIZ.LIZLLL;
        if (list != null) {
            if (i >= 0 && i < list.size()) {
                objValueOf = ListProtector.get(list, i);
            } else {
                objValueOf = Long.valueOf(((Number) C13LP.LJJLIIIJJI(list)).longValue());
            }
            jLongValue = ((Number) objValueOf).longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        } else {
            jLongValue = 0;
        }
        if (jCurrentTimeMillis < jLongValue) {
            return false;
        }
        return true;
    }
}
