package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji.InteractiveEmojiStickerModel;
import kotlin.jvm.internal.AwS573S0100000_29;
import mf.a;

/* JADX INFO: renamed from: X.11mf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19602311mf extends AbstractC19588311kP<InteractiveEmojiStickerModel> {
    public C1664680tQA<InteractiveEmojiStickerModel> LLILZIL;
    public LifecycleOwner LLILZLL;
    public final Context LLIZ;
    public final InterfaceC19605411nA LLIZLLLIL;
    public ImageView LLJ;
    public final C01GW LLJI;
    public final boolean LLJIJIL;

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LJIIZILJ() {
        View.OnClickListener aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 107);
        if (C1848410yCV.LIZ) {
            aCListenerS163S0100000_29 = new f(aCListenerS163S0100000_29);
        }
        a aVar = new a(aCListenerS163S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final InterfaceC19602411mg getStickerClickListener() {
        return (InterfaceC19602411mg) this.LLJI.getValue();
    }

    public final ImageView getEmojiImageView() {
        return this.LLJ;
    }

    public final void LIZIZ(String str) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C433630GzR(str, this, null), 3);
    }

    public final void setEmojiImageView(ImageView imageView) {
        this.LLJ = imageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19602311mf(Context context, InterfaceC19605411nA interfaceC19605411nA) {
        super((int) (0 == true ? 1 : 0), 14, context, (AttributeSet) (0 == true ? 1 : 0));
        this.LLJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 303));
        C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        this.LLJIJIL = (interactStickerContainerCommonParam != null ? interactStickerContainerCommonParam.LIZ : null) == EnumC19589411ka.INTERACT;
        this.LLIZ = context;
        this.LLIZLLLIL = interfaceC19605411nA;
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        InterfaceC19602411mg stickerClickListener;
        this.LLILZ = interactStickerStruct;
        LIZIZ(interactStickerStruct.getInteractiveEmojiStickerStruct().getEmojiContent());
        if (this.LLJIJIL && (stickerClickListener = getStickerClickListener()) != null) {
            stickerClickListener.sg(this, interactStickerStruct);
        }
    }

    public C19602311mf(int i, Context context, C19591211ks c19591211ks) {
        super(0, context, (AttributeSet) null, (i & 8) != 0 ? null : c19591211ks);
        this.LLJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 303));
        C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        this.LLJIJIL = (interactStickerContainerCommonParam != null ? interactStickerContainerCommonParam.LIZ : null) == EnumC19589411ka.INTERACT;
        this.LLIZ = context;
    }
}
