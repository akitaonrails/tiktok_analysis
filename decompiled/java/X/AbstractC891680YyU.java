package X;

import Y.ARunnableS113S0100000_13;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC891680YyU extends LinearLayout {
    public Function1<? super InterfaceC889560Yv4, Unit> LL;
    public Function1<? super InterfaceC889560Yv4, Unit> LLILLJJLI;
    public InterfaceC879010Ye3 LLILLL;
    public List<C0Z4O> LLILZ;
    public boolean LLILZIL;
    public final Paint LLILZLL;

    public abstract boolean LIZ(boolean z);

    public abstract List<InterfaceC889560Yv4> getEnabledActionBtnList();

    public abstract Function0<List<InterfaceC888500YtM>> getSelectedListGetter();

    public abstract void setSelectedListGetter(Function0<? extends List<? extends InterfaceC888500YtM>> function0);

    public final InterfaceC879010Ye3 getCurPageKey() {
        return this.LLILLL;
    }

    public final Function1<InterfaceC889560Yv4, Unit> getOnFinishBatchExecute() {
        return this.LLILLJJLI;
    }

    public final Function1<InterfaceC889560Yv4, Unit> getOnStartBatchExecute() {
        return this.LL;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, this.LLILZLL);
    }

    public final void setCurPageKey(InterfaceC879010Ye3 interfaceC879010Ye3) {
        this.LLILLL = interfaceC879010Ye3;
    }

    public final void setOnFinishBatchExecute(Function1<? super InterfaceC889560Yv4, Unit> function1) {
        this.LLILLJJLI = function1;
    }

    public final void setOnStartBatchExecute(Function1<? super InterfaceC889560Yv4, Unit> function1) {
        this.LL = function1;
    }

    public AbstractC891680YyU(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet);
        this.LLILZ = C13BV.INSTANCE;
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -7829368;
        }
        paint.setColor(iIntValue);
        paint.setStrokeWidth(C418440Gaw.LIZIZ(1));
        this.LLILZLL = paint;
        setOrientation(0);
        setWillNotDraw(false);
    }

    public final void LIZIZ(InterfaceC879010Ye3 interfaceC879010Ye3, boolean z) {
        int iIntValue;
        this.LLILZIL = false;
        this.LLILLL = interfaceC879010Ye3;
        List<InterfaceC889560Yv4> enabledActionBtnList = getEnabledActionBtnList();
        List<C0Z4O> list = this.LLILZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C0Z4O> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getBtnWrapper$awemenotice_api_release());
        }
        if (!Intrinsics.LJFF(enabledActionBtnList, arrayList)) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
            removeAllViews();
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (InterfaceC889560Yv4 interfaceC889560Yv4 : enabledActionBtnList) {
                int i2 = i + 1;
                if (i >= 0) {
                    InterfaceC889560Yv4 interfaceC889560Yv42 = interfaceC889560Yv4;
                    if (i > 0) {
                        View view = new View(getContext());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)));
                        layoutParams.gravity = 17;
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, getContext());
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        view.setBackgroundColor(iIntValue);
                        C786410Ut5.W5(view, layoutParams);
                        addView(view);
                    }
                    C0Z4O c0z4o = new C0Z4O(getContext(), interfaceC889560Yv42, this);
                    addView(c0z4o);
                    arrayList2.add(c0z4o);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            this.LLILZ = arrayList2;
        }
        LIZJ(true, z);
    }

    public final void LIZJ(boolean z, boolean z2) {
        Activity activityLIZ;
        if (!this.LLILZIL && LIZ(z2)) {
            setClickable(true);
            if (!z) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setAlpha(1.0f);
            }
        } else {
            setClickable(false);
            if (!z) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setAlpha(0.5f);
            }
        }
        for (C0Z4O c0z4o : this.LLILZ) {
            TuxTextView tuxTextView = c0z4o.LLILLL;
            if (tuxTextView != null) {
                tuxTextView.setText(c0z4o.LL.LJ(c0z4o.getContext()));
            }
            if (c0z4o.LL.LJI() && c0z4o.LLILLJJLI.isClickable()) {
                c0z4o.setClickable(true);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0z4o);
                c0z4o.setAlpha(1.0f);
            } else {
                c0z4o.setClickable(false);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0z4o);
                c0z4o.setAlpha(0.5f);
            }
            if (z && (activityLIZ = C1388190mED.LIZ(c0z4o.getContext())) != null) {
                activityLIZ.runOnUiThread(new ARunnableS113S0100000_13(c0z4o, 257));
            }
        }
    }
}
