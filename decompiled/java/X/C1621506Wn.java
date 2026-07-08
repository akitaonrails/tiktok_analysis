package X;

import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06Wn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1621506Wn extends C09AY implements Function1<C197039127h, Unit> {
    public final /* synthetic */ C197039127h LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1621506Wn(C197039127h c197039127h) {
        super(1);
        this.LL = c197039127h;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C197039127h c197039127h) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ey7);
        c384050F3z.LIZJ = Float.valueOf(C497740JfY.LIZIZ(12.0f));
        c197039127h.setBackground(c384050F3z.LIZ(this.LL.getContext()));
        return Unit.LIZ;
    }
}
