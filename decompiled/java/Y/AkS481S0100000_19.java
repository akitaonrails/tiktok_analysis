package Y;

import X.AbstractC19852312lt;
import X.C0C10;
import X.C0C11;
import X.C11NZ;
import X.C11S5;
import X.C11TL;
import X.C1221730htj;
import X.C1240900iOe;
import X.C1245240iVe;
import X.C1246660iXw;
import X.C1247000iYU;
import X.C1247020iYW;
import X.C1247040iYY;
import X.C1247050iYZ;
import X.C1247060iYa;
import X.C1247070iYb;
import X.C1247080iYc;
import X.C1247190iYn;
import X.C1247270iYv;
import X.C1247640iZW;
import X.C1390130mHL;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1954807lC;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C316810CbP;
import X.C491101vh;
import X.C786410Ut5;
import X.EnumC1247010iYV;
import X.EnumC1247030iYX;
import X.EnumC584810Mwh;
import X.InterfaceC1231870iA5;
import X.InterfaceC1487280oo2;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.aigc.AIGCQuota;
import com.ss.android.ugc.aweme.following.model.AliasPermissionUserData;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.ss.android.ugc.aweme.models.NowArchiveResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notification.module.NotificationChunkVM;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.model.StoryArchDetailResponse;
import com.ss.android.ugc.profile.business.now.ProfileNowApi;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import com.ss.android.ugc.profile.business.story.consumption.ProfileStoryApi;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcIntroFragmentV2;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcMainActivity;
import com.ss.android.ugc.profile.business.ur.editprofile.namesync.ProfileNameSyncService;
import com.ss.android.ugc.profile.business.ur.following.repository.RelationSearchApi;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class AkS481S0100000_19 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return apply$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return apply$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return apply$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return apply$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return apply$13(this, obj);
            case 14:
                return apply$14(this, obj);
            default:
                return null;
        }
    }

    public AkS481S0100000_19(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS481S0100000_19 akS481S0100000_19, Object obj) {
        Object obj2;
        Object next;
        int iIntValue;
        int iIntValue2;
        Integer num;
        Integer num2;
        List list = (List) obj;
        Iterator it2 = list.iterator();
        while (true) {
            obj2 = null;
            if (it2.hasNext()) {
                next = it2.next();
                AIGCQuota aIGCQuota = (AIGCQuota) next;
                if (Intrinsics.LJFF(aIGCQuota.quotaType, "fast") || Intrinsics.LJFF(aIGCQuota.quotaType, "quick")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AIGCQuota aIGCQuota2 = (AIGCQuota) next;
        if (aIGCQuota2 != null && (num2 = aIGCQuota2.quotaRemain) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (Intrinsics.LJFF(((AIGCQuota) next2).quotaType, "slow")) {
                obj2 = next2;
                break;
            }
        }
        AIGCQuota aIGCQuota3 = (AIGCQuota) obj2;
        if (aIGCQuota3 != null && (num = aIGCQuota3.quotaRemain) != null) {
            iIntValue2 = num.intValue();
        } else {
            iIntValue2 = 0;
        }
        if (iIntValue <= 0) {
            ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV2 = (ProfileAigcIntroFragmentV2) akS481S0100000_19.l0;
            View view = profileAigcIntroFragmentV2.LLJLILLLLZIIL;
            if (view != null) {
                C786410Ut5.LLLLLZ(profileAigcIntroFragmentV2.VR(), 4);
                view.setBackgroundResource(R.drawable.cxg);
            }
            ((ProfileAigcIntroFragmentV2) akS481S0100000_19.l0).LLJLLIL = false;
        }
        if (iIntValue2 <= 0) {
            ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV22 = (ProfileAigcIntroFragmentV2) akS481S0100000_19.l0;
            View view2 = profileAigcIntroFragmentV22.LLJLIL;
            if (view2 != null) {
                C786410Ut5.LLLLLZ(profileAigcIntroFragmentV22.bS(), 4);
                view2.setBackgroundResource(R.drawable.cxg);
            }
            ((ProfileAigcIntroFragmentV2) akS481S0100000_19.l0).LLJLL = false;
        }
        ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV23 = (ProfileAigcIntroFragmentV2) akS481S0100000_19.l0;
        profileAigcIntroFragmentV23.LLJZIJLIL = true;
        profileAigcIntroFragmentV23.LLLF = true;
        float f = 0.3f;
        if (!profileAigcIntroFragmentV23.LLJLLIL) {
            if (!profileAigcIntroFragmentV23.LLJLL) {
                View view3 = profileAigcIntroFragmentV23.LLJLILLLLZIIL;
                if (view3 != null) {
                    C786410Ut5.T4(view3, 1.0f);
                }
                View view4 = ((ProfileAigcIntroFragmentV2) akS481S0100000_19.l0).LLJLIL;
                if (view4 != null) {
                    C786410Ut5.T4(view4, 1.0f);
                }
                ((ProfileAigcIntroFragmentV2) akS481S0100000_19.l0).LLJZIJLIL = false;
            } else {
                View view5 = profileAigcIntroFragmentV23.LLJLILLLLZIIL;
                if (view5 != null) {
                    C786410Ut5.T4(view5, 0.3f);
                }
                View view6 = ((ProfileAigcIntroFragmentV2) akS481S0100000_19.l0).LLJLIL;
                if (view6 != null) {
                    C786410Ut5.T4(view6, 1.0f);
                }
                ((ProfileAigcIntroFragmentV2) akS481S0100000_19.l0).gS(EnumC584810Mwh.SLOW);
            }
        } else if (!profileAigcIntroFragmentV23.LLJLL) {
            profileAigcIntroFragmentV23.gS(EnumC584810Mwh.FAST);
            View view7 = ((ProfileAigcIntroFragmentV2) akS481S0100000_19.l0).LLJLIL;
            if (view7 != null) {
                C786410Ut5.T4(view7, 0.3f);
            }
            View view8 = ((ProfileAigcIntroFragmentV2) akS481S0100000_19.l0).LLJLILLLLZIIL;
            if (view8 != null) {
                C786410Ut5.T4(view8, 1.0f);
            }
            ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV24 = (ProfileAigcIntroFragmentV2) akS481S0100000_19.l0;
            profileAigcIntroFragmentV24.LLJZIJLIL = ((Boolean) profileAigcIntroFragmentV24.LLL.getValue()).booleanValue();
        }
        TuxTextView tuxTextViewSR = ((ProfileAigcIntroFragmentV2) akS481S0100000_19.l0).SR();
        if (((ProfileAigcIntroFragmentV2) akS481S0100000_19.l0).LLJZIJLIL) {
            f = 1.0f;
        }
        C786410Ut5.B5(tuxTextViewSR, f);
        return Unit.LIZ;
    }

    public static final Object apply$1(AkS481S0100000_19 akS481S0100000_19, Object obj) {
        ((ProfileAigcMainActivity) akS481S0100000_19.l0).LLLLLZL((C1221730htj) obj);
        return Unit.LIZ;
    }

    public static final Object apply$10(AkS481S0100000_19 akS481S0100000_19, Object obj) {
        return ((DislikeRecommendParams) akS481S0100000_19.l0).uid;
    }

    public static final Object apply$11(AkS481S0100000_19 akS481S0100000_19, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) akS481S0100000_19.l0;
        awemeListFragmentImpl.getClass();
        C11NZ<StoryArchDetailResponse> storyArchDetail = ProfileStoryApi.LIZIZ.getStoryArchDetail();
        awemeListFragmentImpl.A.set(true);
        return storyArchDetail;
    }

    public static final Object apply$12(AkS481S0100000_19 akS481S0100000_19, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) akS481S0100000_19.l0;
        awemeListFragmentImpl.getClass();
        C11NZ<NowArchiveResponse> c11nzFetchArchiveData = ProfileNowApi.LIZIZ.fetchArchiveData(0L, 10L, 2);
        awemeListFragmentImpl.B.set(true);
        return c11nzFetchArchiveData;
    }

    public static final Object apply$13(AkS481S0100000_19 akS481S0100000_19, Object obj) {
        User userM307clone;
        boolean z;
        ArrayList arrayList = new ArrayList();
        C11TL c11tl = (C11TL) akS481S0100000_19.l0;
        for (Pair pair : (List) obj) {
            User user = c11tl.LIZ.get(pair.getFirst());
            User user2 = (User) pair.getSecond();
            if (user != null && user2 != null && user.getFollowStatus() != user2.getFollowStatus()) {
                FollowStatus followStatus = new FollowStatus(user2.getUid(), user2.getFollowStatus());
                if (user.getFollowStatus() != 0 && user2.getFollowStatus() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                followStatus.setFollowChange(z);
                followStatus.setPreStatus(user.getFollowStatus());
                arrayList.add(followStatus);
                ((IMainService) ServiceManager.get().getService(IMainService.class)).updateIMUserFollowStatus(user2);
            }
            ConcurrentHashMap<String, User> concurrentHashMap = c11tl.LIZ;
            Object first = pair.getFirst();
            User user3 = (User) pair.getSecond();
            if (user3 != null) {
                userM307clone = user3.m307clone();
            } else {
                userM307clone = null;
            }
            concurrentHashMap.put((String) first, userM307clone);
        }
        return arrayList;
    }

    public static final Object apply$14(AkS481S0100000_19 akS481S0100000_19, Object obj) {
        C1246660iXw c1246660iXwLJ;
        C1245240iVe c1245240iVe = C1245240iVe.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestVoiceCallSettings failed: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
        c1245240iVe.getClass();
        IPushSettingService iPushSettingService = (IPushSettingService) akS481S0100000_19.l0;
        if (iPushSettingService == null || (c1246660iXwLJ = iPushSettingService.LJ()) == null) {
            return new C1246660iXw(0, 0);
        }
        return c1246660iXwLJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List<X.0iYv>] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static final Object apply$2(AkS481S0100000_19 akS481S0100000_19, Object obj) {
        ?? LJ;
        Integer numValueOf;
        ?? arrayList;
        ?? arrayList2;
        Integer num;
        int iIntValue;
        String strLIZIZ;
        int iIntValue2;
        Pair pair = (Pair) obj;
        String str = (String) pair.getFirst();
        RelationSearchResponse relationSearchResponse = (RelationSearchResponse) pair.getSecond();
        List<AliasPermissionUserData> list = relationSearchResponse.aliasPermissions;
        if (list != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LJ = new LinkedHashMap(iLIZIZ);
            for (AliasPermissionUserData aliasPermissionUserData : list) {
                String str2 = aliasPermissionUserData.userId;
                if (str2 == null) {
                    str2 = "";
                }
                Integer num2 = aliasPermissionUserData.aliasPermissionType;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                Pair pair2 = new Pair(str2, Integer.valueOf(iIntValue2));
                LJ.put(pair2.getFirst(), pair2.getSecond());
            }
        } else {
            LJ = C2097608Jq.LJ();
        }
        relationSearchResponse.checkValid();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("searchResult remote without dedup, keyword ");
        sbLIZ.append(str);
        sbLIZ.append(", latest searchKey: ");
        sbLIZ.append(((C1247070iYb) akS481S0100000_19.l0).LJJ().LLILZ);
        sbLIZ.append(", count #");
        List<User> list2 = relationSearchResponse.searchUser;
        if (list2 != null) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", ");
        sbLIZ.append(System.currentTimeMillis() - ((C1247070iYb) akS481S0100000_19.l0).LLJI);
        sbLIZ.append(" ms");
        C2188811AlT.LIZIZ(sbLIZ);
        List<User> list3 = relationSearchResponse.searchUser;
        if (list3 != null) {
            C1247070iYb c1247070iYb = (C1247070iYb) akS481S0100000_19.l0;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            int i = 0;
            for (User user : list3) {
                int i2 = i + 1;
                if (i >= 0) {
                    User user2 = user;
                    C1247060iYa c1247060iYa = EnumC1247030iYX.Companion;
                    List<Integer> list4 = relationSearchResponse.matchBy;
                    if (list4 != null) {
                        num = (Integer) C13LP.LJJJLZIJ(i, list4);
                    } else {
                        num = null;
                    }
                    c1247060iYa.getClass();
                    EnumC1247030iYX enumC1247030iYXLIZ = C1247060iYa.LIZ(num);
                    Integer num3 = (Integer) LJ.get(user2.getUid());
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    List<C1247270iYv> list5 = c1247070iYb.LJJ().LLIZLLLIL;
                    if (list5 != null) {
                        ArrayList<C1247270iYv> arrayList4 = new ArrayList();
                        for (Object obj2 : (ArrayList) list5) {
                            if (Intrinsics.LJFF(((C1247270iYv) obj2).LL.getUid(), user2.getUid())) {
                                arrayList4.add(obj2);
                            }
                        }
                        for (C1247270iYv c1247270iYv : arrayList4) {
                            C1247020iYW c1247020iYW = EnumC1247010iYV.Companion;
                            Integer numValueOf2 = Integer.valueOf(iIntValue);
                            c1247020iYW.getClass();
                            c1247270iYv.LLILZIL = C1247020iYW.LIZ(numValueOf2);
                        }
                    }
                    int i3 = C1247050iYZ.LIZ[enumC1247030iYXLIZ.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2 && i3 != 3 && i3 != 4) {
                            throw new C1954807lC();
                        }
                        strLIZIZ = user2.getNickname();
                    } else {
                        strLIZIZ = C1247000iYU.LIZIZ(user2);
                    }
                    if (strLIZIZ == null) {
                        strLIZIZ = user2.getNickname();
                    }
                    C1247020iYW c1247020iYW2 = EnumC1247010iYV.Companion;
                    Integer numValueOf3 = Integer.valueOf(iIntValue);
                    c1247020iYW2.getClass();
                    arrayList3.add(new C1247270iYv(user2, i, enumC1247030iYXLIZ, strLIZIZ, C1247020iYW.LIZ(numValueOf3), 2, -1, -1.0d, 768));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            C1247070iYb c1247070iYb2 = (C1247070iYb) akS481S0100000_19.l0;
            arrayList = new ArrayList();
            for (Object obj3 : arrayList3) {
                C1247270iYv c1247270iYv2 = (C1247270iYv) obj3;
                List<C1247270iYv> list6 = c1247070iYb2.LJJ().LLIZLLLIL;
                if (list6 != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list6, 10));
                    Iterator it2 = ((ArrayList) list6).iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((C1247270iYv) it2.next()).LL.getUid());
                    }
                } else {
                    arrayList2 = C13BV.INSTANCE;
                }
                if (!arrayList2.contains(c1247270iYv2.LL.getUid())) {
                    arrayList.add(obj3);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        ((C1247070iYb) akS481S0100000_19.l0).LJJ().LLIZ = arrayList;
        return new Pair(str, arrayList);
    }

    public static final Object apply$3(AkS481S0100000_19 akS481S0100000_19, Object obj) {
        ((C1247080iYc) akS481S0100000_19.l0).LLJI = System.currentTimeMillis();
        return obj;
    }

    public static final Object apply$4(AkS481S0100000_19 akS481S0100000_19, Object obj) {
        String strLIZIZ;
        C316810CbP c316810CbP = (C316810CbP) obj;
        List<C1240900iOe> list = c316810CbP.LIZIZ;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (C1240900iOe c1240900iOe : list) {
            if (hashSet.add(c1240900iOe.LIZ.getUid())) {
                arrayList.add(c1240900iOe);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                C1240900iOe c1240900iOe2 = (C1240900iOe) obj2;
                C1247060iYa c1247060iYa = EnumC1247030iYX.Companion;
                Integer numValueOf = Integer.valueOf(c1240900iOe2.LIZIZ);
                c1247060iYa.getClass();
                EnumC1247030iYX enumC1247030iYXLIZ = C1247060iYa.LIZ(numValueOf);
                int i3 = C1247040iYY.LIZ[enumC1247030iYXLIZ.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2 && i3 != 3 && i3 != 4) {
                        throw new C1954807lC();
                    }
                    strLIZIZ = c1240900iOe2.LIZ.getNickname();
                } else {
                    strLIZIZ = C1247000iYU.LIZIZ(c1240900iOe2.LIZ);
                }
                if (strLIZIZ == null) {
                    strLIZIZ = c1240900iOe2.LIZ.getNickname();
                }
                arrayList2.add(new C1247270iYv(c1240900iOe2.LIZ, i, enumC1247030iYXLIZ, strLIZIZ, EnumC1247010iYV.FOLLOWER, 1, c1240900iOe2.LIZJ, c1240900iOe2.LJ, c316810CbP.LIZJ, c316810CbP.LIZLLL));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ((C1247080iYc) akS481S0100000_19.l0).LJJ().LLIZLLLIL = arrayList2;
        return new Pair(c316810CbP.LIZ, arrayList2);
    }

    public static final Object apply$5(AkS481S0100000_19 akS481S0100000_19, Object obj) {
        ((C1247070iYb) akS481S0100000_19.l0).LLJI = System.currentTimeMillis();
        C1247190iYn c1247190iYn = C1247190iYn.LIZ;
        String enterFrom = ((C1247070iYb) akS481S0100000_19.l0).LJJ().getEnterFrom();
        long j = ((C1247070iYb) akS481S0100000_19.l0).LLJI;
        C491101vh c491101vh = C491101vh.LIZ;
        c1247190iYn.getClass();
        C1247190iYn.LIZIZ(enterFrom, j, c491101vh, 0);
        String str = (String) ((C1247070iYb) akS481S0100000_19.l0).LLJILJIL.getValue();
        C1247070iYb c1247070iYb = (C1247070iYb) akS481S0100000_19.l0;
        C1247190iYn.LIZIZ(str, c1247070iYb.LLJI, c491101vh, c1247070iYb.LLJILLL);
        ((C1247070iYb) akS481S0100000_19.l0).LLJILLL++;
        return obj;
    }

    public static final Object apply$6(AkS481S0100000_19 akS481S0100000_19, Object obj) {
        String uid;
        final String str = (String) obj;
        RelationSearchApi.LIZ.getClass();
        RelationSearchApi value = C1247640iZW.LIZIZ.getValue();
        User user = ((C1247070iYb) akS481S0100000_19.l0).LJJ().wQ2().LL;
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        return value.queryRelationSearchList(((C1247070iYb) akS481S0100000_19.l0).LJJ().wQ2().LLILLJJLI.getValue(), uid, str, C0C10.LIZ(), C0C11.LIZ(), "", null).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.00HX
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                return new Pair(str, obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0iA4] */
    public static final Object apply$7(AkS481S0100000_19 akS481S0100000_19, Object obj) {
        AbstractC19852312lt abstractC19852312lt = (AbstractC19852312lt) obj;
        C1390130mHL c1390130mHL = ((ProfileEditNicknameFragment) akS481S0100000_19.l0).LLLF;
        if (c1390130mHL != null) {
            C786410Ut5.LLZ(c1390130mHL, 8);
        }
        if (abstractC19852312lt.isPresent()) {
            final ProfileEditNicknameFragment profileEditNicknameFragment = (ProfileEditNicknameFragment) akS481S0100000_19.l0;
            String str = (String) abstractC19852312lt.get();
            Context context = profileEditNicknameFragment.getContext();
            if (context != null) {
                ((ProfileNameSyncService) profileEditNicknameFragment.LLLFF.getValue()).LJ(context, str, profileEditNicknameFragment.LLJILJIL, new InterfaceC1231870iA5() { // from class: X.0iA4
                    @Override // X.InterfaceC1231870iA5
                    public final void onCanceled() {
                    }

                    @Override // X.InterfaceC1231870iA5
                    public final void LIZ(String str2, boolean z) {
                        if (z) {
                            profileEditNicknameFragment.LLLI = new C1215680hjy(true, false, str2);
                        }
                        profileEditNicknameFragment.kS();
                    }
                });
            }
        } else {
            ((ProfileEditNicknameFragment) akS481S0100000_19.l0).yS();
        }
        return Unit.LIZ;
    }

    public static final Object apply$8(AkS481S0100000_19 akS481S0100000_19, Object obj) {
        ((NotificationChunkVM) akS481S0100000_19.l0).AQ2((NoticeListsResponse) obj, false);
        return Unit.LIZ;
    }

    public static final Object apply$9(AkS481S0100000_19 akS481S0100000_19, Object obj) {
        ((NotificationChunkVM) akS481S0100000_19.l0).AQ2((NoticeListsResponse) obj, true);
        return Unit.LIZ;
    }
}
