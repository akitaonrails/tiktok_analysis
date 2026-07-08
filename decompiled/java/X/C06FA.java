package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06FA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06FA extends C1577406Fo {
    public final C06F8 LIZ;

    public C06FA(C06F8 c06f8) {
        this.LIZ = c06f8;
    }

    public static String LJ(String str) {
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fake_write_");
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(':');
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static StreakData LJFF(String str, boolean z) {
        if (!C1208304o5.LIZJ && !z) {
            return null;
        }
        if (str.length() == 0) {
            C1590906Kt.LIZJ("StreakFakeDataSource: read, conversationId is empty");
            return null;
        }
        return C1577406Fo.LIZ(LJ(str), C1567806Bw.LIZJ(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.im.streak.api.StreakData r11, kotlin.jvm.functions.Function1 r12, X.C06FC r13) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06FA.LJI(com.ss.android.ugc.aweme.im.streak.api.StreakData, kotlin.jvm.functions.Function1, X.06FC):void");
    }

    public static final void LJII(InterfaceC1631620sYq<? super StreakData, ? super String, ? super Boolean, Unit> interfaceC1631620sYq, StreakData streakData, boolean z, int i) {
        interfaceC1631620sYq.invoke(streakData, "fake_write", Boolean.valueOf(z));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06F9(streakData, z, i, null), 3);
    }
}
