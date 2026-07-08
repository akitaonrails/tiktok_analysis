package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.sticker.repository.params.HorizontalEffectsFetcherRequest;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import njp.a;
import wuk.f;

/* JADX INFO: renamed from: X.0sbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerRepository$chunkedStreamFetch$1", f = "DefaultStickerRepository.kt", l = {}, m = "invokeSuspend")
public final class C1633060sbA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ HorizontalEffectsFetcherRequest LL;
    public final /* synthetic */ f LLILLJJLI;
    public final /* synthetic */ C1633200sbO LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1633060sbA(HorizontalEffectsFetcherRequest horizontalEffectsFetcherRequest, f fVar, C1633200sbO c1633200sbO, Map<String, String> map, String str, InterfaceC1364105Vn<? super C1633060sbA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = horizontalEffectsFetcherRequest;
        this.LLILLJJLI = fVar;
        this.LLILLL = c1633200sbO;
        this.LLILZ = map;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1633060sbA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iLIZ;
        C13RD effectConfig;
        C1C7U.LIZ("DefaultStickerRepository@bad7.chunkedStreamFetch$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C23052091m.LIZ() && this.LL.whitelistScene == -1) {
            InterfaceC23050091k interfaceC23050091k = this.LLILLJJLI.LJIILIIL;
            if (interfaceC23050091k != null) {
                iLIZ = interfaceC23050091k.LIZ();
            } else {
                iLIZ = 0;
            }
        } else {
            iLIZ = this.LL.whitelistScene;
        }
        EffectConfiguration effectConfigurationLJJIIZ = this.LLILLJJLI.LIZIZ.LJJIIZ();
        if (effectConfigurationLJJIIZ != null && (effectConfig = effectConfigurationLJJIIZ.getEffectConfig()) != null) {
            C1633200sbO c1633200sbOLIZ = C1633200sbO.LIZ(this.LLILLL, null, iLIZ, 5);
            HorizontalEffectsFetcherRequest horizontalEffectsFetcherRequest = this.LL;
            f fVar = this.LLILLJJLI;
            C13DA c13da = new C13DA();
            c13da.putAll(C13RE.LIZ(effectConfig, true));
            c13da.put("trending", String.valueOf(horizontalEffectsFetcherRequest.trending));
            c13da.put("favorite", String.valueOf(horizontalEffectsFetcherRequest.favorite));
            c13da.put("recent", String.valueOf(horizontalEffectsFetcherRequest.recent));
            String str = horizontalEffectsFetcherRequest.favoriteType;
            if (str != null) {
                c13da.put("favorite_type", str);
            }
            String str2 = horizontalEffectsFetcherRequest.recentType;
            if (str2 != null) {
                c13da.put("recent_type", str2);
            }
            c13da.put("recent_effects_limit", String.valueOf(horizontalEffectsFetcherRequest.recentEffectsLimit));
            if (iLIZ != 0) {
                c13da.put("allow_list", GsonProtectorUtils.toJson((Gson) fVar.LJJIZ.getValue(), C1630480sX0.LIZJ(iLIZ)));
            }
            Map<String, String> mapLIZ = new C1633070sbB(this.LLILZ).LIZ(c13da.build());
            C1633270sbV c1633270sbV = C1633270sbV.LIZIZ;
            f fVar2 = this.LLILLJJLI;
            c1633270sbV.LIZIZ(c1633200sbOLIZ, fVar2.LJIILJJIL, (C1633780scK) fVar2.LJJIL.getValue(), this.LLILZIL, new AwS569S0100000_25(mapLIZ, (Map<String, String>) 1134));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DefaultStickerRepository@bad7.chunkedStreamFetch$1");
            return unit;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
