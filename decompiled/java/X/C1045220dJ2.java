package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vast.model.AdVerification;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS251S0000000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dJ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045220dJ2 {
    public static final C1045220dJ2 LIZ = new C1045220dJ2();
    public static final Regex LIZIZ = new Regex("(\\d+)%");
    public static final Regex LIZJ = new Regex("(\\d{2}):(\\d{2}):(\\d{2})");

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C588660N6y LIZ(com.ss.android.ugc.aweme.commercialize.model.OmVast r8) {
        /*
            X.0N6y r3 = new X.0N6y
            java.lang.String r4 = "android_legacy"
            int r1 = r8.providerType
            r0 = 2
            r2 = 3
            if (r1 == r0) goto L35
            if (r1 == r2) goto L32
            java.lang.String r5 = "unknown"
        Le:
            int r0 = r8.creative_type
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L2f
            int r0 = r1.intValue()
            if (r0 != r2) goto L25
            java.lang.String r6 = "display"
        L1e:
            r7 = 0
            r8 = 18
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L25:
            int r1 = r1.intValue()
            r0 = 4
            if (r1 != r0) goto L2f
            java.lang.String r6 = "video"
            goto L1e
        L2f:
            java.lang.String r6 = ""
            goto L1e
        L32:
            java.lang.String r5 = "dsp"
            goto Le
        L35:
            java.lang.String r5 = "local"
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1045220dJ2.LIZ(com.ss.android.ugc.aweme.commercialize.model.OmVast):X.0N6y");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.vast.model.AdVerification LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r2) {
        /*
            r1 = 0
            if (r2 == 0) goto La
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r2)
            if (r0 != 0) goto Lf
            r1 = 1
        La:
            r0 = 0
            if (r1 != 0) goto L17
            if (r2 == 0) goto L13
        Lf:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r2.getAwemeRawAd()
        L13:
            com.bytedance.vast.model.AdVerification r0 = LJ(r0)
        L17:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1045220dJ2.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme):com.bytedance.vast.model.AdVerification");
    }

    public static final AdVerification LJ(AwemeRawAd awemeRawAd) {
        List<AdVerification> list;
        C1045270dJ7 c1045270dJ7;
        List<AdVerification> list2;
        AdVerification adVerification;
        C1045270dJ7 c1045270dJ72;
        List<AdVerification> list3;
        OmVast omVast;
        boolean z = false;
        if (awemeRawAd != null && (omVast = awemeRawAd.getOmVast()) != null && omVast.providerType == 3) {
            z = true;
        }
        if (z) {
            OmVast omVast2 = awemeRawAd.getOmVast();
            if (omVast2 == null || (c1045270dJ72 = omVast2.vast) == null || (list3 = c1045270dJ72.adVerificationList) == null) {
                return null;
            }
            return (AdVerification) C13LP.LJJJLL(list3);
        }
        if (awemeRawAd == null) {
            return null;
        }
        OmVast omVast3 = awemeRawAd.getOmVast();
        if (omVast3 != null && (c1045270dJ7 = omVast3.vast) != null && (list2 = c1045270dJ7.adVerificationList) != null && (adVerification = (AdVerification) C13LP.LJJJLL(list2)) != null) {
            return adVerification;
        }
        OmVast omVast4 = awemeRawAd.getOmVast();
        if (omVast4 == null || (list = omVast4.adVerificationList) == null) {
            return null;
        }
        return (AdVerification) C13LP.LJJJLL(list);
    }

    public static C1045060dIm LJFF(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return LJI(awemeRawAd);
        }
        return null;
    }

    public static C1045060dIm LJI(AwemeRawAd awemeRawAd) {
        Sequence sequenceLIZJ;
        OmVast omVast;
        C1045270dJ7 c1045270dJ7;
        List<C1045260dJ6> list;
        if (awemeRawAd != null && (omVast = awemeRawAd.getOmVast()) != null && (c1045270dJ7 = omVast.vast) != null && (list = c1045270dJ7.creativeList) != null) {
            sequenceLIZJ = C09RB.LJIILIIL(new C1939607ik(list), new AwS251S0000000_16(3));
        } else {
            sequenceLIZJ = C09R4.LIZJ();
        }
        return (C1045060dIm) C09RB.LJIIL(sequenceLIZJ);
    }

    public static final boolean LJII(Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        OmVast omVast;
        if (aweme == null || (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) == null || (omVast = awemeRawAdLJJIJLIJ.getOmVast()) == null) {
            return false;
        }
        if (!AwemeExtKt.isPhotoMode(aweme) && omVast.creative_type != 3) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getOmVast() != null && LJ(awemeRawAd) != null) {
            try {
                if (!C0CLW.LIZIZ.LIZ.getDisableOmSdk().booleanValue()) {
                    return true;
                }
                return false;
            } catch (C316660CbA e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                return false;
            }
        }
        return false;
    }

    public static final boolean LJIIIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getOmVast() != null) {
            if (LJ(awemeRawAd) == null) {
                return true;
            }
            try {
                if (C0CLW.LIZIZ.LIZ.getDisableOmSdk().booleanValue()) {
                    return true;
                }
            } catch (C316660CbA e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.BitRate LJIIL(X.C1045280dJ8 r7) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1045220dJ2.LJIIL(X.0dJ8):com.ss.android.ugc.aweme.feed.model.BitRate");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0163 A[PHI: r2
      0x0163: PHI (r2v1 kotlin.sequences.Sequence) = 
      (r2v0 kotlin.sequences.Sequence)
      (r2v8 kotlin.sequences.Sequence)
      (r2v8 kotlin.sequences.Sequence)
      (r2v8 kotlin.sequences.Sequence)
      (r2v8 kotlin.sequences.Sequence)
     binds: [B:59:0x015f, B:17:0x002f, B:19:0x0035, B:21:0x0039, B:23:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILIIL(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1045220dJ2.LJIILIIL(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public static final void LJIIZILJ(C1045070dIn c1045070dIn) {
        List<C1045060dIm> list;
        if (c1045070dIn != null && (list = c1045070dIn.clickList) != null) {
            LJIILL(C09RB.LJIIJ(C09RB.LJIILIIL(new C1939607ik(list), AFwS252S0000000_16.get$arr$(389)), AFwS252S0000000_16.get$arr$(390)), null);
        }
    }

    public static final void LJIJI(Aweme aweme) {
        boolean z;
        OmVast omVast;
        String str;
        String str2;
        String str3;
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme)) {
            z = true;
        } else {
            z = false;
        }
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
        if (awemeRawAdLJJIJLIJ != null && (omVast = awemeRawAdLJJIJLIJ.getOmVast()) != null) {
            List<AdVerification> list = omVast.adVerificationList;
            if (((list != null && !list.isEmpty()) || (((str = omVast.vastContent) != null && str.length() != 0) || (((str2 = omVast.vastUrl) != null && str2.length() != 0) || ((str3 = omVast.vastTemplate) != null && str3.length() != 0)))) && z) {
                omVast.creative_type = 3;
                omVast.impression_type = 4;
            }
        }
    }

    public static long LJIILJJIL(long j, String str) {
        MatchResult matchResultMatchEntire = LIZIZ.matchEntire(str);
        if (matchResultMatchEntire != null) {
            return (j * ((long) 100)) / ((long) CastIntegerProtector.parseInt(matchResultMatchEntire.getGroups().LJ(1).LIZ));
        }
        MatchResult matchResultMatchEntire2 = LIZJ.matchEntire(str);
        if (matchResultMatchEntire2 != null) {
            return TimeUnit.HOURS.toMillis(CastLongProtector.parseLong(matchResultMatchEntire2.getGroups().LJ(1).LIZ)) + TimeUnit.MINUTES.toMillis(CastLongProtector.parseLong(matchResultMatchEntire2.getGroups().LJ(2).LIZ)) + TimeUnit.SECONDS.toMillis(CastLongProtector.parseLong(matchResultMatchEntire2.getGroups().LJ(3).LIZ));
        }
        return -1L;
    }

    public static final void LJIILL(Sequence sequence, C1045290dJ9 c1045290dJ9) {
        C846580XIy.LIZ(c1045290dJ9, C09RB.LJJIII(new C08LY(C09RB.LJIIJJI(sequence), AFwS252S0000000_16.get$arr$(382))));
    }

    public static void LIZJ(C1045260dJ6 c1045260dJ6, Aweme aweme, C1045070dIn c1045070dIn) {
        if (c1045070dIn == null) {
            return;
        }
        C1045070dIn c1045070dInLIZLLL = C1019620cdk.LIZLLL(aweme, c1045070dIn.program);
        if (c1045070dInLIZLLL == null) {
            if (c1045260dJ6.iconList == null) {
                c1045260dJ6.iconList = new LinkedList();
            }
            c1045260dJ6.iconList.add(c1045070dIn);
            return;
        }
        Set<String> set = c1045070dIn.staticResource;
        if (set == null || set.isEmpty()) {
            set = c1045070dInLIZLLL.staticResource;
        }
        c1045070dInLIZLLL.staticResource = set;
        Set<String> set2 = c1045070dIn.viewTracking;
        if (set2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : set2) {
                String str = (String) obj;
                if (str != null && str.length() != 0) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                if (c1045070dInLIZLLL.viewTracking == null) {
                    c1045070dInLIZLLL.viewTracking = new HashSet();
                }
                c1045070dInLIZLLL.viewTracking.addAll(arrayList);
            }
        }
        List<C1045060dIm> list = c1045070dIn.clickList;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (c1045070dInLIZLLL.clickList == null) {
            c1045070dInLIZLLL.clickList = new LinkedList();
        }
        c1045070dInLIZLLL.clickList.addAll(0, c1045070dIn.clickList);
    }

    public static final void LJIILLIIL(Aweme aweme, String str, String str2) {
        Sequence sequenceLIZJ;
        AwemeRawAd awemeRawAd;
        OmVast omVast;
        C1045270dJ7 c1045270dJ7;
        List<C1045260dJ6> list;
        if (!C1019620cdk.LIZIZ(3, aweme)) {
            return;
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (omVast = awemeRawAd.getOmVast()) != null && (c1045270dJ7 = omVast.vast) != null && (list = c1045270dJ7.creativeList) != null) {
            sequenceLIZJ = C09RB.LJIILIIL(new C1939607ik(list), new AwS251S0000000_16(1));
        } else {
            sequenceLIZJ = C09R4.LIZJ();
        }
        LJIILL(new C08LY(C09RB.LJIIIZ(sequenceLIZJ, new AwS67S1000000_16(str, 20)), AFwS252S0000000_16.get$arr$(383)), new C1045290dJ9(str2, aweme));
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0256 A[Catch: all -> 0x0427, TryCatch #4 {all -> 0x0427, blocks: (B:97:0x01ce, B:99:0x01ef, B:100:0x0206, B:101:0x0212, B:103:0x0216, B:105:0x021c, B:107:0x0222, B:108:0x0232, B:110:0x023a, B:112:0x0240, B:117:0x024a, B:121:0x0258, B:123:0x0260, B:127:0x0269, B:133:0x027d, B:135:0x0286, B:137:0x028c, B:139:0x0292, B:144:0x029c, B:150:0x02b0, B:147:0x02a8, B:149:0x02ae, B:151:0x02b3, B:153:0x02b7, B:154:0x02bb, B:156:0x02c1, B:158:0x02ca, B:160:0x02ce, B:162:0x02d2, B:164:0x02d8, B:166:0x02de, B:168:0x02e4, B:175:0x030f, B:177:0x0315, B:178:0x0318, B:181:0x0320, B:185:0x0329, B:190:0x0338, B:189:0x0336, B:191:0x033a, B:193:0x0340, B:194:0x0346, B:196:0x0355, B:198:0x036f, B:200:0x0375, B:202:0x037b, B:203:0x0383, B:205:0x03e8, B:206:0x03ef, B:174:0x0307, B:130:0x0275, B:120:0x0256, B:208:0x03fa, B:210:0x0403, B:211:0x0420, B:172:0x02fd), top: B:231:0x01ce, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0286 A[Catch: all -> 0x0427, TryCatch #4 {all -> 0x0427, blocks: (B:97:0x01ce, B:99:0x01ef, B:100:0x0206, B:101:0x0212, B:103:0x0216, B:105:0x021c, B:107:0x0222, B:108:0x0232, B:110:0x023a, B:112:0x0240, B:117:0x024a, B:121:0x0258, B:123:0x0260, B:127:0x0269, B:133:0x027d, B:135:0x0286, B:137:0x028c, B:139:0x0292, B:144:0x029c, B:150:0x02b0, B:147:0x02a8, B:149:0x02ae, B:151:0x02b3, B:153:0x02b7, B:154:0x02bb, B:156:0x02c1, B:158:0x02ca, B:160:0x02ce, B:162:0x02d2, B:164:0x02d8, B:166:0x02de, B:168:0x02e4, B:175:0x030f, B:177:0x0315, B:178:0x0318, B:181:0x0320, B:185:0x0329, B:190:0x0338, B:189:0x0336, B:191:0x033a, B:193:0x0340, B:194:0x0346, B:196:0x0355, B:198:0x036f, B:200:0x0375, B:202:0x037b, B:203:0x0383, B:205:0x03e8, B:206:0x03ef, B:174:0x0307, B:130:0x0275, B:120:0x0256, B:208:0x03fa, B:210:0x0403, B:211:0x0420, B:172:0x02fd), top: B:231:0x01ce, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a8 A[Catch: all -> 0x0427, TryCatch #4 {all -> 0x0427, blocks: (B:97:0x01ce, B:99:0x01ef, B:100:0x0206, B:101:0x0212, B:103:0x0216, B:105:0x021c, B:107:0x0222, B:108:0x0232, B:110:0x023a, B:112:0x0240, B:117:0x024a, B:121:0x0258, B:123:0x0260, B:127:0x0269, B:133:0x027d, B:135:0x0286, B:137:0x028c, B:139:0x0292, B:144:0x029c, B:150:0x02b0, B:147:0x02a8, B:149:0x02ae, B:151:0x02b3, B:153:0x02b7, B:154:0x02bb, B:156:0x02c1, B:158:0x02ca, B:160:0x02ce, B:162:0x02d2, B:164:0x02d8, B:166:0x02de, B:168:0x02e4, B:175:0x030f, B:177:0x0315, B:178:0x0318, B:181:0x0320, B:185:0x0329, B:190:0x0338, B:189:0x0336, B:191:0x033a, B:193:0x0340, B:194:0x0346, B:196:0x0355, B:198:0x036f, B:200:0x0375, B:202:0x037b, B:203:0x0383, B:205:0x03e8, B:206:0x03ef, B:174:0x0307, B:130:0x0275, B:120:0x0256, B:208:0x03fa, B:210:0x0403, B:211:0x0420, B:172:0x02fd), top: B:231:0x01ce, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ae A[Catch: all -> 0x0427, TryCatch #4 {all -> 0x0427, blocks: (B:97:0x01ce, B:99:0x01ef, B:100:0x0206, B:101:0x0212, B:103:0x0216, B:105:0x021c, B:107:0x0222, B:108:0x0232, B:110:0x023a, B:112:0x0240, B:117:0x024a, B:121:0x0258, B:123:0x0260, B:127:0x0269, B:133:0x027d, B:135:0x0286, B:137:0x028c, B:139:0x0292, B:144:0x029c, B:150:0x02b0, B:147:0x02a8, B:149:0x02ae, B:151:0x02b3, B:153:0x02b7, B:154:0x02bb, B:156:0x02c1, B:158:0x02ca, B:160:0x02ce, B:162:0x02d2, B:164:0x02d8, B:166:0x02de, B:168:0x02e4, B:175:0x030f, B:177:0x0315, B:178:0x0318, B:181:0x0320, B:185:0x0329, B:190:0x0338, B:189:0x0336, B:191:0x033a, B:193:0x0340, B:194:0x0346, B:196:0x0355, B:198:0x036f, B:200:0x0375, B:202:0x037b, B:203:0x0383, B:205:0x03e8, B:206:0x03ef, B:174:0x0307, B:130:0x0275, B:120:0x0256, B:208:0x03fa, B:210:0x0403, B:211:0x0420, B:172:0x02fd), top: B:231:0x01ce, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b7 A[Catch: all -> 0x0427, TryCatch #4 {all -> 0x0427, blocks: (B:97:0x01ce, B:99:0x01ef, B:100:0x0206, B:101:0x0212, B:103:0x0216, B:105:0x021c, B:107:0x0222, B:108:0x0232, B:110:0x023a, B:112:0x0240, B:117:0x024a, B:121:0x0258, B:123:0x0260, B:127:0x0269, B:133:0x027d, B:135:0x0286, B:137:0x028c, B:139:0x0292, B:144:0x029c, B:150:0x02b0, B:147:0x02a8, B:149:0x02ae, B:151:0x02b3, B:153:0x02b7, B:154:0x02bb, B:156:0x02c1, B:158:0x02ca, B:160:0x02ce, B:162:0x02d2, B:164:0x02d8, B:166:0x02de, B:168:0x02e4, B:175:0x030f, B:177:0x0315, B:178:0x0318, B:181:0x0320, B:185:0x0329, B:190:0x0338, B:189:0x0336, B:191:0x033a, B:193:0x0340, B:194:0x0346, B:196:0x0355, B:198:0x036f, B:200:0x0375, B:202:0x037b, B:203:0x0383, B:205:0x03e8, B:206:0x03ef, B:174:0x0307, B:130:0x0275, B:120:0x0256, B:208:0x03fa, B:210:0x0403, B:211:0x0420, B:172:0x02fd), top: B:231:0x01ce, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJ(final com.ss.android.ugc.aweme.feed.model.Aweme r19, java.util.concurrent.Executor r20, java.lang.Runnable r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1045220dJ2.LJIIJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.util.concurrent.Executor, java.lang.Runnable, boolean):void");
    }

    public static final void LJIJ(long j, long j2, long j3, Aweme aweme) {
        Sequence sequenceLIZJ;
        AwemeRawAd awemeRawAd;
        OmVast omVast;
        C1045270dJ7 c1045270dJ7;
        List<C1045260dJ6> list;
        if (!C1019620cdk.LIZIZ(3, aweme) || j == j2) {
            return;
        }
        if (j >= j2) {
            j = -1;
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (omVast = awemeRawAd.getOmVast()) != null && (c1045270dJ7 = omVast.vast) != null && (list = c1045270dJ7.creativeList) != null) {
            sequenceLIZJ = C09RB.LJIILIIL(new C1939607ik(list), new AwS251S0000000_16(4));
        } else {
            sequenceLIZJ = C09R4.LIZJ();
        }
        C08QT c08qt = new C08QT(C09RB.LJIIIZ(sequenceLIZJ, new C1045040dIk(j3, j, j2)));
        while (c08qt.hasNext()) {
            C1045050dIl c1045050dIl = (C1045050dIl) c08qt.next();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C1045220dJ2 c1045220dJ2 = LIZ;
            String str = c1045050dIl.offset;
            c1045220dJ2.getClass();
            long seconds = timeUnit.toSeconds(LJIILJJIL(j3, str));
            Sequence sequenceLJIIJJI = C13LQ.LJIIJJI(new String[]{c1045050dIl.url});
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cpv_");
            sbLIZ.append(seconds);
            sbLIZ.append('s');
            LJIILL(sequenceLJIIJJI, new C1045290dJ9(C2188811AlT.LIZIZ(sbLIZ), aweme));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[Catch: all -> 0x028a, TryCatch #1 {all -> 0x028a, blocks: (B:8:0x001e, B:9:0x005c, B:10:0x0066, B:15:0x0070, B:16:0x0076, B:18:0x007a, B:20:0x0080, B:22:0x0095, B:24:0x009b, B:29:0x00a5, B:33:0x00b3, B:35:0x00bb, B:39:0x00c4, B:45:0x00d8, B:47:0x00e1, B:49:0x00e7, B:51:0x00ed, B:56:0x00f7, B:62:0x010b, B:59:0x0103, B:61:0x0109, B:63:0x010e, B:65:0x0112, B:66:0x0116, B:68:0x011c, B:70:0x0125, B:72:0x0129, B:74:0x012d, B:76:0x0133, B:78:0x0139, B:80:0x013f, B:87:0x016a, B:89:0x0170, B:90:0x0173, B:93:0x017b, B:97:0x0184, B:102:0x0193, B:101:0x0191, B:103:0x0195, B:105:0x019b, B:106:0x01a1, B:108:0x01b0, B:110:0x01ca, B:112:0x01d0, B:114:0x01d6, B:115:0x01de, B:117:0x0243, B:118:0x024a, B:86:0x0162, B:42:0x00d0, B:32:0x00b1, B:119:0x0254, B:121:0x0266, B:84:0x0158), top: B:133:0x001e, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1 A[Catch: all -> 0x028a, TryCatch #1 {all -> 0x028a, blocks: (B:8:0x001e, B:9:0x005c, B:10:0x0066, B:15:0x0070, B:16:0x0076, B:18:0x007a, B:20:0x0080, B:22:0x0095, B:24:0x009b, B:29:0x00a5, B:33:0x00b3, B:35:0x00bb, B:39:0x00c4, B:45:0x00d8, B:47:0x00e1, B:49:0x00e7, B:51:0x00ed, B:56:0x00f7, B:62:0x010b, B:59:0x0103, B:61:0x0109, B:63:0x010e, B:65:0x0112, B:66:0x0116, B:68:0x011c, B:70:0x0125, B:72:0x0129, B:74:0x012d, B:76:0x0133, B:78:0x0139, B:80:0x013f, B:87:0x016a, B:89:0x0170, B:90:0x0173, B:93:0x017b, B:97:0x0184, B:102:0x0193, B:101:0x0191, B:103:0x0195, B:105:0x019b, B:106:0x01a1, B:108:0x01b0, B:110:0x01ca, B:112:0x01d0, B:114:0x01d6, B:115:0x01de, B:117:0x0243, B:118:0x024a, B:86:0x0162, B:42:0x00d0, B:32:0x00b1, B:119:0x0254, B:121:0x0266, B:84:0x0158), top: B:133:0x001e, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103 A[Catch: all -> 0x028a, TryCatch #1 {all -> 0x028a, blocks: (B:8:0x001e, B:9:0x005c, B:10:0x0066, B:15:0x0070, B:16:0x0076, B:18:0x007a, B:20:0x0080, B:22:0x0095, B:24:0x009b, B:29:0x00a5, B:33:0x00b3, B:35:0x00bb, B:39:0x00c4, B:45:0x00d8, B:47:0x00e1, B:49:0x00e7, B:51:0x00ed, B:56:0x00f7, B:62:0x010b, B:59:0x0103, B:61:0x0109, B:63:0x010e, B:65:0x0112, B:66:0x0116, B:68:0x011c, B:70:0x0125, B:72:0x0129, B:74:0x012d, B:76:0x0133, B:78:0x0139, B:80:0x013f, B:87:0x016a, B:89:0x0170, B:90:0x0173, B:93:0x017b, B:97:0x0184, B:102:0x0193, B:101:0x0191, B:103:0x0195, B:105:0x019b, B:106:0x01a1, B:108:0x01b0, B:110:0x01ca, B:112:0x01d0, B:114:0x01d6, B:115:0x01de, B:117:0x0243, B:118:0x024a, B:86:0x0162, B:42:0x00d0, B:32:0x00b1, B:119:0x0254, B:121:0x0266, B:84:0x0158), top: B:133:0x001e, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109 A[Catch: all -> 0x028a, TryCatch #1 {all -> 0x028a, blocks: (B:8:0x001e, B:9:0x005c, B:10:0x0066, B:15:0x0070, B:16:0x0076, B:18:0x007a, B:20:0x0080, B:22:0x0095, B:24:0x009b, B:29:0x00a5, B:33:0x00b3, B:35:0x00bb, B:39:0x00c4, B:45:0x00d8, B:47:0x00e1, B:49:0x00e7, B:51:0x00ed, B:56:0x00f7, B:62:0x010b, B:59:0x0103, B:61:0x0109, B:63:0x010e, B:65:0x0112, B:66:0x0116, B:68:0x011c, B:70:0x0125, B:72:0x0129, B:74:0x012d, B:76:0x0133, B:78:0x0139, B:80:0x013f, B:87:0x016a, B:89:0x0170, B:90:0x0173, B:93:0x017b, B:97:0x0184, B:102:0x0193, B:101:0x0191, B:103:0x0195, B:105:0x019b, B:106:0x01a1, B:108:0x01b0, B:110:0x01ca, B:112:0x01d0, B:114:0x01d6, B:115:0x01de, B:117:0x0243, B:118:0x024a, B:86:0x0162, B:42:0x00d0, B:32:0x00b1, B:119:0x0254, B:121:0x0266, B:84:0x0158), top: B:133:0x001e, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112 A[Catch: all -> 0x028a, TryCatch #1 {all -> 0x028a, blocks: (B:8:0x001e, B:9:0x005c, B:10:0x0066, B:15:0x0070, B:16:0x0076, B:18:0x007a, B:20:0x0080, B:22:0x0095, B:24:0x009b, B:29:0x00a5, B:33:0x00b3, B:35:0x00bb, B:39:0x00c4, B:45:0x00d8, B:47:0x00e1, B:49:0x00e7, B:51:0x00ed, B:56:0x00f7, B:62:0x010b, B:59:0x0103, B:61:0x0109, B:63:0x010e, B:65:0x0112, B:66:0x0116, B:68:0x011c, B:70:0x0125, B:72:0x0129, B:74:0x012d, B:76:0x0133, B:78:0x0139, B:80:0x013f, B:87:0x016a, B:89:0x0170, B:90:0x0173, B:93:0x017b, B:97:0x0184, B:102:0x0193, B:101:0x0191, B:103:0x0195, B:105:0x019b, B:106:0x01a1, B:108:0x01b0, B:110:0x01ca, B:112:0x01d0, B:114:0x01d6, B:115:0x01de, B:117:0x0243, B:118:0x024a, B:86:0x0162, B:42:0x00d0, B:32:0x00b1, B:119:0x0254, B:121:0x0266, B:84:0x0158), top: B:133:0x001e, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(final com.ss.android.ugc.aweme.feed.model.Aweme r16, final com.ss.android.ugc.aweme.commercialize.model.OmVast r17, java.util.concurrent.Executor r18, final Y.ARunnableS81S0200000_12 r19, final int r20, final long r21) {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1045220dJ2.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.commercialize.model.OmVast, java.util.concurrent.Executor, Y.ARunnableS81S0200000_12, int, long):boolean");
    }

    public static void LJIIJJI(C1045220dJ2 c1045220dJ2, String str, String str2, long j, String str3, Aweme aweme, AwemeRawAd awemeRawAd, int i) {
        if ((i & 16) != 0) {
            aweme = null;
        }
        if ((i & 32) != 0) {
            awemeRawAd = null;
        }
        c1045220dJ2.getClass();
        if (str3 != null) {
            C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
            c1020020ceOLIZ.LJ.LIZIZ("ad_event_priority", "10");
            c1020020ceOLIZ.LJ.LIZIZ("ad_event_type", "monitor");
            c1020020ceOLIZ.LJ.LIZIZ("track_url_list", str);
            c1020020ceOLIZ.LJ.LIZIZ("track_status", str2);
            c1020020ceOLIZ.LJ.LIZ(j, "ts");
            String strLIZ = C1489110oqz.LIZ("other");
            if (!TextUtils.isEmpty(strLIZ)) {
                c1020020ceOLIZ.LJ.LIZIZ("user_agent", strLIZ);
            }
            c1020020ceOLIZ.LJFF = "track_url";
            c1020020ceOLIZ.LIZ = "track_ad";
            c1020020ceOLIZ.LJ.LIZIZ("track_label", str3);
            c1020020ceOLIZ.LJ(aweme);
            c1020020ceOLIZ.LJFF(awemeRawAd);
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            c1020020ceOLIZ.LJ.LIZIZ("is_ad_event", "1");
            String strB3 = C786410Ut5.b3(contextLIZ);
            if (!C2093608Ic.LJ(strB3)) {
                c1020020ceOLIZ.LJ.LIZIZ("nt", strB3);
            }
            HashMap map = new HashMap();
            try {
                map.put("category", "event_v3");
                if (!TextUtils.isEmpty(c1020020ceOLIZ.LIZ)) {
                    map.put("tag", c1020020ceOLIZ.LIZ);
                }
                if (!TextUtils.isEmpty(c1020020ceOLIZ.LIZIZ)) {
                    map.put("label", c1020020ceOLIZ.LIZIZ);
                }
                if (!TextUtils.isEmpty(c1020020ceOLIZ.LIZJ)) {
                    map.put("value", c1020020ceOLIZ.LIZJ);
                }
                if (!TextUtils.isEmpty(c1020020ceOLIZ.LIZLLL)) {
                    map.put("ext_value", c1020020ceOLIZ.LIZLLL);
                }
                C1020040ceQ c1020040ceQ = c1020020ceOLIZ.LJ;
                if (c1020040ceQ.LIZ == null) {
                    c1020040ceQ.LIZ = new JSONObject();
                }
                JSONObject jSONObject = c1020040ceQ.LIZ;
                ITalentAdRevenueShareService iTalentAdRevenueShareServiceLJIIL = TalentAdRevenueShareServiceImpl.LJIIL();
                if (iTalentAdRevenueShareServiceLJIIL != null && !TextUtils.isEmpty(c1020020ceOLIZ.LIZJ)) {
                    iTalentAdRevenueShareServiceLJIIL.LIZLLL(c1020020ceOLIZ.LIZJ, jSONObject);
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.equals("has_v3", next)) {
                        try {
                            Object objOpt = jSONObject.opt(next);
                            if (objOpt instanceof String) {
                                map.put(next, (String) objOpt);
                            } else {
                                map.put(next, new Gson().LJIILL(objOpt));
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                if (!TextUtils.isEmpty(c1020020ceOLIZ.LJFF)) {
                    C20684815ws.LJIILLIIL(c1020020ceOLIZ.LJFF, map);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            synchronized (C1020030ceP.class) {
                try {
                    if (C1020030ceP.LIZ == null) {
                        C1020030ceP.LIZ = c1020020ceOLIZ;
                        c1020020ceOLIZ.LIZ = null;
                        c1020020ceOLIZ.LIZIZ = null;
                        c1020020ceOLIZ.LIZJ = null;
                        c1020020ceOLIZ.LIZLLL = null;
                        c1020020ceOLIZ.LJ.LIZ = null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
