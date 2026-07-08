package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Ust, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786290Ust implements InterfaceC254900yh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC254900yh
    public final void x1(int i) {
        switch (this.$t) {
            case 0:
                x1$0(this, i);
                break;
            case 1:
                x1$1(this, i);
                break;
            case 2:
                x1$2(this, i);
                break;
            case 3:
                x1$3(this, i);
                break;
            case 4:
                x1$4(this, i);
                break;
            case 5:
                x1$5(this, i);
                break;
            case 6:
                x1$6(this, i);
                break;
            case 7:
                x1$7(this, i);
                break;
            case 8:
                x1$8(this, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                x1$9(this, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                x1$10(this, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                x1$11(this, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                x1$12(this, i);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                x1$13(this, i);
                break;
            case 14:
                x1$14(this, i);
                break;
            case 15:
                x1$15(this, i);
                break;
        }
    }

    public C786290Ust(InterfaceC785110Uqz interfaceC785110Uqz, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
                this.l0 = interfaceC785110Uqz;
                break;
            default:
                this.l0 = interfaceC785110Uqz;
                break;
        }
    }

    public static final void x1$0(C786290Ust c786290Ust, int i) {
        InterfaceC785110Uqz interfaceC785110Uqz = (InterfaceC785110Uqz) c786290Ust.l0;
        if (interfaceC785110Uqz != null) {
            interfaceC785110Uqz.LIZ(i);
        }
    }

    public static final void x1$1(C786290Ust c786290Ust, int i) {
        InterfaceC785110Uqz interfaceC785110Uqz = (InterfaceC785110Uqz) c786290Ust.l0;
        if (interfaceC785110Uqz != null) {
            interfaceC785110Uqz.LIZ(i);
        }
    }

    public static final void x1$10(C786290Ust c786290Ust, int i) {
        InterfaceC785110Uqz interfaceC785110Uqz = (InterfaceC785110Uqz) c786290Ust.l0;
        if (interfaceC785110Uqz != null) {
            interfaceC785110Uqz.LIZ(i);
        }
    }

    public static final void x1$11(C786290Ust c786290Ust, int i) {
        ((PreviewSettingWidget) c786290Ust.l0).LLJJ = false;
    }

    public static final void x1$12(C786290Ust c786290Ust, int i) {
        if (i != 6) {
            if (i == 8) {
                ((C0UIJ) c786290Ust.l0).LLILZ = "guide_click_tip";
                return;
            }
            return;
        }
        ((C0UIJ) c786290Ust.l0).LLILZ = "guide_click_icon";
    }

    public static final void x1$13(C786290Ust c786290Ust, int i) {
        if (i == 6) {
            ((C0UXA) c786290Ust.l0).LLJIJIL = "guide_click_icon";
        }
    }

    public static final void x1$14(C786290Ust c786290Ust, int i) {
        if (i != 6) {
            if (i == 8) {
                ((C0UXA) c786290Ust.l0).LLJIJIL = "guide_click_tip";
                return;
            }
            return;
        }
        ((C0UXA) c786290Ust.l0).LLJIJIL = "guide_click_icon";
    }

    public static final void x1$15(C786290Ust c786290Ust, int i) {
        if (i == 6) {
            ((C0UIJ) c786290Ust.l0).LLILZ = "guide_click_icon";
        }
    }

    public static final void x1$2(C786290Ust c786290Ust, int i) {
        InterfaceC785110Uqz interfaceC785110Uqz = (InterfaceC785110Uqz) c786290Ust.l0;
        if (interfaceC785110Uqz != null) {
            interfaceC785110Uqz.LIZ(i);
        }
    }

    public static final void x1$3(C786290Ust c786290Ust, int i) {
        ((PreviewSettingWidget) c786290Ust.l0).LLIZ = false;
    }

    public static final void x1$4(C786290Ust c786290Ust, int i) {
        ((C0UF1) c786290Ust.l0).LIZIZ();
    }

    public static final void x1$5(C786290Ust c786290Ust, int i) {
        ((C0UF1) c786290Ust.l0).LIZIZ();
    }

    public static final void x1$6(C786290Ust c786290Ust, int i) {
        ((C0UF0) c786290Ust.l0).LIZIZ();
        ((C0UF0) c786290Ust.l0).getClass();
        C0UF0.LIZLLL(i, "livesdk_trymode_pm_live_sticker_click");
    }

    public static final void x1$7(C786290Ust c786290Ust, int i) {
        if (i == 6) {
            ((C0UF0) c786290Ust.l0).LLJJIII = "guide_click_icon";
        }
    }

    public static final void x1$8(C786290Ust c786290Ust, int i) {
        if (i != 6) {
            if (i == 8) {
                ((C0UF0) c786290Ust.l0).LLJJIII = "guide_click_tip";
                return;
            }
            return;
        }
        ((C0UF0) c786290Ust.l0).LLJJIII = "guide_click_icon";
    }

    public static final void x1$9(C786290Ust c786290Ust, int i) {
        ((C0UF0) c786290Ust.l0).LIZIZ();
        ((C0UF0) c786290Ust.l0).getClass();
        C0UF0.LIZLLL(i, "livesdk_trymode_anchor_ksong_icon_click");
    }

    public C786290Ust(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
