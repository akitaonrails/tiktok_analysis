package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qr0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566000qr0 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ Fragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566000qr0(Fragment fragment) {
        super(1);
        this.LL = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Fragment fragment = this.LL;
        assembler.DQ2(fragment, new C1565990qqz(fragment));
        return Unit.LIZ;
    }
}
