package Y;

import X.C0SR4;
import X.C0UA2;
import X.C0UUF;
import X.InterfaceC761540Tu4;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ui.layout.AsyncInflaterCacheCheckRunnable;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AObjectS387S0100000_12 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS387S0100000_12 aObjectS387S0100000_12) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aObjectS387S0100000_12.l0;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.i(true);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS387S0100000_12 aObjectS387S0100000_12) {
        C0UUF c0uuf = (C0UUF) aObjectS387S0100000_12.l0;
        c0uuf.LLILZ.LJ(c0uuf.LLJILLL);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS387S0100000_12 aObjectS387S0100000_12) {
        Function0 function0 = (Function0) aObjectS387S0100000_12.l0;
        return new Pair(((Pair) function0.invoke()).getFirst(), ((Pair) function0.invoke()).getSecond());
    }

    public static final Object invoke$2(AObjectS387S0100000_12 aObjectS387S0100000_12) {
        return ((IGiftService) aObjectS387S0100000_12.l0).getRedEnvelopeWidget();
    }

    public static final Object invoke$3(AObjectS387S0100000_12 aObjectS387S0100000_12) {
        return ((IGoodyBagService) aObjectS387S0100000_12.l0).OS0();
    }

    public static final Object invoke$4(AObjectS387S0100000_12 aObjectS387S0100000_12) {
        return ((ITreasureBoxService) aObjectS387S0100000_12.l0).sR1();
    }

    public static final Object invoke$5(AObjectS387S0100000_12 aObjectS387S0100000_12) {
        return ((ITreasureBoxService) aObjectS387S0100000_12.l0).W70();
    }

    public static final Object invoke$6(AObjectS387S0100000_12 aObjectS387S0100000_12) {
        DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) aObjectS387S0100000_12.l0;
        if (detailFragmentPanel.h()) {
            AsyncInflaterCacheCheckRunnable asyncInflaterCacheCheckRunnable = detailFragmentPanel.f340Y;
            if (asyncInflaterCacheCheckRunnable != null) {
                asyncInflaterCacheCheckRunnable.LJ(new ARunnableS112S0100000_12(detailFragmentPanel, 170));
                return null;
            }
            return null;
        }
        detailFragmentPanel.C(detailFragmentPanel.LJIIIIZZ());
        return null;
    }

    public static final Object invoke$7(AObjectS387S0100000_12 aObjectS387S0100000_12) {
        return ((GuestMediaManageFragment) aObjectS387S0100000_12.l0).LLILLJJLI.getLiveStream();
    }

    public static final Object invoke$8(AObjectS387S0100000_12 aObjectS387S0100000_12) {
        C0SR4 c0sr4 = ((BaseListFragmentPanel) aObjectS387S0100000_12.l0).LLJL;
        if (c0sr4 != null) {
            c0sr4.notifyDataSetChanged();
            return null;
        }
        return null;
    }

    public static final Object invoke$9(AObjectS387S0100000_12 aObjectS387S0100000_12) {
        InterfaceC761540Tu4 interfaceC761540Tu4 = ((C0UA2) aObjectS387S0100000_12.l0).LIZJ;
        if (interfaceC761540Tu4 != null) {
            interfaceC761540Tu4.LIZIZ();
            return null;
        }
        return null;
    }

    public AObjectS387S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
