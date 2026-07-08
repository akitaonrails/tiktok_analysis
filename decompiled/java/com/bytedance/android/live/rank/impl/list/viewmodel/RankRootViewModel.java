package com.bytedance.android.live.rank.impl.list.viewmodel;

import X.AbstractC1809750xC9;
import X.C1085110eLN;
import X.C1105900esu;
import X.C1133830fbx;
import X.C147700hP;
import X.C1697810uHb;
import X.C1790730whT;
import X.C1790870whh;
import X.C1809970xCV;
import X.C1810070xCf;
import X.C1810170xCp;
import X.C1810210xCt;
import X.C1810340xD6;
import X.C1810410xDD;
import X.C1810700xDg;
import X.C20441214yg;
import X.C235000vU;
import X.C504670Jqj;
import X.EnumC1811400xEo;
import X.InterfaceC1810130xCl;
import android.net.Uri;
import android.util.SparseLongArray;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.ranklist.RankExtraInfo;

/* JADX INFO: loaded from: classes28.dex */
public class RankRootViewModel extends ViewModel {
    public List<RankTabInfo> LL;
    public boolean LLILLL;
    public RankTypeV2 LLILZIL;
    public boolean LLILZLL;
    public LifecycleOwner LLIZ;
    public int LLIZLLLIL;
    public RankTypeV2 LLJ;
    public RankTypeV2 LLJI;
    public RankTypeV2 LLJIJIL;
    public final MutableLiveData<C1790870whh> LLJILJIL;
    public final MutableLiveData<List<AbstractC1809750xC9>> LLJILJILJ;
    public final MutableLiveData<String> LLJILLL;
    public final MutableLiveData<String> LLJJ;
    public final MutableLiveData<C1810170xCp> LLJJI;
    public final MutableLiveData<C1790730whT> LLJJIII;
    public final MutableLiveData<C1790870whh> LLJJIJI;
    public boolean LLILLJJLI = true;
    public EnumC1811400xEo LLILZ = EnumC1811400xEo.DEFAULT;

    public boolean isOffline() {
        return false;
    }

    public RankRootViewModel() {
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        RankTypeV2 rankTypeV22 = RankTypeV2.LJJIJIIJI;
        this.LLILZIL = rankTypeV22;
        this.LLJ = rankTypeV22;
        this.LLJI = rankTypeV22;
        this.LLJIJIL = rankTypeV22;
        this.LLJILJIL = new MutableLiveData<>();
        this.LLJILJILJ = new MutableLiveData<>();
        this.LLJILLL = new MutableLiveData<>();
        this.LLJJ = new MutableLiveData<>();
        this.LLJJI = new MutableLiveData<>();
        this.LLJJIII = new MutableLiveData<>();
        this.LLJJIJI = new MutableLiveData<>();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C20441214yg.LIZIZ("RankRootViewModel", " onClear");
    }

    public final C1810410xDD vQ2(RankTypeV2 rankTypeV2) {
        return new C1810410xDD(this.LLILZ, rankTypeV2, rankTypeV2, this.LLJI, this.LLILZLL);
    }

