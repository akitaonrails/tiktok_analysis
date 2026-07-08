package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rxz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713010Rxz extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ReusedAssem<C03H5> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C713010Rxz(ReusedAssem<C03H5> reusedAssem) {
        super(0);
        this.LL = reusedAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC712990Rxx interfaceC712990Rxx;
        InterfaceC736810SvH interfaceC736810SvH = this.LL;
        if (interfaceC736810SvH != null && (interfaceC736810SvH instanceof InterfaceC712990Rxx) && (interfaceC712990Rxx = (InterfaceC712990Rxx) interfaceC736810SvH) != null) {
            interfaceC712990Rxx.unBind();
        }
        return Unit.LIZ;
    }
}
