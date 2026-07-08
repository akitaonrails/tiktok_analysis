package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CnT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.ui.anim.AdjustableFooterUtilKt$delayScrollToPositionWhenHeightReady$1$1$1", f = "AdjustableFooterUtil.kt", l = {330, 339}, m = "invokeSuspend")
public final class C324290CnT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C118300cf LL;
    public RecyclerView LLILLJJLI;
    public Function0 LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ Function1<Integer, Unit> LLJ;
    public final /* synthetic */ Function0<Integer> LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ RecyclerView LLJILJIL;
    public final /* synthetic */ long LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C324290CnT(long j, Function1<? super Integer, Unit> function1, Function0<Integer> function0, int i, RecyclerView recyclerView, long j2, InterfaceC1364105Vn<? super C324290CnT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = j;
        this.LLJ = function1;
        this.LLJI = function0;
        this.LLJIJIL = i;
        this.LLJILJIL = recyclerView;
        this.LLJILJILJ = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324290CnT(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0037 -> B:7:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004b -> B:7:0x0022). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324290CnT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
