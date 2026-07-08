package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;

/* JADX INFO: renamed from: X.19Ws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21553619Ws extends C21553019Wm implements InterfaceC21554019Ww {
    public CharSequence LLJLIL;
    public ListAdapter LLJLILLLLZIIL;
    public final Rect LLJLL;
    public int LLJLLIL;
    public final /* synthetic */ C21553719Wt LLJLLL;

    public final void LJ() {
        int i;
        Drawable drawableLJFF = LJFF();
        if (drawableLJFF != null) {
            drawableLJFF.getPadding(this.LLJLLL.LLIZLLLIL);
            i = this.LLJLLL.getLayoutDirection() == 1 ? this.LLJLLL.LLIZLLLIL.right : -this.LLJLLL.LLIZLLLIL.left;
        } else {
            Rect rect = this.LLJLLL.LLIZLLLIL;
            rect.right = 0;
            rect.left = 0;
            i = 0;
        }
        int paddingLeft = this.LLJLLL.getPaddingLeft();
        int paddingRight = this.LLJLLL.getPaddingRight();
        int width = this.LLJLLL.getWidth();
        int i2 = this.LLJLLL.LLIZ;
        if (i2 == -2) {
            int iLIZ = this.LLJLLL.LIZ((SpinnerAdapter) this.LLJLILLLLZIIL, LJFF());
            int i3 = this.LLJLLL.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.LLJLLL.LLIZLLLIL;
            int i4 = (i3 - rect2.left) - rect2.right;
            if (iLIZ > i4) {
                iLIZ = i4;
            }
            LIZLLL(Math.max(iLIZ, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            LIZLLL((width - paddingLeft) - paddingRight);
        } else {
            LIZLLL(i2);
        }
        this.LLILZLL = this.LLJLLL.getLayoutDirection() == 1 ? i + (((width - paddingRight) - this.LLILZIL) - this.LLJLLIL) : i + paddingLeft + this.LLJLLIL;
    }

    @Override // X.InterfaceC21554019Ww
    public final CharSequence getHintText() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC21554019Ww
    public final void LJIIJ(CharSequence charSequence) {
        this.LLJLIL = charSequence;
    }

    @Override // X.InterfaceC21554019Ww
    public final void LJIIJJI(int i) {
        this.LLJLLIL = i;
    }

    @Override // X.C21553019Wm, X.InterfaceC21554019Ww
    public final void LJIILJJIL(ListAdapter listAdapter) {
        super.LJIILJJIL(listAdapter);
        this.LLJLILLLLZIIL = listAdapter;
    }

    @Override // X.InterfaceC21554019Ww
    public final void LJI(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean zIsShowing = isShowing();
        LJ();
        this.LLJJJJLIIL.setInputMethodMode(2);
        show();
        C21552519Wh c21552519Wh = this.LLILLL;
        c21552519Wh.setChoiceMode(1);
        c21552519Wh.setTextDirection(i);
        c21552519Wh.setTextAlignment(i2);
        int selectedItemPosition = this.LLJLLL.getSelectedItemPosition();
        C21552519Wh c21552519Wh2 = this.LLILLL;
        if (isShowing() && c21552519Wh2 != null) {
            c21552519Wh2.setListSelectionHidden(false);
            c21552519Wh2.setSelection(selectedItemPosition);
            if (c21552519Wh2.getChoiceMode() != 0) {
                c21552519Wh2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!zIsShowing && (viewTreeObserver = this.LLJLLL.getViewTreeObserver()) != null) {
            final ViewTreeObserverOnGlobalLayoutListenerC2189681Ams viewTreeObserverOnGlobalLayoutListenerC2189681Ams = new ViewTreeObserverOnGlobalLayoutListenerC2189681Ams(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2189681Ams);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC2189681Ams, ViewTreeObserver.OnGlobalLayoutListener.class);
            this.LLJJJJLIIL.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.19Wy
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ViewTreeObserver viewTreeObserver2 = this.LLILLJJLI.LLJLLL.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = viewTreeObserverOnGlobalLayoutListenerC2189681Ams;
                        viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                        C2187701Ajg.LIZIZ(viewTreeObserver2, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
                    }
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21553619Ws(C21553719Wt c21553719Wt, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.LLJLLL = c21553719Wt;
        this.LLJLL = new Rect();
        this.LLJJ = c21553719Wt;
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL.setFocusable(true);
        this.LLJJI = new AdapterView.OnItemClickListener() { // from class: X.19Wv
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                this.LL.LLJLLL.setSelection(i2);
                if (this.LL.LLJLLL.getOnItemClickListener() != null) {
                    C21553619Ws c21553619Ws = this.LL;
                    c21553619Ws.LLJLLL.performItemClick(view, i2, c21553619Ws.LLJLILLLLZIIL.getItemId(i2));
                }
                this.LL.dismiss();
            }
        };
    }
}
