package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;

/* JADX INFO: renamed from: X.01Hx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C309501Hx implements InterfaceC919460a2C {
    public final MultiGuestDataHolder LIZ;
    public final C11NJ LIZIZ;

    public static void LJ(User user) {
        if (!C01HE.LIZJ()) {
            C01I3.LJ(2131843135, C0KVU.LIZ(user));
        } else {
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843476, C0KVU.LIZ(user)));
        }
    }

    public C309501Hx(MultiGuestDataHolder multiGuestDataHolder, C11NJ c11nj) {
        this.LIZ = multiGuestDataHolder;
        this.LIZIZ = c11nj;
    }

    public static boolean LIZJ(LinkPlayerInfo linkPlayerInfo, int i, boolean z) {
        String strLIZ;
        String strLIZ2;
        User user;
        String strLIZ3;
        String strLIZ4;
        User user2;
        String idStr;
        String str;
        User user3;
        User user4;
        User user5;
        boolean z2 = true;
        Object[] objArr = new Object[1];
        Integer numValueOf = null;
        if (linkPlayerInfo != null && (user5 = linkPlayerInfo.mUser) != null) {
            strLIZ = C0KVU.LIZ(user5);
        } else {
            strLIZ = null;
        }
        objArr[0] = strLIZ;
        String strLJIJJ = C497740JfY.LJIJJ(2131843477, objArr);
        if (strLJIJJ == null || !z) {
            Object[] objArr2 = new Object[1];
            if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
                strLIZ2 = C0KVU.LIZ(user);
            } else {
                strLIZ2 = null;
            }
            objArr2[0] = strLIZ2;
            strLJIJJ = C497740JfY.LJIJJ(2131843478, objArr2);
        }
        Object[] objArr3 = new Object[1];
        if (linkPlayerInfo != null && (user4 = linkPlayerInfo.mUser) != null) {
            strLIZ3 = C0KVU.LIZ(user4);
        } else {
            strLIZ3 = null;
        }
        objArr3[0] = strLIZ3;
        String strLJIJJ2 = C497740JfY.LJIJJ(2131843480, objArr3);
        if (strLJIJJ2 == null || !z) {
            Object[] objArr4 = new Object[1];
            if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
                strLIZ4 = C0KVU.LIZ(user2);
            } else {
                strLIZ4 = null;
            }
            objArr4[0] = strLIZ4;
            strLJIJJ2 = C497740JfY.LJIJJ(2131843481, objArr4);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        if (linkPlayerInfo != null && linkPlayerInfo.appVersion >= 2460) {
            z2 = false;
        } else if (i == 1) {
            C766270U4b.LJIIJJI(strLJIJJ);
        } else {
            C766270U4b.LJIIJJI(strLJIJJ2);
        }
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkMuteLimitedAndShowToast-> userid:");
        if (linkPlayerInfo != null && (user3 = linkPlayerInfo.mUser) != null) {
            idStr = user3.getIdStr();
        } else {
            idStr = null;
        }
        sbLIZ.append(idStr);
        sbLIZ.append(" , interactId:");
        if (linkPlayerInfo != null) {
            str = linkPlayerInfo.mInteractIdStr;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" , status:");
        sbLIZ.append(i);
        sbLIZ.append(" , isOpCamera:");
        sbLIZ.append(z);
        sbLIZ.append(" , appVersion:");
        if (linkPlayerInfo != null) {
            numValueOf = Integer.valueOf(linkPlayerInfo.appVersion);
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" , limited:");
        sbLIZ.append(z2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("MultiGuestModeratorMuteGuestManager", strLIZIZ);
        return z2;
    }

    @Override // X.InterfaceC919460a2C
    public final void LIZ(final Context context, final LinkPlayerInfo linkPlayerInfo, final int i) {
        String idStr;
        User user;
        final InterfaceC917530Zz5 interfaceC917530Zz5;
        long id;
        User user2;
        long id2;
        User user3;
        User user4;
        String strLIZ;
        long id3;
        User user5;
        long id4;
        User user6;
        long id5;
        User user7;
        long id6;
        User user8;
        String strLIZ2;
        long id7;
        User user9;
        long id8;
        User user10;
        User user11;
        String strLIZIZ = null;
        if (context != null && this.LIZ != null) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
            if (objLJIIIZ instanceof InterfaceC917530Zz5) {
                interfaceC917530Zz5 = (InterfaceC917530Zz5) objLJIIIZ;
            } else {
                interfaceC917530Zz5 = null;
            }
            if (i == 0) {
                Object[] objArr = new Object[1];
                if (linkPlayerInfo != null && (user11 = linkPlayerInfo.mUser) != null) {
                    strLIZ2 = C0KVU.LIZ(user11);
                } else {
                    strLIZ2 = null;
                }
                objArr[0] = strLIZ2;
                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843479, objArr));
                if (interfaceC917530Zz5 != null) {
                    if (linkPlayerInfo != null && (user10 = linkPlayerInfo.mUser) != null) {
                        id8 = user10.getId();
                    } else {
                        id8 = 0;
                    }
                    strLIZIZ = interfaceC917530Zz5.LIZIZ(id8);
                }
                C930480aJy c930480aJy = C930480aJy.LIZ;
                MultiGuestDataHolder multiGuestDataHolder = this.LIZ;
                c930480aJy.getClass();
                int iLIZ = C930480aJy.LIZ(linkPlayerInfo, multiGuestDataHolder);
                String str = C920830a4P.LJI;
                if (linkPlayerInfo != null && (user9 = linkPlayerInfo.mUser) != null) {
                    id7 = user9.getId();
                } else {
                    id7 = 0;
                }
                C922800a7a.LIZ(i, iLIZ, strLIZIZ, str, "click", true, id7);
                return;
            }
            if (LIZJ(linkPlayerInfo, i, true)) {
                return;
            }
            if (i == 1) {
                if (!InterfaceC1106030et7.i7.LIZIZ().booleanValue()) {
                    LIZLLL(context, linkPlayerInfo, 3, this.LIZIZ);
                    if (interfaceC917530Zz5 != null) {
                        if (linkPlayerInfo != null && (user8 = linkPlayerInfo.mUser) != null) {
                            id6 = user8.getId();
                        } else {
                            id6 = 0;
                        }
                        strLIZIZ = interfaceC917530Zz5.LIZIZ(id6);
                    }
                    C930480aJy c930480aJy2 = C930480aJy.LIZ;
                    MultiGuestDataHolder multiGuestDataHolder2 = this.LIZ;
                    c930480aJy2.getClass();
                    int iLIZ2 = C930480aJy.LIZ(linkPlayerInfo, multiGuestDataHolder2);
                    String str2 = C920830a4P.LJI;
                    if (linkPlayerInfo != null && (user7 = linkPlayerInfo.mUser) != null) {
                        id5 = user7.getId();
                    } else {
                        id5 = 0;
                    }
                    C922800a7a.LIZ(i, iLIZ2, strLIZIZ, str2, "panel_click", true, id5);
                    return;
                }
                if (linkPlayerInfo != null) {
                    user4 = linkPlayerInfo.mUser;
                } else {
                    user4 = null;
                }
                C782110Um9 c782110Um9 = new C782110Um9(context);
                Object[] objArr2 = new Object[1];
                if (user4 != null) {
                    strLIZ = C0KVU.LIZ(user4);
                } else {
                    strLIZ = null;
                }
                objArr2[0] = strLIZ;
                c782110Um9.LIZJ = C497740JfY.LJIJJ(2131843483, objArr2);
                c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131843482));
                c782110Um9.LJIILIIL(2131843485, new InterfaceC743640TFa() { // from class: X.01Hy
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        String strLIZIZ2;
                        User user12;
                        long id9;
                        User user13;
                        this.LIZ.getClass();
                        InterfaceC1106030et7.i7.LJFF(Boolean.FALSE);
                        liveDialog.dismiss();
                        C309501Hx c309501Hx = this.LIZ;
                        c309501Hx.LIZLLL(context, linkPlayerInfo, 3, c309501Hx.LIZIZ);
                        InterfaceC917530Zz5 interfaceC917530Zz52 = interfaceC917530Zz5;
                        long id10 = 0;
                        if (interfaceC917530Zz52 != null) {
                            LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
                            if (linkPlayerInfo2 != null && (user13 = linkPlayerInfo2.mUser) != null) {
                                id9 = user13.getId();
                            } else {
                                id9 = 0;
                            }
                            strLIZIZ2 = interfaceC917530Zz52.LIZIZ(id9);
                        } else {
                            strLIZIZ2 = null;
                        }
                        int i2 = i;
                        C930480aJy c930480aJy3 = C930480aJy.LIZ;
                        LinkPlayerInfo linkPlayerInfo3 = linkPlayerInfo;
                        MultiGuestDataHolder multiGuestDataHolder3 = this.LIZ.LIZ;
                        c930480aJy3.getClass();
                        int iLIZ3 = C930480aJy.LIZ(linkPlayerInfo3, multiGuestDataHolder3);
                        String str3 = C920830a4P.LJI;
                        LinkPlayerInfo linkPlayerInfo4 = linkPlayerInfo;
                        if (linkPlayerInfo4 != null && (user12 = linkPlayerInfo4.mUser) != null) {
                            id10 = user12.getId();
                        }
                        C922800a7a.LIZ(i2, iLIZ3, strLIZIZ2, str3, "click", true, id10);
                    }
                });
                c782110Um9.LJIIJ(2131843484, new InterfaceC743640TFa() { // from class: X.01I0
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        liveDialog.dismiss();
                    }
                });
                C786410Ut5.E4(c782110Um9.LIZ());
                if (interfaceC917530Zz5 != null) {
                    if (linkPlayerInfo != null && (user6 = linkPlayerInfo.mUser) != null) {
                        id4 = user6.getId();
                    } else {
                        id4 = 0;
                    }
                    strLIZIZ = interfaceC917530Zz5.LIZIZ(id4);
                }
                C930480aJy c930480aJy3 = C930480aJy.LIZ;
                MultiGuestDataHolder multiGuestDataHolder3 = this.LIZ;
                c930480aJy3.getClass();
                int iLIZ3 = C930480aJy.LIZ(linkPlayerInfo, multiGuestDataHolder3);
                String str3 = C920830a4P.LJI;
                if (linkPlayerInfo != null && (user5 = linkPlayerInfo.mUser) != null) {
                    id3 = user5.getId();
                } else {
                    id3 = 0;
                }
                C922800a7a.LIZ(i, iLIZ3, strLIZIZ, str3, "show", true, id3);
                return;
            }
            LIZLLL(context, linkPlayerInfo, 1, this.LIZIZ);
            if (interfaceC917530Zz5 != null) {
                if (linkPlayerInfo != null && (user3 = linkPlayerInfo.mUser) != null) {
                    id2 = user3.getId();
                } else {
                    id2 = 0;
                }
                strLIZIZ = interfaceC917530Zz5.LIZIZ(id2);
            }
            C930480aJy c930480aJy4 = C930480aJy.LIZ;
            MultiGuestDataHolder multiGuestDataHolder4 = this.LIZ;
            c930480aJy4.getClass();
            int iLIZ4 = C930480aJy.LIZ(linkPlayerInfo, multiGuestDataHolder4);
            String str4 = C920830a4P.LJI;
            if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
                id = user2.getId();
            } else {
                id = 0;
            }
            C922800a7a.LIZ(i, iLIZ4, strLIZIZ, str4, "toast_show", true, id);
            return;
        }
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("muteGuestCamera return -> userid:");
        if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
            idStr = user.getIdStr();
        } else {
            idStr = null;
        }
        sbLIZ.append(idStr);
        sbLIZ.append(" , interactId:");
        if (linkPlayerInfo != null) {
            strLIZIZ = linkPlayerInfo.mInteractIdStr;
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(" , status:");
        sbLIZ.append(i);
        sbLIZ.append(" , context:");
        sbLIZ.append(context);
        sbLIZ.append(" , dataHolder:");
        sbLIZ.append(this.LIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("MultiGuestModeratorMuteGuestManager", strLIZIZ2);
    }

    @Override // X.InterfaceC919460a2C
    public final void LIZIZ(final Context context, final LinkPlayerInfo linkPlayerInfo, final int i) {
        String idStr;
        User user;
        final InterfaceC917530Zz5 interfaceC917530Zz5;
        long id;
        User user2;
        long id2;
        User user3;
        User user4;
        String strLIZ;
        long id3;
        User user5;
        long id4;
        User user6;
        long id5;
        User user7;
        long id6;
        User user8;
        long id7;
        User user9;
        long id8;
        User user10;
        String strLIZIZ = null;
        if (context != null && this.LIZ != null) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
            if (objLJIIIZ instanceof InterfaceC917530Zz5) {
                interfaceC917530Zz5 = (InterfaceC917530Zz5) objLJIIIZ;
            } else {
                interfaceC917530Zz5 = null;
            }
            if (i == 3) {
                LIZLLL(context, linkPlayerInfo, 4, this.LIZIZ);
                if (interfaceC917530Zz5 != null) {
                    if (linkPlayerInfo != null && (user10 = linkPlayerInfo.mUser) != null) {
                        id8 = user10.getId();
                    } else {
                        id8 = 0;
                    }
                    strLIZIZ = interfaceC917530Zz5.LIZIZ(id8);
                }
                C930480aJy c930480aJy = C930480aJy.LIZ;
                MultiGuestDataHolder multiGuestDataHolder = this.LIZ;
                c930480aJy.getClass();
                int iLIZJ = C930480aJy.LIZJ(linkPlayerInfo, multiGuestDataHolder);
                String str = C920830a4P.LJI;
                if (linkPlayerInfo != null && (user9 = linkPlayerInfo.mUser) != null) {
                    id7 = user9.getId();
                } else {
                    id7 = 0;
                }
                C922800a7a.LIZ(iLIZJ, i, strLIZIZ, str, LiveCenterMockToolSwitch.PUNISH, false, id7);
                return;
            }
            if (!LIZJ(linkPlayerInfo, i, false)) {
                if (i == 1) {
                    if (!InterfaceC1106030et7.i7.LIZIZ().booleanValue()) {
                        LIZLLL(context, linkPlayerInfo, 2, this.LIZIZ);
                        if (interfaceC917530Zz5 != null) {
                            if (linkPlayerInfo != null && (user8 = linkPlayerInfo.mUser) != null) {
                                id6 = user8.getId();
                            } else {
                                id6 = 0;
                            }
                            strLIZIZ = interfaceC917530Zz5.LIZIZ(id6);
                        }
                        C930480aJy c930480aJy2 = C930480aJy.LIZ;
                        MultiGuestDataHolder multiGuestDataHolder2 = this.LIZ;
                        c930480aJy2.getClass();
                        int iLIZJ2 = C930480aJy.LIZJ(linkPlayerInfo, multiGuestDataHolder2);
                        String str2 = C920830a4P.LJI;
                        if (linkPlayerInfo != null && (user7 = linkPlayerInfo.mUser) != null) {
                            id5 = user7.getId();
                        } else {
                            id5 = 0;
                        }
                        C922800a7a.LIZ(iLIZJ2, i, strLIZIZ, str2, "panel_click", false, id5);
                        return;
                    }
                    if (linkPlayerInfo != null) {
                        user4 = linkPlayerInfo.mUser;
                    } else {
                        user4 = null;
                    }
                    C782110Um9 c782110Um9 = new C782110Um9(context);
                    Object[] objArr = new Object[1];
                    if (user4 != null) {
                        strLIZ = C0KVU.LIZ(user4);
                    } else {
                        strLIZ = null;
                    }
                    objArr[0] = strLIZ;
                    c782110Um9.LIZJ = C497740JfY.LJIJJ(2131843487, objArr);
                    c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131843486));
                    c782110Um9.LJIILIIL(2131843485, new InterfaceC743640TFa() { // from class: X.01Hz
                        @Override // X.InterfaceC743640TFa
                        public final void LIZ(LiveDialog liveDialog) {
                            String strLIZIZ2;
                            User user11;
                            long id9;
                            User user12;
                            liveDialog.dismiss();
                            this.LIZ.getClass();
                            InterfaceC1106030et7.i7.LJFF(Boolean.FALSE);
                            C309501Hx c309501Hx = this.LIZ;
                            c309501Hx.LIZLLL(context, linkPlayerInfo, 2, c309501Hx.LIZIZ);
                            InterfaceC917530Zz5 interfaceC917530Zz52 = interfaceC917530Zz5;
                            long id10 = 0;
                            if (interfaceC917530Zz52 != null) {
                                LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
                                if (linkPlayerInfo2 != null && (user12 = linkPlayerInfo2.mUser) != null) {
                                    id9 = user12.getId();
                                } else {
                                    id9 = 0;
                                }
                                strLIZIZ2 = interfaceC917530Zz52.LIZIZ(id9);
                            } else {
                                strLIZIZ2 = null;
                            }
                            C930480aJy c930480aJy3 = C930480aJy.LIZ;
                            LinkPlayerInfo linkPlayerInfo3 = linkPlayerInfo;
                            MultiGuestDataHolder multiGuestDataHolder3 = this.LIZ.LIZ;
                            c930480aJy3.getClass();
                            int iLIZJ3 = C930480aJy.LIZJ(linkPlayerInfo3, multiGuestDataHolder3);
                            int i2 = i;
                            String str3 = C920830a4P.LJI;
                            LinkPlayerInfo linkPlayerInfo4 = linkPlayerInfo;
                            if (linkPlayerInfo4 != null && (user11 = linkPlayerInfo4.mUser) != null) {
                                id10 = user11.getId();
                            }
                            C922800a7a.LIZ(iLIZJ3, i2, strLIZIZ2, str3, "click", false, id10);
                        }
                    });
                    c782110Um9.LJIIJ(2131843484, new InterfaceC743640TFa() { // from class: X.01I1
                        @Override // X.InterfaceC743640TFa
                        public final void LIZ(LiveDialog liveDialog) {
                            liveDialog.dismiss();
                        }
                    });
                    C786410Ut5.E4(c782110Um9.LIZ());
                    if (interfaceC917530Zz5 != null) {
                        if (linkPlayerInfo != null && (user6 = linkPlayerInfo.mUser) != null) {
                            id4 = user6.getId();
                        } else {
                            id4 = 0;
                        }
                        strLIZIZ = interfaceC917530Zz5.LIZIZ(id4);
                    }
                    C930480aJy c930480aJy3 = C930480aJy.LIZ;
                    MultiGuestDataHolder multiGuestDataHolder3 = this.LIZ;
                    c930480aJy3.getClass();
                    int iLIZJ3 = C930480aJy.LIZJ(linkPlayerInfo, multiGuestDataHolder3);
                    String str3 = C920830a4P.LJI;
                    if (linkPlayerInfo != null && (user5 = linkPlayerInfo.mUser) != null) {
                        id3 = user5.getId();
                    } else {
                        id3 = 0;
                    }
                    C922800a7a.LIZ(iLIZJ3, i, strLIZIZ, str3, "show", false, id3);
                    return;
                }
                LIZLLL(context, linkPlayerInfo, 0, this.LIZIZ);
                if (interfaceC917530Zz5 != null) {
                    if (linkPlayerInfo != null && (user3 = linkPlayerInfo.mUser) != null) {
                        id2 = user3.getId();
                    } else {
                        id2 = 0;
                    }
                    strLIZIZ = interfaceC917530Zz5.LIZIZ(id2);
                }
                C930480aJy c930480aJy4 = C930480aJy.LIZ;
                MultiGuestDataHolder multiGuestDataHolder4 = this.LIZ;
                c930480aJy4.getClass();
                int iLIZJ4 = C930480aJy.LIZJ(linkPlayerInfo, multiGuestDataHolder4);
                String str4 = C920830a4P.LJI;
                if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
                    id = user2.getId();
                } else {
                    id = 0;
                }
                C922800a7a.LIZ(iLIZJ4, i, strLIZIZ, str4, "toast_show", false, id);
                return;
            }
            return;
        }
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("muteGuestMicrophone return -> userid:");
        if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
            idStr = user.getIdStr();
        } else {
            idStr = null;
        }
        sbLIZ.append(idStr);
        sbLIZ.append(" , interactId:");
        if (linkPlayerInfo != null) {
            strLIZIZ = linkPlayerInfo.mInteractIdStr;
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(" , status:");
        sbLIZ.append(i);
        sbLIZ.append(" , context:");
        sbLIZ.append(context);
        sbLIZ.append(" , dataHolder:");
        sbLIZ.append(this.LIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("MultiGuestModeratorMuteGuestManager", strLIZIZ2);
    }

    public final void LIZLLL(final Context context, final LinkPlayerInfo linkPlayerInfo, final int i, C11NJ c11nj) {
        String idStr;
        String str;
        Integer numValueOf;
        long id;
        User user;
        User user2;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realModeratorMuteGuestOp-> userid:");
        Long lValueOf = null;
        if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
            idStr = user2.getIdStr();
        } else {
            idStr = null;
        }
        sbLIZ.append(idStr);
        sbLIZ.append(" , interactId:");
        if (linkPlayerInfo != null) {
            str = linkPlayerInfo.mInteractIdStr;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" , appVersion:");
        if (linkPlayerInfo != null) {
            numValueOf = Integer.valueOf(linkPlayerInfo.appVersion);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("MultiGuestModeratorMuteGuestManager", strLIZIZ);
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C927600aFK c927600aFKLIZ = C307001Gy.LIZ();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        C930480aJy.LIZ.getClass();
        long jLJIIIZ = C930480aJy.LJIIIZ();
        long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
        if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
            lValueOf = Long.valueOf(user.getId());
        }
        C927640aFO c927640aFO = new C927640aFO(id, jLJIIIZ, jLJIILL, lValueOf, i, null, Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
        c927600aFKLIZ.getClass();
        C19487311Lz.LIZIZ(C927600aFK.LIZIZ(c927640aFO), c11nj, new C09JN() { // from class: X.01Hp
            @Override // X.C09JN
            public final void accept(Object obj) {
                Integer numValueOf2;
                String str2;
                RequestError requestError;
                RequestError requestError2;
                boolean z;
                User user3;
                User user4;
                User user5;
                User user6;
                User user7;
                User user8;
                int i2;
                GuestMicCameraManageResponse.ResponseData responseData;
                C1C7U.LIZ("MultiGuestModeratorMuteGuestManager@34bb.realModeratorMuteGuestOp$1");
                C470590Icr c470590Icr = (C470590Icr) obj;
                C930480aJy.LIZ.getClass();
                T t = (T) null;
                if (C930480aJy.LJJIFFI(c470590Icr)) {
                    if (c470590Icr != null && (responseData = (GuestMicCameraManageResponse.ResponseData) c470590Icr.data) != null && responseData.ratelimit) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i3 = (int) ((GuestMicCameraManageResponse.ResponseData) c470590Icr.data).expirationTime;
                        LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
                        if (linkPlayerInfo2 != null) {
                            user8 = linkPlayerInfo2.mUser;
                        } else {
                            user8 = null;
                        }
                        if (i == 1) {
                            i2 = 2131755577;
                        } else {
                            i2 = 2131755578;
                        }
                        C766270U4b.LJIIJJI(C497740JfY.LJIIL(i2, i3, C0KVU.LIZ(user8), String.valueOf(i3)));
                    } else {
                        int i4 = i;
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 == 3) {
                                        LinkPlayerInfo linkPlayerInfo3 = linkPlayerInfo;
                                        if (linkPlayerInfo3 != null) {
                                            user7 = linkPlayerInfo3.mUser;
                                        } else {
                                            user7 = null;
                                        }
                                        if (!C01HE.LIZJ()) {
                                            C01I3.LJ(2131843131, C0KVU.LIZ(user7));
                                        } else {
                                            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843475, C0KVU.LIZ(user7)));
                                        }
                                    }
                                } else if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow()) {
                                    LinkPlayerInfo linkPlayerInfo4 = linkPlayerInfo;
                                    if (linkPlayerInfo4 != null) {
                                        user6 = linkPlayerInfo4.mUser;
                                    } else {
                                        user6 = null;
                                    }
                                    this.getClass();
                                    C309501Hx.LJ(user6);
                                } else {
                                    LinkPlayerInfo linkPlayerInfo5 = linkPlayerInfo;
                                    if (linkPlayerInfo5 != null) {
                                        user5 = linkPlayerInfo5.mUser;
                                    } else {
                                        user5 = null;
                                    }
                                    this.getClass();
                                    C309501Hx.LJ(user5);
                                }
                            } else {
                                LinkPlayerInfo linkPlayerInfo6 = linkPlayerInfo;
                                if (linkPlayerInfo6 != null) {
                                    user4 = linkPlayerInfo6.mUser;
                                } else {
                                    user4 = null;
                                }
                                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843534, C0KVU.LIZ(user4)));
                            }
                        } else {
                            LinkPlayerInfo linkPlayerInfo7 = linkPlayerInfo;
                            if (linkPlayerInfo7 != null) {
                                user3 = linkPlayerInfo7.mUser;
                            } else {
                                user3 = null;
                            }
                            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843535, C0KVU.LIZ(user3)));
                        }
                    }
                    C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("realModeratorMuteGuestOp-> success data ");
                    if (c470590Icr != null) {
                        t = c470590Icr.data;
                    }
                    sbLIZ2.append(t);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c1143300frELJIIJJI2.getClass();
                    AbstractC1143290frD.LJI("MultiGuestModeratorMuteGuestManager", strLIZIZ2);
                } else {
                    C1143300frE c1143300frELJIIJJI3 = C1143300frE.LJIIJJI();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("realModeratorMuteGuestOp-> failed: code = ");
                    if (c470590Icr != null) {
                        numValueOf2 = Integer.valueOf(c470590Icr.statusCode);
                    } else {
                        numValueOf2 = null;
                    }
                    sbLIZ3.append(numValueOf2);
                    sbLIZ3.append(",msg=");
                    if (c470590Icr != null && (requestError2 = c470590Icr.LJ) != null) {
                        str2 = requestError2.message;
                    } else {
                        str2 = null;
                    }
                    sbLIZ3.append(str2);
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                    c1143300frELJIIJJI3.getClass();
                    AbstractC1143290frD.LJI("MultiGuestModeratorMuteGuestManager", strLIZIZ3);
                    Context context2 = context;
                    if (c470590Icr != null && (requestError = c470590Icr.LJ) != null) {
                        t = (T) new Throwable(requestError.message);
                    }
                    C501540Jlg.LIZJ(context2, t);
                }
                C1C7U.LIZIZ("MultiGuestModeratorMuteGuestManager@34bb.realModeratorMuteGuestOp$1");
            }
        }, new C515801zg(linkPlayerInfo, context, 66), null, null, 56);
    }
}
