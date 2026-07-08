package X;

import com.bytedance.android.live.effect.playentity.MusicEntity;
import com.bytedance.android.live.effect.playentity.MusicEntityConfig;

/* JADX INFO: renamed from: X.14kL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20352314kL implements C0UUD {
    public C20361214lm LIZ;
    public final /* synthetic */ MusicEntity LIZIZ;

    @Override // X.C0UUD
    public final void LIZIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
    }

    public C20352314kL(MusicEntity musicEntity) {
        this.LIZIZ = musicEntity;
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
        this.LIZIZ.LJJLIIIJILLIZJL((MusicEntityConfig) C937280aUw.LIZJ(MusicEntityConfig.class, str, new MusicEntityConfig(null)));
    }
}
