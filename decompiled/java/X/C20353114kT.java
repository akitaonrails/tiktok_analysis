package X;

import com.bytedance.android.live.effect.playentity.StickerEffectEntity;

/* JADX INFO: renamed from: X.14kT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20353114kT implements C0UUD {
    public C20361214lm LIZ;
    public final /* synthetic */ StickerEffectEntity LIZIZ;

    @Override // X.C0UUD
    public final void LIZIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
    }

    public C20353114kT(StickerEffectEntity stickerEffectEntity) {
        this.LIZIZ = stickerEffectEntity;
    }

    @Override // X.C0UUD
    public final void LIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
        C20361214lm c20361214lm;
        if (enumC773040UUc == EnumC773040UUc.EFFECTS && this.LIZIZ.LJJJ() && (c20361214lm = this.LIZ) != null) {
            this.LIZIZ.LJJLIIIJL(C20352914kR.LIZ(c20361214lm));
        }
    }
}
