package X;

import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.StreamFetchOrchestrator$fetchFromNetwork$1", f = "StreamFetchOrchestrator.kt", l = {108}, m = "invokeSuspend")
public final class C1633320sba extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1633470sbp LLILLL;
    public final /* synthetic */ Function1<Map<String, String>, InterfaceC346201Wa<InterfaceC1633610sc3>> LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ C1633200sbO LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ InterfaceC1633390sbh LLIZLLLIL;
    public final /* synthetic */ AnonymousClass0957<Pair<HorizontalEffectsModel, PanelInfoModel>> LLJ;
    public final /* synthetic */ List<C09AE> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1633320sba(C1633470sbp c1633470sbp, Function1<? super Map<String, String>, ? extends InterfaceC346201Wa<? extends InterfaceC1633610sc3>> function1, Map<String, String> map, C1633200sbO c1633200sbO, int i, InterfaceC1633390sbh interfaceC1633390sbh, AnonymousClass0957<? extends Pair<HorizontalEffectsModel, ? extends PanelInfoModel>> anonymousClass0957, List<C09AE> list, InterfaceC1364105Vn<? super C1633320sba> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1633470sbp;
        this.LLILZ = function1;
        this.LLILZIL = map;
        this.LLILZLL = c1633200sbO;
        this.LLIZ = i;
        this.LLIZLLLIL = interfaceC1633390sbh;
        this.LLJ = anonymousClass0957;
        this.LLJI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1633320sba c1633320sba = new C1633320sba(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c1633320sba.LLILLJJLI = obj;
        return c1633320sba;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamFetchOrchestrator@9130.fetchFromNetwork$1");
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
            C1633470sbp c1633470sbp = this.LLILLL;
            Function1<Map<String, String>, InterfaceC346201Wa<InterfaceC1633610sc3>> function1 = this.LLILZ;
            Map<String, String> map = this.LLILZIL;
            C1633200sbO c1633200sbO = this.LLILZLL;
            int i2 = this.LLIZ;
            InterfaceC1633390sbh interfaceC1633390sbh = this.LLIZLLLIL;
            AnonymousClass0957<Pair<HorizontalEffectsModel, PanelInfoModel>> anonymousClass0957 = this.LLJ;
            List<C09AE> list = this.LLJI;
            this.LL = 1;
            if (c1633470sbp.LIZ(function1, map, c1633200sbO, i2, interfaceC1633390sbh, anonymousClass0957, list, this) == objLJFF) {
                C1C7U.LIZIZ("StreamFetchOrchestrator@9130.fetchFromNetwork$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamFetchOrchestrator@9130.fetchFromNetwork$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
