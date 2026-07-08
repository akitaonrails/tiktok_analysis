package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gr6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428460Gr6 implements C186D<ConstraintLayout> {
    public final boolean LIZ;

    @Override // X.C186D
    public final void LJI(C428500GrA c428500GrA) {
    }

    public C428460Gr6(boolean z) {
        this.LIZ = z;
    }

    @Override // X.C186D
    public final /* bridge */ /* synthetic */ C0H0C LIZ(ConstraintLayout constraintLayout) {
        return null;
    }

    @Override // X.C186D
    public final TuxTextView LIZIZ(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2 = constraintLayout;
        TuxTextView tuxTextView = new TuxTextView(constraintLayout2.getContext(), null, 6, 0);
        tuxTextView.setId(R.id.glt);
        Resources resources = tuxTextView.getContext().getResources();
        tuxTextView.setTextColorRes(R.attr.ee);
        if (this.LIZ) {
            tuxTextView.setTuxFont(52);
            tuxTextView.setPadding(resources.getDimensionPixelSize(R.dimen.uv), resources.getDimensionPixelSize(R.dimen.uo), resources.getDimensionPixelSize(R.dimen.uv), resources.getDimensionPixelSize(R.dimen.uv));
        } else {
            tuxTextView.setTuxFont(92);
            tuxTextView.setPadding(resources.getDimensionPixelSize(R.dimen.uo), resources.getDimensionPixelSize(R.dimen.uf), resources.getDimensionPixelSize(R.dimen.uo), resources.getDimensionPixelSize(R.dimen.uf));
        }
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(17);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setBackground(C800330VaR.LIZIZ(tuxTextView.getContext(), R.drawable.bmu));
        C19ME c19me = new C19ME(-2, -2);
        c19me.startToStart = 0;
        c19me.topToTop = 0;
        c19me.constrainedWidth = true;
        constraintLayout2.addView(tuxTextView, c19me);
        return tuxTextView;
    }

    @Override // X.C186D
    public final /* bridge */ /* synthetic */ C186G LIZJ(ConstraintLayout constraintLayout) {
        return null;
    }

    @Override // X.C186D
    public final /* bridge */ /* synthetic */ AppCompatImageView LIZLLL(ConstraintLayout constraintLayout) {
        return null;
    }

    @Override // X.C186D
    public final SmartImageView LJ(ConstraintLayout constraintLayout) {
        SmartImageView smartImageView = (SmartImageView) constraintLayout.findViewById(R.id.gm_);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C0H9H.LIZ(4);
        int i = 0;
        c1331750klB.LIZ = false;
        smartImageView.setCircleOptions(new C1331730kl9(c1331750klB));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bv, smartImageView.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            float[] fArr = new float[8];
            do {
                fArr[i] = C0H9H.LIZ(8);
                i++;
            } while (i < 8);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            Paint paint = shapeDrawable.getPaint();
            if (paint != null) {
                paint.setColor(iIntValue);
            }
            smartImageView.setBackground(shapeDrawable);
        }
        final Context context = smartImageView.getContext();
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(context) { // from class: X.0GbL
            @Override // com.bytedance.tux.drawable.TuxIconDrawable, android.graphics.drawable.Drawable
            public final void setAlpha(int i2) {
                if (i2 == 0) {
                    super.setAlpha(i2);
                }
            }
        };
        tuxIconDrawable.LJI(R.attr.ei, smartImageView.getContext());
        tuxIconDrawable.LJII(smartImageView.getContext().getResources().getDimensionPixelOffset(R.dimen.uj));
        tuxIconDrawable.LJ(smartImageView.getContext().getResources().getDimensionPixelOffset(R.dimen.uj));
        smartImageView.setPlaceholderImage(tuxIconDrawable);
        return smartImageView;
    }

    @Override // X.C186D
    public final TuxTextView LJFF(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2 = constraintLayout;
        TuxTextView tuxTextView = new TuxTextView(constraintLayout2.getContext(), null, 6, 0);
        tuxTextView.setId(R.id.glu);
        Resources resources = tuxTextView.getContext().getResources();
        tuxTextView.setTextColor(R.attr.ee);
        tuxTextView.setTuxFont(91);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setPadding(resources.getDimensionPixelSize(R.dimen.tw), resources.getDimensionPixelSize(R.dimen.tv), resources.getDimensionPixelSize(R.dimen.tw), resources.getDimensionPixelSize(R.dimen.tv));
        tuxTextView.setBackground(C800330VaR.LIZIZ(tuxTextView.getContext(), R.drawable.bmw));
        C19ME c19me = new C19ME(-2, -2);
        c19me.endToEnd = 0;
        c19me.startToEnd = R.id.glt;
        c19me.topToTop = 0;
        c19me.horizontalBias = 0.0f;
        c19me.constrainedWidth = true;
        constraintLayout2.addView(tuxTextView, c19me);
        return tuxTextView;
    }
}
