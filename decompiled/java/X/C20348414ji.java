package X;

import com.bytedance.android.live.effect.playentity.PropEffectEntity;
import com.bytedance.android.livesdk.model.RoomEffect;

/* JADX INFO: renamed from: X.14ji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20348414ji implements C0UUD {
    public C20361214lm LIZ;
    public final /* synthetic */ PropEffectEntity LIZIZ;

    @Override // X.C0UUD
    public final void LIZIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
    }

    public C20348414ji(PropEffectEntity propEffectEntity) {
        this.LIZIZ = propEffectEntity;
    }

    @Override // X.C0UUD
    public final void LIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
        String str;
        if (enumC773040UUc == EnumC773040UUc.STICKER && this.LIZIZ.LJJJ()) {
            C20361214lm c20361214lm = this.LIZ;
            if (c20361214lm != null) {
                str = c20361214lm.LJI;
            } else {
                str = null;
            }
            this.LIZIZ.LJJLIIIJ((RoomEffect) C937280aUw.LIZJ(RoomEffect.class, str, new RoomEffect("", null)));
        }
    }
}
