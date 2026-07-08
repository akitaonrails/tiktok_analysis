package Y;

import X.C09JN;
import X.C199499133x;
import X.C20441214yg;
import X.C2188811AlT;
import X.C486790J7d;
import Y.AfS4S0100100_12;
import com.bytedance.android.livesdk.broadcast.interaction.function.BroadcastMessagePresenter;
import com.bytedance.android.livesdk.dataChannel.CaptchaFloatTipEvent;
import com.bytedance.android.livesdk.dataChannel.CaptchaLivePauseTimeChannel;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import tikcast.api.eco.CaptchaCheckResponse;

/* JADX INFO: loaded from: classes13.dex */
public class AfS4S0100200_12 implements C09JN {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS4S0100200_12 afS4S0100200_12, Object obj) {
        CaptchaCheckResponse.ResponseData responseData;
        BroadcastMessagePresenter broadcastMessagePresenter = (BroadcastMessagePresenter) afS4S0100200_12.l0;
        long j = afS4S0100200_12.j1;
        long j2 = afS4S0100200_12.j2;
        CaptchaCheckResponse captchaCheckResponse = (CaptchaCheckResponse) obj;
        broadcastMessagePresenter.getClass();
        if (captchaCheckResponse != null && (responseData = captchaCheckResponse.data) != null) {
            if (C199499133x.LIZ(responseData.captchaDecision)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("requestAndPopCaptchaDialog got empty captchaDecision, will not show Captcha dialog, captchaId=");
                sbLIZ.append(j);
                sbLIZ.append(", roomId=");
                sbLIZ.append(broadcastMessagePresenter.LLILZ.getId());
                C20441214yg.LJIIL("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            broadcastMessagePresenter.LIZIZ();
            broadcastMessagePresenter.LLIZLLLIL = false;
            broadcastMessagePresenter.LLIZ = false;
            broadcastMessagePresenter.LIZJ(j, j2, captchaCheckResponse.data.captchaDecision);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("requestAndPopCaptchaDialog got empty captchaCheckResponse, captchaId=");
        sbLIZ2.append(j);
        sbLIZ2.append(", roomId=");
        sbLIZ2.append(broadcastMessagePresenter.LLILZ.getId());
        C20441214yg.LJIIL("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void accept$1(AfS4S0100200_12 afS4S0100200_12, Object obj) {
        CaptchaCheckResponse.ResponseData responseData;
        final BroadcastMessagePresenter broadcastMessagePresenter = (BroadcastMessagePresenter) afS4S0100200_12.l0;
        final long j = afS4S0100200_12.j1;
        final long j2 = afS4S0100200_12.j2;
        final CaptchaCheckResponse captchaCheckResponse = (CaptchaCheckResponse) obj;
        broadcastMessagePresenter.getClass();
        if (captchaCheckResponse != null && (responseData = captchaCheckResponse.data) != null) {
            if (C199499133x.LIZ(responseData.captchaDecision)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("requestCaptchaForGameMode got empty captchaDecision, will not show Captcha dialog, captchaId=");
                sbLIZ.append(j);
                sbLIZ.append(", roomId=");
                sbLIZ.append(broadcastMessagePresenter.LLILZ.getId());
                C20441214yg.LJIIL("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            broadcastMessagePresenter.LIZIZ();
            broadcastMessagePresenter.LLIZLLLIL = false;
            broadcastMessagePresenter.LLIZ = false;
            broadcastMessagePresenter.LLJIJIL = System.currentTimeMillis();
            C486790J7d.LIZLLL(new Runnable() { // from class: X.0Ulo
                @Override // java.lang.Runnable
                public final void run() {
                    BroadcastMessagePresenter broadcastMessagePresenter2 = broadcastMessagePresenter;
                    long j3 = j2;
                    long j4 = j;
                    broadcastMessagePresenter2.LLILZIL.LC0(CaptchaFloatTipEvent.class, Unit.LIZ);
                    broadcastMessagePresenter2.LLILZIL.zW(CaptchaLivePauseTimeChannel.class, Long.valueOf(j3));
                    C20441214yg.LJIIIZ("BroadcastMessagePresenter", "scheduleGameCaptchaTimeout timeout started.");
                    C11NZ.LJLJJLL(j3, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJLL(new AfS4S0100100_12(j4, broadcastMessagePresenter2, 3), C0J1R.LIZ);
                    broadcastMessagePresenter2.LLILZLL = false;
                }
            }, null, 1000L);
            broadcastMessagePresenter.LIZLLL(new Runnable() { // from class: X.0Ulp
                @Override // java.lang.Runnable
                public final void run() {
                    BroadcastMessagePresenter broadcastMessagePresenter2 = broadcastMessagePresenter;
                    long j3 = j2;
                    long j4 = j;
                    CaptchaCheckResponse captchaCheckResponse2 = captchaCheckResponse;
                    broadcastMessagePresenter2.getClass();
                    long jMax = Math.max(j3 - ((System.currentTimeMillis() - broadcastMessagePresenter2.LLJIJIL) / 1000), 0L);
                    if (jMax > 0) {
                        broadcastMessagePresenter2.LIZJ(j4, jMax, captchaCheckResponse2.data.captchaDecision);
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("requestCaptchaForGameMode: time expired, skip popCaptchaDialog, captchaId=");
                    sbLIZ2.append(j4);
                    sbLIZ2.append(", roomId=");
                    sbLIZ2.append(broadcastMessagePresenter2.LLILZ.getId());
                    C20441214yg.LJIIL("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ2));
                }
            });
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("requestCaptchaForGameMode got empty captchaCheckResponse, captchaId=");
        sbLIZ2.append(j);
        sbLIZ2.append(", roomId=");
        sbLIZ2.append(broadcastMessagePresenter.LLILZ.getId());
        C20441214yg.LJIIL("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public AfS4S0100200_12(BroadcastMessagePresenter broadcastMessagePresenter, long j, long j2, int i) {
        this.$t = i;
        this.l0 = broadcastMessagePresenter;
        this.j1 = j;
        this.j2 = j2;
    }
}
