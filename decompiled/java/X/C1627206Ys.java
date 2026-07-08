package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06Ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1627206Ys {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(View view, EnumC1049490dPv enumC1049490dPv) {
        final float fFloatValue;
        if (view != null) {
            final C1627006Yq c1627006Yq = null;
            switch (C1049480dPu.LIZ[enumC1049490dPv.ordinal()]) {
                case 1:
                    final Object[] objArr = null == true ? 1 : 0;
                    view.setOnTouchListener(new View.OnTouchListener(objArr) { // from class: X.06Yr
                        public final View.OnTouchListener LL;
                        public Drawable LLILLJJLI;

                        {
                            this.LL = objArr;
                        }

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            GradientDrawable gradientDrawable;
                            int action = motionEvent.getAction();
                            if (action != 0) {
                                if (action == 1 || action == 3) {
                                    view2.setBackground(this.LLILLJJLI);
                                }
                            } else {
                                this.LLILLJJLI = view2.getBackground();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onCellTouch: background is ");
                                sbLIZ.append(this.LLILLJJLI);
                                C2188811AlT.LIZIZ(sbLIZ);
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view2.getContext());
                                Drawable background = view2.getBackground();
                                if (background instanceof GradientDrawable) {
                                    gradientDrawable = (GradientDrawable) background;
                                } else {
                                    gradientDrawable = null;
                                }
                                if (numLIZJ != null && gradientDrawable != null) {
                                    gradientDrawable.setColor(numLIZJ.intValue());
                                }
                            }
                            View.OnTouchListener onTouchListener = this.LL;
                            if (onTouchListener != null) {
                                return onTouchListener.onTouch(view2, motionEvent);
                            }
                            return false;
                        }
                    });
                    return;
                case 2:
                    C427690Gpr.LJFF(view, C418440Gaw.LIZIZ(36));
                    return;
                case 3:
                case 4:
                    C427690Gpr.LJI(view, null);
                    return;
                case 5:
                    Float fLJFF = C1308910kAL.LJFF(R.attr.a36, view.getContext());
                    if (fLJFF != null) {
                        fFloatValue = fLJFF.floatValue();
                    } else {
                        fFloatValue = 0.2f;
                    }
                    view.setOnTouchListener(new View.OnTouchListener(fFloatValue, c1627006Yq) { // from class: X.06Yp
                        public final float LL;
                        public final Function2<View, MotionEvent, Boolean> LLILLJJLI;
                        public float LLILLL = 1.0f;

                        {
                            this.LL = fFloatValue;
                            this.LLILLJJLI = c1627006Yq;
                        }

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            int action = motionEvent.getAction();
                            if (action != 0) {
                                if (action == 1 || action == 3) {
                                    view2.animate().alpha(this.LLILLL).setDuration(0L).start();
                                }
                            } else {
                                this.LLILLL = view2.getAlpha();
                                view2.animate().alpha(this.LL).setDuration(0L).start();
                            }
                            Function2<View, MotionEvent, Boolean> function2 = this.LLILLJJLI;
                            if (function2 != null) {
                                return function2.invoke(view2, motionEvent).booleanValue();
                            }
                            return false;
                        }
                    });
                    return;
                case 6:
                    view.setOnTouchListener(null);
                    return;
                default:
                    throw new C1954807lC();
            }
        }
    }
}
