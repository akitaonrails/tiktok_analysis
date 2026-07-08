package X;

import Y.ARunnableS133S0100000_33;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1AmV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189451AmV extends BroadcastReceiver {
    public final int $t;
    public Object l0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.$t) {
            case 0:
                onReceive$0(this, context, intent);
                break;
            case 1:
                onReceive$1(this, context, intent);
                break;
            case 2:
                onReceive$2(this, context, intent);
                break;
            case 3:
                onReceive$3(this, context, intent);
                break;
            default:
                super.onReceive(context, intent);
                break;
        }
    }

    public final void LIZ$1() {
        if (((C2179501ARo) this.l0).LJFF.LIZLLL()) {
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                ((C2179501ARo) this.l0).LIZIZ.LJIIIIZZ(new C0NIR("PAUSE_FROM_AUDIO_OUTPUT_CHANGED"));
            } else {
                C2487409ou.LIZJ(new ARunnableS133S0100000_33((C2179501ARo) this.l0, 118));
            }
        }
    }

    public final void LIZ$0(Intent intent) {
        Intent intent2;
        if (intent != null && (intent2 = (Intent) intent.getParcelableExtra("EXTRA_MEDIA_BUTTON_DATA")) != null) {
            C1AS1 c1as1 = ((BackgroundAudioBrowserService) this.l0).LLJ;
            C2179501ARo c2179501ARo = null;
            if (c1as1 == null) {
                c1as1 = null;
            }
            if (c1as1.LIZJ().LIZ) {
                int intExtra = intent2.getIntExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", -1);
                if (intExtra == -1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("receive a unknown command: ");
                    sbLIZ.append(intExtra);
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    switch (intExtra) {
                        case 1:
                        case 2:
                            c1as1.LIZLLL();
                            break;
                        case 3:
                            C1ARM c1arm = c1as1.LJ;
                            if (c1arm != null && c1arm.isAppBackground()) {
                                c1as1.LJ.pullAppToForeground();
                            }
                            break;
                        case 4:
                            C1ARK c1ark = c1as1.LIZIZ;
                            if (c1ark.LIZJ().isPlayingState()) {
                                c1ark.LJIIIIZZ(new C0NIR("PAUSE_FROM_NOTIFICATION_CLICK"));
                            } else {
                                c1ark.LJII(new C0NIR("PLAY_FROM_NOTIFICATION_CLICK"));
                            }
                            break;
                        case 5:
                            if (c1as1.LIZLLL.LJI()) {
                                c1as1.LIZJ.LJIILJJIL(new C0NIR("operation_from_media_session_skip_to_next"));
                            }
                            break;
                        case 6:
                            if (c1as1.LIZLLL.LJFF()) {
                                c1as1.LIZJ.LJIJ(new C0NIR("operation_from_media_session_skip_to_prev"));
                            }
                            break;
                    }
                }
            }
            C2179501ARo c2179501ARo2 = ((BackgroundAudioBrowserService) this.l0).LLJI;
            if (c2179501ARo2 != null) {
                c2179501ARo = c2179501ARo2;
            }
            C1ASB.LIZIZ(c2179501ARo.LJFF, intent2);
        }
    }

    public final void LIZ$2(Intent intent) {
        Intent intent2;
        C1ARM c1arm;
        if (intent != null && (intent2 = (Intent) intent.getParcelableExtra("EXTRA_MEDIA_BUTTON_DATA")) != null) {
            C1AS5 c1as5 = ((C2179481ARm) this.l0).LLJ;
            if (c1as5 != null && c1as5.LIZJ().LIZ) {
                int intExtra = intent2.getIntExtra("command_from_notification", -1);
                if (intExtra == -1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("receive a unknown command: ");
                    sbLIZ.append(intExtra);
                    C2188811AlT.LIZIZ(sbLIZ);
                } else if (intExtra != 1 && intExtra != 2) {
                    if (intExtra == 3 && (c1arm = c1as5.LIZJ) != null && c1arm.isAppBackground()) {
                        c1as5.LIZJ.pullAppToForeground();
                    }
                } else {
                    c1as5.LIZLLL();
                }
            }
            C2179511ARp c2179511ARp = ((C2179481ARm) this.l0).LLJI;
            if (c2179511ARp != null) {
                C1ASB.LIZIZ(c2179511ARp.LIZLLL, intent2);
            }
        }
    }

    public C2189451AmV(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onReceive$0(C2189451AmV c2189451AmV, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c2189451AmV.LIZ$0(intent);
        } else {
            C2408409cA.LIZ();
            c2189451AmV.LIZ$0(intent);
        }
    }

    public static final void onReceive$1(C2189451AmV c2189451AmV, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c2189451AmV.LIZ$1();
        } else {
            C2408409cA.LIZ();
            c2189451AmV.LIZ$1();
        }
    }

    public static final void onReceive$2(C2189451AmV c2189451AmV, Context context, Intent intent) {
        C1ARK c1ark;
        C1ARK c1ark2;
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            C1ARL c1arl = ((C2179481ARm) c2189451AmV.l0).LL;
            if (c1arl != null && (c1ark2 = c1arl.LIZJ) != null) {
                c1ark2.LJIIIIZZ(new C0NIR("PAUSE_FROM_AUDIO_OUTPUT_CHANGED"));
                return;
            }
            return;
        }
        C2408409cA.LIZ();
        C1ARL c1arl2 = ((C2179481ARm) c2189451AmV.l0).LL;
        if (c1arl2 == null || (c1ark = c1arl2.LIZJ) == null) {
            return;
        }
        c1ark.LJIIIIZZ(new C0NIR("PAUSE_FROM_AUDIO_OUTPUT_CHANGED"));
    }

    public static final void onReceive$3(C2189451AmV c2189451AmV, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c2189451AmV.LIZ$2(intent);
        } else {
            C2408409cA.LIZ();
            c2189451AmV.LIZ$2(intent);
        }
    }
}
