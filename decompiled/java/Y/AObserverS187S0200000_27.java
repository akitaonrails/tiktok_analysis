package Y;

import X.AbstractC1143290frD;
import X.AbstractC21342018fa;
import X.C0IJT;
import X.C1105900esu;
import X.C1117370fBP;
import X.C1143300frE;
import X.C1390920mIc;
import X.C13BV;
import X.C13LP;
import X.C1402840mbq;
import X.C15438062q;
import X.C1599690rjL;
import X.C1790730whT;
import X.C1804170x39;
import X.C1804840x4E;
import X.C1809720xC6;
import X.C1809760xCA;
import X.C1810160xCo;
import X.C1810410xDD;
import X.C1810690xDf;
import X.C1850540yFw;
import X.C197039127h;
import X.C19719512Dh;
import X.C1B4F;
import X.C20684815ws;
import X.C21342318fd;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C259800zU;
import X.C474500IjA;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C866950Xzh;
import X.C960203pA;
import X.DialogInterfaceOnCancelListenerC1864700ycm;
import X.DialogInterfaceOnDismissListenerC1864750ycr;
import X.EnumC1808150x9Z;
import X.EnumC1850560yFy;
import X.InterfaceC1810050xCd;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import com.ss.android.ugc.aweme.share.SystemShareActivityViewModel;
import com.ss.android.ugc.aweme.share.linkshare.LinkShareEntryFragment;
import com.ss.android.ugc.aweme.share.linkshare.model.LinkShareIntentModel;
import com.ss.android.ugc.aweme.share.systemshare.SystemShareEntryFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.ranklist.RankExtraInfo;

