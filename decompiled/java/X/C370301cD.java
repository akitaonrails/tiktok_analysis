package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.Config;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.TiktokEffectHouse;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01cD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.EffectParserKt$parseEffect$2$deferredSdkExtra$1", f = "EffectParser.kt", l = {}, m = "invokeSuspend")
public final class C370301cD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ Gson LL;
    public final /* synthetic */ Config LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C370301cD(Gson gson, Config config, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, InterfaceC1364105Vn<? super C370301cD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = gson;
        this.LLILLJJLI = config;
        this.LLILLL = map;
        this.LLILZ = map2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C370301cD(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        TiktokEffectHouse tiktokEffectHouse;
        C1C7U.LIZ("EffectParserKt@53dc.parseEffect$2$deferredSdkExtra$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Gson gson = this.LL;
        Config config = this.LLILLJJLI;
        Map<String, Object> map = this.LLILLL;
        Map<String, Object> map2 = this.LLILZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (config != null && (tiktokEffectHouse = config.tiktokEffectHouse) != null) {
            str = tiktokEffectHouse.toolVersion;
        } else {
            str = null;
        }
        linkedHashMap.put("isEHEffect", Boolean.valueOf(C123100dR.LIZ(str)));
        if (map2 != null) {
            linkedHashMap.put("triggerJson", map2);
        }
        String json = GsonProtectorUtils.toJson(gson, linkedHashMap);
        C1C7U.LIZIZ("EffectParserKt@53dc.parseEffect$2$deferredSdkExtra$1");
        return json;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
