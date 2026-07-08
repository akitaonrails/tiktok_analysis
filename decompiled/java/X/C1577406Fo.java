package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.UserInteractionRecord;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06Fo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1577406Fo {
    public static StreakData LIZ(String str, C06G4 c06g4) {
        String str2;
        Object c098200Yq;
        IMContactApi.LIZ.getClass();
        UserInteractionRecord userInteractionRecordLIZ = C069P.LIZ().LIZIZ().LIZ(str, c06g4, EnumC1581606He.STREAK);
        Object obj = null;
        if (userInteractionRecordLIZ == null || (str2 = userInteractionRecordLIZ.data) == null) {
            return null;
        }
        try {
            c098200Yq = (StreakData) C051M.LIZIZ(StreakData.class, str2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (StreakData) obj;
    }

    public static boolean LIZIZ(StreakData streakData, String str) {
        C06G4 c06g4;
        if (streakData.convType == AbstractC1711506n3.LIZIZ) {
            c06g4 = C06G4.CONVERSATION;
        } else {
            c06g4 = C06G4.USER;
        }
        UserInteractionRecord userInteractionRecord = new UserInteractionRecord(str, c06g4, EnumC1581606He.STREAK, C051M.LJ(streakData, false));
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LIZIZ().LIZIZ(userInteractionRecord).getFirst().booleanValue();
    }

    public static void LIZJ(List list, Function1 function1) {
        C06G4 c06g4;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            StreakData streakData = (StreakData) it2.next();
            String str = (String) function1.invoke(streakData);
            if (streakData.convType == AbstractC1711506n3.LIZIZ) {
                c06g4 = C06G4.CONVERSATION;
            } else {
                c06g4 = C06G4.USER;
            }
            arrayList.add(new UserInteractionRecord(str, c06g4, EnumC1581606He.STREAK, C051M.LJ(streakData, false)));
        }
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LIZIZ().LIZLLL(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.im.streak.api.StreakData LIZLLL(int r34, java.lang.String r35, X.C2272741DxY r36, java.lang.String r37, java.lang.Integer r38, java.lang.Long r39, java.lang.String r40, java.lang.String r41, java.lang.String r42) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1577406Fo.LIZLLL(int, java.lang.String, X.1DxY, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String):com.ss.android.ugc.aweme.im.streak.api.StreakData");
    }
}
