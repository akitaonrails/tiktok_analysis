package X;

import Y.ATListenerS455S0100000_22;
import Y.AfS191S0100000_22;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0nlu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447520nlu extends FrameLayout {
    public final int LL;
    public RecyclerView LLILLJJLI;
    public C0GZU LLILLL;
    public final View LLILZ;
    public InterfaceC1447550nlx LLILZIL;
    public final C11RK<MotionEvent> LLILZLL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    private final float getOneThumbHeight() {
        return this.LLILLL.getHeight() - (2 * C12ES.LIZJ(2.0f, getContext()));
    }

    public final float getVideoCoverViewX() {
        return this.LLILLL.getX();
    }

    public final float getOneThumbWidth() {
        return getMeasuredWidth() / this.LL;
    }

    public final int getCoverSize() {
        return this.LL;
    }

    public final RecyclerView getRecyclerView() {
        return this.LLILLJJLI;
    }

    public final C0GZU getVideoCoverView() {
        return this.LLILLL;
    }

    public final float LIZ(MotionEvent motionEvent) {
        float x;
        float oneThumbWidth;
        float f;
        float f2 = 2;
        if (motionEvent.getX() <= getOneThumbWidth() / f2) {
            f = 0.0f;
        } else {
            if (motionEvent.getX() >= getMeasuredWidth() - (getOneThumbWidth() / f2)) {
                x = getMeasuredWidth();
                oneThumbWidth = getOneThumbWidth();
            } else {
                x = motionEvent.getX();
                oneThumbWidth = getOneThumbWidth() / f2;
            }
            f = x - oneThumbWidth;
        }
        float measuredWidth = f / (getMeasuredWidth() - getOneThumbWidth());
        if (measuredWidth > 0.9f) {
            return 0.9f;
        }
        return measuredWidth;
    }

    public final void LIZIZ(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f = 2;
        if (x <= getOneThumbWidth() / f) {
            C786410Ut5.Id(this.LLILLL, 0.0f);
        } else if (x >= getMeasuredWidth() - (getOneThumbWidth() / f)) {
            C786410Ut5.Id(this.LLILLL, getMeasuredWidth() - getOneThumbWidth());
        } else {
            C786410Ut5.Id(this.LLILLL, x - (getOneThumbWidth() / f));
        }
    }

    public final void LIZJ(float f) {
        this.LLILLL.animate().scaleX(f).scaleY(f).setDuration(100L).start();
    }

    public final void setAdapter(AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry) {
        this.LLILLJJLI.setAdapter(abstractC21673619ry);
    }

    public final void setOnScrollListener(InterfaceC1447550nlx interfaceC1447550nlx) {
        this.LLILZIL = interfaceC1447550nlx;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        this.LLILLJJLI = recyclerView;
    }

    public final void setVideoCoverFrameView(Bitmap bitmap) {
        int i;
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float oneThumbWidth = getOneThumbWidth();
        float oneThumbHeight = getOneThumbHeight();
        if (height * oneThumbWidth > width * oneThumbHeight) {
            i = (int) oneThumbHeight;
            i2 = (width * i) / height;
        } else {
            int i3 = (int) oneThumbWidth;
            i = (height * i3) / width;
            i2 = i3;
        }
        this.LLILLL.setImageBitmap(Bitmap.createScaledBitmap(bitmap, i2, i, true));
    }

    public final void setVideoCoverView(C0GZU c0gzu) {
        this.LLILLL = c0gzu;
    }

    public C1447520nlu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = 7;
        RecyclerView recyclerView = new RecyclerView(context, attributeSet);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setHasFixedSize(true);
        this.LLILLJJLI = recyclerView;
        C0GZU c0gzu = new C0GZU(context);
        c0gzu.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c0gzu.setColor(C960203pA.LIZ(R.attr.a04, context));
        this.LLILLL = c0gzu;
        View view = new View(context, attributeSet);
        view.setBackgroundResource(R.drawable.akt);
        this.LLILZ = view;
        C11RK<MotionEvent> c11rk = new C11RK<>();
        this.LLILZLL = c11rk;
        C19491011Nk c19491011NkLJJIL = c11rk.LJJIL(new InterfaceC19483011Ki() { // from class: X.0IOk
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((MotionEvent) obj).getActionMasked() == 0) {
                    return true;
                }
                return false;
            }
        });
        C19491011Nk c19491011NkLJJIL2 = c11rk.LJJIL(new InterfaceC19483011Ki() { // from class: X.0IOl
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((MotionEvent) obj).getActionMasked() == 2) {
                    return true;
                }
                return false;
            }
        });
        C19491011Nk c19491011NkLJJIL3 = c11rk.LJJIL(new InterfaceC19483011Ki() { // from class: X.0IOm
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((MotionEvent) obj).getActionMasked() == 1) {
                    return true;
                }
                return false;
            }
        });
        C19491011Nk c19491011NkLJJIL4 = c11rk.LJJIL(new InterfaceC19483011Ki() { // from class: X.0IOj
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((MotionEvent) obj).getActionMasked() == 3) {
                    return true;
                }
                return false;
            }
        });
        addView(this.LLILLJJLI, new FrameLayout.LayoutParams(-1, -1));
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        addView(this.LLILLL);
        setOnTouchListener(new ATListenerS455S0100000_22(this, 8));
        c19491011NkLJJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS191S0100000_22(this, 5));
        c19491011NkLJJIL2.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS191S0100000_22(this, 6));
        c19491011NkLJJIL3.LJIL(200L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS191S0100000_22(this, 7));
        c19491011NkLJJIL4.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS191S0100000_22(this, 51));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLL.LIZ(getMeasuredWidth() / this.LL, getMeasuredHeight());
    }
}
