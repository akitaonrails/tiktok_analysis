package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewCardUI;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewSourceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTransData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0vvz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761290vvz {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final Boolean LJ;
    public final ReviewItemStruct.User LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public final Boolean LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final Integer LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final ReviewAspectItem LJIIZILJ;
    public final String LJIJ;
    public final boolean LJIJI;
    public final String LJIJJ;
    public final boolean LJIJJLI;
    public final ReviewCardUI LJIL;
    public final Integer LJJ;
    public final EnumC1407150min LJJI;
    public final ReviewTransData LJJIFFI;
    public final Boolean LJJII;
    public final String LJJIII;
    public final String LJJIIJ;
    public final ReviewSourceInfo LJJIIJZLJL;
    public final String LJJIIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1761290vvz() {
        boolean z = false;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, Integer.MAX_VALUE);
    }

    public static C1761290vvz LIZ(C1761290vvz c1761290vvz, Integer num, Boolean bool, boolean z, EnumC1407150min enumC1407150min, ReviewTransData reviewTransData, int i) {
        String str;
        String str2;
        String str3;
        ReviewItemStruct.User user;
        String str4;
        String str5;
        boolean z2;
        String str6;
        boolean z3;
        Boolean bool2;
        String str7;
        String str8;
        Integer num2;
        String str9;
        String str10;
        ReviewAspectItem reviewAspectItem;
        String str11;
        boolean z4;
        String str12;
        ReviewCardUI reviewCardUI;
        Integer num3;
        Boolean bool3;
        String str13;
        String str14;
        ReviewSourceInfo reviewSourceInfo;
        Integer num4 = num;
        ReviewTransData reviewTransData2 = reviewTransData;
        boolean z5 = z;
        EnumC1407150min enumC1407150min2 = enumC1407150min;
        Boolean bool4 = bool;
        String str15 = null;
        if ((i & 1) != 0) {
            str = c1761290vvz.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = c1761290vvz.LIZIZ;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = c1761290vvz.LIZJ;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            num4 = c1761290vvz.LIZLLL;
        }
        if ((i & 16) != 0) {
            bool4 = c1761290vvz.LJ;
        }
        if ((i & 32) != 0) {
            user = c1761290vvz.LJFF;
        } else {
            user = null;
        }
        if ((i & 64) != 0) {
            str4 = c1761290vvz.LJI;
        } else {
            str4 = null;
        }
        if ((i & 128) != 0) {
            str5 = c1761290vvz.LJII;
        } else {
            str5 = null;
        }
        if ((i & 256) != 0) {
            z2 = c1761290vvz.LJIIIIZZ;
        } else {
            z2 = false;
        }
        if ((i & 512) != 0) {
            str6 = c1761290vvz.LJIIIZ;
        } else {
            str6 = null;
        }
        if ((i & 1024) != 0) {
            z3 = c1761290vvz.LJIIJ;
        } else {
            z3 = false;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool2 = c1761290vvz.LJIIJJI;
        } else {
            bool2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str7 = c1761290vvz.LJIIL;
        } else {
            str7 = null;
        }
        if ((i & 8192) != 0) {
            str8 = c1761290vvz.LJIILIIL;
        } else {
            str8 = null;
        }
        if ((i & 16384) != 0) {
            num2 = c1761290vvz.LJIILJJIL;
        } else {
            num2 = null;
        }
        if ((32768 & i) != 0) {
            str9 = c1761290vvz.LJIILL;
        } else {
            str9 = null;
        }
        if ((65536 & i) != 0) {
            str10 = c1761290vvz.LJIILLIIL;
        } else {
            str10 = null;
        }
        if ((131072 & i) != 0) {
            reviewAspectItem = c1761290vvz.LJIIZILJ;
        } else {
            reviewAspectItem = null;
        }
        if ((262144 & i) != 0) {
            str11 = c1761290vvz.LJIJ;
        } else {
            str11 = null;
        }
        if ((524288 & i) != 0) {
            z4 = c1761290vvz.LJIJI;
        } else {
            z4 = false;
        }
        if ((1048576 & i) != 0) {
            str12 = c1761290vvz.LJIJJ;
        } else {
            str12 = null;
        }
        if ((2097152 & i) != 0) {
            z5 = c1761290vvz.LJIJJLI;
        }
        if ((4194304 & i) != 0) {
            reviewCardUI = c1761290vvz.LJIL;
        } else {
            reviewCardUI = null;
        }
        if ((8388608 & i) != 0) {
            num3 = c1761290vvz.LJJ;
        } else {
            num3 = null;
        }
        if ((16777216 & i) != 0) {
            enumC1407150min2 = c1761290vvz.LJJI;
        }
        if ((33554432 & i) != 0) {
            reviewTransData2 = c1761290vvz.LJJIFFI;
        }
        if ((67108864 & i) != 0) {
            bool3 = c1761290vvz.LJJII;
        } else {
            bool3 = null;
        }
        if ((134217728 & i) != 0) {
            str13 = c1761290vvz.LJJIII;
        } else {
            str13 = null;
        }
        if ((268435456 & i) != 0) {
            str14 = c1761290vvz.LJJIIJ;
        } else {
            str14 = null;
        }
        if ((536870912 & i) != 0) {
            reviewSourceInfo = c1761290vvz.LJJIIJZLJL;
        } else {
            reviewSourceInfo = null;
        }
        if ((i & 1073741824) != 0) {
            str15 = c1761290vvz.LJJIIZ;
        }
        return new C1761290vvz(str, str2, str3, num4, bool4, user, str4, str5, z2, str6, z3, bool2, str7, str8, num2, str9, str10, reviewAspectItem, str11, z4, str12, z5, reviewCardUI, num3, enumC1407150min2, reviewTransData2, bool3, str13, str14, reviewSourceInfo, str15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1761290vvz(String str, String str2, String str3, Integer num, Boolean bool, ReviewItemStruct.User user, String str4, String str5, boolean z, String str6, boolean z2, Boolean bool2, String str7, String str8, Integer num2, String str9, String str10, ReviewAspectItem reviewAspectItem, String str11, boolean z3, String str12, ReviewCardUI reviewCardUI, EnumC1407150min enumC1407150min, Boolean bool3, String str13, String str14, ReviewSourceInfo reviewSourceInfo, String str15, int i) {
        Integer numValueOf;
        String str16 = str14;
        EnumC1407150min enumC1407150min2 = enumC1407150min;
        String str17 = str12;
        String str18 = str10;
        String str19 = str9;
        Integer num3 = num2;
        ReviewCardUI reviewCardUI2 = reviewCardUI;
        ReviewSourceInfo reviewSourceInfo2 = reviewSourceInfo;
        String str20 = str8;
        String str21 = str7;
        boolean z4 = z;
        Boolean bool4 = bool2;
        boolean z5 = z3;
        String str22 = str4;
        boolean z6 = z2;
        String str23 = str13;
        String str24 = str5;
        Integer num4 = num;
        Boolean bool5 = bool3;
        String str25 = str11;
        ReviewItemStruct.User user2 = user;
        Boolean bool6 = bool;
        ReviewAspectItem reviewAspectItem2 = reviewAspectItem;
        String str26 = str3;
        String str27 = str2;
        String str28 = (i & 1) != 0 ? "" : str;
        int i2 = i & 2;
        String str29 = CardStruct.IStatusCode.DEFAULT;
        str27 = i2 != 0 ? CardStruct.IStatusCode.DEFAULT : str27;
        str26 = (i & 4) != 0 ? null : str26;
        num4 = (i & 8) != 0 ? null : num4;
        bool6 = (i & 16) != 0 ? null : bool6;
        user2 = (i & 32) != 0 ? null : user2;
        str22 = (i & 64) != 0 ? null : str22;
        str24 = (i & 128) != 0 ? null : str24;
        z4 = (i & 256) != 0 ? false : z4;
        str29 = (i & 512) == 0 ? str6 : str29;
        z6 = (i & 1024) != 0 ? false : z6;
        bool4 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? Boolean.FALSE : bool4;
        str21 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str21;
        str20 = (i & 8192) != 0 ? null : str20;
        num3 = (i & 16384) != 0 ? null : num3;
        str19 = (32768 & i) != 0 ? null : str19;
        str18 = (65536 & i) != 0 ? null : str18;
        reviewAspectItem2 = (131072 & i) != 0 ? null : reviewAspectItem2;
        str25 = (262144 & i) != 0 ? null : str25;
        z5 = (524288 & i) != 0 ? true : z5;
        str17 = (1048576 & i) != 0 ? null : str17;
        reviewCardUI2 = (4194304 & i) != 0 ? null : reviewCardUI2;
        if ((8388608 & i) != 0) {
            numValueOf = Integer.valueOf(C04G9.VIEW_TRANSLATION.getValue());
        } else {
            numValueOf = null;
        }
        this(str28, str27, str26, num4, bool6, user2, str22, str24, z4, str29, z6, bool4, str21, str20, num3, str19, str18, reviewAspectItem2, str25, z5, str17, false, reviewCardUI2, numValueOf, (16777216 & i) != 0 ? EnumC1407150min.NONE : enumC1407150min2, null, (67108864 & i) != 0 ? Boolean.FALSE : bool5, (134217728 & i) != 0 ? null : str23, (268435456 & i) != 0 ? null : str16, (536870912 & i) != 0 ? null : reviewSourceInfo2, (i & 1073741824) == 0 ? str15 : null);
    }

    public C1761290vvz(String str, String str2, String str3, Integer num, Boolean bool, ReviewItemStruct.User user, String str4, String str5, boolean z, String str6, boolean z2, Boolean bool2, String str7, String str8, Integer num2, String str9, String str10, ReviewAspectItem reviewAspectItem, String str11, boolean z3, String str12, boolean z4, ReviewCardUI reviewCardUI, Integer num3, EnumC1407150min enumC1407150min, ReviewTransData reviewTransData, Boolean bool3, String str13, String str14, ReviewSourceInfo reviewSourceInfo, String str15) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = num;
        this.LJ = bool;
        this.LJFF = user;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = z;
        this.LJIIIZ = str6;
        this.LJIIJ = z2;
        this.LJIIJJI = bool2;
        this.LJIIL = str7;
        this.LJIILIIL = str8;
        this.LJIILJJIL = num2;
        this.LJIILL = str9;
        this.LJIILLIIL = str10;
        this.LJIIZILJ = reviewAspectItem;
        this.LJIJ = str11;
        this.LJIJI = z3;
        this.LJIJJ = str12;
        this.LJIJJLI = z4;
        this.LJIL = reviewCardUI;
        this.LJJ = num3;
        this.LJJI = enumC1407150min;
        this.LJJIFFI = reviewTransData;
        this.LJJII = bool3;
        this.LJJIII = str13;
        this.LJJIIJ = str14;
        this.LJJIIJZLJL = reviewSourceInfo;
        this.LJJIIZ = str15;
    }
}
