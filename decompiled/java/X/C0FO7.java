package X;

import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FO7, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FO7 extends RecyclerView.ViewHolder {
    public final View LL;
    public TuxTextView LLILLJJLI;
    public View LLILLL;
    public C1324800kZy LLILZ;
    public C19671011xk LLILZIL;
    public TuxIconView LLILZLL;
    public View LLIZ;
    public final Drawable LLIZLLLIL;
    public final Drawable LLJ;
    public long LLJI;
    public String LLJIJIL;
    public C0FOA LLJILJIL;

    public final C19671011xk I5() {
        View view = this.LL;
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = view.findViewById(R.id.s9d);
            this.LLILZIL = (C19671011xk) callbackFindViewById;
        }
        return (C19671011xk) callbackFindViewById;
    }

    public final TuxIconView L5() {
        View view = this.LL;
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = view.findViewById(R.id.tep);
            this.LLILZLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final View N5() {
        View view = this.LL;
        View view2 = this.LLIZ;
        if (view2 != null) {
            return view2;
        }
        View viewFindViewById = view.findViewById(R.id.nmv);
        this.LLIZ = viewFindViewById;
        return viewFindViewById;
    }

    public final View P5() {
        View view = this.LL;
        View view2 = this.LLILLL;
        if (view2 != null) {
            return view2;
        }
        View viewFindViewById = view.findViewById(R.id.v_select);
        this.LLILLL = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxTextView R5() {
        View view = this.LL;
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = view.findViewById(R.id.tv_title);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void S5() {
        this.LLJI++;
        TuxTextView tuxTextViewR5 = R5();
        if (tuxTextViewR5 != null) {
            tuxTextViewR5.scrollTo(0, 0);
            tuxTextViewR5.setGravity(17);
            tuxTextViewR5.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextViewR5.setSelected(false);
            tuxTextViewR5.setFocusable(false);
            tuxTextViewR5.setFocusableInTouchMode(false);
            tuxTextViewR5.setHorizontallyScrolling(false);
            tuxTextViewR5.setMarqueeRepeatLimit(0);
        }
    }

    public C0FO7(View view) {
        super(view);
        this.LL = view;
        C1361400lX0 c1361400lX0LIZ = C1385040m98.LIZ(view.getContext(), true);
        C384050F3z c384050F3z = new C384050F3z();
        C1546210qL5.LIZ.getClass();
        c384050F3z.LJII = C814420VxA.LIZIZ(C1546210qL5.LIZ(82));
        c384050F3z.LJI = C814420VxA.LIZIZ(C1546210qL5.LIZ(82));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(3)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.a1h);
        c384050F3z.LIZJ = Float.valueOf(C1546210qL5.LIZ(14));
        this.LLIZLLLIL = c384050F3z.LIZ(c1361400lX0LIZ);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.z_);
        c384050F3z2.LIZJ = Float.valueOf(C1546210qL5.LIZ(14));
        this.LLJ = c384050F3z2.LIZ(c1361400lX0LIZ);
        C384050F3z c384050F3z3 = new C384050F3z();
        c384050F3z3.LIZ = C1308910kAL.LIZJ(R.attr.zo, C1385040m98.LIZ(view.getContext(), true));
        c384050F3z3.LIZJ = Float.valueOf(C1546210qL5.LIZ(14));
        Drawable drawableLIZ = c384050F3z3.LIZ(view.getContext());
        this.LLJILJIL = C0FOA.IDEL;
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = view.findViewById(R.id.l57);
            this.LLILZ = (C1324800kZy) callbackFindViewById;
        }
        C1324800kZy c1324800kZy = (C1324800kZy) callbackFindViewById;
        if (c1324800kZy != null) {
            c1324800kZy.LLJILJIL = true;
            c1324800kZy.setRectFRadius(C1546210qL5.LIZ(14));
            int i = C1324800kZy.LLJILLL;
            c1324800kZy.setClipStyle(1);
            c1324800kZy.setEnableAnimation(true);
            c1324800kZy.setBackground(drawableLIZ);
        }
    }

    public final void T5(final String str) {
        final TuxTextView tuxTextViewR5;
        if (str == null || str.length() == 0 || (tuxTextViewR5 = R5()) == null) {
            return;
        }
        final long j = this.LLJI + 1;
        this.LLJI = j;
        HandlerHook.viewPost(tuxTextViewR5, new Runnable() { // from class: X.0FO8
            public final void LIZ() {
                Layout layout;
                if (j == this.LLJI && tuxTextViewR5.isAttachedToWindow() && Intrinsics.LJFF(str, this.LLJIJIL) && this.LLJILJIL == C0FOA.SELECTED && (layout = tuxTextViewR5.getLayout()) != null && layout.getLineCount() > 0) {
                    if (layout.getEllipsisCount(0) <= 0) {
                        this.S5();
                        return;
                    }
                    TuxTextView tuxTextViewR52 = this.R5();
                    if (tuxTextViewR52 != null) {
                        tuxTextViewR52.scrollTo(0, 0);
                        tuxTextViewR52.setGravity(8388611);
                        tuxTextViewR52.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                        tuxTextViewR52.setHorizontallyScrolling(true);
                        tuxTextViewR52.setMarqueeRepeatLimit(-1);
                        tuxTextViewR52.setSelected(false);
                        tuxTextViewR52.setSelected(true);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LyricEffectViewHolder@fdbb.scheduleTitleMarqueeIfNeeded$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LyricEffectViewHolder@fdbb.scheduleTitleMarqueeIfNeeded$1");
            }
        });
    }
}
