package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0GZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417850GZz {
    public static void LIZ(int i, View view) {
        final float f = i;
        view.setOutlineProvider(new ViewOutlineProvider(f) { // from class: X.0GZx
            public final float LIZ;

            {
                this.LIZ = f;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                outline.setRoundRect(new Rect(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getWidth() - view2.getPaddingRight(), view2.getHeight() - view2.getPaddingBottom()), this.LIZ);
            }
        });
        view.setClipToOutline(true);
    }

    public static void LIZIZ(View view, ViewOutlineProvider viewOutlineProvider) {
        view.setOutlineProvider(viewOutlineProvider);
        view.setClipToOutline(true);
    }

    public static void LIZJ(int i, View view) {
        final float f = i;
        view.setOutlineProvider(new ViewOutlineProvider(f) { // from class: X.0GZy
            public final float LIZ;
            public final int LIZIZ = 1;

            {
                this.LIZ = f;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                int paddingLeft = view2.getPaddingLeft();
                int paddingTop = view2.getPaddingTop();
                int width = view2.getWidth() - view2.getPaddingRight();
                int height = view2.getHeight() - view2.getPaddingBottom();
                int i2 = this.LIZIZ;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                width = (int) (width + this.LIZ);
                            }
                        } else {
                            paddingLeft = (int) (paddingLeft - this.LIZ);
                        }
                    } else {
                        paddingTop = (int) (paddingTop - this.LIZ);
                    }
                } else {
                    height = (int) (height + this.LIZ);
                }
                outline.setRoundRect(new Rect(paddingLeft, paddingTop, width, height), this.LIZ);
            }
        });
        view.setClipToOutline(true);
    }
}