    public final void wQ2(RankListV2Response.RankView rankView) {
        RankListV2Response.RankLeagueExtra rankLeagueExtra;
        int i;
        Text text;
        Text text2;
        RankListV2Response.LeagueTabInfo leagueTabInfo;
        RankListV2Response.RankLeagueTab rankLeagueTab;
        String str;
        RankExtraInfo rankExtraInfo;
        String str2;
        int i2;
        RankListV2Response.PathToOtherList pathToOtherList;
        RankListV2Response.ClassActivityBannerExtra classActivityBannerExtra;
        List<RankListV2Response.RankInfo> list;
        List<RankListV2Response.RankInfo> list2;
        Long lValueOf;
        Long lValueOf2;
        User user;
        C1810170xCp value;
        RankListV2Response.HistoryEntrance historyEntrance;
        List<RankListV2Response.RankInfo> list3;
        RankListV2Response.RankInfo rankInfo;
        User user2;
        RankListV2Response.LeagueTabInfo leagueTabInfo2;
        RankListV2Response.RankLeagueTab rankLeagueTab2;
        RankListV2Response.LeagueTabInfo leagueTabInfo3;
        List<RankListV2Response.RankLeagueTab> list4;
        int i3;
        int i4;
        Text text3;
        RankExtraInfo rankExtraInfo2 = rankView.rankExtraInfo;
        if (rankExtraInfo2 != null && (rankLeagueExtra = rankExtraInfo2.rankLeagueExtra) != null) {
            ArrayList arrayList = new ArrayList();
            RankListV2Response.RankLeagueHeader rankLeagueHeader = rankLeagueExtra.rankLeagueHeader;
            int i5 = -1;
            if (rankLeagueHeader != null && (leagueTabInfo3 = rankLeagueHeader.leagueTabInfo) != null && (list4 = leagueTabInfo3.standardTab) != null) {
                int i6 = 0;
                for (RankListV2Response.RankLeagueTab rankLeagueTab3 : list4) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        RankListV2Response.RankLeagueTab rankLeagueTab4 = rankLeagueTab3;
                        RankTabInfo rankTabInfo = new RankTabInfo();
                        if (rankLeagueTab4 != null) {
                            i3 = rankLeagueTab4.rankType;
                        } else {
                            i3 = -1;
                        }
                        rankTabInfo.rankType = i3;
                        if (rankLeagueTab4 != null) {
                            i4 = rankLeagueTab4.leaguePhase;
                        } else {
                            i4 = 0;
                        }
                        rankTabInfo.LIZIZ = i4;
                        if (rankLeagueTab4 != null) {
                            text3 = rankLeagueTab4.titleText;
                        } else {
                            text3 = null;
                        }
                        rankTabInfo.title = text3;
                        arrayList.add(rankTabInfo);
                        i6 = i7;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            this.LL = arrayList;
            RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
            RankListV2Response.RankLeagueBase rankLeagueBase = rankLeagueExtra.rankLeagueBase;
            if (rankLeagueBase != null) {
                i5 = rankLeagueBase.rankType;
                i = rankLeagueBase.showLeaguePhase;
            } else {
                i = 0;
            }
            RankTypeV2 rankTypeV2LIZ = C235000vU.LIZ(i5, i);
            this.LLJI = rankTypeV2LIZ;
            this.LLJIJIL = rankTypeV2LIZ;
            List<RankTabInfo> list5 = this.LL;
            if (list5 != null) {
                int i8 = 0;
                for (RankTabInfo rankTabInfo2 : list5) {
                    int i9 = i8 + 1;
                    if (i8 >= 0) {
                        RankTabInfo rankTabInfo3 = rankTabInfo2;
                        int i10 = rankTabInfo3.rankType;
                        RankTypeV2 rankTypeV22 = this.LLJI;
                        if (i10 == rankTypeV22.type && rankTabInfo3.LIZIZ == rankTypeV22.rankPhase) {
                            zQ2(i8);
                        }
                        i8 = i9;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            C1810410xDD c1810410xDDVQ2 = vQ2(this.LLJ);
            MutableLiveData<String> mutableLiveData = this.LLJILLL;
            RankListV2Response.RankLeagueHeader rankLeagueHeader2 = rankLeagueExtra.rankLeagueHeader;
            if (rankLeagueHeader2 != null && (leagueTabInfo2 = rankLeagueHeader2.leagueTabInfo) != null && (rankLeagueTab2 = leagueTabInfo2.superTab) != null) {
                text = rankLeagueTab2.titleText;
            } else {
                text = null;
            }
            mutableLiveData.postValue(C1133830fbx.LJIILIIL(text, "").toString());
            RankListV2Response.HistoryEntrance historyEntrance2 = rankLeagueExtra.rankLeagueHistoryEntrance;
            if (historyEntrance2 == null || !historyEntrance2.ifHasHistory || historyEntrance2.ranks == null || ((list = historyEntrance2.ranks) != null && list.size() == 0)) {
                MutableLiveData<String> mutableLiveData2 = this.LLJJ;
                RankListV2Response.RankLeagueHeader rankLeagueHeader3 = rankLeagueExtra.rankLeagueHeader;
                if (rankLeagueHeader3 != null && (leagueTabInfo = rankLeagueHeader3.leagueTabInfo) != null && (rankLeagueTab = leagueTabInfo.superTab) != null) {
                    text2 = rankLeagueTab.briefDescription;
                } else {
                    text2 = null;
                }
                mutableLiveData2.postValue(C1133830fbx.LJIILIIL(text2, "").toString());
            } else {
                RankListV2Response.HistoryEntrance historyEntrance3 = rankLeagueExtra.rankLeagueHistoryEntrance;
                if (historyEntrance3 != null && (list2 = historyEntrance3.ranks) != null) {
                    int i11 = 0;
                    for (RankListV2Response.RankInfo rankInfo2 : list2) {
                        int i12 = i11 + 1;
                        if (i11 >= 0) {
                            RankListV2Response.RankInfo rankInfo3 = rankInfo2;
                            MutableLiveData<C1810170xCp> mutableLiveData3 = this.LLJJI;
                            if (mutableLiveData3 != null && (value = mutableLiveData3.getValue()) != null && (historyEntrance = value.LIZ) != null && (list3 = historyEntrance.ranks) != null && (rankInfo = (RankListV2Response.RankInfo) ListProtector.get(list3, i11)) != null && (user2 = rankInfo.rankUser) != null) {
                                lValueOf = Long.valueOf(user2.getId());
                            } else {
                                lValueOf = null;
                            }
                            if (rankInfo3 != null && (user = rankInfo3.rankUser) != null) {
                                lValueOf2 = Long.valueOf(user.getId());
                            } else {
                                lValueOf2 = null;
                            }
                            if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
                                this.LLJJI.postValue(new C1810170xCp(rankLeagueExtra.rankLeagueHistoryEntrance));
                            }
                            i11 = i12;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
            RankListV2Response.PathToOtherList pathToOtherList2 = rankLeagueExtra.pathToDaily;
            if (pathToOtherList2 != null && ((rankExtraInfo = rankView.rankExtraInfo) == null || (classActivityBannerExtra = rankExtraInfo.activityBannerExtra) == null || classActivityBannerExtra.activityBannerType <= 0)) {
                C1790870whh value2 = this.LLJJIJI.getValue();
                if (value2 != null && (pathToOtherList = value2.LIZIZ) != null) {
                    str2 = pathToOtherList.schema;
                } else {
                    str2 = null;
                }
                if (!C504670Jqj.LIZ(str2, pathToOtherList2.schema)) {
                    Uri uri = UriProtector.parse(pathToOtherList2.schema);
                    MutableLiveData<C1790870whh> mutableLiveData4 = this.LLJJIJI;
                    RankTypeV2 rankTypeV23 = RankTypeV2.LIZ;
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "select_sub_rank_type");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                        i2 = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    } else {
                        i2 = 0;
                    }
                    mutableLiveData4.postValue(new C1790870whh(vQ2(C235000vU.LIZ(i2, 0)), pathToOtherList2, null));
                }
            }
            C1790730whT value3 = this.LLJJIII.getValue();
            if (value3 != null) {
                str = value3.LIZIZ;
            } else {
                str = null;
            }
            if (!C504670Jqj.LIZ(str, rankView.ruleUrl)) {
                this.LLJJIII.postValue(new C1790730whT(c1810410xDDVQ2, rankView.ruleUrl));
            }
        }
        this.LLJILJILJ.postValue(null);
    }

    public final void yQ2(C1810340xD6 c1810340xD6) {
        List<RankTabInfo> list = c1810340xD6.LIZJ;
        this.LL = list;
        int i = 0;
        if (list != null) {
            Iterator<RankTabInfo> it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                RankTabInfo next = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    if (next.rankType == c1810340xD6.LJ.type) {
                        i = i2;
                        break;
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        zQ2(i);
        this.LLJI = c1810340xD6.LJ;
        RankTypeV2 rankTypeV2 = c1810340xD6.LJFF;
        this.LLJIJIL = rankTypeV2;
        this.LLILZIL = rankTypeV2;
        this.LLILLL = c1810340xD6.LIZLLL;
        this.LLILZ = c1810340xD6.LJI;
    }

    public final void zQ2(int i) {
        int i2;
        int i3;
        RankTabInfo rankTabInfo;
        RankTabInfo rankTabInfo2;
        this.LLIZLLLIL = i;
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        List<RankTabInfo> list = this.LL;
        if (list != null && (rankTabInfo2 = (RankTabInfo) ListProtector.get(list, i)) != null) {
            i2 = rankTabInfo2.rankType;
        } else {
            i2 = -1;
        }
        List<RankTabInfo> list2 = this.LL;
        if (list2 != null && (rankTabInfo = (RankTabInfo) ListProtector.get(list2, this.LLIZLLLIL)) != null) {
            i3 = rankTabInfo.LIZIZ;
        } else {
            i3 = 0;
        }
        this.LLJ = C235000vU.LIZ(i2, i3);
    }

    public final void xQ2(String str, RankTypeV2 rankTypeV2, InterfaceC1810130xCl interfaceC1810130xCl, C1810070xCf c1810070xCf, boolean z) {
        RankExtraInfo rankExtraInfo;
        RankListV2Response.RankLeagueExtra rankLeagueExtra;
        RankListV2Response.RankLeagueBase rankLeagueBase;
        long j;
        RankListV2Response.Data dataLIZ = C147700hP.LIZ(str);
        if (dataLIZ != null && dataLIZ.rankView != null) {
            if (z) {
                dataLIZ.rankView.LIZIZ = true;
            } else {
                RankListV2Response.RankView rankView = dataLIZ.rankView;
                if (rankView != null && (rankExtraInfo = rankView.rankExtraInfo) != null && (rankLeagueExtra = rankExtraInfo.rankLeagueExtra) != null && (rankLeagueBase = rankLeagueExtra.rankLeagueBase) != null) {
                    C1085110eLN.LIZJ(rankTypeV2.type, rankLeagueBase.showLeaguePhase, str, this.LLILZLL, z);
                }
                C1085110eLN.LIZJ(rankTypeV2.type, rankTypeV2.rankPhase, str, this.LLILZLL, z);
            }
            RankListV2Response.RankView rankView2 = dataLIZ.rankView;
            RankExtraInfo rankExtraInfo2 = rankView2.rankExtraInfo;
            List<SubRankTabInfo> list = rankView2.subTabs;
            if (list == null || list.isEmpty()) {
                SubRankTabInfo subRankTabInfo = new SubRankTabInfo();
                subRankTabInfo.rankType = rankTypeV2.type;
                rankView2.subTabs = Collections.singletonList(subRankTabInfo);
            }
            boolean z2 = C1105900esu.LIZIZ;
            C1105900esu.LJI(rankView2.subTabs);
            boolean z3 = rankView2.history;
            if (z3) {
                j = -1;
            } else {
                j = 0;
            }
            rankView2.LIZ = j;
            SparseLongArray sparseLongArray = C1810700xDg.LIZ;
            C1810700xDg.LJFF(rankTypeV2.type, rankView2.ownerRank.rank, z3);
            if (!z) {
                if (true ^ rankView2.ranks.isEmpty()) {
                    C1810210xCt.LJ(rankTypeV2.type, rankTypeV2.rankPhase, c1810070xCf.LIZ, c1810070xCf.LIZIZ, c1810070xCf.LIZJ, c1810070xCf.LIZLLL, str.length());
                } else {
                    C1810210xCt.LIZIZ(rankTypeV2.type, rankTypeV2.rankPhase, c1810070xCf.LIZ, c1810070xCf.LIZIZ, c1810070xCf.LIZJ, c1810070xCf.LIZLLL);
                }
            }
            wQ2(dataLIZ.rankView);
            interfaceC1810130xCl.LIZ(dataLIZ.rankView, 0L, z);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1809970xCV(vQ2(this.LLJ)));
        this.LLJILJILJ.postValue(arrayList);
        if (z) {
            return;
        }
        C1810210xCt.LIZIZ(rankTypeV2.type, rankTypeV2.rankPhase, c1810070xCf.LIZ, c1810070xCf.LIZIZ, c1810070xCf.LIZJ, c1810070xCf.LIZLLL);
    }
}
