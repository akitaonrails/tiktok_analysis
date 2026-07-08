package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10ZY, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.tiktok.kmp.shareprop.Long2ShortRequest$request$1", f = "Long2ShortRequest.kt", l = {55}, m = "invokeSuspend")
public final class C10ZY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function1<C1377190lwT, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10ZY(int i, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10ZY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn, this.LLILZLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1377190lwT c1377190lwT;
        boolean z;
        String str;
        C19266410Za c19266410Za;
        Integer num;
        String str2;
        String str3;
        Object objLIZIZ;
        String strLIZIZ;
        Object objLIZ = obj;
        C1C7U.LIZ("Long2ShortRequest@5d7f.request$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = false;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZ);
            } else {
                C155000ia.LIZIZ(objLIZ);
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, String.valueOf(this.LLILLJJLI)), new Pair("platform_id", this.LLILLL), new Pair("share_url", this.LLILZ));
                String str4 = this.LLILZIL;
                if (str4 == null || str4.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    mapLJIIJ.put("extra", this.LLILZIL);
                }
                C1904800zfS.LIZ.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://");
                sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                if (strLIZIZ2 == null) {
                    strLIZIZ2 = "https://api-si.tiktokv.com";
                }
                C1501820pBU c1501820pBU = new C1501820pBU(strLIZIZ2, "/tiktok/share/link/shorten/v1/", new C219200sw(mapLJIIJ));
                C19267510Zl c19267510Zl = C19267510Zl.LIZ;
                this.LL = 1;
                c19267510Zl.getClass();
                objLIZ = C1501840pBW.LIZ.LIZ(c1501820pBU, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("Long2ShortRequest@5d7f.request$1");
                    return objLJFF;
                }
            }
            C1501900pBc c1501900pBc = (C1501900pBc) objLIZ;
            C1501870pBZ c1501870pBZ = c1501900pBc.LIZJ;
            if (c1501870pBZ != null) {
                str = c1501870pBZ.LIZ;
            } else {
                str = null;
            }
            String str5 = "";
            if (str == null) {
                str = "";
            }
            int i2 = c1501900pBc.LIZ;
            if (200 <= i2 && i2 < 300) {
                z2 = true;
            }
            if (!z2) {
                Integer numLJ = C2286608xc.LJ(i2);
                Exception exc = c1501900pBc.LIZLLL;
                if (exc == null || (strLIZIZ = exc.getMessage()) == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("http code ");
                    sbLIZ2.append(c1501900pBc.LIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                c1377190lwT = new C1377190lwT(strLIZIZ, str, numLJ, 1);
            } else {
                if (c1501870pBZ != null) {
                    try {
                        objLIZIZ = C13J2.LIZ(new Function1<C13J1, Unit>() { // from class: X.10Zh
                            @Override // kotlin.jvm.functions.Function1
                            public final Unit invoke(C13J1 c13j1) {
                                c13j1.LIZJ = true;
                                return Unit.LIZ;
                            }
                        }).LIZIZ(C19266410Za.Companion.serializer(), c1501870pBZ.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        objLIZIZ = null;
                    }
                    c19266410Za = (C19266410Za) objLIZIZ;
                } else {
                    c19266410Za = null;
                }
                if (c19266410Za != null && (str3 = c19266410Za.LIZ) != null) {
                    str5 = str3;
                }
                if (c19266410Za != null) {
                    num = c19266410Za.LIZIZ;
                } else {
                    num = null;
                }
                if (c19266410Za == null) {
                    str2 = null;
                } else {
                    str2 = c19266410Za.LIZJ;
                }
                c1377190lwT = new C1377190lwT(str5, num, str2, true, str);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Integer numLJ2 = C2286608xc.LJ(-1);
            String message = e.getMessage();
            if (message == null) {
                message = "exception";
            }
            c1377190lwT = new C1377190lwT(message, null, numLJ2, 17);
        }
        this.LLILZLL.invoke(c1377190lwT);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Long2ShortRequest@5d7f.request$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
