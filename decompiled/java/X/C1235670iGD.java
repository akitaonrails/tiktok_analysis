package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1235670iGD extends LinearLayout {
    public final C1237400iJ0 LL;
    public final C1237360iIw LLILLJJLI;

    public final CharSequence getMessage() {
        return this.LLILLJJLI.getMessage();
    }

    public final void setApproveExceed(boolean z) {
        this.LLILLJJLI.setApproveExceed(z);
    }

    public final void setAreaBoxCustomContainer(GradientDrawable gradientDrawable) {
        this.LLILLJJLI.setCustomContainer(gradientDrawable);
    }

    public final void setAreaBoxTrailingView(View view) {
        this.LLILLJJLI.setTrailingView(view);
    }

    public final void setAreaBoxWidth(int i) {
        ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
        layoutParams.width = i;
        C1237400iJ0 c1237400iJ0 = this.LL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1237400iJ0);
        c1237400iJ0.setLayoutParams(layoutParams);
    }

    public final void setContentEnabled(boolean z) {
        this.LLILLJJLI.setTextAreaEnabled(z);
    }

    public final void setFooter(C1748330vb5 c1748330vb5) {
        this.LL.setFooter(c1748330vb5);
    }

    public final void setHeader(C1748300vb2 c1748300vb2) {
        this.LL.setHeader(c1748300vb2);
    }

    public final void setMessage(CharSequence charSequence) {
        this.LLILLJJLI.setMessage(charSequence);
    }

    public final void setMessageMaxLength(int i) {
        this.LLILLJJLI.setMessageMaxLength(i);
    }

    public final void setPlaceholder(CharSequence charSequence) {
        this.LLILLJJLI.setPlaceholder(charSequence);
    }

    public final void setTextChangeCallback(Function1<? super Editable, Unit> function1) {
        this.LLILLJJLI.setTextChangedCallback(function1);
    }

    public final void setTrailingText(CharSequence charSequence) {
        this.LLILLJJLI.setTrailingText(charSequence);
    }

    public C1235670iGD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1237360iIw c1237360iIw = new C1237360iIw(context, null, 6);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1237360iIw);
        c1237360iIw.setLayoutParams(layoutParams);
        this.LLILLJJLI = c1237360iIw;
        C1237400iJ0 c1237400iJ0 = new C1237400iJ0(context, null, 6);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1237400iJ0);
        c1237400iJ0.setLayoutParams(layoutParams2);
        c1237400iJ0.setContent(c1237360iIw);
        this.LL = c1237400iJ0;
        addView(c1237400iJ0);
    }
}
