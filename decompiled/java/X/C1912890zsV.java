package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zsV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912890zsV extends FrameLayout {
    public ImageView LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public float LLILZ;
    public final C1912920zsY LLILZIL;

    public final ImageView getSheetHandleVectorFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v4g);
            this.LL = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final AbstractC1177930gl5 getBottomSheetCallback() {
        return this.LLILZIL;
    }

    public final boolean getDragHandleForceFlat() {
        return this.LLILLJJLI;
    }

    private final void setImageDrawable(Drawable drawable) {
        getSheetHandleVectorFromXml().setImageDrawable(drawable);
    }

    public final void LIZ(EnumC1912910zsX enumC1912910zsX) {
        int i;
        boolean z = this.LLILLJJLI;
        int i2 = R.drawable.d8u;
        if (!z && (i = C1912900zsW.LIZ[enumC1912910zsX.ordinal()]) != 1 && i == 2) {
            i2 = R.drawable.d8v;
        }
        Drawable drawableLIZIZ = C800330VaR.LIZIZ(getContext(), i2);
        if (drawableLIZIZ != null) {
            setImageDrawable(drawableLIZIZ);
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        C786410Ut5.V4(getSheetHandleVectorFromXml(), f);
    }

    public final void setDragHandleForceFlat(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setSheetHandleVectorFromXml(ImageView imageView) {
        this.LL = imageView;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0zsY] */
    public C1912890zsV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = new AbstractC1177930gl5() { // from class: X.0zsY
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view, float f) {
                EnumC1912910zsX enumC1912910zsX;
                C1912890zsV c1912890zsV = this.LIZ;
                if (!c1912890zsV.LLILLL) {
                    c1912890zsV.LLILLL = true;
                    c1912890zsV.LLILZ = f;
                }
                float f2 = c1912890zsV.LLILZ;
                if (f > f2) {
                    enumC1912910zsX = EnumC1912910zsX.TOP;
                } else if (f < f2) {
                    enumC1912910zsX = EnumC1912910zsX.BOTTOM;
                } else {
                    enumC1912910zsX = EnumC1912910zsX.DEFAULT;
                }
                c1912890zsV.LIZ(enumC1912910zsX);
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        if (i != 6) {
                            return;
                        }
                    } else {
                        this.LIZ.LIZ(EnumC1912910zsX.DEFAULT);
                        return;
                    }
                }
                this.LIZ.LIZ(EnumC1912910zsX.TOP);
            }
        };
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f_q, this, true);
        LIZ(EnumC1912910zsX.DEFAULT);
    }
}
