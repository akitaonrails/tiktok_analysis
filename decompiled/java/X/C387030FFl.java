package X;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387030FFl extends C09AY implements Function1<LinearLayout, View> {
    public final /* synthetic */ C1637490siJ LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C387030FFl(C1637490siJ c1637490siJ, boolean z, int i) {
        super(1);
        this.LL = c1637490siJ;
        this.LLILLJJLI = z;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ View invoke(LinearLayout linearLayout) {
        TuxIconView tuxIconView = new TuxIconView(this.LL.requireSceneContext(), null, 0, 6, null);
        boolean z = this.LLILLJJLI;
        C1637490siJ c1637490siJ = this.LL;
        int i = this.LLILLL;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(iLIZIZ, iLIZIZ));
        if (z) {
            tuxIconView.LIZ();
        } else if (C960203pA.LIZIZ(c1637490siJ.requireSceneContext())) {
            tuxIconView.setTintColor(-1);
        }
        tuxIconView.setIconRes(i);
        return tuxIconView;
    }
}
