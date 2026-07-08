package X;

import android.os.SystemClock;
import android.util.LruCache;
import com.ss.android.ugc.aweme.data.TypingRecommendationCacheData;
import com.ss.android.ugc.aweme.im.common.model.IMStickerSetMetaData;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Hom, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452500Hom implements InterfaceC452360HoY {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZLLL;
    public final LruCache<String, C452560Hos> LIZ = new LruCache<>(100);
    public final boolean LIZIZ = IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJLIIIJL();
    public volatile InterfaceC1808720xAU LIZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C452500Hom.class, "inMemoryStickerCache", "getInMemoryStickerCache()Lcom/ss/android/ugc/aweme/im/sticker/api/cache/TypingRecommendationStickerCache;", 0);
        C13LE.LIZ.getClass();
        LIZLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final String LIZIZ() {
        IMStickerSetMetaData iMStickerSetMetaData;
        if (!this.LIZIZ) {
            return "";
        }
        Long l = null;
        C0HWY c0hwyLIZ = IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJIILJJIL(null, null).LIZ();
        if (c0hwyLIZ != null && (iMStickerSetMetaData = c0hwyLIZ.LIZ) != null) {
            l = iMStickerSetMetaData.setId;
        }
        return String.valueOf(l);
    }

    public final Object LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZIZ());
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C452560Hos c452560Hos = this.LIZ.get(strLIZIZ);
        if (c452560Hos == null) {
            C098200Yq c098200Yq = new C098200Yq(new NoSuchElementException());
            C189200o6.m2constructorimpl(c098200Yq);
            return c098200Yq;
        }
        if (SystemClock.elapsedRealtime() - c452560Hos.LIZIZ >= TimeUnit.DAYS.toMillis(1L)) {
            this.LIZ.remove(strLIZIZ);
            C098200Yq c098200Yq2 = new C098200Yq(new NoSuchElementException());
            C189200o6.m2constructorimpl(c098200Yq2);
            return c098200Yq2;
        }
        TypingRecommendationCacheData typingRecommendationCacheData = c452560Hos.LIZ;
        List<StickerItem> list = typingRecommendationCacheData.stickerList;
        ArrayList arrayList = new ArrayList();
        for (StickerItem stickerItem : list) {
            StickerItem stickerItem2 = stickerItem;
            InterfaceC1808720xAU interfaceC1808720xAU = this.LIZJ;
            if (interfaceC1808720xAU == null) {
                synchronized (this) {
                    interfaceC1808720xAU = this.LIZJ;
                    if (interfaceC1808720xAU == null) {
                        interfaceC1808720xAU = (InterfaceC1808720xAU) C1807670x8n.LLLLZLL();
                        this.LIZJ = interfaceC1808720xAU;
                    }
                }
            }
            AbstractC19875112pZ<String> currentBlockIds = interfaceC1808720xAU.getCurrentBlockIds();
            if (C453560HqU.LIZIZ(stickerItem2) == null || (!currentBlockIds.contains(r0))) {
                arrayList.add(stickerItem);
            }
        }
        TypingRecommendationCacheData typingRecommendationCacheData2 = new TypingRecommendationCacheData(arrayList, typingRecommendationCacheData.effectList);
        C189200o6.m2constructorimpl(typingRecommendationCacheData2);
        return typingRecommendationCacheData2;
    }

    public final void LIZJ(String str, TypingRecommendationCacheData typingRecommendationCacheData) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZIZ());
        sbLIZ.append(str);
        this.LIZ.put(C2188811AlT.LIZIZ(sbLIZ), new C452560Hos(typingRecommendationCacheData, SystemClock.elapsedRealtime()));
    }
}
