package X;

import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950420aq8 {
    public static final EnumC950430aq9 LIZ(int i) {
        switch (i) {
            case 1:
                return EnumC950430aq9.IS_LINKING_TOAST;
            case 2:
                return EnumC950430aq9.INVITATION_DENIED_TOAST;
            case 3:
                return EnumC950430aq9.PERMISSION_DENIED;
            case 4:
                return EnumC950430aq9.LOW_CLIENT_VERSION;
            case 5:
                return EnumC950430aq9.ROOM_PAUSED;
            case 6:
                return EnumC950430aq9.POS_FULL;
            case 7:
                return EnumC950430aq9.MATURE_THEME_NOT_MATCH;
            default:
                return null;
        }
    }

    public static final String LIZIZ(DataChannel dataChannel, Integer num) {
        int i;
        if (num != null) {
            if (num.intValue() == 103) {
                return C497740JfY.LJIJI(2131841250);
            }
            if (num.intValue() == 108) {
                return C497740JfY.LJIJI(2131841252);
            }
            if (num.intValue() != 101 && num.intValue() != 102 && num.intValue() != 100 && num.intValue() != 106 && num.intValue() != 113) {
                if (num.intValue() == 112) {
                    return C497740JfY.LJIJI(2131851714);
                }
                if (num.intValue() == 114 || num.intValue() == 115) {
                    return C497740JfY.LJIJI(2131851713);
                }
            } else {
                return C497740JfY.LJIJI(2131841161);
            }
        }
        if (num != null) {
            if (num.intValue() != 209 && num.intValue() != 205) {
                if (num.intValue() == 105) {
                    return C497740JfY.LJIJI(2131841133);
                }
            } else {
                return C497740JfY.LJIJI(2131841139);
            }
        }
        if (num != null) {
            if (num.intValue() != 303 && num.intValue() != 401 && num.intValue() != 313) {
                if (num.intValue() == 314) {
                    return C497740JfY.LJIJI(2131841254);
                }
                if (num.intValue() == 109) {
                    return C497740JfY.LJIJI(2131841250);
                }
                if (num.intValue() == 104) {
                    return C497740JfY.LJIJI(2131841250);
                }
                if (num.intValue() == 200) {
                    return C497740JfY.LJIJI(2131841160);
                }
                if (num.intValue() != 203 && num.intValue() != 207 && num.intValue() != 208) {
                    if (num.intValue() == 310) {
                        return C497740JfY.LJIJI(2131841166);
                    }
                    if (num.intValue() == 300) {
                        return C497740JfY.LJIJI(2131841173);
                    }
                    if (num.intValue() == 204) {
                        return C497740JfY.LJIJI(2131841139);
                    }
                    if (num.intValue() != 210 && num.intValue() != 206) {
                        if (num.intValue() == 202) {
                            return C497740JfY.LJIJI(2131841167);
                        }
                        if (num.intValue() == 302) {
                            return C497740JfY.LJIJI(2131841121);
                        }
                        if (num.intValue() == 307) {
                            return C497740JfY.LJIJI(2131841156);
                        }
                        if (num.intValue() == 312) {
                            return C497740JfY.LJIJI(2131841193);
                        }
                        if (num.intValue() == 316) {
                            if (((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(dataChannel)) {
                                i = 2131856598;
                            } else {
                                i = 2131841229;
                            }
                            return C497740JfY.LJIJI(i);
                        }
                        if (num.intValue() == 305) {
                            return C497740JfY.LJIJI(2131841159);
                        }
                        if (num.intValue() == 318) {
                            return C497740JfY.LJIJI(2131842169);
                        }
                        if (num.intValue() == 320) {
                            return C497740JfY.LJIJI(2131851857);
                        }
                    } else {
                        return C497740JfY.LJIJI(2131841199);
                    }
                } else {
                    return C497740JfY.LJIJI(2131841128);
                }
            } else {
                return C497740JfY.LJIJI(2131841162);
            }
        }
        return C497740JfY.LJIJI(2131841162);
    }
}
