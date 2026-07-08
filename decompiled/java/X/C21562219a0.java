package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import u4.q0;

/* JADX INFO: renamed from: X.19a0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21562219a0 extends GridView {
    public final Calendar LL;
    public final boolean LLILLJJLI;

    @Override // android.widget.GridView, android.widget.AdapterView
    public C21562319a1 getAdapter() {
        return (C21562319a1) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iLIZIZ;
        int width;
        int iLIZIZ2;
        int width2;
        int i;
        int width3;
        super.onDraw(canvas);
        C21562319a1 adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.LLILLJJLI;
        C19PE c19pe = adapter.LLILZ;
        Long item = adapter.getItem(adapter.LIZIZ());
        Long item2 = adapter.getItem(adapter.LIZLLL());
        for (C0WIY<Long, Long> c0wiy : dateSelector.aq()) {
            Long l = c0wiy.LIZ;
            if (l != null && c0wiy.LIZIZ != null) {
                long jLongValue = l.longValue();
                long jLongValue2 = c0wiy.LIZIZ.longValue();
                Long lValueOf = Long.valueOf(jLongValue);
                Long lValueOf2 = Long.valueOf(jLongValue2);
                if (item != null && item2 != null && lValueOf != null && lValueOf2 != null && lValueOf.longValue() <= item2.longValue() && lValueOf2.longValue() >= item.longValue()) {
                    boolean zLIZJ = C21551419Vw.LIZJ(this);
                    if (jLongValue < item.longValue()) {
                        iLIZIZ = adapter.LIZIZ();
                        if (iLIZIZ % adapter.LL.LLILLL == 0) {
                            width = 0;
                        } else if (!zLIZJ) {
                            width = getChildAt(iLIZIZ - 1).getRight();
                        } else {
                            width = getChildAt(iLIZIZ - 1).getLeft();
                        }
                    } else {
                        this.LL.setTimeInMillis(jLongValue);
                        iLIZIZ = (this.LL.get(5) - 1) + adapter.LIZIZ();
                        View childAt = getChildAt(iLIZIZ);
                        width = (childAt.getWidth() / 2) + childAt.getLeft();
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iLIZIZ2 = Math.min(adapter.LIZLLL(), getChildCount() - 1);
                        if ((iLIZIZ2 + 1) % adapter.LL.LLILLL == 0) {
                            width2 = getWidth();
                        } else if (!zLIZJ) {
                            width2 = getChildAt(iLIZIZ2).getRight();
                        } else {
                            width2 = getChildAt(iLIZIZ2).getLeft();
                        }
                    } else {
                        this.LL.setTimeInMillis(jLongValue2);
                        iLIZIZ2 = (this.LL.get(5) - 1) + adapter.LIZIZ();
                        View childAt2 = getChildAt(iLIZIZ2);
                        width2 = (childAt2.getWidth() / 2) + childAt2.getLeft();
                    }
                    int itemId = (int) adapter.getItemId(iLIZIZ2);
                    for (int itemId2 = (int) adapter.getItemId(iLIZIZ); itemId2 <= itemId; itemId2++) {
                        int numColumns = getNumColumns() * itemId2;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View childAt3 = getChildAt(numColumns);
                        int top = childAt3.getTop() + c19pe.LIZ.LIZ.top;
                        int bottom = childAt3.getBottom() - c19pe.LIZ.LIZ.bottom;
                        if (!zLIZJ) {
                            if (numColumns > iLIZIZ) {
                                i = 0;
                            } else {
                                i = width;
                            }
                            if (iLIZIZ2 > numColumns2) {
                                width3 = getWidth();
                            } else {
                                width3 = width2;
                            }
                        } else {
                            if (iLIZIZ2 > numColumns2) {
                                i = 0;
                            } else {
                                i = width2;
                            }
                            if (numColumns > iLIZIZ) {
                                width3 = getWidth();
                            } else {
                                width3 = width;
                            }
                        }
                        canvas.drawRect(i, top, width3, bottom, c19pe.LJII);
                    }
                }
            }
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C21562319a1) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(C786410Ut5.j4("%1$s must have its Adapter set to a %2$s", new Object[]{C21562219a0.class.getCanonicalName(), C21562319a1.class.getCanonicalName()}));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().LIZIZ()) {
            super.setSelection(getAdapter().LIZIZ());
        } else {
            super.setSelection(i);
        }
    }

    public C21562219a0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C21565019aS.LJIIIIZZ(null);
        if (MaterialDatePicker.NR(getContext())) {
            setNextFocusLeftId(R.id.db1);
            setNextFocusRightId(R.id.eoq);
        }
        this.LLILLJJLI = MaterialDatePicker.OR(R.attr.f62, getContext());
        q0.LJIJ(this, new C20094213jo() { // from class: X.13ko
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo(null);
            }
        });
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().LIZIZ()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().LIZIZ());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LLILLJJLI) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            if (i == 33) {
                setSelection(getAdapter().LIZLLL());
                return;
            } else if (i == 130) {
                setSelection(getAdapter().LIZIZ());
                return;
            } else {
                super.onFocusChanged(true, i, rect);
                return;
            }
        }
        super.onFocusChanged(false, i, rect);
    }
}
