package X;

import Y.ARunnableS97S0200000_28;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeGalleryLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.10LM, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10LM extends AbstractC683590Qrd<UserWithAweme> implements C10LV, C10LW {
    public final RecSwipeGalleryLayoutManager LL;
    public final Function0<Unit> LLILLJJLI;
    public final String LLILLL;
    public AwS607S0100000_28 LLILZ;
    public C10LS LLILZIL;
    public RecyclerView LLILZLL;
    public final C01GW LLIZ;

    @Override // X.C10LW
    public final void LJ() {
        this.LLILLJJLI.invoke();
    }

    public final void LLLFZ() {
        ViewGroup.LayoutParams layoutParams;
        int iLIZIZ;
        RecyclerView recyclerView = this.LLILZLL;
        if (recyclerView == null || (layoutParams = recyclerView.getLayoutParams()) == null || layoutParams.height == (iLIZIZ = C19228210Ki.LIZIZ(recyclerView.getContext()))) {
            return;
        }
        layoutParams.height = iLIZIZ;
        C786410Ut5.p6(recyclerView, layoutParams);
    }

    @Override // X.C10LV
    public final void LIZIZ(int i) {
        int i2 = this.LL.LLILZIL;
        RecyclerView recyclerView = this.LLILZLL;
        if (i2 >= 0 && i2 == i && recyclerView != null && !recyclerView.isAnimating()) {
            List<UserWithAweme> data = getData();
            if (data != null) {
                ListProtector.remove(data, i2);
            }
            notifyItemRemoved(i2);
            AwS607S0100000_28 awS607S0100000_28 = this.LLILZ;
            if (awS607S0100000_28 != null) {
                awS607S0100000_28.invoke(Integer.valueOf(i2));
            }
            List<UserWithAweme> data2 = getData();
            if (data2 == null || data2.size() <= 1) {
                HandlerHook.viewPost(recyclerView, new ARunnableS97S0200000_28(recyclerView, this, 33));
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractC683590Qrd
    public final void addData(List<? extends UserWithAweme> list) {
        if (list != null && !list.isEmpty()) {
            List<T> list2 = this.mmItems;
            if (list2 != 0) {
                list2.addAll(list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            this.mmItems = arrayList;
        }
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLILZLL = recyclerView;
        LLLFZ();
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.LLILZLL = null;
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        boolean z = viewHolder instanceof C10LU;
    }

    public C10LM(RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager, AwS572S0100000_28 awS572S0100000_28) {
        super(false);
        this.LL = recSwipeGalleryLayoutManager;
        this.LLILLJJLI = awS572S0100000_28;
        this.LLILLL = "homepage_follow";
        this.LLIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1331));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0514 A[PHI: r8
      0x0514: PHI (r8v30 java.lang.String) = (r8v11 java.lang.String), (r8v11 java.lang.String), (r8v31 java.lang.String) binds: [B:57:0x01dc, B:59:0x01e2, B:101:0x0513] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01dc A[PHI: r8
      0x01dc: PHI (r8v11 java.lang.String) = (r8v10 java.lang.String), (r8v10 java.lang.String), (r8v10 java.lang.String), (r8v32 java.lang.String) binds: [B:51:0x01cf, B:53:0x01d3, B:55:0x01d9, B:56:0x01db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0473  */
    @Override // X.AbstractC438050HFr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r22, int r23) {
        /*
            Method dump skipped, instruction units count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10LM.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        int iLIZIZ;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i_1, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        if (layoutParams != null) {
            int i2 = C19227610Kc.LIZ[C19228210Ki.LIZ(viewTd.getContext()).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(370));
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(323));
                }
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(295));
            }
            layoutParams.width = iLIZIZ;
            C786410Ut5.W5(viewTd, layoutParams);
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(26));
        Drawable drawableLIZ = c384050F3z.LIZ(viewTd.getContext());
        drawableLIZ.setAlpha(25);
        viewTd.setBackground(drawableLIZ);
        final DisplayMetrics displayMetrics = viewTd.getResources().getDisplayMetrics();
        viewTd.setForeground(new Drawable(displayMetrics) { // from class: X.0Eak
            public final float LIZ;
            public final float LIZIZ;
            public final int[] LIZJ;
            public final float[] LIZLLL;
            public final Paint LJ;
            public final RectF LJFF;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            {
                float f = displayMetrics.density;
                this.LIZ = 26.0f * f;
                float f2 = f * 0.5f;
                this.LIZIZ = f2;
                this.LIZJ = new int[]{1728053247, 16777215, 16777215};
                this.LIZLLL = new float[]{0.0f, 0.406f, 1.0f};
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(f2);
                this.LJ = paint;
                this.LJFF = new RectF();
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                RectF rectF = this.LJFF;
                float f = this.LIZ;
                canvas.drawRoundRect(rectF, f, f, this.LJ);
            }

            @Override // android.graphics.drawable.Drawable
            public final void onBoundsChange(Rect rect) {
                super.onBoundsChange(rect);
                float fWidth = rect.width();
                float fHeight = rect.height();
                if (fWidth > 0.0f && fHeight > 0.0f) {
                    float f = this.LIZIZ / 2.0f;
                    this.LJFF.set(rect.left + f, rect.top + f, rect.right - f, rect.bottom - f);
                    float f2 = fWidth / 2.0f;
                    float f3 = fHeight / 2.0f;
                    float f4 = (f2 * 0.04014f) + (f3 * 0.99919f);
                    float f5 = rect.left + f2;
                    float f6 = rect.top + f3;
                    float f7 = 0.04014f * f4;
                    float f8 = f4 * 0.99919f;
                    this.LJ.setShader(new LinearGradient(f5 - f7, f6 - f8, f5 + f7, f6 + f8, this.LIZJ, this.LIZLLL, Shader.TileMode.CLAMP));
                }
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i3) {
                this.LJ.setAlpha(i3);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LJ.setColorFilter(colorFilter);
            }
        });
        return new C10LU(viewTd, this, this, this.LL);
    }
}
