package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06Nf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1597306Nf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ViewGroup LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ SmartImageView LLILZ;
    public final /* synthetic */ ComposeView LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1597306Nf(ViewGroup viewGroup, int i, int i2, SmartImageView smartImageView, ComposeView composeView) {
        super(0);
        this.LL = viewGroup;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = smartImageView;
        this.LLILZIL = composeView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        float fMin = Math.min(this.LL.getWidth() / this.LLILLJJLI, this.LL.getHeight() / this.LLILLL);
        int i = (int) (this.LLILLJJLI * fMin);
        int i2 = (int) (this.LLILLL * fMin);
        for (View view : C1697810uHb.LJIIJJI(this.LLILZ, this.LLILZIL)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            C786410Ut5.W5(view, layoutParams);
        }
        this.LLILZ.requestLayout();
        this.LLILZIL.requestLayout();
        return Unit.LIZ;
    }
}
