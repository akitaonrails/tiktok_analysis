package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.viewmodel.PcsIndustrySelectVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.viewmodel.PcsIndustrySelectVM$fetchIndustryList$2", f = "PcsIndustrySelectVM.kt", l = {128, 132, 136, 138}, m = "invokeSuspend")
public final class C1784820wXw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ PcsIndustrySelectVM LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784820wXw(PcsIndustrySelectVM pcsIndustrySelectVM, InterfaceC1364105Vn<? super C1784820wXw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = pcsIndustrySelectVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1784820wXw c1784820wXw = new C1784820wXw(this.LLILZIL, interfaceC1364105Vn);
        c1784820wXw.LLILZ = obj;
        return c1784820wXw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024a A[LOOP:3: B:132:0x0244->B:134:0x024a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0287 A[LOOP:4: B:143:0x0281->B:145:0x0287, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0195  */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1784820wXw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
