package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftGalleryExtra;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0fRi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127480fRi {
    public static final Map<Long, String> LIZ = new LinkedHashMap();

    public static Map LIZIZ() {
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        User userLIZJ = C1125800fP0.LIZJ();
        C1127820fSG galleryInfoMap = interfaceC1128210fStInst.getGalleryInfoMap(userLIZJ != null ? userLIZJ.getId() : 0L);
        if (galleryInfoMap != null) {
            return galleryInfoMap.LIZ;
        }
        return null;
    }

    public static boolean LJI() {
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        User userLIZJ = C1125800fP0.LIZJ();
        C1127820fSG galleryInfoMap = interfaceC1128210fStInst.getGalleryInfoMap(userLIZJ != null ? userLIZJ.getId() : 0L);
        return galleryInfoMap != null && galleryInfoMap.LIZIZ;
    }

    public static Pair LIZLLL(long j) {
        Pair<String, String> pair;
        C1127820fSG galleryInfoMap = GiftManager.inst().getGalleryInfoMap(j);
        if (galleryInfoMap != null && (pair = galleryInfoMap.LIZJ) != null) {
            return pair;
        }
        return new Pair("", "");
    }

    public static boolean LJFF(Long l) {
        long id;
        Map<Long, Gift.GiftSponsorInfo> map;
        Gift.GiftSponsorInfo giftSponsorInfo;
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        User userLIZJ = C1125800fP0.LIZJ();
        if (userLIZJ != null) {
            id = userLIZJ.getId();
        } else {
            id = 0;
        }
        C1127820fSG galleryInfoMap = interfaceC1128210fStInst.getGalleryInfoMap(id);
        if (galleryInfoMap != null && (map = galleryInfoMap.LIZ) != null && (giftSponsorInfo = map.get(l)) != null && giftSponsorInfo.sponsorId > 0) {
            return true;
        }
        return false;
    }

    public static int LJII(Gift gift) {
        Long lValueOf;
        if (gift != null) {
            lValueOf = Long.valueOf(gift.id);
        } else {
            lValueOf = null;
        }
        Gift.GiftSponsorInfo giftSponsorInfoLIZJ = LIZJ(lValueOf, null);
        if (giftSponsorInfoLIZJ != null && giftSponsorInfoLIZJ.sponsorId == UserService.getInstance().user().getCurrentUserId()) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[PHI: r7
      0x005f: PHI (r7v1 boolean) = (r7v0 boolean), (r7v3 boolean) binds: [B:30:0x005c, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIIZZ(java.lang.Long r10) {
        /*
            r6 = 0
            com.bytedance.android.livesdk.model.Gift$GiftSponsorInfo r1 = LIZJ(r10, r6)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r8 = r0.getCurrentUserId()
            r5 = 1
            if (r1 == 0) goto L5b
            boolean r0 = r1.canSponsor
            if (r0 != r5) goto L5b
            r7 = 1
        L19:
            long r1 = r1.sponsorId
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L5f
            r4 = 1
        L20:
            java.util.List r0 = X.C1125800fP0.LIZLLL()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r0 = r0.size()
            if (r0 != r5) goto L59
            r3 = 1
        L2d:
            com.bytedance.android.live.base.model.user.User r0 = X.C1125800fP0.LIZJ()
            if (r0 == 0) goto L57
            long r1 = r0.getId()
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L57
            r0 = 1
        L3c:
            r1 = r0 ^ 1
            boolean r0 = LJ(r10, r6)
            if (r0 == 0) goto L61
            if (r7 != 0) goto L52
            if (r4 != 0) goto L52
            X.0fSt r0 = com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.inst()
            boolean r0 = r0.isEoy()
            if (r0 == 0) goto L61
        L52:
            if (r3 == 0) goto L61
            if (r1 == 0) goto L61
            return r5
        L57:
            r0 = 0
            goto L3c
        L59:
            r3 = 0
            goto L2d
        L5b:
            r7 = 0
            if (r1 == 0) goto L5f
            goto L19
        L5f:
            r4 = 0
            goto L20
        L61:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1127480fRi.LJIIIIZZ(java.lang.Long):boolean");
    }

    public static Gift.GiftSponsorInfo LIZJ(Long l, Long l2) {
        long id;
        Map<Long, Gift.GiftSponsorInfo> map;
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        if (l2 != null) {
            id = l2.longValue();
        } else {
            User userLIZJ = C1125800fP0.LIZJ();
            if (userLIZJ != null) {
                id = userLIZJ.getId();
            } else {
                id = 0;
            }
        }
        C1127820fSG galleryInfoMap = interfaceC1128210fStInst.getGalleryInfoMap(id);
        if (galleryInfoMap != null && (map = galleryInfoMap.LIZ) != null) {
            return map.get(l);
        }
        return null;
    }

    public static boolean LJ(Long l, Long l2) {
        if (LIZJ(l, l2) != null) {
            return true;
        }
        return false;
    }

    public static GiftGalleryExtra LIZ(Gift gift, Long l, int i) {
        long j;
        boolean z;
        long j2;
        long j3;
        GiftGalleryExtra giftGalleryExtra = null;
        if ((i & 4) != 0) {
            l = null;
        }
        if (gift != null) {
            Gift.GiftSponsorInfo giftSponsorInfoLIZJ = LIZJ(Long.valueOf(gift.id), l);
            if (giftSponsorInfoLIZJ != null) {
                j = giftSponsorInfoLIZJ.leftCountToSponsor;
            } else {
                j = 0;
            }
            boolean zLJ = LJ(Long.valueOf(gift.id), l);
            if (giftSponsorInfoLIZJ != null) {
                z = giftSponsorInfoLIZJ.canSponsor;
            } else {
                z = false;
            }
            if (giftSponsorInfoLIZJ != null) {
                j2 = giftSponsorInfoLIZJ.sponsorCount;
                j3 = giftSponsorInfoLIZJ.currentCount;
            } else {
                j2 = 0;
                j3 = 0;
            }
            giftGalleryExtra = new GiftGalleryExtra(zLJ, j, false, z, j, j2, j3, false);
        }
        return giftGalleryExtra;
    }
}
