package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H6D, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H6D extends FrameLayout implements View.OnTouchListener {
    public int LL;
    public RecyclerView LLILLJJLI;
    public C0GZU LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public FrameLayout.LayoutParams LLIZLLLIL;
    public FrameLayout.LayoutParams LLJ;
    public int LLJI;
    public int LLJIJIL;
    public final int LLJILJIL;

    public final void setOnScrollListener(C0H6F c0h6f) {
    }

    public final void LIZLLL() {
        C0GZU c0gzu = this.LLILLL;
        if (c0gzu != null) {
            c0gzu.setOnTouchListener(null);
            C786410Ut5.LLJILJIL(this.LLILLL, 8);
        }
    }

    public final AbstractC21673619ry<?> getAdapter() {
        return this.LLILLJJLI.getAdapter();
    }

    public final float getOneThumbHeight() {
        return this.LLILLL.getHeight() - (2 * C12ES.LIZJ(2.0f, getContext()));
    }

    public final float getOneThumbWidth() {
        return getMeasuredWidth() / this.LL;
    }

    public final int getCoverSize() {
        return this.LL;
    }

    public final int getFrameHeight() {
        return this.LLJIJIL;
    }

    public final int getFrameWidth() {
        return this.LLJI;
    }

    public final void LIZ(float f) {
        this.LLIZLLLIL.width = (int) (f - 0);
        C786410Ut5.W5(this.LLILZLL, this.LLIZLLLIL);
        this.LLJ.width = (int) ((getMeasuredWidth() - f) + this.LLILLL.getWidth());
        C786410Ut5.Fd(this.LLIZ, f + this.LLILLL.getWidth());
        C786410Ut5.W5(this.LLIZ, this.LLJ);
    }

    public final float LIZIZ(MotionEvent motionEvent) {
        this.LLILZ = ((View) getParent()).getPaddingLeft();
        this.LLILZIL = getPaddingLeft();
        float rawX = (this.LLILZIL + (motionEvent.getRawX() - this.LLILZ)) - (this.LLILLL.getWidth() / 2.0f);
        if (rawX > this.LLILLL.getWidth() * (this.LL - 1)) {
            rawX = this.LLILLL.getWidth() * (this.LL - 1);
        }
        if (rawX < 0.0f) {
            return 0.0f;
        }
        return rawX;
    }

    public final void LIZJ(MotionEvent motionEvent) {
        float fLIZIZ = LIZIZ(motionEvent);
        this.LLILLL.animate().x(fLIZIZ).y(this.LLILLL.getY()).setDuration(0L).start();
        LIZ(fLIZIZ);
    }

    public final void setAdapter(AbstractC21673619ry<?> abstractC21673619ry) {
        this.LLILLJJLI.setAdapter(abstractC21673619ry);
    }

    public final void setCoverSize(int i) {
        this.LL = i;
    }

    public final void setFrameHeight(int i) {
        this.LLJIJIL = i;
    }

    public final void setFrameWidth(int i) {
        this.LLJI = i;
    }

    public final void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        this.LLILLJJLI.setLayoutManager(layoutManager);
    }

    public final void setVideoCoverFrameView(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int oneThumbWidth = (int) getOneThumbWidth();
        int oneThumbHeight = (int) getOneThumbHeight();
        int i = height * oneThumbWidth;
        int i2 = width * oneThumbHeight;
        if (i > i2) {
            oneThumbWidth = i2 / height;
        } else {
            oneThumbHeight = i / width;
        }
        this.LLILLL.setImageBitmap(Bitmap.createScaledBitmap(bitmap, oneThumbWidth, oneThumbHeight, true));
    }

    public C0H6D(Context context, AttributeSet attributeSet) {
        RecyclerView recyclerView;
        super(context, attributeSet, 0);
        this.LL = 7;
        this.LLJILJIL = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VideoEditView);
            this.LLJI = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_frameWidth, 0.0f));
            this.LLJIJIL = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_frameHeight, 0.0f));
            this.LLJILJIL = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_roundedCornerRadius, -1.0f));
            typedArrayObtainStyledAttributes.recycle();
        }
        RecyclerView recyclerView2 = new RecyclerView(context);
        this.LLILLJJLI = recyclerView2;
        recyclerView2.setTag("tag_RecyclerView");
        this.LLILLJJLI.setOnTouchListener(this);
        addView(this.LLILLJJLI, new FrameLayout.LayoutParams(-1, -1));
        C0GZU c0gzu = new C0GZU(context);
        this.LLILLL = c0gzu;
        c0gzu.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.LLILLL.setColor(C960203pA.LIZ(R.attr.a04, getContext()));
        this.LLILLL.setTag("tag_VideoCoverFrameView");
        this.LLILLL.setOnTouchListener(this);
        addView(this.LLILLL);
        this.LLILZLL = new View(context);
        this.LLIZLLLIL = new FrameLayout.LayoutParams(-1, -1);
        this.LLILZLL.setBackgroundResource(R.drawable.akt);
        this.LLIZ = new View(context);
        this.LLJ = new FrameLayout.LayoutParams(-1, -1);
        this.LLIZ.setBackgroundResource(R.drawable.akt);
        int i = this.LLJILJIL;
        if (i > 0 && (recyclerView = this.LLILLJJLI) != null) {
            recyclerView.setClipToOutline(true);
            final Float fValueOf = Float.valueOf(i);
            recyclerView.setOutlineProvider(new ViewOutlineProvider(fValueOf) { // from class: X.0GZg
                public final Float LIZ;
                public final float LIZIZ = 0.0f;

                {
                    this.LIZ = fValueOf;
                }

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    if (view == null) {
                        return;
                    }
                    if (this.LIZ != null) {
                        if (outline != null) {
                            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.LIZ.floatValue());
                        }
                    } else {
                        if (outline == null) {
                            return;
                        }
                        outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), view.getWidth() * this.LIZIZ);
                    }
                }
            });
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLL.LIZ(getMeasuredWidth() / this.LL, getMeasuredHeight());
        LIZ(this.LLILLL.getX());
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object tag = view.getTag();
        if (Intrinsics.LJFF(tag, "tag_VideoCoverFrameView")) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        LIZJ(motionEvent);
                    }
                    return true;
                }
                LIZIZ(motionEvent);
                return true;
            }
            LIZIZ(motionEvent);
            return true;
        }
        if (Intrinsics.LJFF(tag, "tag_RecyclerView")) {
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                if (action2 == 1) {
                    LIZJ(motionEvent);
                    LIZIZ(motionEvent);
                }
                return true;
            }
            LIZIZ(motionEvent);
            return true;
        }
        return onTouchEvent(motionEvent);
    }
}
