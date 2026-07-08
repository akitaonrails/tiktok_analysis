package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.04Ib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1074304Ib extends FrameLayout {
    public static final /* synthetic */ int LLILLL = 0;
    public final C426160GnO LL;
    public Function2<? super Integer, ? super ReviewFilterStruct, Unit> LLILLJJLI;

    public final C426160GnO getFlow() {
        return this.LL;
    }

    public final Function2<Integer, ReviewFilterStruct, Unit> getListener() {
        return this.LLILLJJLI;
    }

    public final void setListener(Function2<? super Integer, ? super ReviewFilterStruct, Unit> function2) {
        this.LLILLJJLI = function2;
    }

    public final void setOnSelectedChangeListener(Function2<? super Integer, ? super ReviewFilterStruct, Unit> function2) {
        this.LLILLJJLI = function2;
    }

    public C1074304Ib(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C426160GnO c426160GnO = new C426160GnO(context, null, 6);
        C786410Ut5.a7(c426160GnO, new FrameLayout.LayoutParams(-1, -1));
        c426160GnO.setGravity(-1);
        this.LL = c426160GnO;
        addView(c426160GnO);
    }
}
