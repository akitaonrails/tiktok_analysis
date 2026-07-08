package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0J2E, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J2E extends C09AY implements Function1<C995730c1D, Unit> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0J2E(View view) {
        super(1);
        this.LL = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C995730c1D c995730c1D) {
        C0J2B c0j2b = new C0J2B(this.LL.getContext());
        c0j2b.LJ = R.attr.dvp;
        c0j2b.LIZIZ = C497740JfY.LJIJI(2131851442);
        c0j2b.LIZJ = 3000L;
        c0j2b.LIZLLL = 0;
        c0j2b.LIZIZ((ViewGroup) this.LL);
        return Unit.LIZ;
    }
}
