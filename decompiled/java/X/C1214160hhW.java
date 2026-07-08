package X;

import Y.ARunnableS75S0200000_6;
import Y.AUListenerS256S0100000_6;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.view.Widget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0hhW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1214160hhW extends FrameLayout implements InterfaceC1366240leo {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public LinearLayout LLILLL;
    public final C01GW LLILZ;
    public Widget LLILZIL;
    public final AUListenerS256S0100000_6 LLILZLL;

    public C1214160hhW() {
        throw null;
    }

    public int getLayoutResource() {
        return R.layout.cpk;
    }

    public final LinearLayout getRootFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nhr);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getRootLayout() {
        return (LinearLayout) this.LLILZ.getValue();
    }

    public final TuxIconView getTipIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xyd);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getTipTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xyf);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.InterfaceC1366240leo
    public final void LIZJ() {
        LinearLayout rootLayout = getRootLayout();
        if (rootLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.uk);
            rootLayout.setBackground(c384050F3z.LIZ(getContext()));
        }
    }

    public final void LIZLLL() {
        View view;
        if (getVisibility() == 0) {
            return;
        }
        Object parent = getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return;
        }
        HandlerHook.viewPost(this, new ARunnableS75S0200000_6(this, view, 41));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Widget widget = this.LLILZIL;
        if (widget != null) {
            widget.destroy();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void LIZ(boolean z) {
        int i;
        TuxIconView tipIvFromXml = getTipIvFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(tipIvFromXml, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C1214170hhX r13) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1214160hhW.LJ(X.0hhX):void");
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        Widget widget;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWindowVisibilityChanged: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        super.onWindowVisibilityChanged(i);
        if (i == 0 && (widget = this.LLILZIL) != null) {
            widget.resume();
        }
    }

    public final void setRootFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setTipIvFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setTipTextColor(int i) {
        TuxTextView tipTvFromXml = getTipTvFromXml();
        if (tipTvFromXml != null) {
            tipTvFromXml.setTextColor(i);
        }
        getTipIvFromXml().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
    }

    public final void setTipTvFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setWidget(Widget widget) {
        this.LLILZIL = widget;
    }

    public C1214160hhW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void LIZIZ(String str, Float f) {
        getTipTvFromXml().setText(str);
        LinearLayout rootFromXml = getRootFromXml();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
        rootFromXml.setBackground(c384050F3z.LIZ(getContext()));
        getTipTvFromXml().setTextColor(C960203pA.LIZ(R.attr.a1k, getContext()));
        if (f != null) {
            getTipTvFromXml().LJJJJI(f.floatValue());
        }
    }

    public C1214160hhW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3157));
        C21146717pB.LIZ(getContext(), getLayoutResource(), this);
        this.LLILZLL = new AUListenerS256S0100000_6(this, 125);
    }
}
