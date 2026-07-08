package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00mM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C178400mM extends C09AY implements Function1<Gift, Boolean> {
    public final /* synthetic */ Set<Long> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C178600mO LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C178400mM(Set<Long> set, long j, boolean z, C178600mO c178600mO, boolean z2) {
        super(1);
        this.LL = set;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = c178600mO;
        this.LLILZIL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Gift gift) {
        List<Integer> list;
        List<Integer> list2;
        Gift.UGGiftStructInfo uGGiftStructInfo;
        GiftLockInfo giftLockInfo;
        Gift gift2 = gift;
        boolean z = true;
        if (gift2.isDisplayedOnPanel && !this.LL.contains(Long.valueOf(gift2.id)) && gift2.id != this.LLILLJJLI && ((this.LLILLL || !gift2.isRandomGift) && (((list = gift2.giftVerticalScenarios) == null || !list.contains(28)) && (((list2 = gift2.giftVerticalScenarios) == null || !list2.contains(31)) && gift2.giftSubType != 4)))) {
            C178600mO c178600mO = this.LLILZ;
            boolean z2 = this.LLILZIL;
            c178600mO.getClass();
            if (GiftManager.inst().getFreqLimitOption(Long.valueOf(gift2.id)) == null && (((uGGiftStructInfo = gift2.ugGiftInfo) == null || !uGGiftStructInfo.isUgGift || !z2) && (((giftLockInfo = gift2.giftSubInfo) == null || !giftLockInfo.mLock) && !gift2.LIZIZ() && !gift2.LJFF() && !gift2.LJIIIIZZ() && !gift2.LJII() && !gift2.LIZJ() && !gift2.LJI() && gift2.type != 3 && !gift2.isBoxGift))) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
