package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03p8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C960003p8 extends AbstractC1335900krs {
    public final /* synthetic */ TuxIconView LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    public C960003p8(TuxIconView tuxIconView, int i, Function0<Unit> function0) {
        this.LL = tuxIconView;
        this.LLILLJJLI = i;
        this.LLILLL = function0;
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        Function0<Unit> function0 = this.LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        if (c428600GrK != null) {
            TuxIconView tuxIconView = this.LL;
            int i = this.LLILLJJLI;
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            layoutParams.height = i;
            layoutParams.width = C814420VxA.LIZIZ((i / c428600GrK.LIZIZ) * c428600GrK.LIZ);
            C786410Ut5.M6(tuxIconView, layoutParams);
            tuxIconView.requestLayout();
        }
    }
}
