package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* JADX INFO: renamed from: X.19We, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21552219We extends C21411218qk {
    public final C21553019Wm LLILZIL;
    public final AccessibilityManager LLILZLL;
    public final Rect LLIZ;

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.LLILZLL;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.LLILZIL.show();
        }
    }

    public final C21543419Su LIZ() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof C21543419Su) {
                return (C21543419Su) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        C21543419Su c21543419SuLIZ = LIZ();
        return (c21543419SuLIZ == null || !c21543419SuLIZ.LLJJLIIIJLLLLLLLZ) ? super.getHint() : c21543419SuLIZ.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21543419Su c21543419SuLIZ = LIZ();
        if (c21543419SuLIZ != null && c21543419SuLIZ.LLJJLIIIJLLLLLLLZ && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public final <T extends ListAdapter & Filterable> void LIZIZ(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.LLILZIL.LJIILJJIL(getAdapter());
    }

    public C21552219We(Context context, AttributeSet attributeSet) {
        super(C1369550lk9.LIZ(context, attributeSet, R.attr.b_j, 0), attributeSet, 0);
        this.LLIZ = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context2, attributeSet, R$styleable.MaterialAutoCompleteTextView, R.attr.b_j, R.style.a0l, new int[0]);
        if (typedArrayLIZLLL.hasValue(R$styleable.MaterialAutoCompleteTextView_android_inputType) && typedArrayLIZLLL.getInt(R$styleable.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.LLILZLL = (AccessibilityManager) C786410Ut5.H2(context2, "accessibility");
        C21553019Wm c21553019Wm = new C21553019Wm(context2, null, R.attr.c5a, 0);
        this.LLILZIL = c21553019Wm;
        c21553019Wm.LLJJJJJIL = true;
        c21553019Wm.LLJJJJLIIL.setFocusable(true);
        c21553019Wm.LLJJ = this;
        c21553019Wm.LLJJJJLIIL.setInputMethodMode(2);
        c21553019Wm.LJIILJJIL(getAdapter());
        c21553019Wm.LLJJI = new AdapterView.OnItemClickListener() { // from class: X.19Wf
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Object item;
                long selectedItemId = j;
                int selectedItemPosition = i;
                View view2 = view;
                View selectedView = null;
                if (selectedItemPosition < 0) {
                    C21553019Wm c21553019Wm2 = this.LL.LLILZIL;
                    if (!c21553019Wm2.isShowing()) {
                        item = null;
                    } else {
                        item = c21553019Wm2.LLILLL.getSelectedItem();
                    }
                } else {
                    item = this.LL.getAdapter().getItem(selectedItemPosition);
                }
                this.LL.LIZIZ(item);
                AdapterView.OnItemClickListener onItemClickListener = this.LL.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view2 == null || selectedItemPosition < 0) {
                        C21553019Wm c21553019Wm3 = this.LL.LLILZIL;
                        if (c21553019Wm3.isShowing()) {
                            selectedView = c21553019Wm3.LLILLL.getSelectedView();
                        }
                        view2 = selectedView;
                        C21553019Wm c21553019Wm4 = this.LL.LLILZIL;
                        if (!c21553019Wm4.isShowing()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = c21553019Wm4.LLILLL.getSelectedItemPosition();
                        }
                        C21553019Wm c21553019Wm5 = this.LL.LLILZIL;
                        if (!c21553019Wm5.isShowing()) {
                            selectedItemId = Long.MIN_VALUE;
                        } else {
                            selectedItemId = c21553019Wm5.LLILLL.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(this.LL.LLILZIL.LLILLL, view2, selectedItemPosition, selectedItemId);
                }
                this.LL.LLILZIL.dismiss();
            }
        };
        typedArrayLIZLLL.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int selectedItemPosition;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            C21543419Su c21543419SuLIZ = LIZ();
            int measuredWidth2 = 0;
            if (adapter != null && c21543419SuLIZ != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C21553019Wm c21553019Wm = this.LLILZIL;
                if (!c21553019Wm.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = c21553019Wm.LLILLL.getSelectedItemPosition();
                }
                int iMin = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, c21543419SuLIZ);
                    if (view.getLayoutParams() == null) {
                        C786410Ut5.W5(view, new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable drawableLJFF = this.LLILZIL.LJFF();
                if (drawableLJFF != null) {
                    drawableLJFF.getPadding(this.LLIZ);
                    Rect rect = this.LLIZ;
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = iMax + c21543419SuLIZ.getEndIconView().getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }
}
