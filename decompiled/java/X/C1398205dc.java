package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.05dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.helper.Tool$suspendCompressRes$2", f = "Tool.kt", l = {}, m = "invokeSuspend")
public final class C1398205dc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ EnumC2479809ng LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1398205dc(int i, int i2, EnumC2479809ng enumC2479809ng, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = enumC2479809ng;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1398205dc(this.LLILLL, this.LLILZ, this.LLILZIL, this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("Tool@ecaf.suspendCompressRes$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0VSJ c0vsj = new C0VSJ(this.LL);
        String name = c0vsj.getName();
        String str2 = "";
        if (this.LLILLJJLI) {
            if (!a0.LJJIIZI(name, e3.d, false)) {
                str = "";
            } else {
                str = (String) C13LP.LJJLIIIJJI(a0.LJJLIIIJILLIZJL(name, new String[]{e3.d}, 0, 6));
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C20130113pb.LJ(c0vsj));
            sbLIZ.append('.');
            sbLIZ.append(str);
            name = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ttmd5 cost = ");
            sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C1706630uVp.LIZ("AME-editor", C2188811AlT.LIZIZ(sbLIZ2));
        }
        String strLIZ = C2479509nd.LIZ(this.LL, C1335810krj.LIZJ(C1335810krj.LIZ, name), this.LLILLL, this.LLILZ, this.LLILZIL, 16);
        if (strLIZ.length() > 0 && new C0VSJ(strLIZ).exists()) {
            str2 = strLIZ;
        }
        C1C7U.LIZIZ("Tool@ecaf.suspendCompressRes$2");
        return str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
