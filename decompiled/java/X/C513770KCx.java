package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageSheet;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513770KCx extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubPackagePageSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C513770KCx(SubPackagePageSheet subPackagePageSheet) {
        super(1);
        this.LL = subPackagePageSheet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        SubPackagePageSheet subPackagePageSheet = this.LL;
        assembler.RQ2(subPackagePageSheet, new C513780KCy(subPackagePageSheet));
        return Unit.LIZ;
    }
}
