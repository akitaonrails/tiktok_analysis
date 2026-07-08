package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724520SbS extends C09AY implements Function1<ReusedAssem<?>, Unit> {

    /* JADX INFO: Incorrect field signature: TT; */
    public final /* synthetic */ InterfaceC1587906Jp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public C724520SbS(InterfaceC1587906Jp interfaceC1587906Jp) {
        super(1);
        this.LL = interfaceC1587906Jp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ReusedAssem<?> reusedAssem) {
        ReusedAssem<?> reusedAssem2 = reusedAssem;
        if (C725080ScM.LJJIIJZLJL) {
            reusedAssem2.LLILLL = true;
        }
        reusedAssem2.ho(this.LL);
        return Unit.LIZ;
    }
}
