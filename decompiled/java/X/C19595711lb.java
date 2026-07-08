package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.SocialAvatarStickerModel;
import irm.AkS95S0100000_29;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.11lb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19595711lb extends AbstractC19588311kP<SocialAvatarStickerModel> {
    public final Context LLILZIL;
    public LifecycleOwner LLILZLL;
    public final boolean LLIZ;
    public TuxTextView LLIZLLLIL;
    public boolean LLJ;
    public final C01GW LLJI;

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LJIIZILJ() {
        C786410Ut5.I7(new AkS95S0100000_29(this, 103), this);
    }

    public final InterfaceC1884650z8x getStickerClickListener() {
        return (InterfaceC1884650z8x) this.LLJI.getValue();
    }

    public final void LIZIZ(List<String> list) {
        SmartImageView smartImageView = new SmartImageView(this.LLILZIL);
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list));
        c1331670kl3LJIIJ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIJ.LIZLLL = true;
        c1331670kl3LJIIJ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJIIJ);
        addView(smartImageView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(125)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(125)), 17));
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        InterfaceC1884650z8x stickerClickListener;
        this.LLILZ = interactStickerStruct;
        SocialAvatarStickerStruct socialAvatarStickerStruct = interactStickerStruct.getSocialAvatarStickerStruct();
        if (socialAvatarStickerStruct != null) {
            List<String> midResolutionUrl = socialAvatarStickerStruct.getMidResolutionUrl();
            if (midResolutionUrl != null) {
                LIZIZ(midResolutionUrl);
            }
            if (this.LLIZ && (stickerClickListener = getStickerClickListener()) != null) {
                stickerClickListener.Xm(this, interactStickerStruct);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19595711lb(int i, Context context, C19591211ks c19591211ks) {
        c19591211ks = (i & 8) != 0 ? null : c19591211ks;
        super(0, context, (AttributeSet) null, c19591211ks);
        this.LLILZIL = context;
        this.LLIZ = (c19591211ks != null ? c19591211ks.LIZ : null) == EnumC19589411ka.INTERACT;
        this.LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(c19591211ks, 1101));
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.R.getValue());
    }
}
