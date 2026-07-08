package X;

import Y.ACListenerS166S0100000_32;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21522419Ks extends Button {
    public final String LL;
    public final String LLILLJJLI;
    public View.OnClickListener LLILLL;
    public View.OnClickListener LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public C202011142n LLIZLLLIL;

    public abstract int getDefaultRequestCode();

    public int getDefaultStyleResource() {
        C807660VmG.LIZ(this);
        return 0;
    }

    public Activity getActivity() {
        if (C807660VmG.LIZ(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new C1BJO("Unable to get Activity.");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final String getAnalyticsButtonCreatedEventName() {
        if (C807660VmG.LIZ(this)) {
            return null;
        }
        try {
            return this.LL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final String getAnalyticsButtonTappedEventName() {
        if (C807660VmG.LIZ(this)) {
            return null;
        }
        try {
            return this.LLILLJJLI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final InterfaceC1670800ta2 getAndroidxActivityResultRegistryOwner() {
        if (C807660VmG.LIZ(this)) {
            return null;
        }
        try {
            ComponentCallbacks2 activity = getActivity();
            if (activity instanceof InterfaceC1670800ta2) {
                return (InterfaceC1670800ta2) activity;
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (C807660VmG.LIZ(this)) {
            return 0;
        }
        try {
            return this.LLILZIL ? this.LLILZLL : super.getCompoundPaddingLeft();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C807660VmG.LIZ(this)) {
            return 0;
        }
        try {
            return this.LLILZIL ? this.LLIZ : super.getCompoundPaddingRight();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public final Fragment getFragment() {
        Fragment fragment = null;
        if (C807660VmG.LIZ(this)) {
            return null;
        }
        try {
            C202011142n c202011142n = this.LLIZLLLIL;
            if (c202011142n == null) {
                return null;
            }
            fragment = c202011142n.LIZ;
            return fragment;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return fragment;
        }
    }

    public final android.app.Fragment getNativeFragment() {
        android.app.Fragment fragment = null;
        if (C807660VmG.LIZ(this)) {
            return null;
        }
        try {
            C202011142n c202011142n = this.LLIZLLLIL;
            if (c202011142n == null) {
                return null;
            }
            fragment = c202011142n.LIZIZ;
            return fragment;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return fragment;
        }
    }

    public int getRequestCode() {
        if (C807660VmG.LIZ(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (isInEditMode()) {
                return;
            }
            getContext();
            C807660VmG.LIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public AbstractC21522419Ks(Context context) {
        super(context, null, 0);
        int defaultStyleResource = getDefaultStyleResource();
        LIZ(context, defaultStyleResource == 0 ? R.style.aa9 : defaultStyleResource);
        this.LL = "fb_login_button_create";
        this.LLILLJJLI = "fb_login_button_did_tap";
        setClickable(true);
        setFocusable(true);
    }

    public final int LIZIZ(String str) {
        if (C807660VmG.LIZ(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil(getPaint().measureText(str));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            if ((getGravity() & 1) != 0) {
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int iMin = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - LIZIZ(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                this.LLILZLL = compoundPaddingLeft - iMin;
                this.LLIZ = compoundPaddingRight + iMin;
                this.LLILZIL = true;
            }
            super.onDraw(canvas);
            this.LLILZIL = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void setFragment(android.app.Fragment fragment) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            this.LLIZLLLIL = new C202011142n(fragment);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            this.LLILZ = onClickListener;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            this.LLILLL = onClickListener;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void setFragment(Fragment fragment) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            this.LLIZLLLIL = new C202011142n(fragment);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void LIZ(Context context, int i) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            LIZJ(context, i);
            LIZLLL(context, i);
            LJ(context, i);
            LJFF(context, i);
            if (!C807660VmG.LIZ(this)) {
                try {
                    super.setOnClickListener(new ACListenerS166S0100000_32(this, 120));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final void LIZJ(Context context, int i) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            if (isInEditMode()) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.background}, 0, i);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(C446980Hfs.LIZ(context, R.color.i6));
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final void LIZLLL(Context context, int i) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.drawableLeft, android.R.attr.drawableTop, android.R.attr.drawableRight, android.R.attr.drawableBottom, android.R.attr.drawablePadding}, 0, i);
            try {
                setCompoundDrawablesWithIntrinsicBounds(typedArrayObtainStyledAttributes.getResourceId(0, 0), typedArrayObtainStyledAttributes.getResourceId(1, 0), typedArrayObtainStyledAttributes.getResourceId(2, 0), typedArrayObtainStyledAttributes.getResourceId(3, 0));
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                typedArrayObtainStyledAttributes.recycle();
                setCompoundDrawablePadding(dimensionPixelSize);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final void LJ(Context context, int i) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.paddingLeft, android.R.attr.paddingTop, android.R.attr.paddingRight, android.R.attr.paddingBottom}, 0, i);
            try {
                setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final void LJFF(Context context, int i) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.textColor}, 0, i);
            try {
                setTextColor(typedArrayObtainStyledAttributes.getColorStateList(0));
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.gravity}, 0, i);
                try {
                    int i2 = typedArrayObtainStyledAttributes2.getInt(0, 17);
                    typedArrayObtainStyledAttributes2.recycle();
                    setGravity(i2);
                    typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.textSize, android.R.attr.textStyle, android.R.attr.text}, 0, i);
                    try {
                        setTextSize(0, typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0));
                        setTypeface(Typeface.create(getTypeface(), 1));
                        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes2, 2);
                        typedArrayObtainStyledAttributes2.recycle();
                        setText(strXd);
                    } finally {
                    }
                } finally {
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
