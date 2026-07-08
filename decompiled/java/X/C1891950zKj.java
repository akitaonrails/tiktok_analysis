package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.emojisticker.api.IEmojiStickerAbilityProvider;
import com.ss.android.ugc.aweme.emojisticker.interactiveemoji.service.EmojiStickerAbilityProviderImpl;
import com.ss.android.ugc.aweme.social.sticker.model.SocialEmoji;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891950zKj implements IEmojiStickerAbilityProvider {
    public static final C1891950zKj LIZIZ = new C1891950zKj();
    public final /* synthetic */ IEmojiStickerAbilityProvider LIZ;

    @Override // com.ss.android.ugc.aweme.emojisticker.api.IEmojiStickerAbilityProvider
    public final InterfaceC19670311xd LIZ(ViewGroup viewGroup, Context context, Function1<? super SocialEmoji, Unit> function1) {
        return this.LIZ.LIZ(viewGroup, context, function1);
    }

    @Override // com.ss.android.ugc.aweme.emojisticker.api.IEmojiStickerAbilityProvider
    public final InterfaceC730350Skr LIZIZ(C1895007bY c1895007bY) {
        return this.LIZ.LIZIZ(c1895007bY);
    }

    @Override // com.ss.android.ugc.aweme.emojisticker.api.IEmojiStickerAbilityProvider
    public final InterfaceC730350Skr LIZJ(C1895007bY c1895007bY) {
        return this.LIZ.LIZJ(c1895007bY);
    }

    @Override // com.ss.android.ugc.aweme.emojisticker.api.IEmojiStickerAbilityProvider
    public final InterfaceC19599811mG LIZLLL(Context context, C1895007bY c1895007bY, DialogInterface.OnDismissListener onDismissListener) {
        return this.LIZ.LIZLLL(context, c1895007bY, onDismissListener);
    }

    @Override // com.ss.android.ugc.aweme.emojisticker.api.IEmojiStickerAbilityProvider
    public final InterfaceC19599911mH LJ(Context context, InteractStickerStruct interactStickerStruct, C1895007bY c1895007bY) {
        return this.LIZ.LJ(context, interactStickerStruct, c1895007bY);
    }

    public C1891950zKj() {
        IEmojiStickerAbilityProvider iEmojiStickerAbilityProvider;
        Object objLIZ = C04TD.LIZ(IEmojiStickerAbilityProvider.class, false);
        if (objLIZ != null) {
            iEmojiStickerAbilityProvider = (IEmojiStickerAbilityProvider) objLIZ;
        } else {
            if (C04TD.f110i0 == null) {
                synchronized (IEmojiStickerAbilityProvider.class) {
                    if (C04TD.f110i0 == null) {
                        C04TD.f110i0 = new EmojiStickerAbilityProviderImpl();
                    }
                }
            }
            iEmojiStickerAbilityProvider = C04TD.f110i0;
        }
        this.LIZ = iEmojiStickerAbilityProvider;
    }
}
