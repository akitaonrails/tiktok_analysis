package X;

import com.bytedance.ies.nle.editor_jni.NLEMediaUtil;
import com.bytedance.ies.nle.editor_jni.VecString;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.utils.PreloadVeVideoInfo$preloadVeVideoInfo$6", f = "PreloadVeVideoInfo.kt", l = {}, m = "invokeSuspend")
public final class C351930Dqx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351930Dqx(List<String> list, InterfaceC1364105Vn<? super C351930Dqx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C351930Dqx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreloadVeVideoInfo@1b67.preloadVeVideoInfo$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0FGC.LIZ(2);
        NLEMediaUtil.preloadMediaInfo(new VecString(this.LL), null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreloadVeVideoInfo@1b67.preloadVeVideoInfo$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