/* JADX INFO: loaded from: classes28.dex */
public class AObserverS187S0200000_27 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
        }
    }

    public AObserverS187S0200000_27(MutableLiveData mutableLiveData, int i) {
        this.$t = i;
        this.l0 = new Observer() { // from class: X.0xsH
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String str;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "activity_center_setting");
                if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
                    str = "on";
                } else {
                    str = "off";
                }
                c2344009Gk.LJIIIIZZ("biometric_unlock_status", str);
                c2344009Gk.LJIIIIZZ("biometric_type", "fingerprint");
                C20684815ws.LJIILLIIL("enter_activity_center_setting", c2344009Gk.LIZ);
            }
        };
        this.l1 = mutableLiveData;
    }

    public static final void onChanged$0(AObserverS187S0200000_27 aObserverS187S0200000_27, Object obj) {
        String str;
        boolean z;
        C1804170x39 value;
        Diamond diamond = (Diamond) obj;
        RechargeDialogNew rechargeDialogNew = (RechargeDialogNew) aObserverS187S0200000_27.l0;
        C1804840x4E c1804840x4E = (C1804840x4E) aObserverS187S0200000_27.l1;
        LiveData<C1804170x39> liveDataZQ0 = rechargeDialogNew.qS().ZQ0();
        if (liveDataZQ0 == null || (value = liveDataZQ0.getValue()) == null || (str = value.LIZJ) == null) {
            str = "google_play";
        }
        String strLJFF = c1804840x4E.LJFF(diamond, str);
        if (strLJFF.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C197039127h c197039127hWR = rechargeDialogNew.WR();
            if (c197039127hWR != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(rechargeDialogNew.getString(2131856768));
                sbLIZ.append(' ');
                sbLIZ.append(strLJFF);
                c197039127hWR.setText(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        C197039127h c197039127hWR2 = rechargeDialogNew.WR();
        if (c197039127hWR2 == null) {
            return;
        }
        c197039127hWR2.setText(rechargeDialogNew.getString(2131856768));
    }

    public static final void onChanged$1(AObserverS187S0200000_27 aObserverS187S0200000_27, Object obj) {
        List<?> list;
        String str;
        RankListV2Response.RankView rankView;
        RankListV2Response.RankInfo rankInfo;
        RankListV2Response.WeeklyRookieRankExtra weeklyRookieRankExtra;
        RankListV2Response.RankInfo rankInfo2;
        RankListV2Response.Gap gap;
        RankListV2Response.BottomBarFAQ bottomBarFAQ;
        RankListV2Response.RankInfo rankInfo3;
        RankListV2Response.Gap gap2;
        RankListV2Response.BottomBarButton bottomBarButton;
        String str2;
        RankListV2Response.RankInfo rankInfo4;
        RankListV2Response.Gap gap3;
        String str3;
        Boolean boolValueOf;
        RankListViewModel rankListViewModelLJIIIZ;
        RankListV2Response.RankView rankView2;
        RankListV2Response.RankInfo rankInfo5;
        RankListV2Response.Gap gap4;
        int i;
        Long lValueOf;
        RankListV2Response.RankInfo rankInfo6;
        RankListV2Response.Gap gap5;
        RankListV2Response.GapExtra gapExtra;
        RankListV2Response.GapClassRankExtra gapClassRankExtra;
        RankListV2Response.ClassTitle classTitle;
        RankExtraInfo rankExtraInfo;
        RankListV2Response.ClassExtra classExtra;
        RankListV2Response.RankInfo rankInfo7;
        RankListV2Response.Gap gap6;
        RankListV2Response.BottomBarButton bottomBarButton2;
        RankListV2Response.RankInfo rankInfo8;
        RankListV2Response.RankView rankView3;
        final List<?> list2 = (List) obj;
        boolean zFn = ((RankListFragment) aObserverS187S0200000_27.l0).Fn();
        String str4 = "";
        if (zFn && (rankView3 = ((RankListController) aObserverS187S0200000_27.l1).LJIIIZ().LLILLJJLI) != null) {
            RankListController rankListController = (RankListController) aObserverS187S0200000_27.l1;
            RankListFragment rankListFragment = (RankListFragment) aObserverS187S0200000_27.l0;
            rankListController.LJ().LLIZ.postValue(new C1810160xCo(rankListFragment.LLILLL, rankView3.history));
            MutableLiveData<C1790730whT> mutableLiveData = rankListController.LJ().LLJI;
            C1810410xDD c1810410xDD = rankListFragment.LLILLL;
            String str5 = rankView3.ruleUrl;
            if (str5 == null) {
                str5 = "";
            }
            mutableLiveData.postValue(new C1790730whT(c1810410xDD, str5));
        }
        C1117370fBP c1117370fBP = ((RankListFragment) aObserverS187S0200000_27.l0).LLJ;
        RankListV2Response.RankView rankView4 = null;
        if (c1117370fBP != null) {
            list = c1117370fBP.LL;
            c1117370fBP.LLLI(list2);
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            if (list2 != null) {
                final List listLIZIZ = C19719512Dh.LIZIZ(list);
                try {
                    C21342318fd.LIZ(new AbstractC21342018fa(listLIZIZ, list2) { // from class: X.0xC8
                        public final List<AbstractC1809750xC9> LIZ;
                        public final List<AbstractC1809750xC9> LIZIZ;

                        @Override // X.AbstractC21342018fa
                        public final int LIZLLL() {
                            return this.LIZIZ.size();
                        }

                        @Override // X.AbstractC21342018fa
                        public final int LJ() {
                            return this.LIZ.size();
                        }

                        {
                            this.LIZ = listLIZIZ;
                            this.LIZIZ = list2;
                        }

                        public static boolean LJFF(RankListV2Response.RankInfo rankInfo9, RankListV2Response.RankInfo rankInfo10) {
                            String str6;
                            String str7;
                            Long lValueOf2;
                            Long lValueOf3;
                            Integer numValueOf;
                            Integer numValueOf2;
                            RankListV2Response.RankLabel rankLabel;
                            RankListV2Response.RankLabel rankLabel2;
                            Integer numValueOf3;
                            Integer numValueOf4;
                            String str8;
                            String str9;
                            if (rankInfo9.rank != rankInfo10.rank || !Intrinsics.LJFF(C0KVU.LIZ(rankInfo9.user), C0KVU.LIZ(rankInfo10.user)) || !Intrinsics.LJFF(rankInfo9.scoreDescription, rankInfo10.scoreDescription) || !LJI(rankInfo9, rankInfo10)) {
                                return false;
                            }
                            RankListV2Response.TeamRankExtra teamRankExtra = rankInfo9.teamRankExtra;
                            if (teamRankExtra != null) {
                                str6 = teamRankExtra.clubName;
                            } else {
                                str6 = null;
                            }
                            RankListV2Response.TeamRankExtra teamRankExtra2 = rankInfo10.teamRankExtra;
                            if (teamRankExtra2 != null) {
                                str7 = teamRankExtra2.clubName;
                            } else {
                                str7 = null;
                            }
                            if (!Intrinsics.LJFF(str6, str7)) {
                                return false;
                            }
                            RankListV2Response.TeamRankExtra teamRankExtra3 = rankInfo9.teamRankExtra;
                            if (teamRankExtra3 != null) {
                                lValueOf2 = Long.valueOf(teamRankExtra3.contributorNum);
                            } else {
                                lValueOf2 = null;
                            }
                            RankListV2Response.TeamRankExtra teamRankExtra4 = rankInfo10.teamRankExtra;
                            if (teamRankExtra4 != null) {
                                lValueOf3 = Long.valueOf(teamRankExtra4.contributorNum);
                            } else {
                                lValueOf3 = null;
                            }
                            if (!Intrinsics.LJFF(lValueOf2, lValueOf3)) {
                                return false;
                            }
                            List<RankListV2Response.RankLabel> list3 = rankInfo9.labels;
                            if (list3 != null) {
                                numValueOf = Integer.valueOf(list3.size());
                            } else {
                                numValueOf = null;
                            }
                            List<RankListV2Response.RankLabel> list4 = rankInfo10.labels;
                            if (list4 != null) {
                                numValueOf2 = Integer.valueOf(list4.size());
                            } else {
                                numValueOf2 = null;
                            }
                            if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
                                return false;
                            }
                            List<RankListV2Response.RankLabel> list5 = rankInfo9.labels;
                            if (list5 != null) {
                                int size = list5.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    List<RankListV2Response.RankLabel> list6 = rankInfo9.labels;
                                    if (list6 != null) {
                                        rankLabel = (RankListV2Response.RankLabel) ListProtector.get(list6, i2);
                                    } else {
                                        rankLabel = null;
                                    }
                                    List<RankListV2Response.RankLabel> list7 = rankInfo10.labels;
                                    if (list7 != null) {
                                        rankLabel2 = (RankListV2Response.RankLabel) ListProtector.get(list7, i2);
                                    } else {
                                        rankLabel2 = null;
                                    }
                                    if (rankLabel != null) {
                                        numValueOf3 = Integer.valueOf(rankLabel.type);
                                    } else {
                                        numValueOf3 = null;
                                    }
                                    if (rankLabel2 != null) {
                                        numValueOf4 = Integer.valueOf(rankLabel2.type);
                                    } else {
                                        numValueOf4 = null;
                                    }
                                    if (!Intrinsics.LJFF(numValueOf3, numValueOf4)) {
                                        return false;
                                    }
                                    if (rankLabel != null) {
                                        str8 = rankLabel.tipText;
                                    } else {
                                        str8 = null;
                                    }
                                    if (rankLabel2 != null) {
                                        str9 = rankLabel2.tipText;
                                    } else {
                                        str9 = null;
                                    }
                                    if (!Intrinsics.LJFF(str8, str9)) {
                                        return false;
                                    }
                                }
                            }
                            return true;
                        }

                        public static boolean LJI(RankListV2Response.RankInfo rankInfo9, RankListV2Response.RankInfo rankInfo10) {
                            String uri;
                            ImageModel avatarThumb;
                            ImageModel avatarThumb2;
                            User user = rankInfo9.user;
                            String uri2 = null;
                            if (user != null && (avatarThumb2 = user.getAvatarThumb()) != null) {
                                uri = avatarThumb2.getUri();
                            } else {
                                uri = null;
                            }
                            User user2 = rankInfo10.user;
                            if (user2 != null && (avatarThumb = user2.getAvatarThumb()) != null) {
                                uri2 = avatarThumb.getUri();
                            }
                            if (Intrinsics.LJFF(uri, uri2) && rankInfo9.roomId == rankInfo10.roomId) {
                                return true;
                            }
                            return false;
                        }

                        @Override // X.AbstractC21342018fa
                        public final boolean LIZ(int i2, int i3) {
                            Object objLIZ = ((AbstractC1809750xC9) ListProtector.get(this.LIZ, i2)).LIZ();
                            Object objLIZ2 = ((AbstractC1809750xC9) ListProtector.get(this.LIZIZ, i3)).LIZ();
                            if ((objLIZ instanceof RankListV2Response.RankInfo) && (objLIZ2 instanceof RankListV2Response.RankInfo)) {
                                return LJFF((RankListV2Response.RankInfo) objLIZ, (RankListV2Response.RankInfo) objLIZ2);
                            }
                            if ((objLIZ instanceof List) && (objLIZ2 instanceof List)) {
                                List list3 = (List) objLIZ;
                                List list4 = (List) objLIZ2;
                                if (list3.size() == list4.size() && list3.size() > 0) {
                                    int size = list3.size();
                                    boolean z = true;
                                    for (int i4 = 0; i4 < size; i4++) {
                                        if (z && (ListProtector.get(list3, i4) instanceof RankListV2Response.RankInfo) && (ListProtector.get(list4, i4) instanceof RankListV2Response.RankInfo) && LJFF((RankListV2Response.RankInfo) ListProtector.get(list3, i4), (RankListV2Response.RankInfo) ListProtector.get(list4, i4))) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    }
                                    return z;
                                }
                                if (list3.size() == list4.size() && list3.size() == 0) {
                                    return true;
                                }
                                return false;
                            }
                            return true;
                        }

                        @Override // X.AbstractC21342018fa
                        public final boolean LIZIZ(int i2, int i3) {
                            if (i2 == i3 && Intrinsics.LJFF(ListProtector.get(this.LIZ, i2).getClass(), ListProtector.get(this.LIZIZ, i3).getClass())) {
                                return true;
                            }
                            return false;
                        }

                        @Override // X.AbstractC21342018fa
                        public final Object LIZJ(int i2, int i3) {
                            Object objLIZ = ((AbstractC1809750xC9) ListProtector.get(this.LIZ, i2)).LIZ();
                            Object objLIZ2 = ((AbstractC1809750xC9) ListProtector.get(this.LIZIZ, i3)).LIZ();
                            if ((objLIZ instanceof RankListV2Response.RankInfo) && (objLIZ2 instanceof RankListV2Response.RankInfo) && LJI((RankListV2Response.RankInfo) objLIZ, (RankListV2Response.RankInfo) objLIZ2)) {
                                return "ket_not_change_avatar";
                            }
                            if ((objLIZ instanceof List) && (objLIZ2 instanceof List)) {
                                List list3 = (List) objLIZ;
                                List list4 = (List) objLIZ2;
                                if (list3.size() == list4.size() && list3.size() > 0) {
                                    int size = list3.size();
                                    boolean z = true;
                                    for (int i4 = 0; i4 < size; i4++) {
                                        if (z && (ListProtector.get(list3, i4) instanceof RankListV2Response.RankInfo) && (ListProtector.get(list4, i4) instanceof RankListV2Response.RankInfo) && LJI((RankListV2Response.RankInfo) ListProtector.get(list3, i4), (RankListV2Response.RankInfo) ListProtector.get(list4, i4))) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        return "ket_not_change_avatar";
                                    }
                                    return null;
                                }
                                return null;
                            }
                            return null;
                        }
                    }, true).LIZJ(((RankListFragment) aObserverS187S0200000_27.l0).LLJ);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                    StackTraceElement[] stackTrace = e.getStackTrace();
                    c1143300frELJIIJJI.getClass();
                    AbstractC1143290frD.LJIIJ(stackTrace, 6);
                }
            }
        } else {
            C1117370fBP c1117370fBP2 = ((RankListFragment) aObserverS187S0200000_27.l0).LLJ;
            if (c1117370fBP2 != null) {
                c1117370fBP2.LLLI(list2);
            }
            C1117370fBP c1117370fBP3 = ((RankListFragment) aObserverS187S0200000_27.l0).LLJ;
            if (c1117370fBP3 != null) {
                c1117370fBP3.notifyDataSetChanged();
            }
        }
        if (((RankListController) aObserverS187S0200000_27.l1).LJIIIZ().LLILLJJLI != null) {
            RankListV2Response.RankView rankView5 = ((RankListController) aObserverS187S0200000_27.l1).LJIIIZ().LLILLJJLI;
            if (rankView5 != null && (rankInfo8 = rankView5.ownerRank) != null && rankInfo8.LIZ) {
                return;
            }
            C1809760xCA c1809760xCA = ((RankListFragment) aObserverS187S0200000_27.l0).LLJJIJIIJIL;
            if (!c1809760xCA.LIZIZ) {
                return;
            }
            c1809760xCA.LIZ = true;
            c1809760xCA.LIZIZ = false;
            c1809760xCA.LIZLLL = System.currentTimeMillis();
            C1810690xDf c1810690xDf = C1810690xDf.LIZ;
            DataChannel dataChannelLJ = C475510Ikn.LJ((RankListFragment) aObserverS187S0200000_27.l0);
            RankListV2Response.RankView rankView6 = ((RankListController) aObserverS187S0200000_27.l1).LJIIIZ().LLILLJJLI;
            C1810410xDD c1810410xDD2 = ((RankListFragment) aObserverS187S0200000_27.l0).LLILLL;
            RankListV2Response.RankView rankView7 = ((RankListController) aObserverS187S0200000_27.l1).LJIIIZ().LLILLJJLI;
            if (rankView7 == null || (rankInfo7 = rankView7.ownerRank) == null || (gap6 = rankInfo7.gap) == null || (bottomBarButton2 = gap6.button) == null || (str = bottomBarButton2.buttonType) == null) {
                str = "";
            }
            C1810690xDf.LJJIFFI(c1810690xDf, dataChannelLJ, rankView6, c1810410xDD2, false, str, null, 64);
            RankListFragment rankListFragment2 = (RankListFragment) aObserverS187S0200000_27.l0;
            ARunnableS96S0200000_27 aRunnableS96S0200000_27 = new ARunnableS96S0200000_27((RankListController) aObserverS187S0200000_27.l1, rankListFragment2, 3);
            rankListFragment2.LLJJIJIL = aRunnableS96S0200000_27;
            aRunnableS96S0200000_27.run();
            if (!((RankListFragment) aObserverS187S0200000_27.l0).LLILLL.LJ) {
                C1809720xC6.LIZ = new WeakReference<>(((RankListFragment) aObserverS187S0200000_27.l0).LLJJIJIL);
            }
            RankListV2Response.RankView rankView8 = ((RankListController) aObserverS187S0200000_27.l1).LJIIIZ().LLILLJJLI;
            RankListFragment rankListFragment3 = (RankListFragment) aObserverS187S0200000_27.l0;
            C1810690xDf.LJIILL(rankView8, C475510Ikn.LJ(rankListFragment3), rankListFragment3.LLILLL.LIZIZ.rankName);
            RankListV2Response.RankView rankView9 = ((RankListController) aObserverS187S0200000_27.l1).LJIIIZ().LLILLJJLI;
            if (rankView9 != null && !rankView9.isPositionSafe && ((RankListController) aObserverS187S0200000_27.l1).LIZ().LLILLL) {
                RankListV2Response.RankView rankView10 = ((RankListController) aObserverS187S0200000_27.l1).LJIIIZ().LLILLJJLI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((RankListFragment) aObserverS187S0200000_27.l0).LLILLL.LIZIZ.rankName);
                sbLIZ.append("_unstable_location");
                C1810690xDf.LJIILL(rankView10, C475510Ikn.LJ((RankListFragment) aObserverS187S0200000_27.l0), C2188811AlT.LIZIZ(sbLIZ));
            }
            if ((Intrinsics.LJFF(((RankListFragment) aObserverS187S0200000_27.l0).LLILLL.LIZIZ, RankTypeV2.LIZJ) || Intrinsics.LJFF(((RankListFragment) aObserverS187S0200000_27.l0).LLILLL.LIZIZ, RankTypeV2.LJIJJ)) && ((RankListController) aObserverS187S0200000_27.l1).LIZ().LLILLL && (rankView = ((RankListController) aObserverS187S0200000_27.l1).LJIIIZ().LLILLJJLI) != null && (rankInfo = rankView.ownerRank) != null && (weeklyRookieRankExtra = rankInfo.weeklyRookieRankExtra) != null && weeklyRookieRankExtra.lastrankanchorbeyondthreshold) {
                RankListV2Response.RankView rankView11 = ((RankListController) aObserverS187S0200000_27.l1).LJIIIZ().LLILLJJLI;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(((RankListFragment) aObserverS187S0200000_27.l0).LLILLL.LIZIZ.rankName);
                sbLIZ2.append("_bottom_bar");
                C1810690xDf.LJIILL(rankView11, C475510Ikn.LJ((RankListFragment) aObserverS187S0200000_27.l0), C2188811AlT.LIZIZ(sbLIZ2));
            }
            RankTypeV2 rankTypeV2 = ((RankListFragment) aObserverS187S0200000_27.l0).LLILLL.LIZIZ;
            RankTypeV2 rankTypeV22 = RankTypeV2.LJIL;
            if (Intrinsics.LJFF(rankTypeV2, rankTypeV22)) {
                C1810690xDf.LJJIJL(C475510Ikn.LJ((RankListFragment) aObserverS187S0200000_27.l0), false);
            }
            if (((RankListController) aObserverS187S0200000_27.l1).LIZ().LLILLL && (rankView2 = ((RankListController) aObserverS187S0200000_27.l1).LJIIIZ().LLILLJJLI) != null && (rankInfo5 = rankView2.ownerRank) != null && (gap4 = rankInfo5.gap) != null && gap4.banInfo == 1) {
                DataChannel dataChannelLJ2 = C475510Ikn.LJ((RankListFragment) aObserverS187S0200000_27.l0);
                String str6 = ((RankListFragment) aObserverS187S0200000_27.l0).LLILLL.LIZIZ.rankName;
                RankListV2Response.RankView rankView12 = ((RankListController) aObserverS187S0200000_27.l1).LJIIIZ().LLILLJJLI;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rank_open_settings_show");
                c474500IjALIZ.LJIJJLI(dataChannelLJ2);
                C1810690xDf.LIZ(c474500IjALIZ, dataChannelLJ2);
                c474500IjALIZ.LJJII("rank", "page_name");
                c474500IjALIZ.LJJII(str6, "rank_type");
                if (TextUtils.equals(str6, rankTypeV22.rankName)) {
                    boolean z = C1105900esu.LIZIZ;
                    if (rankView12 != null && (rankExtraInfo = rankView12.rankExtraInfo) != null && (classExtra = rankExtraInfo.classExtra) != null) {
                        i = classExtra.classType;
                    } else {
                        i = 0;
                    }
                    c474500IjALIZ.LJJII(C1105900esu.LIZJ(i), "anchor_ranking_league_level");
                    if (rankView12 != null && (rankInfo6 = rankView12.ownerRank) != null && (gap5 = rankInfo6.gap) != null && (gapExtra = gap5.gapExtra) != null && (gapClassRankExtra = gapExtra.classRankExtra) != null && (classTitle = gapClassRankExtra.classTitle) != null) {
                        lValueOf = Long.valueOf(classTitle.getStarNumber);
                    } else {
                        lValueOf = null;
                    }
                    c474500IjALIZ.LJJII(lValueOf, "anchor_ranking_league_star");
                }
                c474500IjALIZ.LIZ();
            }
            RankListV2Response.RankView rankView13 = ((RankListController) aObserverS187S0200000_27.l1).LJIIIZ().LLILLJJLI;
            if (rankView13 != null && (rankInfo4 = rankView13.ownerRank) != null && (gap3 = rankInfo4.gap) != null && gap3.bottomBarTag != null) {
                RankListFragment rankListFragment4 = (RankListFragment) aObserverS187S0200000_27.l0;
                RankListController rankListController2 = (RankListController) aObserverS187S0200000_27.l1;
                DataChannel dataChannelLJ3 = C475510Ikn.LJ(rankListFragment4);
                C1810410xDD c1810410xDD3 = rankListFragment4.LLILLL;
                if (rankListController2 != null && (rankListViewModelLJIIIZ = rankListController2.LJIIIZ()) != null && rankListViewModelLJIIIZ.LLILLL) {
                    str3 = "ever_spotlight_moment";
                } else {
                    str3 = "realtime_spotlight_moment";
                }
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_bottom_tag_show");
                C1810690xDf.LIZ(c474500IjALIZ2, dataChannelLJ3);
                if (dataChannelLJ3 != null) {
                    boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannelLJ3));
                } else {
                    boolValueOf = null;
                }
                c474500IjALIZ2.LJJII(C1810690xDf.LJJJJIZL(boolValueOf), "user_type");
                c474500IjALIZ2.LJJII(c1810410xDD3.LIZIZ.rankName, "rank_type");
                c474500IjALIZ2.LJJII(str3, "tag_type");
                c474500IjALIZ2.LIZ();
            }
            RankListV2Response.RankView rankView14 = ((RankListController) aObserverS187S0200000_27.l1).LJIIIZ().LLILLJJLI;
            if (rankView14 == null || (rankInfo2 = rankView14.ownerRank) == null || (gap = rankInfo2.gap) == null || (bottomBarFAQ = gap.bottomBarFaq) == null) {
                return;
            }
            RankListFragment rankListFragment5 = (RankListFragment) aObserverS187S0200000_27.l0;
            RankListController rankListController3 = (RankListController) aObserverS187S0200000_27.l1;
            String str7 = bottomBarFAQ.schema;
            if (str7 == null || str7.length() == 0) {
                return;
            }
            DataChannel dataChannelLJ4 = C475510Ikn.LJ(rankListFragment5);
            String buttonType = EnumC1808150x9Z.BOTTOM_BAR_FAQ.getButtonType();
            String str8 = rankListFragment5.LLILLL.LIZIZ.rankName;
            RankListV2Response.RankView rankView15 = rankListController3.LJIIIZ().LLILLJJLI;
            if (rankView15 != null && (rankInfo3 = rankView15.ownerRank) != null && (gap2 = rankInfo3.gap) != null && (bottomBarButton = gap2.button) != null && (str2 = bottomBarButton.buttonType) != null) {
                str4 = str2;
            }
            RankListViewModel rankListViewModelLJIIIZ2 = rankListController3.LJIIIZ();
            if (rankListViewModelLJIIIZ2 != null) {
                rankView4 = rankListViewModelLJIIIZ2.LLILLJJLI;
            }
            C1810690xDf.LJIIJ(dataChannelLJ4, buttonType, str8, "show", str4, rankView4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$2(Y.AObserverS187S0200000_27 r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS187S0200000_27.onChanged$2(Y.AObserverS187S0200000_27, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object, java.util.Collection, java.util.List] */
    public static final void onChanged$3(AObserverS187S0200000_27 aObserverS187S0200000_27, Object obj) {
        ?? r6 = (List) obj;
        ((C259800zU) aObserverS187S0200000_27.l0).element = r6;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("contacts = ");
        sbLIZ.append((Object) r6);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C866950Xzh.LIZIZ(r6)) {
            SystemShareActivityViewModel systemShareActivityViewModelLLLLZLLIL = ((SystemShareActivity) aObserverS187S0200000_27.l1).LLLLZLLIL();
            if (r6 != 0) {
                systemShareActivityViewModelLLLLZLLIL.getClass();
                ArrayList arrayList = new ArrayList();
                for (BaseContact baseContact : r6) {
                    String uid = baseContact.getUid();
                    IMSharePanelApi.LIZ.getClass();
                    if (C1599690rjL.LIZ().getShareService().LIZ(uid)) {
                        arrayList.add(baseContact);
                    }
                }
                if (C866950Xzh.LIZIZ(arrayList)) {
                    ((SystemShareActivity) aObserverS187S0200000_27.l1).LLLLZLLIL().LL.postValue(Boolean.FALSE);
                    return;
                }
                C1850540yFw c1850540yFw = C1850540yFw.LIZ;
                C1B4F c1b4f = C1B4F.LJJIIZI;
                c1850540yFw.getClass();
                C1850540yFw.LIZ(c1b4f);
                ((SystemShareActivity) aObserverS187S0200000_27.l1).LLLLZLLIL().LL.postValue(Boolean.TRUE);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (C866950Xzh.LIZIZ(r6)) {
            C1850540yFw c1850540yFw2 = C1850540yFw.LIZ;
            C1B4F c1b4f2 = C1B4F.LJJIIZ;
            c1850540yFw2.getClass();
            C1850540yFw.LIZ(c1b4f2);
            ((SystemShareActivity) aObserverS187S0200000_27.l1).LLLLZLLIL().LL.postValue(Boolean.TRUE);
            return;
        }
        C1850540yFw c1850540yFw3 = C1850540yFw.LIZ;
        C1B4F c1b4f3 = C1B4F.LJJIIJZLJL;
        c1850540yFw3.getClass();
        C1850540yFw.LIZ(c1b4f3);
        ((SystemShareActivity) aObserverS187S0200000_27.l1).LLLLZLLIL().LL.postValue(Boolean.TRUE);
    }

    public static final void onChanged$4(AObserverS187S0200000_27 aObserverS187S0200000_27, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            int i = C2187451AjH.LIZ;
            ((SystemShareActivity) aObserverS187S0200000_27.l0).LLLLZLLIL().wQ2();
            return;
        }
        if (Intrinsics.LJFF(obj, Boolean.FALSE)) {
            boolean zLIZIZ = C960203pA.LIZIZ((SystemShareActivity) aObserverS187S0200000_27.l0);
            SystemShareEntryFragment systemShareEntryFragment = ((SystemShareActivity) aObserverS187S0200000_27.l0).LLJJI;
            if (systemShareEntryFragment != null && systemShareEntryFragment.isAdded()) {
                return;
            }
            SystemShareActivity systemShareActivity = (SystemShareActivity) aObserverS187S0200000_27.l0;
            C1402840mbq c1402840mbq = systemShareActivity.LLILLJJLI;
            if (c1402840mbq == null) {
                c1402840mbq = null;
            }
            String type = systemShareActivity.getIntent().getType();
            String action = ((SystemShareActivity) aObserverS187S0200000_27.l0).getIntent().getAction();
            List<? extends Uri> list = (List) aObserverS187S0200000_27.l1;
            SystemShareEntryFragment systemShareEntryFragment2 = new SystemShareEntryFragment();
            systemShareEntryFragment2.LLJIJIL = type;
            systemShareEntryFragment2.LLJILJILJ = list;
            systemShareEntryFragment2.LLJILLL = c1402840mbq;
            systemShareEntryFragment2.LLJILJIL = action;
            systemShareActivity.LLJJI = systemShareEntryFragment2;
            SystemShareActivity systemShareActivity2 = (SystemShareActivity) aObserverS187S0200000_27.l0;
            SystemShareEntryFragment systemShareEntryFragment3 = systemShareActivity2.LLJJI;
            if (systemShareEntryFragment3 == null) {
                return;
            }
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = systemShareEntryFragment3;
            c1390920mIc.LJIIIIZZ(0);
            c1390920mIc.LIZ.LLLF = Float.valueOf(0.45f);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLLL = false;
            tuxSheet.LLILLL = false;
            tuxSheet.LLJLLIL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1864750ycr(systemShareActivity2, 4);
            tuxSheet.LL = new DialogInterfaceOnCancelListenerC1864700ycm(systemShareActivity2, 2);
            if (zLIZIZ) {
                c1390920mIc.LIZLLL(R.style.y0, false);
            }
            c1390920mIc.LIZ.show(systemShareActivity2.getSupportFragmentManager(), "TTOP_SystemShare");
            return;
        }
        ((SystemShareActivity) aObserverS187S0200000_27.l0).finish();
    }

    public static final void onChanged$5(AObserverS187S0200000_27 aObserverS187S0200000_27, Object obj) {
        String str;
        LinkShareIntentModel linkShareIntentModel = (LinkShareIntentModel) aObserverS187S0200000_27.l0;
        if (linkShareIntentModel == null || (str = linkShareIntentModel.clientKey) == null) {
            str = "";
        }
        C13BV c13bv = ((LinkShareEntryFragment) aObserverS187S0200000_27.l1).LLJIJIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c13bv, 10));
        Iterator it2 = c13bv.iterator();
        while (it2.hasNext()) {
            arrayList.add(((EnumC1850560yFy) it2.next()).toString());
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("launch_method", "link_share");
        c2344009Gk.LJFF("channel", str);
        c2344009Gk.LJFF("click_actions", "click_close");
        c2344009Gk.LJFF("sharing_channels", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS231S0000000_3.get$arr$(70), 30));
        C20684815ws.LJIILLIIL("tiktok_link_share_page_click", c2344009Gk.LIZ);
    }

    public static final void onChanged$6(AObserverS187S0200000_27 aObserverS187S0200000_27, Object obj) {
        ((Observer) aObserverS187S0200000_27.l0).onChanged(obj);
        ((LiveData) aObserverS187S0200000_27.l1).removeObserver(aObserverS187S0200000_27);
    }

    public static final void onChanged$7(AObserverS187S0200000_27 aObserverS187S0200000_27, Object obj) {
        C1810160xCo c1810160xCo = (C1810160xCo) obj;
        if (c1810160xCo != null && Intrinsics.LJFF(c1810160xCo.LIZ.LIZIZ, ((RankPageController) aObserverS187S0200000_27.l0).LJIIL().LLJJIII)) {
            ((InterfaceC1810050xCd) aObserverS187S0200000_27.l1).AO(c1810160xCo);
        }
    }

    public static final void onChanged$8(AObserverS187S0200000_27 aObserverS187S0200000_27, Object obj) {
        C1790730whT c1790730whT = (C1790730whT) obj;
        if (c1790730whT != null && Intrinsics.LJFF(c1790730whT.LIZ.LIZIZ, ((RankPageController) aObserverS187S0200000_27.l0).LJIIL().LLJJIII)) {
            ((InterfaceC1810050xCd) aObserverS187S0200000_27.l1).Oj(c1790730whT);
        }
    }

    public AObserverS187S0200000_27(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
