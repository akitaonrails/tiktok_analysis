package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RemoteViews;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0SeE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@RemoteViews.RemoteView
public class C726240SeE extends View {
    public int LL;
    public int LLILLJJLI;
    public String LLILLL;
    public InterfaceC725980Sdo LLILZ;
    public WeakReference<View> LLILZIL;
    public LayoutInflater LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(InterfaceC726250SeF interfaceC726250SeF) {
    }

    public InterfaceC725980Sdo getExperiment() {
        String str;
        if (this.LLILZ == null && (str = this.LLILLL) != null && !this.LLIZLLLIL) {
            try {
                this.LLIZLLLIL = true;
                this.LLILZ = (InterfaceC725980Sdo) Class.forName(str).newInstance();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return this.LLILZ;
    }

    @Override // android.view.View
    public final boolean hasTransientState() {
        if (!this.LLIZ) {
            ViewParent parent = getParent();
            InterfaceC725980Sdo experiment = getExperiment();
            if (parent != null && (experiment == null || !experiment.hit())) {
                this.LLIZ = true;
                LIZ();
            }
        }
        return super.hasTransientState();
    }

    public final void LIZ() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.LLILLJJLI == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterNe = this.LLILZLL;
        if (layoutInflaterNe == null) {
            layoutInflaterNe = C786410Ut5.ne(getContext());
        }
        View viewTd = C786410Ut5.Td(layoutInflaterNe, this.LLILLJJLI, viewGroup, false);
        int i = this.LL;
        if (i != -1) {
            viewTd.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        C786410Ut5.LJJLJLI(this, viewGroup);
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewTd, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewTd, iIndexOfChild);
        }
        this.LLILZIL = new WeakReference<>(viewTd);
    }

    public int getInflatedId() {
        return this.LL;
    }

    public LayoutInflater getLayoutInflater() {
        return this.LLILZLL;
    }

    public int getLayoutResource() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
    }

    public C726240SeE(Context context) {
        super(context);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    public void setExp(String str) {
        this.LLILLL = str;
    }

    public void setExperimentImplementation(InterfaceC725980Sdo interfaceC725980Sdo) {
        this.LLILZ = interfaceC725980Sdo;
    }

    public void setInflatedId(int i) {
        this.LL = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.LLILZLL = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.LLILLJJLI = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.LLILZIL;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                C786410Ut5.LJLLLLLL(i, view);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i != 0 && i != 4) {
            return;
        }
        LIZ();
    }

    public C726240SeE(Context context, AttributeSet attributeSet) {
        super(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AndViewStub, 0, 0);
        this.LL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AndViewStub_and_inflatedId, -1);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AndViewStub_and_layout, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(R$styleable.AndViewStub_and_id, -1));
        this.LLILLL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.AndViewStub_and_exp);
        typedArrayObtainStyledAttributes.recycle();
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public static <T extends View> T LIZIZ(View view, T t, int i, int i2) {
        InterfaceC725980Sdo experiment;
        if (t != null) {
            return t;
        }
        T t2 = (T) view.findViewById(i);
        if (t2 != null) {
            return t2;
        }
        C726240SeE c726240SeE = (C726240SeE) view.findViewById(i2);
        if (c726240SeE != null && !c726240SeE.LLIZ && (experiment = c726240SeE.getExperiment()) != null && experiment.hit()) {
            c726240SeE.LLIZ = true;
            c726240SeE.LIZ();
        }
        return (T) view.findViewById(i);
    }
}
