package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;

/* JADX INFO: renamed from: X.0YgS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C880500YgS {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[FilterTabType.values().length];
        try {
            iArr[FilterTabType.OVERALL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[FilterTabType.PRIMARY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[FilterTabType.SECONDARY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[FilterTabType.ARCHIVE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[FilterTabType.FOLLOWING.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[FilterTabType.CREATOR.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[FilterTabType.BUSINESS.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[FilterTabType.LONG_TIME_FOLLOWER.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[FilterTabType.SUBSCRIBER.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[FilterTabType.HIGH_LEVEL_MEMBER.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[FilterTabType.WITH_MUTUAL_FRIEND.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr[FilterTabType.ONE_WAY_FOLLOWER.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr[FilterTabType.BUYER.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr[FilterTabType.SPAM.ordinal()] = 14;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr[FilterTabType.STARRED.ordinal()] = 15;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr[FilterTabType.UNREAD.ordinal()] = 16;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            iArr[FilterTabType.UNANSWERED.ordinal()] = 17;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            iArr[FilterTabType.ALL_FOR_BUSINESS.ordinal()] = 18;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            iArr[FilterTabType.LEAD.ordinal()] = 19;
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
        try {
            iArr[FilterTabType.AD.ordinal()] = 20;
        } catch (NoSuchFieldError e20) {
            TryCatchGuardChecker.doCheck(e20);
        }
        try {
            iArr[FilterTabType.SERVICE_PLUS.ordinal()] = 21;
        } catch (NoSuchFieldError e21) {
            TryCatchGuardChecker.doCheck(e21);
        }
        try {
            iArr[FilterTabType.NULL.ordinal()] = 22;
        } catch (NoSuchFieldError e22) {
            TryCatchGuardChecker.doCheck(e22);
        }
        try {
            iArr[FilterTabType.REQUEST.ordinal()] = 23;
        } catch (NoSuchFieldError e23) {
            TryCatchGuardChecker.doCheck(e23);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC880480YgQ.values().length];
        try {
            iArr2[EnumC880480YgQ.UNREAD.ordinal()] = 1;
        } catch (NoSuchFieldError e24) {
            TryCatchGuardChecker.doCheck(e24);
        }
        try {
            iArr2[EnumC880480YgQ.FOLLOWING.ordinal()] = 2;
        } catch (NoSuchFieldError e25) {
            TryCatchGuardChecker.doCheck(e25);
        }
        try {
            iArr2[EnumC880480YgQ.BUSINESS.ordinal()] = 3;
        } catch (NoSuchFieldError e26) {
            TryCatchGuardChecker.doCheck(e26);
        }
        try {
            iArr2[EnumC880480YgQ.CREATOR.ordinal()] = 4;
        } catch (NoSuchFieldError e27) {
            TryCatchGuardChecker.doCheck(e27);
        }
        try {
            iArr2[EnumC880480YgQ.SUBSCRIBER.ordinal()] = 5;
        } catch (NoSuchFieldError e28) {
            TryCatchGuardChecker.doCheck(e28);
        }
        try {
            iArr2[EnumC880480YgQ.HIGH_LEVEL_MEMBER.ordinal()] = 6;
        } catch (NoSuchFieldError e29) {
            TryCatchGuardChecker.doCheck(e29);
        }
        try {
            iArr2[EnumC880480YgQ.LONG_TIME_FOLLOWER.ordinal()] = 7;
        } catch (NoSuchFieldError e30) {
            TryCatchGuardChecker.doCheck(e30);
        }
        try {
            iArr2[EnumC880480YgQ.WITH_MUTUAL_FRIEND.ordinal()] = 8;
        } catch (NoSuchFieldError e31) {
            TryCatchGuardChecker.doCheck(e31);
        }
        try {
            iArr2[EnumC880480YgQ.ONE_WAY_FOLLOWER.ordinal()] = 9;
        } catch (NoSuchFieldError e32) {
            TryCatchGuardChecker.doCheck(e32);
        }
        try {
            iArr2[EnumC880480YgQ.BUYER.ordinal()] = 10;
        } catch (NoSuchFieldError e33) {
            TryCatchGuardChecker.doCheck(e33);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[C05RV.values().length];
        try {
            iArr3[C05RV.PRO_CREATOR_INBOX.ordinal()] = 1;
        } catch (NoSuchFieldError e34) {
            TryCatchGuardChecker.doCheck(e34);
        }
        try {
            iArr3[C05RV.BUSINESS_INBOX.ordinal()] = 2;
        } catch (NoSuchFieldError e35) {
            TryCatchGuardChecker.doCheck(e35);
        }
        try {
            iArr3[C05RV.PERSONAL_INBOX.ordinal()] = 3;
        } catch (NoSuchFieldError e36) {
            TryCatchGuardChecker.doCheck(e36);
        }
        LIZJ = iArr3;
    }
}
