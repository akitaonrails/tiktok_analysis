package X;

import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CoZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoEnterUtil$checkPreloadAndShow$1$success$1", f = "TakoEnterUtil.kt", l = {756, 758, 1346}, m = "invokeSuspend")
public final class C324970CoZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C1863380yae LL;
    public InterfaceC497601wk LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ TakoEnterParams LLIZLLLIL;
    public final /* synthetic */ InterfaceC497601wk LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324970CoZ(long j, int i, int i2, int i3, TakoEnterParams takoEnterParams, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C324970CoZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = j;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = i3;
        this.LLIZLLLIL = takoEnterParams;
        this.LLJ = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324970CoZ(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324970CoZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
