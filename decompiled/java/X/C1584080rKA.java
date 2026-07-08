package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.model.FriendsRedDotUser;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility;
import com.ss.android.ugc.aweme.friendstab.ui.tab.IFriendsV3PageAbility;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;

/* JADX INFO: renamed from: X.0rKA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584080rKA extends AbstractViewOnClickListenerC1584070rK9 {
    public final Context LL;

    public C1584080rKA(Context context) {
        this.LL = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UserNewContent userNewContent;
        boolean z;
        long jNh0;
        String str;
        String itemId;
        Boolean boolValueOf;
        String str2;
        IFriendsV3RefreshAbility iFriendsV3RefreshAbility;
        FriendsRedDotUser user;
        IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJIIJ;
        String str3;
        String itemId2;
        Boolean boolValueOf2;
        FriendsRedDotUser user2;
        C1587210rPD c1587210rPDPm0;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL);
        if (c19egLIZIZ != null) {
            IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJIIJ2 = C1583510rJF.LJIIJ(this.LL);
            if (iBottomFriendsTabAvatarAbilityLJIIJ2 != null) {
                iBottomFriendsTabAvatarAbilityLJIIJ2.w20();
            }
            String strCQ2 = C343710Ddh.LIZ(c19egLIZIZ).CQ2();
            if (strCQ2 == null) {
                strCQ2 = "";
            }
            C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
            c1589640rT8.I2(strCQ2);
            IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJIIJ3 = C1583510rJF.LJIIJ(this.LL);
            C1581400rFq c1581400rFq = null;
            c1581400rFq = null;
            String str4 = null;
            if (iBottomFriendsTabAvatarAbilityLJIIJ3 != null && (c1587210rPDPm0 = iBottomFriendsTabAvatarAbilityLJIIJ3.pm0()) != null) {
                userNewContent = c1587210rPDPm0.LIZIZ;
            } else {
                userNewContent = null;
            }
            Fragment fragmentVu = C1599640rjG.LIZIZ.Vu();
            if (fragmentVu == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("firstEnter, Avatar:[");
                if (userNewContent != null && (user2 = userNewContent.getUser()) != null) {
                    str3 = user2.uid;
                } else {
                    str3 = null;
                }
                sbLIZ.append(str3);
                sbLIZ.append('-');
                if (userNewContent != null) {
                    itemId2 = userNewContent.getItemId();
                } else {
                    itemId2 = null;
                }
                sbLIZ.append(itemId2);
                sbLIZ.append("](Story:");
                if (userNewContent != null) {
                    boolValueOf2 = Boolean.valueOf(userNewContent.isStory());
                } else {
                    boolValueOf2 = null;
                }
                sbLIZ.append(boolValueOf2);
                sbLIZ.append(')');
                C0W17.LIZJ("bottomClick", C2188811AlT.LIZIZ(sbLIZ));
                if (C1206704np.LIZ()) {
                    FriendsV3FeedRepository.LIZ.getClass();
                    FriendsV3FeedRepository.LJI();
                }
                if (C1206104nj.LIZ()) {
                    C614770O9j.LIZIZ.LIZ().LJII();
                }
                if (userNewContent != null && (!userNewContent.isStory() || C100800Zq.LIZ())) {
                    FriendsRedDotUser user3 = userNewContent.getUser();
                    if (user3 != null) {
                        str4 = user3.uid;
                    }
                    c1581400rFq = new C1581400rFq(str4, userNewContent.getItemId());
                }
                LIZ(this, c19egLIZIZ, c1581400rFq, 2);
                return;
            }
            if (C1595430rcT.LIZIZ.LIZIZ().redDotLogic().LJIJI("FRIENDS_TAB") > 0 || ((iBottomFriendsTabAvatarAbilityLJIIJ = C1583510rJF.LJIIJ(this.LL)) != null && iBottomFriendsTabAvatarAbilityLJIIJ.isShowing())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("reEnterByRedDot, Avatar:[");
                if (userNewContent != null && (user = userNewContent.getUser()) != null) {
                    str = user.uid;
                } else {
                    str = null;
                }
                sbLIZ2.append(str);
                sbLIZ2.append('-');
                if (userNewContent != null) {
                    itemId = userNewContent.getItemId();
                } else {
                    itemId = null;
                }
                sbLIZ2.append(itemId);
                sbLIZ2.append("](Story:");
                if (userNewContent != null) {
                    boolValueOf = Boolean.valueOf(userNewContent.isStory());
                } else {
                    boolValueOf = null;
                }
                sbLIZ2.append(boolValueOf);
                sbLIZ2.append(')');
                C0W17.LIZJ("bottomClick", C2188811AlT.LIZIZ(sbLIZ2));
                if (userNewContent != null) {
                    if (userNewContent.isStory()) {
                        InsertStory insertStoryLJII = C1386160mAw.LJII(userNewContent);
                        if (insertStoryLJII != null) {
                            c1589640rT8.m2();
                            c1589640rT8.j3(true);
                            if (((Number) C278360Ava.LIZ.getValue()).intValue() == 1) {
                                c1589640rT8.X1();
                            }
                            IFriendsV3RefreshAbility iFriendsV3RefreshAbility2 = (IFriendsV3RefreshAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), IFriendsV3RefreshAbility.class, null);
                            if (iFriendsV3RefreshAbility2 != null) {
                                iFriendsV3RefreshAbility2.lv1(4, false, insertStoryLJII, null, 0);
                            }
                        } else if (((Number) C0AI8.LIZ.getValue()).intValue() == 1 && (iFriendsV3RefreshAbility = (IFriendsV3RefreshAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), IFriendsV3RefreshAbility.class, null)) != null) {
                            iFriendsV3RefreshAbility.lv1(4, false, null, null, 0);
                        }
                        LIZ(this, c19egLIZIZ, null, 6);
                        return;
                    }
                    if (C296390BjZ.LIZ()) {
                        IFriendsV3RefreshAbility iFriendsV3RefreshAbility3 = (IFriendsV3RefreshAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), IFriendsV3RefreshAbility.class, null);
                        if (iFriendsV3RefreshAbility3 != null) {
                            FriendsRedDotUser user4 = userNewContent.getUser();
                            if (user4 != null) {
                                str2 = user4.uid;
                            } else {
                                str2 = null;
                            }
                            iFriendsV3RefreshAbility3.lv1(4, false, null, new C1581400rFq(str2, userNewContent.getItemId()), 1);
                        }
                    } else {
                        IFriendsV3RefreshAbility iFriendsV3RefreshAbility4 = (IFriendsV3RefreshAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), IFriendsV3RefreshAbility.class, null);
                        if (iFriendsV3RefreshAbility4 != null) {
                            iFriendsV3RefreshAbility4.lv1(4, false, null, null, 0);
                        }
                    }
                    LIZ(this, c19egLIZIZ, null, 6);
                    return;
                }
                if (C296450Bjf.LIZ()) {
                    IFriendsV3RefreshAbility iFriendsV3RefreshAbility5 = (IFriendsV3RefreshAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), IFriendsV3RefreshAbility.class, null);
                    if (iFriendsV3RefreshAbility5 != null) {
                        iFriendsV3RefreshAbility5.lv1(4, false, null, null, 2);
                    }
                } else {
                    IFriendsV3RefreshAbility iFriendsV3RefreshAbility6 = (IFriendsV3RefreshAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), IFriendsV3RefreshAbility.class, null);
                    if (iFriendsV3RefreshAbility6 != null) {
                        iFriendsV3RefreshAbility6.lv1(4, false, null, null, 0);
                    }
                }
                LIZ(this, c19egLIZIZ, null, 6);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            IFriendsV3PageAbility iFriendsV3PageAbility = (IFriendsV3PageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), IFriendsV3PageAbility.class, null);
            if (iFriendsV3PageAbility != null) {
                jNh0 = iFriendsV3PageAbility.Nh0();
            } else {
                jNh0 = 0;
            }
            if (jCurrentTimeMillis - jNh0 > ((Number) C278490Avn.LIZ.getValue()).intValue() * 60 * LSPassThroughRecordSizeConfig.DEFAULT) {
                C0W17.LIZJ("bottomClick", "reEnterByRevisit");
                if (C296450Bjf.LIZ()) {
                    IFriendsV3RefreshAbility iFriendsV3RefreshAbility7 = (IFriendsV3RefreshAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), IFriendsV3RefreshAbility.class, null);
                    if (iFriendsV3RefreshAbility7 != null) {
                        iFriendsV3RefreshAbility7.lv1(6, false, null, null, 2);
                    }
                } else {
                    IFriendsV3RefreshAbility iFriendsV3RefreshAbility8 = (IFriendsV3RefreshAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), IFriendsV3RefreshAbility.class, null);
                    if (iFriendsV3RefreshAbility8 != null) {
                        iFriendsV3RefreshAbility8.lv1(6, false, null, null, 0);
                    }
                }
                LIZ(this, c19egLIZIZ, null, 6);
                return;
            }
            LIZ(this, c19egLIZIZ, null, 6);
        }
    }

    public static void LIZ(C1584080rKA c1584080rKA, C19EG c19eg, C1581400rFq c1581400rFq, int i) {
        String str;
        String str2;
        String str3 = null;
        if ((i & 2) != 0) {
            str = "click_bottom";
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            c1581400rFq = null;
        }
        c1584080rKA.getClass();
        Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19eg);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_method", str, bundle);
        if (c1581400rFq != null) {
            str2 = c1581400rFq.LIZ;
        } else {
            str2 = null;
        }
        C786410Ut5.LJJJI("landing_red_uid", str2, bundle);
        if (c1581400rFq != null) {
            str3 = c1581400rFq.LIZIZ;
        }
        C786410Ut5.LJJJI("landing_red_item_id", str3, bundle);
        hoxLIZ.TQ2(bundle, "FRIENDS_TAB", false);
    }
}
