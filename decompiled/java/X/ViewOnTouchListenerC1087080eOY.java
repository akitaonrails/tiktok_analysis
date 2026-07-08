package X;

import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.smoothhost.BottomTabManager;
import com.ss.android.ugc.aweme.live.smoothhost.PageSwitch;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eOY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ViewOnTouchListenerC1087080eOY extends FrameLayout implements View.OnTouchListener {
    public final int LL;
    public final LinearLayout LLILLJJLI;
    public final ArrayList<Integer> LLILLL;
    public int LLILZ;
    public Integer LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public Integer LLIZLLLIL;
    public final GestureDetector LLJ;
    public PageSwitch LLJI;

    private final Integer getCenterIndexAfterMoved() {
        View childAt;
        Integer num = this.LLILZIL;
        Object obj = null;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        Iterator it2 = C1697810uHb.LJIIJJI(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue - 1), Integer.valueOf(iIntValue + 1)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int iIntValue2 = ((Number) next).intValue();
            if (iIntValue2 >= 0 && iIntValue2 < this.LLILLJJLI.getChildCount() && (childAt = this.LLILLJJLI.getChildAt(iIntValue2)) != null) {
                float pivotX = this.LLILLJJLI.getPivotX();
                int[] iArr = new int[2];
                childAt.getLocationOnScreen(iArr);
                if (Math.abs(pivotX - new RectF(iArr[0], iArr[1], r1 + childAt.getWidth(), iArr[1] + childAt.getHeight()).centerX()) <= childAt.getMeasuredWidth() / 2) {
                    obj = next;
                    break;
                }
            }
        }
        return (Integer) obj;
    }

    public final void LIZIZ() {
        C1087090eOZ c1087090eOZ;
        Context context;
        Iterator<View> it2 = new C09RD(this.LLILLJJLI).iterator();
        int i = 0;
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                return;
            }
            Object next = c09re.next();
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            View view = (View) next;
            if ((view instanceof C1087090eOZ) && (c1087090eOZ = (C1087090eOZ) view) != null) {
                Integer num = this.LLILZIL;
                boolean z = num != null && i == num.intValue();
                if (!Intrinsics.LJFF(c1087090eOZ.LLILZIL, Boolean.valueOf(z))) {
                    TextView textView = c1087090eOZ.LLILLJJLI;
                    if (textView != null) {
                        textView.setSelected(z);
                        Integer num2 = z ? c1087090eOZ.LLILLL : c1087090eOZ.LLILZ;
                        if (num2 != null) {
                            textView.setTextColor(num2.intValue());
                        }
                    }
                    if (z && (context = c1087090eOZ.getContext()) != null) {
                        new C1351210lGZ(context).LIZIZ(40, 20);
                    }
                    c1087090eOZ.LLILZIL = Boolean.valueOf(z);
                }
            }
            i = i2;
        }
    }

    public final void setPageSwitch(PageSwitch pageSwitch) {
        this.LLJI = pageSwitch;
    }

    public ViewOnTouchListenerC1087080eOY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.LLILLJJLI = linearLayout;
        this.LLILLL = new ArrayList<>();
        this.LLJ = new GestureDetector(context, new GestureDetector.OnGestureListener() { // from class: X.0eM2
            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                Integer num = this.LL.LLIZLLLIL;
                if (num != null) {
                    ViewOnTouchListenerC1087080eOY.LIZ(this.LL, num.intValue());
                    this.LL.LLIZLLLIL = null;
                    return false;
                }
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                this.LL.LLILLJJLI.scrollBy((int) f, 0);
                this.LL.invalidate();
                return true;
            }
        });
        setOnTouchListener(this);
        this.LL = ViewConfiguration.get(context).getScaledTouchSlop();
        LinearLayout linearLayout2 = this.LLILLJJLI;
        linearLayout2.setId(View.generateViewId());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        C786410Ut5.d6(linearLayout2, new LinearLayout.LayoutParams(-1, -1));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, linearLayout2.getContext());
        if (numLIZJ != null) {
            linearLayout2.setBackgroundColor(numLIZJ.intValue());
        }
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        BottomTabManager.LIZ.getClass();
        List<C150Z> list = BottomTabManager.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C150Z c150z : (ArrayList) list) {
            C1087090eOZ c1087090eOZ = new C1087090eOZ(c150z, getContext());
            c1087090eOZ.setTag(c150z.LIZJ);
            arrayList.add(c1087090eOZ);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.LLILLJJLI.addView((View) it2.next());
        }
        BottomTabManager.LIZ.getClass();
        int i = BottomTabManager.LIZJ;
        this.LLILZ = i;
        this.LLILZIL = Integer.valueOf(i);
    }

    public static void LIZ(ViewOnTouchListenerC1087080eOY viewOnTouchListenerC1087080eOY, int i) {
        MutableLiveData<Integer> mutableLiveData;
        if (viewOnTouchListenerC1087080eOY.LLILZ != i) {
            viewOnTouchListenerC1087080eOY.LLILZ = i;
            viewOnTouchListenerC1087080eOY.LLILZIL = Integer.valueOf(i);
            HandlerHook.viewPost(viewOnTouchListenerC1087080eOY, new ARunnableS117S0100000_17(viewOnTouchListenerC1087080eOY, 242));
            PageSwitch pageSwitch = viewOnTouchListenerC1087080eOY.LLJI;
            if (pageSwitch != null && (mutableLiveData = pageSwitch.LL) != null) {
                mutableLiveData.setValue(Integer.valueOf(viewOnTouchListenerC1087080eOY.LLILZ));
            }
            viewOnTouchListenerC1087080eOY.LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015e  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1087080eOY.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MutableLiveData<Integer> mutableLiveData;
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLILLJJLI.getChildCount() != 0) {
            int childCount = this.LLILLJJLI.getChildCount();
            this.LLILLL.clear();
            if (getContext() != null && getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                int width = i3;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = this.LLILLJJLI.getChildAt(i5);
                    if (childAt != null) {
                        if (i5 == 0) {
                            int i6 = i3 - i;
                            width = (width - (i6 / 2)) + (childAt.getWidth() / 2) + ((this.LLILLJJLI.getRight() - this.LLILLJJLI.getLeft()) - i6);
                        }
                        this.LLILLL.add(Integer.valueOf(width - (childAt.getWidth() / 2)));
                        childAt.layout(width - childAt.getWidth(), childAt.getTop(), width, childAt.getBottom());
                        width -= childAt.getWidth();
                    }
                }
            } else {
                int width2 = i;
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt2 = this.LLILLJJLI.getChildAt(i7);
                    if (childAt2 != null) {
                        if (i7 == 0) {
                            width2 = (width2 + ((i3 - i) / 2)) - (childAt2.getWidth() / 2);
                        }
                        this.LLILLL.add(Integer.valueOf((childAt2.getWidth() / 2) + width2));
                        childAt2.layout(width2, childAt2.getTop(), childAt2.getWidth() + width2, childAt2.getBottom());
                        width2 += childAt2.getWidth();
                    }
                }
            }
            int iLIZIZ = C419990GdR.LIZIZ(this.LLILZ, 0, childCount - 1);
            this.LLILZ = iLIZIZ;
            this.LLILZIL = Integer.valueOf(iLIZIZ);
            try {
                this.LLILLJJLI.scrollTo(this.LLILLL.get(this.LLILZ).intValue() - this.LLILLL.get(0).intValue(), 0);
                PageSwitch pageSwitch = this.LLJI;
                if (pageSwitch != null && (mutableLiveData = pageSwitch.LL) != null) {
                    mutableLiveData.setValue(Integer.valueOf(this.LLILZ));
                }
                LIZIZ();
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sb = new StringBuilder();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("xPivots: ");
                sbLIZ.append(this.LLILLL.size());
                sbLIZ.append(", curIndex: ");
                sbLIZ.append(this.LLILZ);
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt3 = this.LLILLJJLI.getChildAt(i8);
                    sb.append("index ");
                    sb.append(i8);
                    sb.append(' ');
                    sb.append(childAt3.getClass());
                    sb.append(' ');
                    sb.append(childAt3.getTag());
                    sb.append('\n');
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Inconsistency detected. children are ");
                sbLIZ2.append((Object) sb);
                sbLIZ2.append(", trace: ");
                sbLIZ2.append(Log.getStackTraceString(e));
                C20441214yg.LJ("bottomTabGroup#dispatchLayout", C2188811AlT.LIZIZ(sbLIZ2));
                Map<String, Object> map = C1338270kvh.LIZ;
            }
        }
    }
}
