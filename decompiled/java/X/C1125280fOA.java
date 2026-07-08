package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fOA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.utils.GiftCacheManager$loadFromLocal$2", f = "GiftCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C1125280fOA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<GiftPage>>, Object> {
    public C1125280fOA(InterfaceC1364105Vn<? super C1125280fOA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1125280fOA(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("GiftCacheManager@6fd7.loadFromLocal$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList();
        try {
            String str = (String) ((C20337914i1) C1125290fOB.LIZIZ.getValue()).LIZIZ();
            if (str == null || a0.LJJJIL(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C20441214yg.LJIIIIZZ("no local cache now ");
                C1C7U.LIZIZ("GiftCacheManager@6fd7.loadFromLocal$2");
                return null;
            }
            GiftListResult giftListResult = (GiftListResult) ((Gson) C1125290fOB.LIZJ.getValue()).LJII(str, GiftListResult.class);
            GiftManager.inst().cacheGiftListToMap(giftListResult, 0);
            for (GiftPage giftPage : giftListResult.giftPages) {
                if (giftPage.pageType == 1) {
                    C2044407ze.LIZIZ(giftPage.gifts, AFwS254S0000000_17.get$arr$(99));
                    C2044407ze.LIZIZ(giftPage.frequentlyUsedGifts, AFwS254S0000000_17.get$arr$(100));
                    List<Gift> list = giftPage.favouriteGifts;
                    if (list != null) {
                        Boolean.valueOf(C2044407ze.LIZIZ(list, AFwS254S0000000_17.get$arr$(101)));
                    }
                    if (!giftPage.gifts.isEmpty()) {
                        arrayList.add(giftPage);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                C1C7U.LIZIZ("GiftCacheManager@6fd7.loadFromLocal$2");
                return null;
            }
            C1C7U.LIZIZ("GiftCacheManager@6fd7.loadFromLocal$2");
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load gift local cache failed ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            C1C7U.LIZIZ("GiftCacheManager@6fd7.loadFromLocal$2");
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<GiftPage>> interfaceC1364105Vn) {
        return new C1125280fOA(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
