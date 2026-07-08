package X;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E1W, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E1W {
    public static final String LIZ(C0E1X c0e1x, EnumC357140DzM enumC357140DzM, C19EG c19eg, Map map) {
        String str;
        int i;
        Integer num;
        Integer numValueOf;
        EnumC357140DzM enumC357140DzM2 = EnumC357140DzM.UNDO;
        if (enumC357140DzM == enumC357140DzM2) {
            str = c0e1x.LIZIZ;
        } else {
            str = c0e1x.LIZJ;
        }
        if (enumC357140DzM == enumC357140DzM2) {
            i = 2131824672;
        } else {
            i = 2131824669;
        }
        String string = c19eg.getString(i);
        Object[] objArr = (Object[]) map.get(c0e1x.LIZ);
        if (objArr == null || (num = (Integer) C13LQ.LJJIIZ(0, objArr)) == null) {
            return "";
        }
        int iIntValue = num.intValue();
        Object[] objArr2 = (Object[]) map.get(c0e1x.LIZ);
        if (objArr2 != null) {
            numValueOf = (Integer) C13LQ.LJJIIZ(1, objArr2);
        } else {
            numValueOf = null;
        }
        String str2 = c0e1x.LIZ;
        if (!Intrinsics.LJFF(str2, C0E1V.TRANSITION.getNameId())) {
            if (!Intrinsics.LJFF(str2, C0E1V.VIDEO_TRANSITION.getNameId()) && !Intrinsics.LJFF(str2, C0E1V.MAGIC.getNameId()) && !Intrinsics.LJFF(str2, C0E1V.ASYNC_TASK.getNameId()) && !Intrinsics.LJFF(str2, C0E1V.REMOVE_MAGIC.getNameId())) {
                if (!Intrinsics.LJFF(str2, C0E1V.APPLY_ADJUST.getNameId()) && !Intrinsics.LJFF(str2, C0E1V.APPLY_VOICE_EFFECT.getNameId()) && !Intrinsics.LJFF(str2, C0E1V.APPLYTOALL_VOICE_EFFECT.getNameId()) && !Intrinsics.LJFF(str2, C0E1V.APPLY_SINGLE_BEAUTY_FILTER.getNameId()) && !Intrinsics.LJFF(str2, C0E1V.REMOVE_SINGLE_BEAUTY_FILTER.getNameId()) && !Intrinsics.LJFF(str2, C0E1V.ADJUST_BEAUTY_VALUE.getNameId()) && !Intrinsics.LJFF(str2, C0E1V.APPLY_AUTO_RETOUCH.getNameId()) && !Intrinsics.LJFF(str2, C0E1V.REMOVE_AUTO_RETOUCH.getNameId()) && !Intrinsics.LJFF(str2, C0E1V.RETOUCH_RESET.getNameId())) {
                    if (numValueOf == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(string);
                        sbLIZ.append(": ");
                        sbLIZ.append(c19eg.getString(iIntValue));
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (enumC357140DzM != enumC357140DzM2) {
                        iIntValue = numValueOf.intValue();
                    }
                    return c19eg.getString(iIntValue);
                }
                if (enumC357140DzM == enumC357140DzM2) {
                    numValueOf = Integer.valueOf(iIntValue);
                }
                if (numValueOf == null) {
                    return "";
                }
                numValueOf.intValue();
                return C786410Ut5.j4(c19eg.getString(numValueOf.intValue()), Arrays.copyOf(new Object[]{c0e1x.LIZLLL}, 1));
            }
            if (numValueOf == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(string);
                sbLIZ2.append(": ");
                sbLIZ2.append(c19eg.getString(iIntValue));
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (enumC357140DzM != enumC357140DzM2) {
                iIntValue = numValueOf.intValue();
            }
            return C786410Ut5.j4(c19eg.getString(iIntValue), Arrays.copyOf(new Object[]{c0e1x.LIZLLL}, 1));
        }
        return str;
    }
}
