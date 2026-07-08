package X;

import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.core.pendant.ad.AdFeedTimerPendantManager;
import com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS166S0101000_28;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0zTC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897200zTC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AdFeedTimerPendantManager LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1897200zTC(int i, String str, String str2, AdFeedTimerPendantManager adFeedTimerPendantManager, boolean z, String str3, boolean z2) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = adFeedTimerPendantManager;
        this.LLILZIL = z;
        this.LLILZLL = str3;
        this.LLIZ = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strLJJIFFI;
        C1897020zSu c1897020zSu = C1897020zSu.LIZ;
        Bubble bubbleLIZ = C1897020zSu.LIZ(this.LL, this.LLILLJJLI, null);
        if (bubbleLIZ != null) {
            int i = this.LL;
            if (i == 27) {
                String str = bubbleLIZ.longContent;
                this.LLILZ.LJJL(bubbleLIZ, this.LLILLL, str != null ? u.LJJIFFI(str, "{num}", this.LLILLL, false) : null, this.LLILZIL);
                String str2 = bubbleLIZ.notificationId;
                if (str2 != null && str2.length() != 0) {
                    C1897020zSu.LIZLLL(bubbleLIZ, 2);
                }
                C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str3 = this.LLILLJJLI;
                linkedHashMap.put("sub_type", String.valueOf(bubbleLIZ.bubbleType));
                C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
                linkedHashMap.put("vv_cnt", String.valueOf(C1894330zOZ.LIZ().LJIILJJIL()));
                linkedHashMap.put("task_key", str3);
                String str4 = bubbleLIZ.notificationName;
                if (str4 != null && str4.length() != 0) {
                    linkedHashMap.put("type", bubbleLIZ.notificationName);
                }
                C1894320zOY.LJIL(c1894320zOY, bubbleLIZ, linkedHashMap);
            } else if (i == 32) {
                String str5 = bubbleLIZ.longContent;
                String strLJJIFFI2 = str5 != null ? u.LJJIFFI(str5, "{num}", this.LLILLL, false) : null;
                bubbleLIZ.LJIIIIZZ = true;
                AdFeedTimerPendantManager adFeedTimerPendantManager = this.LLILZ;
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(196));
                adFeedTimerPendantManager.getClass();
                C01U6.LIZIZ(new AwS166S0101000_28(adFeedTimerPendantManager, (BaseTimerPendantManager<Object>) iLIZIZ, 4));
                this.LLILZ.LJJL(bubbleLIZ, this.LLILLL, strLJJIFFI2, this.LLILZIL);
                String str6 = bubbleLIZ.notificationId;
                if (str6 != null && str6.length() != 0) {
                    C1897020zSu.LIZLLL(bubbleLIZ, 2);
                }
                C1894320zOY c1894320zOY2 = C1894320zOY.LIZ;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                String str7 = this.LLILLJJLI;
                linkedHashMap2.put("sub_type", String.valueOf(bubbleLIZ.bubbleType));
                C01GW<SpecActPendantManager> c01gw2 = SpecActPendantManager.LLJJIJIIJIL;
                linkedHashMap2.put("vv_cnt", String.valueOf(C1894330zOZ.LIZ().LJIILJJIL()));
                linkedHashMap2.put("task_key", str7);
                String str8 = bubbleLIZ.notificationName;
                if (str8 != null && str8.length() != 0) {
                    linkedHashMap2.put("type", bubbleLIZ.notificationName);
                }
                C1894320zOY.LJIL(c1894320zOY2, bubbleLIZ, linkedHashMap2);
            } else if (i == 33) {
                String str9 = bubbleLIZ.longContent;
                if (str9 != null && (strLJJIFFI = u.LJJIFFI(str9, "{num}", this.LLILLL, false)) != null) {
                    AdFeedTimerPendantManager adFeedTimerPendantManager2 = this.LLILZ;
                    BaseTimerPendantManager.LJJLI(adFeedTimerPendantManager2, strLJJIFFI, bubbleLIZ, true, adFeedTimerPendantManager2);
                    String str10 = bubbleLIZ.notificationId;
                    if (str10 != null && str10.length() != 0) {
                        C1897020zSu.LIZLLL(bubbleLIZ, 2);
                    }
                    C1894320zOY c1894320zOY3 = C1894320zOY.LIZ;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    String str11 = this.LLILLJJLI;
                    linkedHashMap3.put("sub_type", String.valueOf(bubbleLIZ.bubbleType));
                    C01GW<SpecActPendantManager> c01gw3 = SpecActPendantManager.LLJJIJIIJIL;
                    linkedHashMap3.put("vv_cnt", String.valueOf(C1894330zOZ.LIZ().LJIILJJIL()));
                    linkedHashMap3.put("task_key", str11);
                    String str12 = bubbleLIZ.notificationName;
                    if (str12 != null && str12.length() != 0) {
                        linkedHashMap3.put("type", bubbleLIZ.notificationName);
                    }
                    C1894320zOY.LJIL(c1894320zOY3, bubbleLIZ, linkedHashMap3);
                }
            } else {
                C1897020zSu.LJ(this.LLILZ, i, this.LLILLJJLI, this.LLILLL, this.LLILZLL, this.LLILZIL, this.LLIZ);
            }
        }
        return Unit.LIZ;
    }
}
