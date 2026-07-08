package X;

import com.ss.android.ugc.aweme.data.TypingRecommendationCacheData;
import com.ss.android.ugc.aweme.im.common.model.IMStickerSetMetaData;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;

/* JADX INFO: renamed from: X.0Hol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452490Hol implements InterfaceC452600How {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZLLL;
    public final boolean LIZ = IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJLIIIJL();
    public volatile InterfaceC1808720xAU LIZIZ;
    public volatile InterfaceC450290HlD LIZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C452490Hol.class, "inMemoryStickerCache", "getInMemoryStickerCache()Lcom/ss/android/ugc/aweme/im/sticker/api/cache/TypingRecommendationStickerCache;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C452490Hol.class, "stickersRepository", "getStickersRepository()Lcom/ss/android/ugc/aweme/im/sticker/api/repo/IMStickerRepository;", 0);
        c09r3.getClass();
        LIZLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final InterfaceC450290HlD LIZLLL() {
        InterfaceC450290HlD interfaceC450290HlD = this.LIZJ;
        if (interfaceC450290HlD == null) {
            synchronized (this) {
                interfaceC450290HlD = this.LIZJ;
                if (interfaceC450290HlD == null) {
                    InterfaceC450290HlD interfaceC450290HlD2 = (InterfaceC450290HlD) C1807670x8n.LLLLLZ();
                    this.LIZJ = interfaceC450290HlD2;
                    return interfaceC450290HlD2;
                }
            }
        }
        return interfaceC450290HlD;
    }

    public static String LIZIZ() {
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        return c454640HsE.LIZIZ().getImAiSelfStickerService().LJI() ? String.valueOf(c454640HsE.LIZIZ().getImAiSelfStickerService().LJIILJJIL()) : "";
    }

    public final String LIZJ() {
        IMStickerSetMetaData iMStickerSetMetaData;
        if (!this.LIZ) {
            return "";
        }
        Long l = null;
        C0HWY c0hwyLIZ = IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJIILJJIL(null, null).LIZ();
        if (c0hwyLIZ != null && (iMStickerSetMetaData = c0hwyLIZ.LIZ) != null) {
            l = iMStickerSetMetaData.setId;
        }
        return String.valueOf(l);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.data.TypingRecommendationCacheData>> r14) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452490Hol.LIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJ(String str, String str2, TypingRecommendationCacheData typingRecommendationCacheData) {
        String curUserId;
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(typingRecommendationCacheData);
        if (strLJI != null && (curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId()) != null) {
            InterfaceC450290HlD interfaceC450290HlDLIZLLL = LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZJ());
            sbLIZ.append(LIZIZ());
            interfaceC450290HlDLIZLLL.addTypingRecommendation(curUserId, str, C2188811AlT.LIZIZ(sbLIZ), str2, strLJI);
        }
    }
}
