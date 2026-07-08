package X;

import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0sbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.StreamFetchOrchestrator$collectStreamWithRetry$2$1$1", f = "StreamFetchOrchestrator.kt", l = {}, m = "invokeSuspend")
public final class C1633440sbm extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1633390sbh LL;
    public final /* synthetic */ C1633200sbO LLILLJJLI;
    public final /* synthetic */ HorizontalEffectsModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1633440sbm(InterfaceC1633390sbh interfaceC1633390sbh, C1633200sbO c1633200sbO, HorizontalEffectsModel horizontalEffectsModel, InterfaceC1364105Vn<? super C1633440sbm> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = interfaceC1633390sbh;
        this.LLILLJJLI = c1633200sbO;
        this.LLILLL = horizontalEffectsModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1633440sbm(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamFetchOrchestrator@9130.collectStreamWithRetry$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamFetchOrchestrator@9130.collectStreamWithRetry$2$1$1");
        return unit;
    }
}
