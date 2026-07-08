package X;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0yRO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857640yRO extends C21415018rM implements InterfaceC1860040yVG, InterfaceC1860070yVJ {
    public float LLJILLL;
    public float LLJJ;
    public Function0<Boolean> LLJJI;
    public Function2<? super TextView, Object, Unit> LLJJIII;
    public C2248221Cz6 LLJJIJI;

    @Override // X.InterfaceC1860050yVH
    public final View LJJZZI() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1860050yVH
    public final TextView LJIJI() {
        if (this instanceof TextView) {
            return (TextView) this;
        }
        return null;
    }

    @Override // X.InterfaceC1860040yVG
    public final void LJIILLIIL() {
        C2248221Cz6 textSelector = getTextSelector();
        if (textSelector != null) {
            textSelector.LJIIZILJ.clear();
        }
    }

    public FrameLayout getContainer() {
        FrameLayout frameLayout;
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        if ((parent instanceof FrameLayout) && (frameLayout = (FrameLayout) parent) != null) {
            return frameLayout;
        }
        C1857650yRP c1857650yRP = C1857650yRP.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this view must use FrameLayout as parent. current parent is ");
        sbLIZ.append(parent);
        c1857650yRP.ensureNotReachHere(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)), "");
        return null;
    }

    @Override // X.InterfaceC1860070yVJ
    public String getCopyText() {
        CharSequence text = getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    @Override // X.InterfaceC1860070yVJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getSelectedText() {
        /*
            r5 = this;
            java.lang.CharSequence r4 = r5.getText()
            if (r4 != 0) goto L8
            java.lang.String r4 = ""
        L8:
            X.1Cz6 r0 = r5.getTextSelector()
            r3 = 0
            if (r0 == 0) goto L13
            int r1 = r0.LJIIJJI
            if (r1 >= 0) goto L14
        L13:
            r1 = 0
        L14:
            X.1Cz6 r0 = r5.getTextSelector()
            if (r0 == 0) goto L34
            int r2 = r0.LJIIL
            int r0 = r4.length()
            if (r2 <= r0) goto L23
            r2 = r0
        L23:
            if (r1 >= r2) goto L34
            r3 = r1
        L26:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.CharSequence r0 = r4.subSequence(r3, r2)
            r1.<init>(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L34:
            int r2 = r4.length()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1857640yRO.getSelectedText():java.lang.String");
    }

    public final CharSequence getText() {
        CharSequence text;
        Layout layout = getLayout();
        return (layout == null || (text = layout.getText()) == null) ? "" : text;
    }

    @Override // X.C21415018rM, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTextSelector(new C2248221Cz6(this, new AwS571S0100000_27(this, 1089)));
    }

    @Override // X.C21415018rM, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2248221Cz6 textSelector = getTextSelector();
        if (textSelector != null) {
            textSelector.LJJIFFI();
        }
        setTextSelector(null);
    }

    @Override // X.InterfaceC1860050yVH
    public float getClickX() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1860050yVH
    public float getClickY() {
        return this.LLJJ;
    }

    public Function0<Boolean> getDownListener() {
        return this.LLJJI;
    }

    public Function2<TextView, Object, Unit> getImageClick() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1860040yVG
    public C2248221Cz6 getTextSelector() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1860040yVG
    public final void LJ(InterfaceC2248331CzH interfaceC2248331CzH) {
        C2248221Cz6 textSelector = getTextSelector();
        if (textSelector != null) {
            textSelector.LJIIZILJ.add(interfaceC2248331CzH);
        }
    }

    @Override // X.C21415018rM, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Function0<Boolean> downListener;
        if (motionEvent == null) {
            return false;
        }
        setClickX(motionEvent.getX());
        setClickY(motionEvent.getY());
        if (motionEvent.getAction() == 0 && (downListener = getDownListener()) != null && downListener.invoke().booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClickX(float f) {
        this.LLJILLL = f;
    }

    public void setClickY(float f) {
        this.LLJJ = f;
    }

    public void setDownListener(Function0<Boolean> function0) {
        this.LLJJI = function0;
    }

    public void setImageClick(Function2<? super TextView, Object, Unit> function2) {
        this.LLJJIII = function2;
    }

    public void setTextSelector(C2248221Cz6 c2248221Cz6) {
        this.LLJJIJI = c2248221Cz6;
    }

    public C1857640yRO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4);
    }
}
