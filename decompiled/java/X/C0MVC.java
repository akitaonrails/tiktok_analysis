package X;

import Y.ACListenerS112S0200000_8;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS77S0200000_8;
import android.content.Context;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS587S0100000_8;
import mf.a;

/* JADX INFO: renamed from: X.0MVC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MVC extends LinearLayout {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;
    public final C197039127h LLILLL;
    public final SmartImageView LLILZ;
    public final C197039127h LLILZIL;
    public final C197039127h LLILZLL;
    public final View LLIZ;
    public Function1<? super String, Unit> LLIZLLLIL;
    public final TextPaint LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    public final SmartImageView getCoverImgView() {
        return this.LLILZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MVC(Context context) {
        int i;
        super(context, null, 0);
        C197039127h c197039127h = null;
        this.LLJ = new TextPaint();
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_keep_editing_popup_change_to_push", true) == 2) {
            i = R.layout.sg;
        } else {
            i = R.layout.sf;
        }
        C786410Ut5.Td(C786410Ut5.ne(context), i, this, true);
        this.LL = (TuxTextView) findViewById(R.id.tdi);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.e26);
        this.LLILLJJLI = tuxIconView;
        TuxIconView tuxIconView2 = this.LLILLJJLI;
        if (tuxIconView2 != null) {
            HandlerHook.viewPost(tuxIconView2, new ARunnableS104S0100000_4(this, 158));
        }
        this.LLILZ = (SmartImageView) findViewById(R.id.tdh);
        this.LLILZIL = (C197039127h) findViewById(R.id.tde);
        C197039127h c197039127h2 = (C197039127h) findViewById(R.id.tdd);
        if (c197039127h2 != null) {
            c197039127h2.setButtonVariant(1);
        } else {
            c197039127h2 = null;
        }
        this.LLILZLL = c197039127h2;
        this.LLIZ = findViewById(R.id.vvd);
        C197039127h c197039127h3 = (C197039127h) findViewById(R.id.tzg);
        if (c197039127h3 != null) {
            c197039127h3.setButtonVariant(1);
            HandlerHook.viewPost(c197039127h3, new ARunnableS77S0200000_8(this, c197039127h3, 40));
            c197039127h = c197039127h3;
        }
        this.LLILLL = c197039127h;
        if (C0MV8.LIZ()) {
            if (c197039127h != null) {
                C786410Ut5.LLLLLLJ(c197039127h, 0);
            }
            if (c197039127h2 != null) {
                C786410Ut5.LLLLLLJ(c197039127h2, 8);
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_interrupt_continue_edit_interaction_opt", true) == 1 && tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
        }
    }

    public final void setCancelAction(Function0<Unit> function0) {
        C197039127h c197039127h = this.LLILZLL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS112S0200000_8(this, function0, 22));
        }
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS112S0200000_8(this, function0, 23));
        }
    }

    public final void setClicked(boolean z) {
        this.LLJI = z;
    }

    public final void setClickedClose(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setConfirmAction(Function0<Unit> function0) {
        View.OnClickListener aCListenerS112S0200000_8 = new ACListenerS112S0200000_8(this, function0, 24);
        if (C1848410yCV.LIZ) {
            aCListenerS112S0200000_8 = new f(aCListenerS112S0200000_8);
        }
        a aVar = new a(aCListenerS112S0200000_8);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        C197039127h c197039127h = this.LLILZIL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS112S0200000_8(this, function0, 25));
        }
    }

    public final void setDismissAction(Function1<? super String, Unit> function1) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_show_keep_editing_push_only_once", true, false)) {
            function1 = new AwS587S0100000_8(function1, 778);
        }
        this.LLIZLLLIL = function1;
    }

    public final void setSaveDraftAction(Function0<Unit> function0) {
        C197039127h c197039127h = this.LLILLL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS112S0200000_8(this, function0, 26));
        }
    }

    public final void setText(int i) {
        this.LL.setText(getResources().getText(i));
    }

    public final void setText(String str) {
        this.LL.setText(str);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        LinearLayout.LayoutParams layoutParams;
        super.onMeasure(i, i2);
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_keep_editing_popup_change_to_push", true);
        if (iLJIJ != 1) {
            if (iLJIJ == 2) {
                C197039127h c197039127h = this.LLILZIL;
                if (c197039127h != null) {
                    if (c197039127h.getMeasuredWidth() < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76))) {
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
                        int measuredHeight = c197039127h.getMeasuredHeight();
                        ViewGroup.LayoutParams layoutParams2 = c197039127h.getLayoutParams();
                        layoutParams2.width = iLIZIZ;
                        layoutParams2.height = measuredHeight;
                        C786410Ut5.W5(c197039127h, layoutParams2);
                    }
                    if (c197039127h.getMeasuredWidth() == c197039127h.getMaxWidth() && c197039127h.getPaint().measureText(c197039127h.getText().toString()) >= (c197039127h.getMeasuredWidth() - c197039127h.getPaddingLeft()) - c197039127h.getPaddingRight() && c197039127h.getTextSize() <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) {
                        c197039127h.setMaxWidth(Integer.MAX_VALUE);
                    }
                }
                TuxTextView tuxTextView = this.LL;
                StaticLayout staticLayoutLIZLLL = C20588115hH.LIZLLL(tuxTextView, tuxTextView.getText(), this.LLJ, (this.LL.getMeasuredWidth() - this.LL.getPaddingLeft()) - this.LL.getPaddingRight(), Float.valueOf(this.LL.getTextSize()), true);
                if (this.LL.getMaxLines() != -1) {
                    if (staticLayoutLIZLLL.getLineCount() > this.LL.getMaxLines() || staticLayoutLIZLLL.getLineEnd(staticLayoutLIZLLL.getLineCount() - 1) != this.LL.getText().length()) {
                        TuxTextView tuxTextView2 = this.LL;
                        tuxTextView2.setMaxLines(4);
                        ViewGroup.LayoutParams layoutParams3 = tuxTextView2.getLayoutParams();
                        if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams3) != null) {
                            layoutParams.gravity = 48;
                            C786410Ut5.R6(tuxTextView2, layoutParams);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (this.LL.getLineCount() > 1) {
            View view = this.LLIZ;
            if (view == null) {
                return;
            }
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            layoutParams4.width = -1;
            layoutParams4.height = iLIZIZ2;
            C786410Ut5.W5(view, layoutParams4);
            return;
        }
        View view2 = this.LLIZ;
        if (view2 == null) {
            return;
        }
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
        layoutParams5.width = -1;
        layoutParams5.height = iLIZIZ3;
        C786410Ut5.W5(view2, layoutParams5);
    }

    public final void LIZ(int i, boolean z, boolean z2) {
        String string = getResources().getText(i).toString();
        if (z) {
            C197039127h c197039127h = this.LLILZIL;
            if (c197039127h != null) {
                c197039127h.setText(string);
                return;
            }
            return;
        }
        if (z2) {
            C197039127h c197039127h2 = this.LLILZLL;
            if (c197039127h2 == null) {
                return;
            }
            c197039127h2.setText(string);
            return;
        }
        C197039127h c197039127h3 = this.LLILLL;
        if (c197039127h3 == null) {
            return;
        }
        c197039127h3.setText(string);
    }
}
