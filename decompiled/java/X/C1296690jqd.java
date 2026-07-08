package X;

import Y.ARunnableS5S1110000_20;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0jqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.matchv2.component.basic.LiveMatchBasicScoreComponent$prepareAnimaXViewJson$1", f = "LiveMatchBasicScoreComponent.kt", l = {}, m = "invokeSuspend")
public final class C1296690jqd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C15DF LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1288630jdd LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1296690jqd(C15DF c15df, String str, String str2, TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd, boolean z, InterfaceC1364105Vn<? super C1296690jqd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c15df;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = textureViewSurfaceTextureListenerC1288630jdd;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1296690jqd(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveMatchBasicScoreComponent@a46c.prepareAnimaXViewJson$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C15DF c15df = this.LL;
        String str = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(File.separator);
        sbLIZ.append("data.json");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c15df.getClass();
        String strLJIIL = C15DF.LJIIL(str, strLIZIZ);
        if (strLJIIL == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LiveMatchBasicScoreComponent@a46c.prepareAnimaXViewJson$1");
            return unit;
        }
        String strLJJIFFI = u.LJJIFFI(strLJIIL, "{local_path}", C1143780fs0.LJIIJ(this.LLILLJJLI, this.LLILLL), false);
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = this.LLILZ;
        HandlerHook.viewPost(textureViewSurfaceTextureListenerC1288630jdd, new ARunnableS5S1110000_20(textureViewSurfaceTextureListenerC1288630jdd, strLJJIFFI, this.LLILZIL, 4));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveMatchBasicScoreComponent@a46c.prepareAnimaXViewJson$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
