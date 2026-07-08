package X;

import com.bytedance.android.live.effect.playcondition.StickerFinishSettingCondition;
import com.bytedance.android.livesdk.model.RoomEffect;

/* JADX INFO: renamed from: X.14jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20348614jk implements C0UUD {
    public C20361214lm LIZ;
    public final /* synthetic */ StickerFinishSettingCondition LIZIZ;

    @Override // X.C0UUD
    public final void LIZIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
    }

    public C20348614jk(StickerFinishSettingCondition stickerFinishSettingCondition) {
        this.LIZIZ = stickerFinishSettingCondition;
    }

    @Override // X.C0UUD
    public final void LIZ(EnumC773040UUc enumC773040UUc, EnumC771230UNd enumC771230UNd) {
        String str;
        if (enumC773040UUc != EnumC773040UUc.STICKER) {
            return;
        }
        C20361214lm c20361214lm = this.LIZ;
        if (c20361214lm != null) {
            str = c20361214lm.LJI;
        } else {
            str = null;
        }
        this.LIZIZ.LJIIJJI((RoomEffect) C937280aUw.LIZJ(RoomEffect.class, str, new RoomEffect("", null)), false);
    }
}
