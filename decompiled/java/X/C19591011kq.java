package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single.SingleHashTagStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS608S0100000_29;
import mf.a;

/* JADX INFO: renamed from: X.11kq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19591011kq extends AbstractC19588311kP<SingleHashTagStickerModel> {
    public C1664680tQA<SingleHashTagStickerModel> LLILZIL;
    public LifecycleOwner LLILZLL;
    public C0I7D LLIZ;
    public TuxTextView LLIZLLLIL;

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LJIIZILJ() {
        View.OnClickListener aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 311);
        if (C1848410yCV.LIZ) {
            aCListenerS163S0100000_29 = new f(aCListenerS163S0100000_29);
        }
        a aVar = new a(aCListenerS163S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final C0I7D getContentEditText() {
        C0I7D c0i7d = this.LLIZ;
        if (c0i7d != null) {
            return c0i7d;
        }
        return null;
    }

    public final TuxTextView getContentTextView() {
        TuxTextView tuxTextView = this.LLIZLLLIL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final void LIZLLL() {
        C786410Ut5.Sd(R.layout.cd2, C786410Ut5.ne(getContext()), this);
        setContentEditText((C0I7D) findViewById(R.id.he9));
        setContentTextView((TuxTextView) findViewById(R.id.he_));
    }

    public final void setContentEditText(C0I7D c0i7d) {
        this.LLIZ = c0i7d;
    }

    public final void setContentTextView(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA) {
        this.LLILZIL = c1664680tQA;
        this.LLILZLL = lifecycleOwner;
        LIZLLL();
        getContentEditText().addTextChangedListener(new C19773412Ya(this, 25));
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA2 = this.LLILZIL;
        LifecycleOwner lifecycleOwner2 = null;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        LiveState<V> liveStateLIZ = c1664680tQA2.LIZ(new C2217381BqS() { // from class: X.11km
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((SingleHashTagStickerModel) obj).getVisible());
            }
        });
        LifecycleOwner lifecycleOwner3 = this.LLILZLL;
        if (lifecycleOwner3 == null) {
            lifecycleOwner3 = null;
        }
        liveStateLIZ.LJIIIZ(lifecycleOwner3, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 835));
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA3 = this.LLILZIL;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        LiveState<V> liveStateLIZ2 = c1664680tQA3.LIZ(new C2217381BqS() { // from class: X.11kp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((SingleHashTagStickerModel) obj).getEditable());
            }
        });
        LifecycleOwner lifecycleOwner4 = this.LLILZLL;
        if (lifecycleOwner4 == null) {
            lifecycleOwner4 = null;
        }
        liveStateLIZ2.LJIIIZ(lifecycleOwner4, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 836));
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA4 = this.LLILZIL;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        LiveState<V> liveStateLIZ3 = c1664680tQA4.LIZ(new C2217381BqS() { // from class: X.11ko
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SingleHashTagStickerModel) obj).getContentText();
            }
        });
        LifecycleOwner lifecycleOwner5 = this.LLILZLL;
        if (lifecycleOwner5 == null) {
            lifecycleOwner5 = null;
        }
        liveStateLIZ3.LJIIIZ(lifecycleOwner5, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 837));
        C1664680tQA<SingleHashTagStickerModel> c1664680tQA5 = this.LLILZIL;
        if (c1664680tQA5 == null) {
            c1664680tQA5 = null;
        }
        LiveState<V> liveStateLIZ4 = c1664680tQA5.LIZ(new C2217381BqS() { // from class: X.11kn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((SingleHashTagStickerModel) obj).getClickable());
            }
        });
        LifecycleOwner lifecycleOwner6 = this.LLILZLL;
        if (lifecycleOwner6 != null) {
            lifecycleOwner2 = lifecycleOwner6;
        }
        liveStateLIZ4.LJIIIZ(lifecycleOwner2, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 838));
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        String hashtagName;
        this.LLILZ = interactStickerStruct;
        LIZLLL();
        C786410Ut5.LLLLLZL(getContentEditText(), 8);
        C786410Ut5.LLLLZLL(getContentTextView(), 0);
        getContentTextView().setGravity(17);
        HashtagStruct hashtagInfo = interactStickerStruct.getHashtagInfo();
        if (hashtagInfo != null && (hashtagName = hashtagInfo.getHashtagName()) != null) {
            getContentTextView().setText(hashtagName);
        }
    }

    public C19591011kq(int i, Context context, C19591211ks c19591211ks) {
        super(0, context, (AttributeSet) null, (i & 8) != 0 ? null : c19591211ks);
    }
}
