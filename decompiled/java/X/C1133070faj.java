package X;

import Y.AComparatorS36S0000000_17;
import Y.ARunnableS117S0100000_17;
import android.os.Looper;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftCrossScreenSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPreDownloadInteractiveAssetSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0faj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133070faj {
    public static C11JF LIZIZ;
    public static C11JF LIZJ;
    public static final C1133070faj LIZ = new C1133070faj();
    public static final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());

    public static final void LIZIZ() {
        long anchorPreloadDelay = LiveGiftCrossScreenSetting.INSTANCE.getAnchorPreloadDelay();
        if (anchorPreloadDelay >= 0) {
            C786410Ut5.LJLIIL(anchorPreloadDelay, LIZLLL, RunnableC1133080fak.LL);
        }
    }

    public final void LIZJ() {
        long guestPreloadDelay = LiveGiftCrossScreenSetting.INSTANCE.getGuestPreloadDelay();
        if (guestPreloadDelay >= 0) {
            C786410Ut5.LJLIIL(guestPreloadDelay, LIZLLL, RunnableC1133080fak.LL);
        }
        if (LiveGiftPreDownloadInteractiveAssetSetting.INSTANCE.isEnable()) {
            LIZ(GiftManager.inst().getPreDownloadEffectGiftList());
        }
    }

    public static final void LIZ(List<? extends Gift> list) {
        boolean z;
        if (!LiveGiftPreDownloadInteractiveAssetSetting.INSTANCE.isEnable()) {
            return;
        }
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C20441214yg.LJ("GiftInteractiveAssetPreDownloadHelperImpl", "pre download interactive gifts phase2, return by gifts.isNullOrEmpty");
            return;
        }
        C1133920fc6 c1133920fc6 = new C1133920fc6(new C1939607ik(list), new AComparatorS36S0000000_17(9));
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it2 = c1133920fc6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((Gift) it2.next()).primaryEffectId));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pre download interactive gifts phase2 prepare, tempList = ");
        sbLIZ.append(arrayList);
        C1138230fj3.LIZ("GiftInteractiveAssetPreDownloadHelperImpl", C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList2 = new ArrayList(C13LP.LL(arrayList, LiveGiftPreDownloadInteractiveAssetSetting.INSTANCE.getPreloadCount()));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("pre download interactive gifts phase2 prepare, effectList = ");
        sbLIZ2.append(arrayList2);
        C1138230fj3.LIZ("GiftInteractiveAssetPreDownloadHelperImpl", C2188811AlT.LIZIZ(sbLIZ2));
        if (arrayList2.isEmpty()) {
            return;
        }
        C786410Ut5.LJLIIL(LiveGiftCrossScreenSetting.INSTANCE.getAnchorPreloadDelay(), LIZLLL, new ARunnableS117S0100000_17(arrayList2, 117));
    }
}
