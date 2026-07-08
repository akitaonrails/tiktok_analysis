package X;

import android.os.Build;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.hybrid.llm.LLMWebCollectRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uwq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.hybrid.llm.LLMUtilsKt$pipoCollectHtml$1$1$onReceiveSuccess$1", f = "LLMUtils.kt", l = {211}, m = "invokeSuspend")
public final class C1723380uwq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Object LLILLL;
    public final /* synthetic */ SparkContext LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1723380uwq(String str, Object obj, SparkContext sparkContext, InterfaceC1364105Vn<? super C1723380uwq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = obj;
        this.LLILZ = sparkContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1723380uwq(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        C1C7U.LIZ("LLMUtilsKt@da2.pipoCollectHtml$1$1$onReceiveSuccess$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str5 = this.LLILLJJLI;
            Object obj2 = this.LLILLL;
            String str6 = this.LLILZ.containerId;
            LLMWebCollectRequest lLMWebCollectRequest = null;
            try {
                C1723400uws c1723400uwsLIZ = C1723410uwt.LIZ(obj2);
                if (c1723400uwsLIZ != null) {
                    str3 = c1723400uwsLIZ.LIZIZ;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    C1725270uzt c1725270uzt = C1725270uzt.LIZ;
                    if (c1723400uwsLIZ == null || (str4 = c1723400uwsLIZ.LIZ) == null) {
                        str4 = "empty html";
                    }
                    c1725270uzt.LJIIIIZZ(str5, "js_error", str4);
                } else {
                    C1725270uzt.LIZ.LJIILIIL(c1723400uwsLIZ.LJII, c1723400uwsLIZ.LJI, c1723400uwsLIZ.LJFF, str6);
                    String str7 = Build.BRAND;
                    String strValueOf = String.valueOf(C1717770unn.LIZJ().getAppId());
                    String strValueOf2 = String.valueOf(C1717770unn.LIZJ().getVersionInfo().LIZIZ);
                    String str8 = c1723400uwsLIZ.LIZIZ;
                    String str9 = c1723400uwsLIZ.LIZJ;
                    Integer num = c1723400uwsLIZ.LIZLLL;
                    Integer num2 = c1723400uwsLIZ.LJ;
                    str = str5;
                    try {
                        lLMWebCollectRequest = new LLMWebCollectRequest(str8, str9, str5, num, num2, "android", str7, strValueOf, strValueOf2, "light");
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJ(th);
                        C1725270uzt.LIZ.LJIIIIZZ(str, "js_error", "generateRequestParams failed");
                        lLMWebCollectRequest = null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                str = str5;
            }
            boolean z = false;
            if (lLMWebCollectRequest != null && (str2 = lLMWebCollectRequest.html) != null) {
                boolean zLJ = C1533950q1J.LJ(str2);
                i = 1;
                if (zLJ) {
                    z = true;
                }
            } else {
                i = 1;
            }
            if (z) {
                String str10 = this.LLILLJJLI;
                this.LL = i;
                if (C23250099c.LJI(this, C0PEM.LIZJ, new C1723350uwn(str10, lLMWebCollectRequest, null)) == objLJFF) {
                    C1C7U.LIZIZ("LLMUtilsKt@da2.pipoCollectHtml$1$1$onReceiveSuccess$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LLMUtilsKt@da2.pipoCollectHtml$1$1$onReceiveSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
