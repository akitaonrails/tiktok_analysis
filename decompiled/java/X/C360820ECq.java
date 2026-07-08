package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.ui.AudioBeatsPanelFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ECq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C360820ECq extends C2217421BqW implements Function0<Unit> {
    public C360820ECq(AudioBeatsPanelFragment audioBeatsPanelFragment) {
        super(0, audioBeatsPanelFragment, AudioBeatsPanelFragment.class, "showLoading", "showLoading()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AudioBeatsPanelFragment audioBeatsPanelFragment = (AudioBeatsPanelFragment) this.receiver;
        audioBeatsPanelFragment.LLLLIIL = true;
        audioBeatsPanelFragment.cS().setEnabled(false);
        audioBeatsPanelFragment.sT().setLoading(true);
        audioBeatsPanelFragment.nT().setEnabled(false);
        FrameLayout frameLayoutQT = audioBeatsPanelFragment.qT();
        if (frameLayoutQT != null) {
            frameLayoutQT.setEnabled(false);
        }
        return Unit.LIZ;
    }
}
