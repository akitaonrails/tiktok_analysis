package X;

import android.content.MutableContextWrapper;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15qR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.popup.dynamic.spark.FeedPopupSparkManager$load$1", f = "FeedPopupSparkManager.kt", l = {}, m = "invokeSuspend")
public final class C20644915qR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20644815qQ LL;
    public final /* synthetic */ InterfaceC20646115qd LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20644915qR(C20644815qQ c20644815qQ, InterfaceC20646115qd interfaceC20646115qd, InterfaceC1364105Vn<? super C20644915qR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20644815qQ;
        this.LLILLJJLI = interfaceC20646115qd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20644915qR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedPopupSparkManager@3661.load$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final C20644815qQ c20644815qQ = this.LL;
        final InterfaceC20646115qd interfaceC20646115qd = this.LLILLJJLI;
        c20644815qQ.getClass();
        c20644815qQ.LIZLLL = EnumC20574215f2.LLILLL;
        C20644415qM c20644415qMLIZ = C20644515qN.LIZ(c20644815qQ.LIZ);
        if (c20644415qMLIZ == null) {
            C20644815qQ.LIZ(c20644815qQ, interfaceC20646115qd, "invalid_key", false, 24);
        } else {
            C1303560k1i c1303560k1i = C20644815qQ.LJIIIIZZ;
            synchronized (c1303560k1i) {
                try {
                    if (c1303560k1i.get(c20644415qMLIZ) != null) {
                        C20644815qQ.LIZ(c20644815qQ, interfaceC20646115qd, "duplicate_load", false, 24);
                    } else {
                        C844470XAv.LIZ.getClass();
                        MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(C844470XAv.LIZ());
                        SparkContext sparkContextLIZIZ = c20644815qQ.LIZIZ(mutableContextWrapper, c20644815qQ.LIZ, interfaceC20646115qd);
                        if (sparkContextLIZIZ == null) {
                            C20644815qQ.LIZ(c20644815qQ, interfaceC20646115qd, "spark_context_null", false, 24);
                        } else {
                            try {
                                C1541950qED.LIZJ.getClass();
                                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(mutableContextWrapper, sparkContextLIZIZ).LIZ(false);
                                c20644815qQ.LIZJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
                                c1303560k1i.put(c20644415qMLIZ, c20644815qQ);
                                C20589415hU.LIZIZ("load: create spark, id=" + sparkContextLIZIZ.containerId);
                                sparkContextLIZIZ.LJJJJZI(new AbstractC1542200qEc() { // from class: X.15qV
                                    public String LLILLJJLI;

                                    @Override // X.AbstractC1537870q7d
                                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                                        C20589415hU.LIZ("onLoadFinish");
                                        String str = this.LLILLJJLI;
                                        if (str != null) {
                                            C20644815qQ c20644815qQ2 = c20644815qQ;
                                            InterfaceC20646115qd interfaceC20646115qd2 = interfaceC20646115qd;
                                            c20644815qQ2.getClass();
                                            C05QD.LIZ(new RunnableC20645215qU(c20644815qQ2, "spark_load_failed", true, str, true, interfaceC20646115qd2));
                                        }
                                    }

                                    @Override // X.AbstractC1537870q7d
                                    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
                                        C20645815qa c20645815qa = c20644815qQ.LIZIZ;
                                        if (c20645815qa != null) {
                                            C20645815qa.LIZ(c20645815qa, EnumC20645715qZ.LOAD, EnumC20645615qY.ON_START_RENDER);
                                        }
                                    }

                                    @Override // X.AbstractC1537870q7d
                                    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("onLoadFailed info=");
                                        sbLIZ.append(c20644815qQ.LIZ.LIZ());
                                        sbLIZ.append(", url ");
                                        sbLIZ.append(str);
                                        sbLIZ.append(", hybridKitError ");
                                        sbLIZ.append(c1542120qEU.LIZIZ);
                                        C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                                        this.LLILLJJLI = String.valueOf(c1542120qEU.LIZ);
                                    }
                                });
                                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                                if (c20644815qQ.LIZ.triggerTimeout > 0) {
                                    C23250099c.LIZLLL(C05QD.LIZ, null, null, new C1303550k1h(c20644815qQ, interfaceC20646115qd, null), 3);
                                }
                                C20589415hU.LIZ("load: finish load");
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1720106oR.LIZIZ("FeedPopupLog", "DynamicPopupLog", e);
                                C20644815qQ.LIZ(c20644815qQ, interfaceC20646115qd, "spark_view_error", true, 24);
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedPopupSparkManager@3661.load$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
