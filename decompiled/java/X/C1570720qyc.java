package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.MallMainActivityAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qyc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.ui.MallMainActivityAssem$checkMallTabState$1", f = "MallMainActivityAssem.kt", l = {}, m = "invokeSuspend")
public final class C1570720qyc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MallMainActivityAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570720qyc(MallMainActivityAssem mallMainActivityAssem, InterfaceC1364105Vn<? super C1570720qyc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mallMainActivityAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1570720qyc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        String str2;
        C1C7U.LIZ("MallMainActivityAssem@49df.checkMallTabState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1570730qyd c1570730qyd = C1570730qyd.LIZ;
            C01GW c01gw = C1570730qyd.LIZIZ;
            boolean z2 = false;
            boolean z3 = ((Keva) c01gw.getValue()).getBoolean("last_check_has_mall", false);
            C0CXF.LIZ.getClass();
            boolean zLIZLLL = C0CXF.LIZLLL();
            Keva keva = (Keva) c01gw.getValue();
            if (zLIZLLL) {
                z = true;
            } else {
                z = false;
            }
            keva.storeBoolean("last_check_has_mall", z);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            if (zLIZLLL) {
                z2 = true;
            }
            C1557600qdS c1557600qdS = new C1557600qdS(z3, z2);
            c2341109Fh.getClass();
            C2341109Fh.LIZIZ(c1557600qdS);
            if (z3 != zLIZLLL) {
                boolean zLIZJ = C0CXF.LIZJ();
                boolean zLIZIZ = C0CXF.LIZIZ();
                String str3 = "";
                if (!zLIZJ && !zLIZIZ) {
                    str2 = "";
                } else {
                    C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
                    if (c19egLIZ != null) {
                        C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                        if (zLIZJ) {
                            str = "Shop";
                        } else {
                            str = "SHOP_MALL";
                        }
                        c1584320rKY.getClass();
                        str2 = (String) C1584320rKY.LIZIZ(c19egLIZ, str).getFirst();
                        if (str2 != null) {
                        }
                    }
                    C1767950w6j c1767950w6j = C1767950w6j.LIZ;
                    boolean zLIZ = C0CXF.LIZ();
                    c1767950w6j.getClass();
                    C1767950w6j.LJJIIZ(str3, zLIZJ, zLIZIZ, zLIZ);
                }
                str3 = str2;
                C1767950w6j c1767950w6j2 = C1767950w6j.LIZ;
                boolean zLIZ2 = C0CXF.LIZ();
                c1767950w6j2.getClass();
                C1767950w6j.LJJIIZ(str3, zLIZJ, zLIZIZ, zLIZ2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MallMainActivityAssem@49df.checkMallTabState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
