package X;

import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0sbf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.StreamFetchOrchestrator$fetchFromDisk$1$1$hAsync$1$1", f = "StreamFetchOrchestrator.kt", l = {}, m = "invokeSuspend")
public final class C1633370sbf extends C09AX implements Function1<InterfaceC1364105Vn<? super HorizontalEffectsModel>, Object> {
    public final /* synthetic */ InterfaceC1633390sbh LL;
    public final /* synthetic */ C1633200sbO LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1633370sbf(InterfaceC1633390sbh interfaceC1633390sbh, C1633200sbO c1633200sbO, InterfaceC1364105Vn<? super C1633370sbf> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = interfaceC1633390sbh;
        this.LLILLJJLI = c1633200sbO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1633370sbf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super HorizontalEffectsModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamFetchOrchestrator@9130.fetchFromDisk$1$1$hAsync$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        HorizontalEffectsModel horizontalEffectsModelLIZ = this.LL.LIZ(this.LLILLJJLI);
        C1C7U.LIZIZ("StreamFetchOrchestrator@9130.fetchFromDisk$1$1$hAsync$1$1");
        return horizontalEffectsModelLIZ;
    }
}
