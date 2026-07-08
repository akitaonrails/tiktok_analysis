package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dlW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1062880dlW extends C09AY implements Function0<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> {
    public final /* synthetic */ C1062900dlY LL;
    public final /* synthetic */ C1057930ddX LLILLJJLI;
    public final /* synthetic */ IBEInfo LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ Function1<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1062880dlW(C1062900dlY c1062900dlY, C1057930ddX c1057930ddX, IBEInfo iBEInfo, String str, Context context, Function1<? super SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, Unit> function1, Function0<Unit> function0) {
        super(0);
        this.LL = c1062900dlY;
        this.LLILLJJLI = c1057930ddX;
        this.LLILLL = iBEInfo;
        this.LLILZ = str;
        this.LLILZIL = context;
        this.LLILZLL = function1;
        this.LLIZ = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB invoke() {
        final C1062900dlY c1062900dlY = this.LL;
        C1057930ddX c1057930ddX = this.LLILLJJLI;
        IBEInfo iBEInfo = this.LLILLL;
        final String str = this.LLILZ;
        Context context = this.LLILZIL;
        Function1<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, Unit> function1 = this.LLILZLL;
        Function0<Unit> function0 = this.LLIZ;
        c1062900dlY.getClass();
        C1063030dll.LIZ.getClass();
        c1057930ddX.log(C1063030dll.LIZLLL);
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        if (str != null) {
            sparkContext.LJJJZ("access_key", str);
            sparkContext.LJJ(AbstractC1076640e7i.class, new AbstractC1076640e7i() { // from class: X.0dlX
                @Override // X.AbstractC1076640e7i
                public final C1533560q0g LIZ(C1533560q0g c1533560q0g) {
                    String str2 = str;
                    C1533570q0h c1533570q0h = c1533560q0g.LIZIZ;
                    if (c1533570q0h != null) {
                        c1533570q0h.LIZ = str2;
                    }
                    return c1533560q0g;
                }
            });
        }
        sparkContext.LJJLIIJ(iBEInfo.lynxSchema);
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0dlU
            public boolean LLILLJJLI = true;

            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                Object obj;
                if (this.LLILLJJLI) {
                    ConcurrentHashMap<String, List<C1062850dlT>> concurrentHashMap = c1062900dlY.LIZ;
                    ArrayList arrayList = new ArrayList();
                    Iterator<Map.Entry<String, List<C1062850dlT>>> it2 = concurrentHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        C19719612Di.LJJI(it2.next().getValue(), arrayList);
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        obj = null;
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next = it3.next();
                        SparkContext sparkContext2 = ((C1062850dlT) next).LIZ.getSparkContext();
                        if (sparkContext2 != null) {
                            obj = sparkContext2.containerId;
                        }
                        if (Intrinsics.LJFF(obj, interfaceC1541990qEH.getHybridContext().containerId)) {
                            obj = next;
                            break;
                        }
                    }
                    C1062850dlT c1062850dlT = (C1062850dlT) obj;
                    if (c1062850dlT != null) {
                        synchronized (c1062850dlT) {
                            try {
                                if (c1062850dlT.LJFF == EnumC1062840dlS.LL) {
                                    c1062850dlT.LJFF = EnumC1062840dlS.LLILLJJLI;
                                }
                                c1062850dlT.LJI = Long.valueOf(SystemClock.elapsedRealtime());
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str2, String str3) {
                C1062900dlY c1062900dlY2 = c1062900dlY;
                String str4 = interfaceC1541990qEH.getHybridContext().containerId;
                if (str3 == null) {
                    str3 = "onLoadFail without reason";
                }
                c1062900dlY2.LIZIZ(str4, str3);
                this.LLILLJJLI = false;
            }
        });
        c1537900q7g.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
        List listLIZ = C1062900dlY.LIZ(iBEInfo.lynxSchema, c1062900dlY.LIZ);
        synchronized (listLIZ) {
            try {
                listLIZ.add(new C1062850dlT(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, c1057930ddX, function1, function0));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
    }
}
