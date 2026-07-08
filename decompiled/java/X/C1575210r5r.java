package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.vibefeed.experiment.SocialVibeFeedConfigSetting;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0r5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575210r5r implements InterfaceC586170Myt {
    public static final C1575210r5r LLILLJJLI;
    public static final ConcurrentHashMap<String, EnumC1575230r5t> LLILLL;
    public static Long LLILZ;
    public static Long LLILZIL;
    public static Keva LLILZLL;
    public final /* synthetic */ C1575250r5v LL = new C1575250r5v();

    static {
        C1575210r5r c1575210r5r = new C1575210r5r();
        LLILLJJLI = c1575210r5r;
        LLILLL = new ConcurrentHashMap<>();
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJIILL(c1575210r5r);
        }
    }

    public static final Keva LIZLLL(String str) {
        Keva keva = LLILZLL;
        if (keva == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("repo_vibe_feed_");
            sbLIZ.append(str);
            Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
            LLILZLL = repo;
            return repo;
        }
        return keva;
    }

    public final Boolean LIZ(String str) {
        EnumC1575230r5t enumC1575230r5t = LLILLL.get(str);
        if (enumC1575230r5t != null) {
            int i = C1575220r5s.LIZ[enumC1575230r5t.ordinal()];
            if (i == 1) {
                return null;
            }
            if (i != 2) {
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        Keva kevaLIZLLL = LIZLLL(strLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vibe_feed_state_");
        sbLIZ.append(str);
        int i2 = kevaLIZLLL.getInt(C2188811AlT.LIZIZ(sbLIZ), -1);
        if (i2 == -1) {
            return null;
        }
        EnumC1575230r5t.Companion.getClass();
        int i3 = C1575220r5s.LIZ[C1575240r5u.LIZ(i2).ordinal()];
        if (i3 == 1) {
            return null;
        }
        if (i3 != 2) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public final EnumC1575230r5t LIZIZ(String str) {
        long jLongValue;
        long jLongValue2;
        ConcurrentHashMap<String, EnumC1575230r5t> concurrentHashMap = LLILLL;
        EnumC1575230r5t enumC1575230r5tLIZ = concurrentHashMap.get(str);
        String str2 = "";
        if (enumC1575230r5tLIZ == null) {
            C1575240r5u c1575240r5u = EnumC1575230r5t.Companion;
            String strLIZ = C1575440r6E.LIZ();
            if (strLIZ == null) {
                strLIZ = "";
            }
            Keva kevaLIZLLL = LIZLLL(strLIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("vibe_feed_state_");
            sbLIZ.append(str);
            int i = kevaLIZLLL.getInt(C2188811AlT.LIZIZ(sbLIZ), EnumC1575230r5t.HIDE.getValue());
            c1575240r5u.getClass();
            enumC1575230r5tLIZ = C1575240r5u.LIZ(i);
        }
        if (enumC1575230r5tLIZ == EnumC1575230r5t.INVITE) {
            Long l = LLILZ;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                String strLIZ2 = C1575440r6E.LIZ();
                if (strLIZ2 == null) {
                    strLIZ2 = "";
                }
                Keva kevaLIZLLL2 = LIZLLL(strLIZ2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("invite_send_timestamp_");
                sbLIZ2.append(str);
                jLongValue = kevaLIZLLL2.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L);
            }
            Long l2 = LLILZIL;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            } else {
                String strLIZ3 = C1575440r6E.LIZ();
                if (strLIZ3 != null) {
                    str2 = strLIZ3;
                }
                Keva kevaLIZLLL3 = LIZLLL(str2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("invite_send_timestamp_local_");
                sbLIZ3.append(str);
                jLongValue2 = kevaLIZLLL3.getLong(C2188811AlT.LIZIZ(sbLIZ3), 0L);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (jCurrentTimeMillis > SocialVibeFeedConfigSetting.LIZ().inviteTTLSecond + jLongValue && jCurrentTimeMillis > SocialVibeFeedConfigSetting.LIZ().inviteTTLSecond + jLongValue2) {
                enumC1575230r5tLIZ = EnumC1575230r5t.INVITE_OUTGAP;
            } else {
                enumC1575230r5tLIZ = EnumC1575230r5t.INVITE_GAP;
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("getCurrentCacheState, vibeFeedState:");
        sbLIZ4.append(concurrentHashMap);
        C299700Bou.LIZIZ("VibeFeedStateController", C2188811AlT.LIZIZ(sbLIZ4));
        return enumC1575230r5tLIZ;
    }

    public final String LIZJ(String str) {
        EnumC1575230r5t enumC1575230r5tLIZ = LLILLL.get(str);
        if (enumC1575230r5tLIZ == null) {
            C1575240r5u c1575240r5u = EnumC1575230r5t.Companion;
            String strLIZ = C1575440r6E.LIZ();
            if (strLIZ == null) {
                strLIZ = "";
            }
            Keva kevaLIZLLL = LIZLLL(strLIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("vibe_feed_state_");
            sbLIZ.append(str);
            int i = kevaLIZLLL.getInt(C2188811AlT.LIZIZ(sbLIZ), EnumC1575230r5t.HIDE.getValue());
            c1575240r5u.getClass();
            enumC1575230r5tLIZ = C1575240r5u.LIZ(i);
        }
        if (C1697810uHb.LJIIJJI(EnumC1575230r5t.CLOSED, EnumC1575230r5t.HIDE, EnumC1575230r5t.UNKNOWN, EnumC1575230r5t.NOT_ESTABLISHED).contains(enumC1575230r5tLIZ)) {
            return null;
        }
        if (LJ(str)) {
            return String.valueOf(C0YNP.LJII(str));
        }
        return C1575440r6E.LIZ();
    }

    public final boolean LJ(String str) {
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        Keva kevaLIZLLL = LIZLLL(strLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vibe_feed_role_");
        sbLIZ.append(str);
        return kevaLIZLLL.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public final void LJFF(EnumC1575230r5t enumC1575230r5t, String str) {
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        Keva kevaLIZLLL = LIZLLL(strLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vibe_feed_state_");
        sbLIZ.append(str);
        kevaLIZLLL.storeInt(C2188811AlT.LIZIZ(sbLIZ), enumC1575230r5t.ordinal());
    }

    public final void LJII(EnumC1575230r5t enumC1575230r5t, String str) {
        ConcurrentHashMap<String, EnumC1575230r5t> concurrentHashMap = LLILLL;
        concurrentHashMap.put(str, enumC1575230r5t);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateFromClose, vibeFeedState:");
        sbLIZ.append(concurrentHashMap);
        C299700Bou.LIZIZ("VibeFeedStateController", C2188811AlT.LIZIZ(sbLIZ));
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        Keva kevaLIZLLL = LIZLLL(strLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("invite_send_timestamp_");
        sbLIZ2.append(str);
        kevaLIZLLL.erase(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("invite_send_timestamp_local_");
        sbLIZ3.append(str);
        kevaLIZLLL.erase(C2188811AlT.LIZIZ(sbLIZ3));
        LJFF(enumC1575230r5t, str);
    }

    public final void LJI(EnumC897860ZKe enumC897860ZKe, String str, boolean z) {
        C1575250r5v c1575250r5v = this.LL;
        c1575250r5v.getClass();
        if (C299810Bp5.LIZ()) {
            C1575200r5q c1575200r5q = c1575250r5v.LIZ.get(str);
            if (c1575200r5q != null) {
                if (c1575200r5q.LIZ.overwrite(enumC897860ZKe)) {
                    c1575250r5v.LIZ.put(str, new C1575200r5q(enumC897860ZKe, z));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("store red dot status to: ");
                    sbLIZ.append(str);
                    sbLIZ.append(' ');
                    sbLIZ.append(z);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("skip store red dot status to: ");
                sbLIZ2.append(str);
                sbLIZ2.append(' ');
                sbLIZ2.append(z);
                C2188811AlT.LIZIZ(sbLIZ2);
                return;
            }
            c1575250r5v.LIZ.put(str, new C1575200r5q(enumC897860ZKe, z));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("store red dot status to: ");
            sbLIZ3.append(str);
            sbLIZ3.append(' ');
            sbLIZ3.append(z);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (!z) {
            return;
        }
        if (i != 2 && i != 3) {
            return;
        }
        LLILLL.clear();
        this.LL.LIZ.clear();
        LLILZLL = null;
    }
}
