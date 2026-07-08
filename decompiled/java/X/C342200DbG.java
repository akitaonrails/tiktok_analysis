package X;

import com.bytedance.effectcreatormobile.infrastructure.ui.widgets.creator.fragment.PrefabViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DbG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.ui.widgets.creator.fragment.PrefabViewModel$selectCategory$1", f = "PrefabViewModel.kt", l = {74, 86, 88}, m = "invokeSuspend")
public final class C342200DbG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public PrefabViewModel LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public C342250DbL LLILZLL;
    public C342250DbL LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ PrefabViewModel<Object, AbstractC342230DbJ<Object>> LLJ;
    public final /* synthetic */ Integer LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C342200DbG(PrefabViewModel<Object, AbstractC342230DbJ<Object>> prefabViewModel, Integer num, InterfaceC1364105Vn<? super C342200DbG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = prefabViewModel;
        this.LLJI = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C342200DbG(this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0059 -> B:24:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0094 -> B:32:0x00af). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C342200DbG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
