package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0F1L, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.ugctemplate.TemplateMagicProcessComponent$saveBmpAndCreateRenderProxy$4", f = "TemplateMagicProcessComponent.kt", l = {}, m = "invokeSuspend")
public final class C0F1L extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VEUtils.VEVideoFileInfo LL;
    public final /* synthetic */ NLETrackSlot LLILLJJLI;
    public final /* synthetic */ C0F1M LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F1L(VEUtils.VEVideoFileInfo vEVideoFileInfo, NLETrackSlot nLETrackSlot, C0F1M c0f1m, String str, InterfaceC1364105Vn<? super C0F1L> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = vEVideoFileInfo;
        this.LLILLJJLI = nLETrackSlot;
        this.LLILLL = c0f1m;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0F1L(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("TemplateMagicProcessComponent@2539.saveBmpAndCreateRenderProxy$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VEUtils.VEVideoFileInfo vEVideoFileInfo = this.LL;
        if (vEVideoFileInfo != null) {
            NLETrackSlot nLETrackSlot = this.LLILLJJLI;
            nLETrackSlot.setRenderProxy(this.LLILLL.I20(nLETrackSlot, vEVideoFileInfo, this.LLILZ));
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("TemplateMagicProcessComponent@2539.saveBmpAndCreateRenderProxy$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
