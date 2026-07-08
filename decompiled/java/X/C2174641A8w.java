package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.api.PlaceUserInfo;
import com.ss.android.ugc.aweme.relation.feed.NewUserRecCardProtect;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS425S0200000_24;

/* JADX INFO: renamed from: X.1A8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174641A8w implements InterfaceC1587840rQE {
    public static final Map<String, Boolean> LJI = new LinkedHashMap();
    public final InterfaceC19229810Ky LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;

    @Override // X.InterfaceC1587840rQE
    public final void LIZ() {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2174621A8u(this, null), 3);
    }

    public static boolean LIZLLL() {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            int i = C2187451AjH.LIZ;
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("social_big_card_freq_control", true)) {
            int i2 = C2187451AjH.LIZ;
            return false;
        }
        if (C2518009tq.LIZ) {
            int i3 = C2187451AjH.LIZ;
            return true;
        }
        int i4 = C1A9E.LIZ().group;
        int i5 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[isFriendsTabEnable] group it ");
        sbLIZ.append(i4);
        sbLIZ.append(", indexOfHistoryPos is ");
        sbLIZ.append(C1A9E.LIZ().friendsTabConfig.historyFlowPosition);
        C2188811AlT.LIZIZ(sbLIZ);
        if (i4 <= 5) {
            return false;
        }
        C1217080hmE.LIZ.getClass();
        Keva keva = C1217080hmE.LIZIZ;
        if (keva.getBoolean(C1217080hmE.LIZ("rcmd_new_user_protection_flag"), false)) {
            C01GW c01gw = C2174671A8z.LIZJ;
            int i6 = ((NewUserRecCardProtect) c01gw.getValue()).strategy;
            if (1 <= i6 && i6 < 3) {
                if (((NewUserRecCardProtect) c01gw.getValue()).strategy == 1) {
                    int i7 = keva.getInt(C1217080hmE.LIZ("rcmd_new_user_protection_cold_start_count"), 0);
                    int i8 = ((NewUserRecCardProtect) c01gw.getValue()).coldStartCountLimit;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[isMatchBaseCondition] coldStartCount = ");
                    sbLIZ2.append(i7);
                    sbLIZ2.append(", limit = ");
                    sbLIZ2.append(i8);
                    C1720106oR.LJI("TTRecUserFriendsTabController", C2188811AlT.LIZIZ(sbLIZ2));
                    if (i7 <= i8) {
                        return false;
                    }
                }
                if (((NewUserRecCardProtect) c01gw.getValue()).strategy == 2) {
                    long j = keva.getLong(C1217080hmE.LIZ("rcmd_new_user_protection_first_launch_time"), 0L);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i9 = ((NewUserRecCardProtect) c01gw.getValue()).coldStartHourLimit;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[isMatchBaseCondition] coldStartTimeMillis = ");
                    sbLIZ3.append(j);
                    sbLIZ3.append(", hourLimit = ");
                    sbLIZ3.append(i9);
                    sbLIZ3.append(", currentTimeMillis = ");
                    sbLIZ3.append(jCurrentTimeMillis);
                    C1720106oR.LJI("TTRecUserFriendsTabController", C2188811AlT.LIZIZ(sbLIZ3));
                    if (jCurrentTimeMillis - j <= ((long) i9) * 3600000) {
                        return false;
                    }
                }
            }
        }
        if (C1A9E.LIZIZ()) {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            Boolean bool = (Boolean) ((LinkedHashMap) LJI).get(curUserId);
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[fetchRecUserData] uid = ");
            sbLIZ4.append(curUserId);
            sbLIZ4.append(", hasShownInAppSession = ");
            sbLIZ4.append(zBooleanValue);
            C1720106oR.LJI("TTRecUserFriendsTabController", C2188811AlT.LIZIZ(sbLIZ4));
            if (zBooleanValue) {
                return false;
            }
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        return (C1A9E.LIZ().isWorkForHighMuf || (curUser != null ? curUser.getFriendCount() : 0) <= 60) && C2276131E7f.LIZ(C1E7L.BIG_CARD_FRIENDS_FEED, new C995300c0W(curUser));
    }

    public C2174641A8w(InterfaceC19229810Ky interfaceC19229810Ky) {
        this.LIZ = interfaceC19229810Ky;
    }

    @Override // X.InterfaceC1587840rQE
    public final void LIZJ(PlaceUserInfo placeUserInfo, AwS425S0200000_24 awS425S0200000_24) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2174631A8v(this, placeUserInfo, awS425S0200000_24, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023c  */
    @Override // X.InterfaceC1587840rQE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r20, boolean r21, boolean r22, java.util.List r23) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2174641A8w.LIZIZ(int, boolean, boolean, java.util.List):void");
    }
}
