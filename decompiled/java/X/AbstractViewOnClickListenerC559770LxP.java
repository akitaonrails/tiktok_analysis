package X;

import Y.ARunnableS108S0100000_8;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEPlayerState;
import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;

/* JADX INFO: renamed from: X.0LxP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractViewOnClickListenerC559770LxP implements View.OnClickListener {
    public final long LL = 500;
    public boolean LLILLJJLI = true;
    public final ARunnableS108S0100000_8 LLILLL = new ARunnableS108S0100000_8(this, 108);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NLEPlayerState nLEPlayerStateState;
        if (this.LLILLJJLI) {
            this.LLILLJJLI = false;
            HandlerHook.viewPostDelay(view, this.LLILLL, this.LL);
            NewCutPlayerActivity newCutPlayerActivity = ((C559800LxS) this).LLILZ;
            if (newCutPlayerActivity.LLJ == 0) {
                INLEPlayer iNLEPlayer = newCutPlayerActivity.LLILZLL;
                if (iNLEPlayer != null) {
                    nLEPlayerStateState = iNLEPlayer.state();
                } else {
                    nLEPlayerStateState = null;
                }
                if (nLEPlayerStateState != NLEPlayerState.ANY) {
                    C23250099c.LIZLLL(newCutPlayerActivity, C2107808No.LIZ, null, new C2181308gd(newCutPlayerActivity, null), 2);
                }
            }
        }
    }
}
