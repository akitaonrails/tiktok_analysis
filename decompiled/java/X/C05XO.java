package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05XO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.live.effect.EffectManagerKtWrapper$fetchAndDownloadEffectList$1", f = "EffectManagerKtWrapper.kt", l = {428, 435}, m = "invokeSuspend")
public final class C05XO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0UDQ LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C0UDQ LLILZLL;
    public final /* synthetic */ List<String> LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;
    public final /* synthetic */ Function1<List<? extends Effect>, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05XO(C0UDQ c0udq, List<String> list, Map<String, String> map, Function1<? super List<? extends Effect>, Unit> function1, InterfaceC1364105Vn<? super C05XO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c0udq;
        this.LLIZ = list;
        this.LLIZLLLIL = map;
        this.LLJ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05XO(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004a -> B:7:0x0024). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05XO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
