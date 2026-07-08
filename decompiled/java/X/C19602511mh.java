package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.emojislider.EmojiSliderStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS573S0100000_29;
import mf.a;

/* JADX INFO: renamed from: X.11mh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19602511mh extends AbstractC19588311kP<EmojiSliderStickerModel> implements InterfaceC19601611mY {
    public C1664680tQA<EmojiSliderStickerModel> LLILZIL;
    public LifecycleOwner LLILZLL;
    public final Context LLIZ;
    public final InterfaceC19604511n1 LLIZLLLIL;
    public FrameLayout LLJ;
    public C0I7D LLJI;
    public SeekBar LLJIJIL;
    public ImageView LLJILJIL;
    public ImageView LLJILJILJ;
    public final C01GW LLJILLL;
    public final boolean LLJJ;

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LJIIZILJ() {
        View.OnClickListener aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 106);
        if (C1848410yCV.LIZ) {
            aCListenerS163S0100000_29 = new f(aCListenerS163S0100000_29);
        }
        a aVar = new a(aCListenerS163S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final InterfaceC19602011mc getStickerGestureListener() {
        return (InterfaceC19602011mc) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC19601611mY
    public SeekBar getSeekBar() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC19601611mY
    public ImageView getSeekBarMarker() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC19601611mY
    public ImageView getSeekBarPopUpEmoji() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public View getView() {
        super.getView();
        return this;
    }

    public final void setEmoji(String str) {
        Bitmap bitmapLIZIZ = C0GZ1.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), str);
        if (bitmapLIZIZ == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmapLIZIZ);
        SeekBar seekBar = this.LLJIJIL;
        if (seekBar != null) {
            seekBar.setThumb(bitmapDrawable);
        }
    }

    public final void setQuestionTextContent(String str) {
        if (str != null && str.length() != 0) {
            C0I7D c0i7d = this.LLJI;
            if (c0i7d != null) {
                C786410Ut5.LLLLLZL(c0i7d, 0);
            }
            C0I7D c0i7d2 = this.LLJI;
            if (c0i7d2 != null) {
                c0i7d2.setText(str);
                return;
            }
            return;
        }
        C0I7D c0i7d3 = this.LLJI;
        if (c0i7d3 == null) {
            return;
        }
        C786410Ut5.LLLLLZL(c0i7d3, 8);
    }

    public C19602511mh(Context context, InterfaceC19604511n1 interfaceC19604511n1) {
        super(0, 14, context, (AttributeSet) null);
        this.LLJILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 298));
        C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        this.LLJJ = (interactStickerContainerCommonParam != null ? interactStickerContainerCommonParam.LIZ : null) == EnumC19589411ka.INTERACT;
        this.LLIZ = context;
        this.LLIZLLLIL = interfaceC19604511n1;
    }

    @Override // X.InterfaceC19601611mY
    public final Bitmap LIZ(int i, String str) {
        return C0GZ1.LIZIZ(i, str);
    }

    public final void LIZIZ(String str, String str2) {
        C0I7D c0i7d;
        SeekBar seekBar;
        ImageView imageView;
        InterfaceC19602011mc stickerGestureListener;
        FrameLayout frameLayout = (FrameLayout) C786410Ut5.Td(C786410Ut5.ne(this.LLIZ), R.layout.c44, this, false);
        this.LLJ = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(174)), -2, 17));
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout2 = this.LLJ;
        if (frameLayout2 != null) {
            frameLayout2.setClickable(false);
        }
        FrameLayout frameLayout3 = this.LLJ;
        ImageView imageView2 = null;
        if (frameLayout3 != null) {
            c0i7d = (C0I7D) frameLayout3.findViewById(R.id.hd0);
        } else {
            c0i7d = null;
        }
        this.LLJI = c0i7d;
        if (c0i7d != null) {
            c0i7d.setGravity(17);
            c0i7d.setEnabled(false);
            c0i7d.setClickable(false);
            c0i7d.setFocusable(false);
            c0i7d.setFocusableInTouchMode(false);
            c0i7d.setLongClickable(false);
        }
        setQuestionTextContent(str2);
        FrameLayout frameLayout4 = this.LLJ;
        if (frameLayout4 != null) {
            seekBar = (SeekBar) frameLayout4.findViewById(R.id.u0e);
        } else {
            seekBar = null;
        }
        this.LLJIJIL = seekBar;
        FrameLayout frameLayout5 = this.LLJ;
        if (frameLayout5 != null) {
            imageView = (ImageView) frameLayout5.findViewById(R.id.lfq);
        } else {
            imageView = null;
        }
        this.LLJILJIL = imageView;
        FrameLayout frameLayout6 = this.LLJ;
        if (frameLayout6 != null) {
            imageView2 = (ImageView) frameLayout6.findViewById(R.id.lfp);
        }
        this.LLJILJILJ = imageView2;
        SeekBar seekBar2 = this.LLJIJIL;
        if (seekBar2 != null) {
            seekBar2.setEnabled(false);
            seekBar2.setMax(100);
            seekBar2.setProgress(0);
        }
        if (this.LLJJ && (stickerGestureListener = getStickerGestureListener()) != null) {
            stickerGestureListener.Qh(getStruct(), this);
        }
        setEmoji(str);
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        this.LLILZ = interactStickerStruct;
        if (interactStickerStruct.getEmojiSliderStickerStruct() == null) {
            return;
        }
        LIZIZ(interactStickerStruct.getEmojiSliderStickerStruct().getEmojiContent(), interactStickerStruct.getEmojiSliderStickerStruct().getQuestionText());
    }

    public C19602511mh(int i, Context context, C19591211ks c19591211ks) {
        super(0, context, (AttributeSet) null, (i & 8) != 0 ? null : c19591211ks);
        this.LLJILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 298));
        C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        this.LLJJ = (interactStickerContainerCommonParam != null ? interactStickerContainerCommonParam.LIZ : null) == EnumC19589411ka.INTERACT;
        this.LLIZ = context;
    }
}
