package X;

import Y.AkS71S1200000_3;
import com.bytedance.touchpoint.api.model.Animation;
import com.bytedance.touchpoint.api.model.ECReferralFeedPicture;
import com.bytedance.touchpoint.api.model.FeedBannerSpecialCardPicture;
import com.bytedance.touchpoint.api.model.FeedCommonPicture;
import com.bytedance.touchpoint.api.model.LynxFeedBannerPicture;
import com.bytedance.touchpoint.api.model.MultipleRewardConfig;
import com.bytedance.touchpoint.api.model.Picture;
import com.bytedance.touchpoint.api.model.PopupView;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.touchpoint.api.model.Video;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS152S1100000_3;
import kotlin.jvm.internal.AwS160S1100000_11;
import kotlin.jvm.internal.AwS188S0000000_3;
import kotlin.jvm.internal.AwS237S0300000_28;
import kotlin.jvm.internal.AwS272S0300000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS50S2100000_3;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zTH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897250zTH {
    public static final Object LJIIIIZZ = new Object();
    public static final C01GW<HashMap<String, C1897250zTH>> LJIIIZ = C452501pT.LIZIZ(new C1897270zTJ());
    public final int LIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public final Object LIZIZ = new Object();
    public final HashSet<String> LJ = new HashSet<>();
    public final Map<String, ReferralFeedBanner> LJFF = new LinkedHashMap();
    public final AtomicBoolean LJI = new AtomicBoolean(false);
    public final C01GW LJII = C452501pT.LIZIZ(new C1303650k1r());

    public final int LIZIZ() {
        int iLJFF;
        synchronized (this.LIZIZ) {
            try {
                iLJFF = LJFF();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLJFF;
    }

    public final int LJFF() {
        int i;
        synchronized (this.LIZIZ) {
            try {
                i = this.LIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    public final String LJIIIIZZ() {
        return (String) this.LJII.getValue();
    }

    public final void LJIIIZ() {
        synchronized (this.LIZIZ) {
            try {
                LJIIL(LJFF() + 1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIJJI() {
        List<Picture> list;
        List<ECReferralFeedPicture> list2;
        List<FeedBannerSpecialCardPicture> list3;
        List<Video> list4;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        ReferralFeedBanner referralFeedBanner = (ReferralFeedBanner) C2178808gE.LIZ().LJ(this.LIZ);
        int size = 0;
        if (referralFeedBanner != null) {
            int i = referralFeedBanner.bannerType;
            if (i != 1) {
                if (i != 9) {
                    if (i != 10) {
                        if (referralFeedBanner != null && (list4 = referralFeedBanner.videos) != null) {
                            size = list4.size();
                        }
                    } else if (referralFeedBanner != null && (list3 = referralFeedBanner.feedBannerSpecialCardPicture) != null) {
                        size = list3.size();
                    }
                } else if (referralFeedBanner != null && (list2 = referralFeedBanner.ecReferralFeedPictures) != null) {
                    size = list2.size();
                }
            } else if (referralFeedBanner != null && (list = referralFeedBanner.pictures) != null) {
                size = list.size();
            }
        }
        LJIILLIIL(size);
    }

    public C1897250zTH(int i) {
        this.LIZ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(com.bytedance.touchpoint.api.model.ReferralFeedBanner r15) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1897250zTH.LIZ(com.bytedance.touchpoint.api.model.ReferralFeedBanner):boolean");
    }

    public final void LJ(ReferralFeedBanner referralFeedBanner) {
        Integer numValueOf;
        List<FeedBannerSpecialCardPicture> list;
        FeedBannerSpecialCardPicture feedBannerSpecialCardPicture;
        ECReferralFeedPicture eCReferralFeedPicture;
        FeedCommonPicture feedCommonPicture;
        Animation animation;
        Picture picture;
        String str;
        String str2;
        String str3;
        Video video;
        PopupView popupView;
        List<? extends Map<String, Object>> list2;
        LynxFeedBannerPicture lynxFeedBannerPicture;
        Map map;
        if (this.LIZLLL) {
            return;
        }
        int iLIZIZ = LIZIZ();
        String str4 = null;
        if (referralFeedBanner != null && (numValueOf = Integer.valueOf(referralFeedBanner.bannerType)) != null) {
            if (numValueOf.intValue() == 100) {
                List<LynxFeedBannerPicture> list3 = referralFeedBanner.LJII;
                if (list3 == null || (list2 = referralFeedBanner.lynxFeedBannerPicture) == null || (lynxFeedBannerPicture = (LynxFeedBannerPicture) C13LP.LJJJLZIJ(iLIZIZ, list3)) == null || (map = (Map) C13LP.LJJJLZIJ(iLIZIZ, list2)) == null) {
                    return;
                }
                C01GW<C759500Tqm> c01gw = C759500Tqm.LJ;
                C759500Tqm c759500TqmLIZ = C739380SzQ.LIZ();
                c759500TqmLIZ.getClass();
                String str5 = lynxFeedBannerPicture.jsSource;
                if (str5 != null && str5.length() != 0 && !c759500TqmLIZ.LIZIZ.containsKey(lynxFeedBannerPicture.jsSource)) {
                    if (!C13LP.LJJJJ(lynxFeedBannerPicture.jsSource, c759500TqmLIZ.LIZJ)) {
                        HashSet<String> hashSet = c759500TqmLIZ.LIZJ;
                        String str6 = lynxFeedBannerPicture.jsSource;
                        String str7 = "";
                        if (str6 == null) {
                            str6 = "";
                        }
                        hashSet.add(str6);
                        String str8 = lynxFeedBannerPicture.jsSource;
                        if (str8 == null) {
                            str8 = "";
                        }
                        C1894200zOM c1894200zOM = new C1894200zOM(str8, lynxFeedBannerPicture, map);
                        ConcurrentHashMap<String, C1894200zOM> concurrentHashMap = c759500TqmLIZ.LIZIZ;
                        String str9 = lynxFeedBannerPicture.jsSource;
                        if (str9 != null) {
                            str7 = str9;
                        }
                        concurrentHashMap.put(str7, c1894200zOM);
                        C01U6.LIZIZ(new AwS572S0100000_28(c1894200zOM, 999));
                        return;
                    }
                    return;
                }
                return;
            }
            if (numValueOf.intValue() == 2) {
                List<Video> list4 = referralFeedBanner.videos;
                if (list4 == null || (video = (Video) C13LP.LJJJLZIJ(iLIZIZ, list4)) == null || (popupView = video.popupView) == null) {
                    return;
                }
                LIZJ(referralFeedBanner, popupView.widgetImage, new AwS607S0100000_28(popupView, 335));
                return;
            }
            if (numValueOf.intValue() == 1) {
                List<Picture> list5 = referralFeedBanner.pictures;
                if (list5 == null || (picture = (Picture) C13LP.LJJJLZIJ(iLIZIZ, list5)) == null) {
                    return;
                }
                Animation animation2 = picture.animation;
                if (animation2 != null) {
                    str = animation2.lottie;
                } else {
                    str = null;
                }
                if (C1723230uwb.LIZJ(str)) {
                    Animation animation3 = picture.animation;
                    if (animation3 != null) {
                        str3 = animation3.lottieMd5;
                    } else {
                        str3 = null;
                    }
                    if (C1723230uwb.LIZJ(str3)) {
                        Animation animation4 = picture.animation;
                        if (animation4 == null) {
                            return;
                        }
                        LIZLLL(animation4, referralFeedBanner);
                        return;
                    }
                }
                Animation animation5 = picture.animation;
                if (animation5 == null || (str2 = animation5.LIZIZ) == null || str2.length() == 0) {
                    Animation animation6 = picture.animation;
                    if (animation6 != null) {
                        str4 = animation6.coverImage;
                    }
                    LIZJ(referralFeedBanner, str4, new AwS607S0100000_28(picture, 336));
                }
                String str10 = picture.LIZ;
                if (str10 == null || str10.length() == 0) {
                    LIZJ(referralFeedBanner, picture.bgImage, new AwS607S0100000_28(picture, 337));
                    return;
                }
                return;
            }
            if (numValueOf.intValue() == 8) {
                List<FeedCommonPicture> list6 = referralFeedBanner.feedCommonPictures;
                if (list6 == null || (feedCommonPicture = (FeedCommonPicture) C13LP.LJJJLZIJ(iLIZIZ, list6)) == null || (animation = feedCommonPicture.animation) == null) {
                    return;
                }
                LIZLLL(animation, referralFeedBanner);
                return;
            }
            if (numValueOf.intValue() == 9) {
                List<ECReferralFeedPicture> list7 = referralFeedBanner.ecReferralFeedPictures;
                if (list7 != null && (eCReferralFeedPicture = (ECReferralFeedPicture) C13LP.LJJJLZIJ(iLIZIZ, list7)) != null) {
                    LIZJ(referralFeedBanner, eCReferralFeedPicture.backgroundImage, new AwS607S0100000_28(eCReferralFeedPicture, 338));
                    LIZJ(referralFeedBanner, eCReferralFeedPicture.coverImage, new AwS607S0100000_28(eCReferralFeedPicture, 339));
                    return;
                }
                return;
            }
            if (numValueOf.intValue() == 10 && (list = referralFeedBanner.feedBannerSpecialCardPicture) != null && (feedBannerSpecialCardPicture = (FeedBannerSpecialCardPicture) C13LP.LJJJLZIJ(iLIZIZ, list)) != null) {
                LIZJ(referralFeedBanner, feedBannerSpecialCardPicture.backgroundImage, new AwS607S0100000_28(feedBannerSpecialCardPicture, 340));
                MultipleRewardConfig multipleRewardConfig = feedBannerSpecialCardPicture.multipleRewardConfig;
                if (multipleRewardConfig != null) {
                    str4 = multipleRewardConfig.multipleRewardImg;
                }
                LIZJ(referralFeedBanner, str4, new AwS607S0100000_28(feedBannerSpecialCardPicture, 341));
                Animation animation7 = feedBannerSpecialCardPicture.animation;
                if (animation7 == null) {
                    return;
                }
                LIZLLL(animation7, referralFeedBanner);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File LJI(java.lang.String r10) {
        /*
            r9 = this;
            r8 = 0
            r7 = 0
            if (r10 == 0) goto Lb
            int r0 = r10.length()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L14
            X.C189200o6.m2constructorimpl(r8)     // Catch: java.lang.Throwable -> L6d
            return r8
        L14:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = r9.LJIIIIZZ()     // Catch: java.lang.Throwable -> L6d
            r1.append(r0)     // Catch: java.lang.Throwable -> L6d
            r1.append(r10)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L6d
            X.0VSJ r0 = new X.0VSJ     // Catch: java.lang.Throwable -> L6d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6d
            java.io.File[] r6 = r0.listFiles()     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L6c
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6d
            r5.<init>()     // Catch: java.lang.Throwable -> L6d
            int r4 = r6.length     // Catch: java.lang.Throwable -> L6d
            r3 = 0
        L38:
            if (r3 >= r4) goto L5a
            r2 = r6[r3]     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r2.isFile()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L4f
            java.lang.String r1 = X.C08QA.LJIJ(r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = "json"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L4f
            goto L51
        L4f:
            r0 = 0
            goto L52
        L51:
            r0 = 1
        L52:
            if (r0 == 0) goto L57
            r5.add(r2)     // Catch: java.lang.Throwable -> L6d
        L57:
            int r3 = r3 + 1
            goto L38
        L5a:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L6d
            r0 = r0 ^ 1
            if (r0 != 0) goto L63
            r5 = r8
        L63:
            if (r5 == 0) goto L6c
            java.lang.Object r0 = r5.get(r7)     // Catch: java.lang.Throwable -> L6d
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L6d
            return r0
        L6c:
            return r8
        L6d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1897250zTH.LJI(java.lang.String):java.io.File");
    }

    public final ReferralFeedBanner LJII(String str) {
        return (ReferralFeedBanner) C01U6.LJ(new AwS160S1100000_11(str, this, 12), null);
    }

    public final void LJIIL(int i) {
        synchronized (this.LIZIZ) {
            try {
                this.LIZJ = i;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final String LJIILJJIL(String str) {
        return (String) C01U6.LJ(new AwS152S1100000_3(str, this, 13), null);
    }

    public final void LJIILLIIL(int i) {
        synchronized (this.LIZIZ) {
            try {
                LJIIL(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(final Animation animation, final ReferralFeedBanner referralFeedBanner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(animation.lottieMd5);
        sbLIZ.append(".zip");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0VSJ c0vsj = new C0VSJ(LJIIIIZZ(), strLIZIZ);
        if (C0T82.LIZ(c0vsj, animation.lottieMd5)) {
            File fileLJI = LJI(animation.lottieMd5);
            if (fileLJI != null) {
                animation.LIZ = fileLJI.getAbsolutePath();
                return;
            } else {
                LJIILL(c0vsj, animation.lottieMd5, new AwS607S0100000_28(animation, 342));
                return;
            }
        }
        this.LIZLLL = true;
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ == null) {
            return;
        }
        interfaceC1897260zTILIZIZ.LJIIIIZZ(3, new C1B8G() { // from class: X.0zTQ
            @Override // X.C1B8G
            public final void LIZ() {
            }

            @Override // X.C1B8G
            public final void LIZIZ() {
            }

            @Override // X.C1B8G
            public final void LJ(C1897470zTd c1897470zTd) {
            }

            @Override // X.C1B8G
            public final void onCanceled() {
            }

            @Override // X.C1B8G
            public final void LIZJ(C1897470zTd c1897470zTd) {
                int iIntValue;
                String string;
                Throwable th;
                C1897250zTH c1897250zTH = this;
                new AwS272S0300000_28(referralFeedBanner, c1897250zTH, c1897470zTd, 23);
                c1897250zTH.getClass();
                C1897250zTH c1897250zTH2 = this;
                c1897250zTH2.LIZLLL = false;
                c1897250zTH2.LJIIIZ();
                this.LJ(referralFeedBanner);
                C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                int i = referralFeedBanner.LIZ;
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("block_reason", "resource_load_fail"));
                c1894320zOY.getClass();
                C1894320zOY.LJIILIIL(i, mapLJIIJ);
                C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                ReferralFeedBanner referralFeedBanner2 = referralFeedBanner;
                int i2 = referralFeedBanner2.LIZ;
                Integer num = referralFeedBanner2.LIZJ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                if (c1897470zTd == null || (th = c1897470zTd.LIZJ) == null || (string = th.toString()) == null) {
                    string = "download fail";
                }
                c1893680zNW.getClass();
                C1893680zNW.LIZ(0, i2, iIntValue, 1, string);
            }

            @Override // X.C1B8G
            public final void LIZLLL(C1897470zTd c1897470zTd) {
                String str;
                C1897250zTH c1897250zTH = this;
                new AwS429S0200000_28(referralFeedBanner, c1897250zTH, 138);
                c1897250zTH.getClass();
                if (c1897470zTd != null && (str = c1897470zTd.LIZIZ) != null) {
                    Animation animation2 = animation;
                    C1897250zTH c1897250zTH2 = this;
                    ReferralFeedBanner referralFeedBanner2 = referralFeedBanner;
                    C0VSJ c0vsj2 = new C0VSJ(str);
                    if (C0T82.LIZ(c0vsj2, animation2.lottieMd5)) {
                        c1897250zTH2.LJIILL(c0vsj2, animation2.lottieMd5, new AwS237S0300000_28(animation2, referralFeedBanner2, c1897250zTH2, 13));
                    }
                }
            }
        }, animation.lottie, LJIIIIZZ(), strLIZIZ, "referral lottie", true);
    }

    public final void LJIIJ(String str, boolean z) {
        List<LynxFeedBannerPicture> list;
        LynxFeedBannerPicture lynxFeedBannerPicture;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        ReferralFeedBanner referralFeedBanner = (ReferralFeedBanner) C2178808gE.LIZ().LJ(this.LIZ);
        if (referralFeedBanner == null || referralFeedBanner.bannerType != 100 || (list = referralFeedBanner.LJII) == null || (lynxFeedBannerPicture = (LynxFeedBannerPicture) C13LP.LJJJLZIJ(LIZIZ() - 1, list)) == null) {
            return;
        }
        String str2 = "";
        if (z) {
            C1894220zOO.LIZ(0, lynxFeedBannerPicture.jsSource, null);
            C01GW<C759500Tqm> c01gw2 = C759500Tqm.LJ;
            C759500Tqm c759500TqmLIZ = C739380SzQ.LIZ();
            String str3 = lynxFeedBannerPicture.jsSource;
            if (str3 != null) {
                str2 = str3;
            }
            C1894200zOM c1894200zOMLIZJ = c759500TqmLIZ.LIZJ(str2);
            if (c1894200zOMLIZJ != null && Intrinsics.LJFF(c1894200zOMLIZJ.LLJIJIL, C1894280zOU.LIZIZ)) {
                C01U6.LIZIZ(new AwS188S0000000_3("insert", 1));
                c1894200zOMLIZJ.LLJIJIL = C1894260zOS.LIZIZ;
                return;
            }
            return;
        }
        C1894220zOO.LIZ(-1, lynxFeedBannerPicture.jsSource, str);
        C01GW<C759500Tqm> c01gw3 = C759500Tqm.LJ;
        C759500Tqm c759500TqmLIZ2 = C739380SzQ.LIZ();
        String str4 = lynxFeedBannerPicture.jsSource;
        if (str4 != null) {
            str2 = str4;
        }
        c759500TqmLIZ2.LIZIZ(str2, "InsertFailed");
    }

    public final String LJIILIIL(String str, String str2) {
        return (String) C01U6.LJ(new AwS50S2100000_3(str, str2, this, 2), null);
    }

    public final void LIZJ(final ReferralFeedBanner referralFeedBanner, String str, final Function1<? super String, Unit> function1) {
        if (str == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C08HM.LIZJ(str));
        sbLIZ.append(".png");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZLLL = true;
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LJIIIIZZ(2, new C1B8G() { // from class: X.0zTR
                @Override // X.C1B8G
                public final void LIZ() {
                }

                @Override // X.C1B8G
                public final void LIZIZ() {
                }

                @Override // X.C1B8G
                public final void onCanceled() {
                }

                @Override // X.C1B8G
                public final void LIZJ(C1897470zTd c1897470zTd) {
                    int iIntValue;
                    String string;
                    Throwable th;
                    C1897250zTH c1897250zTH = this.LIZ;
                    new AwS272S0300000_28(referralFeedBanner, c1897250zTH, c1897470zTd, 22);
                    c1897250zTH.getClass();
                    C1897250zTH c1897250zTH2 = this.LIZ;
                    c1897250zTH2.LIZLLL = false;
                    c1897250zTH2.LJIIIZ();
                    this.LIZ.LJ(referralFeedBanner);
                    C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                    int i = referralFeedBanner.LIZ;
                    Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("block_reason", "resource_load_fail"));
                    c1894320zOY.getClass();
                    C1894320zOY.LJIILIIL(i, mapLJIIJ);
                    C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                    ReferralFeedBanner referralFeedBanner2 = referralFeedBanner;
                    int i2 = referralFeedBanner2.LIZ;
                    Integer num = referralFeedBanner2.LIZJ;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    if (c1897470zTd == null || (th = c1897470zTd.LIZJ) == null || (string = th.toString()) == null) {
                        string = "download fail";
                    }
                    c1893680zNW.getClass();
                    C1893680zNW.LIZ(0, i2, iIntValue, 1, string);
                }

                @Override // X.C1B8G
                public final void LIZLLL(C1897470zTd c1897470zTd) {
                    String str2;
                    int iIntValue;
                    C1897250zTH c1897250zTH = this.LIZ;
                    new AwS429S0200000_28(referralFeedBanner, c1897250zTH, 137);
                    c1897250zTH.getClass();
                    Function1<String, Unit> function12 = function1;
                    if (c1897470zTd == null || (str2 = c1897470zTd.LIZIZ) == null) {
                        str2 = "";
                    }
                    function12.invoke(str2);
                    this.LIZ.LIZLLL = false;
                    C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                    ReferralFeedBanner referralFeedBanner2 = referralFeedBanner;
                    int i = referralFeedBanner2.LIZ;
                    Integer num = referralFeedBanner2.LIZJ;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    c1893680zNW.getClass();
                    C1893680zNW.LIZ(1, i, iIntValue, 1, "");
                }

                @Override // X.C1B8G
                public final void LJ(C1897470zTd c1897470zTd) {
                    C1897250zTH c1897250zTH = this.LIZ;
                    new AwS429S0200000_28(referralFeedBanner, c1897470zTd, 136);
                    c1897250zTH.getClass();
                }
            }, str, LJIIIIZZ(), strLIZIZ, "refferal image", true);
        }
    }

    public final void LJIILL(C0VSJ c0vsj, String str, Function1 function1) {
        if (str != null && str.length() != 0) {
            C11NZ.LJJJJZ("").LJL(C11S5.LIZ()).LJJJJZI(new AkS71S1200000_3(str, this, c0vsj, 1)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C516201zk(function1, 297));
        }
    }
}
