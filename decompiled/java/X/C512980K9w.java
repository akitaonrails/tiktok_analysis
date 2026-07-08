package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512980K9w extends C09AY implements Function1<C512990K9x, Unit> {
    public final /* synthetic */ C16FS LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C512980K9w(C16FS c16fs) {
        super(1);
        this.LL = c16fs;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C512990K9x c512990K9x) {
        C512990K9x c512990K9x2 = c512990K9x;
        this.LL.LJIIL();
        if (c512990K9x2.LIZ && c512990K9x2.LIZIZ.length() > 0) {
            this.LL.setText(C497740JfY.LJIJJ(2131852273, c512990K9x2.LIZIZ));
        } else {
            this.LL.setText(C497740JfY.LJIJI(2131852275));
        }
        return Unit.LIZ;
    }
}
