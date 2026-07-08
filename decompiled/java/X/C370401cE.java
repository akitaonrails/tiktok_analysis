package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.AlgorithmConfig;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Config;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Effect;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01cE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.EffectParserKt$parseEffect$2$deferredModelNames$1", f = "EffectParser.kt", l = {}, m = "invokeSuspend")
public final class C370401cE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ Gson LL;
    public final /* synthetic */ Config LLILLJJLI;
    public final /* synthetic */ AlgorithmConfig LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C370401cE(Gson gson, Config config, AlgorithmConfig algorithmConfig, InterfaceC1364105Vn<? super C370401cE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = gson;
        this.LLILLJJLI = config;
        this.LLILLL = algorithmConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C370401cE(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, List<String>> mapLJ;
        Map<String, List<String>> mapLJ2;
        String json;
        C1C7U.LIZ("EffectParserKt@53dc.parseEffect$2$deferredModelNames$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Gson gson = this.LL;
        Config config = this.LLILLJJLI;
        AlgorithmConfig algorithmConfig = this.LLILLL;
        Effect effect = config.effect;
        if (effect == null || (mapLJ = effect.modelNames) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        if (algorithmConfig == null || (mapLJ2 = algorithmConfig.modelNames) == null) {
            mapLJ2 = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C200800py.LIZ(linkedHashMap, mapLJ);
        C200800py.LIZ(linkedHashMap, mapLJ2);
        if (linkedHashMap.isEmpty()) {
            json = "";
        } else {
            json = GsonProtectorUtils.toJson(gson, linkedHashMap);
        }
        C1C7U.LIZIZ("EffectParserKt@53dc.parseEffect$2$deferredModelNames$1");
        return json;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
