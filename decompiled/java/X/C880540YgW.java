package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YgW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C880540YgW {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC880520YgU.values().length];
        try {
            iArr[EnumC880520YgU.ALL_WITHOUT_STORY_REACTIONS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC880520YgU.MESSAGE_REQUEST_SPAM.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC880520YgU.BUSINESS.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC880520YgU.CREATOR.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC880520YgU.NEW_FOLLOWER.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC880520YgU.SUBSCRIBER.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC880520YgU.HIGH_LEVEL_MEMBER.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[EnumC880520YgU.LONG_TIME_FOLLOWER.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[EnumC880520YgU.ONE_WAY_FOLLOWER.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[EnumC880520YgU.WITH_MUTUAL_FRIEND.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[EnumC880520YgU.PRIORITY.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr[EnumC880520YgU.AI_REPLIED.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr[EnumC880520YgU.ALL.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr[EnumC880520YgU.RISKY.ordinal()] = 14;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC880570YgZ.values().length];
        try {
            iArr2[EnumC880570YgZ.ALL_BUSINESS.ordinal()] = 1;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr2[EnumC880570YgZ.ALL_FOLLOWER.ordinal()] = 2;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            iArr2[EnumC880570YgZ.ALL_CREATORS.ordinal()] = 3;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            iArr2[EnumC880570YgZ.ALL_OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            iArr2[EnumC880570YgZ.BUSINESS_SHOP_SELLERS.ordinal()] = 5;
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
        try {
            iArr2[EnumC880570YgZ.BUSINESS_CREATOR_NETWORKS.ordinal()] = 6;
        } catch (NoSuchFieldError e20) {
            TryCatchGuardChecker.doCheck(e20);
        }
        try {
            iArr2[EnumC880570YgZ.FOLLOWER_SUBSCRIBER.ordinal()] = 7;
        } catch (NoSuchFieldError e21) {
            TryCatchGuardChecker.doCheck(e21);
        }
        try {
            iArr2[EnumC880570YgZ.FOLLOWER_HIGH_LEVEL_MEMBER.ordinal()] = 8;
        } catch (NoSuchFieldError e22) {
            TryCatchGuardChecker.doCheck(e22);
        }
        try {
            iArr2[EnumC880570YgZ.FOLLOWER_LONG_TIME_FOLLOWER.ordinal()] = 9;
        } catch (NoSuchFieldError e23) {
            TryCatchGuardChecker.doCheck(e23);
        }
        try {
            iArr2[EnumC880570YgZ.CREATORS_WITH_FOLLOWERS_RANGE_10K_50K.ordinal()] = 10;
        } catch (NoSuchFieldError e24) {
            TryCatchGuardChecker.doCheck(e24);
        }
        try {
            iArr2[EnumC880570YgZ.CREATORS_WITH_FOLLOWERS_RANGE_50K_100K.ordinal()] = 11;
        } catch (NoSuchFieldError e25) {
            TryCatchGuardChecker.doCheck(e25);
        }
        try {
            iArr2[EnumC880570YgZ.CREATORS_WITH_FOLLOWERS_RANGE_100K_1M.ordinal()] = 12;
        } catch (NoSuchFieldError e26) {
            TryCatchGuardChecker.doCheck(e26);
        }
        try {
            iArr2[EnumC880570YgZ.CREATORS_WITH_FOLLOWERS_MORE_THAN_1M.ordinal()] = 13;
        } catch (NoSuchFieldError e27) {
            TryCatchGuardChecker.doCheck(e27);
        }
        try {
            iArr2[EnumC880570YgZ.OTHER_VERIFIED_ACCOUNT.ordinal()] = 14;
        } catch (NoSuchFieldError e28) {
            TryCatchGuardChecker.doCheck(e28);
        }
        try {
            iArr2[EnumC880570YgZ.OTHER_POTENTIAL_PAID_OFFERS.ordinal()] = 15;
        } catch (NoSuchFieldError e29) {
            TryCatchGuardChecker.doCheck(e29);
        }
        try {
            iArr2[EnumC880570YgZ.OTHER_COLLABORATION_INVITES.ordinal()] = 16;
        } catch (NoSuchFieldError e30) {
            TryCatchGuardChecker.doCheck(e30);
        }
        try {
            iArr2[EnumC880570YgZ.OTHER_SERVICE_PLUS.ordinal()] = 17;
        } catch (NoSuchFieldError e31) {
            TryCatchGuardChecker.doCheck(e31);
        }
        LIZIZ = iArr2;
    }
}
