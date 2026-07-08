package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10xK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19413610xK {
    public static C19413410xI LIZ(C1117360fBO c1117360fBO) {
        c1117360fBO.getClass();
        if (!(c1117360fBO instanceof C19413410xI)) {
            return new C19413410xI(c1117360fBO, new InterfaceC19414010xO() { // from class: X.10xL
                /* JADX WARN: Type inference failed for: r1v0, types: [X.115p] */
                /* JADX WARN: Type inference failed for: r2v0, types: [X.10xM] */
                @Override // X.InterfaceC19414010xO
                public final C19413810xM LIZ(ViewGroup viewGroup) {
                    final Context context = viewGroup.getContext();
                    final ?? r1 = new C194448115q(context) { // from class: X.115p
                        public int LLILZLL = 45;

                        {
                            LIZLLL(0);
                        }

                        @Override // X.C194448115q
                        public final void LIZLLL(int i) {
                            int i2;
                            int i3;
                            int i4;
                            View view = this.LL;
                            int i5 = 0;
                            if (view != null) {
                                if (i == 0) {
                                    i4 = 0;
                                } else {
                                    i4 = 4;
                                }
                                C786410Ut5.LJLLLLLL(i4, view);
                            }
                            View view2 = this.LLILLJJLI;
                            int i6 = 8;
                            if (i == 1) {
                                i2 = 0;
                            } else {
                                i2 = 8;
                            }
                            C786410Ut5.LJLLLLLL(i2, view2);
                            View view3 = this.LLILZ;
                            if (i == 2) {
                                i3 = 0;
                            } else {
                                i3 = 8;
                            }
                            C786410Ut5.LJLLLLLL(i3, view3);
                            View view4 = this.LLILLL;
                            if (i == 3) {
                                i6 = 0;
                            }
                            C786410Ut5.LJLLLLLL(i6, view4);
                            if (i != 0) {
                                i5 = 45;
                            }
                            this.LLILZLL = i5;
                            requestLayout();
                        }

                        @Override // android.widget.FrameLayout, android.view.View
                        public final void onMeasure(int i, int i2) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) C12ES.LIZJ(this.LLILZLL, getContext()), 1073741824));
                        }

                        @Override // X.C194448115q
                        public final View LIZ(Context context2, AttributeSet attributeSet, int i) {
                            if (context2 == null) {
                                return null;
                            }
                            AppCompatTextView appCompatTextView = new AppCompatTextView(context2, attributeSet, i);
                            appCompatTextView.setTextSize(15.0f);
                            appCompatTextView.setTextColor(C960203pA.LIZ(R.attr.a1p, context2));
                            appCompatTextView.setGravity(17);
                            appCompatTextView.setText(2131836755);
                            C786410Ut5.T7(appCompatTextView, new ACListenerS163S0100000_29(this, 204));
                            return appCompatTextView;
                        }

                        @Override // X.C194448115q
                        public final View LIZIZ(Context context2, AttributeSet attributeSet, int i) {
                            if (context2 == null) {
                                return null;
                            }
                            AppCompatTextView appCompatTextView = new AppCompatTextView(context2, attributeSet, i);
                            appCompatTextView.setTextSize(15.0f);
                            appCompatTextView.setTextColor(C960203pA.LIZ(R.attr.a1p, context2));
                            appCompatTextView.setGravity(17);
                            appCompatTextView.setText(R.string.l6r);
                            C786410Ut5.T7(appCompatTextView, new ACListenerS163S0100000_29(this, 205));
                            return appCompatTextView;
                        }

                        @Override // X.C194448115q
                        public final View LIZJ(Context context2, AttributeSet attributeSet, int i) {
                            if (context2 == null) {
                                return null;
                            }
                            AppCompatTextView appCompatTextView = new AppCompatTextView(context2, attributeSet, i);
                            appCompatTextView.setTextSize(13.0f);
                            appCompatTextView.setTextColor(C960203pA.LIZ(R.attr.a1k, context2));
                            appCompatTextView.setGravity(17);
                            appCompatTextView.setText(2131836757);
                            ProgressBar progressBar = new ProgressBar(context2, attributeSet, i);
                            progressBar.setId(R.id.nn7);
                            progressBar.setIndeterminate(true);
                            progressBar.setIndeterminateDrawable(context2.getResources().getDrawable(R.drawable.ckw));
                            int iLIZJ = (int) C12ES.LIZJ(15.0f, context2);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iLIZJ, iLIZJ);
                            layoutParams.setMargins(0, 0, (int) C12ES.LIZJ(5.0f, context2), 0);
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(progressBar);
                            progressBar.setLayoutParams(layoutParams);
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-2, -2, 17));
                            linearLayout.setGravity(16);
                            linearLayout.addView(progressBar);
                            linearLayout.addView(appCompatTextView);
                            return linearLayout;
                        }

                        @Override // android.view.ViewGroup
                        public final void addView(View view, int i, int i2) {
                            int i3;
                            super.addView(view, i, i2);
                            View view2 = this.LL;
                            if (view2 == view) {
                                if (this.LLILZIL == 0) {
                                    i3 = 0;
                                } else {
                                    i3 = 4;
                                }
                                C786410Ut5.LJLLLLLL(i3, view2);
                            }
                        }
                    };
                    return new AbstractC19413910xN(r1) { // from class: X.10xM
                        public final C194447115p LL;

                        {
                            super(r1);
                            this.LL = r1;
                        }

                        @Override // X.AbstractC19413910xN
                        public final void I5(int i) {
                            setState(i);
                        }
                    };
                }
            });
        }
        "LoadMoreAdapter can't wrap itself.".toString();
        throw new IllegalArgumentException("LoadMoreAdapter can't wrap itself.");
    }
}
