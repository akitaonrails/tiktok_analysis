package X;

import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneReadTextEffectBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0EIz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC362470EIz extends C05YF {
    void BQ(boolean z);

    C385670FAf<TTSSpeakerInfo> Kt0();

    C385670FAf<Boolean> XS();

    void aI2(boolean z, EnumC361800EGk enumC361800EGk);

    void cU(C19EG c19eg, String str, NLETrackSlot nLETrackSlot, boolean z, Function0<Unit> function0, Function0<Unit> function02);

    C385670FAf<VoiceCloneReadTextEffectBean> gH2();

    boolean onBackPressed();

    LiveEvent<EnumC361800EGk> pA2();

    void uV(boolean z);
}
