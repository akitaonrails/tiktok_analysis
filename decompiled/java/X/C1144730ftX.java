package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ftX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144730ftX {
    public static final int LIZ(String str) {
        if (str != null && C500260Jjc.LJJIIZ(str) && C2095008Iq.LJIILIIL(str) != null) {
            long j = CastLongProtector.parseLong(str);
            if (j != 0) {
                return LIZIZ(j);
            }
            return -1;
        }
        return -1;
    }

    public static final int LIZIZ(long j) {
        Iterator<C954460awe> it2 = C915980Zwa.LJII().LJJLI().iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().LJ != j) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static final long LIZJ(long j, long j2) {
        long j3 = j * 1000;
        if (j3 < C158B.LIZIZ()) {
            return j2 - ((C158B.LIZIZ() - j3) / 1000);
        }
        return j2;
    }

    public static final ItemInfo4FE LIZLLL(List<ItemInfo4FE> list, UUID uuid) {
        if (list == null) {
            return null;
        }
        Iterator<ItemInfo4FE> it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(it2.next().itemId, uuid)) {
                if (i != -1) {
                    return (ItemInfo4FE) ListProtector.remove(list, i);
                }
            } else {
                i++;
            }
        }
        return null;
    }
}
