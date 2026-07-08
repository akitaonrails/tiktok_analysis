package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS694S0100000_12;

/* JADX INFO: renamed from: X.0Tig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C754480Tig extends ConstraintLayout {
    public C1127920fSQ LL;
    public Function1<? super Boolean, Unit> LLILLJJLI;
    public Function1<? super Boolean, Unit> LLILLL;
    public final C1324720kZq LLILZ;

    public final Integer getRealGalleryIconSize$livegift_impl_release() {
        C1324720kZq c1324720kZq = this.LLILZ;
        if (c1324720kZq != null) {
            return Integer.valueOf(c1324720kZq.getWidth());
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void setGalleryShowListener$livegift_impl_release(Function1<? super Boolean, Unit> function1) {
        this.LLILLJJLI = function1;
    }

    public final void setOnClickListener$livegift_impl_release(Function1<? super Boolean, Unit> function1) {
        this.LLILLL = function1;
    }

    public C754480Tig(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void e0(C1127920fSQ c1127920fSQ, Boolean bool) {
        ImageModel imageModel;
        ImageModel imageModel2 = null;
        if (c1127920fSQ != null) {
            imageModel = c1127920fSQ.LIZIZ;
        } else {
            imageModel = null;
        }
        C1127920fSQ c1127920fSQ2 = this.LL;
        if (c1127920fSQ2 != null) {
            imageModel2 = c1127920fSQ2.LIZIZ;
        }
        if (!Intrinsics.LJFF(imageModel, imageModel2) && c1127920fSQ != null) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(c1127920fSQ.LIZIZ);
            int i = getLayoutParams().width;
            int i2 = getLayoutParams().height;
            c1324610kZfLJIIIZ.LJI = i;
            c1324610kZfLJIIIZ.LJII = i2;
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_INSIDE;
            c1324610kZfLJIIIZ.LJJI(this.LLILZ);
        }
        this.LL = c1127920fSQ;
        Function1<? super Boolean, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(Intrinsics.LJFF(bool, Boolean.TRUE)));
        }
    }

    public C754480Tig(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.hzg, this);
        this.LLILZ = (C1324720kZq) findViewById(R.id.jvh);
        C786410Ut5.I7(new AbS694S0100000_12(this, 21), this);
    }
}
