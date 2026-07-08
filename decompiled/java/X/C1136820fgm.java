package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.BadgeText;
import com.bytedance.android.live.base.model.user.CombineBadgeBackground;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.base.model.user.ImageBadge;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.StringBadge;
import com.bytedance.android.live.base.model.user.TextBadge;
import com.bytedance.android.livesdk.livesetting.publicscreen.BadgeCacheOptimizeEnableSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0fgm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136820fgm {
    public static long LIZIZ(List list) {
        boolean z;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iIntValue;
        int iHashCode7;
        int iHashCode8;
        int iHashCode9;
        String str;
        String str2;
        String str3;
        Integer num;
        ImageModel imageModel;
        String str4;
        BadgeText badgeText;
        String str5;
        CombineBadgeBackground combineBadgeBackground;
        ImageModel imageModel2;
        String str6;
        String str7;
        String str8;
        ImageModel imageModel3;
        String str9;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        long j = 0;
        if (z) {
            return 0L;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BadgeStruct badgeStruct = (BadgeStruct) it2.next();
            long j2 = 31;
            long j3 = ((((((j * j2) + ((long) badgeStruct.badgeScene)) * j2) + ((long) badgeStruct.badgeDisplayType)) * j2) + ((long) badgeStruct.badgePriorityType)) * j2;
            ImageBadge imageBadge = badgeStruct.imageBadge;
            if (imageBadge != null && (imageModel3 = imageBadge.imageModel) != null && (str9 = imageModel3.mUri) != null) {
                iHashCode = str9.hashCode();
            } else {
                iHashCode = 0;
            }
            long j4 = (j3 + ((long) iHashCode)) * j2;
            TextBadge textBadge = badgeStruct.textBadge;
            if (textBadge != null && (str8 = textBadge.key) != null) {
                iHashCode2 = str8.hashCode();
            } else {
                iHashCode2 = 0;
            }
            long j5 = (j4 + ((long) iHashCode2)) * j2;
            StringBadge stringBadge = badgeStruct.stringBadge;
            if (stringBadge != null && (str7 = stringBadge.contentStr) != null) {
                iHashCode3 = str7.hashCode();
            } else {
                iHashCode3 = 0;
            }
            long j6 = (j5 + ((long) iHashCode3)) * j2;
            CombineBadgeStruct combineBadgeStruct = badgeStruct.combineBadgeStruct;
            if (combineBadgeStruct != null && (combineBadgeBackground = combineBadgeStruct.background) != null && (imageModel2 = combineBadgeBackground.image) != null && (str6 = imageModel2.mUri) != null) {
                iHashCode4 = str6.hashCode();
            } else {
                iHashCode4 = 0;
            }
            long j7 = (j6 + ((long) iHashCode4)) * j2;
            CombineBadgeStruct combineBadgeStruct2 = badgeStruct.combineBadgeStruct;
            if (combineBadgeStruct2 != null && (badgeText = combineBadgeStruct2.text) != null && (str5 = badgeText.key) != null) {
                iHashCode5 = str5.hashCode();
            } else {
                iHashCode5 = 0;
            }
            long j8 = (j7 + ((long) iHashCode5)) * j2;
            CombineBadgeStruct combineBadgeStruct3 = badgeStruct.combineBadgeStruct;
            if (combineBadgeStruct3 != null && (imageModel = combineBadgeStruct3.icon) != null && (str4 = imageModel.mUri) != null) {
                iHashCode6 = str4.hashCode();
            } else {
                iHashCode6 = 0;
            }
            long j9 = (j8 + ((long) iHashCode6)) * j2;
            CombineBadgeStruct combineBadgeStruct4 = badgeStruct.combineBadgeStruct;
            if (combineBadgeStruct4 != null && (num = combineBadgeStruct4.publicScreenShowStyle) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            long j10 = (j9 + ((long) iIntValue)) * j2;
            PrivilegeLogExtra privilegeLogExtra = badgeStruct.logExtra;
            if (privilegeLogExtra != null && (str3 = privilegeLogExtra.level) != null) {
                iHashCode7 = str3.hashCode();
            } else {
                iHashCode7 = 0;
            }
            long j11 = (j10 + ((long) iHashCode7)) * j2;
            PrivilegeLogExtra privilegeLogExtra2 = badgeStruct.logExtra;
            if (privilegeLogExtra2 != null && (str2 = privilegeLogExtra2.privilege_id) != null) {
                iHashCode8 = str2.hashCode();
            } else {
                iHashCode8 = 0;
            }
            long j12 = (j11 + ((long) iHashCode8)) * j2;
            PrivilegeLogExtra privilegeLogExtra3 = badgeStruct.logExtra;
            if (privilegeLogExtra3 != null && (str = privilegeLogExtra3.privilege_version) != null) {
                iHashCode9 = str.hashCode();
            } else {
                iHashCode9 = 0;
            }
            j = (j2 * (j12 + ((long) iHashCode9))) + badgeStruct.greyedByClient;
        }
        return j;
    }

    public static C1142400fpm LJ(DataChannel dataChannel) {
        C1142400fpm c1142400fpm;
        if (dataChannel != null && (c1142400fpm = (C1142400fpm) dataChannel.gg0(C1113450f55.class)) != null && (!c1142400fpm.LJIJI)) {
            return c1142400fpm;
        }
        return null;
    }

    public static String LIZJ(Object obj, String str) {
        String strValueOf;
        if (obj == null || (strValueOf = String.valueOf(System.identityHashCode(obj))) == null) {
            strValueOf = String.valueOf(C1142400fpm.LJJIIZI.incrementAndGet());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('@');
        sbLIZ.append(strValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL(long j, List list) {
        long jLIZIZ = LIZIZ(list);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append('_');
        sbLIZ.append(jLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJFF(DataChannel dataChannel, String str) {
        if (dataChannel == null) {
            return false;
        }
        synchronized (dataChannel) {
            try {
                C1142400fpm c1142400fpm = (C1142400fpm) dataChannel.gg0(C1113450f55.class);
                if (c1142400fpm == null) {
                    return false;
                }
                boolean zLJIILL = c1142400fpm.LJIILL(str);
                if (zLJIILL && dataChannel.gg0(C1113450f55.class) == c1142400fpm) {
                    dataChannel.SX0(C1113450f55.class, null);
                }
                return zLJIILL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static C1142400fpm LIZ(long j, long j2, DataChannel dataChannel, String str, boolean z) {
        boolean zIsAudienceEnabled;
        boolean zIsAudienceEnabled2;
        if (j == 0) {
            return null;
        }
        synchronized (dataChannel) {
            try {
                C1142400fpm c1142400fpm = (C1142400fpm) dataChannel.gg0(C1113450f55.class);
                if (c1142400fpm != null) {
                    if (c1142400fpm.LIZ == j && !c1142400fpm.LJIJI) {
                        if (z) {
                            zIsAudienceEnabled2 = BadgeCacheOptimizeEnableSetting.isAnchorEnabled();
                        } else {
                            zIsAudienceEnabled2 = BadgeCacheOptimizeEnableSetting.isAudienceEnabled();
                        }
                        if (!zIsAudienceEnabled2) {
                            c1142400fpm.LJIILJJIL();
                            dataChannel.SX0(C1113450f55.class, null);
                            return null;
                        }
                        if (c1142400fpm.LJIILLIIL(str)) {
                            if (j2 > 0 && c1142400fpm.LIZIZ == 0) {
                                c1142400fpm.LIZIZ = j2;
                            }
                            return c1142400fpm;
                        }
                    }
                    if (!c1142400fpm.LJIJI) {
                        c1142400fpm.LJIILJJIL();
                    }
                    dataChannel.SX0(C1113450f55.class, null);
                }
                if (z) {
                    zIsAudienceEnabled = BadgeCacheOptimizeEnableSetting.isAnchorEnabled();
                } else {
                    zIsAudienceEnabled = BadgeCacheOptimizeEnableSetting.isAudienceEnabled();
                }
                if (!zIsAudienceEnabled) {
                    return null;
                }
                C1142400fpm c1142400fpm2 = new C1142400fpm(j, j2);
                c1142400fpm2.LJIILLIIL(str);
                dataChannel.SX0(C1113450f55.class, c1142400fpm2);
                return c1142400fpm2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
