package X;

import Y.ARunnableS75S0200000_6;
import Y.ATListenerS455S0100000_22;
import Y.AfS191S0100000_22;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0nlJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447150nlJ extends FrameLayout {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public RecyclerView LLILZ;
    public C0GZU LLILZIL;
    public View LLILZLL;
    public InterfaceC1447140nlI LLIZ;
    public final C11RK<MotionEvent> LLIZLLLIL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final AbstractC21673619ry<RecyclerView.ViewHolder> getAdapter() {
        return this.LLILZ.getAdapter();
    }

    public final float getVideoCoverViewX() {
        return this.LLILZIL.getX();
    }

    public final float getOneThumbHeight() {
        return getMeasuredHeight() - (2 * C12ES.LIZJ(2.0f, getContext()));
    }

    public final float getOneThumbWidth() {
        return getMeasuredWidth() / (this.LL / this.LLILLJJLI);
    }

    public final int getCoverSize() {
        return this.LL;
    }

    public final int getCurPage() {
        return this.LLILLL;
    }

    public final int getItemCount() {
        return this.LL;
    }

    public final RecyclerView getRecyclerView() {
        return this.LLILZ;
    }

    public final View getShadowView() {
        return this.LLILZLL;
    }

    public final int getTotalPage() {
        return this.LLILLJJLI;
    }

    public final C0GZU getVideoCoverView() {
        return this.LLILZIL;
    }

    public final float LIZ(MotionEvent motionEvent) {
        float x;
        float oneThumbWidth;
        float f;
        boolean zLIZIZ = C1388580mEq.LIZIZ(getContext());
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
        if (measuredWidth > 1.0f) {
            measuredWidth = 1.0f;
        }
        if (zLIZIZ) {
            measuredWidth = 1.0f - measuredWidth;
        }
        return (1.0f / this.LLILLJJLI) * (this.LLILLL + measuredWidth);
    }

    public final void LIZIZ(MotionEvent motionEvent) {
        float x = motionEvent.getX() - getX();
        float f = 2;
        if (x <= getOneThumbWidth() / f) {
            C786410Ut5.Id(this.LLILZIL, 0.0f);
        } else if (x >= getMeasuredWidth() - (getOneThumbWidth() / f)) {
            C786410Ut5.Id(this.LLILZIL, getMeasuredWidth() - getOneThumbWidth());
        } else {
            C786410Ut5.Id(this.LLILZIL, x - (getOneThumbWidth() / f));
        }
    }

    public final void LIZJ(float f) {
        this.LLILZIL.animate().scaleX(f).scaleY(f).setDuration(100L).start();
    }

    public final void setAdapter(AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry) {
        this.LLILZ.setAdapter(abstractC21673619ry);
    }

    public final void setCurPage(int i) {
        this.LLILLL = i;
    }

    public final void setItemCount(int i) {
        this.LL = i;
    }

    public final void setOnScrollListener(InterfaceC1447140nlI interfaceC1447140nlI) {
        this.LLIZ = interfaceC1447140nlI;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        this.LLILZ = recyclerView;
    }

    public final void setShadowView(View view) {
        this.LLILZLL = view;
    }

    public final void setTotalPage(int i) {
        this.LLILLJJLI = i;
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
        if (i2 > 0 && i > 0) {
            C786410Ut5.LLJILJIL(this.LLILZIL, 0);
            C0GZU c0gzu = this.LLILZIL;
            c0gzu.getClass();
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i, true);
            int iMin = Math.min(i2, i);
            int i4 = (int) ((iMin * oneThumbHeight) / oneThumbWidth);
            int iMax = Math.max((i2 - iMin) / 2, 0);
            int iMax2 = Math.max((i - i4) / 2, 0);
            if (iMax + iMin <= i2 && iMax2 + i4 <= i) {
                C443530HaJ c443530HaJ = new C443530HaJ(c0gzu.getResources(), Bitmap.createBitmap(bitmapCreateScaledBitmap, iMax, iMax2, iMin, i4));
                c443530HaJ.LIZJ(C12ES.LIZJ(4.0f, c0gzu.getContext()));
                HandlerHook.viewPost(c0gzu, new ARunnableS75S0200000_6(c0gzu, c443530HaJ, 11));
                return;
            }
            HandlerHook.viewPost(c0gzu, new ARunnableS75S0200000_6(c0gzu, bitmapCreateScaledBitmap, 10));
        }
    }

    public final void setVideoCoverView(C0GZU c0gzu) {
        this.LLILZIL = c0gzu;
    }

    public C1447150nlJ(Context context, AttributeSet attributeSet) {
        int iLIZ;
        super(context, attributeSet, 0);
        this.LL = 7;
        this.LLILLJJLI = 1;
        RecyclerView recyclerView = new RecyclerView(context, attributeSet);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setHasFixedSize(true);
        this.LLILZ = recyclerView;
        C0GZU c0gzu = new C0GZU(context);
        c0gzu.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c0gzu.setColor(C960203pA.LIZ(R.attr.a04, context));
        this.LLILZIL = c0gzu;
        View view = new View(context, attributeSet);
        view.setBackgroundResource(R.drawable.akt);
        this.LLILZLL = view;
        C0GSV c0gsv = new C0GSV(context);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ != null) {
            iLIZ = numLIZJ.intValue();
        } else {
            iLIZ = C960203pA.LIZ(R.attr.a03, context);
        }
        c0gsv.LL.setColor(iLIZ);
        c0gsv.invalidate();
        C11RK<MotionEvent> c11rk = new C11RK<>();
        this.LLIZLLLIL = c11rk;
        C19491011Nk c19491011NkLJJIL = c11rk.LJJIL(new InterfaceC19483011Ki() { // from class: X.0IOo
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((MotionEvent) obj).getActionMasked() == 0) {
                    return true;
                }
                return false;
            }
        });
        C19491011Nk c19491011NkLJJIL2 = c11rk.LJJIL(new InterfaceC19483011Ki() { // from class: X.0IOp
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((MotionEvent) obj).getActionMasked() == 2) {
                    return true;
                }
                return false;
            }
        });
        C19491011Nk c19491011NkLJJIL3 = c11rk.LJJIL(new InterfaceC19483011Ki() { // from class: X.0IOq
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((MotionEvent) obj).getActionMasked() == 1) {
                    return true;
                }
                return false;
            }
        });
        C19491011Nk c19491011NkLJJIL4 = c11rk.LJJIL(new InterfaceC19483011Ki() { // from class: X.0IOn
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((MotionEvent) obj).getActionMasked() == 3) {
                    return true;
                }
                return false;
            }
        });
        addView(this.LLILZ, new FrameLayout.LayoutParams(-1, -1));
        this.LLILZ.setClipToOutline(true);
        float fLIZIZ = C366700EZg.LIZIZ(8, getContext());
        RecyclerView recyclerView2 = this.LLILZ;
        final Float fValueOf = Float.valueOf(fLIZIZ);
        recyclerView2.setOutlineProvider(new ViewOutlineProvider(fValueOf) { // from class: X.0GZe
            public final Float LIZ;
            public final float LIZIZ = 0.0f;

            {
                this.LIZ = fValueOf;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                if (view2 == null) {
                    return;
                }
                if (this.LIZ != null) {
                    if (outline != null) {
                        outline.setRoundRect(new Rect(0, 0, view2.getWidth(), view2.getHeight()), this.LIZ.floatValue());
                    }
                } else {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(new Rect(0, 0, view2.getWidth(), view2.getHeight()), view2.getWidth() * this.LIZIZ);
                }
            }
        });
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.LLILZLL.setClipToOutline(true);
        View view2 = this.LLILZLL;
        final Float fValueOf2 = Float.valueOf(fLIZIZ);
        view2.setOutlineProvider(new ViewOutlineProvider(fValueOf2) { // from class: X.0GZe
            public final Float LIZ;
            public final float LIZIZ = 0.0f;

            {
                this.LIZ = fValueOf2;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view22, Outline outline) {
                if (view22 == null) {
                    return;
                }
                if (this.LIZ != null) {
                    if (outline != null) {
                        outline.setRoundRect(new Rect(0, 0, view22.getWidth(), view22.getHeight()), this.LIZ.floatValue());
                    }
                } else {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(new Rect(0, 0, view22.getWidth(), view22.getHeight()), view22.getWidth() * this.LIZIZ);
                }
            }
        });
        addView(this.LLILZLL, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        c0gsv.setClipToOutline(true);
        final Float fValueOf3 = Float.valueOf(fLIZIZ);
        c0gsv.setOutlineProvider(new ViewOutlineProvider(fValueOf3) { // from class: X.0GZe
            public final Float LIZ;
            public final float LIZIZ = 0.0f;

            {
                this.LIZ = fValueOf3;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view22, Outline outline) {
                if (view22 == null) {
                    return;
                }
                if (this.LIZ != null) {
                    if (outline != null) {
                        outline.setRoundRect(new Rect(0, 0, view22.getWidth(), view22.getHeight()), this.LIZ.floatValue());
                    }
                } else {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(new Rect(0, 0, view22.getWidth(), view22.getHeight()), view22.getWidth() * this.LIZIZ);
                }
            }
        });
        c0gsv.LLILLJJLI = fLIZIZ;
        c0gsv.invalidate();
        addView(c0gsv, layoutParams2);
        this.LLILZIL.setClipToOutline(true);
        C0GZU c0gzu2 = this.LLILZIL;
        final Float fValueOf4 = Float.valueOf(fLIZIZ);
        c0gzu2.setOutlineProvider(new ViewOutlineProvider(fValueOf4) { // from class: X.0GZe
            public final Float LIZ;
            public final float LIZIZ = 0.0f;

            {
                this.LIZ = fValueOf4;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view22, Outline outline) {
                if (view22 == null) {
                    return;
                }
                if (this.LIZ != null) {
                    if (outline != null) {
                        outline.setRoundRect(new Rect(0, 0, view22.getWidth(), view22.getHeight()), this.LIZ.floatValue());
                    }
                } else {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(new Rect(0, 0, view22.getWidth(), view22.getHeight()), view22.getWidth() * this.LIZIZ);
                }
            }
        });
        addView(this.LLILZIL);
        this.LLILZIL.setXYRadius(fLIZIZ);
        C786410Ut5.LLJILJIL(this.LLILZIL, 4);
        setOnTouchListener(new ATListenerS455S0100000_22(this, 1));
        c19491011NkLJJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS191S0100000_22(this, 16));
        c19491011NkLJJIL2.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS191S0100000_22(this, 17));
        c19491011NkLJJIL3.LJIL(200L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS191S0100000_22(this, 18));
        c19491011NkLJJIL4.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS191S0100000_22(this, 4));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
