package X;

import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sbd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.StreamFetchOrchestrator$fetchFromDisk$1$1$hAsync$1", f = "StreamFetchOrchestrator.kt", l = {71}, m = "invokeSuspend")
public final class C1633350sbd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super HorizontalEffectsModel>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1633390sbh LLILLJJLI;
    public final /* synthetic */ C1633200sbO LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1633350sbd(InterfaceC1633390sbh interfaceC1633390sbh, C1633200sbO c1633200sbO, InterfaceC1364105Vn<? super C1633350sbd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1633390sbh;
        this.LLILLL = c1633200sbO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1633350sbd(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamFetchOrchestrator@9130.fetchFromDisk$1$1$hAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1633370sbf c1633370sbf = new C1633370sbf(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            obj = C1633670sc9.LIZ(this, c1633370sbf);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StreamFetchOrchestrator@9130.fetchFromDisk$1$1$hAsync$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StreamFetchOrchestrator@9130.fetchFromDisk$1$1$hAsync$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super HorizontalEffectsModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
