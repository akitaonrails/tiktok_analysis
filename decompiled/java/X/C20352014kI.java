package X;

import com.bytedance.android.live.effect.playcondition.MusicFinishSettingCondition;
import com.bytedance.android.live.effect.playentity.MusicEntityConfig;

/* JADX INFO: renamed from: X.14kI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20352014kI implements C0UUD {
    public C20361214lm LIZ;
    public final /* synthetic */ MusicFinishSettingCondition LIZIZ;

    @Override // X.C0UUD
    public final void LIZIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
    }

    public C20352014kI(MusicFinishSettingCondition musicFinishSettingCondition) {
        this.LIZIZ = musicFinishSettingCondition;
    }

    @Override // X.C0UUD
    public final void LIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
        String str;
        if (enumC773040UUc != EnumC773040UUc.MUSIC) {
            return;
        }
        C20361214lm c20361214lm = this.LIZ;
        if (c20361214lm != null) {
            str = c20361214lm.LJI;
        } else {
            str = null;
        }
        this.LIZIZ.LJIIJJI((MusicEntityConfig) C937280aUw.LIZJ(MusicEntityConfig.class, str, new MusicEntityConfig(null)), false);
    }
}
