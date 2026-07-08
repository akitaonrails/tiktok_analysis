package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardTextColorViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01D3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01D3 extends C09AY implements Function1<C01D5, Unit> {
    public final /* synthetic */ FullyCustomizedBoardTextColorViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01D3(FullyCustomizedBoardTextColorViewModel fullyCustomizedBoardTextColorViewModel) {
        super(1);
        this.LL = fullyCustomizedBoardTextColorViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C01D5 c01d5) {
        int i;
        C01D5 c01d52 = c01d5;
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (c01d52.LLILLL == 3) {
            i = R.raw.icon_color_text_transparent;
        } else {
            c419910GdJ.LJ = Integer.valueOf(R.attr.c9i);
            int i2 = c01d52.LLILLL;
            if (i2 != 0) {
                if (i2 != 1) {
                    i = R.raw.icon_text_background;
                } else {
                    i = R.raw.icon_text_outline;
                }
            } else {
                i = R.raw.icon_text_stroke;
            }
        }
        c419910GdJ.LIZ = i;
        this.LL.setState(new C01D6(c419910GdJ));
        return Unit.LIZ;
    }
}
