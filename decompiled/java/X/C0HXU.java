package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HXU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HXU extends FrameLayout {
    public final View LL;
    public final C21415018rM LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public Integer LLILZIL;
    public Integer LLILZLL;
    public CharSequence LLIZ;
    public Function1<? super ImageView, Unit> LLIZLLLIL;

    public final Function1<ImageView, Unit> getCustomImage$search_release() {
        return this.LLIZLLLIL;
    }

    public final View getView() {
        return this.LL;
    }

    public C0HXU(Context context) {
        super(context, null, R.attr.z6);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hb, this, true);
        this.LL = viewTd;
        this.LLILLJJLI = (C21415018rM) viewTd.findViewById(R.id.o8v);
        this.LLILLL = 52;
        this.LLILZ = -16777216;
    }

    public final void setCustomImage$search_release(Function1<? super ImageView, Unit> function1) {
        this.LLIZLLLIL = function1;
        if (function1 != null) {
            ImageView imageView = (ImageView) this.LL.findViewById(R.id.kb6);
            C786410Ut5.LJZI(0, imageView);
            function1.invoke(imageView);
        }
    }
}
