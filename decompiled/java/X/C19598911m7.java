package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.SocialAvatarStickerModel;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11m7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19598911m7 extends AbstractC19589811ke<SocialAvatarStickerModel> implements InterfaceC19599111m9 {
    public Aweme LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1134));

    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        C19595711lb c19595711lb = new C19595711lb(6, LJ().LIZLLL, LJ());
        c19595711lb.addOnAttachStateChangeListener(new C12YF(this, 6));
        return c19595711lb;
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        SocialAvatarStickerStruct socialAvatarStickerStruct = interactStickerStruct.getSocialAvatarStickerStruct();
        if (socialAvatarStickerStruct != null) {
            return C19599011m8.LIZ(socialAvatarStickerStruct);
        }
        return new SocialAvatarStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.SOCIAL_AVATAR, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), null, null, null, null, null);
    }

    @Override // X.InterfaceC19599111m9
    public final void LJIILIIL(Aweme aweme) {
        this.LJFF = aweme;
    }

    @Override // X.AbstractC19589811ke
    public final void LIZIZ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        C19595711lb c19595711lb;
        super.LIZIZ(interactStickerStruct, stickerModel);
        InterfaceC19592111l1<?> interfaceC19592111l1LJIIIIZZ = LJIIIIZZ();
        if ((interfaceC19592111l1LJIIIIZZ instanceof C19595711lb) && (c19595711lb = (C19595711lb) interfaceC19592111l1LJIIIIZZ) != null && !((Boolean) this.LJI.getValue()).booleanValue() && C729510SjV.LJJIJIL(this.LJFF)) {
            C0HYP.LIZ.getClass();
            if (!C0HYP.LJ().getBoolean("has_consumed_sticker_tap_intro_text", false)) {
                C01TT.LIZJ(new AwS273S0300000_29(c19595711lb, this, interactStickerStruct, 32));
            }
        }
    }
}
