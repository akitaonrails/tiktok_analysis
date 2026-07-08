package X;

import Y.ARunnableS125S0100000_25;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0tAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1655180tAq implements InterfaceC194555119t {
    public TextView LL;
    public C1322110kVd LLILLJJLI;
    public View LLILLL;
    public FrameLayout LLILZ;
    public final Effect LLILZIL;
    public View LLILZLL;
    public final ShortVideoContext LLIZ;
    public boolean LLIZLLLIL;
    public final ARunnableS125S0100000_25 LLJ = new ARunnableS125S0100000_25(this, 52);

    @Override // X.InterfaceC194555119t
    public final boolean isShowing() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC194555119t
    public final void LIZ(FrameLayout frameLayout) {
        C0VSJ c0vsj;
        boolean z;
        this.LLILZ = frameLayout;
        Effect effect = this.LLILZIL;
        if (effect != null && !TextUtils.isEmpty(effect.getHint()) && frameLayout != null) {
            int i = 0;
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.d98, frameLayout, false);
            this.LLILLL = viewTd;
            this.LLILZ.addView(viewTd);
            this.LLILZLL = this.LLILLL.findViewById(R.id.i2v);
            this.LL = (TextView) this.LLILLL.findViewById(R.id.w6v);
            String hint = this.LLILZIL.getHint();
            if (!this.LLIZ.LJJLL() && !this.LLIZ.LJJJJLL()) {
                if (this.LLIZ.cameraComponentModel.mWorkspace.getMusicPath() != null && !C2486109oh.LIZIZ(this.LLIZ.cameraComponentModel.mWorkspace.getMusicPath())) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131826979);
                    C1390380mHk.LIZLLL(frameLayout, 3017, creativeToastBuilder);
                    return;
                }
                if (this.LLIZ.cameraComponentModel.mWorkspace.getMusicPath() != null) {
                    c0vsj = new C0VSJ(this.LLIZ.cameraComponentModel.mWorkspace.getMusicPath());
                } else {
                    c0vsj = null;
                }
                String rhythmMusicFilePath = C0CHQ.LIZ().LJJJJL().getRhythmMusicFilePath(this.LLIZ.cameraComponentModel.mMusicPath);
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LLIZ.creativeModel.musicBuzModel);
                if (aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.getStrongBeatUrl() != null && !TextUtils.isEmpty(rhythmMusicFilePath) && !new C0VSJ(rhythmMusicFilePath).exists()) {
                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                    creativeToastBuilder2.messageRes(2131826978);
                    C1390380mHk.LIZLLL(frameLayout, 3016, creativeToastBuilder2);
                    return;
                }
                if (c0vsj != null) {
                    return;
                }
                this.LL.setText(hint);
                this.LLILLJJLI = (C1322110kVd) this.LLILLL.findViewById(R.id.w6w);
                if (this.LLILZIL.getHintIcon() != null && !C580130Mp9.LIZ(this.LLILZIL.getHintIcon().getUrlList())) {
                    z = true;
                } else {
                    z = false;
                }
                C1322110kVd c1322110kVd = this.LLILLJJLI;
                if (!z) {
                    i = 8;
                }
                C1741940vQm.LIZLLL(i, c1322110kVd);
                if (z) {
                    C1324750kZt.LJI(this.LLILLJJLI, C1441230nbl.LIZ(this.LLILZIL.getHintIcon()), -1, -1);
                }
                this.LLILZLL.startAnimation(C212353188h.LIZ(0.0f, 1.0f, 300L));
                HandlerHook.viewPostDelay(this.LLILZLL, this.LLJ, Mp4ScreenVideoLoadTimeout.CONTROL);
                this.LLIZLLLIL = true;
            }
        }
    }

    @Override // X.InterfaceC194555119t
    public final void LJJJJLL(boolean z) {
        Effect effect = this.LLILZIL;
        if (effect != null && !TextUtils.isEmpty(effect.getHint()) && this.LLILZ != null) {
            HandlerHook.viewRemoveCallbacks(this.LL, this.LLJ);
            FrameLayout frameLayout = this.LLILZ;
            if (frameLayout != null) {
                C786410Ut5.LJJJZ(this.LLILLL, frameLayout);
            }
            this.LLIZLLLIL = false;
        }
    }

    public C1655180tAq(ShortVideoContext shortVideoContext, Effect effect) {
        this.LLILZIL = effect;
        this.LLIZ = shortVideoContext;
    }
}
