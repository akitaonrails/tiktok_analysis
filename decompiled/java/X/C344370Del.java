package X;

import android.view.ContextThemeWrapper;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Del, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344370Del extends C09AY implements Function1<C197039127h, Unit> {
    public final /* synthetic */ ContextThemeWrapper LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C344370Del(ContextThemeWrapper contextThemeWrapper) {
        super(1);
        this.LL = contextThemeWrapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C197039127h c197039127h) {
        C197039127h c197039127h2 = c197039127h;
        c197039127h2.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, this.LL));
        c197039127h2.LJJLI(true);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.eyv);
        c384050F3z.LIZJ = Float.valueOf((int) C497740JfY.LIZIZ(99.0f));
        c197039127h2.setBackground(c384050F3z.LIZ(this.LL));
        return Unit.LIZ;
    }
}
