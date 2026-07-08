package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.08ox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$makeUploadEffectIcon$2", f = "MobileEffectUtil.kt", l = {563}, m = "invokeSuspend")
public final class C2232908ox extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1738190vKj<String>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2232908ox(String str, String str2, InterfaceC1364105Vn<? super C2232908ox> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2232908ox(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MobileEffectUtilKt@ccb6.makeUploadEffectIcon$2");
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
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0VSJ c0vsjLJIIJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.ADVANCED_MOBILE_EFFECT, "", true);
            String str = this.LLILLJJLI;
            String strSubstring = str.substring(a0.LJJJJI(str, "/", 0, 6) + 1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(strSubstring);
            String absolutePath = C08QA.LJIL(c0vsjLJIIJ, C2188811AlT.LIZIZ(sbLIZ)).getAbsolutePath();
            C2354709Kn.LIZLLL(this.LLILLJJLI, absolutePath);
            this.LL = 1;
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C2169708el(jCurrentTimeMillis, absolutePath, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.makeUploadEffectIcon$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.makeUploadEffectIcon$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1738190vKj<String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
