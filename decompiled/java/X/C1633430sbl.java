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

/* JADX INFO: renamed from: X.0sbl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.StreamFetchOrchestrator$collectStreamWithRetry$2", f = "StreamFetchOrchestrator.kt", l = {132}, m = "invokeSuspend")
public final class C1633430sbl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<Map<String, String>, InterfaceC346201Wa<InterfaceC1633610sc3>> LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ C1633470sbp LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ C1633200sbO LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ AnonymousClass0957<Pair<HorizontalEffectsModel, PanelInfoModel>> LLJ;
    public final /* synthetic */ C118300cf LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ InterfaceC1633390sbh LLJILJIL;
    public final /* synthetic */ List<C09AE> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1633430sbl(Function1<? super Map<String, String>, ? extends InterfaceC346201Wa<? extends InterfaceC1633610sc3>> function1, Map<String, String> map, C1633470sbp c1633470sbp, C013C c013c, C1633200sbO c1633200sbO, int i, AnonymousClass0957<? extends Pair<HorizontalEffectsModel, ? extends PanelInfoModel>> anonymousClass0957, C118300cf c118300cf, int i2, InterfaceC1633390sbh interfaceC1633390sbh, List<C09AE> list, InterfaceC1364105Vn<? super C1633430sbl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
        this.LLILZ = map;
        this.LLILZIL = c1633470sbp;
        this.LLILZLL = c013c;
        this.LLIZ = c1633200sbO;
        this.LLIZLLLIL = i;
        this.LLJ = anonymousClass0957;
        this.LLJI = c118300cf;
        this.LLJIJIL = i2;
        this.LLJILJIL = interfaceC1633390sbh;
        this.LLJILJILJ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1633430sbl c1633430sbl = new C1633430sbl(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c1633430sbl.LLILLJJLI = obj;
        return c1633430sbl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamFetchOrchestrator@9130.collectStreamWithRetry$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            InterfaceC346201Wa<InterfaceC1633610sc3> interfaceC346201WaInvoke = this.LLILLL.invoke(this.LLILZ);
            C1633460sbo c1633460sbo = new C1633460sbo(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC497601wk, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ);
            this.LL = 1;
            if (interfaceC346201WaInvoke.collect(c1633460sbo, this) == objLJFF) {
                C1C7U.LIZIZ("StreamFetchOrchestrator@9130.collectStreamWithRetry$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamFetchOrchestrator@9130.collectStreamWithRetry$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
