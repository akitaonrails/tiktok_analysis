package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS608S0100000_29;
import mf.a;

/* JADX INFO: renamed from: X.11jl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19584311jl extends AbstractC19584411jm<EmbedHashTagStickerModel> {
    public C1664680tQA<EmbedHashTagStickerModel> LLILZIL;
    public LifecycleOwner LLILZLL;
    public C0I7D LLIZ;

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LJIIZILJ() {
        View.OnClickListener aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 298);
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

    public final void setContentEditText(C0I7D c0i7d) {
        this.LLIZ = c0i7d;
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA) {
        this.LLILZIL = c1664680tQA;
        this.LLILZLL = lifecycleOwner;
        C786410Ut5.Sd(R.layout.cd2, C786410Ut5.ne(getContext()), this);
        setContentEditText((C0I7D) findViewById(R.id.he9));
        getContentEditText().addTextChangedListener(new C19773412Ya(this, 23));
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA2 = this.LLILZIL;
        LifecycleOwner lifecycleOwner2 = null;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        LiveState<V> liveStateLIZ = c1664680tQA2.LIZ(new C2217381BqS() { // from class: X.11jo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((EmbedHashTagStickerModel) obj).getVisible());
            }
        });
        LifecycleOwner lifecycleOwner3 = this.LLILZLL;
        if (lifecycleOwner3 == null) {
            lifecycleOwner3 = null;
        }
        liveStateLIZ.LJIIIZ(lifecycleOwner3, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 796));
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA3 = this.LLILZIL;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        LiveState<V> liveStateLIZ2 = c1664680tQA3.LIZ(new C2217381BqS() { // from class: X.11jn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((EmbedHashTagStickerModel) obj).getEditable());
            }
        });
        LifecycleOwner lifecycleOwner4 = this.LLILZLL;
        if (lifecycleOwner4 == null) {
            lifecycleOwner4 = null;
        }
        liveStateLIZ2.LJIIIZ(lifecycleOwner4, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 797));
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA4 = this.LLILZIL;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        LiveState<V> liveStateLIZ3 = c1664680tQA4.LIZ(new C2217381BqS() { // from class: X.11jp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EmbedHashTagStickerModel) obj).getContentText();
            }
        });
        LifecycleOwner lifecycleOwner5 = this.LLILZLL;
        if (lifecycleOwner5 == null) {
            lifecycleOwner5 = null;
        }
        liveStateLIZ3.LJIIIZ(lifecycleOwner5, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 798));
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA5 = this.LLILZIL;
        if (c1664680tQA5 == null) {
            c1664680tQA5 = null;
        }
        LiveState<V> liveStateLIZ4 = c1664680tQA5.LIZ(new C2217381BqS() { // from class: X.11jq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((EmbedHashTagStickerModel) obj).getClickable());
            }
        });
        LifecycleOwner lifecycleOwner6 = this.LLILZLL;
        if (lifecycleOwner6 != null) {
            lifecycleOwner2 = lifecycleOwner6;
        }
        liveStateLIZ4.LJIIIZ(lifecycleOwner2, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 799));
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        this.LLILZ = interactStickerStruct;
        C786410Ut5.Sd(R.layout.cd2, C786410Ut5.ne(getContext()), this);
        setContentEditText((C0I7D) findViewById(R.id.he9));
        C786410Ut5.LLLLLZL(getContentEditText(), 8);
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        setBackgroundResource(R.drawable.ank);
        C0C64.LJIILLIIL().LJIIIZ(31744, "image_sticker_embed_debug_tools", true, false);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.0f);
    }

    public C19584311jl(int i, Context context, C19591211ks c19591211ks) {
        super(0, context, null, (i & 8) != 0 ? null : c19591211ks);
    }
}
