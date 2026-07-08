package X;

import com.ss.android.ugc.aweme.tako.detail.communicate.TakoConsumeModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252131DCx {
    public static TakoConsumeModel LIZ(C2252061DCq c2252061DCq) {
        long jLongValue;
        Boolean bool;
        Object obj;
        Object obj2 = c2252061DCq.LJJIZ.get(EnumC2252111DCv.CLICK);
        Boolean bool2 = c2252061DCq.LJJIIJZLJL;
        Boolean bool3 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool2, bool3) && c2252061DCq.LJIILLIIL == null) {
            if (obj2 instanceof Boolean) {
                obj = obj2;
            } else {
                obj = null;
            }
            if (!Intrinsics.LJFF(obj, bool3)) {
                return null;
            }
        }
        String str = c2252061DCq.LIZ;
        Long l = c2252061DCq.LJIILLIIL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        Boolean bool4 = c2252061DCq.LJIJ;
        Boolean bool5 = c2252061DCq.LJIJJ;
        Boolean bool6 = c2252061DCq.LJIL;
        Boolean bool7 = c2252061DCq.LJJI;
        Boolean bool8 = c2252061DCq.LJJIFFI;
        Boolean bool9 = c2252061DCq.LJJII;
        Boolean bool10 = c2252061DCq.LJJIII;
        if (obj2 instanceof Boolean) {
            bool = (Boolean) obj2;
        } else {
            bool = null;
            obj2 = null;
        }
        if (!Intrinsics.LJFF(obj2, bool3) && !Intrinsics.LJFF(c2252061DCq.LJJIIJZLJL, bool3)) {
            bool3 = null;
        }
        Long l2 = c2252061DCq.LJJIIZ;
        Long l3 = c2252061DCq.LJJIJIIJI;
        return new TakoConsumeModel(str, Long.valueOf(jLongValue), c2252061DCq.LJIILL, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool, bool3, c2252061DCq.LJJIJIIJIL, c2252061DCq.LJIIZILJ, l3, c2252061DCq.LJJIJIL, l2, null, c2252061DCq.LJJIIZI);
    }
}
