package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creation.sender.AIGroupShotSender$initiateProcess$2$onFailed$1", f = "AIGroupShotSender.kt", l = {234}, m = "invokeSuspend")
public final class C911990Zq9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public AbstractC912050ZqF LLILLJJLI;
    public EnumC900350ZTt LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public C0Y8T LLILZLL;
    public Object LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public final /* synthetic */ AbstractC912050ZqF LLJI;
    public final /* synthetic */ List<String> LLJIJIL;
    public final /* synthetic */ EnumC900350ZTt LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C911990Zq9(AbstractC912050ZqF abstractC912050ZqF, List<String> list, EnumC900350ZTt enumC900350ZTt, InterfaceC1364105Vn<? super C911990Zq9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = abstractC912050ZqF;
        this.LLJIJIL = list;
        this.LLJILJIL = enumC900350ZTt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C911990Zq9(this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Path cross not found for [B:10:0x0039, B:26:0x00ae], limit reached: 39 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ac -> B:6:0x002d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C911990Zq9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
