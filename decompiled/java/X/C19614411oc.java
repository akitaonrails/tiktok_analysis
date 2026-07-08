package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.bytedance.als.ui.state.LiveState;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS608S0100000_29;
import mf.a;

/* JADX INFO: renamed from: X.11oc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19614411oc extends AbstractC19588311kP<AddYoursStickerModel> {
    public final Function0<Unit> LLILZIL;
    public C1664680tQA<AddYoursStickerModel> LLILZLL;
    public LifecycleOwner LLIZ;
    public C390290FRz LLIZLLLIL;
    public TextView LLJ;

    public final C390290FRz getContentEditText() {
        C390290FRz c390290FRz = this.LLIZLLLIL;
        if (c390290FRz != null) {
            return c390290FRz;
        }
        return null;
    }

    public final TextView getContentTextView() {
        TextView textView = this.LLJ;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    public final void LIZLLL() {
        TextView textView;
        C390290FRz c390290FRz;
        View viewFindViewById = findViewById(R.id.bgk);
        if ((viewFindViewById instanceof C390290FRz) && (c390290FRz = (C390290FRz) viewFindViewById) != null) {
            setContentEditText(c390290FRz);
        }
        View viewFindViewById2 = findViewById(R.id.bgk);
        if (!(viewFindViewById2 instanceof TextView) || (textView = (TextView) viewFindViewById2) == null) {
            return;
        }
        setContentTextView(textView);
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LJIIZILJ() {
        C1866270yfJ c1866270yfJ;
        Function0<Map<Integer, InterfaceC19578611iq>> function0;
        Map<Integer, InterfaceC19578611iq> mapInvoke;
        InterfaceC19578611iq interfaceC19578611iq;
        C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam == null || (c1866270yfJ = interactStickerContainerCommonParam.LJ) == null || (function0 = c1866270yfJ.LIZIZ) == null || (mapInvoke = function0.invoke()) == null || (interfaceC19578611iq = mapInvoke.get(88)) == null) {
            return;
        }
        View.OnClickListener c12y6 = new C12Y6(this, interfaceC19578611iq, 0);
        if (C1848410yCV.LIZ) {
            c12y6 = new f(c12y6);
        }
        a aVar = new a(c12y6);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final void setContentEditText(C390290FRz c390290FRz) {
        this.LLIZLLLIL = c390290FRz;
    }

    public final void setContentTextView(TextView textView) {
        this.LLJ = textView;
    }

    public C19614411oc(Context context, C390690FTn c390690FTn) {
        FrameLayout.LayoutParams layoutParams;
        super(0, 14, context, (AttributeSet) null);
        C390700FTo.LIZ(context, c390690FTn, this);
        this.LLILZIL = c390690FTn.LJIILIIL;
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 17;
        }
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA) {
        this.LLILZLL = c1664680tQA;
        this.LLIZ = lifecycleOwner;
        LIZLLL();
        C1664680tQA<AddYoursStickerModel> c1664680tQA2 = this.LLILZLL;
        LifecycleOwner lifecycleOwner2 = null;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        LiveState<V> liveStateLIZ = c1664680tQA2.LIZ(new C2217381BqS() { // from class: X.11oe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((AddYoursStickerModel) obj).getVisible());
            }
        });
        LifecycleOwner lifecycleOwner3 = this.LLIZ;
        if (lifecycleOwner3 == null) {
            lifecycleOwner3 = null;
        }
        liveStateLIZ.LJIIIZ(lifecycleOwner3, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 482));
        C1664680tQA<AddYoursStickerModel> c1664680tQA3 = this.LLILZLL;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        LiveState<V> liveStateLIZ2 = c1664680tQA3.LIZ(new C2217381BqS() { // from class: X.11od
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((AddYoursStickerModel) obj).getEditable());
            }
        });
        LifecycleOwner lifecycleOwner4 = this.LLIZ;
        if (lifecycleOwner4 == null) {
            lifecycleOwner4 = null;
        }
        liveStateLIZ2.LJIIIZ(lifecycleOwner4, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 483));
        C1664680tQA<AddYoursStickerModel> c1664680tQA4 = this.LLILZLL;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        LiveState<V> liveStateLIZ3 = c1664680tQA4.LIZ(new C2217381BqS() { // from class: X.0FSE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddYoursStickerModel) obj).getTopicText();
            }
        });
        LifecycleOwner lifecycleOwner5 = this.LLIZ;
        if (lifecycleOwner5 == null) {
            lifecycleOwner5 = null;
        }
        liveStateLIZ3.LJIIIZ(lifecycleOwner5, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 484));
        C1664680tQA<AddYoursStickerModel> c1664680tQA5 = this.LLILZLL;
        if (c1664680tQA5 == null) {
            c1664680tQA5 = null;
        }
        LiveState<V> liveStateLIZ4 = c1664680tQA5.LIZ(new C2217381BqS() { // from class: X.11of
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((AddYoursStickerModel) obj).getClickable());
            }
        });
        LifecycleOwner lifecycleOwner6 = this.LLIZ;
        if (lifecycleOwner6 == null) {
            lifecycleOwner6 = null;
        }
        liveStateLIZ4.LJIIIZ(lifecycleOwner6, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 485));
        C1664680tQA<AddYoursStickerModel> c1664680tQA6 = this.LLILZLL;
        if (c1664680tQA6 == null) {
            c1664680tQA6 = null;
        }
        LiveState<V> liveStateLIZ5 = c1664680tQA6.LIZ(new C2217381BqS() { // from class: X.0FSV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((AddYoursStickerModel) obj).getFontSize());
            }
        });
        LifecycleOwner lifecycleOwner7 = this.LLIZ;
        if (lifecycleOwner7 == null) {
            lifecycleOwner7 = null;
        }
        liveStateLIZ5.LJIIIZ(lifecycleOwner7, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 486));
        C1664680tQA<AddYoursStickerModel> c1664680tQA7 = this.LLILZLL;
        if (c1664680tQA7 == null) {
            c1664680tQA7 = null;
        }
        LiveState<V> liveStateLIZ6 = c1664680tQA7.LIZ(new C2217371BqR() { // from class: X.0FRp
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((AddYoursStickerModel) obj).isCandidateState());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((AddYoursStickerModel) obj).setCandidateState(((Boolean) obj2).booleanValue());
            }
        });
        LifecycleOwner lifecycleOwner8 = this.LLIZ;
        if (lifecycleOwner8 != null) {
            lifecycleOwner2 = lifecycleOwner8;
        }
        liveStateLIZ6.LJIIIZ(lifecycleOwner2, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 893));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r13, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r14) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19614411oc.LIZJ(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel):void");
    }

    public C19614411oc(int i, Context context, C19591211ks c19591211ks) {
        super(0, context, (AttributeSet) null, (i & 8) != 0 ? null : c19591211ks);
    }
}
