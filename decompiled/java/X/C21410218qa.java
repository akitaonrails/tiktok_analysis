package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.w;
import androidx.appcompat.widget.y;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18qa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21410218qa extends Button implements InterfaceC20745616Fy, InterfaceC21412618qy {
    public C21402418pK mAppCompatEmojiTextHelper;
    public final C21411318ql mBackgroundTintHelper;
    public final w mTextHelper;

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() throws Exception {
        androidx_appcompat_widget_AppCompatButton_com_ss_android_ugc_aweme_tux_business_lancet_SupportLibraryLancet_drawableStateChanged(this);
    }

    private C21402418pK getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C21402418pK(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, X.InterfaceC20745616Fy
    public int getAutoSizeMaxTextSize() {
        if (C14KV.LIZJ) {
            return super.getAutoSizeMaxTextSize();
        }
        w wVar = this.mTextHelper;
        if (wVar != null) {
            return Math.round(wVar.LJIIIIZZ.LJ);
        }
        return -1;
    }

    @Override // android.widget.TextView, X.InterfaceC20745616Fy
    public int getAutoSizeMinTextSize() {
        if (C14KV.LIZJ) {
            return super.getAutoSizeMinTextSize();
        }
        w wVar = this.mTextHelper;
        if (wVar != null) {
            return Math.round(wVar.LJIIIIZZ.LIZLLL);
        }
        return -1;
    }

    @Override // android.widget.TextView, X.InterfaceC20745616Fy
    public int getAutoSizeStepGranularity() {
        if (C14KV.LIZJ) {
            return super.getAutoSizeStepGranularity();
        }
        w wVar = this.mTextHelper;
        if (wVar != null) {
            return Math.round(wVar.LJIIIIZZ.LIZJ);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C14KV.LIZJ) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w wVar = this.mTextHelper;
        return wVar != null ? wVar.LJIIIIZZ.LJFF : new int[0];
    }

    @Override // android.widget.TextView, X.InterfaceC20745616Fy
    public int getAutoSizeTextType() {
        if (C14KV.LIZJ) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        w wVar = this.mTextHelper;
        if (wVar != null) {
            return wVar.LJIIIIZZ.LIZ;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C21411318ql c21411318ql = this.mBackgroundTintHelper;
        if (c21411318ql != null) {
            return c21411318ql.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C21411318ql c21411318ql = this.mBackgroundTintHelper;
        if (c21411318ql != null) {
            return c21411318ql.LIZJ();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.LIZLLL();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.LJ();
    }

    public void androidx_appcompat_widget_AppCompatButton__drawableStateChanged$___twin___() {
        super.drawableStateChanged();
        C21411318ql c21411318ql = this.mBackgroundTintHelper;
        if (c21411318ql != null) {
            c21411318ql.LIZ();
        }
        w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.LIZIZ();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C21382118m3.LJIIIIZZ(super.getCustomSelectionActionModeCallback());
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().LIZIZ.LIZ.LIZIZ();
    }

    public C21410218qa(Context context) {
        this(context, null);
    }

    public static void androidx_appcompat_widget_AppCompatButton_com_ss_android_ugc_aweme_tux_business_lancet_SupportLibraryLancet_drawableStateChanged(C21410218qa c21410218qa) throws Exception {
        String name;
        try {
            c21410218qa.androidx_appcompat_widget_AppCompatButton__drawableStateChanged$___twin___();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!C2213981Bky.LIZIZ.LIZLLL()) {
                try {
                    CrashlyticsWrapperService.LIZLLL().logException(e);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("targetViewId", c21410218qa.getId());
                    jSONObject.put("targetViewClassName", c21410218qa.getClass().getName());
                    ViewParent parent = c21410218qa.getParent();
                    if (parent instanceof ViewGroup) {
                        jSONObject.put("targetParentViewId", ((ViewGroup) parent).getId());
                        jSONObject.put("targetParentViewClassName", ((ViewGroup) parent).getClass().getName());
                    }
                    Activity currentActivity = C2213981Bky.LIZIZ.getCurrentActivity();
                    if (currentActivity != null) {
                        name = currentActivity.getClass().getName();
                    } else {
                        name = "";
                    }
                    jSONObject.put("currentActivity", name);
                    jSONObject.put("errorMsg", Log.getStackTraceString(e));
                    C793770VBv.LJII("detail_view_animation_crash", null, null, jSONObject);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
            throw e;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().LIZJ(z);
    }

    @Override // android.widget.TextView, X.InterfaceC20745616Fy
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C14KV.LIZJ) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        w wVar = this.mTextHelper;
        if (wVar == null) {
            return;
        }
        wVar.LJIIIZ(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C21411318ql c21411318ql = this.mBackgroundTintHelper;
        if (c21411318ql != null) {
            c21411318ql.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C21411318ql c21411318ql = this.mBackgroundTintHelper;
        if (c21411318ql != null) {
            c21411318ql.LJFF(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C21382118m3.LJIIIZ(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().LIZLLL(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().LIZ(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.LIZ.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C21411318ql c21411318ql = this.mBackgroundTintHelper;
        if (c21411318ql != null) {
            c21411318ql.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C21411318ql c21411318ql = this.mBackgroundTintHelper;
        if (c21411318ql != null) {
            c21411318ql.LJIIIIZZ(mode);
        }
    }

    @Override // X.InterfaceC21412618qy
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.LJIIJ(colorStateList);
        this.mTextHelper.LIZIZ();
    }

    @Override // X.InterfaceC21412618qy
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.LJIIJJI(mode);
        this.mTextHelper.LIZIZ();
    }

    public C21410218qa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.beb);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C14KV.LIZJ) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        w wVar = this.mTextHelper;
        if (wVar == null) {
            return;
        }
        wVar.LJIIIIZZ(iArr, i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w wVar = this.mTextHelper;
        if (wVar != null) {
            wVar.LJI(i, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (C14KV.LIZJ) {
            super.setTextSize(i, f);
            return;
        }
        w wVar = this.mTextHelper;
        if (wVar == null) {
            return;
        }
        y yVar = wVar.LJIIIIZZ;
        if (yVar.LJIIIIZZ() && yVar.LIZ != 0) {
            return;
        }
        wVar.LJIIIIZZ.LJFF(f, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21410218qa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t0.LIZ(context);
        C786410Ut5.t3(getContext());
        C21411318ql c21411318ql = new C21411318ql(this);
        this.mBackgroundTintHelper = c21411318ql;
        c21411318ql.LIZLLL(attributeSet, i);
        w wVar = new w(this);
        this.mTextHelper = wVar;
        this.mTextHelper.LJFF(attributeSet, i);
        wVar.LIZIZ();
        getEmojiTextViewHelper().LIZIZ(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        w wVar = this.mTextHelper;
        if (wVar != null && !C14KV.LIZJ) {
            y yVar = wVar.LJIIIIZZ;
            if (yVar.LJIIIIZZ() && yVar.LIZ != 0) {
                this.mTextHelper.LJIIIIZZ.LIZ();
            }
        }
    }

    @Override // android.widget.TextView, X.InterfaceC20745616Fy
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C14KV.LIZJ) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        w wVar = this.mTextHelper;
        if (wVar == null) {
            return;
        }
        wVar.LJII(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        w wVar = this.mTextHelper;
        if (wVar != null && !C14KV.LIZJ) {
            wVar.LJIIIIZZ.LIZ();
        }
    }
}
