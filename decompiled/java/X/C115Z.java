package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.115Z, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C115Z extends C0DXR {
    public final int LL;
    public final Paint LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;
    public final boolean LLIZ;

    public /* synthetic */ C115Z(Context context) {
        this(context, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
    }

    public C115Z(Context context, int i) {
        int iIntValue;
        this.LL = i;
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        paint.setAntiAlias(true);
        this.LLILLJJLI = paint;
        this.LLILLL = C11VU.LIZIZ(100.0f, context);
        this.LLILZ = C11VU.LIZIZ(76.0f, context);
        this.LLILZIL = C11VU.LIZIZ(18.0f, context);
        this.LLILZLL = C11VU.LIZ(0.5f);
        this.LLIZ = C11VU.LJFF(context);
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        boolean z;
        boolean z2;
        float f;
        Number numberValueOf;
        Number numberValueOf2;
        AnonymousClass1298 anonymousClass1298;
        int childCount = recyclerView.getChildCount() - 2;
        boolean z3 = false;
        boolean z4 = false;
        while (-1 < childCount) {
            View childAt = recyclerView.getChildAt(childCount);
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
            int itemViewType = childViewHolder.getItemViewType();
            if (z3) {
                z = false;
            } else {
                z = false;
            }
            boolean z5 = !z3;
            if (z4) {
                z4 = false;
                z5 = false;
            }
            if (itemViewType == 6) {
                z5 = false;
                z4 = true;
            } else if (itemViewType == 12 || itemViewType == 11) {
                z5 = false;
            }
            if ((childViewHolder instanceof AnonymousClass1298) && (anonymousClass1298 = (AnonymousClass1298) childViewHolder) != null && anonymousClass1298.LLILZIL) {
                z5 = false;
                z3 = true;
                z = true;
            }
            if ((childViewHolder instanceof AnonymousClass1290) && !z3) {
                MusicModel musicModel = ((AnonymousClass1290) childViewHolder).LLILLJJLI;
                if (musicModel != null && musicModel.isUnfold()) {
                    z5 = false;
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            if ((childViewHolder instanceof AnonymousClass1291) && !z3) {
                MusicModel musicModel2 = ((AnonymousClass1291) childViewHolder).LLJLL;
                if (musicModel2 != null && musicModel2.isLastSimilarMusic()) {
                    z2 = true;
                }
                z5 = true;
            }
            if (childAt.getAnimation() == null && childAt.getTranslationY() == 0.0f && childAt.getAlpha() == 1.0f && z5) {
                if (itemViewType != 7) {
                    if ((itemViewType == 9 || itemViewType == 10) && z2) {
                        f = this.LLILZIL;
                    } else {
                        f = this.LLILZ;
                    }
                } else {
                    f = this.LLILLL;
                }
                float bottom = childAt.getBottom();
                float f2 = bottom + this.LLILZLL;
                if (this.LLIZ) {
                    numberValueOf = 0;
                } else {
                    numberValueOf = Float.valueOf(f);
                }
                if (this.LLIZ) {
                    numberValueOf2 = Float.valueOf(recyclerView.getWidth() - f);
                } else {
                    numberValueOf2 = Integer.valueOf(recyclerView.getWidth());
                }
                canvas.drawRect(numberValueOf.floatValue(), bottom, numberValueOf2.floatValue(), f2, this.LLILLJJLI);
            }
            childCount--;
            z3 = z;
        }
    }

    @Override // X.C0DXR
    public void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition < 0) {
            return;
        }
        if (childAdapterPosition == 0) {
            rect.top = this.LL;
        }
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null && childAdapterPosition + 1 == adapter.getItemCount()) {
            rect.bottom = C341940Daq.LIZ(10.0d);
        }
    }
}
