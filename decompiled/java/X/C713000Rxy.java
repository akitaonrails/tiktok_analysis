package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rxy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713000Rxy extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ReusedAssem<C03H5> LL;
    public final /* synthetic */ InterfaceC1587906Jp LLILLJJLI;
    public final /* synthetic */ List<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C713000Rxy(ReusedAssem<C03H5> reusedAssem, InterfaceC1587906Jp interfaceC1587906Jp, List<? extends Object> list) {
        super(0);
        this.LL = reusedAssem;
        this.LLILLJJLI = interfaceC1587906Jp;
        this.LLILLL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC712990Rxx interfaceC712990Rxx;
        InterfaceC736810SvH interfaceC736810SvH = this.LL;
        interfaceC736810SvH.getClass();
        if ((interfaceC736810SvH instanceof InterfaceC712990Rxx) && (interfaceC712990Rxx = (InterfaceC712990Rxx) interfaceC736810SvH) != null) {
            interfaceC712990Rxx.sr(this.LLILLJJLI, this.LLILLL);
        }
        return Unit.LIZ;
    }
}
