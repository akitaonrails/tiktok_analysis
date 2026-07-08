package Y;

import X.AnonymousClass0956;
import X.C01MS;
import X.C0PEM;
import X.C0UT9;
import X.C1161920gLG;
import X.C142V;
import X.C1802410x0J;
import X.C1802820x0y;
import X.C1803800x2Y;
import X.C1803830x2b;
import X.C1834120xpS;
import X.C1835140xr6;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C472230IfV;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C501520Jle;
import X.C786410Ut5;
import X.C920470a3p;
import X.DialogC1841990y29;
import X.InterfaceC1802860x12;
import X.InterfaceC1809000xAw;
import X.InterfaceC743640TFa;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.HighlightPreviewClipFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS606S0100000_27;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: loaded from: classes28.dex */
public class AcS498S0100000_27 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
            case 3:
                LIZ$3(this, liveDialog);
                break;
            case 4:
                LIZ$4(this, liveDialog);
                break;
            case 5:
                LIZ$5(this, liveDialog);
                break;
            case 6:
                LIZ$6(this, liveDialog);
                break;
            case 7:
                LIZ$7(this, liveDialog);
                break;
            case 8:
                LIZ$8(this, liveDialog);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, liveDialog);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, liveDialog);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, liveDialog);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, liveDialog);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, liveDialog);
                break;
            case 14:
                LIZ$14(this, liveDialog);
                break;
            case 15:
                LIZ$15(this, liveDialog);
                break;
        }
    }

    public AcS498S0100000_27(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Function0) acS498S0100000_27.l0).invoke();
    }

    public static final void LIZ$1(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Function0) acS498S0100000_27.l0).invoke();
    }

    public static final void LIZ$10(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        Exception exc;
        C1802820x0y c1802820x0y = (C1802820x0y) acS498S0100000_27.l0;
        C1802410x0J c1802410x0J = c1802820x0y.LJIILIIL;
        if (c1802410x0J != null) {
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            CustomErrorExtra customErrorExtra = c1802820x0y.LJIILJJIL;
            String str = c1802820x0y.LJIILL;
            c1803800x2Y.getClass();
            C1803800x2Y.LJJIJIIJIL(c1802410x0J, "dismiss", "dismiss", customErrorExtra, str);
        }
        InterfaceC1802860x12 interfaceC1802860x12 = c1802820x0y.LIZIZ;
        if (interfaceC1802860x12 != null) {
            interfaceC1802860x12.LIZIZ();
        }
        C1802820x0y c1802820x0y2 = (C1802820x0y) acS498S0100000_27.l0;
        int i = c1802820x0y2.LJIIIZ;
        if (i == 1) {
            Runnable runnable = c1802820x0y2.LJIIL;
            if (runnable != null) {
                runnable.run();
            }
        } else if (i == 2) {
            Runnable runnable2 = c1802820x0y2.LJIIJJI;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else if (i == CustomErrorExtra.DISMISS_ACTION_OPEN_RECHARGE) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("key_charge_reason", "custom_error", bundle);
            C1803830x2b c1803830x2b = new C1803830x2b();
            C1802410x0J c1802410x0J2 = c1802820x0y2.LJIILIIL;
            Exception exc2 = null;
            if (c1802410x0J2 != null) {
                exc = c1802410x0J2.LIZLLL;
            } else {
                exc = null;
            }
            if (exc instanceof C501470JlZ) {
                if (c1802410x0J2 != null) {
                    exc2 = c1802410x0J2.LIZLLL;
                }
                Map<String, String> map = c1803830x2b.LIZJ;
                String string = Integer.valueOf(((C501520Jle) exc2).getErrorCode()).toString();
                if (string == null) {
                    string = "";
                }
                map.put("error_code", string);
            }
            C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS60S0300000_27(c1802820x0y2, bundle, c1803830x2b, 5));
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$11(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        ((Function0) acS498S0100000_27.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$12(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        String string;
        Gift gift = ((DialogC1841990y29) acS498S0100000_27.l0).LLJJIJIL;
        if (gift == null || (string = Long.valueOf(gift.id).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        DialogC1841990y29 dialogC1841990y29 = (DialogC1841990y29) acS498S0100000_27.l0;
        C920470a3p.LIZ(string, String.valueOf(dialogC1841990y29.LLJIJIL - dialogC1841990y29.LLJI), "cancel", "second");
        liveDialog.dismiss();
    }

    public static final void LIZ$13(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((HighlightPreviewClipFragment) acS498S0100000_27.l0).LLJZIJLIL = null;
    }

    public static final void LIZ$14(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        String str;
        liveDialog.dismiss();
        HighlightPreviewClipFragment highlightPreviewClipFragment = (HighlightPreviewClipFragment) acS498S0100000_27.l0;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        highlightPreviewClipFragment.LLJZIJLIL = null;
        AnonymousClass0956 anonymousClass0956 = highlightPreviewClipFragment.LLJLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        HighlightPreviewClipFragment highlightPreviewClipFragment2 = (HighlightPreviewClipFragment) acS498S0100000_27.l0;
        C1835140xr6 c1835140xr6 = C1835140xr6.LL;
        LiveFragmentDetail liveFragmentDetail = highlightPreviewClipFragment2.LLILLJJLI;
        if (liveFragmentDetail != null) {
            str = liveFragmentDetail.fragmentIdStr;
        } else {
            str = null;
        }
        AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(highlightPreviewClipFragment2, 497);
        if (str != null && str.length() != 0) {
            C1DFH c1dfh = C0PEM.LIZ;
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C01MS(str, awS606S0100000_27, null), 3);
        } else {
            awS606S0100000_27.invoke(Boolean.FALSE);
        }
        highlightPreviewClipFragment2.LLJLLIL = anonymousClass0956LIZLLL;
    }

    public static final void LIZ$15(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        ((InterfaceC1809000xAw) acS498S0100000_27.l0).LIZIZ();
        C472230IfV.LIZLLL("clear");
        liveDialog.dismiss();
    }

    public static final void LIZ$2(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = (LiveReplayVideoPlayerDialogFragment) acS498S0100000_27.l0;
        long j = CastLongProtector.parseLong(liveReplayVideoPlayerDialogFragment.LLLF);
        if (!liveReplayVideoPlayerDialogFragment.LLLIL) {
            liveReplayVideoPlayerDialogFragment.LLLIL = true;
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).cancelLiveReplayAutoDownload(j).LJJLL(new AfS10S0100100_27(liveReplayVideoPlayerDialogFragment, j, 3), new AfS196S0100000_27(liveReplayVideoPlayerDialogFragment, 25));
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$3(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        ((Function0) acS498S0100000_27.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$4(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        ((Function0) acS498S0100000_27.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$5(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        ((Function0) acS498S0100000_27.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$6(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        ((LiveReplayVideoPlayerDialogFragment) acS498S0100000_27.l0).wS("livesdk_live_replay_delete_popup_click", "cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$7(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        ((LiveReplayVideoPlayerDialogFragment) acS498S0100000_27.l0).wS("livesdk_live_replay_delete_popup_click", "delete");
        if (!TextUtils.isEmpty(((LiveReplayVideoPlayerDialogFragment) acS498S0100000_27.l0).LLLF)) {
            boolean z = C1834120xpS.LIZ;
            C1834120xpS.LJFF.add(((LiveReplayVideoPlayerDialogFragment) acS498S0100000_27.l0).LLLF);
            C1834120xpS.LIZJ = true;
            LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = (LiveReplayVideoPlayerDialogFragment) acS498S0100000_27.l0;
            long j = CastLongProtector.parseLong(liveReplayVideoPlayerDialogFragment.LLLF);
            if (!liveReplayVideoPlayerDialogFragment.LLLIL) {
                liveReplayVideoPlayerDialogFragment.LLLIL = true;
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).deleteLiveReplayAutoDownload(j).LJJLL(new AfS196S0100000_27(liveReplayVideoPlayerDialogFragment, 28), new AfS196S0100000_27(liveReplayVideoPlayerDialogFragment, 29));
            }
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$8(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        final LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = (LiveReplayVideoPlayerDialogFragment) acS498S0100000_27.l0;
        final long j = CastLongProtector.parseLong(liveReplayVideoPlayerDialogFragment.LLLF);
        if (Build.VERSION.SDK_INT >= 33) {
            liveReplayVideoPlayerDialogFragment.mS(j);
        } else {
            new C0UT9(C500260Jjc.LJ(liveReplayVideoPlayerDialogFragment.getContext()), TokenCert.Companion.with("bpea-schedule_auto_download_in_video_player")).LIZ(new C142V() { // from class: X.0xqK
                @Override // X.C142V
                public final void LIZ(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LIZIZ(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LIZLLL(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LJ(String str, String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LJFF(String... strArr) {
                }

                @Override // X.C142V
                public final void LIZJ(String... strArr) {
                    liveReplayVideoPlayerDialogFragment.mS(j);
                }
            }, false, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$9(AcS498S0100000_27 acS498S0100000_27, LiveDialog liveDialog) {
        C1802410x0J c1802410x0J;
        Runnable runnable;
        C1802820x0y c1802820x0y = (C1802820x0y) acS498S0100000_27.l0;
        int i = c1802820x0y.LJIIJ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && (runnable = c1802820x0y.LJIIJJI) != null) {
                    runnable.run();
                }
            } else {
                Runnable runnable2 = c1802820x0y.LJIIL;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        } else {
            Runnable runnable3 = c1802820x0y.LJIIL;
            if (runnable3 != null) {
                runnable3.run();
            }
            C1802820x0y c1802820x0y2 = (C1802820x0y) acS498S0100000_27.l0;
            String str = c1802820x0y2.LJII;
            if (str != null) {
                c1802820x0y2.LIZIZ(str, "primary_cta");
            }
        }
        C1802820x0y c1802820x0y3 = (C1802820x0y) acS498S0100000_27.l0;
        if (c1802820x0y3.LJII == null && (c1802410x0J = c1802820x0y3.LJIILIIL) != null) {
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            CustomErrorExtra customErrorExtra = c1802820x0y3.LJIILJJIL;
            String str2 = c1802820x0y3.LJIILL;
            c1803800x2Y.getClass();
            C1803800x2Y.LJJIJIIJIL(c1802410x0J, "dismiss", "primary_cta", customErrorExtra, str2);
        }
        InterfaceC1802860x12 interfaceC1802860x12 = c1802820x0y3.LIZIZ;
        if (interfaceC1802860x12 != null) {
            interfaceC1802860x12.LIZ();
        }
        liveDialog.dismiss();
    }
}
