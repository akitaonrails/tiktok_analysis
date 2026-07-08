package X;

import Y.ACListenerS131S0200000_29;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import avg.f;
import com.ss.android.ugc.aweme.social.sticker.model.SocialEmoji;
import com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji.InteractiveEmojiStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS573S0100000_29;
import mf.a;

/* JADX INFO: renamed from: X.11n5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19604911n5 extends FrameLayout {
    public InteractiveEmojiStickerModel LL;
    public C0FSM LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    public C19604911n5() {
        throw null;
    }

    private final ImageView getEmojiImageView() {
        return (ImageView) this.LLILLL.getValue();
    }

    public final InterfaceC19605411nA getInteractiveEmojiService() {
        return (InterfaceC19605411nA) this.LLILZ.getValue();
    }

    private final void setEmoji(String str) {
        Bitmap bitmapLIZ = C0GZ1.LIZ(str);
        if (bitmapLIZ != null) {
            getEmojiImageView().setImageBitmap(bitmapLIZ);
        }
    }

    public final void LIZ(SocialEmoji socialEmoji) {
        InteractiveEmojiStickerModel interactiveEmojiStickerModel = this.LL;
        interactiveEmojiStickerModel.setEmojiContent(socialEmoji.emoji);
        interactiveEmojiStickerModel.setAndroidVer(socialEmoji.and);
        interactiveEmojiStickerModel.setIosVer(socialEmoji.ios);
        setEmoji(socialEmoji.emoji);
    }

    public final void LIZIZ(InteractiveEmojiStickerModel interactiveEmojiStickerModel, C0FSM c0fsm) {
        this.LL = interactiveEmojiStickerModel;
        this.LLILLJJLI = c0fsm;
        setEmoji(interactiveEmojiStickerModel.getEmojiContent());
        c0fsm.LIZLLL(true);
    }

    public C19604911n5(Context context, InteractiveEmojiStickerModel interactiveEmojiStickerModel, C390420FSm c390420FSm, C0FSM c0fsm) {
        super(context, null, 0);
        this.LL = interactiveEmojiStickerModel;
        this.LLILLJJLI = c0fsm;
        this.LLILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 302));
        this.LLILZ = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 120));
        FrameLayout.inflate(context, R.layout.ctw, this);
        View.OnClickListener aCListenerS131S0200000_29 = new ACListenerS131S0200000_29(this, null, 12);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS131S0200000_29) : aCListenerS131S0200000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        InterfaceC19605411nA interactiveEmojiService = getInteractiveEmojiService();
        if (interactiveEmojiService != null) {
            interactiveEmojiService.LIZIZ(this, context, new C19604411n0(this));
        }
        setEmoji("😍");
        getEmojiImageView().setOnTouchListener(new View.OnTouchListener() { // from class: X.11nB
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        C0FSM c0fsm2 = this.LLILLJJLI;
        if (c0fsm2 != null) {
            c0fsm2.LIZLLL(false);
        }
    }
}
