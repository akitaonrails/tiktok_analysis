package X;

import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sbb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.StreamFetchOrchestrator$fetchFromDisk$1", f = "StreamFetchOrchestrator.kt", l = {70}, m = "invokeSuspend")
public final class C1633330sbb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends HorizontalEffectsModel, ? extends PanelInfoModel>>, Object> {
    public int LL;
    public final /* synthetic */ C1633470sbp LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ InterfaceC1633390sbh LLILZ;
    public final /* synthetic */ C1633200sbO LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1633330sbb(C1633470sbp c1633470sbp, int i, InterfaceC1633390sbh interfaceC1633390sbh, C1633200sbO c1633200sbO, InterfaceC1364105Vn<? super C1633330sbb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1633470sbp;
        this.LLILLL = i;
        this.LLILZ = interfaceC1633390sbh;
        this.LLILZIL = c1633200sbO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1633330sbb(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamFetchOrchestrator@9130.fetchFromDisk$1");
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
            C1633340sbc c1633340sbc = new C1633340sbc(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            obj = C2296808zG.LJ(c1633340sbc, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StreamFetchOrchestrator@9130.fetchFromDisk$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StreamFetchOrchestrator@9130.fetchFromDisk$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends HorizontalEffectsModel, ? extends PanelInfoModel>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
