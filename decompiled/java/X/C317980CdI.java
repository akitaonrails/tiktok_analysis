package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CdI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.EffectProfileListRepository$refreshCommon$1$1", f = "EffectProfileListRepository.kt", l = {54, 64}, m = "invokeSuspend")
public final class C317980CdI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C09AJ<Pair<List<Object>, C1761680vwc>> LLILLL;
    public final /* synthetic */ C318050CdP LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317980CdI(C09AJ<Pair<List<Object>, C1761680vwc>> c09aj, C318050CdP c318050CdP, InterfaceC1364105Vn<? super C317980CdI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c09aj;
        this.LLILZ = c318050CdP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C317980CdI c317980CdI = new C317980CdI(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c317980CdI.LLILLJJLI = obj;
        return c317980CdI;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C317980CdI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
