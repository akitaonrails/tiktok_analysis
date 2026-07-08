package X;

import Y.ARunnableS0S1100200_12;
import Y.ARunnableS17S0100100_12;
import Y.AfS4S0100100_12;
import com.bytedance.android.livesdk.api.LiveCaptchaCheckApi;
import com.bytedance.android.livesdk.broadcast.interaction.function.BroadcastMessagePresenter;
import com.bytedance.android.livesdk.dataChannel.CaptchaLivePauseTimeChannel;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Uln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781890Uln implements InterfaceC207238167o {
    public final C773300UVc LIZ = C0UVZ.LIZ();
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ BroadcastMessagePresenter LJ;

    @Override // X.InterfaceC207238167o
    public final void LIZIZ() {
        this.LJ.LLJI = Long.valueOf(System.currentTimeMillis());
        if (this.LJ.LLJIJIL > 0) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_captcha_popup_test_show");
            c474500IjALIZ.LJIJJLI(this.LJ.LLILZIL);
            c474500IjALIZ.LJJII(Long.valueOf(this.LIZIZ), "captcha_record_id");
            c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() / 1000) - this.LJ.LLILZ.getCreateTime()), "duration_after_live_take");
            c474500IjALIZ.LIZ();
            return;
        }
        long j = this.LIZLLL;
        if (j != 0) {
            C486790J7d.LIZLLL(new ARunnableS17S0100100_12(this, j, 0), null, 1000L);
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_captcha_popup_test_show");
        c474500IjALIZ2.LJIJJLI(this.LJ.LLILZIL);
        c474500IjALIZ2.LJJII(Long.valueOf(this.LIZIZ), "captcha_record_id");
        c474500IjALIZ2.LJJII(Long.valueOf((System.currentTimeMillis() / 1000) - this.LJ.LLILZ.getCreateTime()), "duration_after_live_take");
        c474500IjALIZ2.LIZ();
        C11NZ.LJLJJLL(this.LIZLLL, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJLL(new AfS4S0100100_12(this.LIZIZ, this, 5), C0J1R.LIZ);
    }

    @Override // X.InterfaceC207238167o
    public final void onSuccess() {
        this.LJ.LLILZIL.zW(CaptchaLivePauseTimeChannel.class, 0L);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popCaptchaDialog onSuccess, captchaId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LJ.LLILZ.getId());
        C20441214yg.LJIIIZ("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ));
        C480460Ism.LIZ().getClass();
        ((LiveCaptchaCheckApi) C480460Ism.LIZLLL(LiveCaptchaCheckApi.class)).getCaptchaCheckResponse(this.LIZIZ, this.LJ.LLILZ.getId(), false).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(this.LJ.LL)).LJJLJLI(new AfS4S0100100_12(this.LIZIZ, this, 4));
        if (this.LJ.LLIZLLLIL) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_captcha_popup_result");
        c474500IjALIZ.LJIJJLI(this.LJ.LLILZIL);
        c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() / 1000) - this.LJ.LLILZ.getCreateTime()), "duration_after_live_take");
        c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() - this.LJ.LLJI.longValue()) / 1000), "duration_after_popup");
        c474500IjALIZ.LJJII("success", "result");
        c474500IjALIZ.LIZ();
        C773300UVc c773300UVc = this.LIZ;
        if (c773300UVc != null) {
            c773300UVc.LIZLLL(false, false);
        }
    }

    @Override // X.InterfaceC207238167o
    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popCaptchaDialog onClose, captchaId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LJ.LLILZ.getId());
        sbLIZ.append(", closeByServer=");
        sbLIZ.append(this.LJ.LLJ);
        C20441214yg.LJIIIZ("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LJ.LLJ) {
            C473410IhP.LIZJ(new ARunnableS0S1100200_12(this, this.LIZIZ, this.LIZJ, this.LIZLLL, 0), 100L);
        }
        if (this.LJ.LLIZ) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_captcha_popup_result");
        c474500IjALIZ.LJIJJLI(this.LJ.LLILZIL);
        c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() / 1000) - this.LJ.LLILZ.getCreateTime()), "duration_after_live_take");
        c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() - this.LJ.LLJI.longValue()) / 1000), "duration_after_popup");
        c474500IjALIZ.LJJII("fail", "result");
        c474500IjALIZ.LJJII(2, "failure_reason");
        c474500IjALIZ.LIZ();
        C773300UVc c773300UVc = this.LIZ;
        if (c773300UVc != null) {
            c773300UVc.LIZLLL(true, false);
        }
    }

    @Override // X.InterfaceC207238167o
    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popCaptchaDialog onShowFailed, captchaId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LJ.LLILZ.getId());
        C20441214yg.LJIIL("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ));
        this.LJ.LLJ = true;
    }

    public C781890Uln(BroadcastMessagePresenter broadcastMessagePresenter, long j, String str, long j2) {
        this.LJ = broadcastMessagePresenter;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = j2;
    }
}
