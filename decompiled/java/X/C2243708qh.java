package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08qh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.DataSpeechFetchEffectAbility$fetchEffectsOnlyCategory$2", f = "DataSpeechFetchEffectAbility.kt", l = {35, BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C2243708qh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public C2246808rC LLILLL;
    public Object LLILZ;
    public InterfaceC1635390sev LLILZIL;
    public Function2 LLILZLL;
    public InterfaceC497601wk LLIZ;
    public C013C LLIZLLLIL;
    public Object LLJ;
    public int LLJI;
    public int LLJIJIL;
    public /* synthetic */ Object LLJILJIL;
    public final /* synthetic */ C2246808rC LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ InterfaceC1635390sev LLJJ;
    public final /* synthetic */ Function1<EffectCategoryModel, Boolean> LLJJI;
    public final /* synthetic */ List<List<Object>> LLJJIII;
    public final /* synthetic */ Function2<EffectCategoryModel, Effect, Object> LLJJIJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2243708qh(C2246808rC c2246808rC, String str, InterfaceC1635390sev interfaceC1635390sev, Function1<? super EffectCategoryModel, Boolean> function1, List<List<Object>> list, Function2<? super EffectCategoryModel, ? super Effect, Object> function2, InterfaceC1364105Vn<? super C2243708qh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJILJ = c2246808rC;
        this.LLJILLL = str;
        this.LLJJ = interfaceC1635390sev;
        this.LLJJI = function1;
        this.LLJJIII = list;
        this.LLJJIJI = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2243708qh c2243708qh = new C2243708qh(this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, interfaceC1364105Vn);
        c2243708qh.LLJILJIL = obj;
        return c2243708qh;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0070 -> B:7:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0184 -> B:10:0x0047). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2243708qh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
