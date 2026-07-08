package X;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import u4.q0;

/* JADX INFO: renamed from: X.18r2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21413018r2 {
    public final Object[] mConstructorArgs = new Object[2];
    public static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    public static final int[] sOnClickAttrs = {R.attr.onClick};
    public static final int[] sAccessibilityHeading = {R.attr.accessibilityHeading};
    public static final int[] sAccessibilityPaneTitle = {R.attr.accessibilityPaneTitle};
    public static final int[] sScreenReaderFocusable = {R.attr.screenReaderFocusable};
    public static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    public static final C830530Wi3<String, Constructor<? extends View>> sConstructorMap = new C830530Wi3<>();

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    private void checkOnClickListener(final View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            final String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, 0);
            if (strXd != null) {
                C786410Ut5.I7(new View.OnClickListener(view, strXd) { // from class: X.08tS
                    public final View LL;
                    public final String LLILLJJLI;
                    public Method LLILLL;
                    public Context LLILZ;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String strLIZIZ;
                        Method method;
                        if (this.LLILLL == null) {
                            for (Context context2 = this.LL.getContext(); context2 != null; context2 = ((ContextWrapper) context2).getBaseContext()) {
                                try {
                                    if (!context2.isRestricted() && (method = context2.getClass().getMethod(this.LLILLJJLI, View.class)) != null) {
                                        this.LLILLL = method;
                                        this.LLILZ = context2;
                                    }
                                } catch (NoSuchMethodException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                if (!(context2 instanceof ContextWrapper)) {
                                    break;
                                }
                            }
                            int id = this.LL.getId();
                            if (id == -1) {
                                strLIZIZ = "";
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(" with id '");
                                sbLIZ.append(this.LL.getContext().getResources().getResourceEntryName(id));
                                sbLIZ.append("'");
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Could not find method ");
                            sbLIZ2.append(this.LLILLJJLI);
                            sbLIZ2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                            sbLIZ2.append(this.LL.getClass());
                            sbLIZ2.append(strLIZIZ);
                            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        try {
                            this.LLILLL.invoke(this.LLILZ, view2);
                        } catch (IllegalAccessException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
                        } catch (InvocationTargetException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw new IllegalStateException("Could not execute method for android:onClick", e3);
                        }
                    }

                    {
                        this.LL = view;
                        this.LLILLJJLI = strXd;
                    }
                }, view);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void verifyNotNull(View view, String str) {
        if (view != null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getName());
        sbLIZ.append(" asked to inflate view for <");
        sbLIZ.append(str);
        sbLIZ.append(">, but returned null");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C21411218qk createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C21411218qk(context, attributeSet);
    }

    public C21410218qa createButton(Context context, AttributeSet attributeSet) {
        return new C21410218qa(context, attributeSet);
    }

    public C21412118qt createCheckBox(Context context, AttributeSet attributeSet) {
        return new C21412118qt(context, attributeSet);
    }

    public C21411418qm createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C21411418qm(context, attributeSet);
    }

    public C21410318qb createEditText(Context context, AttributeSet attributeSet) {
        return new C21410318qb(context, attributeSet);
    }

    public C21413718r9 createImageButton(Context context, AttributeSet attributeSet) {
        return new C21413718r9(context, attributeSet);
    }

    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    public C21411118qj createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C21411118qj(context, attributeSet);
    }

    public C21412018qs createRadioButton(Context context, AttributeSet attributeSet) {
        return new C21412018qs(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.18rA] */
    public C21413818rA createRatingBar(final Context context, final AttributeSet attributeSet) {
        return new RatingBar(context, attributeSet) { // from class: X.18rA
            public final C19SG LL;

            {
                C786410Ut5.t3(getContext());
                C19SG c19sg = new C19SG(this);
                this.LL = c19sg;
                c19sg.LIZ(attributeSet, com.zhiliaoapp.musically.R.attr.fdr);
            }

            @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
            public final synchronized void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                Bitmap bitmap = this.LL.LIZIZ;
                if (bitmap != null) {
                    setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
                }
            }
        };
    }

    public C21413918rB createSeekBar(Context context, AttributeSet attributeSet) {
        return new C21413918rB(context, attributeSet);
    }

    public C21553719Wt createSpinner(Context context, AttributeSet attributeSet) {
        return new C21553719Wt(context, attributeSet);
    }

    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public C21410418qc createToggleButton(Context context, AttributeSet attributeSet) {
        return new C21410418qc(context, attributeSet);
    }

    private void backportAccessibilityAttributes(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            q0.LJIJI(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            q0.LJIJJ(view, C786410Ut5.Xd(typedArrayObtainStyledAttributes2, 0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            q0.LJJI(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String strLIZIZ;
        C830530Wi3<String, Constructor<? extends View>> c830530Wi3 = sConstructorMap;
        Constructor<? extends View> constructor = c830530Wi3.get(str);
        if (constructor == null) {
            if (str2 == null) {
                strLIZIZ = str;
            } else {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append(str);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
            constructor = Class.forName(strLIZIZ, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            c830530Wi3.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            try {
                Object[] objArr = this.mConstructorArgs;
                objArr[0] = context;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i = 0;
                    while (true) {
                        String[] strArr = sClassPrefixList;
                        if (i < strArr.length) {
                            View viewCreateViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                            if (viewCreateViewByPrefix == null) {
                                i++;
                            } else {
                                Object[] objArr2 = this.mConstructorArgs;
                                objArr2[0] = null;
                                objArr2[1] = null;
                                return viewCreateViewByPrefix;
                            }
                        } else {
                            Object[] objArr3 = this.mConstructorArgs;
                            objArr3[0] = null;
                            objArr3[1] = null;
                            return null;
                        }
                    }
                } else {
                    View viewCreateViewByPrefix2 = createViewByPrefix(context, str, null);
                    Object[] objArr4 = this.mConstructorArgs;
                    objArr4[0] = null;
                    objArr4[1] = null;
                    return viewCreateViewByPrefix2;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Object[] objArr5 = this.mConstructorArgs;
                objArr5[0] = null;
                objArr5[1] = null;
                return null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Object[] objArr6 = this.mConstructorArgs;
            objArr6[0] = null;
            objArr6[1] = null;
            throw th;
        }
    }

    public static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.View, 0, 0);
        if (z) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.View_android_theme, 0);
        } else {
            resourceId = 0;
        }
        if (z2 && resourceId == 0) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.View_theme, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0 && (!(context instanceof C1361400lX0) || ((C1361400lX0) context).LL != resourceId)) {
            return new C1361400lX0(context, resourceId);
        }
        return context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View createView(android.view.View r3, java.lang.String r4, android.content.Context r5, android.util.AttributeSet r6, boolean r7, boolean r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21413018r2.createView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean, boolean):android.view.View");
    }
}
