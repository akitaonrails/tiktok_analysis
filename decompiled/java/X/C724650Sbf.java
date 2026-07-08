package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sbf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724650Sbf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ReusedUIAssem<RECEIVER> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724650Sbf(ReusedUIAssem<RECEIVER> reusedUIAssem) {
        super(0);
        this.LL = reusedUIAssem;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ReusedUIAssem<RECEIVER> reusedUIAssem = this.LL;
        reusedUIAssem.track$assem_release(EnumC738160SxS.ON_CREATE_VIEW, new C724680Sbi(reusedUIAssem));
        return Unit.LIZ;
    }
}
