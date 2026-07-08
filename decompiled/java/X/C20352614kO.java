package X;

import com.bytedance.android.live.effect.playentity.VoiceEffectsEntity;
import com.bytedance.android.live.effect.playentity.VoiceEntityConfig;

/* JADX INFO: renamed from: X.14kO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20352614kO implements C0UUD {
    public C20361214lm LIZ;
    public final /* synthetic */ VoiceEffectsEntity LIZIZ;

    @Override // X.C0UUD
    public final void LIZIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
    }

    public C20352614kO(VoiceEffectsEntity voiceEffectsEntity) {
        this.LIZIZ = voiceEffectsEntity;
    }

    @Override // X.C0UUD
    public final void LIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
        C20361214lm c20361214lm;
        if (enumC773040UUc == EnumC773040UUc.VOICE_EFFECTS && (c20361214lm = this.LIZ) != null) {
            this.LIZIZ.LJJLIIIJILLIZJL((VoiceEntityConfig) C937280aUw.LIZJ(VoiceEntityConfig.class, c20361214lm.LJI, new VoiceEntityConfig(null)));
        }
    }
}
