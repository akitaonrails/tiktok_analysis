package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import g1c.AjS61S0100000_3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424730Gl5 extends LinearLayout {
    public static final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public int LL;
    public Function1<? super Integer, Unit> LLILLJJLI;
    public final List<Integer> LLILLL;

    public final Function1<Integer, Unit> getClickStrategy() {
        return this.LLILLJJLI;
    }

    public final void setClickStrategy(Function1<? super Integer, Unit> function1) {
        this.LLILLJJLI = function1;
    }

    public final void setCurIndex(int i) {
        if (this.LL != i) {
            this.LL = i;
            int i2 = 0;
            for (Object obj : new C2500209qy(this, 7)) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    View view = (View) obj;
                    if (view instanceof C424740Gl6) {
                        boolean z = C04J1.LIZ;
                        boolean z2 = true;
                        if (C04J1.LIZ) {
                            C424740Gl6 c424740Gl6 = (C424740Gl6) view;
                            if (i2 / 2 != i) {
                                z2 = false;
                            }
                            c424740Gl6.setIsSelected(z2);
                        } else {
                            C424740Gl6 c424740Gl62 = (C424740Gl6) view;
                            if (i2 != i) {
                                z2 = false;
                            }
                            c424740Gl62.setIsSelected(z2);
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public void setTabPosition(int i) {
        int iLJIIJ = C1697810uHb.LJIIJ(this.LLILLL);
        while (true) {
            if (-1 < iLJIIJ) {
                if (i >= ((Number) ListProtector.get(this.LLILLL, iLJIIJ)).intValue()) {
                    break;
                } else {
                    iLJIIJ--;
                }
            } else {
                iLJIIJ = 0;
                break;
            }
        }
        setCurIndex(iLJIIJ);
    }

    public final void setTabPositionList(List<Integer> list) {
        if (list == null) {
            return;
        }
        ((ArrayList) this.LLILLL).clear();
        ((ArrayList) this.LLILLL).addAll(list);
    }

    public final void setTitles(List<String> list) {
        boolean z;
        Integer numLIZJ;
        if (list == null) {
            return;
        }
        if (getChildCount() > 0) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
            removeAllViews();
        }
        int i = 0;
        for (String str : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C424740Gl6 c424740Gl6 = new C424740Gl6(getContext());
                c424740Gl6.setTitle(str);
                if (i == this.LL) {
                    z = true;
                } else {
                    z = false;
                }
                c424740Gl6.setIsSelected(z);
                c424740Gl6.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76)));
                C786410Ut5.I7(new AjS61S0100000_3(this, 1), c424740Gl6);
                if (C04J1.LIZ) {
                    View view = new View(getContext());
                    Context context = getContext();
                    if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zj, context)) != null) {
                        view.setBackgroundColor(numLIZJ.intValue());
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                    layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    if (i != 0) {
                        addView(view, layoutParams);
                    }
                }
                addView(c424740Gl6, new LinearLayout.LayoutParams(-2, -1));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public void setVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, this);
    }

    public C424730Gl5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = new ArrayList();
        setBackgroundResource(R.drawable.b28);
        int i = LLILZ;
        setPadding(i, i, i, i);
    }
}
