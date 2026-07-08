package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10AC, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C10AC extends C2217421BqW implements Function1<View, Unit> {
    public C10AC(Object obj) {
        super(1, obj, C10A6.class, "handleDisabledPreviewCLickListener", "handleDisabledPreviewCLickListener(Landroid/view/View;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        int i;
        View view2 = view;
        Aweme awemeLJJJIL = ((C10A6) this.receiver).LJJJIL();
        if (awemeLJJJIL != null && awemeLJJJIL.getAwemeType() == 0) {
            i = 2131830346;
        } else if (C287230BNp.LIZ()) {
            i = 2131839523;
        } else {
            i = 2131839524;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(view2);
        c1389890mGx.LJIIIZ(i);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }
}
