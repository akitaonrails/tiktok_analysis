package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08qj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.TTSFetchEffectAbilityFactory$getTTSFetchEffectAbility$1$fetchEffectsOnlyCategory$2", f = "TTSFetchEffectAbilityFactory.kt", l = {48, 66}, m = "invokeSuspend")
public final class C2243908qj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C2247008rE LLILZ;
    public InterfaceC497601wk LLILZIL;
    public C013C LLILZLL;
    public Object LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ C2247008rE LLJIJIL;
    public final /* synthetic */ Function1<EffectCategoryModel, Boolean> LLJILJIL;
    public final /* synthetic */ Map<String, String> LLJILJILJ;
    public final /* synthetic */ List<List<ReadTextEffectBean>> LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2243908qj(C2247008rE c2247008rE, Function1<? super EffectCategoryModel, Boolean> function1, Map<String, String> map, List<List<ReadTextEffectBean>> list, InterfaceC1364105Vn<? super C2243908qj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJIJIL = c2247008rE;
        this.LLJILJIL = function1;
        this.LLJILJILJ = map;
        this.LLJILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2243908qj c2243908qj = new C2243908qj(this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
        c2243908qj.LLJI = obj;
        return c2243908qj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.05Vn, X.099V, kotlin.coroutines.CoroutineContext$Element] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r23v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0069 -> B:7:0x0037). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x019a -> B:10:0x0044). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2243908qj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
