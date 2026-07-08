package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0Kv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.AssetHandler$downloadResource$1$1$path$1", f = "AssetHandler.kt", l = {}, m = "invokeSuspend")
public final class C532870Kv7 extends C09AX implements Function2<Asset, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends String>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C532980KvI LLILLJJLI;
    public final /* synthetic */ EffectManager LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532870Kv7(C532980KvI c532980KvI, EffectManager effectManager, InterfaceC1364105Vn<? super C532870Kv7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c532980KvI;
        this.LLILLL = effectManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532870Kv7 c532870Kv7 = new C532870Kv7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c532870Kv7.LL = obj;
        return c532870Kv7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AssetHandler@472b.downloadResource$1$1$path$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Asset asset = (Asset) this.LL;
        C532980KvI c532980KvI = this.LLILLJJLI;
        EffectManager effectManager = this.LLILLL;
        c532980KvI.getClass();
        b bVarLJ = C09IC.LJ(new C533020KvM(c532980KvI, asset, effectManager, null));
        C1C7U.LIZIZ("AssetHandler@472b.downloadResource$1$1$path$1");
        return bVarLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Asset asset, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends String>> interfaceC1364105Vn) {
        return ((a) create(asset, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
