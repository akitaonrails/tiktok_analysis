package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0bJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C968680bJa {
    public static final boolean LIZIZ(int i, int i2) {
        return (i & i2) == i2;
    }

    public static void LIZ(Object obj) {
        if (!C1304630k3R.LIZIZ) {
        } else {
            throw new IllegalStateException("Enum is out of range, have you defined the enum in rust ?");
        }
    }

    public static final int LIZJ(List<Long> list) {
        EnumC967900bIK enumC967900bIK;
        Iterator<Long> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            int iLongValue = (int) it2.next().longValue();
            EnumC967900bIK.Companion.getClass();
            int i2 = 4;
            if (iLongValue != 0) {
                if (iLongValue != 1) {
                    if (iLongValue != 2) {
                        if (iLongValue != 3) {
                            if (iLongValue == 4) {
                                enumC967900bIK = EnumC967900bIK.ContentPositionList;
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Unmatched primitive enum value: LinkMicListChangeType with ");
                                sbLIZ.append(iLongValue);
                                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        } else {
                            enumC967900bIK = EnumC967900bIK.InvitedList;
                        }
                    } else {
                        enumC967900bIK = EnumC967900bIK.AppliedList;
                    }
                } else {
                    enumC967900bIK = EnumC967900bIK.LinkedList;
                }
            } else {
                enumC967900bIK = EnumC967900bIK.None;
            }
            int i3 = C967860bIG.LIZIZ[enumC967900bIK.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            i2 = 0;
                        } else {
                            i2 = 32;
                        }
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 1;
                }
            }
            i |= i2;
        }
        return i;
    }

    public static final EnumC2235671Cer LIZLLL(int i) {
        if (i == 1) {
            return EnumC2235671Cer.Agree;
        }
        return EnumC2235671Cer.Reject;
    }

    public static final EnumC968700bJc LJ(int i) {
        if (i >= EnumC968700bJc.values().length) {
            EnumC968700bJc enumC968700bJc = EnumC968700bJc.Unknown;
            LIZ(enumC968700bJc);
            return enumC968700bJc;
        }
        EnumC968700bJc.Companion.getClass();
        switch (i) {
            case 0:
                return EnumC968700bJc.Unknown;
            case 1:
                return EnumC968700bJc.FirstFrameTimeout;
            case 2:
                return EnumC968700bJc.ByHost;
            case 3:
                return EnumC968700bJc.RtcLostConnection;
            case 4:
                return EnumC968700bJc.InviteTimeout;
            case 5:
                return EnumC968700bJc.ByModerator;
            case 6:
                return EnumC968700bJc.AnchorRtcLostConnection;
            case 7:
                return EnumC968700bJc.KickOutAllGuests;
            case 8:
                return EnumC968700bJc.ByPunish;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unmatched primitive enum value: LinkMicKickoutReason with ");
                sbLIZ.append(i);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final EnumC968740bJg LJFF(int i) {
        if (i >= EnumC968740bJg.values().length) {
            EnumC968740bJg enumC968740bJg = EnumC968740bJg.LinkmicShareRevenueNotSet;
            LIZ(enumC968740bJg);
            return enumC968740bJg;
        }
        EnumC968740bJg.Companion.getClass();
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return EnumC968740bJg.LinkmicShareRevenueClose;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unmatched primitive enum value: LinkmicShareRevenueSetting with ");
                sbLIZ.append(i);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return EnumC968740bJg.LinkmicShareRevenueOpen;
        }
        return EnumC968740bJg.LinkmicShareRevenueNotSet;
    }

    public static final EnumC968720bJe LJI(int i) {
        if (i >= EnumC968720bJe.values().length) {
            EnumC968720bJe enumC968720bJe = EnumC968720bJe.None;
            LIZ(enumC968720bJe);
            return enumC968720bJe;
        }
        EnumC968720bJe.Companion.getClass();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return EnumC968720bJe.Lineup;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unmatched primitive enum value: LinkMicAudienceUserReturnType with ");
                    sbLIZ.append(i);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
                return EnumC968720bJe.Deeplink;
            }
            return EnumC968720bJe.PrivateMsg;
        }
        return EnumC968720bJe.None;
    }
}
