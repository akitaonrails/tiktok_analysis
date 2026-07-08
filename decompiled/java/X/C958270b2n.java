package X;

import com.bytedance.android.livesdk.chatroom.interact.model.BattleOptPair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0b2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958270b2n {
    public static final String LIZ(Long l) {
        if (l == null) {
            return "";
        }
        l.longValue();
        if (l.longValue() == 1) {
            return "1v1";
        }
        if (l.longValue() != 2) {
            return "";
        }
        return "2v2";
    }

    public static final long LIZIZ(List<Long> list) {
        int i;
        if (list == null || list.size() != 4) {
            return -1L;
        }
        int i2 = 0;
        long jLongValue = 0;
        boolean z = false;
        do {
            if (((Number) ListProtector.get(list, i2)).longValue() == C950220apo.LJFF()) {
                z = true;
            } else {
                jLongValue = ((Number) ListProtector.get(list, i2)).longValue();
            }
            i2++;
            i = 2;
        } while (i2 < 2);
        if (z && jLongValue > 0) {
            return jLongValue;
        }
        do {
            if (((Number) ListProtector.get(list, i)).longValue() != C950220apo.LJFF()) {
                jLongValue = ((Number) ListProtector.get(list, i)).longValue();
            }
            i++;
        } while (i < 4);
        return jLongValue;
    }

    public static final boolean LIZJ(C958360b2w c958360b2w) {
        BattleOptPair battleOptPair;
        if (c958360b2w != null && (battleOptPair = c958360b2w.LJ) != null && battleOptPair.playType == 0) {
            return true;
        }
        return false;
    }
}
