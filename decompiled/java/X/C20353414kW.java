package X;

import com.bytedance.android.live.effect.playentity.BackgroundEffectEntity;
import com.bytedance.android.livesdk.model.SharedEffect;

/* JADX INFO: renamed from: X.14kW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20353414kW implements C0UUD {
    public C20361214lm LIZ;
    public final /* synthetic */ BackgroundEffectEntity LIZIZ;

    @Override // X.C0UUD
    public final void LIZIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
    }

    public C20353414kW(BackgroundEffectEntity backgroundEffectEntity) {
        this.LIZIZ = backgroundEffectEntity;
    }

    @Override // X.C0UUD
    public final void LIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
        String str;
        if (enumC773040UUc == EnumC773040UUc.BACKGROUND && this.LIZIZ.LJJJ()) {
            C20361214lm c20361214lm = this.LIZ;
            if (c20361214lm != null) {
                str = c20361214lm.LJI;
            } else {
                str = null;
            }
            this.LIZIZ.LJJLIIIJILLIZJL((SharedEffect) C937280aUw.LIZJ(SharedEffect.class, str, new SharedEffect("", "", null)));
        }
    }
}
