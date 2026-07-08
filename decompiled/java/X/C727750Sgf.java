package X;

import Y.ARunnableS16S1200000_11;
import Y.AfS180S0100000_11;
import Y.AkS474S0100000_11;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.StoryLiteMetadata;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import com.ss.android.ugc.aweme.profile.model.UserFilterStoryInfo;
import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import com.ss.android.ugc.aweme.story.setting.ui.color.ColorConfig;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS138S1100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sgf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727750Sgf implements InterfaceC1605730rt5 {
    public final EnumC1615506Uf LIZ = EnumC1615506Uf.STORY;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C727840Sgo());
    public final String LIZJ = "aweme://story/detail";

    @Override // X.InterfaceC1605730rt5
    public final InterfaceC1605850rtH LJI() {
        return new InterfaceC1605850rtH() { // from class: X.0Sgh
            @Override // X.InterfaceC1605850rtH
            public final boolean LIZ() {
                C729220Sj2.LL.getClass();
                return C729220Sj2.LJIIZILJ().LLILLJJLI.LLILZLL;
            }

            @Override // X.InterfaceC1605850rtH
            public final String LIZIZ() {
                C0SPF c0spf;
                SimplePublishModel simplePublishModel;
                C729220Sj2.LL.getClass();
                CopyOnWriteArrayList<C0SPF> copyOnWriteArrayList = C729220Sj2.LLILLL.LIZJ;
                if (copyOnWriteArrayList == null || (c0spf = (C0SPF) C13LP.LJJLIIIJL(copyOnWriteArrayList)) == null || (simplePublishModel = c0spf.LIZ) == null) {
                    return null;
                }
                return simplePublishModel.creationId;
            }

            @Override // X.InterfaceC1605850rtH
            public final boolean LIZJ() {
                C729220Sj2.LL.getClass();
                return C729220Sj2.LJIIZILJ().LLILLJJLI.LLIZ.get();
            }

            @Override // X.InterfaceC1605850rtH
            public final boolean LIZLLL() {
                C729220Sj2.LL.getClass();
                return C729220Sj2.LJIJ();
            }
        };
    }

    @Override // X.InterfaceC1605730rt5
    public final InterfaceC728740SiG LJIILL() {
        return (InterfaceC728740SiG) this.LIZIZ.getValue();
    }

    public final C727780Sgi LJIJJ() {
        C727780Sgi c727780SgiLIZ = LIZ(C728090ShD.LIZ.LJIIIIZZ());
        Boolean bool = Boolean.TRUE;
        System.currentTimeMillis();
        if (bool != null) {
            c727780SgiLIZ.LIZJ = bool;
        }
        C1605650rsx.LIZIZ.LJIILJJIL(this.LIZ, c727780SgiLIZ);
        return c727780SgiLIZ;
    }

    @Override // X.InterfaceC1605730rt5
    public final String LJIIJ() {
        return this.LIZJ;
    }

    public static int LJIJ(int i) {
        int i2;
        List<Aweme> listLJIIIZ = C729220Sj2.LL.LJIIIZ();
        int i3 = 0;
        if (listLJIIIZ.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<Aweme> it2 = listLJIIIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Aweme next = it2.next();
                Story story = next.getStory();
                if (story != null && !story.viewed) {
                    if (next != null) {
                        i2 = 1;
                    }
                }
            }
            i2 = 2;
        }
        if (i != 1) {
            if (i2 == 2 || i == 2) {
                i3 = 2;
            }
        } else {
            i3 = 1;
        }
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mergePublishStatus: origin: ");
        sbLIZ.append(i);
        sbLIZ.append(" , publishStatus: ");
        sbLIZ.append(i2);
        sbLIZ.append(", result: ");
        sbLIZ.append(i3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c727890Sgt.getClass();
        C727890Sgt.LIZ("StoryAvatarBizConfig", strLIZIZ);
        return i3;
    }

    public static String LJIJI(List list) {
        try {
            String strLIZIZ = "[ ";
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                StoryLiteMetadata storyLiteMetadata = (StoryLiteMetadata) it2.next();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(" { itemId: ");
                sbLIZ.append(storyLiteMetadata.itemID);
                sbLIZ.append(" + viewed: ");
                sbLIZ.append(storyLiteMetadata.viewed);
                sbLIZ.append(" },");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" + ]");
            return C2188811AlT.LIZIZ(sbLIZ2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return "";
        }
    }

    @Override // X.InterfaceC1605730rt5
    public final C727780Sgi LIZ(Aweme aweme) {
        UserAllStoryMetadata userAllStoryMetadata;
        String strLJIJI;
        Set hashSet;
        Long lValueOf;
        UserAllStoryMetadata allStoryMetadata;
        List<StoryLiteMetadata> list;
        UserFilterStoryInfo userFilterStoryInfo;
        List<Long> list2;
        UserAllStoryMetadata allStoryMetadata2;
        List<StoryLiteMetadata> list3;
        User author = aweme.getAuthor();
        String strLJIJI2 = null;
        if (author != null) {
            userAllStoryMetadata = author.getAllStoryMetadata();
        } else {
            userAllStoryMetadata = null;
        }
        int iLIZ = C708702ph.LIZ(userAllStoryMetadata, null, null, false, true);
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        AwemeExtKt.getAuthorUid(aweme);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getStatusFromAwemeV2: status: ");
        sbLIZ.append(iLIZ);
        sbLIZ.append("，\nallStoryMetadata: ");
        User author2 = aweme.getAuthor();
        if (author2 != null && (allStoryMetadata2 = author2.getAllStoryMetadata()) != null && (list3 = allStoryMetadata2.storyLiteMetadata) != null) {
            strLJIJI = LJIJI(list3);
        } else {
            strLJIJI = null;
        }
        sbLIZ.append(strLJIJI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c727890Sgt.getClass();
        C727890Sgt.LIZIZ("StoryAvatarBizConfig", strLIZIZ);
        UserStory userStory = aweme.getUserStory();
        if (userStory != null && (userFilterStoryInfo = userStory.getUserFilterStoryInfo()) != null && (list2 = userFilterStoryInfo.filterStoryIds) != null) {
            hashSet = C13LP.LLIIIZ(list2);
        } else {
            hashSet = new HashSet();
        }
        if (C729510SjV.LJIILJJIL(AwemeExtKt.getAuthorUid(aweme))) {
            int iLJIJ = LJIJ(iLIZ);
            if (iLJIJ != iLIZ) {
                if (userAllStoryMetadata == null) {
                    userAllStoryMetadata = new UserAllStoryMetadata(null, null, null, null, null, null, null);
                    User author3 = aweme.getAuthor();
                    if (author3 != null) {
                        author3.setAllStoryMetadata(userAllStoryMetadata);
                    }
                }
                userAllStoryMetadata.updateStoryChangeTime(System.currentTimeMillis());
            }
            AwemeExtKt.getAuthorUid(aweme);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getStatusFromAwemeV2: mergeStatus: ");
            sbLIZ2.append(iLJIJ);
            sbLIZ2.append("， verison: ");
            if (userAllStoryMetadata != null) {
                lValueOf = Long.valueOf(userAllStoryMetadata.version());
            } else {
                lValueOf = null;
            }
            sbLIZ2.append(lValueOf);
            sbLIZ2.append(" \nallStoryMetadata: ");
            User author4 = aweme.getAuthor();
            if (author4 != null && (allStoryMetadata = author4.getAllStoryMetadata()) != null && (list = allStoryMetadata.storyLiteMetadata) != null) {
                strLJIJI2 = LJIJI(list);
            }
            sbLIZ2.append(strLJIJI2);
            C727890Sgt.LIZIZ("StoryAvatarBizConfig", C2188811AlT.LIZIZ(sbLIZ2));
            return new C727780Sgi(iLJIJ, null, null, userAllStoryMetadata, hashSet, 14);
        }
        return new C727780Sgi(iLIZ, null, null, userAllStoryMetadata, hashSet, 14);
    }

    @Override // X.InterfaceC1605730rt5
    public final int LIZJ(Context context) {
        ColorConfig colorConfig = C1618440sDa.LIZIZ.LJJIJLIJ().LIZ().LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("badgeColor: ");
        sbLIZ.append(colorConfig);
        C2188811AlT.LIZIZ(sbLIZ);
        if (colorConfig.isShader) {
            return 0;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("get publish color ");
        sbLIZ2.append(colorConfig.singleColor);
        C2188811AlT.LIZIZ(sbLIZ2);
        Integer num = colorConfig.singleColor;
        if (num == null) {
            return 0;
        }
        return C694210RKx.LIZIZ(context, num);
    }

    @Override // X.InterfaceC1605730rt5
    public final C694200RKw LIZLLL(Context context) {
        return C694210RKx.LIZ(C1618440sDa.LIZIZ.LJJIJLIJ().LIZ().LIZ, context);
    }

    @Override // X.InterfaceC1605730rt5
    public final void LJ(String str) {
        C729220Sj2.LL.LJIIL(str);
        C1606250rtv.LIZ.remove(str);
    }

    @Override // X.InterfaceC1605730rt5
    public final C727780Sgi LJII(User user) {
        if (user == null) {
            return new C727780Sgi(-1, null, null, null, null, 62);
        }
        C727780Sgi c727780SgiLIZIZ = C1605650rsx.LIZIZ.LIZIZ(this.LIZ, user.getUid());
        if (c727780SgiLIZIZ == null) {
            c727780SgiLIZIZ = LJFF(user, null, null);
        }
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        user.getUid();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getStatusFromUserV2: useCache: ");
        sbLIZ.append(true);
        sbLIZ.append(", user(");
        sbLIZ.append(user.getNickname());
        sbLIZ.append(") status: ");
        sbLIZ.append(c727780SgiLIZIZ.LIZ);
        sbLIZ.append(", version: ");
        sbLIZ.append(c727780SgiLIZIZ.LIZIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c727890Sgt.getClass();
        C727890Sgt.LIZIZ("StoryAvatarBizConfig", strLIZIZ);
        return c727780SgiLIZIZ;
    }

    @Override // X.InterfaceC1605730rt5
    public final boolean LJIIIIZZ(EnumC1606080rte enumC1606080rte) {
        if (!C1601110rld.LIZ()) {
            return false;
        }
        switch (C1606100rtg.LIZ[enumC1606080rte.ordinal()]) {
        }
        return false;
    }

    @Override // X.InterfaceC1605730rt5
    public final InterfaceC1605840rtG LJIIIZ(EnumC1606080rte enumC1606080rte) {
        switch (C1606100rtg.LIZ[enumC1606080rte.ordinal()]) {
            case 1:
                return EnumC1606030rtZ.SEARCH;
            case 2:
                return EnumC1606030rtZ.FEED;
            case 3:
                return EnumC1606030rtZ.DM;
            case 4:
                return EnumC1606030rtZ.INBOX_TOP_LIST;
            case 5:
                return EnumC1606030rtZ.MY_PROFILE;
            case 6:
                return EnumC1606030rtZ.OTHER_PROFILE;
            case 7:
                return EnumC1606030rtZ.PROFILE_VIEWS;
            case 8:
                return EnumC1606030rtZ.INBOX;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC1606030rtZ.INBOX_SUGGESTED_ACCOUNT;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC1606030rtZ.COMMENT;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC1606030rtZ.REPOST_PANEL;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return EnumC1606030rtZ.FOLLOW_LIST;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return EnumC1606030rtZ.FOLLOW_SKYLIGHT;
            case 14:
                return EnumC1606030rtZ.FRIENDS_SKYLIGHT;
            case 15:
                return EnumC1606030rtZ.FYP_SKYLIGHT;
            case 16:
                return EnumC1606030rtZ.STORY_GUIDE_CARD;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return EnumC1606030rtZ.GROUP_CHAT;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return EnumC1606030rtZ.STORY_VIEWS_LIST_PANEL;
            case 19:
                return EnumC1606030rtZ.BIG_CARD;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return EnumC1606030rtZ.MUSIC_VIEW_HOLDER;
            case 21:
                return EnumC1606030rtZ.PROP_VIEW_HOLDER;
            case 22:
                return EnumC1606030rtZ.MUSIC_COVER_AVATAR;
            case 23:
                return EnumC1606030rtZ.SCHOOL_FRIENDS_LIST;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return EnumC1606030rtZ.ARCHIVE_V2;
            case 25:
                return EnumC1606030rtZ.INBOX_TOP_LIST;
            default:
                return EnumC1606030rtZ.OTHER;
        }
    }

    @Override // X.InterfaceC1605730rt5
    public final int[] LJIIL(Context context) {
        int[] iArr = new int[3];
        int i = 0;
        while (true) {
            int iIntValue = R.attr.ti;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ti, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            while (true) {
                iArr[i] = iIntValue;
                i++;
                if (i < 3) {
                    if (i != 0) {
                        iIntValue = R.attr.tj;
                        if (i != 1) {
                            if (i != 2) {
                                iIntValue = 0;
                            } else {
                                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.tj, context);
                                if (numLIZJ2 != null) {
                                    iIntValue = numLIZJ2.intValue();
                                } else {
                                    iIntValue = R.attr.tk;
                                }
                            }
                        } else {
                            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.tj, context);
                            if (numLIZJ3 != null) {
                                iIntValue = numLIZJ3.intValue();
                            }
                        }
                    }
                } else {
                    return iArr;
                }
            }
        }
    }

    @Override // X.InterfaceC1605730rt5
    public final C727780Sgi LJIILLIIL(String str) {
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMineStatusByAweme: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c727890Sgt.getClass();
        C727890Sgt.LIZ("StoryAvatarBizConfig", strLIZIZ);
        return LIZ(C728090ShD.LIZ.LJIIIIZZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    @Override // X.InterfaceC1605730rt5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = X.C1615106Ub.LIZIZ()
            if (r0 == 0) goto L75
            boolean r0 = X.C729510SjV.LJIILJJIL(r8)
            if (r0 == 0) goto L75
            boolean r0 = X.C1615106Ub.LIZIZ()
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            r4 = 0
            if (r0 == 0) goto L75
            java.lang.String r5 = r0.getUid()
            r6 = 1
            if (r5 == 0) goto L75
            int r0 = r5.length()
            if (r0 == 0) goto L75
            boolean r0 = X.C1615106Ub.LIZLLL()
            r3 = 3
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.story.experiment.MineStoryDiskCacheConfig r0 = X.C1615106Ub.LIZ()
            boolean r0 = r0.asyncLight
            if (r0 == 0) goto L76
            X.06Ua r0 = X.C1615006Ua.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C1615006Ua.LIZIZ
            if (r0 != 0) goto L53
            X.06UY r0 = X.C06UY.LIZ
            X.05Ch r1 = new X.05Ch
            r1.<init>(r5, r4)
            r0.getClass()
            X.054G r0 = X.C06UY.LJ
            X.C23250099c.LIZLLL(r0, r4, r4, r1, r3)
        L53:
            boolean r0 = X.C1615106Ub.LIZJ()
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.story.experiment.MineStoryDiskCacheConfig r0 = X.C1615106Ub.LIZ()
            boolean r0 = r0.asyncFull
            if (r0 == 0) goto L75
            X.06Ua r0 = X.C1615006Ua.LIZ
            r0.getClass()
            boolean r0 = X.C1615006Ua.LJ()
            if (r0 == 0) goto Lb8
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r1 = "MineStoryDiskCache"
            java.lang.String r0 = "tryLoadFullFromDiskAndMergeAsync: skip, memory already has full real data"
            X.C1720106oR.LJI(r1, r0)
        L75:
            return
        L76:
            X.06Ua r0 = X.C1615006Ua.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C1615006Ua.LIZIZ
            if (r0 != 0) goto L53
            boolean r0 = X.C1615106Ub.LIZLLL()
            if (r0 == 0) goto Lb3
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto Lb3
            java.lang.String r1 = r0.getUid()
            if (r1 == 0) goto Lb3
            int r0 = r1.length()
            if (r0 == 0) goto Lb3
            X.06UY r0 = X.C06UY.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = X.C06UY.LIZJ(r1)
            if (r2 == 0) goto Lb3
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C1615006Ua.LIZLLL
            r0.set(r6)
            X.C1615006Ua.LJFF(r2, r1)
        Lb0:
            X.C1615006Ua.LIZIZ = r2
            goto L53
        Lb3:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = X.C1615006Ua.LIZIZ()
            goto Lb0
        Lb8:
            X.06UY r0 = X.C06UY.LIZ
            X.05Ga r1 = new X.05Ga
            r1.<init>(r5, r4)
            r0.getClass()
            X.054G r0 = X.C06UY.LJ
            X.C23250099c.LIZLLL(r0, r4, r4, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C727750Sgf.LJIIZILJ(java.lang.String):void");
    }

    @Override // X.InterfaceC1605730rt5
    public final void LIZIZ(String str, final InterfaceC727810Sgl interfaceC727810Sgl) {
        C729220Sj2.LL.LJII(str, new InterfaceC729460SjQ() { // from class: X.0Sgj
            @Override // X.InterfaceC729460SjQ
            public final void LIZLLL(String str2) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LJI(C729450SjP c729450SjP, String str2) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LJFF() {
                this.LJIJJ();
                interfaceC727810Sgl.LJFF();
            }

            @Override // X.InterfaceC729460SjQ
            public final void LIZJ(float f) {
                interfaceC727810Sgl.LIZJ(f);
            }

            @Override // X.InterfaceC729460SjQ
            public final void LJ(String str2) {
                this.LJIJJ();
                interfaceC727810Sgl.LJIILIIL();
            }

            @Override // X.InterfaceC729460SjQ
            public final void LIZ(String str2, C0SPF c0spf) {
                if (c0spf.LIZIZ.LIZIZ == EnumC696090RSd.FAILED) {
                    interfaceC727810Sgl.onFailed();
                }
            }

            @Override // X.InterfaceC729460SjQ
            public final void LIZIZ(EnumC729410SjL enumC729410SjL, String str2) {
                interfaceC727810Sgl.LJIILJJIL(enumC729410SjL.getValue(), str2);
            }
        });
        C1606250rtv.LIZ.put(str, new InterfaceC1606260rtw() { // from class: X.0Sgm
            @Override // X.InterfaceC1606260rtw
            public final void LIZ() {
                interfaceC727810Sgl.LIZ();
            }

            @Override // X.InterfaceC1606260rtw
            public final void LJ() {
                interfaceC727810Sgl.LJ();
            }
        });
    }

    @Override // X.InterfaceC1605730rt5
    public final void LJIIJJI(String str, Map<String, ? extends Object> map) {
        Aweme awemeLJIIIZ;
        String string;
        UserStory userStory;
        UserStory userStory2;
        List<Aweme> stories;
        UserStory userStory3;
        UserStory userStory4;
        List<Aweme> stories2;
        if (Intrinsics.LJFF(str, "reveal_story")) {
            awemeLJIIIZ = C728090ShD.LIZ.LJIIIZ("reveal_story");
        } else {
            awemeLJIIIZ = C728090ShD.LIZ.LJIIIZ(str);
        }
        User user = null;
        int i = 1;
        if (awemeLJIIIZ == null || (!C1615106Ub.LIZIZ() ? !(((userStory = awemeLJIIIZ.getUserStory()) == null || !userStory.getFakeSelfStoryCollection()) && (userStory2 = awemeLJIIIZ.getUserStory()) != null && (stories = userStory2.getStories()) != null && !stories.isEmpty()) : !(((userStory3 = awemeLJIIIZ.getUserStory()) != null && userStory3.getFakeSelfStoryCollection()) || ((userStory4 = awemeLJIIIZ.getUserStory()) != null && (stories2 = userStory4.getStories()) != null && !stories2.isEmpty())))) {
            awemeLJIIIZ = null;
        }
        C1618440sDa.LIZIZ.LJJIIJ().LIZ(awemeLJIIIZ);
        if (awemeLJIIIZ == null) {
            i = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "is_hit_cache");
        C20684815ws.LJIILLIIL("story_cache_hit_event", c2344009Gk.LIZ);
        if (map != null) {
            C727760Sgg.LIZ.getClass();
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object obj = linkedHashMap.get("enter_from");
            if (obj != null) {
                string = obj.toString();
            } else {
                string = null;
            }
            C727760Sgg.LIZIZ = string;
            Object obj2 = linkedHashMap.get("story_click_user");
            if (obj2 instanceof User) {
                user = (User) obj2;
            }
            C727760Sgg.LIZJ = user;
        }
        C1603960rqE.LIZ = new C728350Shd(str, awemeLJIIIZ);
        C735840Sti.LIZ.getClass();
        C735840Sti.LIZIZ = "click";
        C727800Sgk.LIZ.put("detail_page", new C727850Sgp(System.currentTimeMillis()));
    }

    @Override // X.InterfaceC1605730rt5
    public final void LJIILIIL(final LifecycleOwner lifecycleOwner, AwS138S1100000_24 awS138S1100000_24) {
        Class cls;
        InterfaceC726980SfQ interfaceC726980SfQ = new InterfaceC726980SfQ() { // from class: X.0Sfu
            @Override // androidx.lifecycle.LifecycleOwner
            public final Lifecycle getLifecycle() {
                return lifecycleOwner.getLifecycle();
            }
        };
        final String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C2487409ou.LIZJ(new ARunnableS16S1200000_11(awS138S1100000_24, curUserId, interfaceC726980SfQ, 12));
            return;
        }
        InterfaceC2217241BqE[] interfaceC2217241BqEArr = new InterfaceC2217241BqE[0];
        final C727150Sfh c727150Sfh = C727150Sfh.LIZLLL;
        if (C727170Sfj.class == C727170Sfj.class) {
            cls = C727170Sfj.class;
        } else {
            cls = C727160Sfi.class;
        }
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(cls);
        StoryReceiver storyReceiver = new StoryReceiver(curUserId, interfaceC726980SfQ, c727150Sfh);
        if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C727170Sfj.class))) {
            c727150Sfh.LJ(interfaceC726980SfQ, storyReceiver);
        }
        storyReceiver.LLILZ = c727150Sfh.LIZLLL().LJJIL(new InterfaceC19483011Ki() { // from class: X.0Sfl
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                C727230Sfp c727230Sfp = (C727230Sfp) obj;
                if (Intrinsics.LJFF(c727150Sfh.LIZJ(c727230Sfp.LIZIZ, c727230Sfp.LIZJ), curUserId) && (!c727230Sfp.LIZ.isEmpty())) {
                    return true;
                }
                return false;
            }
        }).LJJJJZI(new AkS474S0100000_11(interfaceC2217241BqEArr, 3)).LJJII(c727150Sfh.LIZJ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS180S0100000_11(awS138S1100000_24, 16), new C09JN() { // from class: X.00PE
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("StoryAvatarBizConfig@8b09.observeMineAwemeCache$$inlined$subscribeUserStoryChanged$4");
                C1C7U.LIZIZ("StoryAvatarBizConfig@8b09.observeMineAwemeCache$$inlined$subscribeUserStoryChanged$4");
            }
        });
    }

    @Override // X.InterfaceC1605730rt5
    public final C727780Sgi LJFF(User user, UserFilterStoryInfo userFilterStoryInfo, UserAllStoryMetadata userAllStoryMetadata) {
        Set hashSet;
        boolean z;
        List<StoryLiteMetadata> list;
        String strLJIJI;
        List<StoryLiteMetadata> list2;
        List<Long> list3;
        if (user == null) {
            return new C727780Sgi(-1, null, null, null, null, 62);
        }
        UserAllStoryMetadata allStoryMetadata = user.getAllStoryMetadata();
        int storyStatus = user.getStoryStatus();
        if (userFilterStoryInfo != null && (list3 = userFilterStoryInfo.filterStoryIds) != null) {
            hashSet = C13LP.LLIIIZ(list3);
        } else {
            hashSet = new HashSet();
        }
        C727780Sgi c727780Sgi = new C727780Sgi(storyStatus, null, null, allStoryMetadata, hashSet, 14);
        if (C727450SgB.LIZ(user)) {
            c727780Sgi.LIZ = storyStatus;
        } else {
            UserAllStoryMetadata allStoryMetadata2 = user.getAllStoryMetadata();
            if (allStoryMetadata2 != null && (list = allStoryMetadata2.storyLiteMetadata) != null && (!list.isEmpty())) {
                z = true;
            } else {
                z = false;
            }
            c727780Sgi.LIZ = C708702ph.LIZ(c727780Sgi.LIZLLL, c727780Sgi.LJ, userAllStoryMetadata, true, z);
        }
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        user.getUid();
        StringBuilder sb = new StringBuilder("computeStoryStatusByMetaData, previousStatus: ");
        sb.append(storyStatus);
        sb.append(", currentStatus: ");
        sb.append(c727780Sgi.LIZ);
        sb.append(", ");
        if (allStoryMetadata != null && (list2 = allStoryMetadata.storyLiteMetadata) != null) {
            strLJIJI = LJIJI(list2);
        } else {
            strLJIJI = null;
        }
        sb.append(strLJIJI);
        sb.append('}');
        String string = sb.toString();
        c727890Sgt.getClass();
        C727890Sgt.LIZIZ("StoryAvatarBizConfig", string);
        if (C729510SjV.LJIILJJIL(user.getUid())) {
            c727780Sgi.LIZ = LJIJ(c727780Sgi.LIZ);
        }
        return c727780Sgi;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0205 A[EDGE_INSN: B:103:0x0204->B:104:0x0205 BREAK  A[LOOP:3: B:99:0x01ee->B:141:?], PHI: r3
      0x0205: PHI (r3v5 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:122:0x0271, B:103:0x0204] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0273  */
    @Override // X.InterfaceC1605730rt5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C727510SgH LJIILJJIL(java.lang.String r17, X.C727780Sgi r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C727750Sgf.LJIILJJIL(java.lang.String, X.0Sgi, java.lang.String):X.0SgH");
    }
}
