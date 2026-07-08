package X;

import Y.ALAdapterS2S0100000_5;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.ui.AudioRecordFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0F2V, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F2V implements C0EFX {
    public final Fragment LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final Function0<Unit> LIZLLL;

    @Override // X.C0EFX
    public final void LIZ() {
        ViewPropertyAnimator viewPropertyAnimatorAlpha = this.LIZJ.animate().alpha(0.0f);
        viewPropertyAnimatorAlpha.setDuration(200L);
        viewPropertyAnimatorAlpha.setListener(new ALAdapterS2S0100000_5(this, 20)).start();
    }

    @Override // X.C0EFX
    public final void LIZIZ() {
        ViewPropertyAnimator viewPropertyAnimatorAlpha = this.LIZIZ.animate().alpha(0.0f);
        viewPropertyAnimatorAlpha.setDuration(200L);
        viewPropertyAnimatorAlpha.setListener(new ALAdapterS2S0100000_5(this, 18));
        viewPropertyAnimatorAlpha.start();
    }

    @Override // X.C0EFX
    public final void LIZJ() {
        C786410Ut5.T4(this.LIZIZ, 0.0f);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = this.LIZIZ.animate().alpha(1.0f);
        viewPropertyAnimatorAlpha.setDuration(200L);
        viewPropertyAnimatorAlpha.setListener(new ALAdapterS2S0100000_5(this, 19));
        viewPropertyAnimatorAlpha.start();
    }

    @Override // X.C0EFX
    public final void LJJIJIIJIL() {
        ViewPropertyAnimator viewPropertyAnimatorAlpha = this.LIZJ.animate().alpha(1.0f);
        viewPropertyAnimatorAlpha.setDuration(200L);
        viewPropertyAnimatorAlpha.setListener(new ALAdapterS2S0100000_5(this, 21));
        viewPropertyAnimatorAlpha.start();
    }

    public C0F2V(AudioRecordFragment audioRecordFragment, ConstraintLayout constraintLayout, TuxTextView tuxTextView, AwS549S0100000_5 awS549S0100000_5) {
        this.LIZ = audioRecordFragment;
        this.LIZIZ = constraintLayout;
        this.LIZJ = tuxTextView;
        this.LIZLLL = awS549S0100000_5;
    }
}
