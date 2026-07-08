package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1318540kPs extends FrameLayout {
    public int LL;
    public UIComponent LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public InterfaceC1318560kPu LLIZLLLIL;
    public int LLJ;

    public InterfaceC1318560kPu getMeasureListener() {
        return this.LLIZLLLIL;
    }

    public UIComponent getUIComponent() {
        return this.LLILLJJLI;
    }

    public C1318540kPs(Context context) {
        super(context);
        this.LLILZ = 400;
        this.LLILZIL = -1;
    }

    public void setComponentInitMeasure(boolean z) {
        this.LLILZLL = z;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        this.LLJ = i;
    }

    public void setMeasureListener(InterfaceC1318560kPu interfaceC1318560kPu) {
        this.LLIZLLLIL = interfaceC1318560kPu;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        HashMap<String, Integer> map;
        UIComponent uIComponent;
        T t;
        if (this.LL == 0) {
            measuredWidth = this.LLILZIL;
            if (measuredWidth <= 0) {
                measuredWidth = View.MeasureSpec.getSize(i);
            }
            measuredHeight = this.LLILZ;
            if (this.LLILZLL && (uIComponent = this.LLILLJJLI) != null && (t = uIComponent.mView) != 0 && t.isLayoutRequested()) {
                this.LLILLJJLI.measureChildren();
            }
        } else {
            UIComponent uIComponent2 = this.LLILLJJLI;
            if (uIComponent2 != null) {
                uIComponent2.measure();
                if (2 == this.LL) {
                    this.LL = 3;
                }
                int width = this.LLILLJJLI.getWidth();
                UIComponent uIComponent3 = this.LLILLJJLI;
                measuredWidth = width + uIComponent3.mMarginLeft + uIComponent3.mMarginRight;
                int height = uIComponent3.getHeight();
                UIComponent uIComponent4 = this.LLILLJJLI;
                measuredHeight = height + uIComponent4.mMarginTop + uIComponent4.mMarginBottom + this.LLIZ;
                InterfaceC1318560kPu interfaceC1318560kPu = this.LLIZLLLIL;
                if (interfaceC1318560kPu != null) {
                    String str = uIComponent4.LLILLJJLI;
                    C1318550kPt c1318550kPt = (C1318550kPt) interfaceC1318560kPu;
                    c1318550kPt.getClass();
                    if (!TextUtils.isEmpty(str) && (map = c1318550kPt.LIZ.LLJJJ) != null && map.containsKey(str)) {
                        for (int i3 = 0; i3 < c1318550kPt.LIZ.LLJL.size(); i3++) {
                            int iIntValue = c1318550kPt.LIZ.LLJJJ.get(str).intValue();
                            if (ListProtector.get(c1318550kPt.LIZ.LLJL, i3) != null && ((HashMap) ListProtector.get(c1318550kPt.LIZ.LLJL, i3)).containsKey(Integer.valueOf(iIntValue))) {
                                ((HashMap) ListProtector.get(c1318550kPt.LIZ.LLJL, i3)).put(Integer.valueOf(iIntValue), Integer.valueOf(measuredHeight));
                            }
                        }
                    }
                }
            } else {
                measuredWidth = getMeasuredWidth();
                measuredHeight = getMeasuredHeight();
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        int i4 = UIList.LLLL;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = UIList.LLLL;
        UIComponent uIComponent = this.LLILLJJLI;
        if (uIComponent != null) {
            uIComponent.setTop(0);
            this.LLILLJJLI.setLeft(0);
            this.LLILLJJLI.layout();
            UIComponent uIComponent2 = this.LLILLJJLI;
            int i7 = uIComponent2.mMarginLeft;
            int i8 = uIComponent2.mMarginTop;
            int width = uIComponent2.getWidth();
            int height = this.LLILLJJLI.getHeight();
            if (this.LLJ == 1) {
                i5 = (i3 - i) - width;
            } else {
                i5 = 0;
            }
            ((ViewGroup) this.LLILLJJLI.mView).layout(i7 + i5, i8, i7 + width + i5, height + i8);
            if (this.LLILLJJLI.getOverflow() != 0 && getParent() != null) {
                ((ViewGroup) getParent()).setClipChildren(false);
            }
            Rect clipBounds = this.LLILLJJLI.mView.getClipBounds();
            if (clipBounds != null) {
                clipBounds.set(Math.min(clipBounds.left, i), Math.min(clipBounds.top, i2), Math.max(clipBounds.right, i3), Math.max(clipBounds.bottom, i4));
                setClipBounds(clipBounds);
            }
        }
    }
}
