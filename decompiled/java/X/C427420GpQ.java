package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427420GpQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ImageView LL;
    public final /* synthetic */ TuxIconDrawable LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C427420GpQ(ImageView imageView, TuxIconDrawable tuxIconDrawable, int i, float f, View view) {
        super(0);
        this.LL = imageView;
        this.LLILLJJLI = tuxIconDrawable;
        this.LLILLL = i;
        this.LLILZ = f;
        this.LLILZIL = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        this.LL.setImageDrawable(this.LLILLJJLI);
        ViewGroup.LayoutParams layoutParams3 = this.LL.getLayoutParams();
        if (layoutParams3 == null || layoutParams3.width != this.LLILLL || (layoutParams2 = this.LL.getLayoutParams()) == null || layoutParams2.height != this.LLILLL) {
            ImageView imageView = this.LL;
            int i = this.LLILLL;
            ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.width = i;
                layoutParams4.height = i;
            }
        }
        C786410Ut5.Cb(this.LL, this.LLILZ);
        ViewGroup.LayoutParams layoutParams5 = this.LLILZIL.getLayoutParams();
        if (layoutParams5 == null || layoutParams5.width != this.LLILLL || (layoutParams = this.LLILZIL.getLayoutParams()) == null || layoutParams.height != this.LLILLL) {
            View view = this.LLILZIL;
            int i2 = this.LLILLL;
            ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
            if (layoutParams6 != null) {
                layoutParams6.width = i2;
                layoutParams6.height = i2;
            }
        }
        return Unit.LIZ;
    }
}
