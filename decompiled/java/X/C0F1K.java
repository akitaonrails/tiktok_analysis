package X;

import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0F1K, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.ugctemplate.TemplateMagicProcessComponent$saveBmpAndCreateRenderProxy$fileInfo$1", f = "TemplateMagicProcessComponent.kt", l = {}, m = "invokeSuspend")
public final class C0F1K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VEUtils.VEVideoFileInfo>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F1K(String str, InterfaceC1364105Vn<? super C0F1K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0F1K(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateMagicProcessComponent@2539.saveBmpAndCreateRenderProxy$fileInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2356009La c2356009La = C2356009La.LIZ;
        String str = this.LL;
        c2356009La.getClass();
        VEUtils.VEVideoFileInfo vEVideoFileInfoLIZ = C2356009La.LIZ(str);
        C1C7U.LIZIZ("TemplateMagicProcessComponent@2539.saveBmpAndCreateRenderProxy$fileInfo$1");
        return vEVideoFileInfoLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VEUtils.VEVideoFileInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
