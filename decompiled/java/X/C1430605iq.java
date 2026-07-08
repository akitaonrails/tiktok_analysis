package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.VideoMixEditingMaterialComponent$preDownloadAsset$1$onFail$1", f = "VideoMixEditingMaterialComponent.kt", l = {}, m = "invokeSuspend")
public final class C1430605iq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1413530mt5 LL;
    public final /* synthetic */ C1412800mru LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1430605iq(C1413530mt5 c1413530mt5, C1412800mru c1412800mru, InterfaceC1364105Vn<? super C1430605iq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1413530mt5;
        this.LLILLJJLI = c1412800mru;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1430605iq(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoMixEditingMaterialComponent@1cfb.preDownloadAsset$1$onFail$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLLIIIIL.remove(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoMixEditingMaterialComponent@1cfb.preDownloadAsset$1$onFail$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
