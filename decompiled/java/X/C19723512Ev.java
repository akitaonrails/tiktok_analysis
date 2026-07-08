package X;

import Y.ACListenerS163S0100000_29;
import Y.AsS55S0100000_29;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Ev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19723512Ev extends FrameLayout {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public float LLILZIL;
    public RecyclerView LLILZLL;
    public View LLIZ;
    public final ACListenerS163S0100000_29 LLIZLLLIL;
    public View LLJ;
    public InterfaceC19723812Ey LLJI;
    public final int LLJIJIL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void setVideoCoverFrameView(Bitmap bitmap) {
    }

    public final AbstractC21673619ry<RecyclerView.ViewHolder> getAdapter() {
        return this.LLILZLL.getAdapter();
    }

    public final float getOneThumbWidth() {
        int i = this.LLILLL;
        if (i > 0) {
            return i;
        }
        if (this.LL == 0 || this.LLILLJJLI == 0) {
            return 0.0f;
        }
        return getMeasuredWidth() / (this.LL / this.LLILLJJLI);
    }

    public final float LIZ() {
        int i;
        int i2;
        float oneThumbWidth = getOneThumbWidth();
        int i3 = this.LLILLL;
        float fFloatValue = ((i3 <= 0 || (i = this.LLILZ) <= 0 || (i2 = this.LL) <= 0) ? Float.valueOf(this.LL * oneThumbWidth) : Integer.valueOf(((i2 - 1) * i3) + i)).floatValue();
        float f = this.LLILZIL;
        if (fFloatValue <= 0.0f) {
            return 0.0f;
        }
        float f2 = f / fFloatValue;
        if (C1388580mEq.LIZIZ(getContext())) {
            f2 = 1.0f - f2;
        }
        return C13LZ.LIZLLL(f2, 0.0f, 1.0f);
    }

    public final View getFrameLineView() {
        return this.LLIZ;
    }

    public final int getItemCount() {
        return this.LL;
    }

    public final int getLastItemWidth() {
        return this.LLILZ;
    }

    public final int getNormalItemWidth() {
        return this.LLILLL;
    }

    public final RecyclerView getRecyclerView() {
        return this.LLILZLL;
    }

    public final View getShadowView() {
        return this.LLJ;
    }

    public final int getTotalPage() {
        return this.LLILLJJLI;
    }

    public final void setAdapter(AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry) {
        this.LLILZLL.setAdapter(abstractC21673619ry);
        this.LLILZIL = 0.0f;
    }

    public final void setFrameLineView(View view) {
        this.LLIZ = view;
    }

    public final void setItemCount(int i) {
        this.LL = i;
    }

    public final void setLastItemWidth(int i) {
        this.LLILZ = i;
    }

    public final void setNormalItemWidth(int i) {
        this.LLILLL = i;
    }

    public final void setOnScrollListener(InterfaceC19723812Ey interfaceC19723812Ey) {
        this.LLJI = interfaceC19723812Ey;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        this.LLILZLL = recyclerView;
    }

    public final void setShadowView(View view) {
        this.LLJ = view;
    }

    public final void setTotalPage(int i) {
        this.LLILLJJLI = i;
    }

    public C19723512Ev(final Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        this.LL = 7;
        this.LLILLJJLI = 1;
        RecyclerView recyclerView = new RecyclerView(context, attributeSet);
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.tools.chat.extract.view.AiChatChooseVideoFrameView$recyclerView$1$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
                RecyclerView.LayoutParams layoutParamsGenerateDefaultLayoutParams = super.generateDefaultLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParamsGenerateDefaultLayoutParams).height = this.LLJIJIL;
                return layoutParamsGenerateDefaultLayoutParams;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
                if (layoutParams != null) {
                    int i = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                    int i2 = this.LLJIJIL;
                    if (i != i2) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = i2;
                    }
                }
                return super.checkLayoutParams(layoutParams);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
                RecyclerView.LayoutParams layoutParamsGenerateLayoutParams = super.generateLayoutParams(layoutParams);
                ((ViewGroup.MarginLayoutParams) layoutParamsGenerateLayoutParams).height = this.LLJIJIL;
                return layoutParamsGenerateLayoutParams;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final RecyclerView.LayoutParams generateLayoutParams(Context context2, AttributeSet attributeSet2) {
                RecyclerView.LayoutParams layoutParamsGenerateLayoutParams = super.generateLayoutParams(context2, attributeSet2);
                ((ViewGroup.MarginLayoutParams) layoutParamsGenerateLayoutParams).height = this.LLJIJIL;
                return layoutParamsGenerateLayoutParams;
            }
        });
        recyclerView.setHasFixedSize(true);
        recyclerView.setClipToPadding(false);
        int iLJIIJ = C12ES.LJIIJ(context) / 2;
        recyclerView.setPadding(iLJIIJ, 0, iLJIIJ, 0);
        this.LLILZLL = recyclerView;
        View view = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        final float fLIZJ = C12ES.LIZJ(2.0f, context);
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
        view.setBackground(gradientDrawable);
        view.setElevation(C12ES.LIZJ(4.0f, context));
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0GZi
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                int iLIZJ = (int) C12ES.LIZJ(2.0f, context);
                outline.setRoundRect(0, iLIZJ, view2.getWidth(), view2.getHeight() - iLIZJ, fLIZJ);
            }
        });
        this.LLIZ = view;
        this.LLIZLLLIL = new ACListenerS163S0100000_29(this, 157);
        View view2 = new View(context, attributeSet);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        view2.setBackgroundColor(iIntValue);
        view2.setOutlineProvider(new C0IDA(C366700EZg.LIZIZ(8.0d, context), 5));
        view2.setClipToOutline(true);
        this.LLJ = view2;
        int iLIZJ = (int) C12ES.LIZJ(56.0f, context);
        this.LLJIJIL = iLIZJ;
        C19773212Xy c19773212Xy = new C19773212Xy(this, 2);
        setClipChildren(false);
        setClipToPadding(false);
        setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iLIZJ);
        layoutParams.gravity = 17;
        this.LLILZLL.addItemDecoration(c19773212Xy);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, iLIZJ);
        layoutParams2.gravity = 19;
        layoutParams2.leftMargin = C12ES.LJIIJ(context) / 2;
        addView(this.LLJ, layoutParams2);
        addView(this.LLILZLL, layoutParams);
        final float fLIZIZ = C366700EZg.LIZIZ(8.0d, getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) C12ES.LIZJ(3.0f, context), (int) C12ES.LIZJ(76.0f, context));
        layoutParams3.gravity = 17;
        addView(this.LLIZ, layoutParams3);
        this.LLILZLL.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.12Ew
            @Override // X.InterfaceC21676519sR
            public final void m3(View view3) {
            }

            @Override // X.InterfaceC21676519sR
            public final void g5(View view3) {
                C786410Ut5.LJLLLLLL(8, this.LL.getShadowView());
                int childAdapterPosition = this.LL.getRecyclerView().getChildAdapterPosition(view3);
                int itemCount = this.LL.getItemCount();
                if (childAdapterPosition == -1) {
                    return;
                }
                if (childAdapterPosition >= itemCount) {
                    C786410Ut5.LJLLLLLL(8, view3);
                    return;
                }
                int iIntValue2 = 0;
                C786410Ut5.LJLLLLLL(0, view3);
                if (childAdapterPosition == 0) {
                    view3.setClipToOutline(true);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, context);
                    if (numLIZJ2 != null) {
                        iIntValue2 = numLIZJ2.intValue();
                    }
                    view3.setBackgroundColor(iIntValue2);
                    final float f = fLIZIZ;
                    final int i = 0;
                    view3.setOutlineProvider(new ViewOutlineProvider(f, i) { // from class: X.12Xu
                        public final int $t;
                        public float f0;

                        @Override // android.view.ViewOutlineProvider
                        public final void getOutline(View view4, Outline outline) {
                            switch (this.$t) {
                                case 0:
                                    getOutline$0(this, view4, outline);
                                    break;
                                case 1:
                                    getOutline$1(this, view4, outline);
                                    break;
                                default:
                                    super.getOutline(view4, outline);
                                    break;
                            }
                        }

                        {
                            this.$t = i;
                            this.f0 = f;
                        }

                        public static final void getOutline$0(C19772812Xu c19772812Xu, View view4, Outline outline) {
                            outline.setRoundRect(0, 0, ((int) c19772812Xu.f0) + view4.getWidth(), view4.getHeight(), c19772812Xu.f0);
                        }

                        public static final void getOutline$1(C19772812Xu c19772812Xu, View view4, Outline outline) {
                            outline.setRoundRect(-((int) c19772812Xu.f0), 0, view4.getWidth(), view4.getHeight(), c19772812Xu.f0);
                        }
                    });
                } else if (childAdapterPosition == itemCount - 1) {
                    view3.setClipToOutline(true);
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a03, context);
                    if (numLIZJ3 != null) {
                        iIntValue2 = numLIZJ3.intValue();
                    }
                    view3.setBackgroundColor(iIntValue2);
                    final float f2 = fLIZIZ;
                    final int i2 = 1;
                    view3.setOutlineProvider(new ViewOutlineProvider(f2, i2) { // from class: X.12Xu
                        public final int $t;
                        public float f0;

                        @Override // android.view.ViewOutlineProvider
                        public final void getOutline(View view4, Outline outline) {
                            switch (this.$t) {
                                case 0:
                                    getOutline$0(this, view4, outline);
                                    break;
                                case 1:
                                    getOutline$1(this, view4, outline);
                                    break;
                                default:
                                    super.getOutline(view4, outline);
                                    break;
                            }
                        }

                        {
                            this.$t = i2;
                            this.f0 = f2;
                        }

                        public static final void getOutline$0(C19772812Xu c19772812Xu, View view4, Outline outline) {
                            outline.setRoundRect(0, 0, ((int) c19772812Xu.f0) + view4.getWidth(), view4.getHeight(), c19772812Xu.f0);
                        }

                        public static final void getOutline$1(C19772812Xu c19772812Xu, View view4, Outline outline) {
                            outline.setRoundRect(-((int) c19772812Xu.f0), 0, view4.getWidth(), view4.getHeight(), c19772812Xu.f0);
                        }
                    });
                } else {
                    view3.setClipToOutline(true);
                    Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a03, context);
                    if (numLIZJ4 != null) {
                        iIntValue2 = numLIZJ4.intValue();
                    }
                    view3.setBackgroundColor(iIntValue2);
                    view3.setOutlineProvider(new ViewOutlineProvider() { // from class: X.12Ex
                        @Override // android.view.ViewOutlineProvider
                        public final void getOutline(View view4, Outline outline) {
                            outline.setRect(0, 0, view4.getWidth(), view4.getHeight());
                        }
                    });
                }
                C786410Ut5.I7(this.LL.LLIZLLLIL, view3);
                view3.invalidateOutline();
            }
        });
        this.LLILZLL.addOnScrollListener(new AsS55S0100000_29(this, 7));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
