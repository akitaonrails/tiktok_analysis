package com.bytedance.android.live.common.keyboard;

import X.C14JX;
import X.C19323210ik;
import X.C2084308En;
import X.C2372909Rn;
import X.InterfaceC19323110ij;
import X.InterfaceC19323310il;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes29.dex */
public class MeasureLinearLayout extends LinearLayout {
    public static final /* synthetic */ int LLJI = 0;
    public C2372909Rn LL;
    public InterfaceC19323110ij LLILLJJLI;
    public final int LLILLL;
    public boolean LLILZ;
    public ValueAnimator LLILZIL;
    public boolean LLILZLL;
    public Rect LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;

    public void setKeyboardAnimatorObserver(InterfaceC19323310il interfaceC19323310il) {
    }

    public C2372909Rn getKeyBoardObservable() {
        return this.LL;
    }

    @Override // android.view.View
    public final void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        if (this.LLJ) {
            super.restoreHierarchyState(sparseArray);
        }
    }

    @Override // android.view.View
    public final void saveHierarchyState(SparseArray<Parcelable> sparseArray) {
        if (this.LLIZLLLIL) {
            super.saveHierarchyState(sparseArray);
        }
    }

    public void setCanSaveState(boolean z) {
        this.LLIZLLLIL = z;
    }

    public void setWindowInsetsEnable(boolean z) {
        this.LLILZLL = z;
        if (z) {
            setFitsSystemWindows(false);
            C19323210ik c19323210ik = new C19323210ik(this);
            C14JX.LIZIZ(this, c19323210ik);
            C14JX.LIZJ(this, c19323210ik);
        }
    }

    public void setWindowInsetsKeyboardObserver(InterfaceC19323110ij interfaceC19323110ij) {
        this.LLILLJJLI = interfaceC19323110ij;
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZ = new Rect();
        this.LLIZLLLIL = true;
        this.LLJ = true;
        this.LL = new C2372909Rn();
        this.LLILLL = C2084308En.LIZ(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.LLILZLL) {
            this.LL.LIZIZ(i2, getContext());
        }
        try {
            super.onMeasure(i, i2);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
