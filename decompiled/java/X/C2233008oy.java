package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$zipAdvancedEffect$2", f = "MobileEffectUtil.kt", l = {}, m = "invokeSuspend")
public final class C2233008oy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1738190vKj<String>>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2233008oy(String str, String str2, InterfaceC1364105Vn<? super C2233008oy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2233008oy(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1738190vKj c1738190vKj;
        C1C7U.LIZ("MobileEffectUtilKt@ccb6.zipAdvancedEffect$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0VSJ c0vsjLJIIJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.ADVANCED_MOBILE_EFFECT, "", true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("_effect.zip");
        File fileLJIL = C08QA.LJIL(c0vsjLJIIJ, C2188811AlT.LIZIZ(sbLIZ));
        try {
            if (((Boolean) C2233108oz.LIZ.getValue()).booleanValue()) {
                AbstractC2233208p0 abstractC2233208p0LIZIZ = C2233408p2.LIZIZ(fileLJIL.getAbsolutePath(), this.LLILLJJLI);
                if (abstractC2233208p0LIZIZ instanceof C2233508p3) {
                    c1738190vKj = new C1738190vKj(true, fileLJIL.getAbsolutePath(), 0, null, System.currentTimeMillis() - jCurrentTimeMillis, null, 44);
                } else {
                    c1738190vKj = new C1738190vKj(false, null, -9001, ((C2233308p1) abstractC2233208p0LIZIZ).LIZ, System.currentTimeMillis() - jCurrentTimeMillis, null, 34);
                }
            } else if (C08SB.LJ(fileLJIL.getAbsolutePath(), this.LLILLJJLI)) {
                c1738190vKj = new C1738190vKj(true, fileLJIL.getAbsolutePath(), 0, null, System.currentTimeMillis() - jCurrentTimeMillis, null, 44);
            } else {
                c1738190vKj = new C1738190vKj(false, null, -9001, "", System.currentTimeMillis() - jCurrentTimeMillis, null, 34);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("failed to zip effect package, e=");
            sbLIZ2.append(th);
            C201955140j.LJIIIIZZ(c20012313Rx, "DiyProp", C2188811AlT.LIZIZ(sbLIZ2));
            c1738190vKj = new C1738190vKj(false, null, -9001, th.getMessage(), System.currentTimeMillis() - jCurrentTimeMillis, null, 34);
        }
        C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.zipAdvancedEffect$2");
        return c1738190vKj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1738190vKj<String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
