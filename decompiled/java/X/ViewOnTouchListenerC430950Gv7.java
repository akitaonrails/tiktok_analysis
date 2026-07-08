package X;

import Y.ARunnableS75S0200000_6;
import android.os.Looper;
import android.text.Layout;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0Gv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewOnTouchListenerC430950Gv7 implements View.OnTouchListener {
    public InterfaceC430960Gv8 LL;
    public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
    public boolean LLILLL;
    public boolean LLILZ;
    public float LLILZIL;
    public float LLILZLL;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        TextView textView;
        Spanned spanned;
        Integer numValueOf;
        int x;
        int y;
        if (view instanceof TextView) {
            textView = (TextView) view;
        } else {
            textView = null;
        }
        boolean z = false;
        if (textView == null) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spanned) || (spanned = (Spanned) text) == null) {
            return false;
        }
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
            x = (int) motionEvent.getX();
            y = (int) motionEvent.getY();
        } else {
            numValueOf = null;
            x = 0;
            y = 0;
        }
        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        int scrollY = totalPaddingTop + textView.getScrollY();
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(scrollY);
        float f = scrollX;
        int iU3 = C786410Ut5.U3(layout, lineForVertical, f);
        InterfaceC430960Gv8[] interfaceC430960Gv8Arr = (InterfaceC430960Gv8[]) spanned.getSpans(iU3, iU3, InterfaceC430960Gv8.class);
        if (iU3 >= layout.getLineVisibleEnd(lineForVertical) && f > layout.getLineWidth(lineForVertical)) {
            interfaceC430960Gv8Arr = new InterfaceC430960Gv8[0];
        }
        if (interfaceC430960Gv8Arr.length == 0) {
            InterfaceC430960Gv8 interfaceC430960Gv8 = this.LL;
            if (interfaceC430960Gv8 != null) {
                interfaceC430960Gv8.LJII(textView, spanned, iU3);
            }
            this.LL = null;
            this.LLILZ = true;
            this.LLILLJJLI.removeCallbacksAndMessages(null);
        } else {
            if (interfaceC430960Gv8Arr.length != 0) {
                InterfaceC430960Gv8 interfaceC430960Gv82 = interfaceC430960Gv8Arr[0];
                int length = interfaceC430960Gv8Arr.length - 1;
                if (length == 0) {
                    if (interfaceC430960Gv82 != null) {
                    }
                } else {
                    float fLJFF = interfaceC430960Gv82.LJFF(f);
                    if (1 <= length) {
                        int i = 1;
                        while (true) {
                            InterfaceC430960Gv8 interfaceC430960Gv83 = interfaceC430960Gv8Arr[i];
                            float fLJFF2 = interfaceC430960Gv83.LJFF(f);
                            if (Float.compare(fLJFF, fLJFF2) > 0) {
                                interfaceC430960Gv82 = interfaceC430960Gv83;
                                fLJFF = fLJFF2;
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 1) {
                        this.LLILLJJLI.removeCallbacksAndMessages(null);
                        interfaceC430960Gv82.LIZJ(textView, spanned, iU3);
                        if (!this.LLILZ && !this.LLILLL) {
                            interfaceC430960Gv82.onClick(textView);
                        }
                        this.LL = null;
                        this.LLILLL = false;
                    } else if (numValueOf.intValue() == 0) {
                        this.LLILZIL = motionEvent.getX();
                        this.LLILZLL = motionEvent.getY();
                        this.LLILZ = false;
                        this.LL = interfaceC430960Gv82;
                        C786410Ut5.LJLIIL(300L, this.LLILLJJLI, new ARunnableS75S0200000_6(this, interfaceC430960Gv82, textView, 102));
                        interfaceC430960Gv82.LJ(textView, spanned, iU3);
                    } else if (numValueOf.intValue() == 2) {
                        if (Math.abs(motionEvent.getX() - this.LLILZIL) >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) || Math.abs(motionEvent.getY() - this.LLILZLL) >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))) {
                            this.LLILZ = true;
                            this.LLILLJJLI.removeCallbacksAndMessages(null);
                            interfaceC430960Gv82.LJII(textView, spanned, iU3);
                        }
                    } else if (numValueOf.intValue() == 3) {
                        this.LLILZ = true;
                        this.LL = null;
                        this.LLILLJJLI.removeCallbacksAndMessages(null);
                        interfaceC430960Gv82.LJII(textView, spanned, iU3);
                    }
                }
                z = true;
            }
            boolean z2 = z;
            z = true;
            if (z2) {
            }
            return z;
        }
        textView.invalidate();
        return z;
    }
}
