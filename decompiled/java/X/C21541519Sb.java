package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19Sb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21541519Sb extends C426000Gn8 {
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final C21541719Sd LLJ;
    public final ViewGroupOnHierarchyChangeListenerC21541619Sc LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof C19SE) {
                i++;
            }
        }
        return i;
    }

    public void setOnCheckedChangeListener(InterfaceC21541919Sf interfaceC21541919Sf) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C21541819Se();
    }

    public int getCheckedChipId() {
        if (this.LLIZ) {
            return this.LLJIJIL;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof C19SE) && ((CompoundButton) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.LLIZ) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.LLJIJIL;
        if (i != -1) {
            LIZIZ(i, true);
            setCheckedId(this.LLJIJIL);
        }
    }

    @Override // X.C426000Gn8
    public final boolean LIZ() {
        return this.LLILLL;
    }

    public int getChipSpacingHorizontal() {
        return this.LLILZIL;
    }

    public int getChipSpacingVertical() {
        return this.LLILZLL;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof C21541819Se)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C21541819Se(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int chipCount;
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        if (this.LLILLL) {
            chipCount = getChipCount();
        } else {
            chipCount = -1;
        }
        int rowCount = getRowCount();
        if (this.LLIZ) {
            i = 1;
        } else {
            i = 2;
        }
        accessibilityNodeInfoCompatWrap.setCollectionInfo(C20093113jd.LIZIZ(rowCount, chipCount, i, false));
    }

    public void setCheckedId(int i) {
        this.LLJIJIL = i;
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.LLILZIL != i) {
            this.LLILZIL = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.LLILZLL != i) {
            this.LLILZLL = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.LLJI.LL = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.LLIZLLLIL = z;
    }

    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.LLIZ != z) {
            this.LLIZ = z;
            this.LLJILJIL = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof C19SE) {
                    ((C19SE) childAt).setChecked(false);
                }
            }
            this.LLJILJIL = false;
            setCheckedId(-1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C21541819Se(layoutParams);
    }

    @Override // X.C426000Gn8
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19Sd] */
    public C21541519Sb(Context context, AttributeSet attributeSet) {
        super(C1369550lk9.LIZ(context, attributeSet, R.attr.bg_, R.style.a4o), attributeSet, R.attr.bg_);
        this.LLJ = new CompoundButton.OnCheckedChangeListener() { // from class: X.19Sd
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C21541519Sb c21541519Sb = this.LL;
                if (c21541519Sb.LLJILJIL) {
                    return;
                }
                if (c21541519Sb.getCheckedChipIds().isEmpty()) {
                    C21541519Sb c21541519Sb2 = this.LL;
                    if (c21541519Sb2.LLIZLLLIL) {
                        c21541519Sb2.LIZIZ(compoundButton.getId(), true);
                        this.LL.LLJIJIL = compoundButton.getId();
                        return;
                    }
                }
                int id = compoundButton.getId();
                if (z) {
                    C21541519Sb c21541519Sb3 = this.LL;
                    int i = c21541519Sb3.LLJIJIL;
                    if (i != -1 && i != id && c21541519Sb3.LLIZ) {
                        c21541519Sb3.LIZIZ(i, false);
                    }
                    this.LL.setCheckedId(id);
                    return;
                }
                C21541519Sb c21541519Sb4 = this.LL;
                if (c21541519Sb4.LLJIJIL != id) {
                    return;
                }
                c21541519Sb4.setCheckedId(-1);
            }
        };
        ViewGroupOnHierarchyChangeListenerC21541619Sc viewGroupOnHierarchyChangeListenerC21541619Sc = new ViewGroupOnHierarchyChangeListenerC21541619Sc(this);
        this.LLJI = viewGroupOnHierarchyChangeListenerC21541619Sc;
        this.LLJIJIL = -1;
        this.LLJILJIL = false;
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(getContext(), attributeSet, R$styleable.ChipGroup, R.attr.bg_, R.style.a4o, new int[0]);
        int dimensionPixelOffset = typedArrayLIZLLL.getDimensionPixelOffset(R$styleable.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayLIZLLL.getDimensionPixelOffset(R$styleable.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayLIZLLL.getDimensionPixelOffset(R$styleable.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayLIZLLL.getBoolean(R$styleable.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayLIZLLL.getBoolean(R$styleable.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayLIZLLL.getBoolean(R$styleable.ChipGroup_selectionRequired, false));
        int resourceId = typedArrayLIZLLL.getResourceId(R$styleable.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.LLJIJIL = resourceId;
        }
        typedArrayLIZLLL.recycle();
        super.setOnHierarchyChangeListener(viewGroupOnHierarchyChangeListenerC21541619Sc);
        setImportantForAccessibility(1);
    }

    public final void LIZIZ(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof C19SE) {
            this.LLJILJIL = true;
            ((C19SE) viewFindViewById).setChecked(z);
            this.LLJILJIL = false;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof C19SE) {
            CompoundButton compoundButton = (CompoundButton) view;
            if (compoundButton.isChecked()) {
                int i2 = this.LLJIJIL;
                if (i2 != -1 && this.LLIZ) {
                    LIZIZ(i2, false);
                }
                setCheckedId(compoundButton.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }
}
