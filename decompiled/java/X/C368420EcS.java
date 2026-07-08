package X;

import Y.AComparatorS24S0000000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368420EcS extends FrameLayout {
    public static final int LLJI = C0FU0.LIZ(3.0f);
    public final List<C368690Ect> LL;
    public List<C350030Dnt> LLILLJJLI;
    public final SparseArray<List<C368690Ect>> LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final C01GW LLILZLL;
    public final int LLIZ;
    public Function1<? super String, Unit> LLIZLLLIL;
    public final List<C368690Ect> LLJ;

    public final List<C368690Ect> getDropList() {
        return this.LL;
    }

    public final Function1<String, Unit> getOnItemClickCallback() {
        return this.LLIZLLLIL;
    }

    public final void setOnItemClickCallback(Function1<? super String, Unit> function1) {
        this.LLIZLLLIL = function1;
    }

    public C368420EcS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList();
        this.LLILLJJLI = C13BV.INSTANCE;
        this.LLILLL = new SparseArray<>();
        this.LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1628));
        this.LLIZ = 12;
        this.LLIZLLLIL = AFwS234S0000000_5.get$arr$(566);
        this.LLJ = new ArrayList();
    }

    public final void LIZ(int i, int i2) {
        int i3;
        float f;
        float x;
        ((ArrayList) this.LLJ).clear();
        this.LLILZ = i;
        this.LLILZIL = i2;
        Iterator it2 = ((ArrayList) this.LL).iterator();
        while (true) {
            i3 = 0;
            if (!it2.hasNext()) {
                break;
            }
            C368690Ect c368690Ect = (C368690Ect) it2.next();
            C376310EpB c376310EpBLIZ = c368690Ect.LIZ();
            if (((Boolean) this.LLILZLL.getValue()).booleanValue()) {
                f = i2;
                x = (getMeasuredWidth() - c376310EpBLIZ.getX()) - c376310EpBLIZ.getMeasuredWidth();
            } else {
                f = i2;
                x = c376310EpBLIZ.getX();
            }
            float f2 = f + x;
            float endTime = (c368690Ect.LIZJ.getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * C360610EBv.LIZJ();
            if (((Boolean) this.LLILZLL.getValue()).booleanValue()) {
                if (f2 < (-i) + c368690Ect.LJIIIZ) {
                    C786410Ut5.Yc(c376310EpBLIZ, c376310EpBLIZ.getTranslationX() + i + f2);
                    if ((getMeasuredWidth() - c376310EpBLIZ.getX()) - c376310EpBLIZ.getMeasuredWidth() >= endTime) {
                        C786410Ut5.Yc(c376310EpBLIZ, ((getMeasuredWidth() - c376310EpBLIZ.getLeft()) - c376310EpBLIZ.getMeasuredWidth()) - endTime);
                        c368690Ect.LJIIIZ = 0;
                    } else {
                        ((ArrayList) this.LLJ).add(c368690Ect);
                    }
                } else if (c376310EpBLIZ.getTranslationX() != 0.0f) {
                    C786410Ut5.Yc(c376310EpBLIZ, c376310EpBLIZ.getTranslationX() + f2 + i);
                    if (c376310EpBLIZ.getTranslationX() > 0.0f) {
                        C786410Ut5.Yc(c376310EpBLIZ, 0.0f);
                        c368690Ect.LJIIIZ = 0;
                    } else {
                        ((ArrayList) this.LLJ).add(c368690Ect);
                    }
                }
            } else if (f2 < c368690Ect.LJIIIZ + i) {
                C786410Ut5.Yc(c376310EpBLIZ, c376310EpBLIZ.getTranslationX() + (i - f2));
                if (c376310EpBLIZ.getX() >= endTime) {
                    C786410Ut5.Yc(c376310EpBLIZ, endTime - c376310EpBLIZ.getLeft());
                    c368690Ect.LJIIIZ = 0;
                } else {
                    ((ArrayList) this.LLJ).add(c368690Ect);
                }
            } else if (c376310EpBLIZ.getTranslationX() != 0.0f) {
                C786410Ut5.Yc(c376310EpBLIZ, c376310EpBLIZ.getTranslationX() - (f2 - i));
                if (c376310EpBLIZ.getTranslationX() < 0.0f) {
                    C786410Ut5.Yc(c376310EpBLIZ, 0.0f);
                    c368690Ect.LJIIIZ = 0;
                } else {
                    ((ArrayList) this.LLJ).add(c368690Ect);
                }
            }
        }
        ArrayList arrayList = (ArrayList) this.LLJ;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(46));
        }
        for (Object obj : (ArrayList) this.LLJ) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C368690Ect c368690Ect2 = (C368690Ect) obj;
                c368690Ect2.LJIIIZ = LLJI * i3;
                C376310EpB c376310EpBLIZ2 = c368690Ect2.LIZ();
                C786410Ut5.Yc(c376310EpBLIZ2, c376310EpBLIZ2.getTranslationX() + c368690Ect2.LJIIIZ);
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLIZJ;
        int size;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            iLIZJ = View.MeasureSpec.getSize(i);
        } else {
            Iterator it2 = ((ArrayList) this.LL).iterator();
            long jMax = 0;
            while (it2.hasNext()) {
                jMax = Math.max(jMax, ((C368690Ect) it2.next()).LIZJ.getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
            iLIZJ = (int) ((jMax * C360610EBv.LIZJ()) + C368690Ect.LJIIJ);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            size = View.MeasureSpec.getSize(i2);
        } else {
            size = C368690Ect.LJIIJJI;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
        }
        setMeasuredDimension(iLIZJ, size);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int size = this.LLILLL.size();
        for (int i5 = 0; i5 < size; i5++) {
            int iKeyAt = this.LLILLL.keyAt(i5);
            List<C368690Ect> list = this.LLILLL.get(iKeyAt);
            if (list != null) {
                if (list.size() > 1) {
                    C08XD.LJJ(list, new AComparatorS24S0000000_5(45));
                }
                int i6 = 0;
                for (C368690Ect c368690Ect : list) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        C376310EpB c376310EpBLIZ = c368690Ect.LIZ();
                        int i8 = LLJI * i6;
                        float fLIZJ = iKeyAt * C360610EBv.LIZJ();
                        if (((Boolean) this.LLILZLL.getValue()).booleanValue()) {
                            float measuredWidth = ((View) getParent()).getMeasuredWidth() - (i8 + fLIZJ);
                            c376310EpBLIZ.layout((int) (measuredWidth - c376310EpBLIZ.getMeasuredWidth()), 0, (int) measuredWidth, c376310EpBLIZ.getMeasuredHeight());
                        } else {
                            float f = i8 + fLIZJ;
                            c376310EpBLIZ.layout((int) f, 0, (int) (f + c376310EpBLIZ.getMeasuredWidth()), c376310EpBLIZ.getMeasuredHeight());
                        }
                        i6 = i7;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        LIZ(this.LLILZ, this.LLILZIL);
    }
}
