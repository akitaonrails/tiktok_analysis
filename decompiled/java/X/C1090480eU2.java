package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eU2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090480eU2 extends FrameLayout {
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public int LLILZIL;
    public final boolean LLILZLL;

    private final int getStatusBarHeight() {
        int i = this.LLILZIL;
        if (i != 0) {
            return i;
        }
        int iLJIJ = C497740JfY.LJIJ();
        this.LLILZIL = iLJIJ;
        return iLJIJ;
    }

    public final View getSafeAreaBottomFromXml() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.tye);
        this.LLILZ = viewFindViewById;
        return viewFindViewById;
    }

    public final View getSafeAreaLeftFromXml() {
        View view = this.LLILLJJLI;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.tyf);
        this.LLILLJJLI = viewFindViewById;
        return viewFindViewById;
    }

    public final View getSafeAreaRightFromXml() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.tyg);
        this.LLILLL = viewFindViewById;
        return viewFindViewById;
    }

    public final View getSafeAreaTopFromXml() {
        View view = this.LL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.tyh);
        this.LL = viewFindViewById;
        return viewFindViewById;
    }

    private final int getHorizonMargin() {
        int iLJFF = C14KS.LJFF();
        int iLIZJ = C14KS.LIZJ(getContext());
        if (iLJFF == 0 || iLIZJ == 0) {
            return 12;
        }
        float f = iLJFF;
        float f2 = iLIZJ;
        return (int) C497740JfY.LIZIZ(12 + ((1.0f * f) / f2 > 0.5625f ? Math.min((f - (f2 * 0.5625f)) / 2, 40.0f) : 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(306.0f), this);
        if (this.LLILZLL) {
            C500260Jjc.LJLJL(((int) C497740JfY.LIZIZ(160.0f)) - getStatusBarHeight(), this);
        }
        C500260Jjc.LJLI(getHorizonMargin(), this);
        C500260Jjc.LJLJJI(getHorizonMargin(), this);
    }

    public final void setSafeAreaBottomFromXml(View view) {
        this.LLILZ = view;
    }

    public final void setSafeAreaLeftFromXml(View view) {
        this.LLILLJJLI = view;
    }

    public final void setSafeAreaRightFromXml(View view) {
        this.LLILLL = view;
    }

    public final void setSafeAreaTopFromXml(View view) {
        this.LL = view;
    }

    public C1090480eU2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.g0c, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_billboardSafeArea, 0, 0);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.ttlive_billboardSafeArea_ttlive_excludeBar)) {
            this.LLILZLL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ttlive_billboardSafeArea_ttlive_excludeBar, false);
        }
    }

    public static void LIZ(C1090480eU2 c1090480eU2, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z4 = false;
        }
        c1090480eU2.getClass();
        if (!z && !z3 && !z4 && !z2) {
            C500260Jjc.LJIILIIL(c1090480eU2);
            return;
        }
        C500260Jjc.LLFFF(c1090480eU2);
        View safeAreaTopFromXml = c1090480eU2.getSafeAreaTopFromXml();
        if (safeAreaTopFromXml != null) {
            if (z) {
                C500260Jjc.LLFFF(safeAreaTopFromXml);
            } else {
                C500260Jjc.LJIILIIL(safeAreaTopFromXml);
            }
        }
        View safeAreaLeftFromXml = c1090480eU2.getSafeAreaLeftFromXml();
        if (safeAreaLeftFromXml != null) {
            if (z4) {
                C500260Jjc.LLFFF(safeAreaLeftFromXml);
            } else {
                C500260Jjc.LJIILIIL(safeAreaLeftFromXml);
            }
        }
        View safeAreaRightFromXml = c1090480eU2.getSafeAreaRightFromXml();
        if (safeAreaRightFromXml != null) {
            if (z2) {
                C500260Jjc.LLFFF(safeAreaRightFromXml);
            } else {
                C500260Jjc.LJIILIIL(safeAreaRightFromXml);
            }
        }
        View safeAreaBottomFromXml = c1090480eU2.getSafeAreaBottomFromXml();
        if (safeAreaBottomFromXml == null) {
            return;
        }
        if (z3) {
            C500260Jjc.LLFFF(safeAreaBottomFromXml);
        } else {
            C500260Jjc.LJIILIIL(safeAreaBottomFromXml);
        }
    }
}
