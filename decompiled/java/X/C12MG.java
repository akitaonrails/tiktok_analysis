package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.12MG, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12MG extends View {
    public int LL;
    public View LLILLJJLI;
    public int LLILLL;

    public View getContent() {
        return this.LLILLJJLI;
    }

    public int getEmptyVisibility() {
        return this.LLILLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.LL == i) {
            return;
        }
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
            ((C19ME) this.LLILLJJLI.getLayoutParams()).isInPlaceholder = false;
            this.LLILLJJLI = null;
        }
        this.LL = i;
        if (i != -1 && (viewFindViewById = ((View) getParent()).findViewById(i)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
    }

    public void setEmptyVisibility(int i) {
        this.LLILLL = i;
    }

    public C12MG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = -1;
        this.LLILLL = 4;
        super.setVisibility(4);
        this.LL = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_placeholder);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_placeholder_content) {
                    this.LL = typedArrayObtainStyledAttributes.getResourceId(index, this.LL);
                } else if (index == R$styleable.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.LLILLL = typedArrayObtainStyledAttributes.getInt(index, this.LLILLL);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
