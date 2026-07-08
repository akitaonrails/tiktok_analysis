package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0yRN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1857630yRN extends AppCompatTextView implements InterfaceC1860050yVH {
    public Function2<? super TextView, Object, Unit> LLIZLLLIL;
    public Function0<Boolean> LLJ;
    public float LLJI;
    public float LLJIJIL;

    @Override // X.InterfaceC1860050yVH
    public final View LJJZZI() {
        return this;
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

    @Override // X.InterfaceC1860050yVH
    public float getClickX() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1860050yVH
    public float getClickY() {
        return this.LLJIJIL;
    }

    public Function0<Boolean> getDownListener() {
        return this.LLJ;
    }

    public Function2<TextView, Object, Unit> getImageClick() {
        return this.LLIZLLLIL;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
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
        this.LLJI = f;
    }

    public void setClickY(float f) {
        this.LLJIJIL = f;
    }

    public void setDownListener(Function0<Boolean> function0) {
        this.LLJ = function0;
    }

    public void setImageClick(Function2<? super TextView, Object, Unit> function2) {
        this.LLIZLLLIL = function2;
    }

    public C1857630yRN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public C1857630yRN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
