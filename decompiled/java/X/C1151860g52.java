package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0g52, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151860g52 implements InterfaceC254600ye {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC254600ye
    public final void onShow() {
        switch (this.$t) {
            case 0:
                onShow$0(this);
                break;
            case 1:
                onShow$1(this);
                break;
            case 2:
                onShow$2(this);
                break;
            case 3:
                onShow$3(this);
                break;
        }
    }

    public static final void onShow$0(C1151860g52 c1151860g52) {
        ((InterfaceC1123790fLl) c1151860g52.l0).onShow();
    }

    public static final void onShow$1(C1151860g52 c1151860g52) {
        InterfaceC1094160eZy.E1.LJFF(Boolean.TRUE);
        ((C1123280fKw) c1151860g52.l0).LLJILJILJ = true;
    }

    public static final void onShow$2(C1151860g52 c1151860g52) {
        ((Function0) c1151860g52.l0).invoke();
    }

    public static final void onShow$3(C1151860g52 c1151860g52) {
        long j;
        List<Gift> matchGameGifts;
        Gift gift;
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        if (interfaceC1128210fStInst != null && (matchGameGifts = interfaceC1128210fStInst.getMatchGameGifts(1)) != null && (gift = (Gift) C13LP.LJJJLZIJ(0, matchGameGifts)) != null) {
            j = gift.id;
        } else {
            j = 0;
        }
        ((C1120780fGu) c1151860g52.l0).LIZ(new C1121190fHZ(EnumC1120810fGx.GIFT_CATCH_BEAN_GAME, EnumC1118040fCU.BUBBLE, j, (Integer) null, 24));
        C1123450fLD.LIZLLL(Long.valueOf(j), EnumC1120830fGz.GIFT_CATCH_BEAN_GAME, null, 12);
        C0TDE.LIZ.storeBoolean(C0TDE.LIZ(), true);
    }

    public C1151860g52(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
