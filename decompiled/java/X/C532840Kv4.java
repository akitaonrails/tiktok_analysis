package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.model.MaterialResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0Kv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.MaterialHandler$downloadSingleMaterial$downloadedPath$1", f = "MaterialHandler.kt", l = {}, m = "invokeSuspend")
public final class C532840Kv4 extends C09AX implements Function2<MaterialResource, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends String>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C532910KvB LLILLJJLI;
    public final /* synthetic */ EffectManager LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532840Kv4(C532910KvB c532910KvB, EffectManager effectManager, InterfaceC1364105Vn<? super C532840Kv4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c532910KvB;
        this.LLILLL = effectManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532840Kv4 c532840Kv4 = new C532840Kv4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c532840Kv4.LL = obj;
        return c532840Kv4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MaterialHandler@ef69.downloadSingleMaterial$downloadedPath$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MaterialResource materialResource = (MaterialResource) this.LL;
        C532910KvB c532910KvB = this.LLILLJJLI;
        EffectManager effectManager = this.LLILLL;
        c532910KvB.getClass();
        b bVarLJ = C09IC.LJ(new C532960KvG(effectManager, materialResource, null));
        C1C7U.LIZIZ("MaterialHandler@ef69.downloadSingleMaterial$downloadedPath$1");
        return bVarLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MaterialResource materialResource, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends String>> interfaceC1364105Vn) {
        return ((a) create(materialResource, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
