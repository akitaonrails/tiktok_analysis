package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Di, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.utils.MultiMatchUtilsKt$removeEffectIfApplied$1", f = "MultiMatchUtils.kt", l = {356}, m = "invokeSuspend")
public final class C1316805Di extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0UEA LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1316805Di(C0UEA c0uea, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = c0uea;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1316805Di(this.LLILZ, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiMatchUtilsKt@ede2.removeEffectIfApplied$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("victoryLapEffect, Removing effect, name: ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", resId: ");
            sbLIZ.append(this.LLILLL);
            C20441214yg.LIZIZ("MultiMatchUtils", C2188811AlT.LIZIZ(sbLIZ));
            C0UEA c0uea = this.LLILZ;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            this.LL = 1;
            if (c0uea.LJIIIZ(str, str2, this) == objLJFF) {
                C1C7U.LIZIZ("MultiMatchUtilsKt@ede2.removeEffectIfApplied$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiMatchUtilsKt@ede2.removeEffectIfApplied$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
