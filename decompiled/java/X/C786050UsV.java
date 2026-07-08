package X;

import android.widget.SeekBar;
import com.bytedance.android.live.effect.music.LiveBGMFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.AbsMultiGuestEffectViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0UsV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786050UsV implements SeekBar.OnSeekBarChangeListener {
    public final int $t;
    public Object l0;

    public static final void onStartTrackingTouch$0(C786050UsV c786050UsV, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$1(C786050UsV c786050UsV, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$2(C786050UsV c786050UsV, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$3(C786050UsV c786050UsV, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$4(C786050UsV c786050UsV, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$5(C786050UsV c786050UsV, SeekBar seekBar) {
    }

    public static final void onStopTrackingTouch$1(C786050UsV c786050UsV, SeekBar seekBar) {
    }

    public static final void onStopTrackingTouch$2(C786050UsV c786050UsV, SeekBar seekBar) {
    }

    public static final void onStopTrackingTouch$3(C786050UsV c786050UsV, SeekBar seekBar) {
    }

    public static final void onStopTrackingTouch$5(C786050UsV c786050UsV, SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.$t) {
            case 0:
                onProgressChanged$0(this, seekBar, i, z);
                break;
            case 1:
                onProgressChanged$1(this, seekBar, i, z);
                break;
            case 2:
                onProgressChanged$2(this, seekBar, i, z);
                break;
            case 3:
                onProgressChanged$3(this, seekBar, i, z);
                break;
            case 4:
                onProgressChanged$4(this, seekBar, i, z);
                break;
            case 5:
                onProgressChanged$5(this, seekBar, i, z);
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.$t) {
            case 0:
                onStartTrackingTouch$0(this, seekBar);
                break;
            case 1:
                onStartTrackingTouch$1(this, seekBar);
                break;
            case 2:
                onStartTrackingTouch$2(this, seekBar);
                break;
            case 3:
                onStartTrackingTouch$3(this, seekBar);
                break;
            case 4:
                onStartTrackingTouch$4(this, seekBar);
                break;
            case 5:
                onStartTrackingTouch$5(this, seekBar);
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.$t) {
            case 0:
                onStopTrackingTouch$0(this, seekBar);
                break;
            case 1:
                onStopTrackingTouch$1(this, seekBar);
                break;
            case 2:
                onStopTrackingTouch$2(this, seekBar);
                break;
            case 3:
                onStopTrackingTouch$3(this, seekBar);
                break;
            case 4:
                onStopTrackingTouch$4(this, seekBar);
                break;
            case 5:
                onStopTrackingTouch$5(this, seekBar);
                break;
        }
    }

    public C786050UsV(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onStopTrackingTouch$0(C786050UsV c786050UsV, SeekBar seekBar) {
        InterfaceC769650UHb interfaceC769650UHb;
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = ((MultiGuestBeautyLevelAdjustFragment) c786050UsV.l0).LL;
        if (absMultiGuestEffectViewModel != null && (interfaceC769650UHb = absMultiGuestEffectViewModel.LLJILJILJ) != null) {
            interfaceC769650UHb.LIZIZ();
        }
    }

    public static final void onStopTrackingTouch$4(C786050UsV c786050UsV, SeekBar seekBar) {
        ((LiveBGMFragment) c786050UsV.l0).UR();
    }

    public static final void onProgressChanged$0(C786050UsV c786050UsV, SeekBar seekBar, int i, boolean z) {
        InterfaceC923870a9J interfaceC923870a9J;
        InterfaceC769650UHb interfaceC769650UHb;
        if (z) {
            AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = ((MultiGuestBeautyLevelAdjustFragment) c786050UsV.l0).LL;
            if (absMultiGuestEffectViewModel != null && (interfaceC769650UHb = absMultiGuestEffectViewModel.LLJILJILJ) != null) {
                interfaceC769650UHb.LJ(i);
            }
            AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel2 = ((MultiGuestBeautyLevelAdjustFragment) c786050UsV.l0).LL;
            if (absMultiGuestEffectViewModel2 != null && (interfaceC923870a9J = absMultiGuestEffectViewModel2.LLILZ) != null) {
                interfaceC923870a9J.LJIILLIIL();
            }
        }
    }

    public static final void onProgressChanged$1(C786050UsV c786050UsV, SeekBar seekBar, int i, boolean z) {
        InterfaceC784750UqP callBack = ((C784760UqQ) c786050UsV.l0).getCallBack();
        if (callBack != null) {
            callBack.LJ(i);
        }
    }

    public static final void onProgressChanged$2(C786050UsV c786050UsV, SeekBar seekBar, int i, boolean z) {
        boolean z2;
        C784730UqN c784730UqN = (C784730UqN) c786050UsV.l0;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c784730UqN.LLIZLLLIL != z2) {
            c784730UqN.LLIZLLLIL = z2;
            InterfaceC784750UqP interfaceC784750UqP = c784730UqN.LLIZ;
            if (interfaceC784750UqP != null) {
                interfaceC784750UqP.LIZIZ(z2);
            }
        }
        InterfaceC784750UqP callBack = ((C784730UqN) c786050UsV.l0).getCallBack();
        if (callBack != null) {
            callBack.LIZ(i, ((C784730UqN) c786050UsV.l0).LLJ);
        }
        ((C784730UqN) c786050UsV.l0).h0(i);
    }

    public static final void onProgressChanged$3(C786050UsV c786050UsV, SeekBar seekBar, int i, boolean z) {
        InterfaceC784750UqP callBack = ((C784730UqN) c786050UsV.l0).getCallBack();
        if (callBack != null) {
            callBack.LIZJ(i);
        }
        ((C784730UqN) c786050UsV.l0).e0(i);
    }

    public static final void onProgressChanged$4(C786050UsV c786050UsV, SeekBar seekBar, int i, boolean z) {
        C11JF c11jf = ((LiveBGMFragment) c786050UsV.l0).LLJIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        ((LiveBGMFragment) c786050UsV.l0).ZR(i);
        float f = i / 200.0f;
        InterfaceC766480U4w.LJJIJIIJIL.LJFF(Float.valueOf(f));
        AbstractC765580U1k abstractC765580U1kLIZIZ = C763260Twq.LIZIZ();
        if (abstractC765580U1kLIZIZ != null) {
            abstractC765580U1kLIZIZ.LLJILJIL(f);
        }
        LiveBGMFragment liveBGMFragment = (LiveBGMFragment) c786050UsV.l0;
        liveBGMFragment.LLJJ = i;
        liveBGMFragment.LLJJL = true;
    }

    public static final void onProgressChanged$5(C786050UsV c786050UsV, SeekBar seekBar, int i, boolean z) {
        C780540Ujc c780540Ujc = ((C0UKK) c786050UsV.l0).LLJ;
        if (c780540Ujc != null) {
            C500260Jjc.LLFFF(c780540Ujc);
        }
        C0UK0.LIZJ = true;
        C500260Jjc.LJIILIIL(((C0UKK) c786050UsV.l0).getExposureSunFromXml());
        C0UKK c0ukk = (C0UKK) c786050UsV.l0;
        c0ukk.LLJILLL = ((i - 500) * c0ukk.LLILZIL) / LSPassThroughRecordSizeConfig.DEFAULT;
        if (C500260Jjc.LJJIJLIJ()) {
            C0UJY c0ujyLIZ = C770730ULf.LIZ(((C0UKK) c786050UsV.l0).getDataChannel());
            if (c0ujyLIZ != null) {
                c0ujyLIZ.setExposureCompensation(((C0UKK) c786050UsV.l0).LLJILLL);
                return;
            }
            return;
        }
        C1273890jFr liveStream = ((C0UKK) c786050UsV.l0).getLiveStream();
        if (liveStream == null) {
            return;
        }
        liveStream.LJIIIZ(((C0UKK) c786050UsV.l0).LLJILLL);
    }
}
