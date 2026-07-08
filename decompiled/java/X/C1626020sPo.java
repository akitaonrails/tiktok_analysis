package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.MobileEffectExportWorkflowImpl$generateCreativeDirAsync$2", f = "MobileEffectExportWorkflowImpl.kt", l = {}, m = "invokeSuspend")
public final class C1626020sPo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super File>, Object> {
    public final /* synthetic */ C1622410sJz LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626020sPo(C1622410sJz c1622410sJz, String str, boolean z, InterfaceC1364105Vn<? super C1626020sPo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1622410sJz;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626020sPo(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MobileEffectExportWorkflowImpl@479.generateCreativeDirAsync$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1622410sJz c1622410sJz = this.LL;
        String str = this.LLILLJJLI;
        boolean z = this.LLILLL;
        c1622410sJz.getClass();
        C0VSJ c0vsjLJIILLIIL = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILLIIL(c1622410sJz.LL.creativeInfo, EnumC20228214Cy.MOBILE_EFFECT, str, z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prop dir generated, propDir=");
        sbLIZ.append(c0vsjLJIILLIIL.getAbsolutePath());
        C201955140j.LIZIZ("MET-JEFF", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("MobileEffectExportWorkflowImpl@479.generateCreativeDirAsync$2");
        return c0vsjLJIILLIIL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super File> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
