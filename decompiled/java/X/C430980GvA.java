package X;

import Y.ARunnableS106S0100000_6;
import android.os.Looper;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0GvA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430980GvA extends BaseMovementMethod {
    public static InterfaceC430960Gv8 LIZIZ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static float LJFF;
    public static float LJI;
    public static final C430980GvA LIZ = new C430980GvA();
    public static final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [T, X.0Gv8[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object[]] */
    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        Integer numValueOf;
        int x;
        int y;
        Object obj;
        boolean z;
        if (textView != null && spannable != null) {
            if (motionEvent != null) {
                numValueOf = Integer.valueOf(motionEvent.getAction());
            } else {
                numValueOf = null;
            }
            if (motionEvent != null) {
                x = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
            } else {
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
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = spannable.getSpans(iU3, iU3, InterfaceC430960Gv8.class);
            if (iU3 >= layout.getLineVisibleEnd(lineForVertical) && f > layout.getLineWidth(lineForVertical)) {
                c259800zU.element = new InterfaceC430960Gv8[0];
            }
            Object[] objArr = (Object[]) c259800zU.element;
            if (objArr.length == 0) {
                InterfaceC430960Gv8 interfaceC430960Gv8 = LIZIZ;
                if (interfaceC430960Gv8 != null) {
                    interfaceC430960Gv8.LJII(textView, spannable, iU3);
                }
                LIZIZ = null;
                LJ = true;
                LIZJ.removeCallbacksAndMessages(null);
                z = false;
            } else {
                if (objArr.length == 0) {
                    obj = null;
                } else {
                    obj = objArr[0];
                    int length = objArr.length - 1;
                    if (length != 0) {
                        float fLJFF = ((InterfaceC430960Gv8) obj).LJFF(f);
                        if (1 <= length) {
                            int i = 1;
                            while (true) {
                                Object obj2 = objArr[i];
                                float fLJFF2 = ((InterfaceC430960Gv8) obj2).LJFF(f);
                                if (Float.compare(fLJFF, fLJFF2) > 0) {
                                    obj = obj2;
                                    fLJFF = fLJFF2;
                                }
                                if (i == length) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
                InterfaceC430960Gv8 interfaceC430960Gv82 = (InterfaceC430960Gv8) obj;
                if (interfaceC430960Gv82 != null) {
                    if (numValueOf != null) {
                        if (numValueOf.intValue() == 1) {
                            LIZJ.removeCallbacksAndMessages(null);
                            interfaceC430960Gv82.LIZJ(textView, spannable, iU3);
                            if (!LJ && !LIZLLL) {
                                interfaceC430960Gv82.onClick(textView);
                            }
                            LIZIZ = null;
                            LIZLLL = false;
                        } else if (numValueOf.intValue() == 0) {
                            LJFF = motionEvent.getX();
                            LJI = motionEvent.getY();
                            LJ = false;
                            LIZIZ = interfaceC430960Gv82;
                            C786410Ut5.LJLIIL(300L, LIZJ, new ARunnableS106S0100000_6(interfaceC430960Gv82, textView, 165));
                            interfaceC430960Gv82.LJ(textView, spannable, iU3);
                        } else if (numValueOf.intValue() == 2) {
                            if (Math.abs(motionEvent.getX() - LJFF) >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) || Math.abs(motionEvent.getY() - LJI) >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))) {
                                LJ = true;
                                LIZJ.removeCallbacksAndMessages(null);
                                interfaceC430960Gv82.LJII(textView, spannable, iU3);
                            }
                        } else if (numValueOf.intValue() == 3) {
                            LJ = true;
                            LIZIZ = null;
                            LIZJ.removeCallbacksAndMessages(null);
                            interfaceC430960Gv82.LJII(textView, spannable, iU3);
                        }
                    }
                    z = true;
                    if (1 != 0) {
                    }
                    if (z && !super.onTouchEvent(textView, spannable, motionEvent)) {
                        return false;
                    }
                }
                return true;
            }
            textView.invalidate();
            if (z) {
            }
            return true;
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
