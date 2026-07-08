package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IhQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473420IhQ {
    public static final String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "friends";
            }
            if (num.intValue() == 2) {
                return "specific_people";
            }
            if (num.intValue() == 3) {
                return "followers";
            }
            if (num.intValue() == -1) {
                return "";
            }
            return "everyone";
        }
        return "everyone";
    }

    public static final boolean LIZIZ(Pair<Long, Boolean> pair, String str, String str2, Room room) {
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('.');
        sbLIZ.append(str2);
        sbLIZ.append(" shoppingIconVisiblePair=");
        sbLIZ.append(pair);
        C20441214yg.LIZIZ("ServiceIconConflictsResolution", C2188811AlT.LIZIZ(sbLIZ));
        if (pair == null) {
            return false;
        }
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        if (lValueOf == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append('.');
            sbLIZ2.append(str2);
            sbLIZ2.append(" currentRoomId=");
            sbLIZ2.append(lValueOf);
            sbLIZ2.append(" IS NULL");
            C20441214yg.LIZIZ("ServiceIconConflictsResolution", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        Long first = pair.getFirst();
        if (!Intrinsics.LJFF(first, lValueOf)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append('.');
            sbLIZ3.append(str2);
            sbLIZ3.append(" currentRoomId=");
            sbLIZ3.append(lValueOf);
            sbLIZ3.append(" NOT matched expectedRoomId=");
            sbLIZ3.append(first);
            C20441214yg.LIZIZ("ServiceIconConflictsResolution", C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
        boolean zBooleanValue = pair.getSecond().booleanValue();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(str);
        sbLIZ4.append('.');
        sbLIZ4.append(str2);
        sbLIZ4.append(" currentRoomId=");
        sbLIZ4.append(lValueOf);
        sbLIZ4.append(" shoppingIconVisible=");
        sbLIZ4.append(zBooleanValue);
        C20441214yg.LIZIZ("ServiceIconConflictsResolution", C2188811AlT.LIZIZ(sbLIZ4));
        return true;
    }
}
